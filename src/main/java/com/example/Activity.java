package com.example;

import com.example.beans.DeploymentStats;
import com.example.beans.Deployments;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration
public class Activity {

    @RequestMapping("/")
    public DeploymentStats getDeployments() {
        RestTemplate restTemplate = new RestTemplate();
        Deployments deployments = restTemplate.getForObject("http://localhost/deployment.json", Deployments.class);

        DeploymentStats stats = new DeploymentStats();
        stats.setDeploymentCount(deployments.getData().size());

        return stats;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Activity.class, args);
    }

}