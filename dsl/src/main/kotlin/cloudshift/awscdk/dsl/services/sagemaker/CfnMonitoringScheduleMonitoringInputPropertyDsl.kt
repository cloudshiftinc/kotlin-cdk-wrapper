@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * The inputs for a monitoring job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringInputProperty monitoringInputProperty = MonitoringInputProperty.builder()
 * .batchTransformInput(BatchTransformInputProperty.builder()
 * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
 * .datasetFormat(DatasetFormatProperty.builder()
 * .csv(CsvProperty.builder()
 * .header(false)
 * .build())
 * .json(JsonProperty.builder()
 * .line(false)
 * .build())
 * .parquet(false)
 * .build())
 * .localPath("localPath")
 * // the properties below are optional
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-monitoringinput.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleMonitoringInputPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.MonitoringInputProperty.Builder =
      CfnMonitoringSchedule.MonitoringInputProperty.builder()

  /**
   * @param batchTransformInput The batch transform input for a monitoring job.
   */
  public fun batchTransformInput(batchTransformInput: IResolvable) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  /**
   * @param batchTransformInput The batch transform input for a monitoring job.
   */
  public
      fun batchTransformInput(batchTransformInput: CfnMonitoringSchedule.BatchTransformInputProperty) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  /**
   * @param endpointInput The endpoint for a monitoring job.
   */
  public fun endpointInput(endpointInput: IResolvable) {
    cdkBuilder.endpointInput(endpointInput)
  }

  /**
   * @param endpointInput The endpoint for a monitoring job.
   */
  public fun endpointInput(endpointInput: CfnMonitoringSchedule.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun build(): CfnMonitoringSchedule.MonitoringInputProperty = cdkBuilder.build()
}
