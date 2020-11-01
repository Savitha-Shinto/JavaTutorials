package keywords;

/*
The purpose of abstract classes is to function as base classes which can be extended by subclasses to create a full implementation. For instance, imagine that a certain process requires 3 steps:

        The step before the action.
        The action.
        The step after the action.
 */
public abstract class MyAbstractProcess {
    public void process() {
        stepBefore();
        action();
        stepAfter();
    }

    public void stepBefore() {
        System.out.println("Step all the prerequistics of this test");
    }

    public abstract void action(); // implemented by subclasses

    public void stepAfter() {
        System.out.println("Tear down all the setup");
    }
}
class TestProcess extends MyAbstractProcess {

    @Override
    public void action() {
        System.out.println("Process..");
    }
}
class Bootstrap {
    public static void main(String args[]){
        TestProcess testProcess = new TestProcess();
        testProcess.process();
    }
}