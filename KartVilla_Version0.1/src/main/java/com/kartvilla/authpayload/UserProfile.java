package com.kartvilla.authpayload;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserProfile {
    private Long id;
    private String username;
    private String name;
    private Instant joinedAt;
}
