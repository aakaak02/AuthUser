package com.careerit.cbook.auth.controller;

import com.careerit.cbook.auth.dto.AppUserDTO;
import com.careerit.cbook.auth.service.AppUserService;
import com.careerit.cbook.dto.ContactDTO;
import com.careerit.cbook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appuser")
public class AuthController {
    @Autowired
    private AppUserService appUserService;

    @PostMapping("/register")
    public ResponseEntity<AppUserDTO> registerUser(@RequestBody AppUserDTO appUserDTO) {
        AppUserDTO newUser = appUserService.registerUser(appUserDTO);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping("/{username}/contact")
    public ResponseEntity<AppUserDTO> getContactById(@PathVariable String username) {
        AppUserDTO appUserDTO = appUserService.findByUsername(username);
        return ResponseEntity.ok(appUserDTO);
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Welcome to Contact Book Spring Boot Application");
    }


}
