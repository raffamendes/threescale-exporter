package com.rmendes.model;

import java.util.Date;

public class User {

    private int id;
	private Date created_at;
	private Date updated_at;
	private int account_id;
	private String state;
	private String role;
	private String username;
	private String email;
	private Object extra_fields;


    public User(){}


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }


    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }


    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }


    /**
     * @return the updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }


    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }


    /**
     * @return the account_id
     */
    public int getAccount_id() {
        return account_id;
    }


    /**
     * @param account_id the account_id to set
     */
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }


    /**
     * @return the state
     */
    public String getState() {
        return state;
    }


    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }


    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }


    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }


    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * @return the extra_fields
     */
    public Object getExtra_fields() {
        return extra_fields;
    }


    /**
     * @param extra_fields the extra_fields to set
     */
    public void setExtra_fields(Object extra_fields) {
        this.extra_fields = extra_fields;
    }

    
    
}
