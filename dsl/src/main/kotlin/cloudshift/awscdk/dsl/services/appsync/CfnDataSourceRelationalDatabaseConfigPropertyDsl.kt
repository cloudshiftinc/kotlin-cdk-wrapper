@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * Use the `RelationalDatabaseConfig` property type to specify `RelationalDatabaseConfig` for an AWS
 * AppSync data source.
 *
 * `RelationalDatabaseConfig` is a property of the
 * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * RelationalDatabaseConfigProperty relationalDatabaseConfigProperty =
 * RelationalDatabaseConfigProperty.builder()
 * .relationalDatabaseSourceType("relationalDatabaseSourceType")
 * // the properties below are optional
 * .rdsHttpEndpointConfig(RdsHttpEndpointConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .awsSecretStoreArn("awsSecretStoreArn")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * // the properties below are optional
 * .databaseName("databaseName")
 * .schema("schema")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceRelationalDatabaseConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.RelationalDatabaseConfigProperty.Builder =
      CfnDataSource.RelationalDatabaseConfigProperty.builder()

  /**
   * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
   */
  public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: IResolvable) {
    cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig)
  }

  /**
   * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
   */
  public
      fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: CfnDataSource.RdsHttpEndpointConfigProperty) {
    cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig)
  }

  /**
   * @param relationalDatabaseSourceType The type of relational data source. 
   */
  public fun relationalDatabaseSourceType(relationalDatabaseSourceType: String) {
    cdkBuilder.relationalDatabaseSourceType(relationalDatabaseSourceType)
  }

  public fun build(): CfnDataSource.RelationalDatabaseConfigProperty = cdkBuilder.build()
}
