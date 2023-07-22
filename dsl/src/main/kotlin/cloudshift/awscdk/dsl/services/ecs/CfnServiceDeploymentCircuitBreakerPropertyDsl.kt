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

  /**
   * @param enable Determines whether to use the deployment circuit breaker logic for the service. 
   */
  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param enable Determines whether to use the deployment circuit breaker logic for the service. 
   */
  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
   * service deployment fails. 
   * If rollback is on, when a service deployment fails, the service is rolled back to the last
   * deployment that completed successfully.
   */
  public fun rollback(rollback: Boolean) {
    cdkBuilder.rollback(rollback)
  }

  /**
   * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
   * service deployment fails. 
   * If rollback is on, when a service deployment fails, the service is rolled back to the last
   * deployment that completed successfully.
   */
  public fun rollback(rollback: IResolvable) {
    cdkBuilder.rollback(rollback)
  }

  public fun build(): CfnService.DeploymentCircuitBreakerProperty = cdkBuilder.build()
}
