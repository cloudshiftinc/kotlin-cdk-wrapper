@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableRowConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableRowConditionalFormattingProperty.Builder =
      CfnAnalysis.TableRowConditionalFormattingProperty.builder()

  /**
   * @param backgroundColor The conditional formatting color (solid, gradient) of the background for
   * a table row.
   */
  public fun backgroundColor(backgroundColor: IResolvable) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param backgroundColor The conditional formatting color (solid, gradient) of the background for
   * a table row.
   */
  public fun backgroundColor(backgroundColor: CfnAnalysis.ConditionalFormattingColorProperty) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param textColor The conditional formatting color (solid, gradient) of the text for a table
   * row.
   */
  public fun textColor(textColor: IResolvable) {
    cdkBuilder.textColor(textColor)
  }

  /**
   * @param textColor The conditional formatting color (solid, gradient) of the text for a table
   * row.
   */
  public fun textColor(textColor: CfnAnalysis.ConditionalFormattingColorProperty) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnAnalysis.TableRowConditionalFormattingProperty = cdkBuilder.build()
}
