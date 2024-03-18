package my.home.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "my.home.services")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
