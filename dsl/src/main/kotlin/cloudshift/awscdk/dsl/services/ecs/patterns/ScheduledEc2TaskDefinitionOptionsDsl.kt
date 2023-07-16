@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions

@CdkDslMarker
public class ScheduledEc2TaskDefinitionOptionsDsl {
  private val cdkBuilder: ScheduledEc2TaskDefinitionOptions.Builder =
      ScheduledEc2TaskDefinitionOptions.builder()

  public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): ScheduledEc2TaskDefinitionOptions = cdkBuilder.build()
}
