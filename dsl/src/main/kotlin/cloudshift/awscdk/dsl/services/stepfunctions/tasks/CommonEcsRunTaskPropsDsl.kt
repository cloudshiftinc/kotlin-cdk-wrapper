@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern
import software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride

@CdkDslMarker
public class CommonEcsRunTaskPropsDsl {
  private val cdkBuilder: CommonEcsRunTaskProps.Builder = CommonEcsRunTaskProps.builder()

  private val _containerOverrides: MutableList<ContainerOverride> = mutableListOf()

  /**
   * @param cluster The topic to run the task on. 
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param containerOverrides Container setting overrides.
   * Key is the name of the container to override, value is the
   * values you want to override.
   */
  public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
    _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
  }

  /**
   * @param containerOverrides Container setting overrides.
   * Key is the name of the container to override, value is the
   * values you want to override.
   */
  public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
    _containerOverrides.addAll(containerOverrides)
  }

  /**
   * @param integrationPattern The service integration pattern indicates different ways to call
   * RunTask in ECS.
   * The valid value for Lambda is FIRE_AND_FORGET, SYNC and WAIT_FOR_TASK_TOKEN.
   */
  public fun integrationPattern(integrationPattern: ServiceIntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  /**
   * @param taskDefinition Task Definition used for running tasks in the service. 
   * Note: this must be TaskDefinition, and not ITaskDefinition,
   * as it requires properties that are not known for imported task definitions
   * If you want to run a RunTask with an imported task definition,
   * consider using CustomState
   */
  public fun taskDefinition(taskDefinition: TaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): CommonEcsRunTaskProps {
    if(_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
    return cdkBuilder.build()
  }
}
