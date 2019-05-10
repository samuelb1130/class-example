
public class AnimalMain {

	public static void main(String[] args) 
	{
		Animal summer = new Animal("dog", 'f', "woof", 4, 3);  
		System.out.println(summer.talk());
		Animal simba = new Animal();
		System.out.println(simba.talk());
		System.out.println(simba.getAge());
		simba.birthday();
		System.out.println(simba.getAge());
	}

}
