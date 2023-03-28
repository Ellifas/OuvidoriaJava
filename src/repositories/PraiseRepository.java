package repositories;

import entities.Complaint;
import entities.Praise;

import java.util.ArrayList;
import java.util.List;

public class PraiseRepository {

    private final List<Praise> database = new ArrayList<>();

    public PraiseRepository() {
    }

    public void addPraise(Praise praise) {
        database.add(praise);
    }

    public Praise getPraiseById(Long id) {
        Praise praise = new Praise();
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getId().equals(id)) {
                praise = database.get(i);
            }
        }
        return praise;
    }

    public List<Praise> getAllPraises() {
        return database;
    }

    public List<Praise> getAllPraisesByUserId(Long userId) {
        List<Praise> praises = new ArrayList<>();
        for (Praise i : database) {
            if (i.getUserId().equals(userId)) {
                praises.add(i);
            }
        }
        return praises;
    }

    public void deletePraiseById(Long id) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getId().equals(id)) {
                database.remove(database.get(i));
            }
        }
    }
}
