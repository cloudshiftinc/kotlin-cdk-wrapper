@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionContainerDependencyPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.ContainerDependencyProperty.Builder =
      CfnTaskDefinition.ContainerDependencyProperty.builder()

  /**
   * @param condition The dependency condition of the container. The following are the available
   * conditions and their behavior:.
   * * `START` - This condition emulates the behavior of links and volumes today. It validates that
   * a dependent container is started before permitting other containers to start.
   * * `COMPLETE` - This condition validates that a dependent container runs to completion (exits)
   * before permitting other containers to start. This can be useful for nonessential containers that
   * run a script and then exit. This condition can't be set on an essential container.
   * * `SUCCESS` - This condition is the same as `COMPLETE` , but it also requires that the
   * container exits with a `zero` status. This condition can't be set on an essential container.
   * * `HEALTHY` - This condition validates that the dependent container passes its Docker health
   * check before permitting other containers to start. This requires that the dependent container has
   * health checks configured. This condition is confirmed only at task startup.
   */
  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param containerName The name of a container.
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  public fun build(): CfnTaskDefinition.ContainerDependencyProperty = cdkBuilder.build()
}
