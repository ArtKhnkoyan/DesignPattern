package com.example.builderpattern;

import lombok.Data;

@Data
 class SomeClass {
    private int field1;
    private int field2;
    private int field3;
    private String field4;
    private String field5;

    public static class Builder {
        private int field1;
        private int field2;
        private int field3;
        private String field4;
        private String field5;

        public Builder field1(int field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(int field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(int field3) {
            this.field3 = field3;
            return this;
        }

        public Builder field4(String field4) {
            this.field4 = field4;
            return this;
        }

        public Builder field5(String field5) {
            this.field5 = field5;
            return this;
        }

        SomeClass build() {
            return new SomeClass(this);
        }
    }

    SomeClass(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
        this.field5 = builder.field5;
    }
}
