package org.cmn.learning.kidzgamebit.data.repository;

import org.cmn.learning.kidzgamebit.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}