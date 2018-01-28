package za.ac.cput.inforshareapp.domain.content;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by Hunter on 28/01/2018.
 */
@Entity
public class Media implements Serializable {
    @PrimaryKey
    private final String contentId;
    @PrimaryKey
    private final String id;
    private final String description;
    private final String url;
    private final String mime;
    private final LocalDateTime date;
    private final String state;

    private Media(Builder builder){
        this.contentId=builder.contentId;
        this.id=builder.id;
        this.description=builder.description;
        this.url=builder.url;
        this.mime=builder.mime;
        this.date=builder.date;
        this.state=builder.state;
    }

    public String getContentId() {        return contentId;    }
    public String getId() {        return id;    }
    public String getDescription() {        return description;    }
    public String getUrl() {        return url;    }
    public String getMime() {        return mime;    }
    public LocalDateTime getDate() {        return date;    }
    public String getState() {        return state;    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Media media = (Media) o;

        if (!contentId.equals(media.contentId)) return false;
        return id.equals(media.id);
    }

    @Override
    public int hashCode() {
        int result = contentId.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }

    public static class Builder{
        private String contentId;
        private String id;
        private String description;
        private String url;
        private String mime;
        private LocalDateTime date;
        private String state;

        public Builder contentId(String v){this.contentId=v;return this;}
        public Builder id(String v){this.id=v;return this;}
        public Builder description(String v){this.description=v;return this;}
        public Builder url(String v){this.url=v;return this;}
        public Builder mime(String v){this.mime=v;return this;}
        public Builder date(LocalDateTime v){this.date=v;return this;}
        public Builder state(String v){this.state=v;return this;}

        public Media build(){return new Media(this);}

    }


}
