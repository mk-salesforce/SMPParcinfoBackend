package com.smp.parcInfo.service;

import com.smp.parcInfo.entity.ParcInfo;
import com.smp.parcInfo.exception.ParcInfoNotFoundException;
import com.smp.parcInfo.repository.ParcInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcInfoService {

    @Autowired
    private ParcInfoRepository parcInfoRepository;

    public ParcInfo findById(Long parcInfoId) {
        return parcInfoRepository
                .findById(parcInfoId).orElseThrow(() -> new ParcInfoNotFoundException("Element non trouvé"));
    }

    public ParcInfo addParcInfo(ParcInfo parcInfo) {
        return parcInfoRepository.save(parcInfo);
    }

    public void deleteParcInfo(Long idParcInfo) {
        parcInfoRepository.deleteParcInfoById(idParcInfo);
    }

    public List<ParcInfo> getAllParcInfo() {
        return parcInfoRepository.findAll();
    }

}
