@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSliderControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SliderControlDisplayOptionsProperty.Builder =
      CfnAnalysis.SliderControlDisplayOptionsProperty.builder()

  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnAnalysis.SliderControlDisplayOptionsProperty = cdkBuilder.build()
}
