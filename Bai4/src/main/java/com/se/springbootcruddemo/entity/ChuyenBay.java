package com.se.springbootcruddemo.entity;
import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "macb")
	private String maCB;
	
	@Column(name = "gadi")
	private String gaDi;
	
	@Column(name = "gaden")
	private String gaDen;
	
	@Column(name = "dodai")
	private int doDai;
	
	@Column(name = "giodi")
	private Date gioDi;
	
	@Column(name = "gioden")
	private Date gioDen;
	
	@Column(name = "chiphi")
	private int chiPhi;

	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
	
	
	
}
