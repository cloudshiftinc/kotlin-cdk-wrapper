@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTextControlPlaceholderOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TextControlPlaceholderOptionsProperty.Builder =
      CfnTemplate.TextControlPlaceholderOptionsProperty.builder()

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.TextControlPlaceholderOptionsProperty = cdkBuilder.build()
}
