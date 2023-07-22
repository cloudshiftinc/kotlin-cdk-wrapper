@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAnchorDateConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.AnchorDateConfigurationProperty.Builder =
      CfnTemplate.AnchorDateConfigurationProperty.builder()

  /**
   * @param anchorOption The options for the date configuration. Choose one of the options below:.
   * * `NOW`
   */
  public fun anchorOption(anchorOption: String) {
    cdkBuilder.anchorOption(anchorOption)
  }

  /**
   * @param parameterName The name of the parameter that is used for the anchor date configuration.
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun build(): CfnTemplate.AnchorDateConfigurationProperty = cdkBuilder.build()
}
