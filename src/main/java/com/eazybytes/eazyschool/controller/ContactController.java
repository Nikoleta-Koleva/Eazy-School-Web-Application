package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/*
Contact controller is placed inside a different class due to its complexity
and information on submission
Request mapping maps a path to a method
*/
@Controller
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    //Business logic related to preliminary checks/validations
    @RequestMapping(value = "/saveMsg", method = POST)
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }

    /*
    @PostMapping can be used also instead of @RequestMapping
    @RequestParam helps bind the information from the UI to
    the backend server from the parameters inside the HTML file
    This code is not good as its repetitive (@RequestParam)

    log.info prints information in the console

    ModelAndView is a class in Spring MVC which sends model data and view information to the UI
        and redirects to contacts page showing a blank form
    */

    /*
    private static Logger log = LoggerFactory.getLogger(ContactController.class);

    @RequestMapping(value="/saveMsg", method = POST)
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
                                    @RequestParam String email, @RequestParam String subject,
                                    @RequestParam String message) {
        log.info("Name : " + name);
        log.info("Mobile Number : " + mobileNum);
        log.info("Email Address :" + email);
        log.info("Subject : " + subject);
        log.info("Message : " + message);

        return new ModelAndView("redirect:/contact");
    }
    */
}
