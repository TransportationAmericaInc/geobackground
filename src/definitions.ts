import {} from "@capacitor/core";

declare module "@capacitor/core" {
  interface PluginRegistry {
    CapBackground: CapBackground;
  }
}

export interface CapBackground {
  stopBackgroundService(): Promise<{}>;
  startBackgroundService(options: {
    driver_id: string,
    driver_name: string,
    vehicle_id: string,
    vehicle_name: string,
    route_id: string,
    route_name: string,
    latitude: Number,
    longitude: Number,
    speed: Number,
    date: string,
    state: Number,
    socket_url: string,
    event_new_position: string,
    token: string,
  }): Promise<{}>;
  setDriverStatus(options: {driverstatus: any}): Promise<{}>;
}
