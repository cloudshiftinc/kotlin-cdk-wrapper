@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupAlarmConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.AlarmConfigurationProperty.Builder =
      CfnDeploymentGroup.AlarmConfigurationProperty.builder()

  private val _alarms: MutableList<Any> = mutableListOf()

  public fun alarms(vararg alarms: Any) {
    _alarms.addAll(listOf(*alarms))
  }

  public fun alarms(alarms: Collection<Any>) {
    _alarms.addAll(alarms)
  }

  public fun alarms(alarms: IResolvable) {
    cdkBuilder.alarms(alarms)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun ignorePollAlarmFailure(ignorePollAlarmFailure: Boolean) {
    cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure)
  }

  public fun ignorePollAlarmFailure(ignorePollAlarmFailure: IResolvable) {
    cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure)
  }

  public fun build(): CfnDeploymentGroup.AlarmConfigurationProperty {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
