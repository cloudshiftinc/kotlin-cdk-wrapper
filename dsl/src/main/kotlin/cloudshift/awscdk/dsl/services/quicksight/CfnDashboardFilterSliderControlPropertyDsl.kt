@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilterSliderControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilterSliderControlProperty.Builder =
      CfnDashboard.FilterSliderControlProperty.builder()

  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun displayOptions(displayOptions: CfnDashboard.SliderControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun filterControlId(filterControlId: String) {
    cdkBuilder.filterControlId(filterControlId)
  }

  public fun maximumValue(maximumValue: Number) {
    cdkBuilder.maximumValue(maximumValue)
  }

  public fun minimumValue(minimumValue: Number) {
    cdkBuilder.minimumValue(minimumValue)
  }

  public fun sourceFilterId(sourceFilterId: String) {
    cdkBuilder.sourceFilterId(sourceFilterId)
  }

  public fun stepSize(stepSize: Number) {
    cdkBuilder.stepSize(stepSize)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDashboard.FilterSliderControlProperty = cdkBuilder.build()
}
