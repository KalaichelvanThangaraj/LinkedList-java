

import java.util.LinkedList;

public class addFirst{

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList();
        names.add("Batman");
        names.add("Captain America");
        names.add("Iron man");
        names.add("Superman");
        names.add("Thor");
        System.out.print(names.getFirst());

	}

}

/* output

Batman  */
