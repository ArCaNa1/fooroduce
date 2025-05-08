package com.fooroduce.backend.repository;

import com.fooroduce.backend.entity.TruckApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckApplicationRepository extends JpaRepository<TruckApplication, Integer> {
}
