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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * Object allSheets;
 * FilterScopeConfigurationProperty filterScopeConfigurationProperty =
 * FilterScopeConfigurationProperty.builder()
 * .allSheets(allSheets)
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

    /** @param allSheets The configuration for applying a filter to all sheets. */
    public fun allSheets(allSheets: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(allSheets)
        cdkBuilder.allSheets(builder.map)
    }

    /** @param allSheets The configuration for applying a filter to all sheets. */
    public fun allSheets(allSheets: Any) {
        cdkBuilder.allSheets(allSheets)
    }

    /** @param selectedSheets The configuration for applying a filter to specific sheets. */
    public fun selectedSheets(selectedSheets: IResolvable) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    /** @param selectedSheets The configuration for applying a filter to specific sheets. */
    public fun selectedSheets(
        selectedSheets: CfnTemplate.SelectedSheetsFilterScopeConfigurationProperty
    ) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    public fun build(): CfnTemplate.FilterScopeConfigurationProperty = cdkBuilder.build()
}
