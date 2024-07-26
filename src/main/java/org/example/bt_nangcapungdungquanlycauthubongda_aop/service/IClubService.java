package org.example.bt_nangcapungdungquanlycauthubongda_aop.service;


import org.example.bt_nangcapungdungquanlycauthubongda_aop.model.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClubService {
    Iterable<Club> findAll();
}
