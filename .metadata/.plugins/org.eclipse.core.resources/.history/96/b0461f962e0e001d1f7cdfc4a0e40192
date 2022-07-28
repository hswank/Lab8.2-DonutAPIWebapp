package com.example.DonutLab.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutResponse {
	private int count;
	@JsonProperty("results")
	private List<Results> results;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Results> getResults() {
		return results;
	}
	public void setResults(List<Results> results) {
		this.results = results;
	}
	public DonutResponse(int count, List<Results> results) {
		this.count = count;
		this.results = results;
	}
	public DonutResponse() {
	}
}
