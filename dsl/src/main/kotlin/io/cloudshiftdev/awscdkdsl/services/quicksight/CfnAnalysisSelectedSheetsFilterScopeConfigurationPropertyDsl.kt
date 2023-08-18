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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration for applying a filter to specific sheets or visuals.
 *
 * You can apply this filter to multiple visuals that are on one sheet or to all visuals on a sheet.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SelectedSheetsFilterScopeConfigurationProperty selectedSheetsFilterScopeConfigurationProperty =
 * SelectedSheetsFilterScopeConfigurationProperty.builder()
 * .sheetVisualScopingConfigurations(List.of(SheetVisualScopingConfigurationProperty.builder()
 * .scope("scope")
 * .sheetId("sheetId")
 * // the properties below are optional
 * .visualIds(List.of("visualIds"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-selectedsheetsfilterscopeconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisSelectedSheetsFilterScopeConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty.Builder =
        CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty.builder()

    private val _sheetVisualScopingConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param sheetVisualScopingConfigurations The sheet ID and visual IDs of the sheet and visuals
     *   that the filter is applied to.
     */
    public fun sheetVisualScopingConfigurations(vararg sheetVisualScopingConfigurations: Any) {
        _sheetVisualScopingConfigurations.addAll(listOf(*sheetVisualScopingConfigurations))
    }

    /**
     * @param sheetVisualScopingConfigurations The sheet ID and visual IDs of the sheet and visuals
     *   that the filter is applied to.
     */
    public fun sheetVisualScopingConfigurations(sheetVisualScopingConfigurations: Collection<Any>) {
        _sheetVisualScopingConfigurations.addAll(sheetVisualScopingConfigurations)
    }

    /**
     * @param sheetVisualScopingConfigurations The sheet ID and visual IDs of the sheet and visuals
     *   that the filter is applied to.
     */
    public fun sheetVisualScopingConfigurations(sheetVisualScopingConfigurations: IResolvable) {
        cdkBuilder.sheetVisualScopingConfigurations(sheetVisualScopingConfigurations)
    }

    public fun build(): CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty {
        if (_sheetVisualScopingConfigurations.isNotEmpty())
            cdkBuilder.sheetVisualScopingConfigurations(_sheetVisualScopingConfigurations)
        return cdkBuilder.build()
    }
}
