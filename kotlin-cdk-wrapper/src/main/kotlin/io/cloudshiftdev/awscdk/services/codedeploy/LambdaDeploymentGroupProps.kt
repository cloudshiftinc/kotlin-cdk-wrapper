@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.Alias
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface LambdaDeploymentGroupProps {
  public fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

  public fun alias(): Alias

  public fun application(): ILambdaApplication? =
      unwrap(this).getApplication()?.let(ILambdaApplication::wrap)

  public fun autoRollback(): AutoRollbackConfig? =
      unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

  public fun deploymentConfig(): ILambdaDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  public fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

  public fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

  public fun postHook(): IFunction? = unwrap(this).getPostHook()?.let(IFunction::wrap)

  public fun preHook(): IFunction? = unwrap(this).getPreHook()?.let(IFunction::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun alarms(alarms: List<IAlarm>)

    public fun alarms(vararg alarms: IAlarm)

    public fun alias(alias: Alias)

    public fun application(application: ILambdaApplication)

    public fun autoRollback(autoRollback: AutoRollbackConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e92422702b869d68af2098de02b3d9ca5ef912330c758253bdeb193c9cf92d03")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)

    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    public fun postHook(postHook: IFunction)

    public fun preHook(preHook: IFunction)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps.builder()

    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    override fun alias(alias: Alias) {
      cdkBuilder.alias(alias.let(Alias::unwrap))
    }

    override fun application(application: ILambdaApplication) {
      cdkBuilder.application(application.let(ILambdaApplication::unwrap))
    }

    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e92422702b869d68af2098de02b3d9ca5ef912330c758253bdeb193c9cf92d03")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    override fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(ILambdaDeploymentConfig::unwrap))
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

    override fun postHook(postHook: IFunction) {
      cdkBuilder.postHook(postHook.let(IFunction::unwrap))
    }

    override fun preHook(preHook: IFunction) {
      cdkBuilder.preHook(preHook.let(IFunction::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps,
  ) : CdkObject(cdkObject), LambdaDeploymentGroupProps {
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

    override fun alias(): Alias = unwrap(this).getAlias().let(Alias::wrap)

    override fun application(): ILambdaApplication? =
        unwrap(this).getApplication()?.let(ILambdaApplication::wrap)

    override fun autoRollback(): AutoRollbackConfig? =
        unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

    override fun deploymentConfig(): ILambdaDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(ILambdaDeploymentConfig::wrap)

    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    override fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

    override fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

    override fun postHook(): IFunction? = unwrap(this).getPostHook()?.let(IFunction::wrap)

    override fun preHook(): IFunction? = unwrap(this).getPreHook()?.let(IFunction::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps):
        LambdaDeploymentGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
  }
}
