package com.jsf.datatable.repository;

import java.util.ArrayList;

import com.jsf.datatable.beans.Name;

public interface TableDataRepository {

	void deleteRow(Name name);

	String saveName(Name name);

	void addName(Name name);

	 ArrayList<Name> getAllName();
}
