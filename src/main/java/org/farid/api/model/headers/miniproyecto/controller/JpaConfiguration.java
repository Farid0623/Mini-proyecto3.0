package org.farid.api.model.headers.miniproyecto.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "co.edu.co.proyecto_spring.repository")
public class JpaConfiguration {
}
