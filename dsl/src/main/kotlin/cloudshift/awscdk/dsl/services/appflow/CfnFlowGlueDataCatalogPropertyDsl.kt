@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowGlueDataCatalogPropertyDsl {
  private val cdkBuilder: CfnFlow.GlueDataCatalogProperty.Builder =
      CfnFlow.GlueDataCatalogProperty.builder()

  /**
   * @param databaseName A string containing the value for the tag. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param roleArn A string containing the value for the tag. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param tablePrefix A string containing the value for the tag. 
   */
  public fun tablePrefix(tablePrefix: String) {
    cdkBuilder.tablePrefix(tablePrefix)
  }

  public fun build(): CfnFlow.GlueDataCatalogProperty = cdkBuilder.build()
}
