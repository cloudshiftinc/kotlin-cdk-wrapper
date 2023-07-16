@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCustomFilterConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CustomFilterConfigurationProperty.Builder =
      CfnAnalysis.CustomFilterConfigurationProperty.builder()

  public fun categoryValue(categoryValue: String) {
    cdkBuilder.categoryValue(categoryValue)
  }

  public fun matchOperator(matchOperator: String) {
    cdkBuilder.matchOperator(matchOperator)
  }

  public fun nullOption(nullOption: String) {
    cdkBuilder.nullOption(nullOption)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun build(): CfnAnalysis.CustomFilterConfigurationProperty = cdkBuilder.build()
}
