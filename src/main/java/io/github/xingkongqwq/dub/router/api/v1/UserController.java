package io.github.xingkongqwq.dub.router.api.v1;

import io.github.xingkongqwq.dub.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xkawa
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private UserService userService;

    @GetMapping("/login")
    public ResponseEntity<String> login(String username, String password) {
        if (userService.login(username, password) != null) {
            return new ResponseEntity<>("login successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("error username or password", HttpStatus.FORBIDDEN);
        }
    }
    @GetMapping("/register")
    public ResponseEntity<String> reg(String username, String password) {
        return new ResponseEntity<>("err", HttpStatus.FORBIDDEN);
    }
}
