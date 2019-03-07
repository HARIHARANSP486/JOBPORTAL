package com.chainsys.jobportal.validator;

import com.chainsys.jobportal.model.AdminRegistration;

public class AdminRegisterValidator {
	public void registerValidator(AdminRegistration adminregistration)
			throws Exception {
		if (adminregistration.getAdminId() == 0) {
			throw new Exception("INVALID NAME");
		}
		if (adminregistration.getAdminName() == "null") {
			throw new Exception("INVALID NAME");
		}
		if (adminregistration.getEmailId() == null) {
			throw new Exception("INVALID email");
		}
		if (Long(adminregistration.getPhoneNumber()).length() != 10) {
			throw new Exception(
					"INVALID PHONE NUMBER. PHONE NUMBER MUST BE 10 DIGITS");
		}
		if (adminregistration.getPassword() == null) {
			throw new Exception("INVALID NAME");
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
