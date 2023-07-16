@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisConditionalFormattingIconDisplayConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ConditionalFormattingIconDisplayConfigurationProperty.Builder
      = CfnAnalysis.ConditionalFormattingIconDisplayConfigurationProperty.builder()

  public fun iconDisplayOption(iconDisplayOption: String) {
    cdkBuilder.iconDisplayOption(iconDisplayOption)
  }

  public fun build(): CfnAnalysis.ConditionalFormattingIconDisplayConfigurationProperty =
      cdkBuilder.build()
}
