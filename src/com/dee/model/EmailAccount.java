package com.dee.model;
import javax.mail.Store;
import java.util.Properties;

public class EmailAccount {

    private String address;
    private String password;
    private Properties properties;
    private Store store;

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
//    bqfuptlnlrsfydlx
    public EmailAccount(String address, String password) {
        this.address = address;
        this.password = password;
        properties = new Properties();
        properties.put("incomingHost", "outlook.office365.com");
        properties.put("mail.store.protocol", "imap");

        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.host", "outlook.office365.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("outgoingHost", "outlook.office365.com");
    }
}