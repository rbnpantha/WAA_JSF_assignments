package com.corejsf.controller;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.corejsf.Password")
public class PasswordValidator implements Validator{

    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String pwd = (String) value;
        
        if (pwd.startsWith("@")) {
            throw new ValidatorException(new FacesMessage("Invalid character @ not allowed!!"));
        }
    }
    
}

