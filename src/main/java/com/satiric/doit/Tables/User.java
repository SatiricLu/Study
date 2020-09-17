package com.satiric.doit.Tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name="users")
public class User {
     // This tells Hibernate to make a table out of this class
        @Id
        private String login;

        private String pass;

        private Date date_create;

        private String first_name;

        private String second_name;

        public String getLogin() {
            return login;
        }


        public void setLogin(String login) {
                this.login = login;
            }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public Date getDate_create() {
            return date_create;
        }

        public void setDate_create(Date date_create) {
            this.date_create = date_create;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getSecond_name() {
            return second_name;
        }

        public void setSecond_name(String second_name) {
            this.second_name = second_name;
        }

}

