package com.hivetech.mvc.DAO;

import com.hivetech.mvc.model.NewModel;

import java.util.List;

public interface INewDAO extends GenericDAO<NewModel> {
    List<NewModel> findAll();
}
