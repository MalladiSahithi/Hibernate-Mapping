package com.hibernate.HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.List;
import java.util.ArrayList;
//import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int rollno;
	private String name;
	private int marks;
	
	/*@OneToOne
	private Laptop laptop;
	It is for one to one mapping one student have one laptop
	*/
	@ManyToMany(mappedBy="stu")
	private List<Laptop> l=new ArrayList<Laptop>();
	
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public List<Laptop> getL() {
		return l;
	}
	public void setL(List<Laptop> l) {
		this.l= l;
	}
	
	/*public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
