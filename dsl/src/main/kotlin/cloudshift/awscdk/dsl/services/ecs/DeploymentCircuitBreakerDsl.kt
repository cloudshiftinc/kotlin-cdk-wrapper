@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import kotlin.Boolean

@CdkDslMarker
public class DeploymentCircuitBreakerDsl {
    private val cdkBuilder: DeploymentCircuitBreaker.Builder = DeploymentCircuitBreaker.builder()

    public fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
    }

    public fun build(): DeploymentCircuitBreaker = cdkBuilder.build()
}
