/*
* AMRIT – Accessible Medical Records via Integrated Technology
* Integrated EHR (Electronic Health Records) Solution
*
* Copyright (C) "Piramal Swasthya Management and Research Institute"
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.helpline104.data.institute;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;

@Entity
@Table(name = "m_institutedirectory")
public class InstituteDirectory {

	@Expose
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InstituteDirectoryID")
	private Integer instituteDirectoryID;
	
	@Expose
	@Column(name = "InstituteDirectoryName")
	private String instituteDirectoryName;	
	@Column(name = "Deleted", insertable = false, updatable = true)
	private Boolean deleted;
	@Column(name = "CreatedBy")
	private String createdBy;
	@Column(name = "CreatedDate")
	private Date createdDate;
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Column(name = "LastModDate")
	private Date lastModDate;

	public InstituteDirectory() {
		super();
	}
	

	public InstituteDirectory(String instituteDirectoryName) {
		this.instituteDirectoryName = instituteDirectoryName;
	}


	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	
}
