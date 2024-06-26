package com.example.letsGo.controller.challenge;

import com.example.letsGo.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/challenge")
public class ChallengeController {
    private final ChallengeService challengeService;

    @Autowired
    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping("/all")
    public String getPubAllRecords(int isPublic) {
        challengeService.getPubAllRecords(isPublic);
        return "challenge/challenge";
    }

/*    @GetMapping
    public String getPubWomanRecords(int isPublic, int gender) {
        challengeService.getPubWomanRecords(isPublic, gender);
        return "challenge/woman";
    }

    @GetMapping
    public String getPubManRecords(int ispublic, int gender) {
        challengeService.getPubManRecords(ispublic, gender);
        return "challenge/man";
    }

    @GetMapping
    public String filteringRecords(List<Record> records, int filter) {
        challengeService.filteringRecords(records, filter);
        return "challenge/filtering";
    }*/
}
