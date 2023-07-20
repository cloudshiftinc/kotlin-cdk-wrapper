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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnRotationMonthlySettingPropertyDsl {
    private val cdkBuilder: CfnRotation.MonthlySettingProperty.Builder =
        CfnRotation.MonthlySettingProperty.builder()

    public fun dayOfMonth(dayOfMonth: Number) {
        cdkBuilder.dayOfMonth(dayOfMonth)
    }

    public fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
    }

    public fun build(): CfnRotation.MonthlySettingProperty = cdkBuilder.build()
}
