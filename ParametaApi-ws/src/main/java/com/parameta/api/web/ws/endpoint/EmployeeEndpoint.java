package com.parameta.api.web.ws.endpoint;

import com.parameta.api.dto.DocumentType;
import com.parameta.api.dto.EmployeeDTO;
import com.parameta.api.dto.PositionRoleType;
import com.parameta.api.exception.ParametaAppException;
import com.parameta.api.service.IEmployeeService;
import com.parameta.api.web.ws.dto.EmployeeRequest;
import com.parameta.api.web.ws.dto.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

@Endpoint
public class EmployeeEndpoint {

    private static final String NAMESPACE = "http://www.parameta.com/api/web/ws/dto";

    @Autowired
    private IEmployeeService iEmployeeService;

    private Period periodo;

    /**
     * Endopoint para registrar un empleado
     *
     * @param request
     * @return
     */
    @PayloadRoot(namespace = NAMESPACE, localPart = "EmployeeRequest")
    @ResponsePayload
    public EmployeeResponse createEmployee(@RequestPayload EmployeeRequest request) {
        EmployeeResponse em = new EmployeeResponse();
        try {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setDateOfBirth(request.getDateOfBirth());
            employeeDTO.setDocumentNumber(request.getDocumentNumber());
            employeeDTO.setDocumentType(DocumentType.CEDULA);
            employeeDTO.setPositionRoleType(PositionRoleType.DEVELOPER);
            employeeDTO.setHiringDate(request.getHiringDate());
            employeeDTO.setLastName(request.getLastName());
            employeeDTO.setNames(request.getNames());
            employeeDTO.setSalary(request.getSalary());
            iEmployeeService.createEmployee(employeeDTO);

            Period company = diffDate(request.getHiringDate());
            Period birthDay = diffDate(request.getDateOfBirth());

            em.setResultCode(1);
            em.setResultMsg("Se agrego el empleado correctamente");
            em.setResultBirthday(birthDay.getYears()+" años, "+birthDay.getMonths()+" meses, "+birthDay.getDays()+ " dias.");
            em.setResultCompany(company.getYears()+" años, "+company.getMonths()+" meses, "+company.getDays()+ " dias.");
        } catch (ParametaAppException e) {
            em.setResultCode(2);
            em.setResultMsg("Ocurrio un error persistiendo el empleado");
        }
        return em;
    }

    public Period diffDate(String date){
        LocalDate myDate = LocalDate.parse(date);
        LocalDate currentDate = LocalDate.now();
        periodo = Period.between(myDate, currentDate);
        return periodo;
    }
}