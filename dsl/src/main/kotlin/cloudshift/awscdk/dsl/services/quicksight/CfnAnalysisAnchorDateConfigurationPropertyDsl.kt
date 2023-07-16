@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAnchorDateConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AnchorDateConfigurationProperty.Builder =
      CfnAnalysis.AnchorDateConfigurationProperty.builder()

  public fun anchorOption(anchorOption: String) {
    cdkBuilder.anchorOption(anchorOption)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun build(): CfnAnalysis.AnchorDateConfigurationProperty = cdkBuilder.build()
}
