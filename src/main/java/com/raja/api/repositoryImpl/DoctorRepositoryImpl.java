package com.raja.api.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import com.raja.api.entity.Doctor;
import com.raja.api.repository.DoctorRepository;

public class DoctorRepositoryImpl implements DoctorRepository {

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		
		List<Doctor> result = new ArrayList<Doctor>();
		Doctor john = new Doctor();
		john.setFirstName("John");
		john.setMiddleName("William");
		john.setLastName("Carpeter");
		john.setSpeciality("NeuroSurgeon");
		john.setRatings(5);
		john.setYearsOfExperience(20);
		john.setCity("New york");
		Doctor mary = new Doctor();
		mary.setFirstName("Mary");
		mary.setMiddleName("C.");
		mary.setLastName("Cooper");
		mary.setSpeciality("Cardiology");
		mary.setYearsOfExperience(5);
		mary.setRatings(8);
		mary.setCity("San Franscisco");
		result.add(john);
		result.add(mary);
		return result;
	}

	@Override
	public Doctor findOne(int id) {
		// TODO Auto-generated method stub
		Doctor brandon = new Doctor();
		brandon.setFirstName("Brandon");
		brandon.setMiddleName("B");
		brandon.setLastName("Burris");
		brandon.setSpeciality("NeuroSurgeon");
		brandon.setRatings(7);
		brandon.setYearsOfExperience(17);
		brandon.setCity("San Franscisco");
		
		return brandon;
	}
	
	

}
