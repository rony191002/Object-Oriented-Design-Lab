class AdvancedRemote extends Remote {
    AdvancedRemote(Device device) {
        super(device);
    }

    void mute() {
        device.setVolume(0);
        System.out.println("Muted");
    }
}

