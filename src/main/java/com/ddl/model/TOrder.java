package com.ddl.model;

public class TOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_id
     *
     * @mbggenerated Tue Jul 19 18:03:20 CST 2016
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.user_id
     *
     * @mbggenerated Tue Jul 19 18:03:20 CST 2016
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_id
     *
     * @return the value of t_order.order_id
     *
     * @mbggenerated Tue Jul 19 18:03:20 CST 2016
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_id
     *
     * @param orderId the value for t_order.order_id
     *
     * @mbggenerated Tue Jul 19 18:03:20 CST 2016
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.user_id
     *
     * @return the value of t_order.user_id
     *
     * @mbggenerated Tue Jul 19 18:03:20 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.user_id
     *
     * @param userId the value for t_order.user_id
     *
     * @mbggenerated Tue Jul 19 18:03:20 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}