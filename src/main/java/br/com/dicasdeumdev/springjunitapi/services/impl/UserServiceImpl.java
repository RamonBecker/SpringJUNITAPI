package br.com.dicasdeumdev.springjunitapi.services.impl;

import br.com.dicasdeumdev.springjunitapi.domain.User;
import br.com.dicasdeumdev.springjunitapi.repositories.UserRepository;
import br.com.dicasdeumdev.springjunitapi.services.UserService;
import br.com.dicasdeumdev.springjunitapi.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado!"));
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}

