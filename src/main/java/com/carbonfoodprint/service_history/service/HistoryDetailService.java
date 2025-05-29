package com.carbonfoodprint.service_history.service;

import com.carbonfoodprint.service_history.dto.DetailHistoryDTO;
import com.carbonfoodprint.service_history.entity.EnergiesEntity;
import com.carbonfoodprint.service_history.entity.FoodsEntity;
import com.carbonfoodprint.service_history.entity.TransportsEntity;
import com.carbonfoodprint.service_history.entity.WastesEntity;
import com.carbonfoodprint.service_history.repository.EnergiesRepository;
import com.carbonfoodprint.service_history.repository.FoodsRepository;
import com.carbonfoodprint.service_history.repository.TransportsRepository;
import com.carbonfoodprint.service_history.repository.WastesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryDetailService {

    @Autowired
    EnergiesRepository energiesRepository;

    @Autowired
    FoodsRepository foodsRepository;

    @Autowired
    TransportsRepository transportsRepository;

    @Autowired
    WastesRepository wastesRepository;


    public DetailHistoryDTO getDetailHistory(Long id){
        EnergiesEntity energy = energiesRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Energies not found for id: " + id));
        FoodsEntity food = foodsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Foods not found for id: " + id));
        TransportsEntity transport = transportsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Transports not found for id: " + id));
        WastesEntity waste = wastesRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Wastes not found for id: " + id));


        return new DetailHistoryDTO(energy, food, transport, waste);
    }

}
