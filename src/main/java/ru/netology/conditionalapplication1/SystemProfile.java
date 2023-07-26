package ru.netology.conditionalapplication1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import ru.netology.conditionalapplication1.config.JavaConfig;

@ConditionalOnBean(JavaConfig.class)
@Component
public interface SystemProfile {
    String getProfile();
}