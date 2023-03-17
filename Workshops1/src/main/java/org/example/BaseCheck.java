package org.example;

public class BaseCheck implements GamerCheckService{
    @Override
    public Boolean CheckIfRealPerson(User player) {
        return true;
    }
}
