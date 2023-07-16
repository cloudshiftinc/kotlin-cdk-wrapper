@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServiceDeploymentCircuitBreakerPropertyDsl {
  private val cdkBuilder: CfnService.DeploymentCircuitBreakerProperty.Builder =
      CfnService.DeploymentCircuitBreakerProperty.builder()

  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  public fun rollback(rollback: Boolean) {
    cdkBuilder.rollback(rollback)
  }

  public fun rollback(rollback: IResolvable) {
    cdkBuilder.rollback(rollback)
  }

  public fun build(): CfnService.DeploymentCircuitBreakerProperty = cdkBuilder.build()
}
