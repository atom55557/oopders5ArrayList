package oopders5ArrayList;

import java.util.ArrayList;

public class dizim {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> item=new ArrayList<String>();
		item.add("red");
		item.add("yellow");
		item.add(0,"green");
		for(String renk:item) {
			System.out.print(" "+renk);
		}
		item.remove("red");
		for(String renk:item) {
			System.out.print("  "+renk);
		}
		System.out.print(item.get(1));
		
		System.out.print(item.contains("red")?" evet var.":" yok.");

	}

}
