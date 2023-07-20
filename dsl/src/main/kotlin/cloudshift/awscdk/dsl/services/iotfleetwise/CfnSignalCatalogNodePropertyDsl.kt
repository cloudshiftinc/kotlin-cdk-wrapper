@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

@CdkDslMarker
public class CfnSignalCatalogNodePropertyDsl {
  private val cdkBuilder: CfnSignalCatalog.NodeProperty.Builder =
      CfnSignalCatalog.NodeProperty.builder()

  public fun actuator(actuator: IResolvable) {
    cdkBuilder.actuator(actuator)
  }

  public fun actuator(actuator: CfnSignalCatalog.ActuatorProperty) {
    cdkBuilder.actuator(actuator)
  }

  public fun attribute(attribute: IResolvable) {
    cdkBuilder.attribute(attribute)
  }

  public fun attribute(attribute: CfnSignalCatalog.AttributeProperty) {
    cdkBuilder.attribute(attribute)
  }

  public fun branch(branch: IResolvable) {
    cdkBuilder.branch(branch)
  }

  public fun branch(branch: CfnSignalCatalog.BranchProperty) {
    cdkBuilder.branch(branch)
  }

  public fun sensor(sensor: IResolvable) {
    cdkBuilder.sensor(sensor)
  }

  public fun sensor(sensor: CfnSignalCatalog.SensorProperty) {
    cdkBuilder.sensor(sensor)
  }

  public fun build(): CfnSignalCatalog.NodeProperty = cdkBuilder.build()
}
