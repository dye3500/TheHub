public class User {
    //new Username and Password (going to later do a forget username/password and send to email if time)
    public class newUsername {
        private String newUsername;

        public newUsername(String username) {
            this.newUsername = username;
        }

        public String getNewUsername() {
            return username;
        }

        public void setNewUsername(String username) {
            this.newUsername = username;
        }
    }

    public class newPassword {
        private String newPassword;

        public newPassword(String password) {
            this.newPassword = password;
        }

        public String getNewpassword() {
            return password;
        }

        public void setNewPassword(String password) {
            this.newPassword = password;
        }
}
