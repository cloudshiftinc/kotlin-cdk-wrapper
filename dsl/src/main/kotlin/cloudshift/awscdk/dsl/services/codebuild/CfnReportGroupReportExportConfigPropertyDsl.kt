@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnReportGroup

@CdkDslMarker
public class CfnReportGroupReportExportConfigPropertyDsl {
  private val cdkBuilder: CfnReportGroup.ReportExportConfigProperty.Builder =
      CfnReportGroup.ReportExportConfigProperty.builder()

  /**
   * @param exportConfigType The export configuration type. Valid values are:. 
   * * `S3` : The report results are exported to an S3 bucket.
   * * `NO_EXPORT` : The report results are not exported.
   */
  public fun exportConfigType(exportConfigType: String) {
    cdkBuilder.exportConfigType(exportConfigType)
  }

  /**
   * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
   * bucket where the run of a report is exported.
   */
  public fun s3Destination(s3Destination: IResolvable) {
    cdkBuilder.s3Destination(s3Destination)
  }

  /**
   * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
   * bucket where the run of a report is exported.
   */
  public fun s3Destination(s3Destination: CfnReportGroup.S3ReportExportConfigProperty) {
    cdkBuilder.s3Destination(s3Destination)
  }

  public fun build(): CfnReportGroup.ReportExportConfigProperty = cdkBuilder.build()
}
