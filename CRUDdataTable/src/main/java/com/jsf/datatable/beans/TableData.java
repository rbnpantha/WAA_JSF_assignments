package com.jsf.datatable.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

import com.jsf.datatable.service.TableDataService;

// or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
// or import javax.faces.bean.SessionScoped;

@Named // or @ManagedBean
@SessionScoped
public class TableData implements Serializable {

	@Inject
	TableDataService tableDataService;
	
/*	private ArrayList<Name> names = new ArrayList<Name>(Arrays.asList(new Name("Anna", "Keeney"),
			new Name("John", "Wilson"), new Name("Mariko", "Randor"), new Name("William", "Dupont")));
*/
	/*public ArrayList<Name> getNames() {
		return names;
	}*/
	
	public ArrayList<Name> getNames() {
		return tableDataService.getAllName();
	}

	/*public String save() {
		for (Name name : names)
			name.setEditable(false);
		return null;
	}*/
	
	public String save() {
		for (Name name : getNames())
			name.setEditable(false);
		return null;
	}
	
	public void deleteRow(Name nameToDelete) {
		tableDataService.deleteRow(nameToDelete);;
	}
	
	public void addName(Name name){
		tableDataService.addName(name);
	}

	/*public String deleteRow(Name nameToDelete) {
		names.remove(nameToDelete);
		return null;
	}*/
	
}