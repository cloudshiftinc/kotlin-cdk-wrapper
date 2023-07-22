@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of custom values for the destination parameter in
 * `DestinationParameterValueConfiguration` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomValuesConfigurationProperty customValuesConfigurationProperty =
 * CustomValuesConfigurationProperty.builder()
 * .customValues(CustomParameterValuesProperty.builder()
 * .dateTimeValues(List.of("dateTimeValues"))
 * .decimalValues(List.of(123))
 * .integerValues(List.of(123))
 * .stringValues(List.of("stringValues"))
 * .build())
 * // the properties below are optional
 * .includeNullValue(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-customvaluesconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisCustomValuesConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CustomValuesConfigurationProperty.Builder =
      CfnAnalysis.CustomValuesConfigurationProperty.builder()

  /**
   * @param customValues the value to be set. 
   */
  public fun customValues(customValues: IResolvable) {
    cdkBuilder.customValues(customValues)
  }

  /**
   * @param customValues the value to be set. 
   */
  public fun customValues(customValues: CfnAnalysis.CustomParameterValuesProperty) {
    cdkBuilder.customValues(customValues)
  }

  /**
   * @param includeNullValue Includes the null value in custom action parameter values.
   */
  public fun includeNullValue(includeNullValue: Boolean) {
    cdkBuilder.includeNullValue(includeNullValue)
  }

  /**
   * @param includeNullValue Includes the null value in custom action parameter values.
   */
  public fun includeNullValue(includeNullValue: IResolvable) {
    cdkBuilder.includeNullValue(includeNullValue)
  }

  public fun build(): CfnAnalysis.CustomValuesConfigurationProperty = cdkBuilder.build()
}
