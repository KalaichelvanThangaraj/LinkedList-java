
import java.util.*;
public class replace 
         {
            public static void main(String[] args) 
			{
		        LinkedList<String> names = new LinkedList();
		        names.add("Batman");
		        names.add("Captain America");
		        names.add("Blue Beetle");
		        names.add("Superman");
		        names.add("Thor");
		        names.set(2,"Ironman");
		        System.out.println(names);
			

	}

}

 /*output

[Batman, Captain America, Ironman, Superman, Thor] */
