package com.levelup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {

	@RequestMapping(value = "/contacts", 
			produces = { MediaType.APPLICATION_JSON_VALUE }, 
			method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Contact>> getContacts() {

		List<Contact> contacts = getDummyContacts();

		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}
	
	@RequestMapping(value="/view", produces = {
			MediaType.TEXT_HTML_VALUE},  
			method = RequestMethod.GET)
	public String viewContacts () {
		return "contact-listing";
	}
	
	
	public List<Contact> getDummyContacts() {
		
		Contact contact1 = new Contact("Joe", "202-555-0105", "joe@gmail.com");
		Contact contact2 = new Contact("Jenny", "515-876-5309", "jenny@gmail.com");
		Contact contact3 = new Contact("Brit", "515-555-0127", "brit@gmail.com");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(contact3);
		
		return contacts;
		
	}
	
	
	
	
	
	

}
