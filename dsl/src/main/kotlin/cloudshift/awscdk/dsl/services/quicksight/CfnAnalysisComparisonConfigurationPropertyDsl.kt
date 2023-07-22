@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisComparisonConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ComparisonConfigurationProperty.Builder =
      CfnAnalysis.ComparisonConfigurationProperty.builder()

  /**
   * @param comparisonFormat The format of the comparison.
   */
  public fun comparisonFormat(comparisonFormat: IResolvable) {
    cdkBuilder.comparisonFormat(comparisonFormat)
  }

  /**
   * @param comparisonFormat The format of the comparison.
   */
  public fun comparisonFormat(comparisonFormat: CfnAnalysis.ComparisonFormatConfigurationProperty) {
    cdkBuilder.comparisonFormat(comparisonFormat)
  }

  /**
   * @param comparisonMethod The method of the comparison. Choose from the following options:.
   * * `DIFFERENCE`
   * * `PERCENT_DIFFERENCE`
   * * `PERCENT`
   */
  public fun comparisonMethod(comparisonMethod: String) {
    cdkBuilder.comparisonMethod(comparisonMethod)
  }

  public fun build(): CfnAnalysis.ComparisonConfigurationProperty = cdkBuilder.build()
}
