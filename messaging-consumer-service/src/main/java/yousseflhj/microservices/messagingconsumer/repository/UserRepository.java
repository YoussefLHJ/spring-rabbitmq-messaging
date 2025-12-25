package yousseflhj.microservices.messagingconsumer.repository;

import yousseflhj.microservices.messagingconsumer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
