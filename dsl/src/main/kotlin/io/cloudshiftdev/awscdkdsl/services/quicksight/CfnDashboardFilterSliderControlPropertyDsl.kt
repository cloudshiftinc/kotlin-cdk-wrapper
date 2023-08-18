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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A control to display a horizontal toggle bar.
 *
 * This is used to change a value by sliding the toggle.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterSliderControlProperty filterSliderControlProperty = FilterSliderControlProperty.builder()
 * .filterControlId("filterControlId")
 * .maximumValue(123)
 * .minimumValue(123)
 * .sourceFilterId("sourceFilterId")
 * .stepSize(123)
 * .title("title")
 * // the properties below are optional
 * .displayOptions(SliderControlDisplayOptionsProperty.builder()
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
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
 * .visibility("visibility")
 * .build())
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-filterslidercontrol.html)
 */
@CdkDslMarker
public class CfnDashboardFilterSliderControlPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterSliderControlProperty.Builder =
        CfnDashboard.FilterSliderControlProperty.builder()

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: CfnDashboard.SliderControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param filterControlId The ID of the `FilterSliderControl` . */
    public fun filterControlId(filterControlId: String) {
        cdkBuilder.filterControlId(filterControlId)
    }

    /** @param maximumValue The smaller value that is displayed at the left of the slider. */
    public fun maximumValue(maximumValue: Number) {
        cdkBuilder.maximumValue(maximumValue)
    }

    /** @param minimumValue The larger value that is displayed at the right of the slider. */
    public fun minimumValue(minimumValue: Number) {
        cdkBuilder.minimumValue(minimumValue)
    }

    /** @param sourceFilterId The source filter ID of the `FilterSliderControl` . */
    public fun sourceFilterId(sourceFilterId: String) {
        cdkBuilder.sourceFilterId(sourceFilterId)
    }

    /** @param stepSize The number of increments that the slider bar is divided into. */
    public fun stepSize(stepSize: Number) {
        cdkBuilder.stepSize(stepSize)
    }

    /** @param title The title of the `FilterSliderControl` . */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * @param type The type of `FilterSliderControl` . Choose one of the following options:.
     * * `SINGLE_POINT` : Filter against(equals) a single data point.
     * * `RANGE` : Filter data that is in a specified range.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDashboard.FilterSliderControlProperty = cdkBuilder.build()
}
