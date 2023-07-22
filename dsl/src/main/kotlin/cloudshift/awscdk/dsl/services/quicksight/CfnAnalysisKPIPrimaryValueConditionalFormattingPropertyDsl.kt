@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisKPIPrimaryValueConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnAnalysis.KPIPrimaryValueConditionalFormattingProperty.Builder =
      CfnAnalysis.KPIPrimaryValueConditionalFormattingProperty.builder()

  /**
   * @param icon The conditional formatting of the primary value's icon.
   */
  public fun icon(icon: IResolvable) {
    cdkBuilder.icon(icon)
  }

  /**
   * @param icon The conditional formatting of the primary value's icon.
   */
  public fun icon(icon: CfnAnalysis.ConditionalFormattingIconProperty) {
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
  public fun textColor(textColor: CfnAnalysis.ConditionalFormattingColorProperty) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnAnalysis.KPIPrimaryValueConditionalFormattingProperty = cdkBuilder.build()
}
