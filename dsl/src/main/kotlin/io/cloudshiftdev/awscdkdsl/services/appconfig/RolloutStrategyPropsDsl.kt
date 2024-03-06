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
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appconfig.RolloutStrategyProps

/**
 * Properties for the Rollout Strategy.
 *
 * Example:
 * ```
 * Application application;
 * HostedConfiguration.Builder.create(this, "MyHostedConfiguration")
 * .application(application)
 * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
 * .deploymentStrategy(DeploymentStrategy.Builder.create(this, "MyDeploymentStrategy")
 * .rolloutStrategy(RolloutStrategy.linear(RolloutStrategyProps.builder()
 * .growthFactor(15)
 * .deploymentDuration(Duration.minutes(30))
 * .finalBakeTime(Duration.minutes(15))
 * .build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class RolloutStrategyPropsDsl {
    private val cdkBuilder: RolloutStrategyProps.Builder = RolloutStrategyProps.builder()

    /**
     * @param deploymentDuration The deployment duration of the deployment strategy. This defines
     *   the total amount of time for a deployment to last.
     */
    public fun deploymentDuration(deploymentDuration: Duration) {
        cdkBuilder.deploymentDuration(deploymentDuration)
    }

    /**
     * @param finalBakeTime The final bake time of the deployment strategy. This setting specifies
     *   the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after the
     *   configuration has been deployed to 100% of its targets, before considering the deployment
     *   to be complete. If an alarm is triggered during this time, AWS AppConfig rolls back the
     *   deployment.
     */
    public fun finalBakeTime(finalBakeTime: Duration) {
        cdkBuilder.finalBakeTime(finalBakeTime)
    }

    /**
     * @param growthFactor The growth factor of the deployment strategy. This defines the percentage
     *   of targets to receive a deployed configuration during each interval.
     */
    public fun growthFactor(growthFactor: Number) {
        cdkBuilder.growthFactor(growthFactor)
    }

    public fun build(): RolloutStrategyProps = cdkBuilder.build()
}
