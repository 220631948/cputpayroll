package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory {
    public static Contact buildContact (String email, String mobile, String linkedProfile){
        // check if valid email - regex or apache commons
        if (!Helper.isValidEmail(email))
            return null;
        if (Helper.isNullorEmpty(mobile) ||
            Helper.isNullorEmpty(linkedProfile))
            return null;

        return new Contact.Builder().setEmail(email)
                .setMobile(mobile)
                .setLinkedInProfile(linkedProfile)
                .build();
    }



}
