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
    route_data: string,
    stops: number,
    last_stop: number,
    socket_url: string,
    event_new_position: string,
    token: string,
  }): Promise<{}>;
  setStopsInfo(options: {
    stops: number,
    last_stop: number
  }): Promise<{}>;
  setDriverStatus(options: {driverstatus: any}): Promise<{}>;
}
