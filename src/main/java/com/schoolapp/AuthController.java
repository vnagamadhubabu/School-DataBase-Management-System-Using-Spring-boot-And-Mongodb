package com.schoolapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AuthController {
	
	Logger log = LoggerFactory.getLogger(AuthController.class);
	
	 private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

	    private final TokenService tokenService;

	    public AuthController(TokenService tokenService) {
	        this.tokenService = tokenService;
	    }

	    @PostMapping("/login")
	    public String token(Authentication authentication) {
	    	log.debug("Login using user credentials for the JSON Web Token");
	        LOG.debug("Token requested for user ", authentication.getName());
	        String token = tokenService.generateToken(authentication);
	        LOG.debug("Token granted ", token);
	        return token;
	    }
	    

}
