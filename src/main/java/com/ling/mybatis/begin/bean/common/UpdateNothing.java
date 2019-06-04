package com.ling.mybatis.begin.bean.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(description = "用于不可更新的实体类")
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateNothing extends UpdateRequestBase {
}
