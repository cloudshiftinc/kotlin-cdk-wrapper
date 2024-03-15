@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDeploymentGroupProps {
  public fun alarmConfiguration(): Any? = unwrap(this).getAlarmConfiguration()

  public fun applicationName(): String

  public fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

  public fun autoScalingGroups(): List<String> = unwrap(this).getAutoScalingGroups() ?: emptyList()

  public fun blueGreenDeploymentConfiguration(): Any? =
      unwrap(this).getBlueGreenDeploymentConfiguration()

  public fun deployment(): Any? = unwrap(this).getDeployment()

  public fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  public fun deploymentStyle(): Any? = unwrap(this).getDeploymentStyle()

  public fun ec2TagFilters(): Any? = unwrap(this).getEc2TagFilters()

  public fun ec2TagSet(): Any? = unwrap(this).getEc2TagSet()

  public fun ecsServices(): Any? = unwrap(this).getEcsServices()

  public fun loadBalancerInfo(): Any? = unwrap(this).getLoadBalancerInfo()

  public fun onPremisesInstanceTagFilters(): Any? = unwrap(this).getOnPremisesInstanceTagFilters()

  public fun onPremisesTagSet(): Any? = unwrap(this).getOnPremisesTagSet()

  public fun outdatedInstancesStrategy(): String? = unwrap(this).getOutdatedInstancesStrategy()

  public fun serviceRoleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun terminationHookEnabled(): Any? = unwrap(this).getTerminationHookEnabled()

  public fun triggerConfigurations(): Any? = unwrap(this).getTriggerConfigurations()

  @CdkDslMarker
  public interface Builder {
    public fun alarmConfiguration(alarmConfiguration: IResolvable)

    public fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752d17c273d96d68942144b914431bd2b74dd97401018429d6ed6da6c0c01ae4")
    public
        fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty.Builder.() -> Unit)

    public fun applicationName(applicationName: String)

    public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable)

    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd617bf78494360209f8489c9ebc34e864a5519f551d825d84e1eb9b6e4646fd")
    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder.() -> Unit)

    public fun autoScalingGroups(autoScalingGroups: List<String>)

    public fun autoScalingGroups(vararg autoScalingGroups: String)

    public fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable)

    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ff9a3dd1ca2e8fcbcbab64638e71692e578f15ddc73f49bb67094de6ecb43e")
    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit)

    public fun deployment(deployment: IResolvable)

    public fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e8321a2c4159ce336711aaef4da1bc73c537604236c821b2dce109b860c8f08")
    public fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty.Builder.() -> Unit)

    public fun deploymentConfigName(deploymentConfigName: String)

    public fun deploymentGroupName(deploymentGroupName: String)

    public fun deploymentStyle(deploymentStyle: IResolvable)

    public fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e2d0cd76ae805545f6ebae24c2a9649c6f4bb198d17d50683364022e9c4f3d")
    public
        fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty.Builder.() -> Unit)

    public fun ec2TagFilters(ec2TagFilters: IResolvable)

    public fun ec2TagFilters(ec2TagFilters: List<Any>)

    public fun ec2TagFilters(vararg ec2TagFilters: Any)

    public fun ec2TagSet(ec2TagSet: IResolvable)

    public fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b277633da03ac6243e849e9b71a04b3e5a52c1f6fb3d27ebf790c7c05cbd62")
    public fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty.Builder.() -> Unit)

    public fun ecsServices(ecsServices: IResolvable)

    public fun ecsServices(ecsServices: List<Any>)

    public fun ecsServices(vararg ecsServices: Any)

    public fun loadBalancerInfo(loadBalancerInfo: IResolvable)

    public fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5c8806b3ca93f50b993e4fed27e7905a070fa29c8a96f1491776d7de802a454")
    public
        fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty.Builder.() -> Unit)

    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable)

    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>)

    public fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any)

    public fun onPremisesTagSet(onPremisesTagSet: IResolvable)

    public fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4c19b76ece4da92c21c94bb36e73c9999b231fe247f659c8399e706e58e1e3a")
    public
        fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder.() -> Unit)

    public fun outdatedInstancesStrategy(outdatedInstancesStrategy: String)

    public fun serviceRoleArn(serviceRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun terminationHookEnabled(terminationHookEnabled: Boolean)

    public fun terminationHookEnabled(terminationHookEnabled: IResolvable)

    public fun triggerConfigurations(triggerConfigurations: IResolvable)

    public fun triggerConfigurations(triggerConfigurations: List<Any>)

    public fun triggerConfigurations(vararg triggerConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps.builder()

    override fun alarmConfiguration(alarmConfiguration: IResolvable) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(IResolvable::unwrap))
    }

    override
        fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(CfnDeploymentGroup.AlarmConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752d17c273d96d68942144b914431bd2b74dd97401018429d6ed6da6c0c01ae4")
    override
        fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty.Builder.() -> Unit):
        Unit = alarmConfiguration(CfnDeploymentGroup.AlarmConfigurationProperty(alarmConfiguration))

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(IResolvable::unwrap))
    }

    override
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(CfnDeploymentGroup.AutoRollbackConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd617bf78494360209f8489c9ebc34e864a5519f551d825d84e1eb9b6e4646fd")
    override
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoRollbackConfiguration(CfnDeploymentGroup.AutoRollbackConfigurationProperty(autoRollbackConfiguration))

    override fun autoScalingGroups(autoScalingGroups: List<String>) {
      cdkBuilder.autoScalingGroups(autoScalingGroups)
    }

    override fun autoScalingGroups(vararg autoScalingGroups: String): Unit =
        autoScalingGroups(autoScalingGroups.toList())

    override fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ff9a3dd1ca2e8fcbcbab64638e71692e578f15ddc73f49bb67094de6ecb43e")
    override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        blueGreenDeploymentConfiguration(CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty(blueGreenDeploymentConfiguration))

    override fun deployment(deployment: IResolvable) {
      cdkBuilder.deployment(deployment.let(IResolvable::unwrap))
    }

    override fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty) {
      cdkBuilder.deployment(deployment.let(CfnDeploymentGroup.DeploymentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e8321a2c4159ce336711aaef4da1bc73c537604236c821b2dce109b860c8f08")
    override fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty.Builder.() -> Unit):
        Unit = deployment(CfnDeploymentGroup.DeploymentProperty(deployment))

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    override fun deploymentStyle(deploymentStyle: IResolvable) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(IResolvable::unwrap))
    }

    override fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(CfnDeploymentGroup.DeploymentStyleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e2d0cd76ae805545f6ebae24c2a9649c6f4bb198d17d50683364022e9c4f3d")
    override
        fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty.Builder.() -> Unit):
        Unit = deploymentStyle(CfnDeploymentGroup.DeploymentStyleProperty(deploymentStyle))

    override fun ec2TagFilters(ec2TagFilters: IResolvable) {
      cdkBuilder.ec2TagFilters(ec2TagFilters.let(IResolvable::unwrap))
    }

    override fun ec2TagFilters(ec2TagFilters: List<Any>) {
      cdkBuilder.ec2TagFilters(ec2TagFilters)
    }

    override fun ec2TagFilters(vararg ec2TagFilters: Any): Unit =
        ec2TagFilters(ec2TagFilters.toList())

    override fun ec2TagSet(ec2TagSet: IResolvable) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(IResolvable::unwrap))
    }

    override fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(CfnDeploymentGroup.EC2TagSetProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b277633da03ac6243e849e9b71a04b3e5a52c1f6fb3d27ebf790c7c05cbd62")
    override fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty.Builder.() -> Unit): Unit
        = ec2TagSet(CfnDeploymentGroup.EC2TagSetProperty(ec2TagSet))

    override fun ecsServices(ecsServices: IResolvable) {
      cdkBuilder.ecsServices(ecsServices.let(IResolvable::unwrap))
    }

    override fun ecsServices(ecsServices: List<Any>) {
      cdkBuilder.ecsServices(ecsServices)
    }

    override fun ecsServices(vararg ecsServices: Any): Unit = ecsServices(ecsServices.toList())

    override fun loadBalancerInfo(loadBalancerInfo: IResolvable) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(IResolvable::unwrap))
    }

    override fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(CfnDeploymentGroup.LoadBalancerInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5c8806b3ca93f50b993e4fed27e7905a070fa29c8a96f1491776d7de802a454")
    override
        fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty.Builder.() -> Unit):
        Unit = loadBalancerInfo(CfnDeploymentGroup.LoadBalancerInfoProperty(loadBalancerInfo))

    override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.let(IResolvable::unwrap))
    }

    override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters)
    }

    override fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any): Unit =
        onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.toList())

    override fun onPremisesTagSet(onPremisesTagSet: IResolvable) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(IResolvable::unwrap))
    }

    override fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(CfnDeploymentGroup.OnPremisesTagSetProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4c19b76ece4da92c21c94bb36e73c9999b231fe247f659c8399e706e58e1e3a")
    override
        fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder.() -> Unit):
        Unit = onPremisesTagSet(CfnDeploymentGroup.OnPremisesTagSetProperty(onPremisesTagSet))

    override fun outdatedInstancesStrategy(outdatedInstancesStrategy: String) {
      cdkBuilder.outdatedInstancesStrategy(outdatedInstancesStrategy)
    }

    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun terminationHookEnabled(terminationHookEnabled: Boolean) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled)
    }

    override fun terminationHookEnabled(terminationHookEnabled: IResolvable) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled.let(IResolvable::unwrap))
    }

    override fun triggerConfigurations(triggerConfigurations: IResolvable) {
      cdkBuilder.triggerConfigurations(triggerConfigurations.let(IResolvable::unwrap))
    }

    override fun triggerConfigurations(triggerConfigurations: List<Any>) {
      cdkBuilder.triggerConfigurations(triggerConfigurations)
    }

    override fun triggerConfigurations(vararg triggerConfigurations: Any): Unit =
        triggerConfigurations(triggerConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps,
  ) : CdkObject(cdkObject), CfnDeploymentGroupProps {
    override fun alarmConfiguration(): Any? = unwrap(this).getAlarmConfiguration()

    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

    override fun autoScalingGroups(): List<String> = unwrap(this).getAutoScalingGroups() ?:
        emptyList()

    override fun blueGreenDeploymentConfiguration(): Any? =
        unwrap(this).getBlueGreenDeploymentConfiguration()

    override fun deployment(): Any? = unwrap(this).getDeployment()

    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    override fun deploymentStyle(): Any? = unwrap(this).getDeploymentStyle()

    override fun ec2TagFilters(): Any? = unwrap(this).getEc2TagFilters()

    override fun ec2TagSet(): Any? = unwrap(this).getEc2TagSet()

    override fun ecsServices(): Any? = unwrap(this).getEcsServices()

    override fun loadBalancerInfo(): Any? = unwrap(this).getLoadBalancerInfo()

    override fun onPremisesInstanceTagFilters(): Any? =
        unwrap(this).getOnPremisesInstanceTagFilters()

    override fun onPremisesTagSet(): Any? = unwrap(this).getOnPremisesTagSet()

    override fun outdatedInstancesStrategy(): String? = unwrap(this).getOutdatedInstancesStrategy()

    override fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun terminationHookEnabled(): Any? = unwrap(this).getTerminationHookEnabled()

    override fun triggerConfigurations(): Any? = unwrap(this).getTriggerConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps):
        CfnDeploymentGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
  }
}
