package com.example.spring;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transaction;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class Spring1CRUD implements Spring1Repo{
	
	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sessionFactory = configuration.buildSessionFactory(); 
	Session session = (Session) sessionFactory.openSession(); 
	//Transaction tx; 
	@Override
	public <S extends Spring1Entity> S save(S entity) {
		// TODO Auto-generated method stub
			((SharedSessionContract) session).beginTransaction();  
			((Spring1CRUD) session).save(entity);  
			((SharedSessionContract) session).getTransaction().commit(); 
			System.out.println("saved successfully ");
			//some action  
			  
			try {
				session.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return entity;
	}


	@Override
	public Optional<Spring1Entity> findById(Serializable id) {
		// TODO Auto-generated method stub
		Optional<Spring1Entity> user_info;
		((SharedSessionContract) session).beginTransaction();  
		user_info = ((Spring1CRUD) session).findById(id);
		((SharedSessionContract) session).getTransaction().commit(); 
		try {
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user_info;
	}

	@Override
	public boolean existsById(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Spring1Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Spring1Entity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Spring1Entity> findAll() {
		// TODO Auto-generated method stub
		List<Spring1Entity> users = new ArrayList<Spring1Entity>();
		((SharedSessionContract) session).beginTransaction();  
		users = ((Spring1CRUD) session).findAll();
		((SharedSessionContract) session).getTransaction().commit(); 
		try {
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<Spring1Entity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spring1Entity> findAllById(Iterable<Serializable> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Spring1Entity> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Spring1Entity> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Spring1Entity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Spring1Entity getOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Spring1Entity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Spring1Entity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Spring1Entity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Spring1Entity> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Spring1Entity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Spring1Entity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Spring1Entity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


}
