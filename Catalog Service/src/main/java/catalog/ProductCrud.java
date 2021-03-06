package catalog;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface ProductCrud extends PagingAndSortingRepository<Product, String> {

	public List<Product> findAllByName(@Param("name") String name, Pageable pageable);

	public List<Product> findAllByPriceGreaterThanEqual(@Param("price") double minPrice, Pageable pageable);

	public List<Product> findAllByPriceLessThanEqual(@Param("price") double maxPrice, Pageable pageable);

	public List<Product> findAllByCategory(@Param("category") String category, Pageable pageable);
}
