@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions

@CdkDslMarker
public class EcsFargateLaunchTargetOptionsDsl {
  private val cdkBuilder: EcsFargateLaunchTargetOptions.Builder =
      EcsFargateLaunchTargetOptions.builder()

  /**
   * @param platformVersion Refers to a specific runtime environment for Fargate task
   * infrastructure. 
   * Fargate platform version is a combination of the kernel and container runtime versions.
   */
  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun build(): EcsFargateLaunchTargetOptions = cdkBuilder.build()
}
