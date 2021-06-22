package hello;

import java.util.Date;

public class Page {
    private final String date;
    private final String time;

    public Page() {
        Date date = new Date();
        this.date = String.valueOf(date.getDate()) + "." + String.valueOf(date.getMonth()+1) + "." + String.valueOf(date.getYear()+1900);
        this.time = String.valueOf(date.getHours()) + ":" + String.valueOf(date.getMinutes()) + ":" + String.valueOf(date.getSeconds());
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
