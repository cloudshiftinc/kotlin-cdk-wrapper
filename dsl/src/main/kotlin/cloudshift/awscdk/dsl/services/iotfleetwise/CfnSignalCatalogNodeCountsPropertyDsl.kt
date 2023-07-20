@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

@CdkDslMarker
public class CfnSignalCatalogNodeCountsPropertyDsl {
  private val cdkBuilder: CfnSignalCatalog.NodeCountsProperty.Builder =
      CfnSignalCatalog.NodeCountsProperty.builder()

  public fun totalActuators(totalActuators: Number) {
    cdkBuilder.totalActuators(totalActuators)
  }

  public fun totalAttributes(totalAttributes: Number) {
    cdkBuilder.totalAttributes(totalAttributes)
  }

  public fun totalBranches(totalBranches: Number) {
    cdkBuilder.totalBranches(totalBranches)
  }

  public fun totalNodes(totalNodes: Number) {
    cdkBuilder.totalNodes(totalNodes)
  }

  public fun totalSensors(totalSensors: Number) {
    cdkBuilder.totalSensors(totalSensors)
  }

  public fun build(): CfnSignalCatalog.NodeCountsProperty = cdkBuilder.build()
}
