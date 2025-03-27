package com.urunov.datastore;

import com.urunov.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;


@Repository
public class FakeUserProfileDataStore {

    private static final LinkedList<UserProfile> USER_PROFILES = new LinkedList<UserProfile>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID().toString(), "nikhil", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID().toString(), "reddy", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
