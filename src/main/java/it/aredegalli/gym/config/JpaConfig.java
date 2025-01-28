package it.aredegalli.gym.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "it.aredegalli.gym.repository",
        entityManagerFactoryRef = "gymEntityManagerFactory",
        transactionManagerRef = "gymTransactionManager"
)
public class JpaConfig {

    @Primary
    @Bean(name = "gymEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean gymEntityManagerFactory(
            @Qualifier("gymDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setPackagesToScan("it.aredegalli.gym.model");
        factoryBean.setPersistenceUnitName("gymPersistenceUnit");
        factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return factoryBean;
    }

    @Primary
    @Bean(name = "gymTransactionManager")
    public JpaTransactionManager gymTransactionManager(
            @Qualifier("gymEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}

