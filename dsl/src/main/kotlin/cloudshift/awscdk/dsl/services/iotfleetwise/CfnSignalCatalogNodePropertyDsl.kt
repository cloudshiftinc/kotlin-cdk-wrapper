@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

@CdkDslMarker
public class CfnSignalCatalogNodePropertyDsl {
  private val cdkBuilder: CfnSignalCatalog.NodeProperty.Builder =
      CfnSignalCatalog.NodeProperty.builder()

  /**
   * @param actuator (Optional) Information about a node specified as an actuator.
   *
   * An actuator is a digital representation of a vehicle device.
   */
  public fun actuator(actuator: IResolvable) {
    cdkBuilder.actuator(actuator)
  }

  /**
   * @param actuator (Optional) Information about a node specified as an actuator.
   *
   * An actuator is a digital representation of a vehicle device.
   */
  public fun actuator(actuator: CfnSignalCatalog.ActuatorProperty) {
    cdkBuilder.actuator(actuator)
  }

  /**
   * @param attribute (Optional) Information about a node specified as an attribute.
   *
   * An attribute represents static information about a vehicle.
   */
  public fun attribute(attribute: IResolvable) {
    cdkBuilder.attribute(attribute)
  }

  /**
   * @param attribute (Optional) Information about a node specified as an attribute.
   *
   * An attribute represents static information about a vehicle.
   */
  public fun attribute(attribute: CfnSignalCatalog.AttributeProperty) {
    cdkBuilder.attribute(attribute)
  }

  /**
   * @param branch (Optional) Information about a node specified as a branch.
   *
   * A group of signals that are defined in a hierarchical structure.
   */
  public fun branch(branch: IResolvable) {
    cdkBuilder.branch(branch)
  }

  /**
   * @param branch (Optional) Information about a node specified as a branch.
   *
   * A group of signals that are defined in a hierarchical structure.
   */
  public fun branch(branch: CfnSignalCatalog.BranchProperty) {
    cdkBuilder.branch(branch)
  }

  /**
   * @param sensor (Optional) An input component that reports the environmental condition of a
   * vehicle.
   *
   * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
   * sensors.
   */
  public fun sensor(sensor: IResolvable) {
    cdkBuilder.sensor(sensor)
  }

  /**
   * @param sensor (Optional) An input component that reports the environmental condition of a
   * vehicle.
   *
   * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
   * sensors.
   */
  public fun sensor(sensor: CfnSignalCatalog.SensorProperty) {
    cdkBuilder.sensor(sensor)
  }

  public fun build(): CfnSignalCatalog.NodeProperty = cdkBuilder.build()
}
