package telas;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail {

	public static void main(String [] args) {
	
		String meuEmail = "samukaluka2003@gmail.com";
		String minhaSenha = "k g f w f c y r h t m k v n y n";
		
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
		email.setSSLOnConnect(true);
		
		try {
			email.setFrom(meuEmail);
			email.setSubject("Deseja obter mais informações?");
			email.setMsg("Caro usuário, informamos que este e-mail é confidencial e suas informações estão seguras conosco.");
			email.addTo(meuEmail);
			email.send();
		}catch(Exception ei) {
			ei.printStackTrace();
		}
		
	}
	
	
}
