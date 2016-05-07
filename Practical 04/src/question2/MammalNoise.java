package question2;

import java.util.ArrayList;

public class MammalNoise {
	public static void main(String[] args) {
		ArrayList<Mammal> mList=new ArrayList<Mammal>();
		Dog d1=new Dog();
		Cat c1=new Cat();
		Cow co1=new Cow();
		mList.add(d1);
		mList.add(c1);
		mList.add(co1);
		for(int i=0;i<mList.size();i++){
			if(mList.get(i) instanceof Dog){
				System.out.println("Dog noise is : "+mList.get(i).makeNoise());
			}else if(mList.get(i) instanceof Cat){
				System.out.println("Cat noise is : "+mList.get(i).makeNoise());
			}else if(mList.get(i) instanceof Cow){
				System.out.println("Cow noise is : "+mList.get(i).makeNoise());
			}
			else{
				System.out.println("You are not an animal, don't make noise.");
			}
		}
		
	}
}
