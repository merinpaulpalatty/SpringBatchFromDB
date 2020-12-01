
/*
 *  26-Nov-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */

package com.ust.vo;

/**
 * The Class UserVO.
 */
public class UserVO {

    /** The id. */
    private int id;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

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

}
