@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisVisibleRangeOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.VisibleRangeOptionsProperty.Builder =
      CfnAnalysis.VisibleRangeOptionsProperty.builder()

  /**
   * @param percentRange The percent range in the visible range.
   */
  public fun percentRange(percentRange: IResolvable) {
    cdkBuilder.percentRange(percentRange)
  }

  /**
   * @param percentRange The percent range in the visible range.
   */
  public fun percentRange(percentRange: CfnAnalysis.PercentVisibleRangeProperty) {
    cdkBuilder.percentRange(percentRange)
  }

  public fun build(): CfnAnalysis.VisibleRangeOptionsProperty = cdkBuilder.build()
}
