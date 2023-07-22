@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * The baseline statistics file in Amazon S3 that the current monitoring job should be validated
 * against.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * StatisticsResourceProperty statisticsResourceProperty = StatisticsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-statisticsresource.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleStatisticsResourcePropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.StatisticsResourceProperty.Builder =
      CfnMonitoringSchedule.StatisticsResourceProperty.builder()

  /**
   * @param s3Uri The S3 URI for the statistics resource.
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnMonitoringSchedule.StatisticsResourceProperty = cdkBuilder.build()
}
