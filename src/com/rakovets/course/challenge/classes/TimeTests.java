package com.rakovets.course.challenge.classes;

public class TimeTests {
    public static void main(String[] args) {
        Time lessonTime = new Time(19, 8, 10);
        lessonTime.display();
        lessonTime.setHours();
        lessonTime.setMinutes();
        lessonTime.setSeconds();
        System.out.println(lessonTime.getHours());
        System.out.println(lessonTime.getMinutes());
        System.out.println(lessonTime.getSeconds());
    }
}
