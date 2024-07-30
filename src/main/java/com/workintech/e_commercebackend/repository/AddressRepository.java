package com.workintech.e_commercebackend.repository;

import com.workintech.e_commercebackend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
