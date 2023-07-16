@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTrigger
import software.constructs.Construct

@CdkDslMarker
public class CfnTriggerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTrigger.Builder = CfnTrigger.Builder.create(scope, id)

  private val _actions: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun eventBatchingCondition(eventBatchingCondition: IResolvable) {
    cdkBuilder.eventBatchingCondition(eventBatchingCondition)
  }

  public
      fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty) {
    cdkBuilder.eventBatchingCondition(eventBatchingCondition)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun predicate(predicate: IResolvable) {
    cdkBuilder.predicate(predicate)
  }

  public fun predicate(predicate: CfnTrigger.PredicateProperty) {
    cdkBuilder.predicate(predicate)
  }

  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  public fun startOnCreation(startOnCreation: Boolean) {
    cdkBuilder.startOnCreation(startOnCreation)
  }

  public fun startOnCreation(startOnCreation: IResolvable) {
    cdkBuilder.startOnCreation(startOnCreation)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun workflowName(workflowName: String) {
    cdkBuilder.workflowName(workflowName)
  }

  public fun build(): CfnTrigger {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
