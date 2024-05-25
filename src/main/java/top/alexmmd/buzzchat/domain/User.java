package top.alexmmd.buzzchat.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.util.StringUtils;

/**
 * @author wangyonghui
 * @since 2024年05月25日 11:41:00
 */
public class User implements Serializable {
    private String name = "user";
    private String password = UUID.randomUUID().toString();
    private List<String> roles = new ArrayList();
    private boolean passwordGenerated = true;

    public User() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        if (StringUtils.hasLength(password)) {
            this.passwordGenerated = false;
            this.password = password;
        }
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = new ArrayList(roles);
    }

    public boolean isPasswordGenerated() {
        return this.passwordGenerated;
    }
}
