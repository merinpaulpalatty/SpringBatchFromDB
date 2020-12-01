
/*
 *  26-Nov-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */

package com.ust.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.model.User;

/**
 * The Interface UserRepository.
 */

public interface UserRepository extends JpaRepository<User, Integer> {

}
