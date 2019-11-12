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

    /*int setHours(int hours){
        this.hours = hours;
        return this.hours
    }*/

    void display(){
        System.out.printf("Time: %d:%d:%d", this.hours, this.minutes, this.seconds);
    }
}