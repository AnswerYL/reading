/**
 * @projectName reading
 * @package com.answer.reading.common.request
 * @className com.answer.reading.common.request.RequestParams
 */
package com.answer.reading.common.request;

import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * RequestParams
 * @description 请求参数封装
 * @author answer_wx
 * @date 2023/11/1 22:37
 * @version 1.0
 */

public class RequestParams extends HashMap {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestParams.class);

    /**
     * 获取整数类型参数
     * @param paramName
     * @return
     */
    public Integer getIntValue(String paramName) {
        int value = 0;
        Object o = this.get(paramName);
        if (null == o) {
            return value;
        }
        try {
            value = Integer.parseInt(this.get(paramName).toString());
        } catch (Exception e) {
            LOGGER.error("获取参数{}转换整型异常！{}", paramName, e);
        }
        return value;
    }

    /**
     * 获取字符串参数值
     * @param paramName
     * @return
     */
    public String getStringValue(String paramName) {
        Object object = this.get(paramName);
        if (null == object) {
            return "";
        }
        return object.toString();
    }
}