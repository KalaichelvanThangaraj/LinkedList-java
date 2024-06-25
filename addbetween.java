
import java.util.*;
public class addbetween {

	public static void main(String[] args) {
	LinkedList<String> names = new LinkedList();
        names.add("Batman");
        names.add("Captain America");
        names.add("Ironman");
        names.add("Superman");
        names.add("Thor");
        System.out.println("Before adding:");
        System.out.println(names);
        names.add(2,"Black panther");
        System.out.println("After adding:");
        System.out.println(names);
	}

}

/*output

Before adding:
[Batman, Captain America, Ironman, Superman, Thor]
After adding:
[Batman, Captain America, Black panther, Ironman, Superman, Thor] */
