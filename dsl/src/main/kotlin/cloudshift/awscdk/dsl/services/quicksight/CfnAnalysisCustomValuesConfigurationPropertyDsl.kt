@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCustomValuesConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CustomValuesConfigurationProperty.Builder =
      CfnAnalysis.CustomValuesConfigurationProperty.builder()

  public fun customValues(customValues: IResolvable) {
    cdkBuilder.customValues(customValues)
  }

  public fun customValues(customValues: CfnAnalysis.CustomParameterValuesProperty) {
    cdkBuilder.customValues(customValues)
  }

  public fun includeNullValue(includeNullValue: Boolean) {
    cdkBuilder.includeNullValue(includeNullValue)
  }

  public fun includeNullValue(includeNullValue: IResolvable) {
    cdkBuilder.includeNullValue(includeNullValue)
  }

  public fun build(): CfnAnalysis.CustomValuesConfigurationProperty = cdkBuilder.build()
}
