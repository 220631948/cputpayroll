package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer buildCustomer(String customerId, String firstName, String lastName, Contact contact){
        if (Helper.isNullorEmpty(customerId) ||
            Helper.isNullorEmpty(firstName) ||
            Helper.isNullorEmpty(lastName) ||
            contact == null)
            return null;

        return new Customer.Builder().setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setContact(contact)
                .build();

    }

    public static Customer buildCustomer(String customerId, String firstName, String lastName, String email, String mobile, String linkedInProfile){
        if (Helper.isNullorEmpty(customerId) ||
            Helper.isNullorEmpty(firstName) ||
            Helper.isNullorEmpty(lastName))
            return null;

        if (!Helper.isValidEmail(email))
            return null;
        if(Helper.isNullorEmpty(mobile) || Helper.isNullorEmpty(linkedInProfile))
            return null;

        Contact contact = ContactFactory.buildContact(email, mobile, linkedInProfile);

        return new Customer.Builder().setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setContact(contact)
                .build();
    }

}
