package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MernisCheck implements GamerCheckService{
    List<Mernis> mernisList = new ArrayList<Mernis>();

    public MernisCheck()
    {
        mernisList.add(new Mernis("12345", "dilek", "anay", new Date(2018,06, 18)));
        mernisList.add(new Mernis("12345", "altan", "anay", new Date(2001,01, 8)));
    }

    public List<Mernis> getMernisList() {
        return mernisList;
    }

    public Boolean CheckIfRealPerson(User player)
    {
        Boolean result = false;
        for (Mernis mernis1: mernisList)
        {
            if (mernis1.getFirstName().equals(player.getFirstName()) && mernis1.getLastName().equals(player.getLastName()) && mernis1.getNationalIdentity().equals(player.getNationalIdentity()) && mernis1.getDateOfBirth().equals(player.getDateOfBirth()))
            {
                result = true;
            }
        }
        return result;
    }
}
