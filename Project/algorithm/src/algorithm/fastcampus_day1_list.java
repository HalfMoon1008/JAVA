package algorithm;
import java.util.ArrayList;
import java.util.List;


public class fastcampus_day1_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("World");
		list.add("Grace");
		
		System.out.println(list);
		
		list.remove("hello");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		
	}

}
