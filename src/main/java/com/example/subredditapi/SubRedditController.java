package com.example.subredditapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("subreddit")
public class SubRedditController {

    private final ISubRedditRepo repo;

    public SubRedditController(ISubRedditRepo repo){
        this.repo = repo;
    }


    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080"})
    @GetMapping("/")
    public ResponseEntity<SubReddit> getSubRedditById(@PathVariable("id") int id){
        SubReddit temp = repo.findSubRedditById(id);
        return ResponseEntity.ok(temp);
    }


    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080"})
    @PostMapping("/")
    public SubReddit postSubReddit(@RequestBody SubReddit subReddit){
        return repo.save(subReddit);
    }


    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080"})
    @DeleteMapping({"/{id}"})
    public ResponseEntity<SubReddit> deleteSubredditById(@PathVariable(value = "id")int id){
        SubReddit deleted = repo.deleteSubRedditById(id);
        return ResponseEntity.ok(deleted);
    }

}
