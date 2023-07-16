@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget

@CdkDslMarker
public class EcsFargateLaunchTargetDsl {
  private val cdkBuilder: EcsFargateLaunchTarget.Builder = EcsFargateLaunchTarget.Builder.create()

  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun build(): EcsFargateLaunchTarget = cdkBuilder.build()
}
