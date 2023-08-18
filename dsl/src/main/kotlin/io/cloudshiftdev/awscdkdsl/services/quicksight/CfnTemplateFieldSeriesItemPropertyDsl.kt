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
 * The field series item configuration of a line chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FieldSeriesItemProperty fieldSeriesItemProperty = FieldSeriesItemProperty.builder()
 * .axisBinding("axisBinding")
 * .fieldId("fieldId")
 * // the properties below are optional
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-fieldseriesitem.html)
 */
@CdkDslMarker
public class CfnTemplateFieldSeriesItemPropertyDsl {
    private val cdkBuilder: CfnTemplate.FieldSeriesItemProperty.Builder =
        CfnTemplate.FieldSeriesItemProperty.builder()

    /** @param axisBinding The axis that you are binding the field to. */
    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    /** @param fieldId The field ID of the field for which you are setting the axis binding. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
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

    public fun build(): CfnTemplate.FieldSeriesItemProperty = cdkBuilder.build()
}
