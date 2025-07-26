package com.hyth.ocpi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TokenDto {
    private String uid;
    private String type;
    private String contractId;
    private String issuer;
    private boolean valid;
    private String visualNumber;
}
