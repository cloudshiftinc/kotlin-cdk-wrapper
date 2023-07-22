@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

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
