/**
 * @projectName reading
 * @package com.answer.reading.common.enums
 * @className com.answer.reading.common.enums.BookCategoryEnum
 */
package com.answer.reading.common.enums;

/**
 * BookCategoryEnum
 * @description 图书分类枚举
 * @author answer_wx
 * @date 2023/11/1 22:19
 * @version 1.0
 */
public enum BookCategoryEnum {

    CATEGORY_1(1,"都市小说"),

    CATEGORY_2(2,"东方玄幻"),

    CATEGORY_3(3,"武侠仙侠"),

    CATEGORY_4(4,"悬疑惊悚"),

    CATEGORY_5(5,"唯美同人"),

    CATEGORY_6(6,"网游竞技"),

    CATEGORY_7(7,"科幻未来"),

    CATEGORY_8(8,"历史穿越");

    private int value;
    private String name;

    BookCategoryEnum(int aValue, String aName) {
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