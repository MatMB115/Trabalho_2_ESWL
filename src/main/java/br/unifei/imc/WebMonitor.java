package br.unifei.imc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebMonitor {

    public String addUser(String name, String password, String email, String admin) {

        if (!verifyName(name) || !verifyPassword(password) || !verifyEmail(email)
                || !verifyAdmin(admin)) {
            return "Cadastro Inválido";
        }
        return "Cadastro Válido";
    }

    public Boolean verifyName(String name) {
        if (name.length() < 5 || name.length() > 30) {
            return false;
        }
        // Verify if has only letters or spaces
        String regex = "^[\\p{L} .'-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(name);

        if (!matcher.matches()) {
            return false;
        }

        return true;
    }

    public Boolean verifyPassword(String password) {
        if (password.length() < 8 || password.length() > 25) {
            return false;
        }

        // Verify if has at least one number/letter/special character
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,25}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(password);

        if (!matcher.matches()) {
            return false;
        }

        return true;
    }

    public Boolean verifyEmail(String email) {

        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            return false;
        }

        return true;
    }

    public Boolean verifyAdmin(String admin) {
        if (admin.equals("true") || admin.equals("false")) {
            return true;
        }
        return false;
    }
}