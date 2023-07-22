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
import software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.IEcsApplication
import software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig
import software.amazon.awscdk.services.ecs.IBaseService
import software.amazon.awscdk.services.iam.IRole

/**
 * Construction properties for `EcsDeploymentGroup`.
 *
 * Example:
 *
 * ```
 * EcsApplication myApplication;
 * Cluster cluster;
 * FargateTaskDefinition taskDefinition;
 * ITargetGroup blueTargetGroup;
 * ITargetGroup greenTargetGroup;
 * IApplicationListener listener;
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .deploymentController(DeploymentController.builder()
 * .type(DeploymentControllerType.CODE_DEPLOY)
 * .build())
 * .build();
 * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
 * .service(service)
 * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
 * .blueTargetGroup(blueTargetGroup)
 * .greenTargetGroup(greenTargetGroup)
 * .listener(listener)
 * .build())
 * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsDeploymentGroupPropsDsl {
  private val cdkBuilder: EcsDeploymentGroupProps.Builder = EcsDeploymentGroupProps.builder()

  private val _alarms: MutableList<IAlarm> = mutableListOf()

  /**
   * @param alarms The CloudWatch alarms associated with this Deployment Group.
   * CodeDeploy will stop (and optionally roll back)
   * a deployment if during it any of the alarms trigger.
   *
   * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
   */
  public fun alarms(vararg alarms: IAlarm) {
    _alarms.addAll(listOf(*alarms))
  }

  /**
   * @param alarms The CloudWatch alarms associated with this Deployment Group.
   * CodeDeploy will stop (and optionally roll back)
   * a deployment if during it any of the alarms trigger.
   *
   * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
   */
  public fun alarms(alarms: Collection<IAlarm>) {
    _alarms.addAll(alarms)
  }

  /**
   * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
   * belongs to.
   */
  public fun application(application: IEcsApplication) {
    cdkBuilder.application(application)
  }

  /**
   * @param autoRollback The auto-rollback configuration for this Deployment Group.
   */
  public fun autoRollback(autoRollback: AutoRollbackConfigDsl.() -> Unit = {}) {
    val builder = AutoRollbackConfigDsl()
    builder.apply(autoRollback)
    cdkBuilder.autoRollback(builder.build())
  }

  /**
   * @param autoRollback The auto-rollback configuration for this Deployment Group.
   */
  public fun autoRollback(autoRollback: AutoRollbackConfig) {
    cdkBuilder.autoRollback(autoRollback)
  }

  /**
   * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
   */
  public
      fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfigDsl.() -> Unit
      = {}) {
    val builder = EcsBlueGreenDeploymentConfigDsl()
    builder.apply(blueGreenDeploymentConfig)
    cdkBuilder.blueGreenDeploymentConfig(builder.build())
  }

  /**
   * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
   */
  public fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig) {
    cdkBuilder.blueGreenDeploymentConfig(blueGreenDeploymentConfig)
  }

  /**
   * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
   */
  public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  /**
   * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
   * Group.
   */
  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  /**
   * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
   * status from CloudWatch failed.
   */
  public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
    cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
  }

  /**
   * @param role The service Role of this Deployment Group.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param service The ECS service to deploy with this Deployment Group. 
   */
  public fun service(service: IBaseService) {
    cdkBuilder.service(service)
  }

  public fun build(): EcsDeploymentGroupProps {
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    return cdkBuilder.build()
  }
}
