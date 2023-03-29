package ru.timofeev.projects.telegrambottranslator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timofeev.projects.telegrambottranslator.data.Response;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Integer> {
}
