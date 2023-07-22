@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information that's required to connect to a database.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ConnectionConfigurationProperty connectionConfigurationProperty =
 * ConnectionConfigurationProperty.builder()
 * .databaseHost("databaseHost")
 * .databaseName("databaseName")
 * .databasePort(123)
 * .secretArn("secretArn")
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceConnectionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConnectionConfigurationProperty.Builder =
      CfnDataSource.ConnectionConfigurationProperty.builder()

  /**
   * @param databaseHost The name of the host for the database. 
   * Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
   */
  public fun databaseHost(databaseHost: String) {
    cdkBuilder.databaseHost(databaseHost)
  }

  /**
   * @param databaseName The name of the database containing the document data. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param databasePort The port that the database uses for connections. 
   */
  public fun databasePort(databasePort: Number) {
    cdkBuilder.databasePort(databasePort)
  }

  /**
   * @param secretArn The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager . 
   * The credentials should be a user/password pair. For more information, see [Using a Database
   * Data Source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html) . For more
   * information about AWS Secrets Manager , see [What Is AWS Secrets
   * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) in the *AWS
   * Secrets Manager* user guide.
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  /**
   * @param tableName The name of the table that contains the document data. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnDataSource.ConnectionConfigurationProperty = cdkBuilder.build()
}
