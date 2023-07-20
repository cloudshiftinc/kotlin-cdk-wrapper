@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAlarmEventActionsPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AlarmEventActionsProperty.Builder =
      CfnAlarmModel.AlarmEventActionsProperty.builder()

  private val _alarmActions: MutableList<Any> = mutableListOf()

  public fun alarmActions(vararg alarmActions: Any) {
    _alarmActions.addAll(listOf(*alarmActions))
  }

  public fun alarmActions(alarmActions: Collection<Any>) {
    _alarmActions.addAll(alarmActions)
  }

  public fun alarmActions(alarmActions: IResolvable) {
    cdkBuilder.alarmActions(alarmActions)
  }

  public fun build(): CfnAlarmModel.AlarmEventActionsProperty {
    if(_alarmActions.isNotEmpty()) cdkBuilder.alarmActions(_alarmActions)
    return cdkBuilder.build()
  }
}
