import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JasyptSample {

    @Value("${db.password}")
    private String dbPassword;

    public static void main(String[] args) {
        SpringApplication.run(YourApplication.class, args);
    }
    
    // Use the dbPassword in your application
}
