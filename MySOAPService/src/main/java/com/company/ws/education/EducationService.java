/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.ws.education;

import com.company.ws.education.bean.User;
import java.util.Arrays;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author qwant
 */
@WebService(serviceName = "EducationService")
public class EducationService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getUser")
    public User getUser (@WebParam(name="name") String name) {
        return new User(1,name,null);
    }
    
    @WebMethod(operationName="getAllUser")
    public List<User> getAllUser(@WebParam(name="name") String name,@WebParam(name="surname") String surname){
        return Arrays.asList(new User(1,name,surname),new User(2,name,surname));
    }
}
