package com.jsf.datatable.service;

import java.io.Serializable;
import java.util.ArrayList;

import javax.inject.Inject;

import com.jsf.datatable.beans.Name;
import com.jsf.datatable.repository.TableDataRepository;

public class TableDataServiceImpl implements TableDataService, Serializable {

	
	@Inject
	private TableDataRepository tableDataRepository;
	
	@Override
	public void deleteRow(Name name) {
		tableDataRepository.deleteRow(name);

	}

	@Override
	public String saveName(Name name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addName(Name name) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Name> getAllName() {
		return tableDataRepository.getAllName();
		
	}

}
