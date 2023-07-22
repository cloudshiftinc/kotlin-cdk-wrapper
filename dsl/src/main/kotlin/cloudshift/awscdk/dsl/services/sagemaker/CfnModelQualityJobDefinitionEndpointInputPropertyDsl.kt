@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

/**
 * Input object for the endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .endTimeOffset("endTimeOffset")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-endpointinput.html)
 */
@CdkDslMarker
public class CfnModelQualityJobDefinitionEndpointInputPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.EndpointInputProperty.Builder =
      CfnModelQualityJobDefinition.EndpointInputProperty.builder()

  /**
   * @param endTimeOffset If specified, monitoring jobs substract this time from the end time.
   * For information about using offsets for scheduling monitoring jobs, see [Schedule Model Quality
   * Monitoring
   * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html) .
   */
  public fun endTimeOffset(endTimeOffset: String) {
    cdkBuilder.endTimeOffset(endTimeOffset)
  }

  /**
   * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
   * enabled. 
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param inferenceAttribute The attribute of the input data that represents the ground truth
   * label.
   */
  public fun inferenceAttribute(inferenceAttribute: String) {
    cdkBuilder.inferenceAttribute(inferenceAttribute)
  }

  /**
   * @param localPath Path to the filesystem where the endpoint data is available to the container. 
   */
  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  /**
   * @param probabilityAttribute In a classification problem, the attribute that represents the
   * class probability.
   */
  public fun probabilityAttribute(probabilityAttribute: String) {
    cdkBuilder.probabilityAttribute(probabilityAttribute)
  }

  /**
   * @param probabilityThresholdAttribute The threshold for the class probability to be evaluated as
   * a positive result.
   */
  public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
    cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
  }

  /**
   * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated
   * or sharded by an S3 key.
   * Defaults to `FullyReplicated`
   */
  public fun s3DataDistributionType(s3DataDistributionType: String) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  /**
   * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring data
   * for the monitoring job.
   * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
   * in memory. Defaults to `File` .
   */
  public fun s3InputMode(s3InputMode: String) {
    cdkBuilder.s3InputMode(s3InputMode)
  }

  /**
   * @param startTimeOffset If specified, monitoring jobs substract this time from the start time.
   * For information about using offsets for scheduling monitoring jobs, see [Schedule Model Quality
   * Monitoring
   * Jobs](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html) .
   */
  public fun startTimeOffset(startTimeOffset: String) {
    cdkBuilder.startTimeOffset(startTimeOffset)
  }

  public fun build(): CfnModelQualityJobDefinition.EndpointInputProperty = cdkBuilder.build()
}
