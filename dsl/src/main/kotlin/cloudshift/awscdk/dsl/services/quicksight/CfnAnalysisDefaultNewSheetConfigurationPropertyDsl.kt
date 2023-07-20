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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisDefaultNewSheetConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DefaultNewSheetConfigurationProperty.Builder =
        CfnAnalysis.DefaultNewSheetConfigurationProperty.builder()

    public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: IResolvable) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: IResolvable) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: CfnAnalysis.DefaultPaginatedLayoutConfigurationProperty) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    public fun sheetContentType(sheetContentType: String) {
        cdkBuilder.sheetContentType(sheetContentType)
    }

    public fun build(): CfnAnalysis.DefaultNewSheetConfigurationProperty = cdkBuilder.build()
}
