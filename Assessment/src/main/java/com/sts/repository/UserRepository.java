package com.sts.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Serializable>{
	
	Optional<UserEntity> findByUserName(String userName);
}
