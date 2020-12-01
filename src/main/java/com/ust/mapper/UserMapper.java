
/*
 *  26-Nov-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */

package com.ust.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ust.model.User;

/**
 * The Class UserMapper.
 */
public class UserMapper implements RowMapper<User> {

    /**
     * Map row.
     *
     * @param rs     the rs
     * @param rowNum the row num
     * @return the user
     * @throws SQLException the SQL exception
     */
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        final User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setDescription(rs.getString("description"));
        return user;
    }

}
