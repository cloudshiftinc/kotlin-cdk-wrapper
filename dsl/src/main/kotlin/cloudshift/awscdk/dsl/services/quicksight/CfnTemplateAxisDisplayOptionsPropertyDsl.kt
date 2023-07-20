@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisDisplayOptionsProperty.Builder =
      CfnTemplate.AxisDisplayOptionsProperty.builder()

  public fun axisLineVisibility(axisLineVisibility: String) {
    cdkBuilder.axisLineVisibility(axisLineVisibility)
  }

  public fun axisOffset(axisOffset: String) {
    cdkBuilder.axisOffset(axisOffset)
  }

  public fun dataOptions(dataOptions: IResolvable) {
    cdkBuilder.dataOptions(dataOptions)
  }

  public fun dataOptions(dataOptions: CfnTemplate.AxisDataOptionsProperty) {
    cdkBuilder.dataOptions(dataOptions)
  }

  public fun gridLineVisibility(gridLineVisibility: String) {
    cdkBuilder.gridLineVisibility(gridLineVisibility)
  }

  public fun scrollbarOptions(scrollbarOptions: IResolvable) {
    cdkBuilder.scrollbarOptions(scrollbarOptions)
  }

  public fun scrollbarOptions(scrollbarOptions: CfnTemplate.ScrollBarOptionsProperty) {
    cdkBuilder.scrollbarOptions(scrollbarOptions)
  }

  public fun tickLabelOptions(tickLabelOptions: IResolvable) {
    cdkBuilder.tickLabelOptions(tickLabelOptions)
  }

  public fun tickLabelOptions(tickLabelOptions: CfnTemplate.AxisTickLabelOptionsProperty) {
    cdkBuilder.tickLabelOptions(tickLabelOptions)
  }

  public fun build(): CfnTemplate.AxisDisplayOptionsProperty = cdkBuilder.build()
}
