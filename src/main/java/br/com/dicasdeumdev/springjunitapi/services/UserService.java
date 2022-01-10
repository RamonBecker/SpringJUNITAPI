package br.com.dicasdeumdev.springjunitapi.services;

import br.com.dicasdeumdev.springjunitapi.domain.User;

public interface UserService {

    User findById(Integer id);
}
