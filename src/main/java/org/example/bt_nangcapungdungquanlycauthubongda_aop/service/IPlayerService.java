package org.example.bt_nangcapungdungquanlycauthubongda_aop.service;




import org.example.bt_nangcapungdungquanlycauthubongda_aop.model.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Optional;

public interface IPlayerService {
    Page<Player> findAll(int page, int size, String sort, String name, LocalDate dobMin, LocalDate dobMax);

   Player findById(Long id);

    void save(Player player);
    void remove(Long id);

    Page<Player> findAllByNameContaining(String search,Pageable pageable);

    Page<Player> findAllAndSort(String sort);
    String changePlayerStatus(Long playerId);
    Page<Player> getPlayer(int page, int size, String name, LocalDate dobMin, LocalDate dobMax);
}
