@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingIconDisplayConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty.Builder
      = CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty.builder()

  /**
   * @param iconDisplayOption Determines the icon display configuration.
   */
  public fun iconDisplayOption(iconDisplayOption: String) {
    cdkBuilder.iconDisplayOption(iconDisplayOption)
  }

  public fun build(): CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty =
      cdkBuilder.build()
}
