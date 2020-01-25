package com.jay.oauth.domian;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author jay
 * @date 2020/1/11 22:17
 */
public class User implements UserDetails {

    private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    public User() {
    }

    public User(String username, String password,List<GrantedAuthority> grantedAuthorities) {
        this.username = username;
        this.password = password;
        this.authorities = grantedAuthorities;
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
