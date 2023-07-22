@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

/**
 * The Amazon S3 storage location where the results of a monitoring job are saved.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * S3OutputProperty s3OutputProperty = S3OutputProperty.builder()
 * .localPath("localPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .s3UploadMode("s3UploadMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-s3output.html)
 */
@CdkDslMarker
public class CfnModelBiasJobDefinitionS3OutputPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.S3OutputProperty.Builder =
      CfnModelBiasJobDefinition.S3OutputProperty.builder()

  /**
   * @param localPath The local path to the Amazon S3 storage location where Amazon SageMaker saves
   * the results of a monitoring job. 
   * `LocalPath` is an absolute path for the output data.
   */
  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  /**
   * @param s3UploadMode Whether to upload the results of the monitoring job continuously or after
   * the job completes.
   */
  public fun s3UploadMode(s3UploadMode: String) {
    cdkBuilder.s3UploadMode(s3UploadMode)
  }

  /**
   * @param s3Uri A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves
   * the results of a monitoring job. 
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnModelBiasJobDefinition.S3OutputProperty = cdkBuilder.build()
}
