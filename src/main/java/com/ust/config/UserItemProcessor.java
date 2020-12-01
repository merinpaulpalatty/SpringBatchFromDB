
/*
 *  26-Nov-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */

package com.ust.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.ust.model.User;

/**
 * The Class UserItemProcessor.
 */
@Component
public class UserItemProcessor implements ItemProcessor<User, User> {

    /**
     * Process.
     *
     * @param user the user
     * @return the user
     * @throws Exception the exception
     */
    @Override
    public User process(User user) throws Exception {
        System.out.println("While processing.....");
        System.out.println(user);

        user.setName(user.getName().toUpperCase());
        return user;
    }

}
