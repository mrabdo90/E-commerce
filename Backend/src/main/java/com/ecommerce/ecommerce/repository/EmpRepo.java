package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<User,Long> {


}
