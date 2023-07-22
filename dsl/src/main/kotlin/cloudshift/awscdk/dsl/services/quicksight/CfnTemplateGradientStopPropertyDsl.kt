@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGradientStopPropertyDsl {
  private val cdkBuilder: CfnTemplate.GradientStopProperty.Builder =
      CfnTemplate.GradientStopProperty.builder()

  /**
   * @param color Determines the color.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param dataValue Determines the data value.
   */
  public fun dataValue(dataValue: Number) {
    cdkBuilder.dataValue(dataValue)
  }

  /**
   * @param gradientOffset Determines gradient offset value. 
   */
  public fun gradientOffset(gradientOffset: Number) {
    cdkBuilder.gradientOffset(gradientOffset)
  }

  public fun build(): CfnTemplate.GradientStopProperty = cdkBuilder.build()
}
