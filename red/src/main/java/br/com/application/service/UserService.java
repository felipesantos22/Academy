package br.com.application.service;
import br.com.application.repository.UserRepository;
import br.com.application.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> readService(){
        return  userRepository.findAll();
    }
    public User createService(User user){
        return userRepository.save(user);
    }
    public Optional<User> findId(Long id){
        return userRepository.findById(id);
    }

    public Optional<User> updateService(Long id, User user){
        return userRepository.findById(id).map(user1 -> {
            user1.setName(user.getName());
            user1.setPhone(user.getPhone());
            user1.setPlan(user.getPlan());
            return userRepository.save(user1);
        });
    }

    public Optional<User> deleteUser(Long id){
        Optional<User> test = userRepository.findById(id);
        return test;
    }




}