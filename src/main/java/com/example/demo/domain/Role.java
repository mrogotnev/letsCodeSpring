package com.example.demo.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority { //интерфейс предостовления полномочий
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
