@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFreeFormLayoutElementBackgroundStylePropertyDsl {
  private val cdkBuilder: CfnTemplate.FreeFormLayoutElementBackgroundStyleProperty.Builder =
      CfnTemplate.FreeFormLayoutElementBackgroundStyleProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.FreeFormLayoutElementBackgroundStyleProperty = cdkBuilder.build()
}
