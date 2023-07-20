@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset
import software.constructs.Construct

@CdkDslMarker
public class CfnDataQualityRulesetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataQualityRuleset.Builder =
      CfnDataQualityRuleset.Builder.create(scope, id)

  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun ruleset(ruleset: String) {
    cdkBuilder.ruleset(ruleset)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun targetTable(targetTable: IResolvable) {
    cdkBuilder.targetTable(targetTable)
  }

  public fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty) {
    cdkBuilder.targetTable(targetTable)
  }

  public fun build(): CfnDataQualityRuleset = cdkBuilder.build()
}
