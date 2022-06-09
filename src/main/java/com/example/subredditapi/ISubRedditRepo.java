package com.example.subredditapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface ISubRedditRepo extends JpaRepository<SubReddit,Integer> {
    SubReddit findSubRedditById(final int id);
    SubReddit deleteSubRedditById(final int id);
}
