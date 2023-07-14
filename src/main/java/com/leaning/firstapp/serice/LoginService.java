package com.leaning.firstapp.serice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// in28minutes, dummy
		return userid.equalsIgnoreCase("shubham")
				&& password.equalsIgnoreCase("1234");
	}

}
