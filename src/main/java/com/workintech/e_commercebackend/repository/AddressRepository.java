package com.workintech.e_commercebackend.repository;

import com.workintech.e_commercebackend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address,Long> {

    @Query("SELECT i FROM Address i WHERE i.id=:id")
    Optional<Address> findById(long id);

}
