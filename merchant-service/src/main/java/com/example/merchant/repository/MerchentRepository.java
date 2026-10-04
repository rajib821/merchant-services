package com.example.merchant.repository;

import com.example.merchant.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchentRepository extends JpaRepository<Merchant, Long> {

}
