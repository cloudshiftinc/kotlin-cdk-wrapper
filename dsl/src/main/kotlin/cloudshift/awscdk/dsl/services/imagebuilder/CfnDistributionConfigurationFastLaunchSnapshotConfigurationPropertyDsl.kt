@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * Configuration settings for managing the number of snapshots that are created from pre-provisioned
 * instances for the Windows AMI when faster launching is enabled.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * FastLaunchSnapshotConfigurationProperty fastLaunchSnapshotConfigurationProperty =
 * FastLaunchSnapshotConfigurationProperty.builder()
 * .targetResourceCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchsnapshotconfiguration.html)
 */
@CdkDslMarker
public class CfnDistributionConfigurationFastLaunchSnapshotConfigurationPropertyDsl {
  private val cdkBuilder:
      CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.Builder =
      CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.builder()

  /**
   * @param targetResourceCount The number of pre-provisioned snapshots to keep on hand for a
   * fast-launch enabled Windows AMI.
   */
  public fun targetResourceCount(targetResourceCount: Number) {
    cdkBuilder.targetResourceCount(targetResourceCount)
  }

  public fun build(): CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty =
      cdkBuilder.build()
}
