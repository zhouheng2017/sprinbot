package com.mytest.sprinbot.model;

import java.util.Date;
import lombok.Data;

 /**
  * @Author: zhouheng
  *
  * @Created: with IntelliJ IDEA.
  *
  * @Description:
  *
  * @Date: 2019-08-28
  
  * @Time: 14:59
  * 
  */
    
@Data
public class UserRegist {
    private Integer id;

    private String phone;

    private String pwd;

    private Date registTime;
}