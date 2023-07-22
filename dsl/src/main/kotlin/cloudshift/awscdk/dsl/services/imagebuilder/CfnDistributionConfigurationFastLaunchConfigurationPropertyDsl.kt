@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationFastLaunchConfigurationPropertyDsl {
  private val cdkBuilder: CfnDistributionConfiguration.FastLaunchConfigurationProperty.Builder =
      CfnDistributionConfiguration.FastLaunchConfigurationProperty.builder()

  /**
   * @param accountId The owner account ID for the fast-launch enabled Windows AMI.
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * @param enabled A Boolean that represents the current state of faster launching for the Windows
   * AMI.
   * Set to true to start using Windows faster launching, or false to stop using it.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled A Boolean that represents the current state of faster launching for the Windows
   * AMI.
   * Set to true to start using Windows faster launching, or false to stop using it.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses when it
   * launches Windows instances to create pre-provisioned snapshots.
   */
  public fun launchTemplate(launchTemplate: IResolvable) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  /**
   * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses when it
   * launches Windows instances to create pre-provisioned snapshots.
   */
  public
      fun launchTemplate(launchTemplate: CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  /**
   * @param maxParallelLaunches The maximum number of parallel instances that are launched for
   * creating resources.
   */
  public fun maxParallelLaunches(maxParallelLaunches: Number) {
    cdkBuilder.maxParallelLaunches(maxParallelLaunches)
  }

  /**
   * @param snapshotConfiguration Configuration settings for managing the number of snapshots that
   * are created from pre-provisioned instances for the Windows AMI when faster launching is enabled.
   */
  public fun snapshotConfiguration(snapshotConfiguration: IResolvable) {
    cdkBuilder.snapshotConfiguration(snapshotConfiguration)
  }

  /**
   * @param snapshotConfiguration Configuration settings for managing the number of snapshots that
   * are created from pre-provisioned instances for the Windows AMI when faster launching is enabled.
   */
  public
      fun snapshotConfiguration(snapshotConfiguration: CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty) {
    cdkBuilder.snapshotConfiguration(snapshotConfiguration)
  }

  public fun build(): CfnDistributionConfiguration.FastLaunchConfigurationProperty =
      cdkBuilder.build()
}
