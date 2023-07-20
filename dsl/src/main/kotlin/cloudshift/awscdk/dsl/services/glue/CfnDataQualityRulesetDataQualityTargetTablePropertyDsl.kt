@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset

@CdkDslMarker
public class CfnDataQualityRulesetDataQualityTargetTablePropertyDsl {
  private val cdkBuilder: CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder =
      CfnDataQualityRuleset.DataQualityTargetTableProperty.builder()

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnDataQualityRuleset.DataQualityTargetTableProperty = cdkBuilder.build()
}
