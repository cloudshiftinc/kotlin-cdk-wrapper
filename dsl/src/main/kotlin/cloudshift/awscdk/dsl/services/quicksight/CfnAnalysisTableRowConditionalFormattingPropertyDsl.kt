@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableRowConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableRowConditionalFormattingProperty.Builder =
      CfnAnalysis.TableRowConditionalFormattingProperty.builder()

  public fun backgroundColor(backgroundColor: IResolvable) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun backgroundColor(backgroundColor: CfnAnalysis.ConditionalFormattingColorProperty) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun textColor(textColor: IResolvable) {
    cdkBuilder.textColor(textColor)
  }

  public fun textColor(textColor: CfnAnalysis.ConditionalFormattingColorProperty) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnAnalysis.TableRowConditionalFormattingProperty = cdkBuilder.build()
}
