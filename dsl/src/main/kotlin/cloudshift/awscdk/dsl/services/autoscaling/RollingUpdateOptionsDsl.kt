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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.RollingUpdateOptions
import software.amazon.awscdk.services.autoscaling.ScalingProcess
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class RollingUpdateOptionsDsl {
    private val cdkBuilder: RollingUpdateOptions.Builder = RollingUpdateOptions.builder()

    private val _suspendProcesses: MutableList<ScalingProcess> = mutableListOf()

    public fun maxBatchSize(maxBatchSize: Number) {
        cdkBuilder.maxBatchSize(maxBatchSize)
    }

    public fun minInstancesInService(minInstancesInService: Number) {
        cdkBuilder.minInstancesInService(minInstancesInService)
    }

    public fun minSuccessPercentage(minSuccessPercentage: Number) {
        cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    public fun pauseTime(pauseTime: Duration) {
        cdkBuilder.pauseTime(pauseTime)
    }

    public fun suspendProcesses(vararg suspendProcesses: ScalingProcess) {
        _suspendProcesses.addAll(listOf(*suspendProcesses))
    }

    public fun suspendProcesses(suspendProcesses: Collection<ScalingProcess>) {
        _suspendProcesses.addAll(suspendProcesses)
    }

    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
        cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): RollingUpdateOptions {
        if (_suspendProcesses.isNotEmpty()) cdkBuilder.suspendProcesses(_suspendProcesses)
        return cdkBuilder.build()
    }
}
