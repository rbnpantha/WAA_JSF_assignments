package com.corejsf;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserBean {
	@Inject
	UserRepo userRepo;

	@Inject
	User user;

	public User getUser() {
		return user;
	}
	
	// invoked first on Process Validations by value change listener
	// then overridden on Update Model
	public void setUser(User user) {
		this.user = user;
	}

	public void add() {
		userRepo.addUser(user);
	}
	
	// Fired in Process Validations Phase
	public void findLastName(ValueChangeEvent e){
		List<User> userList = userRepo.getUserList();
		for(int i=0; i<userList.size();i++){
			if(userList.get(i).getFirstName().equals(e.getNewValue())){
				user.setLastName(userList.get(i).getLastName());
			}
		}
	}
}
