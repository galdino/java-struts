package com.struts.model;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class User extends ActionForm {
    private int id;
    private String name;
    private String phone;
    private String username;
    private String password;
    private String about;
    private String favourites;
    private String role;
    private String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFavourites() {
        return favourites;
    }

    public void setFavourites(String favourites) {
        this.favourites = favourites;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors actionErrors = new ActionErrors();
//
//        if(this.getName() == null || this.getName().length() == 0){
//            actionErrors.add("user.name.required", new ActionMessage("error.user.name.required"));
//        }

//        if(this.getAge() < 0){
//            actionErrors.add("user.age.invalid", new ActionMessage("error.user.age.invalid"));
//        }

//        return actionErrors;

        return super.validate(mapping, request);
    }
}
