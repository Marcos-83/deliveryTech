package com.deliverytech.delivery_api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    @NotBlank(message = "UserName é obrigadotório")
    private String Username;

    @NotBlank(message = "Password é obrigatória")
    private String password;

}