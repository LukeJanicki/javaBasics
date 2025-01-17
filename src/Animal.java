
import java.util.Scanner;

public class Animal {
	public static final double FAVNUMBRT = 1.6180;
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favouriteChar;
	private double speed;
	private float height;

	protected static int numberOfAnimals = 0;

	static Scanner userinput = new Scanner(System.in);

	public Animal() {
		numberOfAnimals++;
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);

		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);

		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);

		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);

		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);

		System.out.print("Enter the name: \n");
		if (userinput.hasNextLine()) {
			this.setName(userinput.nextLine());

		}
		this.setFavouriteColor();
		this.setUniqueID(modOfNumbers);
		;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));

		String stringNumber = Long.toString(maxNumber);

		int numberString = Integer.parseInt(stringNumber);
	}

	public char getFavouriteChar() {
		return favouriteChar;
	}

	public void setFavouriteChar(char favouriteChar) {
		this.favouriteChar = favouriteChar;
	}

	public void setFavouriteChar() {
		int randomNumber = (int) (Math.random() * 126) + 1;
		this.favouriteChar = (char) randomNumber;

		if (randomNumber == 32) {
			System.out.println("Favouurite character set to Space");

		} else if (randomNumber == 10) {
			System.out.println("Favourite character set to Newline");
		} else {
			System.out.println("Favourite character set to " + this.favouriteChar);
		}
		if((randomNumber > 97) && (randomNumber < 122)) {
			System.out.println("Favourite character is a lowercase");
		}
		if((randomNumber > 97) && (randomNumber < 122) || (randomNumber > 97) && (randomNumber < 122)) {
			System.out.println("Favourite character is a lowercase");
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public static void main(String[] args) {
		Animal theAnimal = new Animal();
	}

}
