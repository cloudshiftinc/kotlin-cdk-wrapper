@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.BootstraplessSynthesizer

@CdkDslMarker
public class BootstraplessSynthesizerDsl {
  private val cdkBuilder: BootstraplessSynthesizer.Builder =
      BootstraplessSynthesizer.Builder.create()

  /**
   * The CFN execution Role ARN to use.
   *
   * Default: - No CloudFormation role (use CLI credentials)
   *
   * @param cloudFormationExecutionRoleArn The CFN execution Role ARN to use. 
   */
  public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
    cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
  }

  /**
   * The deploy Role ARN to use.
   *
   * Default: - No deploy role (use CLI credentials)
   *
   * @param deployRoleArn The deploy Role ARN to use. 
   */
  public fun deployRoleArn(deployRoleArn: String) {
    cdkBuilder.deployRoleArn(deployRoleArn)
  }

  public fun build(): BootstraplessSynthesizer = cdkBuilder.build()
}
