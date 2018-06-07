package com.silva.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.silva.crud.domain.Room;
import com.silva.crud.domain.RoomRepository;

@RestController
@RequestMapping(path = "/rooms")
public class RoomController {

	@Autowired
	private RoomRepository roomRepository;
	@RequestMapping(method = RequestMethod.GET)
	public List<Room> getAll(){
		return roomRepository.findAll();
	}
}
