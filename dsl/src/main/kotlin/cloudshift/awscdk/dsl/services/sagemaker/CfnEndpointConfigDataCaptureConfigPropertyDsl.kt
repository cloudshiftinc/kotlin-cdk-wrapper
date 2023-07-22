@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Specifies the configuration of your endpoint for model monitor data capture.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DataCaptureConfigProperty dataCaptureConfigProperty = DataCaptureConfigProperty.builder()
 * .captureOptions(List.of(CaptureOptionProperty.builder()
 * .captureMode("captureMode")
 * .build()))
 * .destinationS3Uri("destinationS3Uri")
 * .initialSamplingPercentage(123)
 * // the properties below are optional
 * .captureContentTypeHeader(CaptureContentTypeHeaderProperty.builder()
 * .csvContentTypes(List.of("csvContentTypes"))
 * .jsonContentTypes(List.of("jsonContentTypes"))
 * .build())
 * .enableCapture(false)
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-datacaptureconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigDataCaptureConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.DataCaptureConfigProperty.Builder =
      CfnEndpointConfig.DataCaptureConfigProperty.builder()

  private val _captureOptions: MutableList<Any> = mutableListOf()

  /**
   * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
   * captures.
   */
  public fun captureContentTypeHeader(captureContentTypeHeader: IResolvable) {
    cdkBuilder.captureContentTypeHeader(captureContentTypeHeader)
  }

  /**
   * @param captureContentTypeHeader A list of the JSON and CSV content type that the endpoint
   * captures.
   */
  public
      fun captureContentTypeHeader(captureContentTypeHeader: CfnEndpointConfig.CaptureContentTypeHeaderProperty) {
    cdkBuilder.captureContentTypeHeader(captureContentTypeHeader)
  }

  /**
   * @param captureOptions Specifies whether the endpoint captures input data to your model, output
   * data from your model, or both. 
   */
  public fun captureOptions(vararg captureOptions: Any) {
    _captureOptions.addAll(listOf(*captureOptions))
  }

  /**
   * @param captureOptions Specifies whether the endpoint captures input data to your model, output
   * data from your model, or both. 
   */
  public fun captureOptions(captureOptions: Collection<Any>) {
    _captureOptions.addAll(captureOptions)
  }

  /**
   * @param captureOptions Specifies whether the endpoint captures input data to your model, output
   * data from your model, or both. 
   */
  public fun captureOptions(captureOptions: IResolvable) {
    cdkBuilder.captureOptions(captureOptions)
  }

  /**
   * @param destinationS3Uri The S3 bucket where model monitor stores captured data. 
   */
  public fun destinationS3Uri(destinationS3Uri: String) {
    cdkBuilder.destinationS3Uri(destinationS3Uri)
  }

  /**
   * @param enableCapture Set to `True` to enable data capture.
   */
  public fun enableCapture(enableCapture: Boolean) {
    cdkBuilder.enableCapture(enableCapture)
  }

  /**
   * @param enableCapture Set to `True` to enable data capture.
   */
  public fun enableCapture(enableCapture: IResolvable) {
    cdkBuilder.enableCapture(enableCapture)
  }

  /**
   * @param initialSamplingPercentage The percentage of data to capture. 
   */
  public fun initialSamplingPercentage(initialSamplingPercentage: Number) {
    cdkBuilder.initialSamplingPercentage(initialSamplingPercentage)
  }

  /**
   * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
   * encrypt the captured data at rest using Amazon S3 server-side encryption.
   * The KmsKeyId can be any of the following formats: Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
   * Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab Alias name:
   * alias/ExampleAlias Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias If you
   * don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your
   * role's account. For more information, see KMS-Managed Encryption Keys
   * (https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the Amazon Simple
   * Storage Service Developer Guide. The KMS key policy must grant permission to the IAM role that you
   * specify in your CreateModel
   * (https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateModel.html) request. For more
   * information, see Using Key Policies in AWS KMS
   * (http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) in the AWS Key Management
   * Service Developer Guide.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnEndpointConfig.DataCaptureConfigProperty {
    if(_captureOptions.isNotEmpty()) cdkBuilder.captureOptions(_captureOptions)
    return cdkBuilder.build()
  }
}
