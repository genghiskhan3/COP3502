import java.util.*;

public class Pet{
	private String name;
	private int age, weight;

	public Pet(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	// method to find the name of the smallest pet
	public String smallName(Pet [] array){
		int minIndex = -1;
		int minWeight = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++){
			if (array[i].getWeight() < minWeight){
				minWeight = array[i].getWeight();
				minIndex = i;
			}
		}

		return array[minIndex].getName();
	}

	// method to get the name of the largest pet
	public String largeName(Pet [] array){
		int maxIndex = -1;
		int maxWeight = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++){
			if (array[i].getWeight() > maxWeight){
				maxWeight = array[i].getWeight();
				maxIndex = i;
			}
		}

		return array[maxIndex].getName();
	}

	// method to find the name of the youngest pet
	public String youngName(Pet [] array){
		int minIndex = -1;
		int minAge = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++){
			if (array[i].getAge() < minAge){
				minAge = array[i].getAge();
				minIndex = i;
			}
		}

		return array[minIndex].getName();
	}

	// method to find the name of the oldest pet
	public String oldName(Pet [] array){
		int maxIndex = -1;
		int maxAge = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++){
			if (array[i].getAge() > maxAge){
				maxAge = array[i].getAge();
				maxIndex = i;
			}
		}

		return array[maxIndex].getName();
	}

	// method to find the average weight of the pets
	public double avgWeight(Pet [] array){
		double sum = 0.0;

		for (Pet p : array){
			sum += (double) p.getWeight();
		}

		return sum / array.length;
	}

	// method to find the average age of the pets
	public double avgAge(Pet [] array){
		double sum = 0.0;

		for (Pet p : array){
			sum += (double) p.getAge();
		}

		return sum / array.length;
	}

	//get method for weight
	public int getWeight(){
		return this.weight;
	}
	// getter for age
	public int getAge(){
		return this.age;
	}
	// getter for name
	public String getName(){
		return this.name;
	}
}

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
