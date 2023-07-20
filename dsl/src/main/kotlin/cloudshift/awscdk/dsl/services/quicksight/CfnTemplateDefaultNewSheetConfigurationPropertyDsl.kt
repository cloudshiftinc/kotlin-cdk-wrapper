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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateDefaultNewSheetConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.DefaultNewSheetConfigurationProperty.Builder =
        CfnTemplate.DefaultNewSheetConfigurationProperty.builder()

    public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: IResolvable) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: CfnTemplate.DefaultInteractiveLayoutConfigurationProperty) {
        cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
    }

    public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: IResolvable) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: CfnTemplate.DefaultPaginatedLayoutConfigurationProperty) {
        cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
    }

    public fun sheetContentType(sheetContentType: String) {
        cdkBuilder.sheetContentType(sheetContentType)
    }

    public fun build(): CfnTemplate.DefaultNewSheetConfigurationProperty = cdkBuilder.build()
}
