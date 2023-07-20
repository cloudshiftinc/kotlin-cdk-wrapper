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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnAutoScalingRollingUpdate
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAutoScalingRollingUpdateDsl {
    private val cdkBuilder: CfnAutoScalingRollingUpdate.Builder =
        CfnAutoScalingRollingUpdate.builder()

    private val _suspendProcesses: MutableList<String> = mutableListOf()

    public fun maxBatchSize(maxBatchSize: Number) {
        cdkBuilder.maxBatchSize(maxBatchSize)
    }

    public fun minInstancesInService(minInstancesInService: Number) {
        cdkBuilder.minInstancesInService(minInstancesInService)
    }

    public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
        cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
    }

    public fun pauseTime(pauseTime: String) {
        cdkBuilder.pauseTime(pauseTime)
    }

    public fun suspendProcesses(vararg suspendProcesses: String) {
        _suspendProcesses.addAll(listOf(*suspendProcesses))
    }

    public fun suspendProcesses(suspendProcesses: Collection<String>) {
        _suspendProcesses.addAll(suspendProcesses)
    }

    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
        cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): CfnAutoScalingRollingUpdate {
        if (_suspendProcesses.isNotEmpty()) cdkBuilder.suspendProcesses(_suspendProcesses)
        return cdkBuilder.build()
    }
}
