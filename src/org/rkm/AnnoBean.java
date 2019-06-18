package org.rkm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoBean {
    @Bean(name = "one")
    public AnnoDemo getBean(){
        return new AnnoDemo();
    }
}
