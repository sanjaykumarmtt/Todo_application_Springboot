package com.class_1exta_1.class_1exta_1.Rapository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.class_1exta_1.class_1exta_1.Entirt.todoEntity;

@Repository
public interface todoRapository extends JpaRepository<todoEntity,Long>{

//	Page<todoEntity> findAll(Pageable pageble);

}
