package com.chainsys.jobportal.validator;

import com.chainsys.jobportal.model.Register;

public class RegisterValidator {
	public void registerValidator(Register register) throws Exception {
		if (register.getName() == "null") {
			throw new Exception("INVALID NAME");
		}
		int length=String.valueOf(register.getPhonenumber()).length();
		if (length != 10) {
			throw new Exception(
					"INVALID PHONE NUMBER. PHONE NUMBER MUST BE 10 DIGITS");
		}
		if (register.getEmail() == null) {
			throw new Exception("INVALID EMAILID");
		}
		if (register.getPassword() == null) {
			throw new Exception("INVALID PASSWORD");
		}
		if (register.getDeptname() == null) {
			throw new Exception("INVALID DEPARTMENT NAME");
		}

	}

}
