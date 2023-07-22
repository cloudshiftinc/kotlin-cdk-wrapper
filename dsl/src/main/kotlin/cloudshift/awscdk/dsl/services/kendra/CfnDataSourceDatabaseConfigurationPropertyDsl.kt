@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDatabaseConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.DatabaseConfigurationProperty.Builder =
      CfnDataSource.DatabaseConfigurationProperty.builder()

  /**
   * @param aclConfiguration Information about the database column that provides information for
   * user context filtering.
   */
  public fun aclConfiguration(aclConfiguration: IResolvable) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  /**
   * @param aclConfiguration Information about the database column that provides information for
   * user context filtering.
   */
  public fun aclConfiguration(aclConfiguration: CfnDataSource.AclConfigurationProperty) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  /**
   * @param columnConfiguration Information about where the index should get the document
   * information from the database. 
   */
  public fun columnConfiguration(columnConfiguration: IResolvable) {
    cdkBuilder.columnConfiguration(columnConfiguration)
  }

  /**
   * @param columnConfiguration Information about where the index should get the document
   * information from the database. 
   */
  public fun columnConfiguration(columnConfiguration: CfnDataSource.ColumnConfigurationProperty) {
    cdkBuilder.columnConfiguration(columnConfiguration)
  }

  /**
   * @param connectionConfiguration Configuration information that's required to connect to a
   * database. 
   */
  public fun connectionConfiguration(connectionConfiguration: IResolvable) {
    cdkBuilder.connectionConfiguration(connectionConfiguration)
  }

  /**
   * @param connectionConfiguration Configuration information that's required to connect to a
   * database. 
   */
  public
      fun connectionConfiguration(connectionConfiguration: CfnDataSource.ConnectionConfigurationProperty) {
    cdkBuilder.connectionConfiguration(connectionConfiguration)
  }

  /**
   * @param databaseEngineType The type of database engine that runs the database. 
   */
  public fun databaseEngineType(databaseEngineType: String) {
    cdkBuilder.databaseEngineType(databaseEngineType)
  }

  /**
   * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks around
   * SQL identifiers when querying a database data source.
   */
  public fun sqlConfiguration(sqlConfiguration: IResolvable) {
    cdkBuilder.sqlConfiguration(sqlConfiguration)
  }

  /**
   * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks around
   * SQL identifiers when querying a database data source.
   */
  public fun sqlConfiguration(sqlConfiguration: CfnDataSource.SqlConfigurationProperty) {
    cdkBuilder.sqlConfiguration(sqlConfiguration)
  }

  /**
   * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
   */
  public fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnDataSource.DatabaseConfigurationProperty = cdkBuilder.build()
}
