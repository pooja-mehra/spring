package com.example.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="test1")
public class Spring1Entity {
	
@Id
@Column(name="user_id")
int user_id;

@Column(name="name")
String name;

@Column(name="age")
int age;

public Spring1Entity(int user_id, String name,int age){
	this.user_id = user_id;
	this.name= name;
	this.age = age;
}

public int getuser_id() {
    return user_id;
 }
 
 public void setuser_id( int user_id ) {
    this.user_id = user_id;
 }
 
 public String getname() {
     return name;
  }
  
  public void setname( String name ) {
     this.name = name;
  }
  
  public int getage() {
      return age;
   }
   
   public void setage( int age ) {
      this.age = age;
   }
   
}
