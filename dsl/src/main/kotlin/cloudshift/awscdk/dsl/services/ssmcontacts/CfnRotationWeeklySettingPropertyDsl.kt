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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import kotlin.String

@CdkDslMarker
public class CfnRotationWeeklySettingPropertyDsl {
    private val cdkBuilder: CfnRotation.WeeklySettingProperty.Builder =
        CfnRotation.WeeklySettingProperty.builder()

    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    public fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
    }

    public fun build(): CfnRotation.WeeklySettingProperty = cdkBuilder.build()
}
