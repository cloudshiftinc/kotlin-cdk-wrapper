@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericAxisOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericAxisOptionsProperty.Builder =
      CfnTemplate.NumericAxisOptionsProperty.builder()

  /**
   * @param range The range setup of a numeric axis.
   */
  public fun range(range: IResolvable) {
    cdkBuilder.range(range)
  }

  /**
   * @param range The range setup of a numeric axis.
   */
  public fun range(range: CfnTemplate.AxisDisplayRangeProperty) {
    cdkBuilder.range(range)
  }

  /**
   * @param scale The scale setup of a numeric axis.
   */
  public fun scale(scale: IResolvable) {
    cdkBuilder.scale(scale)
  }

  /**
   * @param scale The scale setup of a numeric axis.
   */
  public fun scale(scale: CfnTemplate.AxisScaleProperty) {
    cdkBuilder.scale(scale)
  }

  public fun build(): CfnTemplate.NumericAxisOptionsProperty = cdkBuilder.build()
}
