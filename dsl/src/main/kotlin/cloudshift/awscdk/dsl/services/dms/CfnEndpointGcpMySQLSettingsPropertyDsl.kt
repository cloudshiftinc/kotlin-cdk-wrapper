@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines a GCP MySQL endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. These settings are much the same as the settings for
 * any MySQL-compatible endpoint. For more information, see [Extra connection attributes when using
 * MySQL as a source for AWS
 * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * GcpMySQLSettingsProperty gcpMySQLSettingsProperty = GcpMySQLSettingsProperty.builder()
 * .afterConnectScript("afterConnectScript")
 * .cleanSourceMetadataOnMismatch(false)
 * .databaseName("databaseName")
 * .eventsPollInterval(123)
 * .maxFileSize(123)
 * .parallelLoadThreads(123)
 * .password("password")
 * .port(123)
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .serverName("serverName")
 * .serverTimezone("serverTimezone")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-gcpmysqlsettings.html)
 */
@CdkDslMarker
public class CfnEndpointGcpMySQLSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.GcpMySQLSettingsProperty.Builder =
      CfnEndpoint.GcpMySQLSettingsProperty.builder()

  /**
   * @param afterConnectScript Specifies a script to run immediately after AWS DMS connects to the
   * endpoint.
   * The migration task continues running regardless if the SQL statement succeeds or fails.
   *
   * For this parameter, provide the code of the script itself, not the name of a file containing
   * the script.
   */
  public fun afterConnectScript(afterConnectScript: String) {
    cdkBuilder.afterConnectScript(afterConnectScript)
  }

  /**
   * @param cleanSourceMetadataOnMismatch Adjusts the behavior of AWS DMS when migrating from an SQL
   * Server source database that is hosted as part of an Always On availability group cluster.
   * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups, set
   * this attribute to `false` .
   */
  public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
    cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
  }

  /**
   * @param cleanSourceMetadataOnMismatch Adjusts the behavior of AWS DMS when migrating from an SQL
   * Server source database that is hosted as part of an Always On availability group cluster.
   * If you need AWS DMS to poll all the nodes in the Always On cluster for transaction backups, set
   * this attribute to `false` .
   */
  public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
    cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
  }

  /**
   * @param databaseName Database name for the endpoint.
   * For a MySQL source or target endpoint, don't explicitly specify the database using the
   * `DatabaseName` request parameter on either the `CreateEndpoint` or `ModifyEndpoint` API call.
   * Specifying `DatabaseName` when you create or modify a MySQL endpoint replicates all the task
   * tables to this single database. For MySQL endpoints, you specify the database only when you
   * specify the schema in the table-mapping rules of the AWS DMS task.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param eventsPollInterval Specifies how often to check the binary log for new changes/events
   * when the database is idle.
   * The default is five seconds.
   *
   * Example: `eventsPollInterval=5;`
   *
   * In the example, AWS DMS checks for changes in the binary logs every five seconds.
   */
  public fun eventsPollInterval(eventsPollInterval: Number) {
    cdkBuilder.eventsPollInterval(eventsPollInterval)
  }

  /**
   * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer data to
   * a MySQL-compatible database.
   * Example: `maxFileSize=512`
   */
  public fun maxFileSize(maxFileSize: Number) {
    cdkBuilder.maxFileSize(maxFileSize)
  }

  /**
   * @param parallelLoadThreads Improves performance when loading data into the MySQL-compatible
   * target database.
   * Specifies how many threads to use to load the data into the MySQL-compatible target database.
   * Setting a large number of threads can have an adverse effect on database performance, because a
   * separate connection is required for each thread. The default is one.
   *
   * Example: `parallelLoadThreads=1`
   */
  public fun parallelLoadThreads(parallelLoadThreads: Number) {
    cdkBuilder.parallelLoadThreads(parallelLoadThreads)
  }

  /**
   * @param password Endpoint connection password.
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param port The port used by the endpoint database.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
   * specifies AWS DMS as the trusted entity and grants the required permissions to access the value in
   * `SecretsManagerSecret.` The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has
   * the value of the AWS Secrets Manager secret that allows access to the MySQL endpoint.
   *
   * You can specify one of two sets of values for these permissions. You can specify the values for
   * this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for `UserName` ,
   * `Password` , `ServerName` , and `Port` . You can't specify both.
   *
   * For more information on creating this `SecretsManagerSecret` , the corresponding
   * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` required to access it, see [Using
   * secrets to access AWS Database Migration Service
   * resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
   * in the *AWS Database Migration Service User Guide* .
   */
  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  /**
   * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
   * `SecretsManagerSecret` that contains the MySQL endpoint connection details.
   */
  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  /**
   * @param serverName Endpoint TCP port.
   */
  public fun serverName(serverName: String) {
    cdkBuilder.serverName(serverName)
  }

  /**
   * @param serverTimezone Specifies the time zone for the source MySQL database. Don't enclose time
   * zones in single quotation marks.
   * Example: `serverTimezone=US/Pacific;`
   */
  public fun serverTimezone(serverTimezone: String) {
    cdkBuilder.serverTimezone(serverTimezone)
  }

  /**
   * @param username Endpoint connection user name.
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnEndpoint.GcpMySQLSettingsProperty = cdkBuilder.build()
}
