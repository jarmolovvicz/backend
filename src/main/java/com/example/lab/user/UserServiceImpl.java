

// Co do samej implementacji, nie do końca wiedziałem, jak to zapisać w kodzie,aby było poprawnie,
// wiec musiałem trochę podeprzeć się internetem

package com.example.lab.user;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}

