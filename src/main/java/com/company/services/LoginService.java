/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.services;

import com.company.dao.MemberDetailsDao;
import com.company.dto.MemberDetails;

/**
 *
 * @author Anumey
 */
public class LoginService {
    
    
    public boolean authenticateUsers(String password,int userId){
        boolean authResult = false;
        MemberDetailsDao memberDetailsDao = new MemberDetailsDao();
        MemberDetails memberDetails = memberDetailsDao.getMemberDetais(userId);
        if (memberDetails != null) {
            if (memberDetails.getPassword().equals(password)) {
                authResult = true;
            }
        }
        
        return authResult;
    }
}
