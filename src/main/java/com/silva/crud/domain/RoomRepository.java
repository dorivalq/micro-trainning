package com.silva.crud.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	Room findByRoomNumber(String roomNumber);
	List<Room> findAll();
}
