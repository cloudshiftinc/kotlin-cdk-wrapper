@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGaugeChartArcConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.GaugeChartArcConditionalFormattingProperty.Builder =
      CfnTemplate.GaugeChartArcConditionalFormattingProperty.builder()

  /**
   * @param foregroundColor The conditional formatting of the arc foreground color.
   */
  public fun foregroundColor(foregroundColor: IResolvable) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  /**
   * @param foregroundColor The conditional formatting of the arc foreground color.
   */
  public fun foregroundColor(foregroundColor: CfnTemplate.ConditionalFormattingColorProperty) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  public fun build(): CfnTemplate.GaugeChartArcConditionalFormattingProperty = cdkBuilder.build()
}
