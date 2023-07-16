@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDateTimeValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DateTimeValueWhenUnsetConfigurationProperty.Builder =
      CfnAnalysis.DateTimeValueWhenUnsetConfigurationProperty.builder()

  public fun customValue(customValue: String) {
    cdkBuilder.customValue(customValue)
  }

  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnAnalysis.DateTimeValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
