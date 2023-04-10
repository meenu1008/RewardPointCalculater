package com.Myproject.RewardPoint.service;

import com.Myproject.RewardPoint.model.Rewards;



public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
