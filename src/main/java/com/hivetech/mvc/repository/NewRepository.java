package com.hivetech.mvc.repository;

import com.hivetech.mvc.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewRepository extends JpaRepository<NewEntity,Long> {

}
