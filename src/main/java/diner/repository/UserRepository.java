package diner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import diner.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
