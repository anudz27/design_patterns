class Count {
    // static class
    private static Count instance;

    // Private Constructer
    private Count()
    {

        System.out.println("Singleton is Instantiated.");
    }
    public static Count getInstance()
    {
        if (instance == null)
            synchronized (Count.class){
                if(instance==null){
                    instance = new Count();

                }
            }
        return instance;
    }

}

class Singelton {
    public static void main(String[] args)
    {

        Count.getInstance();

    }
}
