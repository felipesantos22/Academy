package br.com.application.service;
import br.com.application.repository.UserRepository;
import br.com.application.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> readService(){
        return  userRepository.findAll();
    }



}