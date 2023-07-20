@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps

@CdkDslMarker
public class CfnCompositeAlarmPropsDsl {
  private val cdkBuilder: CfnCompositeAlarmProps.Builder = CfnCompositeAlarmProps.builder()

  private val _alarmActions: MutableList<String> = mutableListOf()

  private val _insufficientDataActions: MutableList<String> = mutableListOf()

  private val _okActions: MutableList<String> = mutableListOf()

  public fun actionsEnabled(actionsEnabled: Boolean) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  public fun actionsEnabled(actionsEnabled: IResolvable) {
    cdkBuilder.actionsEnabled(actionsEnabled)
  }

  public fun actionsSuppressor(actionsSuppressor: String) {
    cdkBuilder.actionsSuppressor(actionsSuppressor)
  }

  public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number) {
    cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
  }

  public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number) {
    cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
  }

  public fun alarmActions(vararg alarmActions: String) {
    _alarmActions.addAll(listOf(*alarmActions))
  }

  public fun alarmActions(alarmActions: Collection<String>) {
    _alarmActions.addAll(alarmActions)
  }

  public fun alarmDescription(alarmDescription: String) {
    cdkBuilder.alarmDescription(alarmDescription)
  }

  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  public fun alarmRule(alarmRule: String) {
    cdkBuilder.alarmRule(alarmRule)
  }

  public fun insufficientDataActions(vararg insufficientDataActions: String) {
    _insufficientDataActions.addAll(listOf(*insufficientDataActions))
  }

  public fun insufficientDataActions(insufficientDataActions: Collection<String>) {
    _insufficientDataActions.addAll(insufficientDataActions)
  }

  public fun okActions(vararg okActions: String) {
    _okActions.addAll(listOf(*okActions))
  }

  public fun okActions(okActions: Collection<String>) {
    _okActions.addAll(okActions)
  }

  public fun build(): CfnCompositeAlarmProps {
    if(_alarmActions.isNotEmpty()) cdkBuilder.alarmActions(_alarmActions)
    if(_insufficientDataActions.isNotEmpty())
        cdkBuilder.insufficientDataActions(_insufficientDataActions)
    if(_okActions.isNotEmpty()) cdkBuilder.okActions(_okActions)
    return cdkBuilder.build()
  }
}
