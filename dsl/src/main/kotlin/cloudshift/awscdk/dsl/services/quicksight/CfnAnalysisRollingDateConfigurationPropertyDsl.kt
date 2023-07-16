@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisRollingDateConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.RollingDateConfigurationProperty.Builder =
      CfnAnalysis.RollingDateConfigurationProperty.builder()

  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnAnalysis.RollingDateConfigurationProperty = cdkBuilder.build()
}
