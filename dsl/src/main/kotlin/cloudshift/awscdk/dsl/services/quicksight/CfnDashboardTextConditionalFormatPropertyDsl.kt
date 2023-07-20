@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTextConditionalFormatPropertyDsl {
  private val cdkBuilder: CfnDashboard.TextConditionalFormatProperty.Builder =
      CfnDashboard.TextConditionalFormatProperty.builder()

  public fun backgroundColor(backgroundColor: IResolvable) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun backgroundColor(backgroundColor: CfnDashboard.ConditionalFormattingColorProperty) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun icon(icon: IResolvable) {
    cdkBuilder.icon(icon)
  }

  public fun icon(icon: CfnDashboard.ConditionalFormattingIconProperty) {
    cdkBuilder.icon(icon)
  }

  public fun textColor(textColor: IResolvable) {
    cdkBuilder.textColor(textColor)
  }

  public fun textColor(textColor: CfnDashboard.ConditionalFormattingColorProperty) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnDashboard.TextConditionalFormatProperty = cdkBuilder.build()
}
