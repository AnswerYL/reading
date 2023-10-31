/**
 * @projectName reading
 * @package com.answer.reading.common.enums
 * @className com.answer.reading.common.enums.BooklistMoreTypeEnum
 */
package com.answer.reading.common.enums;

/**
 * BooklistMoreTypeEnum
 * @description 书单更多枚举
 * @author answer_wx
 * @date 2023/11/1 22:36
 * @version 1.0
 */
public enum BooklistMoreTypeEnum {
    NOTHING(1, "无"),
    MORE(2, "更多"),
    EXCHANGE(3, "换一换"),
    LOADING(4, "加载");

    private int value;
    private String name;

    BooklistMoreTypeEnum(int aValue, String aName) {
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