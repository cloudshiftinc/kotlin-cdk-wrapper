@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDateAxisOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.DateAxisOptionsProperty.Builder =
      CfnTemplate.DateAxisOptionsProperty.builder()

  public fun missingDateVisibility(missingDateVisibility: String) {
    cdkBuilder.missingDateVisibility(missingDateVisibility)
  }

  public fun build(): CfnTemplate.DateAxisOptionsProperty = cdkBuilder.build()
}
