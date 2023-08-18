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

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting

/**
 * Define a traffic routing config of type 'TimeBasedCanary'.
 *
 * Example:
 * ```
 * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
 * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
 * .interval(Duration.minutes(15))
 * .percentage(5)
 * .build())
 * .deploymentConfigName("MyDeploymentConfig")
 * .build();
 * ```
 */
@CdkDslMarker
public class TimeBasedCanaryTrafficRoutingDsl {
    private val cdkBuilder: TimeBasedCanaryTrafficRouting.Builder =
        TimeBasedCanaryTrafficRouting.Builder.create()

    /**
     * The amount of time between traffic shifts.
     *
     * @param interval The amount of time between traffic shifts.
     */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /**
     * The percentage to increase traffic on each traffic shift.
     *
     * @param percentage The percentage to increase traffic on each traffic shift.
     */
    public fun percentage(percentage: Number) {
        cdkBuilder.percentage(percentage)
    }

    public fun build(): TimeBasedCanaryTrafficRouting = cdkBuilder.build()
}
