@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget

@CdkDslMarker
public class EcsFargateLaunchTargetDsl {
  private val cdkBuilder: EcsFargateLaunchTarget.Builder = EcsFargateLaunchTarget.Builder.create()

  /**
   * Refers to a specific runtime environment for Fargate task infrastructure.
   *
   * Fargate platform version is a combination of the kernel and container runtime versions.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   * @param platformVersion Refers to a specific runtime environment for Fargate task
   * infrastructure. 
   */
  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun build(): EcsFargateLaunchTarget = cdkBuilder.build()
}
