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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFlowScheduledTriggerPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.ScheduledTriggerPropertiesProperty.Builder =
        CfnFlow.ScheduledTriggerPropertiesProperty.builder()

    public fun dataPullMode(dataPullMode: String) {
        cdkBuilder.dataPullMode(dataPullMode)
    }

    public fun firstExecutionFrom(firstExecutionFrom: Number) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
    }

    public fun flowErrorDeactivationThreshold(flowErrorDeactivationThreshold: Number) {
        cdkBuilder.flowErrorDeactivationThreshold(flowErrorDeactivationThreshold)
    }

    public fun scheduleEndTime(scheduleEndTime: Number) {
        cdkBuilder.scheduleEndTime(scheduleEndTime)
    }

    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun scheduleOffset(scheduleOffset: Number) {
        cdkBuilder.scheduleOffset(scheduleOffset)
    }

    public fun scheduleStartTime(scheduleStartTime: Number) {
        cdkBuilder.scheduleStartTime(scheduleStartTime)
    }

    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnFlow.ScheduledTriggerPropertiesProperty = cdkBuilder.build()
}
