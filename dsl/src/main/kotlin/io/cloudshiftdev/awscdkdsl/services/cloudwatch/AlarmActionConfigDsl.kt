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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.AlarmActionConfig

/**
 * Properties for an alarm action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * AlarmActionConfig alarmActionConfig = AlarmActionConfig.builder()
 * .alarmActionArn("alarmActionArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class AlarmActionConfigDsl {
    private val cdkBuilder: AlarmActionConfig.Builder = AlarmActionConfig.builder()

    /** @param alarmActionArn Return the ARN that should be used for a CloudWatch Alarm action. */
    public fun alarmActionArn(alarmActionArn: String) {
        cdkBuilder.alarmActionArn(alarmActionArn)
    }

    public fun build(): AlarmActionConfig = cdkBuilder.build()
}
