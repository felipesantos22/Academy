package br.com.application.controller;
import br.com.application.service.UserService;
import br.com.application.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping( "/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<List<User>> readController(){
        List<User> list = userService.readService();
        return  ResponseEntity.ok().body(list);
    }


}
