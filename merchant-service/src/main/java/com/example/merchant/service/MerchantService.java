package com.example.merchant.service;

import com.example.merchant.entity.Merchant;
import com.example.merchant.repository.MerchentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MerchantService {
    private final MerchentRepository merchentRepository;
    public MerchantService(MerchentRepository merchentRepository){
        this.merchentRepository = merchentRepository;
    }

    public Merchant createMerchent(Merchant merchant){
        //generate merchant Id
        merchant.setMerchantId("MER"+System.currentTimeMillis());
        //set initial onboarding status
        merchant.setStatus("Pending_Kyc");
        //set creation date
        merchant.setCreatedAt(LocalDateTime.now());
        System.out.println("Hey i am Rajib");
        return merchentRepository.save(merchant);
    }
}
