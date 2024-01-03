package com.zisheng.Pojo.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 成绩表
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ApiModel(value = "成绩实体")
public class Grade {
    @ApiModelProperty(value = "主键id")
    private Long id;
    @ApiModelProperty(value = "学生id")
    private Long sid;
    @ApiModelProperty(value = "课程id")
    private Long cid;
    @ApiModelProperty(value = "学期，1-上学期，2-下学期")
    private Long state;
    @ApiModelProperty(value = "分数")
    private Double mark;
}
