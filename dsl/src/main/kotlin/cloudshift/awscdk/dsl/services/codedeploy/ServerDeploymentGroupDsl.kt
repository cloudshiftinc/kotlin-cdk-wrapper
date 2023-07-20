@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import software.amazon.awscdk.services.codedeploy.IServerApplication
import software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.InstanceTagSet
import software.amazon.awscdk.services.codedeploy.LoadBalancer
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

@CdkDslMarker
public class ServerDeploymentGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ServerDeploymentGroup.Builder =
      ServerDeploymentGroup.Builder.create(scope, id)

  private val _alarms: MutableList<IAlarm> = mutableListOf()

  private val _autoScalingGroups: MutableList<IAutoScalingGroup> = mutableListOf()

  public fun alarms(vararg alarms: IAlarm) {
    _alarms.addAll(listOf(*alarms))
  }

  public fun alarms(alarms: Collection<IAlarm>) {
    _alarms.addAll(alarms)
  }

  public fun application(application: IServerApplication) {
    cdkBuilder.application(application)
  }

  public fun autoRollback(block: AutoRollbackConfigDsl.() -> Unit = {}) {
    val builder = AutoRollbackConfigDsl()
    builder.apply(block)
    cdkBuilder.autoRollback(builder.build())
  }

  public fun autoRollback(autoRollback: AutoRollbackConfig) {
    cdkBuilder.autoRollback(autoRollback)
  }

  public fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup) {
    _autoScalingGroups.addAll(listOf(*autoScalingGroups))
  }

  public fun autoScalingGroups(autoScalingGroups: Collection<IAutoScalingGroup>) {
    _autoScalingGroups.addAll(autoScalingGroups)
  }

  public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  public fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet) {
    cdkBuilder.ec2InstanceTags(ec2InstanceTags)
  }

  public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
    cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
  }

  public fun installAgent(installAgent: Boolean) {
    cdkBuilder.installAgent(installAgent)
  }

  public fun loadBalancer(loadBalancer: LoadBalancer) {
    cdkBuilder.loadBalancer(loadBalancer)
  }

  public fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet) {
    cdkBuilder.onPremiseInstanceTags(onPremiseInstanceTags)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): ServerDeploymentGroup {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    if(_autoScalingGroups.isNotEmpty()) cdkBuilder.autoScalingGroups(_autoScalingGroups)
    return cdkBuilder.build()
  }
}
