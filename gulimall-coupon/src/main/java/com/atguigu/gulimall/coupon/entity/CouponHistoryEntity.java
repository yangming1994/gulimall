package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author yangming
 * @email yangming@hnu.edu.cn
 * @date 2021-04-01 21:24:26
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long couponId;
	/**
	 * 
	 */
	private Long memberId;
	/**
	 * 
	 */
	private String memberNickName;
	/**
	 * 
	 */
	private Integer getType;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * ʹ
	 */
	private Integer useType;
	/**
	 * ʹ
	 */
	private Date useTime;
	/**
	 * 
	 */
	private Long orderId;
	/**
	 * 
	 */
	private Long orderSn;

}
