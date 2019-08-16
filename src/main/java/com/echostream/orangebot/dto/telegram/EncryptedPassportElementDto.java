package com.echostream.orangebot.dto.telegram;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class EncryptedPassportElementDto {

    @NotNull
    @ApiModelProperty("Element type. One of “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport”, “address”, “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”, “phone_number”, “email”.")
    private String type;

    @ApiModelProperty("Base64-encoded encrypted Telegram Passport element data provided by the user, available for “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport” and “address” types. Can be decrypted and verified using the accompanying EncryptedCredentials.")
    private String data;

    @ApiModelProperty("User's verified phone number, available only for “phone_number” type")
    private String phoneNumber;

    @ApiModelProperty("User's verified email address, available only for “email” type")
    private String email;

    @ApiModelProperty("Array of encrypted files with documents provided by the user, available for “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration” and “temporary_registration” types. Files can be decrypted and verified using the accompanying EncryptedCredentials.")
    private List<PassportFileDto> files;

    @ApiModelProperty("Encrypted file with the front side of the document, provided by the user. Available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.")
    private PassportFileDto frontSide;

    @ApiModelProperty("Encrypted file with the reverse side of the document, provided by the user. Available for “driver_license” and “identity_card”. The file can be decrypted and verified using the accompanying EncryptedCredentials.")
    private PassportFileDto reverseSide;

    @ApiModelProperty("Encrypted file with the selfie of the user holding a document, provided by the user; available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.")
    private PassportFileDto selfie;

    @ApiModelProperty("Array of encrypted files with translated versions of documents provided by the user. Available if requested for “passport”, “driver_license”, “identity_card”, “internal_passport”, “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration” and “temporary_registration” types. Files can be decrypted and verified using the accompanying EncryptedCredentials.")
    private List<PassportFileDto> translation;

    @NotNull
    @ApiModelProperty("Base64-encoded element hash for using in PassportElementErrorUnspecified")
    private String hash;

}
