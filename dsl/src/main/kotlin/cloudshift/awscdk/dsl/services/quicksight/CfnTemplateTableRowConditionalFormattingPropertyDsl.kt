@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableRowConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableRowConditionalFormattingProperty.Builder =
      CfnTemplate.TableRowConditionalFormattingProperty.builder()

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
  public fun backgroundColor(backgroundColor: CfnTemplate.ConditionalFormattingColorProperty) {
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
  public fun textColor(textColor: CfnTemplate.ConditionalFormattingColorProperty) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnTemplate.TableRowConditionalFormattingProperty = cdkBuilder.build()
}
