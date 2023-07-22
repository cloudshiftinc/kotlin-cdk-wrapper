@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset

@CdkDslMarker
public class CfnDataQualityRulesetDataQualityTargetTablePropertyDsl {
  private val cdkBuilder: CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder =
      CfnDataQualityRuleset.DataQualityTargetTableProperty.builder()

  /**
   * @param databaseName The name of the database where the AWS Glue table exists.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param tableName The name of the AWS Glue table.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnDataQualityRuleset.DataQualityTargetTableProperty = cdkBuilder.build()
}
