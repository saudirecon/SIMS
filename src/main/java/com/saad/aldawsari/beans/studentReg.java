package com.saad.aldawsari.beans;

import java.util.ArrayList;
import java.util.List;
public class studentReg {
	
	private List<Student> studentInfo;
	private static studentReg studentreg = null;
	
	private studentReg()
	{
		studentInfo = new ArrayList<Student>();
		
	}
	public static studentReg getInstance()
	{
		if (studentreg == null) {
			studentreg= new studentReg();
			return studentreg;
		}
		else
		{
			return studentreg;
		}
	}

	public void add(Student student)
	{
		studentInfo.add(student);
	}
	public String updateStudent(Student student)
	{
		for (int i=0; i<studentInfo.size();i++)
		{
			Student stnd = studentInfo.get(i);
			if(stnd.getID().equals(student.getID()))
			{
				studentInfo.set(i, student); // update Student info 
				return "Studnet Information has been Updated";
			}
			
		}
		return "Cannot update!";
	}
	
	public String deleteStudent(String ID)
	{
		for (int i =0; i < studentInfo.size();i++)
		{
			Student stdn = studentInfo.get(i);
			if(stdn.getID().equals(ID)) {
				studentInfo.remove(i);// delete the student.
				return "Delete worked!";
			}
		}
		return "Cannot Delete";
	}
	
	public List<Student> getStudentRecords(){
		return studentInfo;
	}
}
