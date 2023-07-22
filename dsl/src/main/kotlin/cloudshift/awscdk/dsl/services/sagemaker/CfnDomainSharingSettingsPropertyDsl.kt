@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDomain

@CdkDslMarker
public class CfnDomainSharingSettingsPropertyDsl {
  private val cdkBuilder: CfnDomain.SharingSettingsProperty.Builder =
      CfnDomain.SharingSettingsProperty.builder()

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

  public fun build(): CfnDomain.SharingSettingsProperty = cdkBuilder.build()
}
