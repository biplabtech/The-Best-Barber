package com.Myproject.OBM.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Myproject.OBM.model.Admin;
import com.Myproject.OBM.model.Userr;


public interface Adminrepo extends JpaRepository<Admin , Integer> {
	
	public Optional <Admin> findByAdminEmail(String email);
	public Admin findByAdminEmailAndAdminPassword(String email, String password);
	
}