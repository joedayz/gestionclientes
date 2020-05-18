package pe.joedayz.clientes.crypto.bcrypt;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderMain {

	private static final Logger logger = LoggerFactory
			.getLogger(BCryptPasswordEncoderMain.class);

	public static String encode(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
		String encodedPassword = encoder.encode(password);
		return encodedPassword;
	}


	public static void main(String[] args) {
		String[] passwords = {"123"};

		if (args.length == 1) {
			logger.info(encode(args[0]));
		}
		else {
			logger.info("Encoding passwords: {}", Arrays.toString(passwords));
			for(String psswd: passwords){
				logger.info("{}: [{}]", psswd, encode(psswd));
			}
		}
	}

}