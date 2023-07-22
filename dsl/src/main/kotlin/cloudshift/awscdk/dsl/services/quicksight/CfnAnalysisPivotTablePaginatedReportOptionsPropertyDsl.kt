@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The paginated report options for a pivot table visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTablePaginatedReportOptionsProperty pivotTablePaginatedReportOptionsProperty =
 * PivotTablePaginatedReportOptionsProperty.builder()
 * .overflowColumnHeaderVisibility("overflowColumnHeaderVisibility")
 * .verticalOverflowVisibility("verticalOverflowVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-pivottablepaginatedreportoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisPivotTablePaginatedReportOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTablePaginatedReportOptionsProperty.Builder =
      CfnAnalysis.PivotTablePaginatedReportOptionsProperty.builder()

  /**
   * @param overflowColumnHeaderVisibility The visibility of the repeating header rows on each page.
   */
  public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
    cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
  }

  /**
   * @param verticalOverflowVisibility The visibility of the printing table overflow across pages.
   */
  public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
    cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
  }

  public fun build(): CfnAnalysis.PivotTablePaginatedReportOptionsProperty = cdkBuilder.build()
}
