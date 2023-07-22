@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWaterfallChartOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.WaterfallChartOptionsProperty.Builder =
      CfnTemplate.WaterfallChartOptionsProperty.builder()

  /**
   * @param totalBarLabel This option determines the total bar label of a waterfall visual.
   */
  public fun totalBarLabel(totalBarLabel: String) {
    cdkBuilder.totalBarLabel(totalBarLabel)
  }

  public fun build(): CfnTemplate.WaterfallChartOptionsProperty = cdkBuilder.build()
}
