package com.ebay.cloud.cms.model.raptor_paas;

import java.util.List;
import java.util.ArrayList;
import org.codehaus.jackson.JsonNode;


import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class Person extends GenericCMSEntity {


	public Person() {
		set_type(get_metaclass());
//		set_repo("raptor-paas");
	}

	// the getter/setter method
	

	public JsonNode getPhone(){
		return (JsonNode)getFieldValue("phone");
	}

	public void setPhone(JsonNode attrVal_phone){
		setFieldValue("phone", attrVal_phone);
	}
		
	public List<String> getAddress(){
		return (List<String>)getFieldValue("address");
	}

	public void setAddress(List<String> attrVals_address){
		setFieldValue("address", attrVals_address);
	}

	public void addAddress(String attrVal_address){
		addFieldValue("address", attrVal_address);
	}

	public String getAge(){
		return (String)getFieldValue("age");
	}

	public void setAge(String attrVal_age){
		setFieldValue("age", attrVal_age);
	}

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}

	public Boolean getIsOld(){
		return (Boolean)getFieldValue("isOld");
	}

	public void setIsOld(Boolean attrVal_isOld){
		setFieldValue("isOld", attrVal_isOld);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Person";
	}
	
}