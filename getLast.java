

import java.util.LinkedList;

public class getLast {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList();
        names.add("Batman");
        names.add("Captain America");
        names.add("Iron man");
        names.add("Superman");
        names.add("Thor");
        System.out.print(names.getLast());

	}

}

 /*output

Thor */