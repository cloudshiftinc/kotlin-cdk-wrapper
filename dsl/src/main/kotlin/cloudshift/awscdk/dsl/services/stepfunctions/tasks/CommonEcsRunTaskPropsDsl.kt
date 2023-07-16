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

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
    _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
  }

  public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
    _containerOverrides.addAll(containerOverrides)
  }

  public fun integrationPattern(integrationPattern: ServiceIntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  public fun taskDefinition(taskDefinition: TaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): CommonEcsRunTaskProps {
    if(_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
    return cdkBuilder.build()
  }
}
