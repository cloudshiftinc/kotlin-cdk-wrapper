@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The display options for the axis label.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object dataDriven;
 * AxisDisplayOptionsProperty axisDisplayOptionsProperty = AxisDisplayOptionsProperty.builder()
 * .axisLineVisibility("axisLineVisibility")
 * .axisOffset("axisOffset")
 * .dataOptions(AxisDataOptionsProperty.builder()
 * .dateAxisOptions(DateAxisOptionsProperty.builder()
 * .missingDateVisibility("missingDateVisibility")
 * .build())
 * .numericAxisOptions(NumericAxisOptionsProperty.builder()
 * .range(AxisDisplayRangeProperty.builder()
 * .dataDriven(dataDriven)
 * .minMax(AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .scale(AxisScaleProperty.builder()
 * .linear(AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build())
 * .logarithmic(AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * .gridLineVisibility("gridLineVisibility")
 * .scrollbarOptions(ScrollBarOptionsProperty.builder()
 * .visibility("visibility")
 * .visibleRange(VisibleRangeOptionsProperty.builder()
 * .percentRange(PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build())
 * .build())
 * .tickLabelOptions(AxisTickLabelOptionsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-axisdisplayoptions.html)
 */
@CdkDslMarker
public class CfnTemplateAxisDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisDisplayOptionsProperty.Builder =
      CfnTemplate.AxisDisplayOptionsProperty.builder()

  /**
   * @param axisLineVisibility Determines whether or not the axis line is visible.
   */
  public fun axisLineVisibility(axisLineVisibility: String) {
    cdkBuilder.axisLineVisibility(axisLineVisibility)
  }

  /**
   * @param axisOffset The offset value that determines the starting placement of the axis within a
   * visual's bounds.
   */
  public fun axisOffset(axisOffset: String) {
    cdkBuilder.axisOffset(axisOffset)
  }

  /**
   * @param dataOptions The data options for an axis.
   */
  public fun dataOptions(dataOptions: IResolvable) {
    cdkBuilder.dataOptions(dataOptions)
  }

  /**
   * @param dataOptions The data options for an axis.
   */
  public fun dataOptions(dataOptions: CfnTemplate.AxisDataOptionsProperty) {
    cdkBuilder.dataOptions(dataOptions)
  }

  /**
   * @param gridLineVisibility Determines whether or not the grid line is visible.
   */
  public fun gridLineVisibility(gridLineVisibility: String) {
    cdkBuilder.gridLineVisibility(gridLineVisibility)
  }

  /**
   * @param scrollbarOptions The scroll bar options for an axis.
   */
  public fun scrollbarOptions(scrollbarOptions: IResolvable) {
    cdkBuilder.scrollbarOptions(scrollbarOptions)
  }

  /**
   * @param scrollbarOptions The scroll bar options for an axis.
   */
  public fun scrollbarOptions(scrollbarOptions: CfnTemplate.ScrollBarOptionsProperty) {
    cdkBuilder.scrollbarOptions(scrollbarOptions)
  }

  /**
   * @param tickLabelOptions The tick label options of an axis.
   */
  public fun tickLabelOptions(tickLabelOptions: IResolvable) {
    cdkBuilder.tickLabelOptions(tickLabelOptions)
  }

  /**
   * @param tickLabelOptions The tick label options of an axis.
   */
  public fun tickLabelOptions(tickLabelOptions: CfnTemplate.AxisTickLabelOptionsProperty) {
    cdkBuilder.tickLabelOptions(tickLabelOptions)
  }

  public fun build(): CfnTemplate.AxisDisplayOptionsProperty = cdkBuilder.build()
}
