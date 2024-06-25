package com.sun.user.dto;

import com.sun.user.validator.PasswordMatches;
import com.sun.user.validator.ValidEmail;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@PasswordMatches

public class UserDTO {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String password;
    private String matchingPassword;


    @ValidEmail
    @NotNull
    @NotEmpty
    private String emailId;
}
