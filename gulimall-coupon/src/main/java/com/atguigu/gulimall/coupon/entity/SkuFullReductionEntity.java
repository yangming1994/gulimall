package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
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
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * 
	 */
	private BigDecimal fullPrice;
	/**
	 * 
	 */
	private BigDecimal reducePrice;
	/**
	 * 
	 */
	private Integer addOther;

}
