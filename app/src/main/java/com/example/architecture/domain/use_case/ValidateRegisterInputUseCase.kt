package com.example.architecture.domain.use_case

import com.example.architecture.domain.model.RegisterInputValidationType
import com.example.architecture.utils.containsNumber
import com.example.architecture.utils.containsSpecialChar
import com.example.architecture.utils.containsUpperCase

class ValidateRegisterInputUseCase {
    operator fun invoke(
        email: String,
        password: String,
        passwordRepeated: String
    ): RegisterInputValidationType {
        if (email.isEmpty() || password.isEmpty() || passwordRepeated.isEmpty()) {
            return RegisterInputValidationType.EmptyField
        }
        if ("@" !in email) {
            return RegisterInputValidationType.NoEmail
        }
        if (password!= passwordRepeated) {
            return RegisterInputValidationType.PasswordsDoNotMatch
        }
        if (password.count() < 8) {
            return RegisterInputValidationType.PasswordTooShort
        }
        if (!password.containsNumber()) {
            return RegisterInputValidationType.PasswordNumberMissing
        }
        if (!password.containsUpperCase()) {
            return RegisterInputValidationType.PasswordUpperCaseMissing
        }
        if (!password.containsSpecialChar()) {
            return RegisterInputValidationType.PasswordSpecialCharMissing
        }
        return RegisterInputValidationType.Valid
    }
}