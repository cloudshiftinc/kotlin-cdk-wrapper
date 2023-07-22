@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

/**
 * The Amazon S3 location and configuration for storing inference request and response data.
 *
 * This is an optional parameter that you can use for data capture. For more information, see
 * [Capture data](https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DataStorageConfigProperty dataStorageConfigProperty = DataStorageConfigProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .contentType(CaptureContentTypeHeaderProperty.builder()
 * .csvContentTypes(List.of("csvContentTypes"))
 * .jsonContentTypes(List.of("jsonContentTypes"))
 * .build())
 * .kmsKey("kmsKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-datastorageconfig.html)
 */
@CdkDslMarker
public class CfnInferenceExperimentDataStorageConfigPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.DataStorageConfigProperty.Builder =
      CfnInferenceExperiment.DataStorageConfigProperty.builder()

  /**
   * @param contentType Configuration specifying how to treat different headers.
   * If no headers are specified SageMaker will by default base64 encode when capturing the data.
   */
  public fun contentType(contentType: IResolvable) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param contentType Configuration specifying how to treat different headers.
   * If no headers are specified SageMaker will by default base64 encode when capturing the data.
   */
  public fun contentType(contentType: CfnInferenceExperiment.CaptureContentTypeHeaderProperty) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param destination The Amazon S3 bucket where the inference request and response data is
   * stored. 
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured
   * data at rest using Amazon S3 server-side encryption.
   */
  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): CfnInferenceExperiment.DataStorageConfigProperty = cdkBuilder.build()
}
