package net.marssky.accountsvc.service;

import net.marssky.accountsvc.model.User;
import net.marssky.accountsvc.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    UserRepo userRepo;

    public List<User> getUser(){
        return userRepo.getUsers();
    }
}
