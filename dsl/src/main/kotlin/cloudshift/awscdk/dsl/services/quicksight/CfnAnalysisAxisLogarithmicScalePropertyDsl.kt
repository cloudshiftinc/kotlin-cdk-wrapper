@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAxisLogarithmicScalePropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisLogarithmicScaleProperty.Builder =
      CfnAnalysis.AxisLogarithmicScaleProperty.builder()

  /**
   * @param base The base setup of a logarithmic axis scale.
   */
  public fun base(base: Number) {
    cdkBuilder.base(base)
  }

  public fun build(): CfnAnalysis.AxisLogarithmicScaleProperty = cdkBuilder.build()
}
