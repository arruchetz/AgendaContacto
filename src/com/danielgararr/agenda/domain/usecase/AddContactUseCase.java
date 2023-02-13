package com.danielgararr.agenda.domain.usecase;

import com.danielgararr.agenda.domain.models.Contact;
import com.danielgararr.agenda.domain.models.ContactRepository;

public class AddContactUseCase {

    private ContactRepository contactRepository;

    public AddContactUseCase(ContactRepository contactRepository) {
        this.contactRepository=contactRepository;
    }

    public void execute(Contact contact){

    }
}
