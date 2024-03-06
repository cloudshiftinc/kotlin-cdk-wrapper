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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.DeploymentStrategyProps
import software.amazon.awscdk.services.appconfig.RolloutStrategy

/**
 * Properties for DeploymentStrategy.
 *
 * Example:
 * ```
 * DeploymentStrategy.Builder.create(this, "MyDeploymentStrategy")
 * .rolloutStrategy(RolloutStrategy.linear(RolloutStrategyProps.builder()
 * .growthFactor(20)
 * .deploymentDuration(Duration.minutes(30))
 * .finalBakeTime(Duration.minutes(30))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class DeploymentStrategyPropsDsl {
    private val cdkBuilder: DeploymentStrategyProps.Builder = DeploymentStrategyProps.builder()

    /** @param deploymentStrategyName A name for the deployment strategy. */
    public fun deploymentStrategyName(deploymentStrategyName: String) {
        cdkBuilder.deploymentStrategyName(deploymentStrategyName)
    }

    /** @param description A description of the deployment strategy. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param rolloutStrategy The rollout strategy for the deployment strategy. You can use
     *   predefined deployment strategies, such as RolloutStrategy.ALL_AT_ONCE,
     *   RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS, or
     *   RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
     */
    public fun rolloutStrategy(rolloutStrategy: RolloutStrategy) {
        cdkBuilder.rolloutStrategy(rolloutStrategy)
    }

    public fun build(): DeploymentStrategyProps = cdkBuilder.build()
}
