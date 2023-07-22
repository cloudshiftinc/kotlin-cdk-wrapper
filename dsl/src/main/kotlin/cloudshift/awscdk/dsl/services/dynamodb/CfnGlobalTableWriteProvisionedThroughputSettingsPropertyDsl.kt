@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Specifies an auto scaling policy for write capacity.
 *
 * This policy will be applied to all replicas. This setting must be specified if `BillingMode` is
 * set to `PROVISIONED` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * WriteProvisionedThroughputSettingsProperty writeProvisionedThroughputSettingsProperty =
 * WriteProvisionedThroughputSettingsProperty.builder()
 * .writeCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-writeprovisionedthroughputsettings.html)
 */
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
