package com.cjie;
/**
 * Created by hucj on 2017/9/18.
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }

}
