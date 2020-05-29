package com.easj.capservice.entities;

public class SessionData {

    private String driverId;

    private String driverName;

    private String vehicleId;

    private String vehicleName;

    private String routeId;

    private String routeName;

    private Double latitude;

    private Double longitude;

    private Integer speed;

    private String date;

    private Integer state;

    private String socketUrl;

    private String eventNewPosition;

    private String token;

    private DriverStatus driverStatus;

    public SessionData() {
        super();
    }

    public SessionData(String driverId, String driverName, String vehicleId, String vehicleName, String routeId, String routeName, Double latitude, Double longitude, Integer speed, String date, Integer state, String socketUrl, String eventNewPosition, String token) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.routeId = routeId;
        this.routeName = routeName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.date = date;
        this.state = state;
        this.socketUrl = socketUrl;
        this.eventNewPosition = eventNewPosition;
        this.token = token;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSocketUrl() {
        return socketUrl;
    }

    public void setSocketUrl(String socketUrl) {
        this.socketUrl = socketUrl;
    }

    public String getEventNewPosition() {
        return eventNewPosition;
    }

    public void setEventNewPosition(String eventNewPosition) {
        this.eventNewPosition = eventNewPosition;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    public static class DriverStatus {
        private int driverStatusId;

        private String description;

        private int categoryId;

        private boolean isActive;

        public DriverStatus() {
            super();
        }

        public DriverStatus(int driverStatusId, String description, int categoryId, boolean isActive) {
            this.driverStatusId = driverStatusId;
            this.description = description;
            this.categoryId = categoryId;
            this.isActive = isActive;
        }

        public int getDriverStatusId() {
            return driverStatusId;
        }

        public void setDriverStatusId(int driverStatusId) {
            this.driverStatusId = driverStatusId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public boolean isActive() {
            return isActive;
        }

        public void setActive(boolean active) {
            isActive = active;
        }
    }

}
