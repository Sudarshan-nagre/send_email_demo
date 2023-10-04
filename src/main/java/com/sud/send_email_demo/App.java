package com.sud.send_email_demo;

import com.sud.send_email_demo.model.SendMailModel;
import com.sud.send_email_demo.service.SendEmailThroughGmail;

public class App 
{
    public static void main( String[] args )
    {
    	SendMailModel mail = new SendMailModel();
    	mail.setFromEmail("From emailId");
    	//for password use the app password of your gmail account
    	//to get app password refer - https://support.google.com/accounts/answer/185833?visit_id=21696398027537-6035459352128835562&p=InvalidSecondFactor&rd=1
    	mail.setPassword("Use Base64 encoded app password(16digit) here");
    	mail.setToMailId("Sender EmailId");
    	mail.setSubject("Testing ....");
    	mail.setBody("This is testing mail from java client..");
    	
    	SendEmailThroughGmail.sendEmail(mail);
    }
}
