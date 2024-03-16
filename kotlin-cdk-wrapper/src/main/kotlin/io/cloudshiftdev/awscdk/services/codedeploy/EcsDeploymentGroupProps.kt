@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.ecs.IBaseService
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
public interface EcsDeploymentGroupProps {
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
   */
  public fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

  /**
   * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
   *
   * Default: One will be created for you.
   */
  public fun application(): IEcsApplication? =
      unwrap(this).getApplication()?.let(IEcsApplication::wrap)

  /**
   * The auto-rollback configuration for this Deployment Group.
   *
   * Default: - default AutoRollbackConfig.
   */
  public fun autoRollback(): AutoRollbackConfig? =
      unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

  /**
   * The configuration options for blue-green ECS deployments.
   */
  public fun blueGreenDeploymentConfig(): EcsBlueGreenDeploymentConfig

  /**
   * The Deployment Configuration this Deployment Group uses.
   *
   * Default: EcsDeploymentConfig.ALL_AT_ONCE
   */
  public fun deploymentConfig(): IEcsDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

  /**
   * The physical, human-readable name of the CodeDeploy Deployment Group.
   *
   * Default: An auto-generated name will be used.
   */
  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  /**
   * Whether to skip the step of checking CloudWatch alarms during the deployment process.
   *
   * Default: - false
   */
  public fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

  /**
   * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
   *
   * Default: false
   */
  public fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

  /**
   * The service Role of this Deployment Group.
   *
   * Default: - A new Role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The ECS service to deploy with this Deployment Group.
   */
  public fun service(): IBaseService

  /**
   * A builder for [EcsDeploymentGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(alarms: List<IAlarm>)

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(vararg alarms: IAlarm)

    /**
     * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
     * belongs to.
     */
    public fun application(application: IEcsApplication)

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    public fun autoRollback(autoRollback: AutoRollbackConfig)

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e5ee438a886dcbe35d68a84faef0bd0a403f0e2cb6c5667ee27c8f12fd68e1")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    /**
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    public fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig)

    /**
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57884a1559c173b315aab4c665fc683ce1c8320fd25858d5768e7ca0824b85ee")
    public
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig.Builder.() -> Unit)

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig)

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group.
     */
    public fun deploymentGroupName(deploymentGroupName: String)

    /**
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process.
     */
    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed.
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    /**
     * @param role The service Role of this Deployment Group.
     */
    public fun role(role: IRole)

    /**
     * @param service The ECS service to deploy with this Deployment Group. 
     */
    public fun service(service: IBaseService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps.builder()

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    /**
     * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
     * belongs to.
     */
    override fun application(application: IEcsApplication) {
      cdkBuilder.application(application.let(IEcsApplication::unwrap))
    }

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e5ee438a886dcbe35d68a84faef0bd0a403f0e2cb6c5667ee27c8f12fd68e1")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    /**
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    override
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig) {
      cdkBuilder.blueGreenDeploymentConfig(blueGreenDeploymentConfig.let(EcsBlueGreenDeploymentConfig::unwrap))
    }

    /**
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57884a1559c173b315aab4c665fc683ce1c8320fd25858d5768e7ca0824b85ee")
    override
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig.Builder.() -> Unit):
        Unit = blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig(blueGreenDeploymentConfig))

    /**
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses.
     */
    override fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IEcsDeploymentConfig::unwrap))
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group.
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process.
     */
    override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
      cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed.
     */
    override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
      cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /**
     * @param role The service Role of this Deployment Group.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param service The ECS service to deploy with this Deployment Group. 
     */
    override fun service(service: IBaseService) {
      cdkBuilder.service(service.let(IBaseService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps,
  ) : CdkObject(cdkObject), EcsDeploymentGroupProps {
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
     */
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

    /**
     * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
     *
     * Default: One will be created for you.
     */
    override fun application(): IEcsApplication? =
        unwrap(this).getApplication()?.let(IEcsApplication::wrap)

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     */
    override fun autoRollback(): AutoRollbackConfig? =
        unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

    /**
     * The configuration options for blue-green ECS deployments.
     */
    override fun blueGreenDeploymentConfig(): EcsBlueGreenDeploymentConfig =
        unwrap(this).getBlueGreenDeploymentConfig().let(EcsBlueGreenDeploymentConfig::wrap)

    /**
     * The Deployment Configuration this Deployment Group uses.
     *
     * Default: EcsDeploymentConfig.ALL_AT_ONCE
     */
    override fun deploymentConfig(): IEcsDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: An auto-generated name will be used.
     */
    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     */
    override fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     */
    override fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The ECS service to deploy with this Deployment Group.
     */
    override fun service(): IBaseService = unwrap(this).getService().let(IBaseService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps):
        EcsDeploymentGroupProps = CdkObjectWrappers.wrap(cdkObject) as EcsDeploymentGroupProps

    internal fun unwrap(wrapped: EcsDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps
  }
}
