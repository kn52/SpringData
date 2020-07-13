package com.rabbitmq.util;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class JPAUtil {
    private static final String PERSISTENCE_UNIT_NAME = "STUDENT";
    private static EntityManagerFactory factory;

    public EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }

    public void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}
