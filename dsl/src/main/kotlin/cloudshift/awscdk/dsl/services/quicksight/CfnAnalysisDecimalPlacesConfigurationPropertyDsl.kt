@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDecimalPlacesConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DecimalPlacesConfigurationProperty.Builder =
      CfnAnalysis.DecimalPlacesConfigurationProperty.builder()

  public fun decimalPlaces(decimalPlaces: Number) {
    cdkBuilder.decimalPlaces(decimalPlaces)
  }

  public fun build(): CfnAnalysis.DecimalPlacesConfigurationProperty = cdkBuilder.build()
}
