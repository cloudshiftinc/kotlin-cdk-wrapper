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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * ScheduleEventProperty scheduleEventProperty = ScheduleEventProperty.builder()
 * .schedule("schedule")
 * // the properties below are optional
 * .input("input")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-scheduleevent.html)
 */
@CdkDslMarker
public class CfnStateMachineScheduleEventPropertyDsl {
    private val cdkBuilder: CfnStateMachine.ScheduleEventProperty.Builder =
        CfnStateMachine.ScheduleEventProperty.builder()

    /** @param input the value to be set. */
    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    /** @param schedule the value to be set. */
    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    public fun build(): CfnStateMachine.ScheduleEventProperty = cdkBuilder.build()
}
