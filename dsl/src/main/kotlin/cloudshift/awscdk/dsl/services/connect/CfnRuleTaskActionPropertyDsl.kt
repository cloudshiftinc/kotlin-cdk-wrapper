@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

@CdkDslMarker
public class CfnRuleTaskActionPropertyDsl {
  private val cdkBuilder: CfnRule.TaskActionProperty.Builder = CfnRule.TaskActionProperty.builder()

  public fun contactFlowArn(contactFlowArn: String) {
    cdkBuilder.contactFlowArn(contactFlowArn)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun references(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.references(builder.map)
  }

  public fun references(references: Map<String, Any>) {
    cdkBuilder.references(references)
  }

  public fun references(references: IResolvable) {
    cdkBuilder.references(references)
  }

  public fun build(): CfnRule.TaskActionProperty = cdkBuilder.build()
}
