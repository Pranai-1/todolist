package com.pranai.example.practiceweb1.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String name,String password) {
		boolean a=name.equalsIgnoreCase("pranai");
		boolean b=password.equalsIgnoreCase("reddy");
        return a && b;
	}
}
