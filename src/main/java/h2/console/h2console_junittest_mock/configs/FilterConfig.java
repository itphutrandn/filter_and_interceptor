package h2.console.h2console_junittest_mock.configs;

import h2.console.h2console_junittest_mock.filters.BeforeRequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<BeforeRequestFilter> loggingFilter(){
        FilterRegistrationBean<BeforeRequestFilter> registrationBean
                = new FilterRegistrationBean<>();
        registrationBean.setFilter(new BeforeRequestFilter());
        registrationBean.addUrlPatterns("/student/*");
        return registrationBean;
    }
}
