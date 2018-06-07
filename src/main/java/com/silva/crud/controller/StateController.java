package com.silva.crud.controller;
//package com.silva.crud.service;
//
//import java.util.Collections;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@RestController
//@RequestMapping(path = "/state")
//@Api(value = "states", description = "Data operations on States")
//public class StateController {
//	public static Logger log = LoggerFactory.getLogger(StateController.class);
//	@Autowired
//	private StateRepository stateRepository;
//
//	@RequestMapping(method = RequestMethod.GET, path = "/getAll")
//	@ApiOperation(value = "Get all States", notes = "Get all States", nickname = "getStates")
//	public List<State> getAll(@RequestParam(name = "id", required = false) Long id) {
//		log.info("Calling state.findAll()");
//		if (id != null && id > 0) {
//			return Collections.singletonList(stateRepository.findOne(id));
//		}
//		return stateRepository.findAll();
//	}
//
//	@RequestMapping(path = "/byId")
//	public State getById(@RequestParam(name = "id") Long id) {
//		State state = stateRepository.findOne(id);
//		return state;
//	}
//	
//	@RequestMapping(path="/save" , method = RequestMethod.POST)
//	public ResponseEntity<State> saveState(@RequestBody State  state ){
//		if (state != null) {
//			return new ResponseEntity<State>(stateRepository.save(state), HttpStatus.OK);
//		}
//		return new ResponseEntity<State>(HttpStatus.BAD_REQUEST);
//	}
//}
