package com.ktdsuniversity.edu.extendsexam;

public class ContactMain {
	public static void main(String[] args) {
		
		Contact[] contactArray = new Contact[5];
		contactArray[0] = new Contact("민규", "010-4757-0218");
		contactArray[1] = new Contact("미연", "010-3193-8727");
		contactArray[2] = new Contact("용식", "010-4944-5119");
		contactArray[3] = new Contact("지영", "010-2360-0960");
		contactArray[4] = new EmailContact("김", "010-2360-0960", "kim@korea.com");
		
		for(int i=0; i<contactArray.length; i++) {
			
			contactArray[i].printContact();
			contactArray[i].phoneCall();
			
			if(contactArray[i] instanceof EmailContact) {
				//EmailContact is a Contact
				//Contact is not a EmailContact
				//is a 관계가 역전 되어 있는 경우, 명시적 형변환을 사용한다.
				EmailContact emailContactInstance = (EmailContact) contactArray[i];
				emailContactInstance.sendEmail();
			}
			
		}
		
		
		
	}

}
