package com.example.user.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Table")
public class StudentTable {

	//default constructor
	public StudentTable(){
		
	}
	//Full wanting in the group only master 
	//Constructor using parameters
	public StudentTable(int rollno, String name, long phone, String branch) {
		super();
		Rollno = rollno;
		Name = name;
		Phone = phone;
		Branch = branch;
	}

	//creating the table with the column names
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int Sno;
	@Column(name="RollNo")
	private int Rollno;
	@Column(name="Name")
	private String Name;
	@Column(name="Phone")
	private long Phone;
	@Column(name="Branch")
	private String Branch;
	
	
	@Override
	public String toString() {
		return "studentTable [Rollno=" + Rollno + ", Name=" + Name + ", Phone=" + Phone + ", Branch=" + Branch + "]";
	}
	
	//Getters And Setter Methods
	public int getSno() {
		return Sno;
	}

	public void setSno(int sno) {
		Sno = sno;
	}
		public int getRollno() {
			return Rollno;
		}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
}
