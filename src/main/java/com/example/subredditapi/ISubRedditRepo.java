package com.example.subredditapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubRedditRepo extends JpaRepository<SubReddit,Integer> {
    SubReddit findSubRedditById(final int id);
    SubReddit deleteSubRedditById(final int id);
}
