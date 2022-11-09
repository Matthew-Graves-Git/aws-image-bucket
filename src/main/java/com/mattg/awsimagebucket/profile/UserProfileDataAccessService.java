package com.mattg.awsimagebucket.profile;


import com.mattg.awsimagebucket.dataStorage.UserProfileDataStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final UserProfileDataStorage userProfileDataStorage; // can be switched between databases

    @Autowired
    public UserProfileDataAccessService(UserProfileDataStorage userProfileDataStorage) {
        this.userProfileDataStorage = userProfileDataStorage;
    }

    List<UserProfile> getUserProfiles(){
        return userProfileDataStorage.getUserProfiles();
    }
}
