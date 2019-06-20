package com.project.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.project.model.Library;

@Component
public class ProjectDao {

	List<Library> project=new ArrayList<>();
	
	
	public Library create(Library library) {
		project.add(library);
		return library; 
	}
	
	public List<Library>getall(){
		return project;  
		
	}
	
	public Library get(int id) {
		return project.get(id);
		
	}	

	public void delete(int id) {
		project.remove(id);
	}
	
	public void update(int id,Library library) {
		project.set(id, library);
	
		
	}
	
	

}




	








