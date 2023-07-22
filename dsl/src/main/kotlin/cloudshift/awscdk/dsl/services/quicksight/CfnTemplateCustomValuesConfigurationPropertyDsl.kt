@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomValuesConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.CustomValuesConfigurationProperty.Builder =
      CfnTemplate.CustomValuesConfigurationProperty.builder()

  /**
   * @param customValues the value to be set. 
   */
  public fun customValues(customValues: IResolvable) {
    cdkBuilder.customValues(customValues)
  }

  /**
   * @param customValues the value to be set. 
   */
  public fun customValues(customValues: CfnTemplate.CustomParameterValuesProperty) {
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

  public fun build(): CfnTemplate.CustomValuesConfigurationProperty = cdkBuilder.build()
}
