package com.hotel.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class LoginRequest {

	private String email;
	private String password;
}
