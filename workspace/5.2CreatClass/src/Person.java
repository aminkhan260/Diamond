/*
 * Md Amin Khan
 * Date : 4/17/2017
 * CSC200
 * Proff.  Tanes Kanchanawanchai;  
 * 
 * Purpose of the program is to introduce with class.
 */

public class Person {
	String name;
	String language;
	int age = 16;

	static void main(String[] args) {

	}

	public Person() {
		this.name = "Amin";
		this.language = "English";
		this.age = 16;
	}

	public Person(String name, String language, int i) {

		this.name = name;
		this.language = language;
		this.age = age;
	}

	public String setName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String language() {
		return language;
	}

	public String getlanguage() {
		return this.language;
	}

	public void setlanguage(String language) {
		this.language = language;
	}

	public int getAge(int age) {
		return this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
