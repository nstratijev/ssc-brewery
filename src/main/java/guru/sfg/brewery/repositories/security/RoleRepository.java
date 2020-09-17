package guru.sfg.brewery.repositories.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.sfg.brewery.domain.security.Role;

/**
 * Created by jt on 6/29/20.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String customer);
}
