package com.example.dice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiceRollLogRepository extends JpaRepository<DiceRollLog, Long> {
}
