package com.ling.mybatis.begin.bean.common;

import com.ling.mybatis.begin.dglgutil.DglgConst;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel(description = "实体类基类")
@Data
public abstract class EntityBase {
//    // ========================
    @ApiModelProperty(value = "创建时间", example = DglgConst.ExampleValue_DateTime)
    @DateTimeFormat(pattern = DglgConst.DateFormat_Full)
    private Date createTime;
    @ApiModelProperty(value = "创建人")
    private String createBy;
    @ApiModelProperty(value = "最后一次修改时间", example = DglgConst.ExampleValue_DateTime)
    @DateTimeFormat(pattern = DglgConst.DateFormat_Full)
    private Date lastUpdateTime;
    @ApiModelProperty(value = "最后修改人")
    private String lastUpdateBy;
}
