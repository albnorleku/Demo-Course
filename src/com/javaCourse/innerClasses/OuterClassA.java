package com.javaCourse.innerClasses;

public class OuterClassA {
    private String name;
    private static int nr = 0;

    public OuterClassA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class StaticInnerClassA {
        private String nameInsideStaticInnerClass;

        public StaticInnerClassA(String name) {
            this.nameInsideStaticInnerClass = name;
        }

        public void setNameInsideStaticInnerClass(String name) {
            this.nameInsideStaticInnerClass = name;
        }

        public String getNameInsideStaticInnerClass() {
            return nameInsideStaticInnerClass;
        }

        public void printAllNames() {
            System.out.println(this.nameInsideStaticInnerClass);
            System.out.println(OuterClassA.nr);
        }
    }

    public class InnerClassA {
        private String name;

        public InnerClassA(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void printAllNames() {
            System.out.println(this.name);
            System.out.println(OuterClassA.this.name);
        }
    }

    public static void main(String [] args) {
        OuterClassA outerClassA = new OuterClassA("Outside Class name");

        //Static inner class
        OuterClassA.StaticInnerClassA staticInnerClassA = new OuterClassA.StaticInnerClassA("Static Inner Class");
        System.out.println(staticInnerClassA.getNameInsideStaticInnerClass());

        //Inner class (member inner class)
        OuterClassA.InnerClassA innerClassA = outerClassA.new InnerClassA("Inner Class A");
        System.out.println(innerClassA.getName());

        System.out.println(outerClassA.getName());
        innerClassA.printAllNames();
    }
}
