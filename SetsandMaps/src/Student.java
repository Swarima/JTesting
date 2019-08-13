import java.util.*;
public class Student {
	private int rollno;
	private String name;
	private double per;
	
	public Student(int rollno, String name, double per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}





	