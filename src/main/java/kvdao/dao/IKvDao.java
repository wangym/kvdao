package kvdao.dao;

/**
 * @author yumin
 * @since 2015-11-27
 */
public interface IKvDao {
    /**
     * @param key
     * @param value
     * @return
     */
    boolean set(String key, String value);

    /**
     * @param key
     * @return
     */
    String get(String key);
}
