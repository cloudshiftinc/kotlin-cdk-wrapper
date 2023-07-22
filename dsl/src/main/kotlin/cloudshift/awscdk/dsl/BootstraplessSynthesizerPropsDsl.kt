@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.BootstraplessSynthesizerProps

@CdkDslMarker
public class BootstraplessSynthesizerPropsDsl {
  private val cdkBuilder: BootstraplessSynthesizerProps.Builder =
      BootstraplessSynthesizerProps.builder()

  /**
   * @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use.
   */
  public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
    cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
  }

  /**
   * @param deployRoleArn The deploy Role ARN to use.
   */
  public fun deployRoleArn(deployRoleArn: String) {
    cdkBuilder.deployRoleArn(deployRoleArn)
  }

  public fun build(): BootstraplessSynthesizerProps = cdkBuilder.build()
}
