@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.constructs.Construct

@CdkDslMarker
public class CfnAlarmModelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlarmModel.Builder = CfnAlarmModel.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun alarmCapabilities(alarmCapabilities: IResolvable) {
    cdkBuilder.alarmCapabilities(alarmCapabilities)
  }

  public fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty) {
    cdkBuilder.alarmCapabilities(alarmCapabilities)
  }

  public fun alarmEventActions(alarmEventActions: IResolvable) {
    cdkBuilder.alarmEventActions(alarmEventActions)
  }

  public fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty) {
    cdkBuilder.alarmEventActions(alarmEventActions)
  }

  public fun alarmModelDescription(alarmModelDescription: String) {
    cdkBuilder.alarmModelDescription(alarmModelDescription)
  }

  public fun alarmModelName(alarmModelName: String) {
    cdkBuilder.alarmModelName(alarmModelName)
  }

  public fun alarmRule(alarmRule: IResolvable) {
    cdkBuilder.alarmRule(alarmRule)
  }

  public fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty) {
    cdkBuilder.alarmRule(alarmRule)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun severity(severity: Number) {
    cdkBuilder.severity(severity)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAlarmModel {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
