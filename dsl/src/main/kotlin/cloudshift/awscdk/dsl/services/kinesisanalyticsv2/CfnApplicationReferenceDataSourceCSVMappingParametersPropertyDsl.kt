@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder =
      CfnApplicationReferenceDataSource.CSVMappingParametersProperty.builder()

  /**
   * @param recordColumnDelimiter The column delimiter. 
   * For example, in a CSV format, a comma (",") is the typical column delimiter.
   */
  public fun recordColumnDelimiter(recordColumnDelimiter: String) {
    cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
  }

  /**
   * @param recordRowDelimiter The row delimiter. 
   * For example, in a CSV format, *'\n'* is the typical row delimiter.
   */
  public fun recordRowDelimiter(recordRowDelimiter: String) {
    cdkBuilder.recordRowDelimiter(recordRowDelimiter)
  }

  public fun build(): CfnApplicationReferenceDataSource.CSVMappingParametersProperty =
      cdkBuilder.build()
}
