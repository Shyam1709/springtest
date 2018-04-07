package com.wedding.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.model.MehndiCeremony;
import com.wedding.repository.MehndiRepository;

@RestController
@RequestMapping("/wedding")
public class MehndiCeremonyController {
	private MehndiRepository mehndiRepository;

	public MehndiCeremonyController(MehndiRepository mehndiRepository) {
		this.mehndiRepository = mehndiRepository;
	}

	// To get data from mongodb repository
	@RequestMapping(value = "/getmehndi", method = RequestMethod.GET)
	public List<MehndiCeremony> getAll() {
		return mehndiRepository.findAll();
	}

	// To save data in the mongodb repository
	@RequestMapping(value = "/mehndi", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateExist(@RequestBody MehndiCeremony mehndiCeremony) {
		try {
			mehndiRepository.save(mehndiCeremony);
			return new ResponseEntity<String>("Saved", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error", HttpStatus.BAD_REQUEST);
		}

	}

}
