@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisIntegerValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.IntegerValueWhenUnsetConfigurationProperty.Builder =
      CfnAnalysis.IntegerValueWhenUnsetConfigurationProperty.builder()

  public fun customValue(customValue: Number) {
    cdkBuilder.customValue(customValue)
  }

  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnAnalysis.IntegerValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
