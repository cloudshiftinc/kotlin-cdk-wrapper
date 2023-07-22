@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFontWeightPropertyDsl {
  private val cdkBuilder: CfnTemplate.FontWeightProperty.Builder =
      CfnTemplate.FontWeightProperty.builder()

  /**
   * @param name The lexical name for the level of boldness of the text display.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTemplate.FontWeightProperty = cdkBuilder.build()
}
