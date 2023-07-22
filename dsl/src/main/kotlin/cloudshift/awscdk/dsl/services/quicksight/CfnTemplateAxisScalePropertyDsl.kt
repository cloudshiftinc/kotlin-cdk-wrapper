@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisScalePropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisScaleProperty.Builder =
      CfnTemplate.AxisScaleProperty.builder()

  /**
   * @param linear The linear axis scale setup.
   */
  public fun linear(linear: IResolvable) {
    cdkBuilder.linear(linear)
  }

  /**
   * @param linear The linear axis scale setup.
   */
  public fun linear(linear: CfnTemplate.AxisLinearScaleProperty) {
    cdkBuilder.linear(linear)
  }

  /**
   * @param logarithmic The logarithmic axis scale setup.
   */
  public fun logarithmic(logarithmic: IResolvable) {
    cdkBuilder.logarithmic(logarithmic)
  }

  /**
   * @param logarithmic The logarithmic axis scale setup.
   */
  public fun logarithmic(logarithmic: CfnTemplate.AxisLogarithmicScaleProperty) {
    cdkBuilder.logarithmic(logarithmic)
  }

  public fun build(): CfnTemplate.AxisScaleProperty = cdkBuilder.build()
}
