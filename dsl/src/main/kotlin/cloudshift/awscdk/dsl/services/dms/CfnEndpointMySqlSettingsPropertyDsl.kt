@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines a MySQL endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For information about other available settings, see
 * [Extra connection attributes when using MySQL as a source for AWS
 * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MySQL.html#CHAP_Source.MySQL.ConnectionAttrib)
 * and [Extra connection attributes when using a MySQL-compatible database as a target for AWS
 * DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.MySQL.html#CHAP_Target.MySQL.ConnectionAttrib)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * MySqlSettingsProperty mySqlSettingsProperty = MySqlSettingsProperty.builder()
 * .afterConnectScript("afterConnectScript")
 * .cleanSourceMetadataOnMismatch(false)
 * .eventsPollInterval(123)
 * .maxFileSize(123)
 * .parallelLoadThreads(123)
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .serverTimezone("serverTimezone")
 * .targetDbType("targetDbType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-mysqlsettings.html)
 */
@CdkDslMarker
public class CfnEndpointMySqlSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.MySqlSettingsProperty.Builder =
      CfnEndpoint.MySqlSettingsProperty.builder()

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
   * @param cleanSourceMetadataOnMismatch Cleans and recreates table metadata information on the
   * replication instance when a mismatch occurs.
   * For example, in a situation where running an alter DDL on the table could result in different
   * information about the table cached in the replication instance.
   */
  public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
    cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
  }

  /**
   * @param cleanSourceMetadataOnMismatch Cleans and recreates table metadata information on the
   * replication instance when a mismatch occurs.
   * For example, in a situation where running an alter DDL on the table could result in different
   * information about the table cached in the replication instance.
   */
  public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
    cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
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
   * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
   * specifies AWS DMS as the trusted entity and grants the required permissions to access the value in
   * `SecretsManagerSecret` .
   * The role must allow the `iam:PassRole` action. `SecretsManagerSecret` has the value of the AWS
   * Secrets Manager secret that allows access to the MySQL endpoint.
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
   * `SecretsManagerSecret` that contains the MySQL endpoint connection details.
   */
  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  /**
   * @param serverTimezone Specifies the time zone for the source MySQL database.
   * Example: `serverTimezone=US/Pacific;`
   *
   * Note: Do not enclose time zones in single quotes.
   */
  public fun serverTimezone(serverTimezone: String) {
    cdkBuilder.serverTimezone(serverTimezone)
  }

  /**
   * @param targetDbType Specifies where to migrate source tables on the target, either to a single
   * database or multiple databases.
   * If you specify `SPECIFIC_DATABASE` , specify the database name using the `DatabaseName`
   * parameter of the `Endpoint` object.
   *
   * Example: `targetDbType=MULTIPLE_DATABASES`
   */
  public fun targetDbType(targetDbType: String) {
    cdkBuilder.targetDbType(targetDbType)
  }

  public fun build(): CfnEndpoint.MySqlSettingsProperty = cdkBuilder.build()
}
