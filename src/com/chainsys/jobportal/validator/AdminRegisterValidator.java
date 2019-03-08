package com.chainsys.jobportal.validator;

import com.chainsys.jobportal.exception.AdminEmailException;
import com.chainsys.jobportal.exception.AdminIdException;
import com.chainsys.jobportal.exception.AdminNameException;
import com.chainsys.jobportal.exception.AdminNumberException;
import com.chainsys.jobportal.exception.AdminPasswordException;
import com.chainsys.jobportal.model.AdminRegistration;

public class AdminRegisterValidator {
	public void registerValidator(AdminRegistration adminregistration)
			throws Exception {
		if (adminregistration.getAdminId() == 0) {
			throw new AdminIdException("INVALID ID.ID DOES NOT SUPPORT 0");
		}
		if (adminregistration.getAdminName() != "null") {
			throw new AdminNameException("INVALID NAME");
		}
		if (adminregistration.getEmailId() != "null") {
			throw new AdminEmailException("INVALID email");
		}
		int length=String.valueOf(adminregistration.getPhoneNumber()).length();
		if (length != 10) {
			throw new AdminNumberException(
					"INVALID PHONE NUMBER. PHONE NUMBER MUST BE 10 DIGITS");
		}
		if (adminregistration.getPassword() == null) {
			throw new AdminPasswordException("INVALID NAME");
		}

	}

	private java.lang.String Long(long phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	/*private String String(long phonenumber) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
