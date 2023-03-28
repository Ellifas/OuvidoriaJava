package services;

import entities.Praise;
import repositories.PraiseRepository;

import java.util.ArrayList;
import java.util.List;

public class PraiseService {

    private final PraiseRepository repository = new PraiseRepository();

    public PraiseService() {
    }

    public PraiseRepository getRepository() {
        return repository;
    }

    public void addPraise(Praise praise) {
        repository.addPraise(praise);
    }

    public Praise getPraiseById(Long id) {
        return repository.getPraiseById(id);
    }

    public List<Praise> getAllPraisesByUserId(Long userId) {
        return repository.getAllPraisesByUserId(userId);
    }

    public List<Praise> getAllPraises() {
        return repository.getAllPraises();
    }

    public void deletePraiseById(Long id) {
        try {
            repository.deletePraiseById(id);
        } catch (Exception e) {
            System.out.println("Id inexistente.");
        }
    }
}
