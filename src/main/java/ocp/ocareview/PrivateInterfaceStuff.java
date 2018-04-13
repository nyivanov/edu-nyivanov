package ocp.ocareview;

public class PrivateInterfaceStuff {
    private interface DoStuffer {
        void doStuff();
    }

    class Inner implements DoStuffer {
        @Override
        public void doStuff() {

        }
    }
}
