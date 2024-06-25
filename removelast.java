import java.util.LinkedList;

public class removelast {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList();
        names.add("Batman");
        names.add("Captain America");
        names.add("Blue Beetle");
        names.add("Superman");
        names.add("Thor");
        names.removeLast();
        System.out.println(names);
	}

}

/*output
[Batman,Captain America,Superman,Blue Beetle,Superman]*/
