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
public class CfnDashboardSheetPropertyDsl {
    private val cdkBuilder: CfnDashboard.SheetProperty.Builder = CfnDashboard.SheetProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sheetId(sheetId: String) {
        cdkBuilder.sheetId(sheetId)
    }

    public fun build(): CfnDashboard.SheetProperty = cdkBuilder.build()
}
