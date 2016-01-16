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
    }
}
