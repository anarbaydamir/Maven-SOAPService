/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.ws.services;

import com.apple.ws.User;

/**
 *
 * @author qwant
 */
public class Main {
    public static void main(String[] args){
       User user = EducationServiceClient.getUser("Anar");
       
       System.out.println("found: "+ user.getName());
    }
}
