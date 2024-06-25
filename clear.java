import java.util.LinkedList;

public class clear {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList();
        names.add("Batman");
        names.add("Captain America");
        names.add("Iron man");
        names.clear();
        names.add("Superman");
        names.add("Thor");
        System.out.print("After clearing:");
        System.out.print(names);


	}

}

/*output

After clearing:[Superman, Thor] */
