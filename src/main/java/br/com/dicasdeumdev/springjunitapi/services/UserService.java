package br.com.dicasdeumdev.springjunitapi.services;

import br.com.dicasdeumdev.springjunitapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
