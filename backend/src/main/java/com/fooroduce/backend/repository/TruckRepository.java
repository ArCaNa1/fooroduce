package com.fooroduce.backend.repository;

import com.fooroduce.backend.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck, Integer> {
}
