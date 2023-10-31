/**
 * @projectName reading
 * @package com.answer.reading.common.result
 * @className com.answer.reading.common.result.Result
 */
package com.answer.reading.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * Result
 * @description 返回结果
 * @author answer_wx
 * @date 2023/11/1 22:46
 * @version 1.0
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 构建消息内容
     */
    public Result<T> buildMessage(String msg) {
        this.setMsg(msg);
        return this;
    }

    /**
     * 构建消息data的值，key默认为data
     */
    public Result<T> buildData(T data) {
        this.setData(data);
        return this;
    }


}