package net.tchinchow.snippets.spring.rest.crudapi.sample.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.tchinchow.snippets.spring.rest.crudapi.sample.entity.User;
import net.tchinchow.snippets.spring.rest.crudapi.sample.repository.UsersRepository;
import net.tchinchow.snippets.spring.rest.crudapi.sample.service.UsersService;

/**
 * @author JavaSolutionsGuide
 *
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getUsers() {
        List<User> users = usersRepository.findAll();
        return users;
    }

    @Override
    public User getUser(Long userId) throws NoSuchElementException {
        Optional<User> optEmp = usersRepository.findById(userId);
        return optEmp.get();
    }

    @Override
    public void saveUser(User user) {
        usersRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public void updateUser(User user) {
        usersRepository.save(user);
    }
}