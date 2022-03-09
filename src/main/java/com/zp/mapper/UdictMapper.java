package com.zp.mapper;


import com.zp.pojo.Udict;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author zhengpeng
* @date 2022-03-09 15:35 
**/
@Mapper
@Repository
public interface UdictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Udict record);

    int insertSelective(Udict record);

    Udict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Udict record);

    int updateByPrimaryKey(Udict record);
}