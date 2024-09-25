package com.board.basic.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public SiteUser create(String username, String nickname, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setNickname(nickname);
        user.setPassword(password);
        user.setCreateDate(LocalDateTime.now());
        this.userRepository.save(user);
        return user;
    }
}
