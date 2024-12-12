package com.example.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dice-rolls")
public class DiceRollLogController {

    private final DiceRollLogRepository diceRollLogRepository;

    @Autowired
    public DiceRollLogController(DiceRollLogRepository diceRollLogRepository) {
        this.diceRollLogRepository = diceRollLogRepository;
    }

    // Endpoint to retrieve all dice roll logs
    @GetMapping("/logs")
    public List<DiceRollLog> getAllLogs() {
        return diceRollLogRepository.findAll();
    }
}
