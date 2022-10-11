package com.parameta.api.web.service;

import com.parameta.api.client.EmployeeResponse;
import com.parameta.api.dto.EmployeeDTO;
import com.parameta.api.exception.ParametaAppException;

public interface IIntegrationBridgeService {

    /**
     * Create an Employee
     *
     * @throws ParametaAppException
     */
    EmployeeResponse createEmployee(EmployeeDTO employeeDTO) throws ParametaAppException;

}
