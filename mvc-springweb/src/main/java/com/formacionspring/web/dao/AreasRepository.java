package com.formacionspring.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.web.entity.Areas;
@Repository
public interface AreasRepository extends JpaRepository<Areas, Long>{

}
