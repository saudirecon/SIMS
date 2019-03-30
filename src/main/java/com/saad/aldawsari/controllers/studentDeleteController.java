package com.saad.aldawsari.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.saad.aldawsari.beans.*;

@Controller

public class studentDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value="/student/delete/{ID}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("ID") String ID) {
	System.out.println("DELETEING STUDENT");   
	    return studentReg.getInstance().deleteStudent(ID);
	}
}
