@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAnchorDateConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AnchorDateConfigurationProperty.Builder =
      CfnAnalysis.AnchorDateConfigurationProperty.builder()

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

  public fun build(): CfnAnalysis.AnchorDateConfigurationProperty = cdkBuilder.build()
}
