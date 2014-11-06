import java.util.*;

class TestPet{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Pet [] petArray = new Pet[5];

		for (int i = 0; i < 5; i++){
			System.out.println("Please enter the name of the pet: ");
			String name = in.next();
			System.out.println("Please enter the age of the pet: ");
			int age = in.nextInt();
			System.out.println("Please enter the weight of the pet");
			int weight = in.nextInt();

			petArray[i] = new Pet(name, age, weight);
		}

		Pet test = new Pet("", 0, 0);

		System.out.println("The name of the smallest pet is: " + test.smallName(petArray) + "\n");
		System.out.println("The name of the largest pet is: " + test.largeName(petArray) + "\n");
		System.out.println("The name of the oldest pet is: " + test.oldName(petArray) + "\n");
		System.out.println("The name of the youngest pet is: " + test.youngName(petArray) + "\n");
		System.out.println("The average weight of the pets is: " + test.avgWeight(petArray) + "\n");
		System.out.println("The average age of the five pets is: " + test.avgAge(petArray) + "\n");
	}
}
