package com.example.demo.AppController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AppEntity.AppEntity;
import com.example.demo.Service.AppService;

@RestController
public class AppController {
	@Autowired
	AppService eser;
	@PostMapping("add")
	public List<AppEntity> addnstudents(@RequestBody List<AppEntity> ee) {
		return eser.saveinfo(ee);
	}
	
	@GetMapping("disp")
	public List<AppEntity > show(){
		return eser.showinfo();
	}

	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody AppEntity ee) {
		return eser.updateinfobyid(id,ee);
	}
	
	@DeleteMapping("delete")
	public String deleteMyParamId(@RequestParam int id)
	{
	     eser.deleteinfo(id);
	     return ("Deletion Done");
	}
}
