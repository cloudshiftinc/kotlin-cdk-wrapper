@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardAxisDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.AxisDisplayOptionsProperty.Builder =
      CfnDashboard.AxisDisplayOptionsProperty.builder()

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
  public fun dataOptions(dataOptions: CfnDashboard.AxisDataOptionsProperty) {
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
  public fun scrollbarOptions(scrollbarOptions: CfnDashboard.ScrollBarOptionsProperty) {
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
  public fun tickLabelOptions(tickLabelOptions: CfnDashboard.AxisTickLabelOptionsProperty) {
    cdkBuilder.tickLabelOptions(tickLabelOptions)
  }

  public fun build(): CfnDashboard.AxisDisplayOptionsProperty = cdkBuilder.build()
}
