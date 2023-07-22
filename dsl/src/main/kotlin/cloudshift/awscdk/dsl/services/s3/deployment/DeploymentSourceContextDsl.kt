@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext

@CdkDslMarker
public class DeploymentSourceContextDsl {
  private val cdkBuilder: DeploymentSourceContext.Builder = DeploymentSourceContext.builder()

  /**
   * @param handlerRole The role for the handler. 
   */
  public fun handlerRole(handlerRole: IRole) {
    cdkBuilder.handlerRole(handlerRole)
  }

  public fun build(): DeploymentSourceContext = cdkBuilder.build()
}
