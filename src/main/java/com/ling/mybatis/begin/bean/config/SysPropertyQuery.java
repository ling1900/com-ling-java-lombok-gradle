package com.ling.mybatis.begin.bean.config;

import com.ling.mybatis.begin.bean.common.QueryBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@ApiModel(description = "查询系统配置")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysPropertyQuery extends QueryBase {
    @ApiModelProperty
    private List<Long> seqIds;
    @ApiModelProperty(value = "配置组")
    private List<String> sysGroups;
    @ApiModelProperty(value = "配置项名")
    private List<String> sysKeys;

    // =======================
    @Override
    protected String toColumnName(String fieldName) {
        switch (fieldName) {
            case "seqId":
                return "seq_id";
            case "sysGroup":
                return "sys_group";
            case "sysKey":
                return "sys_key";
            case "sysValue":
                return "sys_value";
            case "remark":
                return "remark";
            case "enable":
                return "enable";
            default:
                return super.toColumnName(fieldName);
        }
    }
}
