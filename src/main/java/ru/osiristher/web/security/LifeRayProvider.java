package ru.osiristher.web.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DesiresDesigner on 3/15/15.
 */
@Component
public class LifeRayProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        // Проверка на существование / правильный пароль
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new LifeRayToken(grantedAuths);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        boolean status = false;
        if(aClass.equals(LifeRayToken.class))
            status = true;

        return status;
    }
}
