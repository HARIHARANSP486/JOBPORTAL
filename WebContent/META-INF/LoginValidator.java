package com.chainsys.jobportal.validator;

import com.chainsys.jobportal.model.Register;

public class LoginValidator {
	public void loginValidator(Register register) throws Exception {
		if (register.getPhonenumber() == 10) {
			throw new Exception("Invalid Number");
		}
		if (register.getPassword() == "null") {
			throw new Exception("Invalid Password");
		}
}
}
