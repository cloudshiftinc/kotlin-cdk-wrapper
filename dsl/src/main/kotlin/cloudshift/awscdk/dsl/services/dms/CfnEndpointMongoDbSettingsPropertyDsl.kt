@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointMongoDbSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.MongoDbSettingsProperty.Builder =
      CfnEndpoint.MongoDbSettingsProperty.builder()

  /**
   * @param authMechanism The authentication mechanism you use to access the MongoDB source
   * endpoint.
   * For the default value, in MongoDB version 2.x, `"default"` is `"mongodb_cr"` . For MongoDB
   * version 3.x or later, `"default"` is `"scram_sha_1"` . This setting isn't used when `AuthType` is
   * set to `"no"` .
   */
  public fun authMechanism(authMechanism: String) {
    cdkBuilder.authMechanism(authMechanism)
  }

  /**
   * @param authSource The MongoDB database name. This setting isn't used when `AuthType` is set to
   * `"no"` .
   * The default is `"admin"` .
   */
  public fun authSource(authSource: String) {
    cdkBuilder.authSource(authSource)
  }

  /**
   * @param authType The authentication type you use to access the MongoDB source endpoint.
   * When set to `"no"` , user name and password parameters are not used and can be empty.
   */
  public fun authType(authType: String) {
    cdkBuilder.authType(authType)
  }

  /**
   * @param databaseName The database name on the MongoDB source endpoint.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param docsToInvestigate Indicates the number of documents to preview to determine the document
   * organization.
   * Use this setting when `NestingLevel` is set to `"one"` .
   *
   * Must be a positive value greater than `0` . Default value is `1000` .
   */
  public fun docsToInvestigate(docsToInvestigate: String) {
    cdkBuilder.docsToInvestigate(docsToInvestigate)
  }

  /**
   * @param extractDocId Specifies the document ID. Use this setting when `NestingLevel` is set to
   * `"none"` .
   * Default value is `"false"` .
   */
  public fun extractDocId(extractDocId: String) {
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
   * @param password The password for the user account you use to access the MongoDB source
   * endpoint.
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param port The port value for the MongoDB source endpoint.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
   * specifies AWS DMS as the trusted entity and grants the required permissions to access the value in
   * `SecretsManagerSecret` .
   * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the AWS
   * Secrets Manager secret that allows access to the MongoDB endpoint.
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
   * `SecretsManagerSecret` that contains the MongoDB endpoint connection details.
   */
  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  /**
   * @param serverName The name of the server on the MongoDB source endpoint.
   */
  public fun serverName(serverName: String) {
    cdkBuilder.serverName(serverName)
  }

  /**
   * @param username The user name you use to access the MongoDB source endpoint.
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnEndpoint.MongoDbSettingsProperty = cdkBuilder.build()
}
