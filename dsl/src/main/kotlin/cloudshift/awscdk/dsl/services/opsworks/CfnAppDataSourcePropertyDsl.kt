@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnApp

@CdkDslMarker
public class CfnAppDataSourcePropertyDsl {
  private val cdkBuilder: CfnApp.DataSourceProperty.Builder = CfnApp.DataSourceProperty.builder()

  /**
   * @param arn The data source's ARN.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param databaseName The database name.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param type The data source's type, `AutoSelectOpsworksMysqlInstance` , `OpsworksMysqlInstance`
   * , `RdsDbInstance` , or `None` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnApp.DataSourceProperty = cdkBuilder.build()
}
