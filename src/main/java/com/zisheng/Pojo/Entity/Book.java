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
@ApiModel(value = "课本实体")
public class Book {
    @ApiModelProperty(value = "主键id")
    private Long id;
    @ApiModelProperty(value = "课本名称")
    private String name;
    @ApiModelProperty(value = "课本价格")
    private double price;
    @ApiModelProperty(value = "课本内容")
    private String contents;
}
