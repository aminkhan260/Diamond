import java.util.Scanner;

/*JavaDoc.
 * Md Amin Khan
 * Date : 4/17/2017
 * CSC200
 * Instructor: Tanes Kanchanawanchai;  
 * 
 * 
 */

public class PersonDrive {

	static void main(String[] args, Scanner keyboard) {
		Person person = new Person();
		System.out.println(person);

		Person secondPerson = new Person("Kutta", "Bilai", 16);
		System.out.println(secondPerson);

		Scanner kewyboard = new Scanner(System.in);
		System.out.println("Please Enter a new Name");
		String name = keyboard.next();
		person.setName(name);
		System.out.println(person);
		System.out.println(person.language());

		int Person = 16;
		int SecondPerson = 1;
		if (Person >= 16) {
			System.out.println("you are older");
		} else
			System.out.println("what is your age?");
		if (SecondPerson <= 1) {
			System.out.println("you are younger");
		} else
			System.out.println("what is your age");

	}

}
