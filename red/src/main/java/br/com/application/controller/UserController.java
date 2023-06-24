package br.com.application.controller;
import br.com.application.service.UserService;
import br.com.application.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

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

    /* Outra maneira de chamar a classe service para fazer o get
    @GetMapping
    public @ResponseBody List<User> list(){
        return  userService.readService();
    }*/

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return userService.findId(id);
    }

    @PostMapping
    public ResponseEntity<User> createController(@RequestBody User user){
        userService.createService(user);
        return ResponseEntity.ok().body(user);
    }


}
