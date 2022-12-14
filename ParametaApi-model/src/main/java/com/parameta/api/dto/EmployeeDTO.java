package com.parameta.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    @ApiModelProperty(value = "Names", dataType = "String", example = "Juan")
    @NotNull(message = "Los nombres son obligatorios")
    private String names;

    @ApiModelProperty(value = "Last Names", dataType = "String", example = "Figueroa")
    @NotNull(message = "Los apellidos son obligatorios")
    private String lastName;

    @ApiModelProperty(value = "Document Type", dataType = "String", example = "Cedula")
    @NotNull(message = "El tipo de documento es obligatorio")
    private DocumentType documentType;

    @ApiModelProperty(value = "Document number", dataType = "String", example = "1075")
    @NotNull(message = "El número de documento es obligatorio")
    private String documentNumber;


    @ApiModelProperty(value = "Date of birth", dataType = "String", example = "YYYY-MM-DD")
    @NotNull(message = "LA fecha de nacimiento es obligatoria")
    private String dateOfBirth;


    @ApiModelProperty(value = "Hiring date", dataType = "String", example = "YYYY-MM-DD")
    @NotNull(message = "La fecha de contratación es obligatoria")
    private String hiringDate;

    @ApiModelProperty(value = "Hiring date", dataType = "com.parameta.api.dto.PositionRoleType")
    @NotNull(message = "El cargo es obligatorio")
    private PositionRoleType positionRoleType;

    @ApiModelProperty(value = "Salary", dataType = "Double", example = "1000")
    @NotNull(message = "El salario es obligatorio")
    private Double salary;

}
