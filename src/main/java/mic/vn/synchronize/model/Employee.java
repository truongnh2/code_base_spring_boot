/**
 * 
 */
package mic.vn.synchronize.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author truongnh
 * @since 25/04/2022
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "ma_nv")
	private String maNv;
	
	@Column(name = "ho_ten")
	private String hoTen;
	
	@Column(name = "gioi_tinh")
	private String gioiTinh;
	
	@Column(name = "dia_chi")
	private String diaChi;
	
	@Column(name = "trang_thai")
	private int trangThai;

}
