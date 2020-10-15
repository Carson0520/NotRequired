package AngryGit_StudentGUI;
public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int[] marks;


 //constructor methods - 3 ways you can make a student

        
        
	//Additonal Constructor
	public Student(String nm, int m[]) {
		name = nm;
		marks = m;
	}

	//Another constructor
	public Student(Student s) {
		this(s.name, s.marks);
	}

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int whichmark, int number){
    	marks[number-1] = whichmark;
    }

    public int getAverage() {
    	int average = (marks[0] + marks[1] + marks[2]) / 3;
    	return average;
    }


    public int getMark(int whichmark) {
	return marks[whichmark-1];
    }

    public int getHighscore() {
int high = marks[0];
high = Math.max(high,marks[1]);
high = Math.max(high,marks[2]);
return high;
    }

    public String toString() {
    	String result = "Name: " + name;
    	result += "\nMark 1:\t" + marks[0];
    	result += "\nMark 2:\t" + marks[1];
    	result += "\nMark 3:\t" + marks[2];
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (marks[0] < 0 || marks[0] > 100 || marks[1] < 0 || marks[1] > 100 || marks[2] < 0 || marks[2] > 100) 
    		message += "\nAt least one mark is out of range, please re-enter all data";
	
	return message;
    	}
 }

