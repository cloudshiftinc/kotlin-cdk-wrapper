@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import kotlin.String

/**
 * Information about rotations that recur weekly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * WeeklySettingProperty weeklySettingProperty = WeeklySettingProperty.builder()
 * .dayOfWeek("dayOfWeek")
 * .handOffTime("handOffTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-weeklysetting.html)
 */
@CdkDslMarker
public class CfnRotationWeeklySettingPropertyDsl {
    private val cdkBuilder: CfnRotation.WeeklySettingProperty.Builder =
        CfnRotation.WeeklySettingProperty.builder()

    /**
     * @param dayOfWeek The day of the week when weekly recurring on-call shift rotations begins.
     */
    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    /**
     * @param handOffTime The time of day when a weekly recurring on-call shift rotation begins.
     */
    public fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
    }

    public fun build(): CfnRotation.WeeklySettingProperty = cdkBuilder.build()
}
