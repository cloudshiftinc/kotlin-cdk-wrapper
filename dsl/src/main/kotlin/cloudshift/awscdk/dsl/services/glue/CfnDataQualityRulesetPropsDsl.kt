@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset
import software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps

@CdkDslMarker
public class CfnDataQualityRulesetPropsDsl {
  private val cdkBuilder: CfnDataQualityRulesetProps.Builder = CfnDataQualityRulesetProps.builder()

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

  public fun build(): CfnDataQualityRulesetProps = cdkBuilder.build()
}
