package com.harrington.richard.criminalintent;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private static final String JSON_ID = "id";
    private static final String JSON_TITLE = "title";
    private static final String JSON_SOLVED = "solved";
    private static final String JSON_DATE = "date";

    private UUID id;
    private String title;
    private Date date;
    private boolean solved;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy, h:mm a");

    public Crime() {
        id = UUID.randomUUID();
        date = new Date();
    }

    public Crime(JSONObject json) throws JSONException {
        id = UUID.fromString(json.getString(JSON_ID));
        if (json.has(JSON_TITLE)) {
            title = json.getString(JSON_TITLE);
        }
        solved = json.getBoolean(JSON_SOLVED);
        date = new Date(json.getLong(JSON_DATE));
    }

    @Override
    public String toString() {
        return title;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_ID, id.toString());
        json.put(JSON_TITLE, title);
        json.put(JSON_SOLVED, solved);
        json.put(JSON_DATE, date.getTime());
        return json;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getDateString() {
        return dateFormat.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
