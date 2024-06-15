package com.outdoor_order.service;

import com.outdoor_order.dto.EmployeeLoginDTO;
import com.outdoor_order.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
