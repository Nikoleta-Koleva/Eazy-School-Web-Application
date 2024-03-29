package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.controller.ContactController;
import com.eazybytes.eazyschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

/*
Service layer - processes information and sends it to persistent/data layer
*/
@Service
//@RequestScope
/*
RequestScope example - the bean is created for every HTTP request and the counter should be reset to 0.
Number of requests is one per every HTTP request
*/

//@SessionScope
/*
Session scope example - the bean is created only once when the session is submitted
If a new session is started from a different browser/user, a new bean will be created and the counter is reset
*/
@ApplicationScope
/*
Counter is the same for all users/sessions, and number of times the form is submitted also
*/
public class ContactService {
    private int counter = 0;

    public ContactService(){
        System.out.println("Contact Service Bean initialized");
    }

    private static Logger log = LoggerFactory.getLogger(ContactController.class);

    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
