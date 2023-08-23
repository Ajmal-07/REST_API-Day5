package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AppEntity.AppEntity;
import com.example.demo.AppRepository.AppRepo;

@Service
public class AppService {
	@Autowired
	AppRepo er;
	public List<AppEntity> saveinfo(List<AppEntity> ee) {
		return (List<AppEntity>)er.saveAll(ee);//POST	
	}
	public List<AppEntity>showinfo(){
		return er.findAll();//GET
	}

	public String updateinfobyid(int id,AppEntity ee) {
		if(er.existsById(id)) {
			er.saveAndFlush(ee);
			return "Updated";
		}
		else {
			return "Enter valid id";
		}
	}
	public void deleteinfo(int id) {
		er.deleteById(id);

}
}
