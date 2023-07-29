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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

/**
 * Information about on-call rotations that recur monthly.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * MonthlySettingProperty monthlySettingProperty = MonthlySettingProperty.builder()
 * .dayOfMonth(123)
 * .handOffTime("handOffTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-monthlysetting.html)
 */
@CdkDslMarker
public class CfnRotationMonthlySettingPropertyDsl {
    private val cdkBuilder: CfnRotation.MonthlySettingProperty.Builder =
        CfnRotation.MonthlySettingProperty.builder()

    /** @param dayOfMonth The day of the month when monthly recurring on-call rotations begin. */
    public fun dayOfMonth(dayOfMonth: Number) {
        cdkBuilder.dayOfMonth(dayOfMonth)
    }

    /**
     * @param handOffTime The time of day when a monthly recurring on-call shift rotation begins.
     */
    public fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
    }

    public fun build(): CfnRotation.MonthlySettingProperty = cdkBuilder.build()
}
