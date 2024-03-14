package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ServerDeploymentGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup,
) : Resource(cdkObject), IServerDeploymentGroup {
  public open fun addAlarm(alarm: IAlarm) {
    unwrap(this).addAlarm(alarm.let(IAlarm::unwrap))
  }

  public open fun addAutoScalingGroup(asg: AutoScalingGroup) {
    unwrap(this).addAutoScalingGroup(asg.let(AutoScalingGroup::unwrap))
  }

  public override fun application(): IServerApplication =
      unwrap(this).getApplication().let(IServerApplication::wrap)

  public override fun autoScalingGroups(): List<IAutoScalingGroup> =
      unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

  public override fun deploymentConfig(): IServerDeploymentConfig =
      unwrap(this).getDeploymentConfig().let(IServerDeploymentConfig::wrap)

  public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

  public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public interface Builder {
    public fun alarms(alarms: List<IAlarm>)

    public fun alarms(vararg alarms: IAlarm)

    public fun application(application: IServerApplication)

    public fun autoRollback(autoRollback: AutoRollbackConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0c54e4cfaaa14cf8c23135a5ce5e71f8784d080143325d499e3147100edc21e")
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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.Builder
        = software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.Builder.create(scope, id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0c54e4cfaaa14cf8c23135a5ce5e71f8784d080143325d499e3147100edc21e")
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

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromServerDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerDeploymentGroupAttributes,
    ): IServerDeploymentGroup =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.fromServerDeploymentGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ServerDeploymentGroupAttributes::unwrap)).let(IServerDeploymentGroup::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d26e7a25cd6411326fe7cb7007a72ecb87fdcb6166fa4246aa79b27de671bfb")
    public open fun fromServerDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerDeploymentGroupAttributes.Builder.() -> Unit,
    ): IServerDeploymentGroup = fromServerDeploymentGroupAttributes(scope, id,
        ServerDeploymentGroupAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServerDeploymentGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServerDeploymentGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup):
        ServerDeploymentGroup = ServerDeploymentGroup(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup = wrapped.cdkObject
  }
}
