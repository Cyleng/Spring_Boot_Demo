package cyleng.me.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication
public class DemoApplication {

	public static void test() throws FileNotFoundException{
		try{
			throw new FileNotFoundException();
		} finally{

		}

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
