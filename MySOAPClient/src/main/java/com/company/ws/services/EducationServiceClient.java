/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.ws.services;

import com.apple.ws.EducationService;
import com.apple.ws.EducationService_Service;
import com.apple.ws.User;

/**
 *
 * @author qwant
 */
public class EducationServiceClient {

    public static User getUser(String name){
            EducationService_Service service = new EducationService_Service();
            EducationService port = service.getEducationServicePort();
            // TODO initialize WS operation arguments here
            String sendingName = name;
            // TODO process result here
            User result = port.getUser(sendingName);
            System.out.println("Result = "+result);
            
            return result;
    }

}
