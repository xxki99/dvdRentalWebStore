package com.dvdStore.web.dvdRentalWeb.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    public List<LanguageEntity> getAllLanguages(){
        return languageRepository.findAll();
    }
}
