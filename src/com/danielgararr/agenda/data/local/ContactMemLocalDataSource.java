package com.danielgararr.agenda.data.local;

import com.danielgararr.agenda.domain.models.Contact;

import java.util.Map;
import java.util.TreeMap;

public class ContactMemLocalDataSource {

    private static ContactMemLocalDataSource instance = null;

    private Map<Integer, Contact> storage = new TreeMap<>();

    private ContactMemLocalDataSource(){

    }

    public static ContactMemLocalDataSource getInstance() {
        if(instance==null) {

        }
    }
}
