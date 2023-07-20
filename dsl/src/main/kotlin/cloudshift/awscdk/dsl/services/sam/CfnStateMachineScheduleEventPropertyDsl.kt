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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnStateMachine
import kotlin.String

@CdkDslMarker
public class CfnStateMachineScheduleEventPropertyDsl {
    private val cdkBuilder: CfnStateMachine.ScheduleEventProperty.Builder =
        CfnStateMachine.ScheduleEventProperty.builder()

    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    public fun build(): CfnStateMachine.ScheduleEventProperty = cdkBuilder.build()
}
