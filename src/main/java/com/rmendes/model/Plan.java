package com.rmendes.model;

public class Plan {

    private int id;
	private String name;
	private String type;
	private String state;
	private boolean approvalRequired;
	private double setupFee;
	private double costPerMonth;
	private Object trialPeriodDays;
	private int cancellationPeriod;
	private int serviceId;
	private boolean _default;
	private String text;
	private boolean custom;


    public Plan(){}


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
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return the type
     */
    public String getType() {
        return type;
    }


    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
     * @return the approvalRequired
     */
    public boolean isApprovalRequired() {
        return approvalRequired;
    }


    /**
     * @param approvalRequired the approvalRequired to set
     */
    public void setApprovalRequired(boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
    }


    /**
     * @return the setupFee
     */
    public double getSetupFee() {
        return setupFee;
    }


    /**
     * @param setupFee the setupFee to set
     */
    public void setSetupFee(double setupFee) {
        this.setupFee = setupFee;
    }


    /**
     * @return the costPerMonth
     */
    public double getCostPerMonth() {
        return costPerMonth;
    }


    /**
     * @param costPerMonth the costPerMonth to set
     */
    public void setCostPerMonth(double costPerMonth) {
        this.costPerMonth = costPerMonth;
    }


    /**
     * @return the trialPeriodDays
     */
    public Object getTrialPeriodDays() {
        return trialPeriodDays;
    }


    /**
     * @param trialPeriodDays the trialPeriodDays to set
     */
    public void setTrialPeriodDays(Object trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
    }


    /**
     * @return the cancellationPeriod
     */
    public int getCancellationPeriod() {
        return cancellationPeriod;
    }


    /**
     * @param cancellationPeriod the cancellationPeriod to set
     */
    public void setCancellationPeriod(int cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }


    /**
     * @return the serviceId
     */
    public int getServiceId() {
        return serviceId;
    }


    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * @return the _default
     */
    public boolean is_default() {
        return _default;
    }


    /**
     * @param _default the _default to set
     */
    public void set_default(boolean _default) {
        this._default = _default;
    }


    /**
     * @return the text
     */
    public String getText() {
        return text;
    }


    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }


    /**
     * @return the custom
     */
    public boolean isCustom() {
        return custom;
    }


    /**
     * @param custom the custom to set
     */
    public void setCustom(boolean custom) {
        this.custom = custom;
    }

    
    
}
