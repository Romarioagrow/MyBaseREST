package mybase.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;
import me.postaddict.instagram.scraper.model.Account;
import me.postaddict.instagram.scraper.model.Media;
import me.postaddict.instagram.scraper.model.PageObject;
import mybase.domain.InstProfile;
import mybase.services.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

@Log
@Data
@RestController
@AllArgsConstructor
@RequestMapping("/api/profile")
public class ProfileController {
    private final ProfileService profileService;


    @PostMapping("/instagram/loadInstFollows")
    private LinkedList<Collection> loadInstFollows(@RequestBody String instUsername) {
        log.info("loadInstFollows");
        return profileService.loadInstFollows(instUsername);
    }


    @PostMapping("/instagram/loadInstPosts")
    private PageObject<Media> loadInstPosts(@RequestBody String instUsername) {
        log.info("loadInstPosts");
        return profileService.loadInstPosts(instUsername);
    }

    @PostMapping("/instagram/loadInstProfile")
    private Account loadInstProfile(@RequestBody String instUsername) {
        log.info("loadInstProfile");
        return profileService.instApiAccount(instUsername);
    }


    /*@PostMapping("/instagram/loadInstProfile")
    private InstProfile loadInstProfile(@RequestBody String instUsername) {

        return profileService.loadInstProfile(instUsername);
    }*/
}