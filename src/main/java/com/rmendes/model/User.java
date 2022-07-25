package com.rmendes.model;

public class User extends ThreeScaleEntityBase{

    private int id;
	private int AccountId;
	private String state;
	private String role;
	private String username;
	private String email;
	private Object extraFields;


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
     * @return the accountId
     */
    public int getAccountId() {
        return AccountId;
    }


    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(int accountId) {
        AccountId = accountId;
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
     * @return the extraFields
     */
    public Object getExtraFields() {
        return extraFields;
    }


    /**
     * @param extraFields the extraFields to set
     */
    public void setExtraFields(Object extraFields) {
        this.extraFields = extraFields;
    }



    
}
