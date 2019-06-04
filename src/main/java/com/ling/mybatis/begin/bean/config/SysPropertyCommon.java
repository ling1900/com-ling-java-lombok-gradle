package com.ling.mybatis.begin.bean.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "系统配置：公用的字段")
@Data
public class SysPropertyCommon {
    @ApiModelProperty(value = "配置组")
    private String sysGroup;

    @ApiModelProperty(value = "配置项名")
    private String sysKey;

    @ApiModelProperty(value = "配置值")
    private String sysValue;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "是否有效")
    private Integer enable;
}
