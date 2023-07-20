@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBoxPlotOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.BoxPlotOptionsProperty.Builder =
      CfnTemplate.BoxPlotOptionsProperty.builder()

  public fun allDataPointsVisibility(allDataPointsVisibility: String) {
    cdkBuilder.allDataPointsVisibility(allDataPointsVisibility)
  }

  public fun outlierVisibility(outlierVisibility: String) {
    cdkBuilder.outlierVisibility(outlierVisibility)
  }

  public fun styleOptions(styleOptions: IResolvable) {
    cdkBuilder.styleOptions(styleOptions)
  }

  public fun styleOptions(styleOptions: CfnTemplate.BoxPlotStyleOptionsProperty) {
    cdkBuilder.styleOptions(styleOptions)
  }

  public fun build(): CfnTemplate.BoxPlotOptionsProperty = cdkBuilder.build()
}
