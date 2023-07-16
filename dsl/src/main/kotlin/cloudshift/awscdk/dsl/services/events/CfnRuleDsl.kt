@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule
import software.constructs.Construct

@CdkDslMarker
public class CfnRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRule.Builder = CfnRule.Builder.create(scope, id)

  private val _targets: MutableList<Any> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun eventBusName(eventBusName: String) {
    cdkBuilder.eventBusName(eventBusName)
  }

  public fun eventPattern(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.eventPattern(builder.map)
  }

  public fun eventPattern(eventPattern: Any) {
    cdkBuilder.eventPattern(eventPattern)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun build(): CfnRule {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
