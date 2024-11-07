package com.free.java;

/**
 * @author free
 * @create 2024-11-07-12:05
 * 枚举类的使用
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer);

        Season[] seasons = Season.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        Season winter = Season.valueOf("WINTER");
        System.out.println(winter);
    }
}

enum Season{
    SPRING("春天","春日花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMU("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    private final String seasonName;
    private final String seasonDesc;

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


}
