package vaultiq.session.core;

import jakarta.servlet.http.HttpServletRequest;
import vaultiq.session.core.model.VaultiqSession;

import java.util.List;

public interface VaultiqSessionManager {

    VaultiqSession createSession(String userId, HttpServletRequest request);

    VaultiqSession getSession(String sessionId);

    void deleteSession(String sessionId);

    List<VaultiqSession> getSessionsByUser(String userId);

    int totalUserSessions(String userId);

}