@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateHistogramBinOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.HistogramBinOptionsProperty.Builder =
      CfnTemplate.HistogramBinOptionsProperty.builder()

  /**
   * @param binCount The options that determine the bin count of a histogram.
   */
  public fun binCount(binCount: IResolvable) {
    cdkBuilder.binCount(binCount)
  }

  /**
   * @param binCount The options that determine the bin count of a histogram.
   */
  public fun binCount(binCount: CfnTemplate.BinCountOptionsProperty) {
    cdkBuilder.binCount(binCount)
  }

  /**
   * @param binWidth The options that determine the bin width of a histogram.
   */
  public fun binWidth(binWidth: IResolvable) {
    cdkBuilder.binWidth(binWidth)
  }

  /**
   * @param binWidth The options that determine the bin width of a histogram.
   */
  public fun binWidth(binWidth: CfnTemplate.BinWidthOptionsProperty) {
    cdkBuilder.binWidth(binWidth)
  }

  /**
   * @param selectedBinType The options that determine the selected bin type.
   */
  public fun selectedBinType(selectedBinType: String) {
    cdkBuilder.selectedBinType(selectedBinType)
  }

  /**
   * @param startValue The options that determine the bin start value.
   */
  public fun startValue(startValue: Number) {
    cdkBuilder.startValue(startValue)
  }

  public fun build(): CfnTemplate.HistogramBinOptionsProperty = cdkBuilder.build()
}
