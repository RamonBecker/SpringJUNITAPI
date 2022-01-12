package br.com.dicasdeumdev.springjunitapi.services;

import br.com.dicasdeumdev.springjunitapi.domain.User;
import br.com.dicasdeumdev.springjunitapi.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
