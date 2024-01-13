package com.scarlxrd.cubochallenge.repository;

import com.scarlxrd.cubochallenge.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
