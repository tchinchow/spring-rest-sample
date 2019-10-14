package net.tchinchow.snippets.spring.rest.crudapi.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import net.tchinchow.snippets.spring.rest.crudapi.sample.entity.User;
 
@Repository
public interface UsersRepository extends JpaRepository<User,Long>{
 
}
