package com.mrwhitehat.compcode;

public class Warn_get {
    private String Id;
    private String Title;
    private String Message;

    public Warn_get () {

    }

    public Warn_get(String Id, String Title, String Message) {
        this.Id = Id;
        this.Title = Title;
        this.Message = Message;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "Warn_get{" +
                "Id='" + Id + '\'' +
                ", Title='" + Title + '\'' +
                ", Message='" + Message + '\'' +
                '}';
    }
}
