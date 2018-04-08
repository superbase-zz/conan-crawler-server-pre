package com.conan.crawler.server.pre.entity;

import java.util.Date;

public class CommentScanTb {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.id
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.goods_id
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.buyer_nick
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String buyerNick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.first_review_time
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String firstReviewTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.review_content
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String reviewContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.is_super_vip
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String isSuperVip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.buyer_star
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String buyerStar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.crt_time
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private Date crtTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.crt_user
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String crtUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.crt_ip
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String crtIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_scan_tb.status
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.id
     *
     * @return the value of comment_scan_tb.id
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.id
     *
     * @param id the value for comment_scan_tb.id
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.goods_id
     *
     * @return the value of comment_scan_tb.goods_id
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.goods_id
     *
     * @param goodsId the value for comment_scan_tb.goods_id
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.buyer_nick
     *
     * @return the value of comment_scan_tb.buyer_nick
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.buyer_nick
     *
     * @param buyerNick the value for comment_scan_tb.buyer_nick
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.first_review_time
     *
     * @return the value of comment_scan_tb.first_review_time
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getFirstReviewTime() {
        return firstReviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.first_review_time
     *
     * @param firstReviewTime the value for comment_scan_tb.first_review_time
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setFirstReviewTime(String firstReviewTime) {
        this.firstReviewTime = firstReviewTime == null ? null : firstReviewTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.review_content
     *
     * @return the value of comment_scan_tb.review_content
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getReviewContent() {
        return reviewContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.review_content
     *
     * @param reviewContent the value for comment_scan_tb.review_content
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent == null ? null : reviewContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.is_super_vip
     *
     * @return the value of comment_scan_tb.is_super_vip
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getIsSuperVip() {
        return isSuperVip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.is_super_vip
     *
     * @param isSuperVip the value for comment_scan_tb.is_super_vip
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setIsSuperVip(String isSuperVip) {
        this.isSuperVip = isSuperVip == null ? null : isSuperVip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.buyer_star
     *
     * @return the value of comment_scan_tb.buyer_star
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getBuyerStar() {
        return buyerStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.buyer_star
     *
     * @param buyerStar the value for comment_scan_tb.buyer_star
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setBuyerStar(String buyerStar) {
        this.buyerStar = buyerStar == null ? null : buyerStar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.crt_time
     *
     * @return the value of comment_scan_tb.crt_time
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.crt_time
     *
     * @param crtTime the value for comment_scan_tb.crt_time
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.crt_user
     *
     * @return the value of comment_scan_tb.crt_user
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getCrtUser() {
        return crtUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.crt_user
     *
     * @param crtUser the value for comment_scan_tb.crt_user
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.crt_ip
     *
     * @return the value of comment_scan_tb.crt_ip
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getCrtIp() {
        return crtIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.crt_ip
     *
     * @param crtIp the value for comment_scan_tb.crt_ip
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setCrtIp(String crtIp) {
        this.crtIp = crtIp == null ? null : crtIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_scan_tb.status
     *
     * @return the value of comment_scan_tb.status
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_scan_tb.status
     *
     * @param status the value for comment_scan_tb.status
     *
     * @mbg.generated Sun Apr 08 13:26:48 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}