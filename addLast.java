import java.util.LinkedList;
public class  addLast{

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList();
        names.add("Batman");
        names.add("Captain America");
        names.add("Iron man");
        names.add("Superman");
        names.add("Thor");
        names.addLast("Spidy");
        System.out.print(names);

	}

}

 /*output

[Batman, Captain America, Iron man, Superman, Thor, Spidy] */
