package dev.tolga.springeazyschoolapp.repository;

import dev.tolga.springeazyschoolapp.model.EazyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EazyClassRepository extends JpaRepository<EazyClass, Integer> {

}
