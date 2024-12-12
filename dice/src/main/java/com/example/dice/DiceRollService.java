package com.example.dice;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class DiceRollService {
    private final DiceRollLogRepository diceRollLogRepository;
    private final Random random = new Random();

    public DiceRollService(DiceRollLogRepository diceRollLogRepository) {
        this.diceRollLogRepository = diceRollLogRepository;
    }
    public int rollDice() {
        return random.nextInt(6) + 1;
    }
    public List<Integer> rollDices(int diceCount) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < diceCount; i++) {
            results.add(random.nextInt(6) + 1);
        }

        DiceRollLog log = new DiceRollLog(diceCount, results, LocalDateTime.now());
        diceRollLogRepository.save(log);

        // Retourner les résultats des lancés
        return results;
    }
}
