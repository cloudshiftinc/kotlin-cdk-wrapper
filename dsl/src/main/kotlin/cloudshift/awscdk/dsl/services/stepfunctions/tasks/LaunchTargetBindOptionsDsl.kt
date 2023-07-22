@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.ITaskDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions

@CdkDslMarker
public class LaunchTargetBindOptionsDsl {
  private val cdkBuilder: LaunchTargetBindOptions.Builder = LaunchTargetBindOptions.builder()

  /**
   * @param cluster A regional grouping of one or more container instances on which you can run
   * tasks and services.
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param taskDefinition Task definition to run Docker containers in Amazon ECS. 
   */
  public fun taskDefinition(taskDefinition: ITaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): LaunchTargetBindOptions = cdkBuilder.build()
}
