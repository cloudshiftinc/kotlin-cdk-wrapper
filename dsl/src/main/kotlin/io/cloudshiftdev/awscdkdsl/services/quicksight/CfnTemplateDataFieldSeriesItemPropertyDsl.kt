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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The data field series item configuration of a line chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataFieldSeriesItemProperty dataFieldSeriesItemProperty = DataFieldSeriesItemProperty.builder()
 * .axisBinding("axisBinding")
 * .fieldId("fieldId")
 * // the properties below are optional
 * .fieldValue("fieldValue")
 * .settings(LineChartSeriesSettingsProperty.builder()
 * .lineStyleSettings(LineChartLineStyleSettingsProperty.builder()
 * .lineInterpolation("lineInterpolation")
 * .lineStyle("lineStyle")
 * .lineVisibility("lineVisibility")
 * .lineWidth("lineWidth")
 * .build())
 * .markerStyleSettings(LineChartMarkerStyleSettingsProperty.builder()
 * .markerColor("markerColor")
 * .markerShape("markerShape")
 * .markerSize("markerSize")
 * .markerVisibility("markerVisibility")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-datafieldseriesitem.html)
 */
@CdkDslMarker
public class CfnTemplateDataFieldSeriesItemPropertyDsl {
    private val cdkBuilder: CfnTemplate.DataFieldSeriesItemProperty.Builder =
        CfnTemplate.DataFieldSeriesItemProperty.builder()

    /** @param axisBinding The axis that you are binding the field to. */
    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    /** @param fieldId The field ID of the field that you are setting the axis binding to. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /** @param fieldValue The field value of the field that you are setting the axis binding to. */
    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    /**
     * @param settings The options that determine the presentation of line series associated to the
     *   field.
     */
    public fun settings(settings: IResolvable) {
        cdkBuilder.settings(settings)
    }

    /**
     * @param settings The options that determine the presentation of line series associated to the
     *   field.
     */
    public fun settings(settings: CfnTemplate.LineChartSeriesSettingsProperty) {
        cdkBuilder.settings(settings)
    }

    public fun build(): CfnTemplate.DataFieldSeriesItemProperty = cdkBuilder.build()
}
