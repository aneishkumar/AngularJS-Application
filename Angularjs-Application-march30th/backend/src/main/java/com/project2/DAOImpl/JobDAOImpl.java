package com.project2.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.JobDAO;
import com.project2.model.Job;
@Repository
@Transactional
public class JobDAOImpl implements JobDAO {
	@Autowired
	private SessionFactory sessionfactory;
	public void saveJob(Job job) {
		Session session=sessionfactory.getCurrentSession();
		session.save(job);
	}

	public List<Job> getAllJobs() {
		Session session=sessionfactory.getCurrentSession();
		Query query=session.createQuery("from Job");
		return query.list();
	}

	public Job getJobById(int id) {
		Session session=sessionfactory.getCurrentSession();
		Job job=(Job)session.get(Job.class,id);
		return job;
	}

	public Job deletejob(int id) {
		Session session=sessionfactory.getCurrentSession();
		Job job=new Job();
		job.setId(id);
		session.delete(job);
		return job;
	}

	public void applyjob(int id) {
		
		Session session=sessionfactory.getCurrentSession();
		Job job=new Job();
		
		// TODO Auto-generated method stub
		
	}


}
