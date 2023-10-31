/**
 * @projectName reading
 * @package com.answer.reading.common.enums
 * @className com.answer.reading.common.enums.BookSerialStatusEnum
 */
package com.answer.reading.common.enums;

/**
 * BookSerialStatusEnum
 * @description 图书连载状态枚举
 * @author answer_wx
 * @date 2023/11/1 22:31
 * @version 1.0
 */
public enum BookSerialStatusEnum {

    SERIAL(1, "连载"),

    SUSPEND(2, "暂更"),

    END(3, "完结");

    private int value;
    private String name;

    BookSerialStatusEnum(int aValue, String aName) {
        this.value = aValue;
        this.name = aName;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}