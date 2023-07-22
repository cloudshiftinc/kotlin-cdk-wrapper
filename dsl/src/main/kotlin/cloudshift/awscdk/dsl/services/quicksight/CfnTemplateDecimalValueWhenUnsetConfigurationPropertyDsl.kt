@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration that defines the default value of a `Decimal` parameter when a value has not
 * been set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DecimalValueWhenUnsetConfigurationProperty decimalValueWhenUnsetConfigurationProperty =
 * DecimalValueWhenUnsetConfigurationProperty.builder()
 * .customValue(123)
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-decimalvaluewhenunsetconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateDecimalValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DecimalValueWhenUnsetConfigurationProperty.Builder =
      CfnTemplate.DecimalValueWhenUnsetConfigurationProperty.builder()

  /**
   * @param customValue A custom value that's used when the value of a parameter isn't set.
   */
  public fun customValue(customValue: Number) {
    cdkBuilder.customValue(customValue)
  }

  /**
   * @param valueWhenUnsetOption The built-in options for default values. The value can be one of
   * the following:.
   * * `RECOMMENDED` : The recommended value.
   * * `NULL` : The `NULL` value.
   */
  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnTemplate.DecimalValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
