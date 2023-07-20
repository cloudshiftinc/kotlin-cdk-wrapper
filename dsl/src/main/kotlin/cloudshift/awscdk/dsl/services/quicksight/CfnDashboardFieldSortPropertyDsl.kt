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
public class CfnDashboardFieldSortPropertyDsl {
    private val cdkBuilder: CfnDashboard.FieldSortProperty.Builder =
        CfnDashboard.FieldSortProperty.builder()

    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnDashboard.FieldSortProperty = cdkBuilder.build()
}
