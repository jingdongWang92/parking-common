package com.jcble.parking.common.model.admin;

import org.apache.ibatis.type.JdbcType;

import com.jcble.parking.common.model.BaseDto;

import baseproj.common.mybatis.mapper.annotation.FieldMapperAnnotation;
import baseproj.common.mybatis.mapper.annotation.TableMapperAnnotation;
import baseproj.common.mybatis.mapper.annotation.UniqueKeyType;

@TableMapperAnnotation(tableName = "t_parking_lot", uniqueKeyType = UniqueKeyType.Single, uniqueKey = "id")
public class ParkingLotDto extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7006435513040598136L;
	// 主键ID
	@FieldMapperAnnotation(dbFieldName = "id", jdbcType = JdbcType.INTEGER)
	private Integer id;
	// 创建者
	@FieldMapperAnnotation(dbFieldName = "creator", jdbcType = JdbcType.INTEGER)
	private Integer creator;
	// 创建时间
	@FieldMapperAnnotation(dbFieldName = "createdate", jdbcType = JdbcType.VARCHAR)
	private String createdate;
	// 修改者
	@FieldMapperAnnotation(dbFieldName = "modifier", jdbcType = JdbcType.INTEGER)
	private Integer modifier;
	// 修改时间
	@FieldMapperAnnotation(dbFieldName = "modifyDate", jdbcType = JdbcType.VARCHAR)
	private String modifyDate;
	// 停车场名称
	@FieldMapperAnnotation(dbFieldName = "parkingLotName", jdbcType = JdbcType.VARCHAR)
	private String parkingLotName;
	// 位置
	@FieldMapperAnnotation(dbFieldName = "district", jdbcType = JdbcType.VARCHAR)
	private String location;
	// X坐标
	@FieldMapperAnnotation(dbFieldName = "coordinateX", jdbcType = JdbcType.DOUBLE)
	private Double coordinateX;
	// Y坐标
	@FieldMapperAnnotation(dbFieldName = "coordinateY", jdbcType = JdbcType.DOUBLE)
	private Double coordinateY;
	// 车位总量
	@FieldMapperAnnotation(dbFieldName = "totalCount", jdbcType = JdbcType.INTEGER)
	private Integer totalCount;
	// 使用中车位数量
	@FieldMapperAnnotation(dbFieldName = "inUseCount", jdbcType = JdbcType.INTEGER)
	private Integer inUseCount;
	// 空闲数量
	@FieldMapperAnnotation(dbFieldName = "freeCount", jdbcType = JdbcType.INTEGER)
	private Integer freeCount;
	// 免费时长
	@FieldMapperAnnotation(dbFieldName = "freeTime", jdbcType = JdbcType.INTEGER)
	private Integer freeTime;
	// 离场超时时长
	@FieldMapperAnnotation(dbFieldName = "leaveOutTime", jdbcType = JdbcType.INTEGER)
	private Integer leaveOutTime;
	// 是否可预约
	@FieldMapperAnnotation(dbFieldName = "isRevatation", jdbcType = JdbcType.VARCHAR)
	private String isRevatation;
	// 免费预约时长(分钟)
	@FieldMapperAnnotation(dbFieldName = "revatationTime", jdbcType = JdbcType.INTEGER)
	private Integer revatationTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public Integer getModifier() {
		return modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getParkingLotName() {
		return parkingLotName;
	}

	public void setParkingLotName(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(Double coordinateX) {
		this.coordinateX = coordinateX;
	}

	public Double getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(Double coordinateY) {
		this.coordinateY = coordinateY;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getInUseCount() {
		return inUseCount;
	}

	public void setInUseCount(Integer inUseCount) {
		this.inUseCount = inUseCount;
	}

	public Integer getFreeCount() {
		return freeCount;
	}

	public void setFreeCount(Integer freeCount) {
		this.freeCount = freeCount;
	}

	public Integer getFreeTime() {
		return freeTime;
	}

	public void setFreeTime(Integer freeTime) {
		this.freeTime = freeTime;
	}

	public Integer getLeaveOutTime() {
		return leaveOutTime;
	}

	public void setLeaveOutTime(Integer leaveOutTime) {
		this.leaveOutTime = leaveOutTime;
	}

	public String getIsRevatation() {
		return isRevatation;
	}

	public void setIsRevatation(String isRevatation) {
		this.isRevatation = isRevatation;
	}

	public Integer getRevatationTime() {
		return revatationTime;
	}

	public void setRevatationTime(Integer revatationTime) {
		this.revatationTime = revatationTime;
	}

}
