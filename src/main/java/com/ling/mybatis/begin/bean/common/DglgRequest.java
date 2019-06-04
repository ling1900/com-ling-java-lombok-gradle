package com.ling.mybatis.begin.bean.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(description = "请求参数（无额外参数）")
@Data
@EqualsAndHashCode(callSuper = true)
public class DglgRequest extends DglgRequestBase {
}
