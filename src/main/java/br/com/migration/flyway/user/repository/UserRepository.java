package br.com.migration.flyway.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.migration.flyway.user.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
