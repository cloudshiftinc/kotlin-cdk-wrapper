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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardDefaultNewSheetConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DefaultNewSheetConfigurationProperty.Builder =
        CfnDashboard.DefaultNewSheetConfigurationProperty.builder()

    public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: IResolvable) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: CfnDashboard.DefaultInteractiveLayoutConfigurationProperty) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: IResolvable) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: CfnDashboard.DefaultPaginatedLayoutConfigurationProperty) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    public fun sheetContentType(sheetContentType: String) {
        cdkBuilder.sheetContentType(sheetContentType)
    }

    public fun build(): CfnDashboard.DefaultNewSheetConfigurationProperty = cdkBuilder.build()
}
