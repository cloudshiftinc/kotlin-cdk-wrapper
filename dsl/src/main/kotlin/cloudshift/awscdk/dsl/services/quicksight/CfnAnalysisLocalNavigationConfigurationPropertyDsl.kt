@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisLocalNavigationConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.LocalNavigationConfigurationProperty.Builder =
      CfnAnalysis.LocalNavigationConfigurationProperty.builder()

  public fun targetSheetId(targetSheetId: String) {
    cdkBuilder.targetSheetId(targetSheetId)
  }

  public fun build(): CfnAnalysis.LocalNavigationConfigurationProperty = cdkBuilder.build()
}
