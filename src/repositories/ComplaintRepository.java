package repositories;

import entities.Complaint;
import entities.Praise;

import java.util.ArrayList;
import java.util.List;

public class ComplaintRepository {

    private final List<Complaint> database = new ArrayList<>();

    public ComplaintRepository() {
    }

    public void addComplaint(Complaint complaint) {
        database.add(complaint);
    }

    public Complaint getComplaintById(Long id) {
        Complaint complaint = new Complaint();
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getId().equals(id)) {
                complaint = database.get(i);
            }
        }
        return complaint;
    }

    public List<Complaint> getAllComplaints() {
        return database;
    }

    public List<Complaint> getAllComplaintsByUserId(Long userId) {
        List<Complaint> complaints = new ArrayList<>();
        for (Complaint i : database) {
            if (i.getUserId().equals(userId)) {
                complaints.add(i);
            }
        }
        return complaints;
    }


    public void deleteComplaintById(Long id) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getId().equals(id)) {
                database.remove(database.get(i));
            }
        }
    }
}
