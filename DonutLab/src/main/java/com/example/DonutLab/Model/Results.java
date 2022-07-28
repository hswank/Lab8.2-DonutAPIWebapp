package com.example.DonutLab.Model;

import java.util.List;

public class Results {
	private int id;
	private String ref;
	private String name;
	private int calories;
	private List<String> extras;
	private String photo;
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public Results(int id, String ref, String name, int calories, List<String> extras) {
		this.id = id;
		this.ref = ref;
		this.name = name;
		this.calories = calories;
		this.extras = extras;
	}
	public Results() {
	}
	
	
}
