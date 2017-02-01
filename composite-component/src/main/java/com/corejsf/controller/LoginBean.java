package com.corejsf.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("user")
@SessionScoped
public class LoginBean implements Serializable{

	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public LoginBean(){
		
	}
	public LoginBean(String name, String password){
		this.name=name;
		this.password=password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String login() {
        return "welcome" + "?faces-redirect=true";
    }
	public String logout(){
		return "index" + "?faces-redirect=true";
	}
	
}
