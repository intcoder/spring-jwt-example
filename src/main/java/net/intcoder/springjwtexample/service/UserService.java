package net.intcoder.springjwtexample.service;

import net.intcoder.springjwtexample.domain.Role;
import net.intcoder.springjwtexample.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
