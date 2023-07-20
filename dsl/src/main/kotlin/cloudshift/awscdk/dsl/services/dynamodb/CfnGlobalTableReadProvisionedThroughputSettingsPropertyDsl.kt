@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableReadProvisionedThroughputSettingsPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder =
      CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.builder()

  public fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: IResolvable) {
    cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings)
  }

  public
      fun readCapacityAutoScalingSettings(readCapacityAutoScalingSettings: CfnGlobalTable.CapacityAutoScalingSettingsProperty) {
    cdkBuilder.readCapacityAutoScalingSettings(readCapacityAutoScalingSettings)
  }

  public fun readCapacityUnits(readCapacityUnits: Number) {
    cdkBuilder.readCapacityUnits(readCapacityUnits)
  }

  public fun build(): CfnGlobalTable.ReadProvisionedThroughputSettingsProperty = cdkBuilder.build()
}
