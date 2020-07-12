package mk.springframework.mkconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MkConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkConfigServerApplication.class, args);
	}

}
