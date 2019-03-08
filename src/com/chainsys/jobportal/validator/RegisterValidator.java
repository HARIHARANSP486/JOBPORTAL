package com.chainsys.jobportal.validator;

import com.chainsys.jobportal.exception.RegisterDepartmentException;
import com.chainsys.jobportal.exception.RegisterEmailException;
import com.chainsys.jobportal.exception.RegisterNameException;
import com.chainsys.jobportal.exception.RegisterNumberException;
import com.chainsys.jobportal.exception.RegsiterPasswordException;
import com.chainsys.jobportal.model.Register;

public class RegisterValidator {
	public void registerValidator(Register register) throws Exception{
		if (register.getName() != "null") {
			throw new RegisterNameException("INVALID NAME AND NAME NOT BE NULL");
		}
		int length=String.valueOf(register.getPhonenumber()).length();
		if (length != 10) {
			throw new RegisterNumberException(
					"INVALID PHONE NUMBER. PHONE NUMBER MUST BE 10 DIGITS");
		}
		if (register.getEmail() != "null") {
			throw new RegisterEmailException("INVALID EMAILID");
		}
		if (register.getPassword() == null) {
			throw new RegsiterPasswordException("INVALID PASSWORD");
		}
		if (register.getDeptname() != "null") {
			throw new RegisterDepartmentException("INVALID DEPARTMENT NAME");
		}

	}

}
