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
        // ����ʱ�Զ�������   ������ݿ��иñ�������Ϊtrue�������ᱨ��
//      tokenRepositoryImpl.setCreateTableOnStartup(true);
        return tokenRepositoryImpl;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        ValidateCodeFilter validateCodeFilter = new ValidateCodeFilter();
        validateCodeFilter.setAuthenctiationFailureHandler(myAuthenctiationFailureHandler);

        http.addFilterBefore(validateCodeFilter, UsernamePasswordAuthenticationFilter.class)
            .formLogin()// ����¼  �������֤
                .loginPage("/authentication/require")// �Զ����¼ҳ��
                .loginProcessingUrl("/authentication/form")// �Զ����¼·��
                .successHandler(myAuthenticationSuccessHandler)
                .failureHandler(myAuthenctiationFailureHandler)
                .and()
            .rememberMe()
                .tokenRepository(persistentTokenRepository())
                // ʧЧʱ��
                .tokenValiditySeconds(3600)
                .userDetailsService(userDetailsService)
            .and()
            .authorizeRequests()// ��������Ȩ
            // error  127.0.0.1  �����ض���Ĵ�������
            .antMatchers("/myLogin.html", "/authentication/require",
                    "/authentication/form","/code/image").permitAll()// ��Щҳ�治��Ҫ�����֤,����������Ҫ��֤
            .anyRequest() // �κ�����
            .authenticated()//; // ����Ҫ�����֤
            .and()
            .csrf().disable();// ���ÿ�վ����
    }

}
*/