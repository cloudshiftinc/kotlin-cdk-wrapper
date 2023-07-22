@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker

/**
 * The deployment circuit breaker to use for the service.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .circuitBreaker(DeploymentCircuitBreaker.builder().rollback(true).build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DeploymentCircuitBreakerDsl {
  private val cdkBuilder: DeploymentCircuitBreaker.Builder = DeploymentCircuitBreaker.builder()

  /**
   * @param rollback Whether to enable rollback on deployment failure.
   */
  public fun rollback(rollback: Boolean) {
    cdkBuilder.rollback(rollback)
  }

  public fun build(): DeploymentCircuitBreaker = cdkBuilder.build()
}
