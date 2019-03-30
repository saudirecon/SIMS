package com.saad.aldawsari.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.saad.aldawsari.beans.Student;
import com.saad.aldawsari.beans.studentReg;

@Controller
public class retrieveStudentController {
	  @RequestMapping(method = RequestMethod.GET, value="/student/info")
	  @ResponseBody
	  public List<Student> getAllStudents() {
	  return studentReg.getInstance().getStudentRecords();
	  }
	}

