@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import software.amazon.awscdk.services.codedeploy.ILambdaApplication
import software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct

@CdkDslMarker
public class LambdaDeploymentGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LambdaDeploymentGroup.Builder =
      LambdaDeploymentGroup.Builder.create(scope, id)

  private val _alarms: MutableList<IAlarm> = mutableListOf()

  public fun alarms(vararg alarms: IAlarm) {
    _alarms.addAll(listOf(*alarms))
  }

  public fun alarms(alarms: Collection<IAlarm>) {
    _alarms.addAll(alarms)
  }

  public fun alias(alias: Alias) {
    cdkBuilder.alias(alias)
  }

  public fun application(application: ILambdaApplication) {
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

  public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
    cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
  }

  public fun postHook(postHook: IFunction) {
    cdkBuilder.postHook(postHook)
  }

  public fun preHook(preHook: IFunction) {
    cdkBuilder.preHook(preHook)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LambdaDeploymentGroup {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
