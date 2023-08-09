package models;

public class InfoBuyerBuilder {
    private String firstName;
    private String lastName;
    private String code;
    public static class Builder {
        private InfoBuyerBuilder newInfoBuyerBuilder;

        public Builder() {
            this.newInfoBuyerBuilder = new InfoBuyerBuilder();
        }

        public InfoBuyerBuilder.Builder withFirstName(String firstName) {
            newInfoBuyerBuilder.firstName = firstName;
            return this;
        }
        public InfoBuyerBuilder.Builder withLastName(String lastName) {
            newInfoBuyerBuilder.lastName = lastName;
            return this;
        }
        public InfoBuyerBuilder.Builder withCode(String code) {
            newInfoBuyerBuilder.code = code;
            return this;
        }
        public InfoBuyerBuilder build() {
            return newInfoBuyerBuilder;
        }
    }
}