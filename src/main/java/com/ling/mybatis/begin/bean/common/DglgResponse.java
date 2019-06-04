package com.ling.mybatis.begin.bean.common;

import com.ling.mybatis.begin.dglgutil.ResCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(description = "返回值")
@Data
@EqualsAndHashCode(callSuper = true)
public class DglgResponse extends DglgResponseBase {
    @ApiModelProperty(value = "条目数")
    private long total;

    // ======================
    private static DglgResponse resCode(int resCode, long total) {
        DglgResponse response = new DglgResponse();
        response.setResCode(resCode);
        response.total = total;
        return response;
    }

    public static DglgResponse fail(int resCode) {
        return DglgResponse.resCode(resCode, 0);
    }

    public static DglgResponse success() {
        return DglgResponse.resCode(ResCode.Success, 0);
    }

    public static DglgResponse success(long total) {
        return DglgResponse.resCode(ResCode.Success, total);
    }

    // ===================
    public static DglgResponse dupx(DglgResponseBase responseBase) {
        DglgResponse result = new DglgResponse();
        result.init(responseBase);
        return result;
    }
}
