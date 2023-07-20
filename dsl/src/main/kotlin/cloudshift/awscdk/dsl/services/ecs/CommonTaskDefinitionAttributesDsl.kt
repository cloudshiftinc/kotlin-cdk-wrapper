@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CommonTaskDefinitionAttributesDsl {
  private val cdkBuilder: CommonTaskDefinitionAttributes.Builder =
      CommonTaskDefinitionAttributes.builder()

  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  public fun networkMode(networkMode: NetworkMode) {
    cdkBuilder.networkMode(networkMode)
  }

  public fun taskDefinitionArn(taskDefinitionArn: String) {
    cdkBuilder.taskDefinitionArn(taskDefinitionArn)
  }

  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  public fun build(): CommonTaskDefinitionAttributes = cdkBuilder.build()
}
