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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.RollingUpdateOptions
import software.amazon.awscdk.services.autoscaling.ScalingProcess

/**
 * Options for customizing the rolling update.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * RollingUpdateOptions rollingUpdateOptions = RollingUpdateOptions.builder()
 * .maxBatchSize(123)
 * .minInstancesInService(123)
 * .minSuccessPercentage(123)
 * .pauseTime(Duration.minutes(30))
 * .suspendProcesses(List.of(ScalingProcess.LAUNCH))
 * .waitOnResourceSignals(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class RollingUpdateOptionsDsl {
    private val cdkBuilder: RollingUpdateOptions.Builder = RollingUpdateOptions.builder()

    private val _suspendProcesses: MutableList<ScalingProcess> = mutableListOf()

    /**
     * @param maxBatchSize The maximum number of instances that AWS CloudFormation updates at once.
     *   This number affects the speed of the replacement.
     */
    public fun maxBatchSize(maxBatchSize: Number) {
        cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * @param minInstancesInService The minimum number of instances that must be in service before
     *   more instances are replaced. This number affects the speed of the replacement.
     */
    public fun minInstancesInService(minInstancesInService: Number) {
        cdkBuilder.minInstancesInService(minInstancesInService)
    }

    /**
     * @param minSuccessPercentage The percentage of instances that must signal success for the
     *   update to succeed.
     */
    public fun minSuccessPercentage(minSuccessPercentage: Number) {
        cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    /** @param pauseTime The pause time after making a change to a batch of instances. */
    public fun pauseTime(pauseTime: Duration) {
        cdkBuilder.pauseTime(pauseTime)
    }

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     *   update. Suspending processes prevents Auto Scaling from interfering with a stack update.
     */
    public fun suspendProcesses(vararg suspendProcesses: ScalingProcess) {
        _suspendProcesses.addAll(listOf(*suspendProcesses))
    }

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     *   update. Suspending processes prevents Auto Scaling from interfering with a stack update.
     */
    public fun suspendProcesses(suspendProcesses: Collection<ScalingProcess>) {
        _suspendProcesses.addAll(suspendProcesses)
    }

    /**
     * @param waitOnResourceSignals Specifies whether the Auto Scaling group waits on signals from
     *   new instances during an update.
     */
    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
        cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): RollingUpdateOptions {
        if (_suspendProcesses.isNotEmpty()) cdkBuilder.suspendProcesses(_suspendProcesses)
        return cdkBuilder.build()
    }
}
