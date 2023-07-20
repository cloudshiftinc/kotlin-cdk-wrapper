@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBoxPlotStyleOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.BoxPlotStyleOptionsProperty.Builder =
      CfnTemplate.BoxPlotStyleOptionsProperty.builder()

  public fun fillStyle(fillStyle: String) {
    cdkBuilder.fillStyle(fillStyle)
  }

  public fun build(): CfnTemplate.BoxPlotStyleOptionsProperty = cdkBuilder.build()
}
