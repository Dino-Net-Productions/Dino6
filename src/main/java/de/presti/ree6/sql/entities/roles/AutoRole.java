package de.presti.ree6.sql.entities.roles;

import jakarta.persistence.Table;

/**
 * SQL Entity for the Auto-Roles.
 */
@Table(name = "AutoRoles")
public class AutoRole extends Role {

    /**
     * Constructor.
     */
    public AutoRole() {
    }

    /**
     * @inheritDoc
     */
    public AutoRole(String guildId, String roleId) {
        super(guildId, roleId);
    }
}