@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisStringValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.StringValueWhenUnsetConfigurationProperty.Builder =
      CfnAnalysis.StringValueWhenUnsetConfigurationProperty.builder()

  /**
   * @param customValue A custom value that's used when the value of a parameter isn't set.
   */
  public fun customValue(customValue: String) {
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

  public fun build(): CfnAnalysis.StringValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
