@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The scope configuration for a `FilterGroup` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-filterscopeconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateFilterScopeConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilterScopeConfigurationProperty.Builder =
        CfnTemplate.FilterScopeConfigurationProperty.builder()

    /**
     * @param selectedSheets The configuration for applying a filter to specific sheets.
     */
    public fun selectedSheets(selectedSheets: IResolvable) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    /**
     * @param selectedSheets The configuration for applying a filter to specific sheets.
     */
    public fun selectedSheets(selectedSheets: CfnTemplate.SelectedSheetsFilterScopeConfigurationProperty) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    public fun build(): CfnTemplate.FilterScopeConfigurationProperty = cdkBuilder.build()
}
