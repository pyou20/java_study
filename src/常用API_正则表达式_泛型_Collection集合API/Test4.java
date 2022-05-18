package 常用API_正则表达式_泛型_Collection集合API;

import java.util.ArrayList;
import java.util.Collection;

public class Test4 {
	public static void main(String[] args) {
		Collection list=new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println(list);

		list.remove("2");
		System.out.println(list);

		System.out.println(list.size());

		list.clear();

		System.out.println(list);

	}


}
