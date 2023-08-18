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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The scope configuration for a `FilterGroup` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterScopeConfigurationProperty filterScopeConfigurationProperty =
 * FilterScopeConfigurationProperty.builder()
 * .selectedSheets(SelectedSheetsFilterScopeConfigurationProperty.builder()
 * .sheetVisualScopingConfigurations(List.of(SheetVisualScopingConfigurationProperty.builder()
 * .scope("scope")
 * .sheetId("sheetId")
 * // the properties below are optional
 * .visualIds(List.of("visualIds"))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-filterscopeconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisFilterScopeConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterScopeConfigurationProperty.Builder =
        CfnAnalysis.FilterScopeConfigurationProperty.builder()

    /** @param selectedSheets The configuration for applying a filter to specific sheets. */
    public fun selectedSheets(selectedSheets: IResolvable) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    /** @param selectedSheets The configuration for applying a filter to specific sheets. */
    public fun selectedSheets(
        selectedSheets: CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty
    ) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    public fun build(): CfnAnalysis.FilterScopeConfigurationProperty = cdkBuilder.build()
}
