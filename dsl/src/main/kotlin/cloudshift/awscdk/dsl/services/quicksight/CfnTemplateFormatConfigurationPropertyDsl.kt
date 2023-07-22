@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FormatConfigurationProperty.Builder =
      CfnTemplate.FormatConfigurationProperty.builder()

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
      fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: CfnTemplate.DateTimeFormatConfigurationProperty) {
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
      fun numberFormatConfiguration(numberFormatConfiguration: CfnTemplate.NumberFormatConfigurationProperty) {
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
      fun stringFormatConfiguration(stringFormatConfiguration: CfnTemplate.StringFormatConfigurationProperty) {
    cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
  }

  public fun build(): CfnTemplate.FormatConfigurationProperty = cdkBuilder.build()
}
