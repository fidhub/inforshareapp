package za.ac.cput.inforshareapp.domain.content;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by Hunter on 28/01/2018.
 */
@Entity
public class RawContent implements Serializable{
    @PrimaryKey
    private final String org;
    @PrimaryKey
    private final String  id;
    private final LocalDateTime dateCreated;
    private final String creator;
    private final String  source;
    private final String category;
    private final String title;
    private final String  content;
    private final String contentType;
    private final String status;
    private final String state;

    private RawContent(Builder builder){
        this.org=builder.org;
        this.id=builder.id;
        this.dateCreated=builder.dateCreated;
        this.creator=builder.creator;
        this.source=builder.source;
        this.category=builder.category;
        this.title=builder.title;
        this.content=builder.content;
        this.contentType=builder.contentType;
        this.status=builder.status;
        this.state=builder.state;
    }

    public String getOrg() {            return org;     }
    public String getId() {             return id;      }
    public LocalDateTime getDateCreated() {return dateCreated;    }
    public String getCreator() {        return creator; }
    public String getSource() {         return source;  }
    public String getCategory() {       return category;}
    public String getTitle() {          return title;   }
    public String getContent() {        return content; }
    public String getContentType() {    return contentType;    }
    public String getStatus() {         return status;  }
    public String getState() {          return state;   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RawContent that = (RawContent) o;

        if (!org.equals(that.org)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = org.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }

    public static class Builder{
        private String org;
        private String  id;
        private LocalDateTime dateCreated;
        private String creator;
        private String  source;
        private String category;
        private String title;
        private String  content;
        private String contentType;
        private String status;
        private String state;

        public Builder org(String v){this.org=v; return this;}
        public Builder id(String v){this.id=v; return this;}
        public Builder dateCreated(LocalDateTime v){this.dateCreated=v; return this;}
        public Builder creator(String v){this.creator=v; return this;}
        public Builder source(String v){this.source=v;return this;}
        public Builder category(String v){this.category=v;return this;};
        public Builder title(String v){this.title=v;return this;}
        public Builder content(String v){this.content=v;return this;}
        public Builder contentType(String v){this.contentType=v;return this;}
        public Builder status(String v){this.status=v;return this;}
        public Builder state(String v){this.state=v;return this;}
        public RawContent build(){return new RawContent(this);}
    }






}
