@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisHistogramBinOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.HistogramBinOptionsProperty.Builder =
      CfnAnalysis.HistogramBinOptionsProperty.builder()

  public fun binCount(binCount: IResolvable) {
    cdkBuilder.binCount(binCount)
  }

  public fun binCount(binCount: CfnAnalysis.BinCountOptionsProperty) {
    cdkBuilder.binCount(binCount)
  }

  public fun binWidth(binWidth: IResolvable) {
    cdkBuilder.binWidth(binWidth)
  }

  public fun binWidth(binWidth: CfnAnalysis.BinWidthOptionsProperty) {
    cdkBuilder.binWidth(binWidth)
  }

  public fun selectedBinType(selectedBinType: String) {
    cdkBuilder.selectedBinType(selectedBinType)
  }

  public fun startValue(startValue: Number) {
    cdkBuilder.startValue(startValue)
  }

  public fun build(): CfnAnalysis.HistogramBinOptionsProperty = cdkBuilder.build()
}
