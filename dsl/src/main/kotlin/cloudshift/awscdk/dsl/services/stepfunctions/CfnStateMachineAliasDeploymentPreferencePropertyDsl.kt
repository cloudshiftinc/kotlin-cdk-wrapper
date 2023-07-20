@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias

@CdkDslMarker
public class CfnStateMachineAliasDeploymentPreferencePropertyDsl {
  private val cdkBuilder: CfnStateMachineAlias.DeploymentPreferenceProperty.Builder =
      CfnStateMachineAlias.DeploymentPreferenceProperty.builder()

  private val _alarms: MutableList<String> = mutableListOf()

  public fun alarms(vararg alarms: String) {
    _alarms.addAll(listOf(*alarms))
  }

  public fun alarms(alarms: Collection<String>) {
    _alarms.addAll(alarms)
  }

  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  public fun percentage(percentage: Number) {
    cdkBuilder.percentage(percentage)
  }

  public fun stateMachineVersionArn(stateMachineVersionArn: String) {
    cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnStateMachineAlias.DeploymentPreferenceProperty {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
