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

    void setHours(){
        this.hours = hours;
    }

    int getHours(){
        return this.hours;
    }


    void setMinutes() {
        this.minutes = minutes;
    }

    int getMinutes() {
        return this.minutes;
    }

    void setSeconds() {
        this.seconds = seconds;
    }

    int getSeconds() {
        return this.seconds;
    }

    void display(){
        System.out.printf("Time: %d:%d:%d \n", this.hours, this.minutes, this.seconds);
        //System.out.println(getSeconds());
    }
}