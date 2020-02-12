package Utilities;

public interface Util{
    public static enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    /**
     * Contains the count of each weekday in the month
     */
    public static enum MONTH {
      JAN (4, 4, 5, 5, 5, 4, 4), // from Monday to Sunday
      FEB (4, 4, 4, 4, 4, 5, 4),
      MAR (5, 5, 4, 4, 4, 4, 5),
      APR (4, 4, 5, 5, 4, 4, 4),
      MAY (4, 4, 4, 4, 5, 5, 5),
      JUN (5, 5, 4, 4, 4, 4, 4),
      JUL (4, 4, 5, 5, 5, 4, 4),
      AUG (5, 4, 4, 4, 4, 5, 5),
      SEP (4, 5, 5, 4, 4, 4, 4),
      OCT (4, 4, 4, 5, 5, 5, 4),
      NOV (5, 4, 4, 4, 4, 4, 5),
      DEC (4, 5, 5, 5, 4, 4, 4);

      private int[] DAY_COUNT;

      /**
       * private constructer of this enum which sets the day count
       */
      private MONTH (int... day_count){
        DAY_COUNT = new int[7];
        for(int i = 0; i < day_count.length; i++){
          DAY_COUNT[i] = day_count[i];
        }
      }

      /**
       * Returns the count of a particular weekday in the month
       */
      public int getDayCount(Day d){
        return this.DAY_COUNT[d.ordinal()];
      }
    }
}