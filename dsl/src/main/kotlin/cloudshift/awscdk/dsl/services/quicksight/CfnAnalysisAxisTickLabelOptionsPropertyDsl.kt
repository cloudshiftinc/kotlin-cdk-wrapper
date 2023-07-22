@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The tick label options of an axis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AxisTickLabelOptionsProperty axisTickLabelOptionsProperty =
 * AxisTickLabelOptionsProperty.builder()
 * .labelOptions(LabelOptionsProperty.builder()
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
 * .rotationAngle(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-axisticklabeloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisAxisTickLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisTickLabelOptionsProperty.Builder =
      CfnAnalysis.AxisTickLabelOptionsProperty.builder()

  /**
   * @param labelOptions Determines whether or not the axis ticks are visible.
   */
  public fun labelOptions(labelOptions: IResolvable) {
    cdkBuilder.labelOptions(labelOptions)
  }

  /**
   * @param labelOptions Determines whether or not the axis ticks are visible.
   */
  public fun labelOptions(labelOptions: CfnAnalysis.LabelOptionsProperty) {
    cdkBuilder.labelOptions(labelOptions)
  }

  /**
   * @param rotationAngle The rotation angle of the axis tick labels.
   */
  public fun rotationAngle(rotationAngle: Number) {
    cdkBuilder.rotationAngle(rotationAngle)
  }

  public fun build(): CfnAnalysis.AxisTickLabelOptionsProperty = cdkBuilder.build()
}
