package email.service;

import email.model.Email;

import java.util.List;

public interface EmailService {
    void createEmail(Email email);
    void updateEmail(Email email);
    Email getId(String id);
    List<Email> findAll();
}
