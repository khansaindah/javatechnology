package com.xsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="barang")
public class Barang {

		@Id
		@Column(name="id", nullable=false)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name="namaBarang", nullable=false, length=50)
		private String namaBarang;
		
		@Column(name="jenisBarang", nullable=false, length=30)
		private String jenisBarang;
		
		@Column(name="kotaPembuat", nullable=false, length=30)
		private String kotaPembuat;
		
		@Column(name="jml_barang", nullable=false)
		private int jml_barang;
		
		@Column(name="hargaBarang", nullable=false)
		private int hargaBarang;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNamaBarang() {
			return namaBarang;
		}

		public void setNamaBarang(String namaBarang) {
			this.namaBarang = namaBarang;
		}

		public String getJenisBarang() {
			return jenisBarang;
		}

		public void setJenisBarang(String jenisBarang) {
			this.jenisBarang = jenisBarang;
		}

		public String getKotaPembuat() {
			return kotaPembuat;
		}

		public void setKotaPembuat(String kotaPembuat) {
			this.kotaPembuat = kotaPembuat;
		}

		public int getJml_barang() {
			return jml_barang;
		}

		public void setJml_barang(int jml_barang) {
			this.jml_barang = jml_barang;
		}

		public int getHargaBarang() {
			return hargaBarang;
		}

		public void setHargaBarang(int hargaBarang) {
			this.hargaBarang = hargaBarang;
		}
		
		
		
		
		
}
