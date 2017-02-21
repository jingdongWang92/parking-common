package com.jcble.parking.common.model.user;

import org.apache.ibatis.type.JdbcType;

import com.jcble.parking.common.model.BaseDto;

import baseproj.common.mybatis.mapper.annotation.FieldMapperAnnotation;
import baseproj.common.mybatis.mapper.annotation.TableMapperAnnotation;
import baseproj.common.mybatis.mapper.annotation.UniqueKeyType;

/**
 * 用户信息实体
 * 
 * @author Jingdong Wang
 * 
 */
@TableMapperAnnotation(tableName = "t_user", uniqueKeyType = UniqueKeyType.Single, uniqueKey = "id")
public class UserDto extends BaseDto {

	private static final long serialVersionUID = 5161633269899565640L;

	/**
	 * 主键id
	 */
	@FieldMapperAnnotation(dbFieldName = "id", jdbcType = JdbcType.INTEGER)
	private Integer id;
	/**
	 * 账号
	 */
	@FieldMapperAnnotation(dbFieldName = "account", jdbcType = JdbcType.VARCHAR)
	private String account;
	/**
	 * 密码
	 */
	@FieldMapperAnnotation(dbFieldName = "password", jdbcType = JdbcType.VARCHAR)
	private String password;
	/**
	 * 昵称
	 */
	@FieldMapperAnnotation(dbFieldName = "nickname", jdbcType = JdbcType.VARCHAR)
	private String nickname;
	/**
	 * 用户头像
	 */
	@FieldMapperAnnotation(dbFieldName = "headUrl", jdbcType = JdbcType.VARCHAR)
	private String headUrl;
	/**
	 * 账号来源 1微信 2微博 3QQ 4手机号
	 */
	@FieldMapperAnnotation(dbFieldName = "source", jdbcType = JdbcType.INTEGER)
	private String source;
	/**
	 * APP类型 1Android 2IOS
	 */
	@FieldMapperAnnotation(dbFieldName = "appType", jdbcType = JdbcType.INTEGER)
	private String appType;
	/**
	 * 个性签名
	 */
	@FieldMapperAnnotation(dbFieldName = "signature", jdbcType = JdbcType.VARCHAR)
	private String signature;
	/**
	 * 最近登录时间
	 */
	@FieldMapperAnnotation(dbFieldName = "recentLoginTime", jdbcType = JdbcType.VARCHAR)
	private String recentLoginTime;
	/**
	 * 注册时间
	 */
	@FieldMapperAnnotation(dbFieldName = "regtime", jdbcType = JdbcType.VARCHAR)
	private String regtime;

	/**
	 * 推送id
	 */
	@FieldMapperAnnotation(dbFieldName = "jpushid", jdbcType = JdbcType.VARCHAR)
	private String jpushid;

	/**
	 * 我的积分
	 */
	@FieldMapperAnnotation(dbFieldName = "integral", jdbcType = JdbcType.INTEGER)
	private Integer integral;

	private String starttime;
	private String endtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getRecentLoginTime() {
		return recentLoginTime;
	}

	public void setRecentLoginTime(String recentLoginTime) {
		this.recentLoginTime = recentLoginTime;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public String getJpushid() {
		return jpushid;
	}

	public void setJpushid(String jpushid) {
		this.jpushid = jpushid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

}
