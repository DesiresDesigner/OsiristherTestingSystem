package ru.osiristher.web.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by DesiresDesigner on 3/15/15.
 */
public class LifeRayToken extends AbstractAuthenticationToken {
    public LifeRayToken(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }



    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
