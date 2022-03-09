package com.zp.pojo;

import java.math.BigDecimal;
import lombok.Data;

/**
* @author zhengpeng
* @date 2022-03-08 15:52 
**/    
@Data
public class Order {

    private Long id;

    private String serial;

    private BigDecimal amount;
}