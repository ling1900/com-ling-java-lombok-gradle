package com.ling.mybatis.begin.bean.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ling.mybatis.begin.bean.common.UpdateRequestBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Delegate;

@ApiModel(description = "更新系统配置。see also SysPropertyCommon")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysPropertyUpdateRequest extends UpdateRequestBase {
    @ApiModelProperty(value = "seqId")
    private Long seqId;

    // =========================
    @Delegate
    @JsonIgnore
    // linglg：只能织入方法，不能织入字段。
    // linglg：问题：不会带入注解。
    private SysPropertyCommon sysPropertyCommon = new SysPropertyCommon();
}
