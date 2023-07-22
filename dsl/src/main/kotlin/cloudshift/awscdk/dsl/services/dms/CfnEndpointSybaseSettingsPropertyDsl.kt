@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines a SAP ASE endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For information about other available settings, see
 * [Extra connection attributes when using SAP ASE as a source for AWS
 * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.SAP.html#CHAP_Source.SAP.ConnectionAttrib)
 * and [Extra connection attributes when using SAP ASE as a target for AWS
 * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.SAP.html#CHAP_Target.SAP.ConnectionAttrib)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * SybaseSettingsProperty sybaseSettingsProperty = SybaseSettingsProperty.builder()
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-sybasesettings.html)
 */
@CdkDslMarker
public class CfnEndpointSybaseSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.SybaseSettingsProperty.Builder =
      CfnEndpoint.SybaseSettingsProperty.builder()

  /**
   * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
   * specifies AWS DMS as the trusted entity and grants the required permissions to access the value in
   * `SecretsManagerSecret` .
   * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the AWS
   * Secrets Manager secret that allows access to the SAP ASE endpoint.
   *
   *
   * You can specify one of two sets of values for these permissions. You can specify the values for
   * this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for `UserName` ,
   * `Password` , `ServerName` , and `Port` . You can't specify both.
   *
   * For more information on creating this `SecretsManagerSecret` , the corresponding
   * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access it,
   * see [Using secrets to access AWS Database Migration Service
   * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
   * in the *AWS Database Migration Service User Guide* .
   */
  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  /**
   * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
   * `SecretsManagerSecret` that contains the SAP SAE endpoint connection details.
   */
  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun build(): CfnEndpoint.SybaseSettingsProperty = cdkBuilder.build()
}
