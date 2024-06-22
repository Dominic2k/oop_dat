package CLASSES;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;            
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
        return this;
    }

    public MyTime(int hour, int minute, int second){
        try {
            setTime(hour, minute, second);
        } catch (Exception e) {
            System.out.println("\"Invalid hour, minute, or second!\"");
        }
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        try {
            if (hour >= 0 && hour <= 23) {
                    this.hour = hour;
                }
        } catch (Exception e) {
            System.out.println("Error!. Hour must from 0 to 23");
        }
    }
    public void setMinute(int minute){
        try {
            if (minute >= 0 && minute <= 59) {
                this.minute = minute;
            }
        } catch (Exception e) {
            System.out.println("Error!. Minute must from 0 to 59");
        }
    }
    public void setSecond(int second){
        try {
            if (second >= 0 && second <= 59) {
                this.second = second;
            }
        } catch (Exception e) {
            System.out.println("Error! Second must from 0 to 59");
        }
    }

    public String toString(){
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public MyTime nextSecond(){
        if (this.hour == 23 && this.minute == 59 && this.second == 59) {
            return new MyTime(0, 0, 0);
        }else if (this.second == 59) {
            this.minute ++;
            this.second = 0;
        }else{
            this.second ++;
        }
        return this;
    }
    public MyTime nextMinute(){
        if (this.hour == 23 && this.minute == 59 && this.second == 59) {
            return new MyTime(0, 0, 0);
        }else if (this.minute == 59) {
            this.hour ++;
            this.minute = 0;
        }else{
            this.minute ++;
        }
        return this;
    }
    public MyTime nextHour(){
        if (this.hour == 23 && this.minute == 59 && this.second == 59) {
            return new MyTime(0, 0, 0);
        }else if (this.hour == 23) {
            this.hour = 0;
        }else{
            this.hour ++;
        }
        return this;
    }
    // public MyTime previousSecond(){}
    // public MyTime previousMinute(){}
    // public MyTime previousHour(){}


}
