@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

/**
 * The security configuration for `OnlineStore` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * OnlineStoreSecurityConfigProperty onlineStoreSecurityConfigProperty =
 * OnlineStoreSecurityConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoresecurityconfig.html)
 */
@CdkDslMarker
public class CfnFeatureGroupOnlineStoreSecurityConfigPropertyDsl {
  private val cdkBuilder: CfnFeatureGroup.OnlineStoreSecurityConfigProperty.Builder =
      CfnFeatureGroup.OnlineStoreSecurityConfigProperty.builder()

  /**
   * @param kmsKeyId The AWS Key Management Service (KMS) key ARN that SageMaker Feature Store uses
   * to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
   * The caller (either user or IAM role) of `CreateFeatureGroup` must have below permissions to the
   * `OnlineStore` `KmsKeyId` :
   *
   * * `"kms:Encrypt"`
   * * `"kms:Decrypt"`
   * * `"kms:DescribeKey"`
   * * `"kms:CreateGrant"`
   * * `"kms:RetireGrant"`
   * * `"kms:ReEncryptFrom"`
   * * `"kms:ReEncryptTo"`
   * * `"kms:GenerateDataKey"`
   * * `"kms:ListAliases"`
   * * `"kms:ListGrants"`
   * * `"kms:RevokeGrant"`
   *
   * The caller (either user or IAM role) to all DataPlane operations ( `PutRecord` , `GetRecord` ,
   * `DeleteRecord` ) must have the following permissions to the `KmsKeyId` :
   *
   * * `"kms:Decrypt"`
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun build(): CfnFeatureGroup.OnlineStoreSecurityConfigProperty = cdkBuilder.build()
}
