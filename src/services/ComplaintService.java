package services;

import entities.Complaint;
import repositories.ComplaintRepository;

import java.util.ArrayList;
import java.util.List;

public class ComplaintService {

    private final ComplaintRepository repository = new ComplaintRepository();

    public ComplaintService() {
    }

    public ComplaintRepository getRepository() {
        return repository;
    }

    public void addComplaint(Complaint complaint) {
        repository.addComplaint(complaint);
    }

    public Complaint getComplaintById(Long id) {
        return repository.getComplaintById(id);
    }

    public List<Complaint> getAllComplaints() {
        return repository.getAllComplaints();
    }

    public List<Complaint> getAllComplaintsByUserId(Long userId) {
        return repository.getAllComplaintsByUserId(userId);
    }

    public void deleteComplaintById(Long id) {
        try {
            repository.deleteComplaintById(id);
        } catch (Exception e) {
            System.out.println("Id inexistente");
        }
    }
}
