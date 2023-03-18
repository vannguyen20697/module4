package email.repository;

import email.model.Email;

import java.util.List;

public interface EmailRepository {
    void createEmail(Email email);
    void updateEmail(Email email);
    Email getId(String id);
    List<Email> findAll();
}
