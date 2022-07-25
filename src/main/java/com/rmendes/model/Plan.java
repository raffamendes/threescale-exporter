package com.rmendes.model;

public class Plan {

    private int id;
	private String name;
	private String type;
	private String state;
	private boolean approval_required;
	private double setup_fee;
	private double cost_per_month;
	private Object trial_period_days;
	private int cancellation_period;
	private int service_id;
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
     * @return the approval_required
     */
    public boolean isApproval_required() {
        return approval_required;
    }
    /**
     * @param approval_required the approval_required to set
     */
    public void setApproval_required(boolean approval_required) {
        this.approval_required = approval_required;
    }
    /**
     * @return the setup_fee
     */
    public double getSetup_fee() {
        return setup_fee;
    }
    /**
     * @param setup_fee the setup_fee to set
     */
    public void setSetup_fee(double setup_fee) {
        this.setup_fee = setup_fee;
    }
    /**
     * @return the cost_per_month
     */
    public double getCost_per_month() {
        return cost_per_month;
    }
    /**
     * @param cost_per_month the cost_per_month to set
     */
    public void setCost_per_month(double cost_per_month) {
        this.cost_per_month = cost_per_month;
    }
    /**
     * @return the trial_period_days
     */
    public Object getTrial_period_days() {
        return trial_period_days;
    }
    /**
     * @param trial_period_days the trial_period_days to set
     */
    public void setTrial_period_days(Object trial_period_days) {
        this.trial_period_days = trial_period_days;
    }
    /**
     * @return the cancellation_period
     */
    public int getCancellation_period() {
        return cancellation_period;
    }
    /**
     * @param cancellation_period the cancellation_period to set
     */
    public void setCancellation_period(int cancellation_period) {
        this.cancellation_period = cancellation_period;
    }
    /**
     * @return the service_id
     */
    public int getService_id() {
        return service_id;
    }
    /**
     * @param service_id the service_id to set
     */
    public void setService_id(int service_id) {
        this.service_id = service_id;
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
