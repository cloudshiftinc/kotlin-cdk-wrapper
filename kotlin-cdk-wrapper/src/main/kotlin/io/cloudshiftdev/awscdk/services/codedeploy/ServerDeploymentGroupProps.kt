@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ServerDeploymentGroupProps {
  public fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

  public fun application(): IServerApplication? =
      unwrap(this).getApplication()?.let(IServerApplication::wrap)

  public fun autoRollback(): AutoRollbackConfig? =
      unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

  public fun autoScalingGroups(): List<IAutoScalingGroup> =
      unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

  public fun deploymentConfig(): IServerDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  public fun ec2InstanceTags(): InstanceTagSet? =
      unwrap(this).getEc2InstanceTags()?.let(InstanceTagSet::wrap)

  public fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

  public fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

  public fun installAgent(): Boolean? = unwrap(this).getInstallAgent()

  @Deprecated(message = "deprecated in CDK")
  public fun loadBalancer(): LoadBalancer? = unwrap(this).getLoadBalancer()?.let(LoadBalancer::wrap)

  public fun loadBalancers(): List<LoadBalancer> =
      unwrap(this).getLoadBalancers()?.map(LoadBalancer::wrap) ?: emptyList()

  public fun onPremiseInstanceTags(): InstanceTagSet? =
      unwrap(this).getOnPremiseInstanceTags()?.let(InstanceTagSet::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun alarms(alarms: List<IAlarm>)

    public fun alarms(vararg alarms: IAlarm)

    public fun application(application: IServerApplication)

    public fun autoRollback(autoRollback: AutoRollbackConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3046950c6146b52965983daef23167566d290236d1d1ed3b9133ef276ad78864")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    public fun autoScalingGroups(autoScalingGroups: List<IAutoScalingGroup>)

    public fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup)

    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig)

    public fun deploymentGroupName(deploymentGroupName: String)

    public fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet)

    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    public fun installAgent(installAgent: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun loadBalancer(loadBalancer: LoadBalancer)

    public fun loadBalancers(loadBalancers: List<LoadBalancer>)

    public fun loadBalancers(vararg loadBalancers: LoadBalancer)

    public fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps.builder()

    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    override fun application(application: IServerApplication) {
      cdkBuilder.application(application.let(IServerApplication::unwrap))
    }

    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3046950c6146b52965983daef23167566d290236d1d1ed3b9133ef276ad78864")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    override fun autoScalingGroups(autoScalingGroups: List<IAutoScalingGroup>) {
      cdkBuilder.autoScalingGroups(autoScalingGroups.map(IAutoScalingGroup::unwrap))
    }

    override fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup): Unit =
        autoScalingGroups(autoScalingGroups.toList())

    override fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IServerDeploymentConfig::unwrap))
    }

    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    override fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet) {
      cdkBuilder.ec2InstanceTags(ec2InstanceTags.let(InstanceTagSet::unwrap))
    }

    override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
      cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
      cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    override fun installAgent(installAgent: Boolean) {
      cdkBuilder.installAgent(installAgent)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun loadBalancer(loadBalancer: LoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(LoadBalancer::unwrap))
    }

    override fun loadBalancers(loadBalancers: List<LoadBalancer>) {
      cdkBuilder.loadBalancers(loadBalancers.map(LoadBalancer::unwrap))
    }

    override fun loadBalancers(vararg loadBalancers: LoadBalancer): Unit =
        loadBalancers(loadBalancers.toList())

    override fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet) {
      cdkBuilder.onPremiseInstanceTags(onPremiseInstanceTags.let(InstanceTagSet::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps,
  ) : CdkObject(cdkObject), ServerDeploymentGroupProps {
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

    override fun application(): IServerApplication? =
        unwrap(this).getApplication()?.let(IServerApplication::wrap)

    override fun autoRollback(): AutoRollbackConfig? =
        unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

    override fun autoScalingGroups(): List<IAutoScalingGroup> =
        unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

    override fun deploymentConfig(): IServerDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    override fun ec2InstanceTags(): InstanceTagSet? =
        unwrap(this).getEc2InstanceTags()?.let(InstanceTagSet::wrap)

    override fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

    override fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

    override fun installAgent(): Boolean? = unwrap(this).getInstallAgent()

    @Deprecated(message = "deprecated in CDK")
    override fun loadBalancer(): LoadBalancer? =
        unwrap(this).getLoadBalancer()?.let(LoadBalancer::wrap)

    override fun loadBalancers(): List<LoadBalancer> =
        unwrap(this).getLoadBalancers()?.map(LoadBalancer::wrap) ?: emptyList()

    override fun onPremiseInstanceTags(): InstanceTagSet? =
        unwrap(this).getOnPremiseInstanceTags()?.let(InstanceTagSet::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps):
        ServerDeploymentGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
  }
}
