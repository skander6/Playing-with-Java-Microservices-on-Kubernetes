package com.ensi.logistic.persistence;

import com.ensi.logistic.model.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolRepository extends JpaRepository<Vol, Long> {
}

