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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings

/**
 * Specifies the start and end times that define a time range when messages aren't sent to
 * endpoints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * QuietTimeProperty quietTimeProperty = QuietTimeProperty.builder()
 * .end("end")
 * .start("start")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html)
 */
@CdkDslMarker
public class CfnApplicationSettingsQuietTimePropertyDsl {
    private val cdkBuilder: CfnApplicationSettings.QuietTimeProperty.Builder =
        CfnApplicationSettings.QuietTimeProperty.builder()

    /**
     * @param end The specific time when quiet time ends. This value has to use 24-hour notation and
     *   be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is the
     *   minutes. For example, use `02:30` to represent 2:30 AM, or `14:30` to represent 2:30 PM.
     */
    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    /**
     * @param start The specific time when quiet time begins. This value has to use 24-hour notation
     *   and be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is
     *   the minutes. For example, use `02:30` to represent 2:30 AM, or `14:30` to represent 2:30
     *   PM.
     */
    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnApplicationSettings.QuietTimeProperty = cdkBuilder.build()
}
