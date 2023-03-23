import org.scalatest.flatspec.AnyFlatSpec


class Vehicle_Fuel_Testcase extends AnyFlatSpec {
  "Vehicle" should "move and fuel will change its state" in {
    val vehicle1 = new VehicleFuel(30)
    val vehicle2 = vehicle1.fuelConsumption()
    assert(vehicle2.currentFuel == 10)
  }

  it should "refill and full the fuel tank" in {
    val vehicle1 = new VehicleFuel(10)
    val vehicle2 = vehicle1.fuelRefill()
    assert(vehicle2.currentFuel == 50)
  }

  it should "move vehicle two times and refill the tank and move again and fuel will be remain in the tank" in {
    val vehicle1 = new VehicleFuel()
    val vehicle2 = vehicle1.fuelConsumption().fuelConsumption().fuelRefill().fuelConsumption()
    assert(vehicle2.currentFuel == 30)
  }

  it should "Throw the exception when fuel capacity is low (<20)" in {
    val vehicle1 = new VehicleFuel(10)
    assertThrows[RuntimeException] {
      vehicle1.fuelConsumption()
    }
  }
}
