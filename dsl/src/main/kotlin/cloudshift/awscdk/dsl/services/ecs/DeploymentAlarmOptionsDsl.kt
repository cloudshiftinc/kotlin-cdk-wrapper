@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.AlarmBehavior
import software.amazon.awscdk.services.ecs.DeploymentAlarmOptions

@CdkDslMarker
public class DeploymentAlarmOptionsDsl {
  private val cdkBuilder: DeploymentAlarmOptions.Builder = DeploymentAlarmOptions.builder()

  public fun behavior(behavior: AlarmBehavior) {
    cdkBuilder.behavior(behavior)
  }

  public fun build(): DeploymentAlarmOptions = cdkBuilder.build()
}
