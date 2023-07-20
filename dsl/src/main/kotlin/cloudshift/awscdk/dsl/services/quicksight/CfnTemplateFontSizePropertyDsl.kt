@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFontSizePropertyDsl {
  private val cdkBuilder: CfnTemplate.FontSizeProperty.Builder =
      CfnTemplate.FontSizeProperty.builder()

  public fun relative(relative: String) {
    cdkBuilder.relative(relative)
  }

  public fun build(): CfnTemplate.FontSizeProperty = cdkBuilder.build()
}
