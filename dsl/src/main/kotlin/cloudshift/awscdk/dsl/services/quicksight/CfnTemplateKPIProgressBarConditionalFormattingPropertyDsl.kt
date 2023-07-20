@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateKPIProgressBarConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.KPIProgressBarConditionalFormattingProperty.Builder =
      CfnTemplate.KPIProgressBarConditionalFormattingProperty.builder()

  public fun foregroundColor(foregroundColor: IResolvable) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  public fun foregroundColor(foregroundColor: CfnTemplate.ConditionalFormattingColorProperty) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  public fun build(): CfnTemplate.KPIProgressBarConditionalFormattingProperty = cdkBuilder.build()
}
