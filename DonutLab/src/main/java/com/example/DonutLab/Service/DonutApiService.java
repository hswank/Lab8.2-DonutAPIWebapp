package com.example.DonutLab.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.DonutLab.Model.DonutResponse;
import com.example.DonutLab.Model.Results;

@Service
public class DonutApiService {

	private RestTemplate request = new RestTemplate();
	
	public List<Results> getDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = request.getForObject(url, DonutResponse.class);
		
		return response.getResults();
	}
	
	public Results getDonut(int id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{0}.json";
		Results response = request.getForObject(url, Results.class, id);
		
		return response;
	}
}
