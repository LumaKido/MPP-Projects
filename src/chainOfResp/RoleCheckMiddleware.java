package chainOfResp;

/**
 * ConcreteHandler. Checks a user's role.
 * Aqui seria o que acontece caso o usuario seja autorizado para entrar
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
