package com.zisheng.Pojo.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生表
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ApiModel(value = "学生实体")
public class Student {
    @ApiModelProperty(value = "主键id")
    private Long id;
    @ApiModelProperty(value = "学号")
    private String sno;
    @ApiModelProperty(value = "登录名称,默认是学号，不可更改")
    private String loginName;
    @ApiModelProperty(value = "登录密码，默认是学号，可更改")
    private String loginPwd;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "年龄")
    private Integer age;
    @ApiModelProperty(value = "电话")
    private String tel;
    @ApiModelProperty(value = "地址")
    private String address;
}

