@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisNumberFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.NumberFormatConfigurationProperty.Builder =
      CfnAnalysis.NumberFormatConfigurationProperty.builder()

  /**
   * @param formatConfiguration The options that determine the numeric format configuration.
   */
  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param formatConfiguration The options that determine the numeric format configuration.
   */
  public
      fun formatConfiguration(formatConfiguration: CfnAnalysis.NumericFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun build(): CfnAnalysis.NumberFormatConfigurationProperty = cdkBuilder.build()
}
