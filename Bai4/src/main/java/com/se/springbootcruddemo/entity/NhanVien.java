package com.se.springbootcruddemo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "nhanvien")
public class NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MaNV")
	private String maNV;
	
	@Column(name = "Ten")
	private String ten;
	
	@Column(name = "Luong")
	private int luong;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<ChungNhan> chungNhans;

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", ten=" + ten + ", luong=" + luong + "]";
	}


	

}
