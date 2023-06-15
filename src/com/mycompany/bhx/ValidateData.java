/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bhx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author My PC
 */
public class ValidateData {
    public static boolean validateEmail(String s) {
        String emailRegex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern patternEmail = Pattern.compile(emailRegex);
        Matcher matcherEmail = patternEmail.matcher(s);
        if(matcherEmail.find()) {
            return true;
        }
        return false;
    }
    public static boolean validatePhone(String s) {
        String phoneNumberRegex = "^(\\\\+?84|0)(3[2-9]|5[6|8|9]|7[0|6-9]|8[1-6|8-9]|9[0-9])([0-9]{7})$";
        Pattern patternPhone = Pattern.compile(phoneNumberRegex);
        Matcher matcherPhone = patternPhone.matcher(s);
        if(matcherPhone.matches()) {
            return true;
        }
        return false;
    }
    public static boolean validatePassword(String s) {
        if(s.length() > 6)
            return true;
        return false;
    }
}
