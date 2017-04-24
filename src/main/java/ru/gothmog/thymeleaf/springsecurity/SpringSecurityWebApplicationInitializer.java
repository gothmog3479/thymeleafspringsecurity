package ru.gothmog.thymeleaf.springsecurity;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author gothmog on 24.04.2017.
 */
@Order(2)
public class SpringSecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public SpringSecurityWebApplicationInitializer() {
        super();
    }

    // Nothing else to implement. We will just use the defaults.
    // The extended initializer class will take care of registering the Spring Security filter infrastructure.

}
