@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FormatConfigurationProperty.Builder =
      CfnAnalysis.FormatConfigurationProperty.builder()

  /**
   * @param dateTimeFormatConfiguration Formatting configuration for `DateTime` fields.
   */
  public fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: IResolvable) {
    cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
  }

  /**
   * @param dateTimeFormatConfiguration Formatting configuration for `DateTime` fields.
   */
  public
      fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: CfnAnalysis.DateTimeFormatConfigurationProperty) {
    cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
  }

  /**
   * @param numberFormatConfiguration Formatting configuration for number fields.
   */
  public fun numberFormatConfiguration(numberFormatConfiguration: IResolvable) {
    cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
  }

  /**
   * @param numberFormatConfiguration Formatting configuration for number fields.
   */
  public
      fun numberFormatConfiguration(numberFormatConfiguration: CfnAnalysis.NumberFormatConfigurationProperty) {
    cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
  }

  /**
   * @param stringFormatConfiguration Formatting configuration for string fields.
   */
  public fun stringFormatConfiguration(stringFormatConfiguration: IResolvable) {
    cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
  }

  /**
   * @param stringFormatConfiguration Formatting configuration for string fields.
   */
  public
      fun stringFormatConfiguration(stringFormatConfiguration: CfnAnalysis.StringFormatConfigurationProperty) {
    cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
  }

  public fun build(): CfnAnalysis.FormatConfigurationProperty = cdkBuilder.build()
}
