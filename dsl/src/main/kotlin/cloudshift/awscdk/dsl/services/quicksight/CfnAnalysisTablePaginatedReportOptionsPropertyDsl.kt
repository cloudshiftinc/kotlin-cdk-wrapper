@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTablePaginatedReportOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TablePaginatedReportOptionsProperty.Builder =
      CfnAnalysis.TablePaginatedReportOptionsProperty.builder()

  /**
   * @param overflowColumnHeaderVisibility The visibility of repeating header rows on each page.
   */
  public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
    cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
  }

  /**
   * @param verticalOverflowVisibility The visibility of printing table overflow across pages.
   */
  public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
    cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
  }

  public fun build(): CfnAnalysis.TablePaginatedReportOptionsProperty = cdkBuilder.build()
}
