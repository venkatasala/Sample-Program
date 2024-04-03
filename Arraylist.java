package MultidimensionalArrayusingArraylist;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> a=new ArrayList<>();
		for(int i=0;i<3;i++) {
			a.add(new ArrayList<>());
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a.get(i).add(sc.nextInt());
			}
		}
		System.out.println(a);
	}

}
