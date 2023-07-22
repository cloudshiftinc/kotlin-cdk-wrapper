@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions

@CdkDslMarker
public class ScheduledFargateTaskDefinitionOptionsDsl {
  private val cdkBuilder: ScheduledFargateTaskDefinitionOptions.Builder =
      ScheduledFargateTaskDefinitionOptions.builder()

  /**
   * @param taskDefinition The task definition to use for tasks in the service. Image or
   * taskDefinition must be specified, but not both. 
   * [disable-awslint:ref-via-interface]
   */
  public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): ScheduledFargateTaskDefinitionOptions = cdkBuilder.build()
}
