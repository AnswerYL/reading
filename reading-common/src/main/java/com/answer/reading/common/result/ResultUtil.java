/**
 * @projectName reading
 * @package com.answer.reading.common.result
 * @className com.answer.reading.common.result.ResultUtil
 */
package com.answer.reading.common.result;

import com.answer.reading.common.enums.HttpCodeEnum;

import java.util.HashMap;

/**
 * ResultUtil
 * @description 返回结果工具类
 * @author answer_wx
 * @date 2023/11/1 22:52
 * @version 1.0
 */
public class ResultUtil {

    /**
     * 请求成功
     */
    public static Result<String> success() {
        return new Result<>(HttpCodeEnum.OK.getCode(), HttpCodeEnum.OK.getMessage());
    }

    /**
     * 请求成功（无消息）
     */
    public static Result<String> successAndNoMsg() {
        return new Result<>(HttpCodeEnum.OK.getCode(), "");
    }

    /**
     * 成功请求
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(HttpCodeEnum.OK.getCode(), HttpCodeEnum.OK.getMessage(), data);
    }

    /**
     * 成功请求（无消息）
     */
    public static <T> Result<T> successAndNoMsg(T data) {
        return new Result<>(HttpCodeEnum.OK.getCode(), "", data);
    }

    /**
     * 操作失败
     */
    public static <T> Result<T> fail() {
        return new Result<>(HttpCodeEnum.FAIL.getCode(), HttpCodeEnum.FAIL.getMessage());
    }

    /**
     * 操作失败
     */
    public static <T> Result<T> fail(T data) {
        return new Result<>(HttpCodeEnum.FAIL.getCode(), HttpCodeEnum.FAIL.getMessage(), data);
    }

    /**
     * 服务器错误
     */
    public static <T> Result<T> error() {
        return new Result<>(HttpCodeEnum.INTERNAL_SERVER_ERROR.getCode(), HttpCodeEnum.INTERNAL_SERVER_ERROR.getMessage());
    }

    /**
     * 服务器错误
     */
    public static <T> Result<T> error(T data) {
        return new Result<T>(HttpCodeEnum.INTERNAL_SERVER_ERROR.getCode(), HttpCodeEnum.INTERNAL_SERVER_ERROR.getMessage(), data);
    }

    /**
     * 参数错误
     */
    public static <T> Result<T> paramError() {
        return new Result<>(HttpCodeEnum.INVALID_REQUEST.getCode(), HttpCodeEnum.INVALID_REQUEST.getMessage());
    }

    /**
     * 参数错误
     * @param data
     * @return
     */
    public static <T> Result<T> paramError(T data) {
        return new Result<>(HttpCodeEnum.INVALID_REQUEST.getCode(), HttpCodeEnum.INVALID_REQUEST.getMessage(), data);
    }

    /**
     * 认证到期
     * @return
     */
    public static <T> Result<T> authExpired() {
        return new Result<>(HttpCodeEnum.AUTH_EXPIRED.getCode(), HttpCodeEnum.AUTH_EXPIRED.getMessage());
    }

    /**
     * 没有权限
     * @return
     */
    public static <T> Result<T> unAuthorized() {
        return new Result<>(HttpCodeEnum.UNAUTHORIZED.getCode(), HttpCodeEnum.UNAUTHORIZED.getMessage());
    }

    /**
     * 没有权限
     * @param data
     * @return
     */
    public static <T> Result<T> unAuthorized(T data) {
        return new Result<>(HttpCodeEnum.UNAUTHORIZED.getCode(), HttpCodeEnum.UNAUTHORIZED.getMessage(), data);
    }


    /**
     *  禁止访问
     * @return
     */
    public static <T> Result<T> forbidden() {
        return new Result<>(HttpCodeEnum.FORBIDDEN.getCode(), HttpCodeEnum.FORBIDDEN.getMessage());
    }

    /**
     * 禁止访问
     * @param data
     * @return
     */
    public static <T> Result<T> forbidden(T data) {
        return new Result<>(HttpCodeEnum.FORBIDDEN.getCode(), HttpCodeEnum.FORBIDDEN.getMessage(), data);
    }


    /**
     * 资源不存在
     * @return
     */
    public static <T> Result<T> notFound() {
        return new Result<>(HttpCodeEnum.NOT_FOUND.getCode(), HttpCodeEnum.NOT_FOUND.getMessage());
    }


    /**
     * 资源不存在
     * @param data
     * @return
     */
    public static <T> Result<T> notFound(T data) {
        return new Result<>(HttpCodeEnum.NOT_FOUND.getCode(), HttpCodeEnum.NOT_FOUND.getMessage(), data);
    }


    /**
     * 请求的格式不正确
     * @return
     */
    public static <T> Result<T> notAcceptable() {
        return new Result<>(HttpCodeEnum.NOT_ACCEPTABLE.getCode(), HttpCodeEnum.NOT_ACCEPTABLE.getMessage());
    }


    /**
     * 请求的格式不正确
     * @param data
     * @return
     */
    public static <T> Result<T> notAcceptable(T data) {
        return new Result<>(HttpCodeEnum.NOT_ACCEPTABLE.getCode(), HttpCodeEnum.NOT_ACCEPTABLE.getMessage(), data);
    }


    /**
     * 数据已经被删除
     * @return
     */
    public static <T> Result<T> gone() {
        return new Result<>(HttpCodeEnum.GONE.getCode(), HttpCodeEnum.GONE.getMessage());
    }


    /**
     * 数据已经被删除
     * @param data
     * @return
     */
    public static <T> Result<T> gone(T data) {
        return new Result<>(HttpCodeEnum.GONE.getCode(), HttpCodeEnum.GONE.getMessage(), data);
    }

    /**
     * 实体参数校验错误
     * @return
     */
    public static <T> Result<T> unprocesableEntity() {
        return new Result<>(HttpCodeEnum.UNPROCESABLE_ENTITY.getCode(), HttpCodeEnum.UNPROCESABLE_ENTITY.getMessage());
    }

    /**
     * 实体参数校验错误
     * @param data
     * @return
     */
    public static <T> Result<T> unprocesableEntity(T data) {
        return new Result<>(HttpCodeEnum.UNPROCESABLE_ENTITY.getCode(), HttpCodeEnum.UNPROCESABLE_ENTITY.getMessage(), data);
    }

    /**
     * 未知错误
     * @return
     */
    public static <T> Result<T> unKnowError() {
        return new Result<>(HttpCodeEnum.UN_KNOW_ERROR.getCode(), HttpCodeEnum.UN_KNOW_ERROR.getMessage());
    }

    /**
     * 未知错误
     * @param data
     * @return
     */
    public static <T> Result<T> unKnowError(T data) {
        return new Result<>(HttpCodeEnum.UN_KNOW_ERROR.getCode(), HttpCodeEnum.UN_KNOW_ERROR.getMessage(), data);
    }

    /**
     * 业务逻辑验证未通过
     * @return
     */
    public static Result verificationFailed() {
        return new Result(HttpCodeEnum.VERIFICATION_FAILED.getCode(), HttpCodeEnum.VERIFICATION_FAILED.getMessage());
    }

    /**
     * 业务逻辑验证未通过
     * @param data
     * @return
     */
    public static <T> Result<T> verificationFailed(T data) {
        return new Result<>(HttpCodeEnum.VERIFICATION_FAILED.getCode(), HttpCodeEnum.VERIFICATION_FAILED.getMessage(), data);
    }

    /**
     * 自定义返回
     * @param e
     * @return
     */
    public static <T> Result<T> custom(HttpCodeEnum e) {
        return new Result<>(e.getCode(), e.getMessage());
    }

    /**
     * 自定义返回
     * @param error
     * @return
     */
    public static <T> Result<T> custom(int code, String error) {
        return new Result<>(code, error);
    }

    /**
     * 自定义返回
     * @param error
     * @param data
     * @return
     */
    public static <T> Result<T> custom(int code, String error, T data) {
        return new Result<>(code, error, data);
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "aaaa");
        System.out.println(success(map));
    }
}