package com.hivetech.mvc.dao;

import java.util.List;

import com.hivetech.mvc.model.NewModel;
import org.springframework.stereotype.Repository;

@Repository
public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll( );

}
