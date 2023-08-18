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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * ScheduleEventProperty scheduleEventProperty = ScheduleEventProperty.builder()
 * .schedule("schedule")
 * // the properties below are optional
 * .description("description")
 * .enabled(false)
 * .input("input")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-scheduleevent.html)
 */
@CdkDslMarker
public class CfnFunctionScheduleEventPropertyDsl {
    private val cdkBuilder: CfnFunction.ScheduleEventProperty.Builder =
        CfnFunction.ScheduleEventProperty.builder()

    /** @param description the value to be set. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param input the value to be set. */
    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    /** @param name the value to be set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param schedule the value to be set. */
    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    public fun build(): CfnFunction.ScheduleEventProperty = cdkBuilder.build()
}
