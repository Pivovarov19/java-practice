package com.rakovets.course.challenge.classes;

public class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int getHours(){
        return this.hours;
    }

    void setHours(int hours){
        this.hours = hours;
    }

    void display(){
        System.out.printf("Time: %d:%d:%d \n", this.hours, this.minutes, this.seconds);
        System.out.print(getHours());
    }
}