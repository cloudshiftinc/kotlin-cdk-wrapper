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

  public fun aclConfiguration(aclConfiguration: IResolvable) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  public fun aclConfiguration(aclConfiguration: CfnDataSource.AclConfigurationProperty) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  public fun columnConfiguration(columnConfiguration: IResolvable) {
    cdkBuilder.columnConfiguration(columnConfiguration)
  }

  public fun columnConfiguration(columnConfiguration: CfnDataSource.ColumnConfigurationProperty) {
    cdkBuilder.columnConfiguration(columnConfiguration)
  }

  public fun connectionConfiguration(connectionConfiguration: IResolvable) {
    cdkBuilder.connectionConfiguration(connectionConfiguration)
  }

  public
      fun connectionConfiguration(connectionConfiguration: CfnDataSource.ConnectionConfigurationProperty) {
    cdkBuilder.connectionConfiguration(connectionConfiguration)
  }

  public fun databaseEngineType(databaseEngineType: String) {
    cdkBuilder.databaseEngineType(databaseEngineType)
  }

  public fun sqlConfiguration(sqlConfiguration: IResolvable) {
    cdkBuilder.sqlConfiguration(sqlConfiguration)
  }

  public fun sqlConfiguration(sqlConfiguration: CfnDataSource.SqlConfigurationProperty) {
    cdkBuilder.sqlConfiguration(sqlConfiguration)
  }

  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnDataSource.DatabaseConfigurationProperty = cdkBuilder.build()
}
