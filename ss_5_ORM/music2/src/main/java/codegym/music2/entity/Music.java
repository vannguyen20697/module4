package codegym.music2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String musicNo;
    private String musicName;
    private String musicType;
    private String musicLink;

    public Music() {
    }

    public Music(String musicNo, String musicName, String musicType, String musicLink) {
        this.musicNo = musicNo;
        this.musicName = musicName;
        this.musicType = musicType;
        this.musicLink = musicLink;
    }

    public String getMusicNo() {
        return musicNo;
    }

    public void setMusicNo(String musicNo) {
        this.musicNo = musicNo;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public String getMusicLink() {
        return musicLink;
    }

    public void setMusicLink(String musicLink) {
        this.musicLink = musicLink;
    }
}
