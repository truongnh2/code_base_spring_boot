/**
 * 
 */
package mic.vn.synchronize.service;

import java.util.Optional;

/**
 * @author truongnh
 *
 */
public interface IGeneralService<T> {
	Iterable<T> findAll();

    Optional<T> findById(String id);

    T save(T t);

    void remove(String id);
}
