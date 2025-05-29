package com.carbonfoodprint.service_history.service;

import com.carbonfoodprint.service_history.dto.SummaryHistoryDTO;
import com.carbonfoodprint.service_history.entity.UserEntity;
import com.carbonfoodprint.service_history.repository.EnergiesRepository;
import com.carbonfoodprint.service_history.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    @Autowired
    EnergiesRepository energiesRepository;

    @Autowired
    UserRepository userRepository;



    public List<SummaryHistoryDTO> getHisttorialForUser(String username){
        UserEntity user = userRepository.findByUsername(username);
        System.out.println("Id user: " + user.getId());
        return energiesRepository.findHistoryByUserId(user.getId());
    }

}
