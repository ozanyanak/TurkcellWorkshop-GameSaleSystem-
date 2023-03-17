package org.example;

public abstract class BaseUserManager {
    public BaseUserManager() {
    }

    public void save(User user) {
        System.out.println("Kullanıcı kayıt edildi : " + user.getEmail());
    }

    public void delete(User user) {
        System.out.println("Kullanıcı silindi : " + user.getEmail());
    }

    public void update(User user) {
        System.out.println("Kullanıcı güncellendi : " + user.getEmail());
    }
}