package email.service;

import email.model.Email;
import email.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailRepository emailRepository;

    @Override
    public void createEmail(Email email) {
        emailRepository.createEmail(email);
    }

    @Override
    public void updateEmail(Email email) {
        emailRepository.updateEmail(email);
        System.err.println(email);
    }

    @Override
    public Email getId(String id) {
        return emailRepository.getId(id);
    }

    @Override
    public List<Email> findAll() {
        return emailRepository.findAll();
    }
}
