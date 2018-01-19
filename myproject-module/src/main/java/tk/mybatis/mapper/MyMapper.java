package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <p>Title: MyMapper</p>
 * <p>Description: </p>
 *
 * @author Linkboy
 * @version 1.0.0
 * @date 2018/1/17 16:54
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
