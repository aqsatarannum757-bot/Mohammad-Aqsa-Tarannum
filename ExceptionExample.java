public static void main(String[] args) {
        try {
            Class.forName("coreclass");
        } catch (ClassFormatError e) {
            System.out.println("Class format error occurred");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}