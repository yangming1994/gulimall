package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author yangming
 * @email yangming@hnu.edu.cn
 * @date 2021-04-01 21:30:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
