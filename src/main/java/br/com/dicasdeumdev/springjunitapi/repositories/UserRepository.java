package br.com.dicasdeumdev.springjunitapi.repositories;

import br.com.dicasdeumdev.springjunitapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
