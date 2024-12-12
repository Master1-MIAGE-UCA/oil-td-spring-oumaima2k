package com.example.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dice-rolls")
public class DiceRollController {

    private final DiceRollService diceRollService;

    @Autowired
    public DiceRollController(DiceRollService diceRollService) {
        this.diceRollService = diceRollService;
    }

    // Endpoint to roll a single dice
    @GetMapping("/roll")
    public int rollDice() {
        return diceRollService.rollDice();
    }

    // Endpoint to roll multiple dice
    @GetMapping("/roll/{count}")
    public List<Integer> rollDices(@PathVariable int count) {
        return diceRollService.rollDices(count);
    }
}
