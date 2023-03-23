class VehicleFuel(val currentFuel: Int = 50) {

  // This function performs the vehicle movement and fuel consumption.
  def fuelConsumption(): VehicleFuel = {
    if (currentFuel >= 20)
      new VehicleFuel(currentFuel - 20)
    else {
      throw new RuntimeException("Not Enough Fuel....! Please refill")

    }
  }

  // Function used to refill the fuel tank when fuel is less than needed.
  def fuelRefill(): VehicleFuel = {
    new VehicleFuel()
  }
}
