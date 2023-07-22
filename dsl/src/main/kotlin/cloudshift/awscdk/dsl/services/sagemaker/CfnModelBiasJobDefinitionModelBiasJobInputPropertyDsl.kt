@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

/**
 * Inputs for the model bias job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelBiasJobInputProperty modelBiasJobInputProperty = ModelBiasJobInputProperty.builder()
 * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * // the properties below are optional
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
 * .endTimeOffset("endTimeOffset")
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .endTimeOffset("endTimeOffset")
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasjobinput.html)
 */
@CdkDslMarker
public class CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder =
      CfnModelBiasJobDefinition.ModelBiasJobInputProperty.builder()

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
      fun batchTransformInput(batchTransformInput: CfnModelBiasJobDefinition.BatchTransformInputProperty) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  /**
   * @param endpointInput Input object for the endpoint.
   */
  public fun endpointInput(endpointInput: IResolvable) {
    cdkBuilder.endpointInput(endpointInput)
  }

  /**
   * @param endpointInput Input object for the endpoint.
   */
  public fun endpointInput(endpointInput: CfnModelBiasJobDefinition.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  /**
   * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
   */
  public fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  /**
   * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
   */
  public
      fun groundTruthS3Input(groundTruthS3Input: CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  public fun build(): CfnModelBiasJobDefinition.ModelBiasJobInputProperty = cdkBuilder.build()
}
