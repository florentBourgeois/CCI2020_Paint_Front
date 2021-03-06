package fr.cci.formationobjet.java.PaintFront.proxy;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.cci.formationobjet.java.PaintFront.beans.HumanBean;


@FeignClient(name = "microservice-paint-back", url="localhost:9090")
public interface MicroservicePaintBackProxy {

	
	@GetMapping(value= "/humans")
	public List<HumanBean> getHumans();
	
	
	@GetMapping(value= "/humans/{id}")
	public HumanBean getOneHuman(@PathVariable(name= "id") int id);
	
	/*
	@PostMapping(value= "/humans")
	public HumanBean postHumans(@RequestBody HumanBean h);
	
	
	@DeleteMapping(value= "/humans/{id}")
	public ResponseEntity<HumanBean> delHuman(@PathVariable int id);
	*/
	
	
}
