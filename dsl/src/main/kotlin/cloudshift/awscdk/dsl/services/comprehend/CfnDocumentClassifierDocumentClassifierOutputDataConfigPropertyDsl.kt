@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier

@CdkDslMarker
public class CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl {
  private val cdkBuilder: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder =
      CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.builder()

  /**
   * @param kmsKeyId ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to
   * encrypt the output results from an analysis job.
   * The KmsKeyId can be one of the following formats:
   *
   * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
   * * Amazon Resource Name (ARN) of a KMS Key:
   * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
   * * KMS Key Alias: `"alias/ExampleAlias"`
   * * ARN of a KMS Key Alias: `"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"`
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param s3Uri When you use the `OutputDataConfig` object while creating a custom classifier, you
   * specify the Amazon S3 location where you want to write the confusion matrix and other output
   * files.
   * The URI must be in the same Region as the API endpoint that you are calling. The location is
   * used as the prefix for the actual location of this output file.
   *
   * When the custom classifier job is finished, the service creates the output file in a directory
   * specific to the job. The `S3Uri` field contains the location of the output file, called
   * `output.tar.gz` . It is a compressed archive that contains the confusion matrix.
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty =
      cdkBuilder.build()
}
