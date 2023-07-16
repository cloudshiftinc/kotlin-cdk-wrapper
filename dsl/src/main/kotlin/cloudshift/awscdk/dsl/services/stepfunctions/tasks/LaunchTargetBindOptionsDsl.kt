@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.ITaskDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions

@CdkDslMarker
public class LaunchTargetBindOptionsDsl {
  private val cdkBuilder: LaunchTargetBindOptions.Builder = LaunchTargetBindOptions.builder()

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun taskDefinition(taskDefinition: ITaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): LaunchTargetBindOptions = cdkBuilder.build()
}
