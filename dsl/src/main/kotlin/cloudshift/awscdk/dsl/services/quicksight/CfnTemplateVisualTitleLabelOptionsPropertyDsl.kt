@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateVisualTitleLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.VisualTitleLabelOptionsProperty.Builder =
      CfnTemplate.VisualTitleLabelOptionsProperty.builder()

  public fun formatText(formatText: IResolvable) {
    cdkBuilder.formatText(formatText)
  }

  public fun formatText(formatText: CfnTemplate.ShortFormatTextProperty) {
    cdkBuilder.formatText(formatText)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.VisualTitleLabelOptionsProperty = cdkBuilder.build()
}
