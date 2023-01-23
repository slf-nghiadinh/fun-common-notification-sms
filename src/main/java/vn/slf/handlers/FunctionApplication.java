package vn.slf.handlers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.slf.functions.SMSFunction;
import vn.slf.models.SMSRequest;
import vn.slf.models.SMSResponse;

import java.util.function.Function;

@SpringBootApplication(scanBasePackages = {"com.slf"})
public class FunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunctionApplication.class, args);
    }

    @Bean
    public Function<SMSRequest, SMSResponse> handle() {
        return new SMSFunction();
    }
}
