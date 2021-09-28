public class Time{
  public static void main(String[] args){
    //initializing variables
    double hourStart = 13;
    double minuteStart = 28;
    double secondStart = 37;
    double hour = 13;
    double minute = 39;
    double second = 42;
    //# sec since midnight
    double sinceMidnight = 3600*hour + 60*minute + second;
    System.out.print("number of seconds since midnight: ");
    System.out.println(sinceMidnight);
    //# sec remaining in day
    double remaining = 3600*24-sinceMidnight;
    System.out.print("number of seconds remaining in day: ");
    System.out.println(remaining);
    //#percentage of day that has passed
    System.out.print("percentage of day that has passed: ");
    System.out.println(sinceMidnight/3600/24*100);
    //#elapsed time
    System.out.print("elapsed time (sec): ");
    System.out.println(3600*(hour-hourStart) + 60*(minute-minuteStart) + (second-secondStart));

  }
}
