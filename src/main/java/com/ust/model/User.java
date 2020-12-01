
/*
 *  26-Nov-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */

package com.ust.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class User.
 */
@Entity
public class User {

    /** The id. */
    @Id
    private int id;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

    /**
     * Instantiates a new user.
     */
    public User() {
        super();

    }

    /**
     * Instantiates a new user.
     *
     * @param id          the id
     * @param name        the name
     * @param description the description
     */
    public User(int id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", description=" + description + "]";
    }

}
