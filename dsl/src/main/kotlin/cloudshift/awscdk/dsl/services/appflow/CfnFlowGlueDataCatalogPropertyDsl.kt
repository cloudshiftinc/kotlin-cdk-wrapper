@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Trigger settings of the flow.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * GlueDataCatalogProperty glueDataCatalogProperty = GlueDataCatalogProperty.builder()
 * .databaseName("databaseName")
 * .roleArn("roleArn")
 * .tablePrefix("tablePrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-gluedatacatalog.html)
 */
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
