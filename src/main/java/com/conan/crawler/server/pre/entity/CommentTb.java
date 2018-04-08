package com.conan.crawler.server.pre.entity;

import java.util.Date;

public class CommentTb {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comment_tb.id
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comment_tb.item_id
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	private String itemId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comment_tb.total
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	private String total;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comment_tb.crt_user
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	private String crtUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comment_tb.crt_time
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	private Date crtTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comment_tb.crt_ip
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	private String crtIp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comment_tb.status
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	private String status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comment_tb.id
	 * @return  the value of comment_tb.id
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comment_tb.id
	 * @param id  the value for comment_tb.id
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comment_tb.item_id
	 * @return  the value of comment_tb.item_id
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comment_tb.item_id
	 * @param itemId  the value for comment_tb.item_id
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId == null ? null : itemId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comment_tb.total
	 * @return  the value of comment_tb.total
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comment_tb.total
	 * @param total  the value for comment_tb.total
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public void setTotal(String total) {
		this.total = total == null ? null : total.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comment_tb.crt_user
	 * @return  the value of comment_tb.crt_user
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public String getCrtUser() {
		return crtUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comment_tb.crt_user
	 * @param crtUser  the value for comment_tb.crt_user
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser == null ? null : crtUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comment_tb.crt_time
	 * @return  the value of comment_tb.crt_time
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public Date getCrtTime() {
		return crtTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comment_tb.crt_time
	 * @param crtTime  the value for comment_tb.crt_time
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comment_tb.crt_ip
	 * @return  the value of comment_tb.crt_ip
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public String getCrtIp() {
		return crtIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comment_tb.crt_ip
	 * @param crtIp  the value for comment_tb.crt_ip
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public void setCrtIp(String crtIp) {
		this.crtIp = crtIp == null ? null : crtIp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comment_tb.status
	 * @return  the value of comment_tb.status
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comment_tb.status
	 * @param status  the value for comment_tb.status
	 * @mbg.generated  Sun Apr 08 17:12:00 CST 2018
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}
}