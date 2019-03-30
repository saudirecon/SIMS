package com.saad.aldawsari.controllers;


import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.saad.aldawsari.beans.*;
import com.saad.aldawsari.beans.Student;

@Controller 
public class StudentPostController {
	@RequestMapping(method = RequestMethod.POST, value="/student/regester")
	  @ResponseBody
	  public clientReply registerStudent(@RequestBody Student student) {
	  System.out.println("regestering student.....");
	  clientReply stdregreply = new clientReply();           
	        studentReg.getInstance().add(student);
	       // get a message back to the caller.
	        stdregreply.setName(student.getName());
	        stdregreply.setAge(student.getAge());
	        stdregreply.setID(student.getID());
	        stdregreply.setGPA(student.getGPA());
	        
	        return stdregreply;
	}
	}

