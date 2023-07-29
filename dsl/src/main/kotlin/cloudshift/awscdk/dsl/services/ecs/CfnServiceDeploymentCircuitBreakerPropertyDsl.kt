@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The deployment circuit breaker can only be used for services using the rolling update ( `ECS` )
 * deployment type.
 *
 * The *deployment circuit breaker* determines whether a service deployment will fail if the service
 * can't reach a steady state. If it is turned on, a service deployment will transition to a failed
 * state and stop launching new tasks. You can also configure Amazon ECS to roll back your service
 * to the last completed deployment after a failure. For more information, see
 * [Rolling update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * For more information about API failure reasons, see
 * [API failure reasons](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/api_failures_messages.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * DeploymentCircuitBreakerProperty deploymentCircuitBreakerProperty =
 * DeploymentCircuitBreakerProperty.builder()
 * .enable(false)
 * .rollback(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcircuitbreaker.html)
 */
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
     *   service deployment fails. If rollback is on, when a service deployment fails, the service
     *   is rolled back to the last deployment that completed successfully.
     */
    public fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
    }

    /**
     * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
     *   service deployment fails. If rollback is on, when a service deployment fails, the service
     *   is rolled back to the last deployment that completed successfully.
     */
    public fun rollback(rollback: IResolvable) {
        cdkBuilder.rollback(rollback)
    }

    public fun build(): CfnService.DeploymentCircuitBreakerProperty = cdkBuilder.build()
}
