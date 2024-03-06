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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The display options of a control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimePickerControlDisplayOptionsProperty dateTimePickerControlDisplayOptionsProperty =
 * DateTimePickerControlDisplayOptionsProperty.builder()
 * .dateTimeFormat("dateTimeFormat")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-datetimepickercontroldisplayoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisDateTimePickerControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DateTimePickerControlDisplayOptionsProperty.Builder =
        CfnAnalysis.DateTimePickerControlDisplayOptionsProperty.builder()

    /** @param dateTimeFormat Customize how dates are formatted in controls. */
    public fun dateTimeFormat(dateTimeFormat: String) {
        cdkBuilder.dateTimeFormat(dateTimeFormat)
    }

    /** @param infoIconLabelOptions The configuration of info icon label options. */
    public fun infoIconLabelOptions(infoIconLabelOptions: IResolvable) {
        cdkBuilder.infoIconLabelOptions(infoIconLabelOptions)
    }

    /** @param infoIconLabelOptions The configuration of info icon label options. */
    public fun infoIconLabelOptions(
        infoIconLabelOptions: CfnAnalysis.SheetControlInfoIconLabelOptionsProperty
    ) {
        cdkBuilder.infoIconLabelOptions(infoIconLabelOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnAnalysis.DateTimePickerControlDisplayOptionsProperty = cdkBuilder.build()
}
