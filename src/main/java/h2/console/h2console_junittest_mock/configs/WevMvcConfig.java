package h2.console.h2console_junittest_mock.configs;

import h2.console.h2console_junittest_mock.interceptors.AdminInterceptor;
import h2.console.h2console_junittest_mock.interceptors.LogInterceptor;
import h2.console.h2console_junittest_mock.interceptors.OldLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WevMvcConfig  implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AdminInterceptor())//
                .addPathPatterns("/student/*")//
                .excludePathPatterns("/student/edit");

        registry.addInterceptor(new LogInterceptor());
        registry.addInterceptor(new OldLoginInterceptor()).addPathPatterns("/student/list");
    }
}
