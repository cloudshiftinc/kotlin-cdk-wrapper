@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisNegativeValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.NegativeValueConfigurationProperty.Builder =
      CfnAnalysis.NegativeValueConfigurationProperty.builder()

  public fun displayMode(displayMode: String) {
    cdkBuilder.displayMode(displayMode)
  }

  public fun build(): CfnAnalysis.NegativeValueConfigurationProperty = cdkBuilder.build()
}
