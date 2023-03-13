package tudien.vn.repository;

import org.springframework.stereotype.Repository;
import tudien.vn.model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DictionaryRepositoryImpl implements DictionaryRepository {
    private static Map<Integer, Dictionary> dictionaryMap;
    static {
        dictionaryMap = new HashMap<>();
        dictionaryMap.put(1, new Dictionary("chicken", "ga"));
        dictionaryMap.put(2, new Dictionary("dog", "cho"));
        dictionaryMap.put(3, new Dictionary("cat", "meo"));
        dictionaryMap.put(4, new Dictionary("duck", "vit"));
        dictionaryMap.put(5, new Dictionary("snake", "ran"));
        dictionaryMap.put(6, new Dictionary("mouse", "chuot"));
    }



    @Override
    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
