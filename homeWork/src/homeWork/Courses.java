package homeWork;

public class Courses {
	
	public Courses() {
		System.out.println("Kurslar: ");
	}
	
	public Courses(int id1,String name1, int progress1, String instructorName1, String progressBar1) {
		this.id=id1;
		this.name=name1;
		this.progress=progress1;
		this.instructorName=instructorName1;
		this.progressBar=progressBar1;
	}
	
	
	
	
	
		int id;
		String name;
		int progress;
		String instructorName;
		String progressBar;
}
