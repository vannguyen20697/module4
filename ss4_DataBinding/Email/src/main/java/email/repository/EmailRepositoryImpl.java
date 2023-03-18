package email.repository;

import email.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class EmailRepositoryImpl implements EmailRepository {
    private static Map<String, Email> emailMap;
    static {
        emailMap = new HashMap<>();
        emailMap.put("1", new Email("1","English","25","false","Adam"));
        emailMap.put("2", new Email("2","French","5","true","John"));
        emailMap.put("3", new Email("3","Vietnamese","50","true","Elvis"));
    }

    @Override
    public void createEmail(Email email) {
        if (!emailMap.containsKey(email.getId())) {
            emailMap.put(email.getId(), email);
        }
    }

    @Override
    public void updateEmail(Email email) {
        if (emailMap.containsKey(email.getId())) {
            emailMap.put(email.getId(), email);
        }
    }

    @Override
    public Email getId(String id) {
        return emailMap.get(id);
    }

    @Override
    public List<Email> findAll() {
        return new ArrayList<>(emailMap.values());
    }
}
