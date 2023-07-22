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

  /**
   * @param alarms A list of Amazon CloudWatch alarms to be monitored during the deployment.
   * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
   */
  public fun alarms(vararg alarms: String) {
    _alarms.addAll(listOf(*alarms))
  }

  /**
   * @param alarms A list of Amazon CloudWatch alarms to be monitored during the deployment.
   * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
   */
  public fun alarms(alarms: Collection<String>) {
    _alarms.addAll(alarms)
  }

  /**
   * @param interval The time in minutes between each traffic shifting increment.
   */
  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param percentage The percentage of traffic to shift to the new version in each increment.
   */
  public fun percentage(percentage: Number) {
    cdkBuilder.percentage(percentage)
  }

  /**
   * @param stateMachineVersionArn The Amazon Resource Name (ARN) of the
   * [`AWS::StepFunctions::StateMachineVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
   * resource that will be the final version to which the alias points to when the traffic shifting is
   * complete. 
   * While performing gradual deployments, you can only provide a single state machine version ARN.
   * To explicitly set version weights in a CloudFormation template, use `RoutingConfiguration`
   * instead.
   */
  public fun stateMachineVersionArn(stateMachineVersionArn: String) {
    cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
  }

  /**
   * @param type The type of deployment you want to perform. You can specify one of the following
   * types:. 
   * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
   * seconds between each increment.
   *
   * For example, if you specify the increment percent as `20` with an interval of `600` seconds,
   * this deployment increases traffic by 20 percent every 600 seconds until the new version receives
   * 100 percent of the traffic. This deployment immediately rolls back the new version if any
   * CloudWatch alarms are triggered.
   *
   * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately. CloudFormation
   * monitors the new version and rolls it back automatically to the previous version if any CloudWatch
   * alarms are triggered.
   * * `CANARY` - Shifts traffic in two increments.
   *
   * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
   * the new version. In the second increment, before a specified time interval in seconds gets over,
   * the remaining traffic is shifted to the new version. The shift to the new version for the
   * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified time
   * interval.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnStateMachineAlias.DeploymentPreferenceProperty {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
