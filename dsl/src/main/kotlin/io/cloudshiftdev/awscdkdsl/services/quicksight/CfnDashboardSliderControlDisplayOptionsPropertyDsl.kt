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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The display options of a control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SliderControlDisplayOptionsProperty sliderControlDisplayOptionsProperty =
 * SliderControlDisplayOptionsProperty.builder()
 * .infoIconLabelOptions(SheetControlInfoIconLabelOptionsProperty.builder()
 * .infoIconText("infoIconText")
 * .visibility("visibility")
 * .build())
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-slidercontroldisplayoptions.html)
 */
@CdkDslMarker
public class CfnDashboardSliderControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SliderControlDisplayOptionsProperty.Builder =
        CfnDashboard.SliderControlDisplayOptionsProperty.builder()

    /** @param infoIconLabelOptions The configuration of info icon label options. */
    public fun infoIconLabelOptions(infoIconLabelOptions: IResolvable) {
        cdkBuilder.infoIconLabelOptions(infoIconLabelOptions)
    }

    /** @param infoIconLabelOptions The configuration of info icon label options. */
    public fun infoIconLabelOptions(
        infoIconLabelOptions: CfnDashboard.SheetControlInfoIconLabelOptionsProperty
    ) {
        cdkBuilder.infoIconLabelOptions(infoIconLabelOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnDashboard.SliderControlDisplayOptionsProperty = cdkBuilder.build()
}
