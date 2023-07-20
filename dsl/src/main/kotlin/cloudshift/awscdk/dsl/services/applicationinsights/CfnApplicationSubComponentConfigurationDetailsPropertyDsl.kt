@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationSubComponentConfigurationDetailsPropertyDsl {
  private val cdkBuilder: CfnApplication.SubComponentConfigurationDetailsProperty.Builder =
      CfnApplication.SubComponentConfigurationDetailsProperty.builder()

  private val _alarmMetrics: MutableList<Any> = mutableListOf()

  private val _logs: MutableList<Any> = mutableListOf()

  private val _windowsEvents: MutableList<Any> = mutableListOf()

  public fun alarmMetrics(vararg alarmMetrics: Any) {
    _alarmMetrics.addAll(listOf(*alarmMetrics))
  }

  public fun alarmMetrics(alarmMetrics: Collection<Any>) {
    _alarmMetrics.addAll(alarmMetrics)
  }

  public fun alarmMetrics(alarmMetrics: IResolvable) {
    cdkBuilder.alarmMetrics(alarmMetrics)
  }

  public fun logs(vararg logs: Any) {
    _logs.addAll(listOf(*logs))
  }

  public fun logs(logs: Collection<Any>) {
    _logs.addAll(logs)
  }

  public fun logs(logs: IResolvable) {
    cdkBuilder.logs(logs)
  }

  public fun windowsEvents(vararg windowsEvents: Any) {
    _windowsEvents.addAll(listOf(*windowsEvents))
  }

  public fun windowsEvents(windowsEvents: Collection<Any>) {
    _windowsEvents.addAll(windowsEvents)
  }

  public fun windowsEvents(windowsEvents: IResolvable) {
    cdkBuilder.windowsEvents(windowsEvents)
  }

  public fun build(): CfnApplication.SubComponentConfigurationDetailsProperty {
    if(_alarmMetrics.isNotEmpty()) cdkBuilder.alarmMetrics(_alarmMetrics)
    if(_logs.isNotEmpty()) cdkBuilder.logs(_logs)
    if(_windowsEvents.isNotEmpty()) cdkBuilder.windowsEvents(_windowsEvents)
    return cdkBuilder.build()
  }
}
