package com.zisheng.Pojo.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 课程实体
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ApiModel(value = "课程实体")
public class Course {
    @ApiModelProperty(value = "主键id")
    private Long id;
    @ApiModelProperty(value = "课程号")
    private String cno;
    @ApiModelProperty(value = "课程名称")
    private String name;
    @ApiModelProperty(value = "课程类型")
    private String type;
    @ApiModelProperty(value = "课程内容")
    private String contents;
    @ApiModelProperty(value = "学分")
    private Integer point;
}
