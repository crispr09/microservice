package com.mysite.hibernate;

public class Employee { 

private int id; 
private int id_test;  
private String firstName,lastName;  
private int newVar;
  
public int getNewVar() {  
    return newVar;  
}  
public void setNewVar(int var) {  
    this.newVar = var;  
}
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}  
}  
