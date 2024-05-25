package top.alexmmd.buzzchat.service;


import top.alexmmd.buzzchat.domain.User;

/**
 * @author wangyonghui
 * @since 2024年05月25日 10:56:00
 */
public interface IUserService {

    User getUserById(Long userId);

    void deleteUserById(Long userId);

    User updateUser(User user);

    void clearCache();

}
