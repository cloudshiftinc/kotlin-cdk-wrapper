@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ContainerDependency
import software.amazon.awscdk.services.ecs.ContainerDependencyCondition

@CdkDslMarker
public class ContainerDependencyDsl {
  private val cdkBuilder: ContainerDependency.Builder = ContainerDependency.builder()

  /**
   * @param condition The state the container needs to be in to satisfy the dependency and proceed
   * with startup.
   * Valid values are ContainerDependencyCondition.START, ContainerDependencyCondition.COMPLETE,
   * ContainerDependencyCondition.SUCCESS and ContainerDependencyCondition.HEALTHY.
   */
  public fun condition(condition: ContainerDependencyCondition) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param container The container to depend on. 
   */
  public fun container(container: ContainerDefinition) {
    cdkBuilder.container(container)
  }

  public fun build(): ContainerDependency = cdkBuilder.build()
}
