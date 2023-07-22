@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder =
      CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.builder()

  /**
   * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica table
   * or global secondary index.
   */
  public fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: IResolvable) {
    cdkBuilder.writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings)
  }

  /**
   * @param writeCapacityAutoScalingSettings Specifies auto scaling settings for the replica table
   * or global secondary index.
   */
  public
      fun writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings: CfnGlobalTable.CapacityAutoScalingSettingsProperty) {
    cdkBuilder.writeCapacityAutoScalingSettings(writeCapacityAutoScalingSettings)
  }

  public fun build(): CfnGlobalTable.WriteProvisionedThroughputSettingsProperty = cdkBuilder.build()
}
