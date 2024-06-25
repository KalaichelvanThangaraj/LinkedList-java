import java.util.*;
public class removeFOccurrence {

	public static void main(String[] args) {
        LinkedList<String> names = new LinkedList();
        names.add("Batman");
        names.add("Captain America");
        names.add("Thor");
        names.add("Superman");
        names.add("Thor");
        System.out.println("Before removing first occurance:");
        System.out.println(names);
        names.removeFirstOccurrence("Thor");
        System.out.println("After removing first occurance:");
        System.out.println(names);

	}

}


 /*output

Before removing first occurance:
[Batman, Captain America, Thor, Superman, Thor]
After removing first occurance:
[Batman, Captain America, Superman, Thor] */