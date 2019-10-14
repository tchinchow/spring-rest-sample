package net.tchinchow.snippets.spring.rest.crudapi.sample.service;

import java.util.List;

import net.tchinchow.snippets.spring.rest.crudapi.sample.entity.User;

/**
 * @author JavaSolutionsGuide
 *
 */
public interface UsersService {
    public List<User> getUsers();

    public User getUser(Long userId);

    public void saveUser(User user);

    public void deleteUser(Long userId);

    public void updateUser(User user);
}