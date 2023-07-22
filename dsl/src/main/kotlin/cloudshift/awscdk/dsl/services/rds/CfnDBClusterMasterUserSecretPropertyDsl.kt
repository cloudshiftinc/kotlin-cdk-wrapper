@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBCluster

/**
 * The `MasterUserSecret` return value specifies the secret managed by RDS in AWS Secrets Manager
 * for the master user password.
 *
 * For more information, see [Password management with AWS Secrets
 * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html) in the
 * *Amazon RDS User Guide* and [Password management with AWS Secrets
 * Manager](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html) in
 * the *Amazon Aurora User Guide.*
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * MasterUserSecretProperty masterUserSecretProperty = MasterUserSecretProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .secretArn("secretArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
 */
@CdkDslMarker
public class CfnDBClusterMasterUserSecretPropertyDsl {
  private val cdkBuilder: CfnDBCluster.MasterUserSecretProperty.Builder =
      CfnDBCluster.MasterUserSecretProperty.builder()

  /**
   * @param kmsKeyId The AWS KMS key identifier that is used to encrypt the secret.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param secretArn The Amazon Resource Name (ARN) of the secret.
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun build(): CfnDBCluster.MasterUserSecretProperty = cdkBuilder.build()
}
