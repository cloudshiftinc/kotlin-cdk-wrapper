@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * Specifies options when sharing an Amazon SageMaker Studio notebook.
 *
 * These settings are specified as part of `DefaultUserSettings` when the
 * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html) API
 * is called, and as part of `UserSettings` when the
 * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
 * API is called.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SharingSettingsProperty sharingSettingsProperty = SharingSettingsProperty.builder()
 * .notebookOutputOption("notebookOutputOption")
 * .s3KmsKeyId("s3KmsKeyId")
 * .s3OutputPath("s3OutputPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html)
 */
@CdkDslMarker
public class CfnUserProfileSharingSettingsPropertyDsl {
  private val cdkBuilder: CfnUserProfile.SharingSettingsProperty.Builder =
      CfnUserProfile.SharingSettingsProperty.builder()

  /**
   * @param notebookOutputOption Whether to include the notebook cell output when sharing the
   * notebook.
   * The default is `Disabled` .
   */
  public fun notebookOutputOption(notebookOutputOption: String) {
    cdkBuilder.notebookOutputOption(notebookOutputOption)
  }

  /**
   * @param s3KmsKeyId When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service
   * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
   */
  public fun s3KmsKeyId(s3KmsKeyId: String) {
    cdkBuilder.s3KmsKeyId(s3KmsKeyId)
  }

  /**
   * @param s3OutputPath When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to
   * store the shared notebook snapshots.
   */
  public fun s3OutputPath(s3OutputPath: String) {
    cdkBuilder.s3OutputPath(s3OutputPath)
  }

  public fun build(): CfnUserProfile.SharingSettingsProperty = cdkBuilder.build()
}
