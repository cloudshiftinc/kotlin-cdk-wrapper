@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.ecs.IBaseService
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface EcsDeploymentGroupProps {
  public fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

  public fun application(): IEcsApplication? =
      unwrap(this).getApplication()?.let(IEcsApplication::wrap)

  public fun autoRollback(): AutoRollbackConfig? =
      unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

  public fun blueGreenDeploymentConfig(): EcsBlueGreenDeploymentConfig

  public fun deploymentConfig(): IEcsDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  public fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

  public fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun service(): IBaseService

  @CdkDslMarker
  public interface Builder {
    public fun alarms(alarms: List<IAlarm>)

    public fun alarms(vararg alarms: IAlarm)

    public fun application(application: IEcsApplication)

    public fun autoRollback(autoRollback: AutoRollbackConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e5ee438a886dcbe35d68a84faef0bd0a403f0e2cb6c5667ee27c8f12fd68e1")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    public fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57884a1559c173b315aab4c665fc683ce1c8320fd25858d5768e7ca0824b85ee")
    public
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig.Builder.() -> Unit)

    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)

    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    public fun role(role: IRole)

    public fun service(service: IBaseService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps.builder()

    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    override fun application(application: IEcsApplication) {
      cdkBuilder.application(application.let(IEcsApplication::unwrap))
    }

    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e5ee438a886dcbe35d68a84faef0bd0a403f0e2cb6c5667ee27c8f12fd68e1")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    override
        fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig) {
      cdkBuilder.blueGreenDeploymentConfig(blueGreenDeploymentConfig.let(EcsBlueGreenDeploymentConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57884a1559c173b315aab4c665fc683ce1c8320fd25858d5768e7ca0824b85ee")
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

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps,
  ) : CdkObject(cdkObject), EcsDeploymentGroupProps {
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

    override fun application(): IEcsApplication? =
        unwrap(this).getApplication()?.let(IEcsApplication::wrap)

    override fun autoRollback(): AutoRollbackConfig? =
        unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

    override fun blueGreenDeploymentConfig(): EcsBlueGreenDeploymentConfig =
        unwrap(this).getBlueGreenDeploymentConfig().let(EcsBlueGreenDeploymentConfig::wrap)

    override fun deploymentConfig(): IEcsDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IEcsDeploymentConfig::wrap)

    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    override fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

    override fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun service(): IBaseService = unwrap(this).getService().let(IBaseService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps):
        EcsDeploymentGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps
  }
}
