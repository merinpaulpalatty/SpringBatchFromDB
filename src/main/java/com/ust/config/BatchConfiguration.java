
/*
 *  26-Nov-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */

package com.ust.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust.mapper.UserMapper;
import com.ust.model.User;

/**
 * The Class BatchConfiguration.
 */
@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    /** The Constant query. */
    private static final String user_query = "SELECT * FROM USER";
    /** The Constant query. */

    @Autowired
    private DataSource dataSource;

    /**
     * Job.
     *
     * @param jobBuilderFactory  the job builder factory
     * @param stepBuilderFactory the step builder factory
     * @param reader             the reader
     * @param itemprocessor      the itemprocessor
     * @param itemWriter         the item writer
     * @return the job
     */
    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
            ItemStreamReader<User> reader, ItemProcessor<User, User> itemprocessor, ItemWriter<User> itemWriter) {

        final Step step = stepBuilderFactory.get("ETL-db_Load").<User, User>chunk(2).reader(reader)
                .processor(itemprocessor).writer(itemWriter).build();

        return jobBuilderFactory.get("ETL_Load").incrementer(new RunIdIncrementer()).start(step).build();
    }

    /**
     * Reader.
     *
     * @return the item stream reader
     */
    @Bean
    public ItemStreamReader<User> reader() {
        final JdbcCursorItemReader<User> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(dataSource);
        reader.setSql(BatchConfiguration.user_query);
        reader.setRowMapper(new UserMapper());
        return reader;
    }

}
