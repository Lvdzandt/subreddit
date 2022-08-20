package com.example.subredditapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;


@RestController
@RequestMapping("subreddit")
public class SubRedditController {

    private final ISubRedditRepo repo;

    public SubRedditController(ISubRedditRepo repo){
        this.repo = repo;
    }

    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080","http://localhost:8080"})
    @GetMapping("/all")
    public ResponseEntity<List<SubReddit>> getAllSubReddit(){
        List<SubReddit> temp = repo.findAll();
        return ResponseEntity.ok(temp);
    }

    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080","http://localhost:8080"})
    @GetMapping("/{id}")
    public ResponseEntity<SubReddit> getSubRedditById(@PathVariable("id") int id){
        SubReddit temp = repo.findSubRedditById(id);
        return ResponseEntity.ok(temp);
    }


    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080","http://localhost:8080"})
    @PostMapping("/")
    public SubReddit postSubReddit(@RequestBody SubReddit subReddit){
        return repo.save(subReddit);
    }


    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080","http://localhost:8080"})
    @DeleteMapping({"/{id}"})
    public ResponseEntity<String> deleteSubredditById(@PathVariable(value = "id")int id){
        SubReddit deleted = repo.findSubRedditById(id);
        repo.delete(deleted);
        return ResponseEntity.ok("deleted");
    }

}
