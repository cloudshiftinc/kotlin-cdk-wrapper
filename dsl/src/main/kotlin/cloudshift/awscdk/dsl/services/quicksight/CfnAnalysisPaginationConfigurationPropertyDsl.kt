@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPaginationConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PaginationConfigurationProperty.Builder =
      CfnAnalysis.PaginationConfigurationProperty.builder()

  /**
   * @param pageNumber Indicates the page number. 
   */
  public fun pageNumber(pageNumber: Number) {
    cdkBuilder.pageNumber(pageNumber)
  }

  /**
   * @param pageSize Indicates how many items render in one page. 
   */
  public fun pageSize(pageSize: Number) {
    cdkBuilder.pageSize(pageSize)
  }

  public fun build(): CfnAnalysis.PaginationConfigurationProperty = cdkBuilder.build()
}
