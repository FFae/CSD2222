

/*
 * Fernando Fae
 */


public class Student {

	private String  name;       // name has	default	value null
	private int     age;        // student name
	private String  programme;  //student programme
	private char    gender;     //student gender
	
	
	// construct a student
	public Student(String name, int age, String programme, char gender){
		
		this.name      = name       ;
		this.age       = age	    ;	
		this.programme = programme  ;
		this.gender    = gender     ;
	}
	
	public void displayStudentDetails() {
		
		if (this.programme.contentEquals("Computing")){
		
			System.out.println(	"Name: "      + name + 
					            " Age: "      + age + 
					            " Programme: " + programme + 
					            " Gender: "    + gender +
					            "\n")	;
		}
		else{
			
			System.out.println(	"Name: "      + name + 
					            " Age: "      + age + 
					            " Programme: Other Programme" +  
					            " Gender: "    + gender +
					            "\n")	;
		}
	}
	
	public String getProgramme(){
		return programme;
	}
	
	public void setProgramme(String programme){
		this.programme = programme;
	}
	
	public char getGender(){
		return gender;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
}
















