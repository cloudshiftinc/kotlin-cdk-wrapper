@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines a DocumentDB endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For more information about other available settings,
 * see [Using extra connections attributes with Amazon DocumentDB as a
 * source](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.DocumentDB.html#CHAP_Source.DocumentDB.ECAs)
 * and [Using Amazon DocumentDB as a target for AWS Database Migration
 * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DocumentDB.html) in the *AWS
 * Database Migration Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * DocDbSettingsProperty docDbSettingsProperty = DocDbSettingsProperty.builder()
 * .docsToInvestigate(123)
 * .extractDocId(false)
 * .nestingLevel("nestingLevel")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-docdbsettings.html)
 */
@CdkDslMarker
public class CfnEndpointDocDbSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.DocDbSettingsProperty.Builder =
      CfnEndpoint.DocDbSettingsProperty.builder()

  /**
   * @param docsToInvestigate Indicates the number of documents to preview to determine the document
   * organization.
   * Use this setting when `NestingLevel` is set to `"one"` .
   *
   * Must be a positive value greater than `0` . Default value is `1000` .
   */
  public fun docsToInvestigate(docsToInvestigate: Number) {
    cdkBuilder.docsToInvestigate(docsToInvestigate)
  }

  /**
   * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set to
   * `"none"` .
   * Default value is `"false"` .
   */
  public fun extractDocId(extractDocId: Boolean) {
    cdkBuilder.extractDocId(extractDocId)
  }

  /**
   * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set to
   * `"none"` .
   * Default value is `"false"` .
   */
  public fun extractDocId(extractDocId: IResolvable) {
    cdkBuilder.extractDocId(extractDocId)
  }

  /**
   * @param nestingLevel Specifies either document or table mode.
   * Default value is `"none"` . Specify `"none"` to use document mode. Specify `"one"` to use table
   * mode.
   */
  public fun nestingLevel(nestingLevel: String) {
    cdkBuilder.nestingLevel(nestingLevel)
  }

  /**
   * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
   * specifies AWS DMS as the trusted entity and grants the required permissions to access the value in
   * `SecretsManagerSecret` .
   * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the AWS
   * Secrets Manager secret that allows access to the DocumentDB endpoint.
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
   * `SecretsManagerSecret` that contains the DocumentDB endpoint connection details.
   */
  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun build(): CfnEndpoint.DocDbSettingsProperty = cdkBuilder.build()
}
