class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if(minutes == 59 && hours==12) {
            minutes = 0;
            hours = 1;
        }else if(minutes==59){
            hours++;
            minutes = 0;
        }
        else {
            minutes++;
        }


        //System.out.println((minutes > 9) ? "time is "+hours+":"+minutes : "time is "+hours+":0"+ minutes);
    }
}