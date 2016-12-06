package com.raja.api.service;

import java.util.List;

import com.raja.api.entity.Doctor;

public interface DoctorService {
	public List<Doctor> findAll();

	public Doctor findOne(int id);
	
	public List<Doctor> findSimilarDoctors(int id, String similarCriteria);

	
}
