package com.saad.aldawsari.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.saad.aldawsari.beans.*;
@Controller
public class studentPUT {
	
	@RequestMapping(method = RequestMethod.PUT, value="/student/update")
	

	@ResponseBody
	public String updateStudentRecord(@RequestBody Student stdn) {
	System.out.println("UPDATING STUDENT");   
	    return studentReg.getInstance().updateStudent(stdn);
	}
}
