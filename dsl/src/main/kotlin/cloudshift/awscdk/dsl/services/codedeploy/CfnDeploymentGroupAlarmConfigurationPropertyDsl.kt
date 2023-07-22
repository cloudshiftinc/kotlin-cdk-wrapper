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

  /**
   * @param alarms A list of alarms configured for the deployment or deployment group.
   * A maximum of 10 alarms can be added.
   */
  public fun alarms(vararg alarms: Any) {
    _alarms.addAll(listOf(*alarms))
  }

  /**
   * @param alarms A list of alarms configured for the deployment or deployment group.
   * A maximum of 10 alarms can be added.
   */
  public fun alarms(alarms: Collection<Any>) {
    _alarms.addAll(alarms)
  }

  /**
   * @param alarms A list of alarms configured for the deployment or deployment group.
   * A maximum of 10 alarms can be added.
   */
  public fun alarms(alarms: IResolvable) {
    cdkBuilder.alarms(alarms)
  }

  /**
   * @param enabled Indicates whether the alarm configuration is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether the alarm configuration is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param ignorePollAlarmFailure Indicates whether a deployment should continue if information
   * about the current state of alarms cannot be retrieved from Amazon CloudWatch .
   * The default value is `false` .
   *
   * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
   * CloudWatch .
   * * `false` : The deployment stops if alarm status information can't be retrieved from CloudWatch
   * .
   */
  public fun ignorePollAlarmFailure(ignorePollAlarmFailure: Boolean) {
    cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure)
  }

  /**
   * @param ignorePollAlarmFailure Indicates whether a deployment should continue if information
   * about the current state of alarms cannot be retrieved from Amazon CloudWatch .
   * The default value is `false` .
   *
   * * `true` : The deployment proceeds even if alarm status information can't be retrieved from
   * CloudWatch .
   * * `false` : The deployment stops if alarm status information can't be retrieved from CloudWatch
   * .
   */
  public fun ignorePollAlarmFailure(ignorePollAlarmFailure: IResolvable) {
    cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure)
  }

  public fun build(): CfnDeploymentGroup.AlarmConfigurationProperty {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
