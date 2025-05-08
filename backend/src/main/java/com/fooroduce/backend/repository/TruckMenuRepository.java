package com.fooroduce.backend.repository;

import com.fooroduce.backend.entity.TruckMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckMenuRepository extends JpaRepository<TruckMenu, Integer> {
}
