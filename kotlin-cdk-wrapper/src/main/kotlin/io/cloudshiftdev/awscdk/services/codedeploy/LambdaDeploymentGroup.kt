@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.Alias
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LambdaDeploymentGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup,
) : Resource(cdkObject), ILambdaDeploymentGroup {
  public open fun addAlarm(alarm: IAlarm) {
    unwrap(this).addAlarm(alarm.let(IAlarm::unwrap))
  }

  public open fun addPostHook(postHook: IFunction) {
    unwrap(this).addPostHook(postHook.let(IFunction::unwrap))
  }

  public open fun addPreHook(preHook: IFunction) {
    unwrap(this).addPreHook(preHook.let(IFunction::unwrap))
  }

  public override fun application(): ILambdaApplication =
      unwrap(this).getApplication().let(ILambdaApplication::wrap)

  public override fun deploymentConfig(): ILambdaDeploymentConfig =
      unwrap(this).getDeploymentConfig().let(ILambdaDeploymentConfig::wrap)

  public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

  public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

  public open fun grantPutLifecycleEventHookExecutionStatus(grantee: IGrantable): Grant =
      unwrap(this).grantPutLifecycleEventHookExecutionStatus(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun alarms(alarms: List<IAlarm>)

    public fun alarms(vararg alarms: IAlarm)

    public fun alias(alias: Alias)

    public fun application(application: ILambdaApplication)

    public fun autoRollback(autoRollback: AutoRollbackConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1a77b4d1556f08e2a1b224b8abae3c73114c1b48b5174e9c5417dda497e6ab0")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)

    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    public fun postHook(postHook: IFunction)

    public fun preHook(preHook: IFunction)

    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup.Builder
        = software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup.Builder.create(scope, id)

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
    @JvmName("e1a77b4d1556f08e2a1b224b8abae3c73114c1b48b5174e9c5417dda497e6ab0")
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

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromLambdaDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LambdaDeploymentGroupAttributes,
    ): ILambdaDeploymentGroup =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup.fromLambdaDeploymentGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(LambdaDeploymentGroupAttributes::unwrap)).let(ILambdaDeploymentGroup::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ea77b497b67174b52d295c255acd7df97982b2c72bd6820660d6ee02f5380f9")
    public fun fromLambdaDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LambdaDeploymentGroupAttributes.Builder.() -> Unit,
    ): ILambdaDeploymentGroup = fromLambdaDeploymentGroupAttributes(scope, id,
        LambdaDeploymentGroupAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaDeploymentGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaDeploymentGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup):
        LambdaDeploymentGroup = LambdaDeploymentGroup(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup = wrapped.cdkObject
  }
}
