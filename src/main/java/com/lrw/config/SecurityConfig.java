/*package com.lrw.config;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder () {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private AuthenticationSuccessHandler myAuthenticationSuccessHandler;

    @Autowired
    private AuthenticationFailureHandler myAuthenctiationFailureHandler;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public PersistentTokenRepository persistentTokenRepository () {
        JdbcTokenRepositoryImpl tokenRepositoryImpl = new JdbcTokenRepositoryImpl();
        tokenRepositoryImpl.setDataSource(dataSource);
        // 启动时自动创建表   如果数据库有该表，再设置为true，启动会报错
//      tokenRepositoryImpl.setCreateTableOnStartup(true);
        return tokenRepositoryImpl;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        ValidateCodeFilter validateCodeFilter = new ValidateCodeFilter();
        validateCodeFilter.setAuthenctiationFailureHandler(myAuthenctiationFailureHandler);

        http.addFilterBefore(validateCodeFilter, UsernamePasswordAuthenticationFilter.class)
            .formLogin()// 表单登录  来身份认证
                .loginPage("/authentication/require")// 自定义登录页面
                .loginProcessingUrl("/authentication/form")// 自定义登录路径
                .successHandler(myAuthenticationSuccessHandler)
                .failureHandler(myAuthenctiationFailureHandler)
                .and()
            .rememberMe()
                .tokenRepository(persistentTokenRepository())
                // 失效时间
                .tokenValiditySeconds(3600)
                .userDetailsService(userDetailsService)
            .and()
            .authorizeRequests()// 对请求授权
            // error  127.0.0.1  将您重定向的次数过多
            .antMatchers("/myLogin.html", "/authentication/require",
                    "/authentication/form","/code/image").permitAll()// 这些页面不需要身份认证,其他请求需要认证
            .anyRequest() // 任何请求
            .authenticated()//; // 都需要身份认证
            .and()
            .csrf().disable();// 禁用跨站攻击
    }

}
*/