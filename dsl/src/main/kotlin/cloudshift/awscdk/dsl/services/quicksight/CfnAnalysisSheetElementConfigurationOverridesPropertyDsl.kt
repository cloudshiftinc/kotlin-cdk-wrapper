@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSheetElementConfigurationOverridesPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SheetElementConfigurationOverridesProperty.Builder =
      CfnAnalysis.SheetElementConfigurationOverridesProperty.builder()

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.SheetElementConfigurationOverridesProperty = cdkBuilder.build()
}
