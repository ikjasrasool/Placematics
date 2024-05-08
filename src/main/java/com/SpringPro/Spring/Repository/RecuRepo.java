package com.SpringPro.Spring.Repository;

import com.SpringPro.Spring.Entity.Alumini;
import com.SpringPro.Spring.Entity.Recu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecuRepo extends JpaRepository<Recu,Long> {
    Recu findByName(String name);
}
