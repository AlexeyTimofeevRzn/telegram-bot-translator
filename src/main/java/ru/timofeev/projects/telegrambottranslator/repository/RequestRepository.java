package ru.timofeev.projects.telegrambottranslator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timofeev.projects.telegrambottranslator.data.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
}
