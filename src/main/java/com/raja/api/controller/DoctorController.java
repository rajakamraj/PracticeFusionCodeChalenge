package com.raja.api.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raja.api.entity.Doctor;
import com.raja.api.service.DoctorService;



@RestController
@RequestMapping("/similarDoctors/")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	@RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="Retrieve all Doctors similar to a doctor",notes="Returs the list of all the similar doctors")
	@ApiResponses(value={
			   @ApiResponse(code=200,message="All vehicles have successfully retrieved"),
			@ApiResponse(code=500,message="Internal server error")
	})
	public List<Doctor> findSimilarDoctors(@PathVariable("id") int id, @RequestBody String similarCriteria) {
		
		return doctorService.findSimilarDoctors(id, similarCriteria);
	}
}
