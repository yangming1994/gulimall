package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * skuͼƬ
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-01 21:09:41
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ͼƬ
	 */
	private String imgUrl;
	/**
	 * 
	 */
	private Integer imgSort;
	/**
	 * Ĭ
	 */
	private Integer defaultImg;

}
