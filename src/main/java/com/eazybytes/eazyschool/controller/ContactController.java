package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    private static Logger log = LoggerFactory.getLogger(ContactController.class);

    /*
    Contact service bean into the ContactController bean with the help of autowiring mechanism
    Accepts the information from the front end using Pojo object
    */
    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String displayContactPage(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact.html";
    }

    //Business logic related to preliminary checks/validations
    @RequestMapping(value = "/saveMsg",method = POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors){
        if(errors.hasErrors()){
            log.error("Contact form validation failed due to : " + errors.toString());
            //Don't invoke the action, just display the contact.html
            return "contact.html";
        }
        contactService.saveMessageDetails(contact);
        contactService.setCounter(contactService.getCounter()+1);
        log.info("Number of times the Contact form is submitted : "+ contactService.getCounter());

        //Invoke the action again
        return "redirect:/contact";
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
