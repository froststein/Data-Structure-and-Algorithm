package question2;

import java.util.ArrayList;

public class AnyMammalNoise {
	public static void main(String[] args) {
		ArrayList<Mammal> mList=new ArrayList<Mammal>();
		Dog d1=new Dog();
		Cat c1=new Cat();
		Cow co1=new Cow();
		mList.add(d1);
		mList.add(c1);
		mList.add(co1);
		for(Mammal mal:mList){
			System.out.println("Mammal noise is :"+mal.makeNoise());
		}
	}
}
