@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisThousandSeparatorOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ThousandSeparatorOptionsProperty.Builder =
      CfnAnalysis.ThousandSeparatorOptionsProperty.builder()

  public fun symbol(symbol: String) {
    cdkBuilder.symbol(symbol)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.ThousandSeparatorOptionsProperty = cdkBuilder.build()
}
