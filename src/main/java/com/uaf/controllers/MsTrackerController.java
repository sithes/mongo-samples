package com.uaf.controllers;

import com.uaf.models.*;
import com.uaf.payload.response.MessageResponse;
import com.uaf.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/mstracker")
public class MsTrackerController {

	@Autowired
	MsTrackerRepository msTrackerRepository;

	@PostMapping("/register")
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> registerMS(@Valid @RequestBody MsTracker msTracker) {
		if (msTrackerRepository.existsByMsName(msTracker.getMsName())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: MS is already Registered!"));
		}

        msTracker.setFtStatus("NOT_STARTED");
        msTracker.setProfStatus("NOT_INITIATED");
        msTracker.setBcStatus("NOT_STARTED");
        msTracker.setPtStatus("NOT_STARTED");
        msTracker.setGcStatus("NOT_STARTED");
		msTracker.setCreatedOn(LocalDateTime.now());
        msTracker.setModifiedOn(LocalDateTime.now());

        msTrackerRepository.save(msTracker);

		return ResponseEntity.ok(new MessageResponse("Microservice registered successfully!"));
	}

	@GetMapping("/profrequired")
	public String profRequired(@Valid @RequestParam String msName) {
        System.out.println(msName);
		Optional<MsTracker> msTracker =  msTrackerRepository.findByMsName(msName);
		if (msTracker.isPresent())
            return msTracker.get().getIsProfReq();
		else
			return "No";

	}

    @GetMapping("/mstracker")
    public ResponseEntity<?> listAll() {

        return ResponseEntity.ok(msTrackerRepository.findAll());
    }


}
