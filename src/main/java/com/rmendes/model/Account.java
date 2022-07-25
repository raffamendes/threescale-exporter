package com.rmendes.model;
import java.util.List;

public class Account extends ThreeScaleEntityBase{
    
    private int id;
	private String state;
	private String orgName;
	private Object extraFields;
	private boolean MonthlyBillingEnabled;
	private boolean monthlyChargingEnabled;
	private boolean creditCardStored;
	private List<Plan> plans;
	private List<User> users;

    public Account(){}

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
     * @return the orgName
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName the orgName to set
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    /**
     * @return the monthlyBillingEnabled
     */
    public boolean isMonthlyBillingEnabled() {
        return MonthlyBillingEnabled;
    }

    /**
     * @param monthlyBillingEnabled the monthlyBillingEnabled to set
     */
    public void setMonthlyBillingEnabled(boolean monthlyBillingEnabled) {
        MonthlyBillingEnabled = monthlyBillingEnabled;
    }

    /**
     * @return the monthlyChargingEnabled
     */
    public boolean isMonthlyChargingEnabled() {
        return monthlyChargingEnabled;
    }

    /**
     * @param monthlyChargingEnabled the monthlyChargingEnabled to set
     */
    public void setMonthlyChargingEnabled(boolean monthlyChargingEnabled) {
        this.monthlyChargingEnabled = monthlyChargingEnabled;
    }

    /**
     * @return the creditCardStored
     */
    public boolean isCreditCardStored() {
        return creditCardStored;
    }

    /**
     * @param creditCardStored the creditCardStored to set
     */
    public void setCreditCardStored(boolean creditCardStored) {
        this.creditCardStored = creditCardStored;
    }

    /**
     * @return the plans
     */
    public List<Plan> getPlans() {
        return plans;
    }

    /**
     * @param plans the plans to set
     */
    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    /**
     * @return the users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    



}
