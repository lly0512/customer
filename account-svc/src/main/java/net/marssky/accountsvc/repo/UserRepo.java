package net.marssky.accountsvc.repo;

import net.marssky.accountsvc.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepo {
    public List<User> getUsers();
}
