package ca.retrylife.dslib.net.control;

public class ControlPacket {

    // Comms version
    private static final int version = 0x01;

    // Tracking Packet sequence
    private static int sequence_id = 0;

    // game data
    public enum GameState {
        TELEOP(0x00), TEST(0x01), AUTONOMOUS(0x02);

        private int state;

        GameState(int state) {
            this.state = state;
        }

        public int get() {
            return state;
        }
    }

    public enum AllianceStation {
        RED1(0), RED2(1), RED3(2), BLUE1(3), BLUE2(4), BLUE3(5);

        private int stationID;

        AllianceStation(int stationID) {
            this.stationID = stationID;
        }

        public int get() {
            return stationID;
        }
    }

    private int sequence;
    private boolean e_stop, fms_connected, enabled, reboot, restart;
    private GameState state;

    public ControlPacket(int sequence, boolean e_stop, boolean fms_connected, boolean enabled, GameState state,
            boolean reboot, boolean restart) {

    }

}