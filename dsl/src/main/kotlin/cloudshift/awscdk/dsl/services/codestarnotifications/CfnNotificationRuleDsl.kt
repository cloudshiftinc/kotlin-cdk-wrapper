@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.constructs.Construct

@CdkDslMarker
public class CfnNotificationRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNotificationRule.Builder = CfnNotificationRule.Builder.create(scope,
      id)

  private val _eventTypeIds: MutableList<String> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  public fun createdBy(createdBy: String) {
    cdkBuilder.createdBy(createdBy)
  }

  public fun detailType(detailType: String) {
    cdkBuilder.detailType(detailType)
  }

  public fun eventTypeId(eventTypeId: String) {
    cdkBuilder.eventTypeId(eventTypeId)
  }

  public fun eventTypeIds(vararg eventTypeIds: String) {
    _eventTypeIds.addAll(listOf(*eventTypeIds))
  }

  public fun eventTypeIds(eventTypeIds: Collection<String>) {
    _eventTypeIds.addAll(eventTypeIds)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun targetAddress(targetAddress: String) {
    cdkBuilder.targetAddress(targetAddress)
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

  public fun build(): CfnNotificationRule {
    if(_eventTypeIds.isNotEmpty()) cdkBuilder.eventTypeIds(_eventTypeIds)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
