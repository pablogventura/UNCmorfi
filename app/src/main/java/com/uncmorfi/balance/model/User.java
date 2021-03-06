package com.uncmorfi.balance.model;

import android.content.ContentValues;
import android.database.Cursor;

import java.io.Serializable;


public class User implements Serializable {
    private long id;
    private String card;
    private String name;
    private String type;
    private String image;
    private int balance;

    public User() {}

    public User(Cursor cursor) {
        this.id = cursor.getLong(cursor.getColumnIndex(UsersContract.UserEntry._ID));
        this.card = cursor.getString(cursor.getColumnIndex(UsersContract.UserEntry.CARD));
        this.name = cursor.getString(cursor.getColumnIndex(UsersContract.UserEntry.NAME));
        this.type = cursor.getString(cursor.getColumnIndex(UsersContract.UserEntry.TYPE));
        this.image = cursor.getString(cursor.getColumnIndex(UsersContract.UserEntry.IMAGE));
        this.balance = cursor.getInt(cursor.getColumnIndex(UsersContract.UserEntry.BALANCE));
    }

    public long getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getCard() {
        return card;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getImage() {
        return image;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ContentValues toContentValues () {
        ContentValues values = new ContentValues();
        values.put(UsersContract.UserEntry.CARD, this.card);
        values.put(UsersContract.UserEntry.NAME, this.name);
        values.put(UsersContract.UserEntry.TYPE, this.type);
        values.put(UsersContract.UserEntry.IMAGE, this.image);
        values.put(UsersContract.UserEntry.BALANCE, this.balance);
        return values;
    }
}
