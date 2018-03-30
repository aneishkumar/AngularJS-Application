package com.project2.DAO;

import java.util.List;

import com.project2.model.Job;

public interface JobDAO {
	void saveJob(Job job);
	List<Job> getAllJobs();
	Job getJobById(int id);
	Job deletejob(int id);
	void applyjob(int id);

}
