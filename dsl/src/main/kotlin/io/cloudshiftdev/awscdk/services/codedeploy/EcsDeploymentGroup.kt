package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.ecs.IBaseService
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EcsDeploymentGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup,
) : Resource(cdkObject), IEcsDeploymentGroup {
  /**
   * Associates an additional alarm with this Deployment Group.
   *
   * @param alarm the alarm to associate with this Deployment Group. 
   */
  public open fun addAlarm(alarm: IAlarm) {
    unwrap(this).addAlarm(alarm.let(IAlarm::unwrap))
  }

  /**
   * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
   */
  public override fun application(): IEcsApplication =
      unwrap(this).getApplication().let(IEcsApplication::wrap)

  /**
   * The Deployment Configuration this Group uses.
   */
  public override fun deploymentConfig(): IEcsDeploymentConfig =
      unwrap(this).getDeploymentConfig().let(IEcsDeploymentConfig::wrap)

  /**
   * The ARN of the Deployment Group.
   */
  public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

  /**
   * The name of the Deployment Group.
   */
  public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

  /**
   * The service Role of this Deployment Group.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.EcsDeploymentGroup].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun alarms(alarms: List<IAlarm>)

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
    public fun alarms(vararg alarms: IAlarm)

    /**
     * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
     *
     * Default: One will be created for you.
     *
     * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
     * belongs to. 
     */
    public fun application(application: IEcsApplication)

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    public fun autoRollback(autoRollback: AutoRollbackConfig)

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca78f6c480a773a52a22a9984eed5a13140cba7eb85a91c2ef1936289762ff")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    /**
     * The configuration options for blue-green ECS deployments.
     *
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    public fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig)

    /**
     * The configuration options for blue-green ECS deployments.
     *
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3db92814a60ba1017debcfb7ffd9c75400feaac833dea2d99093e30b12df762")
    public
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig.Builder.() -> Unit)

    /**
     * The Deployment Configuration this Deployment Group uses.
     *
     * Default: EcsDeploymentConfig.ALL_AT_ONCE
     *
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses. 
     */
    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig)

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: An auto-generated name will be used.
     *
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group. 
     */
    public fun deploymentGroupName(deploymentGroupName: String)

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     *
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process. 
     */
    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     *
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed. 
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     *
     * @param role The service Role of this Deployment Group. 
     */
    public fun role(role: IRole)

    /**
     * The ECS service to deploy with this Deployment Group.
     *
     * @param service The ECS service to deploy with this Deployment Group. 
     */
    public fun service(service: IBaseService)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup.Builder.create(scope, id)

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
    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
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
    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    /**
     * The reference to the CodeDeploy ECS Application that this Deployment Group belongs to.
     *
     * Default: One will be created for you.
     *
     * @param application The reference to the CodeDeploy ECS Application that this Deployment Group
     * belongs to. 
     */
    override fun application(application: IEcsApplication) {
      cdkBuilder.application(application.let(IEcsApplication::unwrap))
    }

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca78f6c480a773a52a22a9984eed5a13140cba7eb85a91c2ef1936289762ff")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    /**
     * The configuration options for blue-green ECS deployments.
     *
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    override
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig) {
      cdkBuilder.blueGreenDeploymentConfig(blueGreenDeploymentConfig.let(EcsBlueGreenDeploymentConfig::unwrap))
    }

    /**
     * The configuration options for blue-green ECS deployments.
     *
     * @param blueGreenDeploymentConfig The configuration options for blue-green ECS deployments. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3db92814a60ba1017debcfb7ffd9c75400feaac833dea2d99093e30b12df762")
    override
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig.Builder.() -> Unit):
        Unit = blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig(blueGreenDeploymentConfig))

    /**
     * The Deployment Configuration this Deployment Group uses.
     *
     * Default: EcsDeploymentConfig.ALL_AT_ONCE
     *
     * @param deploymentConfig The Deployment Configuration this Deployment Group uses. 
     */
    override fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IEcsDeploymentConfig::unwrap))
    }

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: An auto-generated name will be used.
     *
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group. 
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     *
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process. 
     */
    override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
      cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     *
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed. 
     */
    override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
      cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     *
     * @param role The service Role of this Deployment Group. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The ECS service to deploy with this Deployment Group.
     *
     * @param service The ECS service to deploy with this Deployment Group. 
     */
    override fun service(service: IBaseService) {
      cdkBuilder.service(service.let(IBaseService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromEcsDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EcsDeploymentGroupAttributes,
    ): IEcsDeploymentGroup =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup.fromEcsDeploymentGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(EcsDeploymentGroupAttributes::unwrap)).let(IEcsDeploymentGroup::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55f54f3ab136e14f21febc737b810d5691fddec931eb5f14c49b389f9d8cfc8c")
    public fun fromEcsDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EcsDeploymentGroupAttributes.Builder.() -> Unit,
    ): IEcsDeploymentGroup = fromEcsDeploymentGroupAttributes(scope, id,
        EcsDeploymentGroupAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsDeploymentGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsDeploymentGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup):
        EcsDeploymentGroup = EcsDeploymentGroup(cdkObject)

    internal fun unwrap(wrapped: EcsDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup = wrapped.cdkObject
  }
}