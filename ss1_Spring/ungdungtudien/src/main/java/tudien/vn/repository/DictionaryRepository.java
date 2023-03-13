package tudien.vn.repository;

import tudien.vn.model.Dictionary;

import java.util.List;

public interface DictionaryRepository {
    public List<Dictionary> findAll();
}
