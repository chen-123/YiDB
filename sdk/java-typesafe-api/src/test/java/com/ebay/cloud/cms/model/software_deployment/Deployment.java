package com.ebay.cloud.cms.model.software_deployment;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;


import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class Deployment extends GenericCMSEntity {


	public Deployment() {
		set_type(get_metaclass());
//		set_repo("software-deployment");
	}

	// the getter/setter method
	

	public Date getLastModifiedTime(){
		return (Date) getDateField("lastModifiedTime");
	}

	public void setLastModifiedTime(Date attrVal_lastModifiedTime){
		setDateField("lastModifiedTime", attrVal_lastModifiedTime);
	}

	public String getActiveUpdateStrategy(){
		return (String)getFieldValue("activeUpdateStrategy");
	}

	public void setActiveUpdateStrategy(String attrVal_activeUpdateStrategy){
		setFieldValue("activeUpdateStrategy", attrVal_activeUpdateStrategy);
	}

	public Date getCreatedTime(){
		return (Date) getDateField("createdTime");
	}

	public void setCreatedTime(Date attrVal_createdTime){
		setDateField("createdTime", attrVal_createdTime);
	}

	public String getStatus(){
		return (String)getFieldValue("status");
	}

	public void setStatus(String attrVal_status){
		setFieldValue("status", attrVal_status);
	}
		
	public List<DeploymentEvent> getEvents(){
		return (List<DeploymentEvent>) getFieldValue("events");
	}

	public void setEvents(List<DeploymentEvent> attrVals_events){
		setFieldValue("events", attrVals_events);
	}
	
	public void addEvents(DeploymentEvent attrVal_events){
		addFieldValue("events", attrVal_events);
	}

	public String getRemote(){
		return (String)getFieldValue("remote");
	}

	public void setRemote(String attrVal_remote){
		setFieldValue("remote", attrVal_remote);
	}

	public String getStatusMessage(){
		return (String)getFieldValue("statusMessage");
	}

	public void setStatusMessage(String attrVal_statusMessage){
		setFieldValue("statusMessage", attrVal_statusMessage);
	}

	public Boolean getSyncUpdateStrategy(){
		return (Boolean)getFieldValue("syncUpdateStrategy");
	}

	public void setSyncUpdateStrategy(Boolean attrVal_syncUpdateStrategy){
		setFieldValue("syncUpdateStrategy", attrVal_syncUpdateStrategy);
	}
		
	public List<DeploymentEntityStatus> getEntitiesStatus(){
		return (List<DeploymentEntityStatus>) getFieldValue("entitiesStatus");
	}

	public void setEntitiesStatus(List<DeploymentEntityStatus> attrVals_entitiesStatus){
		setFieldValue("entitiesStatus", attrVals_entitiesStatus);
	}
	
	public void addEntitiesStatus(DeploymentEntityStatus attrVal_entitiesStatus){
		addFieldValue("entitiesStatus", attrVal_entitiesStatus);
	}

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}

	public Date getScheduledTime(){
		return (Date) getDateField("scheduledTime");
	}

	public void setScheduledTime(Date attrVal_scheduledTime){
		setDateField("scheduledTime", attrVal_scheduledTime);
	}

	public Boolean getAutoPause(){
		return (Boolean)getFieldValue("autoPause");
	}

	public void setAutoPause(Boolean attrVal_autoPause){
		setFieldValue("autoPause", attrVal_autoPause);
	}
		
	public List<DeploymentTarget> getTargets(){
		return (List<DeploymentTarget>) getFieldValue("targets");
	}

	public void setTargets(List<DeploymentTarget> attrVals_targets){
		setFieldValue("targets", attrVals_targets);
	}
	
	public void addTargets(DeploymentTarget attrVal_targets){
		addFieldValue("targets", attrVal_targets);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Deployment";
	}
	
}