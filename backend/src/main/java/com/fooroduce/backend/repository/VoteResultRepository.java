package com.fooroduce.backend.repository;

import com.fooroduce.backend.entity.VoteResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteResultRepository extends JpaRepository<VoteResult, Integer> {
}
