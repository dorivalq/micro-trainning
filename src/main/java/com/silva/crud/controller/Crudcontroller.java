package com.silva.crud.controller;
//package com.silva.crud.service;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//import javax.websocket.server.PathParam;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(path = "/crud")
//public class Crudcontroller {
//
//	@Autowired
//	private StateRepository repository;
//
//	@RequestMapping(method = RequestMethod.GET)
//	public List<State> get() {
//		return repository.findAll();
//	}
//
//	@RequestMapping(method = RequestMethod.POST)
//	public ResponseEntity<State> add(@RequestBody State state) {
//		if (state == null) {
//			return ResponseEntity.badRequest().build();
//		}
//
//		State save = this.repository.save(state);
//		return ResponseEntity.ok(save);
//	}
//	//
//	// @RequestMapping(method = RequestMethod.PUT)
//	// public ResponseEntity<State> update(@RequestBody State state){
//	// if (state == null) {
//	// return ResponseEntity.badRequest().build();
//	// }
//	//
//	// State saved = this.repository.save(state);
//	//
//	// return ResponseEntity.ok(saved);
//	// }
//	//
//	// @RequestMapping(method = RequestMethod.DELETE, path="/{id}")
//	// public ResponseEntity<State> del(@PathVariable(name = "id") Long id){
//	// if (id == null || id == 0) {
//	// return ResponseEntity.badRequest().build();
//	// }
//	// Optional<State> optional = this.repository.findById(id);
//	// if (!optional.isPresent()) {
//	// return ResponseEntity.notFound().build();
//	// }
//	//
//	// this.repository.delete(optional.get());
//	//
//	// return ResponseEntity.ok().build();
//	// }
//
//	@RequestMapping(method = RequestMethod.PUT)
//	public ResponseEntity<State> update(@RequestBody State state) {
//		if (state == null) {
//			return ResponseEntity.badRequest().build();
//		}
//		return ResponseEntity.ok(this.repository.save(state));
//	}
//
//	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
//	public ResponseEntity<State> del(@PathVariable(name = "id") Long id) {
//		if (id == null || id == 0) {
//			return ResponseEntity.badRequest().build();
//		}
////		Optional<State> optional = this.repository.findById(id);
//		State state = this.repository.findOne(id);
//		if (!optional.isPresent()) {
//			return ResponseEntity.notFound().build();
//		}
//		this.repository.delete(optional.get());
//
//		return ResponseEntity.ok().build();
//	}
//
//	@RequestMapping(method = RequestMethod.GET, path = "/getState")
//	public ResponseEntity<List<State>> getState(@RequestParam(name = "id", required = false) Long id) {
//		if (id != null && id > 0) {
//			return ResponseEntity.ok(Collections.singletonList(this.repository.findById(id).get()));
//		}
//		return ResponseEntity.ok(this.repository.findAll());
//	}
//
//	@RequestMapping(method = RequestMethod.GET, path = "/getAll")
//	public ResponseEntity<List<State>> getAll() {
//		return ResponseEntity.ok(this.repository.findAll());
//	}
//
//	@RequestMapping(method = RequestMethod.POST, path = "/saveState")
//	public ResponseEntity<State> saveState(@RequestBody State state) {
//		if (state == null) {
//			return ResponseEntity.badRequest().build();
//		}
//		return ResponseEntity.ok(this.repository.save(state));
//	}
//
//	@RequestMapping(method = RequestMethod.PUT, path = "/updateState")
//	public ResponseEntity<State> updateState(@RequestBody State state) {
//		if (state == null) {
//			return ResponseEntity.badRequest().build();
//		}
//		State saved = this.repository.save(state);
//		return ResponseEntity.ok(saved);
//	}
//
//	@RequestMapping(method = RequestMethod.DELETE, path  = "/deleteState/{id}")
//	public ResponseEntity<State> deleteState(@PathVariable(name = "id") Long id) {
//		if (id == null || id <= 0) {
//			return ResponseEntity.badRequest().build();
//		}
//		Optional<State> optional = this.repository.findById(id);
//		if (!optional.isPresent()) {
//			return ResponseEntity.notFound().build();
//		}
//		this.repository.delete(optional.get());
//
//		return ResponseEntity.ok().build();
//	}
//	
//	@RequestMapping(method = RequestMethod.PUT, path = "/change")
//	public ResponseEntity<State> change(@RequestBody State state){
//		if(state == null){
//			return ResponseEntity.badRequest().build();
//		}
//		return ResponseEntity.ok(this.repository.save(state));
//	}
//}
