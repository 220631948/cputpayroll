package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Contact {
    @Id
    private String email;

    private String mobile;
    private String linkedInProfile;

    protected Contact (){}

    public Contact (Builder builder){
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.linkedInProfile = builder.linkedInProfile;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLinkedInProfile() { return linkedInProfile; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(email, contact.email) && Objects.equals(mobile, contact.mobile) && Objects.equals(linkedInProfile, contact.linkedInProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, mobile, linkedInProfile);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", linkedInProfile='" + linkedInProfile + '\'' +
                '}';
    }

    public static class Builder{
        private String email;
        private String mobile;
        private String linkedInProfile;

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setLinkedInProfile(String linkedInProfile) {
            this.linkedInProfile = linkedInProfile;
            return this;
        }

        public Builder copy (Contact contact){
            this.email = contact.email;
            this.mobile = contact.mobile;
            this.linkedInProfile = contact.linkedInProfile;
            return this;
        }

        public Contact build () {
            return new Contact (this);
        }

    }

}
