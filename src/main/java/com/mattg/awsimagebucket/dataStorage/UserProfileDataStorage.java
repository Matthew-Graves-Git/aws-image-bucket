package com.mattg.awsimagebucket.dataStorage;


import com.mattg.awsimagebucket.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataStorage {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"LarryBird",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"TommyLee",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
