/**
 * 
 */
package mic.vn.synchronize.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "work_processes")
public class WorkProcesses {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "ma_nv")
	private String maNv;
	
	@Column(name = "don_vi_cu")
	private String donViCu;
	
	@Column(name = "don_vi_moi")
	private String donViMoi;
	
	@Column(name = "trang_thai")
	private int trangThai;
	

}
