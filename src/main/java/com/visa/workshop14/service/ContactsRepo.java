package com.visa.workshop14.service;

import com.visa.workshop14.model.Contact;

public interface ContactsRepo {
    
    public void save(final Contact ctc);
    public Contact findById(final String contactId);
}
