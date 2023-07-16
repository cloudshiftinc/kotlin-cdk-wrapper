@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSpacingPropertyDsl {
  private val cdkBuilder: CfnTemplate.SpacingProperty.Builder =
      CfnTemplate.SpacingProperty.builder()

  public fun bottom(bottom: String) {
    cdkBuilder.bottom(bottom)
  }

  public fun left(left: String) {
    cdkBuilder.left(left)
  }

  public fun right(right: String) {
    cdkBuilder.right(right)
  }

  public fun top(top: String) {
    cdkBuilder.top(top)
  }

  public fun build(): CfnTemplate.SpacingProperty = cdkBuilder.build()
}
