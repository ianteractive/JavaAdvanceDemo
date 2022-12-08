package advanceJava;

enum Color {
    Red("red"), Blue("blue"), Green("green");

    private String val;

    Color(String val){
        this.val = val;
    }

    public String getVal(){
        return val;
    }
}
