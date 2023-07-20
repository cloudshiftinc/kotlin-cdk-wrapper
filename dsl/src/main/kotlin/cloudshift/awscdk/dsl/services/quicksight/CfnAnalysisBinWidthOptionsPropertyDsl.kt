@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisBinWidthOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.BinWidthOptionsProperty.Builder =
      CfnAnalysis.BinWidthOptionsProperty.builder()

  public fun binCountLimit(binCountLimit: Number) {
    cdkBuilder.binCountLimit(binCountLimit)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.BinWidthOptionsProperty = cdkBuilder.build()
}
