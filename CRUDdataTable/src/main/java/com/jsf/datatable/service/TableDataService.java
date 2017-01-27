package com.jsf.datatable.service;

import java.util.ArrayList;

import com.jsf.datatable.beans.Name;

public interface TableDataService {

	void deleteRow(Name name);

	String saveName(Name name);

	void addName(Name name);

	ArrayList<Name> getAllName();

}
