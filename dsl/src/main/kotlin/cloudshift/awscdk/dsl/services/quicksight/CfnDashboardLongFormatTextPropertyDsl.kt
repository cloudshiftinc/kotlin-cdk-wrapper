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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardLongFormatTextPropertyDsl {
    private val cdkBuilder: CfnDashboard.LongFormatTextProperty.Builder =
        CfnDashboard.LongFormatTextProperty.builder()

    public fun plainText(plainText: String) {
        cdkBuilder.plainText(plainText)
    }

    public fun richText(richText: String) {
        cdkBuilder.richText(richText)
    }

    public fun build(): CfnDashboard.LongFormatTextProperty = cdkBuilder.build()
}
