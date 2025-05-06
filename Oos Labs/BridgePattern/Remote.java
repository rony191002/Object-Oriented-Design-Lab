class Remote {
    protected Device device;

    Remote(Device device) {
        this.device = device;
    }

    void turnOn() {
        device.turnOn();
    }

    void turnOff() {
        device.turnOff();
    }
}

