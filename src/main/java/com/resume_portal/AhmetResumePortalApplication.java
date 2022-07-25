package com.resume_portal;

import com.resume_portal.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class AhmetResumePortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(AhmetResumePortalApplication.class, args);
    }

}
