package com.example.powercosm.service;

import com.example.powercosm.models.UserProfile;

public interface UserProfileService {

    public UserProfile createUserProfile(String username, UserProfile newProfile);

    public UserProfile getUserProfile(String username);
}