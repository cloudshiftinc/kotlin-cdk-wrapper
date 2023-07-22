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

  /**
   * The CloudWatch alarms associated with this Deployment Group.
   *
   * CodeDeploy will stop (and optionally roll back)
   * a deployment if during it any of the alarms trigger.
   *
   * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
   *
   * Default: []
   *
   * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
   * @param alarms The CloudWatch alarms associated with this Deployment Group. 
   */
  public fun alarms(vararg alarms: IAlarm) {
    _alarms.addAll(listOf(*alarms))
  }

  /**
   * The CloudWatch alarms associated with this Deployment Group.
   *
   * CodeDeploy will stop (and optionally roll back)
   * a deployment if during it any of the alarms trigger.
   *
   * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
   *
   * Default: []
   *
   * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
   * @param alarms The CloudWatch alarms associated with this Deployment Group. 
   */
  public fun alarms(alarms: Collection<IAlarm>) {
    _alarms.addAll(alarms)
  }

  /**
   * Lambda Alias to shift traffic. Updating the version of the alias will trigger a CodeDeploy
   * deployment.
   *
   * [disable-awslint:ref-via-interface] since we need to modify the alias CFN resource update
   * policy
   *
   * @param alias Lambda Alias to shift traffic. Updating the version of the alias will trigger a
   * CodeDeploy deployment. 
   */
  public fun alias(alias: Alias) {
    cdkBuilder.alias(alias)
  }

  /**
   * The reference to the CodeDeploy Lambda Application that this Deployment Group belongs to.
   *
   * Default: - One will be created for you.
   *
   * @param application The reference to the CodeDeploy Lambda Application that this Deployment
   * Group belongs to. 
   */
  public fun application(application: ILambdaApplication) {
    cdkBuilder.application(application)
  }

  /**
   * The auto-rollback configuration for this Deployment Group.
   *
   * Default: - default AutoRollbackConfig.
   *
   * @param autoRollback The auto-rollback configuration for this Deployment Group. 
   */
  public fun autoRollback(autoRollback: AutoRollbackConfigDsl.() -> Unit = {}) {
    val builder = AutoRollbackConfigDsl()
    builder.apply(autoRollback)
    cdkBuilder.autoRollback(builder.build())
  }

  /**
   * The auto-rollback configuration for this Deployment Group.
   *
   * Default: - default AutoRollbackConfig.
   *
   * @param autoRollback The auto-rollback configuration for this Deployment Group. 
   */
  public fun autoRollback(autoRollback: AutoRollbackConfig) {
    cdkBuilder.autoRollback(autoRollback)
  }

  /**
   * The Deployment Configuration this Deployment Group uses.
   *
   * Default: LambdaDeploymentConfig.CANARY_10PERCENT_5MINUTES
   *
   * @param deploymentConfig The Deployment Configuration this Deployment Group uses. 
   */
  public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  /**
   * The physical, human-readable name of the CodeDeploy Deployment Group.
   *
   * Default: - An auto-generated name will be used.
   *
   * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
   * Group. 
   */
  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  /**
   * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
   *
   * Default: false
   *
   * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
   * status from CloudWatch failed. 
   */
  public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
    cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
  }

  /**
   * The Lambda function to run after traffic routing starts.
   *
   * Default: - None.
   *
   * @param postHook The Lambda function to run after traffic routing starts. 
   */
  public fun postHook(postHook: IFunction) {
    cdkBuilder.postHook(postHook)
  }

  /**
   * The Lambda function to run before traffic routing starts.
   *
   * Default: - None.
   *
   * @param preHook The Lambda function to run before traffic routing starts. 
   */
  public fun preHook(preHook: IFunction) {
    cdkBuilder.preHook(preHook)
  }

  /**
   * The service Role of this Deployment Group.
   *
   * Default: - A new Role will be created.
   *
   * @param role The service Role of this Deployment Group. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LambdaDeploymentGroup {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
