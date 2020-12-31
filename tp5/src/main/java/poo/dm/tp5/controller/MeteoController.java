package poo.dm.tp5.controller;

import java.security.Policy.Parameters;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import poo.dm.tp5.model.OpenWeatherMap;
import poo.dm.tp5.model.Response;

@Controller
public class MeteoController {
	
	//@GetMappint("/meteo")
	
	
	@PostMapping("/meteo")
	
	public String meteoFunction(@RequestBody String address, Model model)
	{
		model.addAttribute("adresse", address);
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		Response resultat = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+address, Response.class);
		double x = resultat.getFeatures().get(0).getGeometryObject().getCoordinates().get(0);
		double y = resultat.getFeatures().get(0).getGeometryObject().getCoordinates().get(1);
		String key = "115a9df082c9aa903a16b4d508c544d9";
		OpenWeatherMap parameters = (OpenWeatherMap) restTemplate.getForObject("https://api.openweathermap.org/data/2.5/onecall?lat="
															+String.valueOf(x)+"&lon="+String.valueOf(y)
															+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si"
															+key, Parameters.class);
		
		model.addAttribute("adresse", resultat.getFeatures().get(0).getPropertiesObject().getContext());
		model.addAttribute("ville", resultat.getFeatures().get(0).getPropertiesObject().getCity());
		model.addAttribute("meteo", parameters);
		
		return "meteo";
	}
	
	
	

}
