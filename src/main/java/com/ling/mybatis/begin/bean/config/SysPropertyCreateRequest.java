package com.ling.mybatis.begin.bean.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ling.mybatis.begin.bean.common.CreateRequestBase;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Delegate;

@ApiModel(description = "创建系统配置。see also SysPropertyCommon")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysPropertyCreateRequest extends CreateRequestBase {
    // =========================
    @Delegate
    @JsonIgnore
    // linglg：只能织入方法，不能织入字段。
    // linglg：问题：不会带入注解。
    private SysPropertyCommon sysPropertyCommon = new SysPropertyCommon();

    // =======================
    public SysProperty toSysProperty() {
        SysProperty sysProperty = new SysProperty();
        sysProperty.setSysGroup(getSysGroup());
        sysProperty.setSysKey(getSysKey());
        sysProperty.setSysValue(getSysValue());
        sysProperty.setRemark(getRemark());
        sysProperty.setEnable(getEnable());
        sysProperty.setCreateBy(getCreateBy());
        return sysProperty;
    }
}
