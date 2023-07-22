@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

@CdkDslMarker
public class CfnSignalCatalogNodeCountsPropertyDsl {
  private val cdkBuilder: CfnSignalCatalog.NodeCountsProperty.Builder =
      CfnSignalCatalog.NodeCountsProperty.builder()

  /**
   * @param totalActuators (Optional) The total number of nodes in a vehicle network that represent
   * actuators.
   */
  public fun totalActuators(totalActuators: Number) {
    cdkBuilder.totalActuators(totalActuators)
  }

  /**
   * @param totalAttributes (Optional) The total number of nodes in a vehicle network that represent
   * attributes.
   */
  public fun totalAttributes(totalAttributes: Number) {
    cdkBuilder.totalAttributes(totalAttributes)
  }

  /**
   * @param totalBranches (Optional) The total number of nodes in a vehicle network that represent
   * branches.
   */
  public fun totalBranches(totalBranches: Number) {
    cdkBuilder.totalBranches(totalBranches)
  }

  /**
   * @param totalNodes (Optional) The total number of nodes in a vehicle network.
   */
  public fun totalNodes(totalNodes: Number) {
    cdkBuilder.totalNodes(totalNodes)
  }

  /**
   * @param totalSensors (Optional) The total number of nodes in a vehicle network that represent
   * sensors.
   */
  public fun totalSensors(totalSensors: Number) {
    cdkBuilder.totalSensors(totalSensors)
  }

  public fun build(): CfnSignalCatalog.NodeCountsProperty = cdkBuilder.build()
}
