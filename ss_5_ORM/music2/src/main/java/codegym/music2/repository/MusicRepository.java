package codegym.music2.repository;
import codegym.music2.entity.Music;

import java.util.List;

public interface MusicRepository {
    void create(Music music);
    void delete(Music music);
    void update(Music music);
    Music findById(String id);
    List<Music> findAll();
}
