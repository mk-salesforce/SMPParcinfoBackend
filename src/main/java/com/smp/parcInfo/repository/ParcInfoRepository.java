package com.smp.parcInfo.repository;

import com.smp.parcInfo.entity.ParcInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParcInfoRepository extends JpaRepository<ParcInfo,Long> {

    void deleteParcInfoById(Long id);

    Optional<ParcInfo> findById(Long id);
}

