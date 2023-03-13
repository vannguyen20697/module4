package demo.vn.config;


import demo.vn.repository.StudentRepository;
import demo.vn.repository.StudentRepositoryImpl;
import demo.vn.service.StudentService;
import demo.vn.service.StudentServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("demo.vn")
public class AppConfiguration extends WebMvcConfigurerAdapter implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/view/");
        bean.setSuffix(".jsp");
        return bean;
    }

//    @Bean
//    public StudentRepository getStudentRepository() {
//        return new StudentRepositoryImpl();
//    }
//
//    @Bean
//    public StudentService getStudentService() {
//        StudentServiceImpl service = new StudentServiceImpl();
//        service.setStudentRepository(this.applicationContext.getBean(StudentRepository.class));
//        return service;
//    }
}
