package top.alexmmd.buzzchat.service.impl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import top.alexmmd.buzzchat.domain.User;
import top.alexmmd.buzzchat.service.IUserService;

/**
 * @author wangyonghui
 * @since 2024年05月25日 10:57:00
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    @Cacheable(value = "users", key = "#userId")
    public User getUserById(Long userId) {
        User user = new User();
        user.setName(String.valueOf(userId));
        return user;
    }

    @Override
    @CacheEvict(value = "users", key = "#userId")
    public void deleteUserById(Long userId) {

    }

    @CacheEvict(value = "users", allEntries = true)
    @Override
    public void clearCache() {
        // 清空整个缓存
    }

    @Override
    @CachePut(value = "users", key = "#user.name")
    public User updateUser(User user) {
        return user;
    }

}
