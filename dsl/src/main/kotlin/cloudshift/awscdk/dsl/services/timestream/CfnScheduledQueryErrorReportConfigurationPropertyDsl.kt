@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryErrorReportConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.ErrorReportConfigurationProperty.Builder =
      CfnScheduledQuery.ErrorReportConfigurationProperty.builder()

  /**
   * @param s3Configuration The S3 configuration for the error reports. 
   */
  public fun s3Configuration(s3Configuration: IResolvable) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  /**
   * @param s3Configuration The S3 configuration for the error reports. 
   */
  public fun s3Configuration(s3Configuration: CfnScheduledQuery.S3ConfigurationProperty) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public fun build(): CfnScheduledQuery.ErrorReportConfigurationProperty = cdkBuilder.build()
}
