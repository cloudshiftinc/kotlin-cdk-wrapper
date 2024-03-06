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
import software.amazon.awscdk.services.appconfig.DeploymentStrategy
import software.amazon.awscdk.services.appconfig.RolloutStrategy
import software.constructs.Construct

/**
 * An AWS AppConfig deployment strategy.
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
 *
 * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html)
 */
@CdkDslMarker
public class DeploymentStrategyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DeploymentStrategy.Builder =
        DeploymentStrategy.Builder.create(scope, id)

    /**
     * A name for the deployment strategy.
     *
     * Default: - A name is generated.
     *
     * @param deploymentStrategyName A name for the deployment strategy.
     */
    public fun deploymentStrategyName(deploymentStrategyName: String) {
        cdkBuilder.deploymentStrategyName(deploymentStrategyName)
    }

    /**
     * A description of the deployment strategy.
     *
     * Default: - No description.
     *
     * @param description A description of the deployment strategy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The rollout strategy for the deployment strategy.
     *
     * You can use predefined deployment strategies, such as RolloutStrategy.ALL_AT_ONCE,
     * RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS, or
     * RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
     *
     * @param rolloutStrategy The rollout strategy for the deployment strategy.
     */
    public fun rolloutStrategy(rolloutStrategy: RolloutStrategy) {
        cdkBuilder.rolloutStrategy(rolloutStrategy)
    }

    public fun build(): DeploymentStrategy = cdkBuilder.build()
}
