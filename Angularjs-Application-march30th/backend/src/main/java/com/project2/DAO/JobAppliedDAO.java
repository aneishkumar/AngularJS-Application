package com.project2.DAO;

import java.util.List;


import com.project2.model.JobApplied;

public interface JobAppliedDAO {
	public void addJobApplied(JobApplied joba);
	public List<JobApplied> getalljobapplied(int jobid);
}
