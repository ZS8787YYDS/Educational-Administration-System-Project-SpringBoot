package com.zisheng.Pojo.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "管理员实体")
public class Admin {
    @ApiModelProperty(value = "主键id")
    private Long id;
    @ApiModelProperty(value = "登录名称")
    private String loginName;
    @ApiModelProperty(value = "登陆密码")
    private String loginPwd;
    @ApiModelProperty(value = "姓名")
    private String name;
}
