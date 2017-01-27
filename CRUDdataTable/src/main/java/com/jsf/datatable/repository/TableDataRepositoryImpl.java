package com.jsf.datatable.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import com.jsf.datatable.beans.Name;

public class TableDataRepositoryImpl implements TableDataRepository, Serializable {

	private ArrayList<Name> names = new ArrayList<Name>(Arrays.asList(new Name("Anna", "Keeney"),
			new Name("John", "Wilson"), new Name("Mariko", "Randor"), new Name("William", "Dupont")));

	@Override
	public void deleteRow(Name nameToDelete) {
		names.remove(nameToDelete);
	}

	@Override
	public String saveName(Name name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addName(Name name) {
		names.add(name);

	}

	@Override
	public ArrayList<Name> getAllName() {
		return names;

	}

}
