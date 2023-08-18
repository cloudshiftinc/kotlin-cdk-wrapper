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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field options for a table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldOptionsProperty tableFieldOptionsProperty = TableFieldOptionsProperty.builder()
 * .order(List.of("order"))
 * .selectedFieldOptions(List.of(TableFieldOptionProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .customLabel("customLabel")
 * .urlStyling(TableFieldURLConfigurationProperty.builder()
 * .imageConfiguration(TableFieldImageConfigurationProperty.builder()
 * .sizingOptions(TableCellImageSizingConfigurationProperty.builder()
 * .tableCellImageScalingConfiguration("tableCellImageScalingConfiguration")
 * .build())
 * .build())
 * .linkConfiguration(TableFieldLinkConfigurationProperty.builder()
 * .content(TableFieldLinkContentConfigurationProperty.builder()
 * .customIconContent(TableFieldCustomIconContentProperty.builder()
 * .icon("icon")
 * .build())
 * .customTextContent(TableFieldCustomTextContentProperty.builder()
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build())
 * .target("target")
 * .build())
 * .build())
 * .visibility("visibility")
 * .width("width")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablefieldoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisTableFieldOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableFieldOptionsProperty.Builder =
        CfnAnalysis.TableFieldOptionsProperty.builder()

    private val _order: MutableList<String> = mutableListOf()

    private val _selectedFieldOptions: MutableList<Any> = mutableListOf()

    /** @param order The order of field IDs of the field options for a table visual. */
    public fun order(vararg order: String) {
        _order.addAll(listOf(*order))
    }

    /** @param order The order of field IDs of the field options for a table visual. */
    public fun order(order: Collection<String>) {
        _order.addAll(order)
    }

    /** @param selectedFieldOptions The selected field options for the table field options. */
    public fun selectedFieldOptions(vararg selectedFieldOptions: Any) {
        _selectedFieldOptions.addAll(listOf(*selectedFieldOptions))
    }

    /** @param selectedFieldOptions The selected field options for the table field options. */
    public fun selectedFieldOptions(selectedFieldOptions: Collection<Any>) {
        _selectedFieldOptions.addAll(selectedFieldOptions)
    }

    /** @param selectedFieldOptions The selected field options for the table field options. */
    public fun selectedFieldOptions(selectedFieldOptions: IResolvable) {
        cdkBuilder.selectedFieldOptions(selectedFieldOptions)
    }

    public fun build(): CfnAnalysis.TableFieldOptionsProperty {
        if (_order.isNotEmpty()) cdkBuilder.order(_order)
        if (_selectedFieldOptions.isNotEmpty())
            cdkBuilder.selectedFieldOptions(_selectedFieldOptions)
        return cdkBuilder.build()
    }
}
