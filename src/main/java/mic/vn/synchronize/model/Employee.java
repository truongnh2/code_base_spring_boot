/**
 * 
 */
package mic.vn.synchronize.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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
public class Employee {
	@Id
	private String maNv;
	private String hoTen;
	private String gioiTinh;
	private String diaChi;
}
