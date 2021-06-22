

class Docter { // Method overloading

	void display(String name, String specialization, int zipcode) {

		System.out.println("The details of the all the docters are " + name + specialization + zipcode);
	}

	void display(String name, String specialization, int zipcode, String city) {

		System.out.println("The details of the all the docters are " + name + specialization + zipcode);
	}
}

class surgoen extends Docter { // Method overriding

	void display1(String name, String specialization, int zipcode) {

		System.out.println("The details of the all the docters are " + name + specialization + zipcode);
	}

	void display(String name, String specialization, int zipcode) {
		super.display(name, specialization, zipcode);
		
	}
}
public   class MethodOverLoadingAndOverRiding {

	public static void main(String[] args) {

		Docter d = new Docter();
		d.display("Pandya", "pediatrics", 78613);
		d.display("burugu", "general", 78613, "Austin");
		surgoen s = new surgoen();
		s.display1("mark", "nuero", 23459);
		s.display("cohn", "oncology", 12340);
	}

}
