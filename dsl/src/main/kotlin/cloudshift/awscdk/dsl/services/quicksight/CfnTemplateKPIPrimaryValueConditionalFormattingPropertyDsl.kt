@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateKPIPrimaryValueConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.KPIPrimaryValueConditionalFormattingProperty.Builder =
      CfnTemplate.KPIPrimaryValueConditionalFormattingProperty.builder()

  /**
   * @param icon The conditional formatting of the primary value's icon.
   */
  public fun icon(icon: IResolvable) {
    cdkBuilder.icon(icon)
  }

  /**
   * @param icon The conditional formatting of the primary value's icon.
   */
  public fun icon(icon: CfnTemplate.ConditionalFormattingIconProperty) {
    cdkBuilder.icon(icon)
  }

  /**
   * @param textColor The conditional formatting of the primary value's text color.
   */
  public fun textColor(textColor: IResolvable) {
    cdkBuilder.textColor(textColor)
  }

  /**
   * @param textColor The conditional formatting of the primary value's text color.
   */
  public fun textColor(textColor: CfnTemplate.ConditionalFormattingColorProperty) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnTemplate.KPIPrimaryValueConditionalFormattingProperty = cdkBuilder.build()
}
