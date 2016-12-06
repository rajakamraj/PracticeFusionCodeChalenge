package com.raja.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.raja.api.entity.Doctor;
import com.raja.api.repository.DoctorRepository;
import com.raja.api.service.DoctorService;

public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctorRepository doctorRepository;
	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor findOne(int id) {
		// TODO Auto-generated method stub
		return doctorRepository.findOne(1);
	}

	@Override
	public List<Doctor> findSimilarDoctors(int id, String similarCriteria) {
		// TODO Auto-generated method stub
		Doctor brandon = findOne(1);
		List<Doctor> remainingDoctorList = findAll();
		List<Doctor> similarDoctorList = null;
		if(similarCriteria.equalsIgnoreCase("speciality"))
		{
			similarDoctorList = findSimilarityBySpeciality(brandon,remainingDoctorList );
		}
		else if(similarCriteria.equalsIgnoreCase("experience"))
		{
			similarDoctorList = findSimilarityByExperience(brandon,remainingDoctorList );
		}
		else if(similarCriteria.equalsIgnoreCase("ratings"))
		{
			similarDoctorList = findSimilarityByRatings(brandon,remainingDoctorList );
		}
		else if(similarCriteria.equalsIgnoreCase("location"))
		{
			similarDoctorList = findSimilarityByLocation(brandon,remainingDoctorList );
		}
		return similarDoctorList;
	}

	public List<Doctor> findSimilarityBySpeciality(Doctor doctor, List<Doctor> doctorList)
	{
		/**
		 * This function can be further improved by Natural language processing techniques. 
		 * Doctors will have a set of techniques and each can be assigned a weight.
		 * Using NLP tools, we can analyse how similar two doctors are based on their list of specialities.
		 * 
		 */
		
		List<Doctor> similarDoctorList = null;
		for(Doctor docObj  : doctorList)
		{
			if(docObj.getSpeciality().equalsIgnoreCase(doctor.getSpeciality()))
			{
				similarDoctorList.add(docObj);
			}
		}
		return similarDoctorList;
	}
	
	public List<Doctor> findSimilarityByExperience(Doctor doctor, List<Doctor> doctorList)
	{
		/**
		 *This function be further improved by classification of doctors based on their experience.
		 *They can be classified as fresher, intern, experienced, consultant and expert
		 */
		
		List<Doctor> similarDoctorList = null;
		for(Doctor docObj  : doctorList)
		{
			if(docObj.getYearsOfExperience() - doctor.getYearsOfExperience() < 5)
			{
				similarDoctorList.add(docObj);
			}
		}
		return similarDoctorList;
	}
	
	public List<Doctor> findSimilarityByRatings(Doctor doctor, List<Doctor> doctorList)
	{
		/**
		 *This function be further improved by text analysis.
		 *we can list of reviews for doctor from social media platforms.
		 *Using sentiment analysis, we can classify the doctors based on the reviews.
		 */
		
		List<Doctor> similarDoctorList = null;
		for(Doctor docObj  : doctorList)
		{
			if(docObj.getRatings() == doctor.getRatings())
			{
				similarDoctorList.add(docObj);
			}
		}
		return similarDoctorList;
	}
	
	public List<Doctor> findSimilarityByLocation(Doctor doctor, List<Doctor> doctorList)
	{
		/**
		 * Here we can have compositie object in Doctor class as Location
		 * Location object will have city information and function to calculate
		 * the distance between two cities.
		 * By this way, we can set a threshold distance limit to find doctors by location.
		 */
	return null;
	}
}
