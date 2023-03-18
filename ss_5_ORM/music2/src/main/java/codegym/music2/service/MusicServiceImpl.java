package codegym.music2.service;
import codegym.music2.entity.Music;
import codegym.music2.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicRepository musicRepository;
    @Override
    public void create(Music music) {
        musicRepository.create(music);
    }

    @Override
    public void delete(Music music) {
        musicRepository.delete(music);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music);
    }

    @Override
    public Music findById(String id) {
        return musicRepository.findById(id);
    }

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }
}
