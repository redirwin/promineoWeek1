package promineoWeek1;

public class lectureWork {

	public static void main(String[] args) {

		double grade = 42;

		char letterGrade = ' ';

		if (grade >= 90) {
			letterGrade = 'A';
		} else if (grade >= 80) {
			letterGrade = 'B';
		} else if (grade >= 70) {
			letterGrade = 'C';
		} else if (grade >= 60) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}

		System.out.println("Your grade is " + letterGrade + ".");
	}

}
