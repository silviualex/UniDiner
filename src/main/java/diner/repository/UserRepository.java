package diner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import diner.entity.UserDiner;

@Repository
public interface UserRepository extends CrudRepository<UserDiner, Integer> {

}
