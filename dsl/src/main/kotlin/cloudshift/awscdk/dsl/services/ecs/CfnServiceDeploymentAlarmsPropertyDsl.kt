@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServiceDeploymentAlarmsPropertyDsl {
  private val cdkBuilder: CfnService.DeploymentAlarmsProperty.Builder =
      CfnService.DeploymentAlarmsProperty.builder()

  private val _alarmNames: MutableList<String> = mutableListOf()

  /**
   * @param alarmNames One or more CloudWatch alarm names. 
   * Use a "," to separate the alarms.
   */
  public fun alarmNames(vararg alarmNames: String) {
    _alarmNames.addAll(listOf(*alarmNames))
  }

  /**
   * @param alarmNames One or more CloudWatch alarm names. 
   * Use a "," to separate the alarms.
   */
  public fun alarmNames(alarmNames: Collection<String>) {
    _alarmNames.addAll(alarmNames)
  }

  /**
   * @param enable Determines whether to use the CloudWatch alarm option in the service deployment
   * process. 
   */
  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param enable Determines whether to use the CloudWatch alarm option in the service deployment
   * process. 
   */
  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
   * service deployment fails. 
   * If rollback is used, when a service deployment fails, the service is rolled back to the last
   * deployment that completed successfully.
   */
  public fun rollback(rollback: Boolean) {
    cdkBuilder.rollback(rollback)
  }

  /**
   * @param rollback Determines whether to configure Amazon ECS to roll back the service if a
   * service deployment fails. 
   * If rollback is used, when a service deployment fails, the service is rolled back to the last
   * deployment that completed successfully.
   */
  public fun rollback(rollback: IResolvable) {
    cdkBuilder.rollback(rollback)
  }

  public fun build(): CfnService.DeploymentAlarmsProperty {
    if(_alarmNames.isNotEmpty()) cdkBuilder.alarmNames(_alarmNames)
    return cdkBuilder.build()
  }
}
