class Student {
	String index;
	String firstName;
	String lastName;
	int[] ocenki;

	public Student(String index, String firstName, String lastName, int[] ocenki) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ocenki = ocenki;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		double sum = 0.0;
		for (int i = 0; i < ocenki.length; i++) {
			sum += ocenki[i];
		}
		return sum / ocenki.length;
	}

	public int ECTSCredits() {
		int krediti = 0;
		for (int i = 0; i < ocenki.length; i++) {
			if (ocenki[i] > 5)
				krediti += 6;
		}
		return krediti;
	}
}

class Faculty {
	List<Student> students = new ArrayList<>();
	String facultyName = "";

	public Faculty(List<Student> students, String facultyName) {
		this.students = students;
		this.facultyName = facultyName;
	}

	public void addStudents(Student student) {
		this.students.add(student);
	}
}
