package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        try{
            if(!checkAge(age))
                throw new UnderAgeException();
            if(!checkLocality(locality))
                throw new LocalityNotFoundException();
            if(!checkVoterId(vid))
                throw new InvalidVoterIDException();
        } catch (UnderAgeException |
        LocalityNotFoundException|
        InvalidVoterIDException e){
            throw new NotEligibleException(e.getMessage());
        }
        return true;
    }

    private boolean checkAge(int age) throws UnderAgeException{
        if (age < 18){
            throw new UnderAgeException("UnderAge: Must be atleast 18 years old");
        }
        return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String [] localities = {"JPNagar", "ABCNagar", "Whitefield"};
        for(String local : localities){
            if(local.equals(locality)){
                return true;
            }
        }
        throw new LocalityNotFoundException("Locality not found");
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
        if(voterId < 1000 || voterId > 9999)
            throw new InvalidVoterIDException("Invalid voterID: VoterID should be between 1000 and 9999");
        return true;
    }
}
