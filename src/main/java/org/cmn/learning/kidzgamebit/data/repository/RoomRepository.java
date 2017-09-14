package org.cmn.learning.kidzgamebit.data.repository;

import org.cmn.learning.kidzgamebit.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);
}
