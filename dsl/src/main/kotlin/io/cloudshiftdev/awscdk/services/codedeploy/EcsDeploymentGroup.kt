package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
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
  private val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup,
) : Resource(cdkObject), IEcsDeploymentGroup {
  public open fun addAlarm(alarm: IAlarm) {
    unwrap(this).addAlarm(alarm.let(IAlarm::unwrap))
  }

  public override fun application(): IEcsApplication =
      unwrap(this).getApplication().let(IEcsApplication::wrap)

  public override fun deploymentConfig(): IEcsDeploymentConfig =
      unwrap(this).getDeploymentConfig().let(IEcsDeploymentConfig::wrap)

  public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

  public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public interface Builder {
    public fun alarms(alarms: List<IAlarm>)

    public fun application(application: IEcsApplication)

    public fun autoRollback(autoRollback: AutoRollbackConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca78f6c480a773a52a22a9984eed5a13140cba7eb85a91c2ef1936289762ff")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    public fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3db92814a60ba1017debcfb7ffd9c75400feaac833dea2d99093e30b12df762")
    public
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig.Builder.() -> Unit)

    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)

    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    public fun role(role: IRole)

    public fun service(service: IBaseService)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup.Builder.create(scope, id)

    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    override fun application(application: IEcsApplication) {
      cdkBuilder.application(application.let(IEcsApplication::unwrap))
    }

    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83ca78f6c480a773a52a22a9984eed5a13140cba7eb85a91c2ef1936289762ff")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    override
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig) {
      cdkBuilder.blueGreenDeploymentConfig(blueGreenDeploymentConfig.let(EcsBlueGreenDeploymentConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3db92814a60ba1017debcfb7ffd9c75400feaac833dea2d99093e30b12df762")
    override
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig.Builder.() -> Unit):
        Unit = blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig(blueGreenDeploymentConfig))

    override fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IEcsDeploymentConfig::unwrap))
    }

    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
      cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
      cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun service(service: IBaseService) {
      cdkBuilder.service(service.let(IBaseService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromEcsDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EcsDeploymentGroupAttributes,
    ): IEcsDeploymentGroup =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup.fromEcsDeploymentGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(EcsDeploymentGroupAttributes::unwrap)).let(IEcsDeploymentGroup::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55f54f3ab136e14f21febc737b810d5691fddec931eb5f14c49b389f9d8cfc8c")
    public open fun fromEcsDeploymentGroupAttributes(
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
