package com.kartvilla.authpayload;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class JWTAuthenticationResponse {
	private String accessToken;
    private String tokenType = "Bearer";
    
    public JWTAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
