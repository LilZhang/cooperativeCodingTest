package oops;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<String> strs = new ArrayList<String>();
    	strs.add("基督山伯爵");
    	strs.add("福尔摩斯");
        System.out.println( "Hello World!"+strs.get(0) );

        Sharon.actDayTime();
        Sharon.actNightTime();
    }

    private static class Sharon {

        private static void sleeping() {
            System.out.println("zzzz");
        }

        private static void coding() {
            watchingTV();
        }

        private static void watchingTV() {
            System.out.println("Boom Shakalaka");
        }

        public static void actDayTime() {
            sleeping();
            watchingTV();
        }

        public static void actNightTime() {
            sleeping();
            coding();
            watchingTV();
        }

    }
}
