package com.hivetech.mvc.dao.impl;


import com.hivetech.mvc.dao.INewDAO;
import com.hivetech.mvc.mapper.NewMapper;
import com.hivetech.mvc.model.NewModel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql =new StringBuilder("SELECT * FROM news");
		return query(sql.toString(),new NewMapper());
	}
}
