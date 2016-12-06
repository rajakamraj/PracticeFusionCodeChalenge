package com.raja.api.repository;

import java.util.List;

import com.raja.api.entity.Doctor;

public interface DoctorRepository {
	public List<Doctor> findAll();

	public Doctor findOne(int id);
}
