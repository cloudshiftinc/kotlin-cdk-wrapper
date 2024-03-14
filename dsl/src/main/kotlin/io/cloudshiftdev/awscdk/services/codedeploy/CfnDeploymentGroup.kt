package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeploymentGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun alarmConfiguration(): Any? = unwrap(this).getAlarmConfiguration()

  public open fun alarmConfiguration(`value`: IResolvable) {
    unwrap(this).setAlarmConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun alarmConfiguration(`value`: AlarmConfigurationProperty) {
    unwrap(this).setAlarmConfiguration(`value`.let(AlarmConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b7bdf4be6e22d722e7903cb5733cb4a9dac4ff486f8fc5660e43e2ef4d21425")
  public open fun alarmConfiguration(`value`: AlarmConfigurationProperty.Builder.() -> Unit): Unit =
      alarmConfiguration(AlarmConfigurationProperty(`value`))

  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

  public open fun autoRollbackConfiguration(`value`: IResolvable) {
    unwrap(this).setAutoRollbackConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun autoRollbackConfiguration(`value`: AutoRollbackConfigurationProperty) {
    unwrap(this).setAutoRollbackConfiguration(`value`.let(AutoRollbackConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("87a8c7998c52b849a1393de3b947f0443d93c8e0474b83ba1364c3e591623f10")
  public open
      fun autoRollbackConfiguration(`value`: AutoRollbackConfigurationProperty.Builder.() -> Unit):
      Unit = autoRollbackConfiguration(AutoRollbackConfigurationProperty(`value`))

  public open fun autoScalingGroups(): List<String> = unwrap(this).getAutoScalingGroups() ?:
      emptyList()

  public open fun autoScalingGroups(`value`: List<String>) {
    unwrap(this).setAutoScalingGroups(`value`)
  }

  public open fun blueGreenDeploymentConfiguration(): Any? =
      unwrap(this).getBlueGreenDeploymentConfiguration()

  public open fun blueGreenDeploymentConfiguration(`value`: IResolvable) {
    unwrap(this).setBlueGreenDeploymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun blueGreenDeploymentConfiguration(`value`: BlueGreenDeploymentConfigurationProperty) {
    unwrap(this).setBlueGreenDeploymentConfiguration(`value`.let(BlueGreenDeploymentConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("790f94756d9404099784a811862d7b1a81eaf24cb37047202f6d125024a8924f")
  public open
      fun blueGreenDeploymentConfiguration(`value`: BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit):
      Unit = blueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationProperty(`value`))

  public open fun deployment(): Any? = unwrap(this).getDeployment()

  public open fun deployment(`value`: IResolvable) {
    unwrap(this).setDeployment(`value`.let(IResolvable::unwrap))
  }

  public open fun deployment(`value`: DeploymentProperty) {
    unwrap(this).setDeployment(`value`.let(DeploymentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a125d976d3f2b3a2ca087c19f2a113042ae0e2e94976224ff89ea4d0928dd2b6")
  public open fun deployment(`value`: DeploymentProperty.Builder.() -> Unit): Unit =
      deployment(DeploymentProperty(`value`))

  public open fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  public open fun deploymentConfigName(`value`: String) {
    unwrap(this).setDeploymentConfigName(`value`)
  }

  public open fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  public open fun deploymentGroupName(`value`: String) {
    unwrap(this).setDeploymentGroupName(`value`)
  }

  public open fun deploymentStyle(): Any? = unwrap(this).getDeploymentStyle()

  public open fun deploymentStyle(`value`: IResolvable) {
    unwrap(this).setDeploymentStyle(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentStyle(`value`: DeploymentStyleProperty) {
    unwrap(this).setDeploymentStyle(`value`.let(DeploymentStyleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("daf7a4a9a8a46c0f43695e44c1230fabfe6f4d4c32d552740946d48d0b6aa4ac")
  public open fun deploymentStyle(`value`: DeploymentStyleProperty.Builder.() -> Unit): Unit =
      deploymentStyle(DeploymentStyleProperty(`value`))

  public open fun ec2TagFilters(): Any? = unwrap(this).getEc2TagFilters()

  public open fun ec2TagFilters(`value`: IResolvable) {
    unwrap(this).setEc2TagFilters(`value`.let(IResolvable::unwrap))
  }

  public open fun ec2TagFilters(__idx_ac66f0: List<Any>) {
    unwrap(this).setEc2TagFilters(__idx_ac66f0)
  }

  public open fun ec2TagSet(): Any? = unwrap(this).getEc2TagSet()

  public open fun ec2TagSet(`value`: IResolvable) {
    unwrap(this).setEc2TagSet(`value`.let(IResolvable::unwrap))
  }

  public open fun ec2TagSet(`value`: EC2TagSetProperty) {
    unwrap(this).setEc2TagSet(`value`.let(EC2TagSetProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d444a3942f576655ff2a4b6f3779cc22d9d1b72ec86c41a4f0a66239ceb2b8d2")
  public open fun ec2TagSet(`value`: EC2TagSetProperty.Builder.() -> Unit): Unit =
      ec2TagSet(EC2TagSetProperty(`value`))

  public open fun ecsServices(): Any? = unwrap(this).getEcsServices()

  public open fun ecsServices(`value`: IResolvable) {
    unwrap(this).setEcsServices(`value`.let(IResolvable::unwrap))
  }

  public open fun ecsServices(__idx_ac66f0: List<Any>) {
    unwrap(this).setEcsServices(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loadBalancerInfo(): Any? = unwrap(this).getLoadBalancerInfo()

  public open fun loadBalancerInfo(`value`: IResolvable) {
    unwrap(this).setLoadBalancerInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun loadBalancerInfo(`value`: LoadBalancerInfoProperty) {
    unwrap(this).setLoadBalancerInfo(`value`.let(LoadBalancerInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("25b7486f81e38de51c21846a2e1828e8cf61e8a7fbd703dc7fa289fbb266563a")
  public open fun loadBalancerInfo(`value`: LoadBalancerInfoProperty.Builder.() -> Unit): Unit =
      loadBalancerInfo(LoadBalancerInfoProperty(`value`))

  public open fun onPremisesInstanceTagFilters(): Any? =
      unwrap(this).getOnPremisesInstanceTagFilters()

  public open fun onPremisesInstanceTagFilters(`value`: IResolvable) {
    unwrap(this).setOnPremisesInstanceTagFilters(`value`.let(IResolvable::unwrap))
  }

  public open fun onPremisesInstanceTagFilters(__idx_ac66f0: List<Any>) {
    unwrap(this).setOnPremisesInstanceTagFilters(__idx_ac66f0)
  }

  public open fun onPremisesTagSet(): Any? = unwrap(this).getOnPremisesTagSet()

  public open fun onPremisesTagSet(`value`: IResolvable) {
    unwrap(this).setOnPremisesTagSet(`value`.let(IResolvable::unwrap))
  }

  public open fun onPremisesTagSet(`value`: OnPremisesTagSetProperty) {
    unwrap(this).setOnPremisesTagSet(`value`.let(OnPremisesTagSetProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5741534ceb8bddd11848390317dcd3ea07c26a1c8d908b49f68d757c28f417cd")
  public open fun onPremisesTagSet(`value`: OnPremisesTagSetProperty.Builder.() -> Unit): Unit =
      onPremisesTagSet(OnPremisesTagSetProperty(`value`))

  public open fun outdatedInstancesStrategy(): String? = unwrap(this).getOutdatedInstancesStrategy()

  public open fun outdatedInstancesStrategy(`value`: String) {
    unwrap(this).setOutdatedInstancesStrategy(`value`)
  }

  public open fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun terminationHookEnabled(): Any? = unwrap(this).getTerminationHookEnabled()

  public open fun terminationHookEnabled(`value`: Boolean) {
    unwrap(this).setTerminationHookEnabled(`value`)
  }

  public open fun terminationHookEnabled(`value`: IResolvable) {
    unwrap(this).setTerminationHookEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun triggerConfigurations(): Any? = unwrap(this).getTriggerConfigurations()

  public open fun triggerConfigurations(`value`: IResolvable) {
    unwrap(this).setTriggerConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun triggerConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setTriggerConfigurations(__idx_ac66f0)
  }

  public interface Builder {
    public fun alarmConfiguration(alarmConfiguration: IResolvable) {
    }

    public fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaabeeab4581656bbebb3208c6cdea0aae45a6bf07c78a71fb729a258f91c91a")
    public
        fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty.Builder.() -> Unit) {
    }

    public fun applicationName(applicationName: String) {
    }

    public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
    }

    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ee94cf3cecb07799ec4e642605041d5dd6cb1590775b976fcad565e8926e7cf")
    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty.Builder.() -> Unit) {
    }

    public fun autoScalingGroups(autoScalingGroups: List<String>) {
    }

    public fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable) {
    }

    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1d137387c5573eb1a2270e14f836edf3840e9a2e2536a4ca881d1536cf4f6d")
    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit) {
    }

    public fun deployment(deployment: IResolvable) {
    }

    public fun deployment(deployment: DeploymentProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddc69a696c62199b4a8b77f2e5b7e40c6d9e85f2d1ad8574cbb5189ae0cd408d")
    public fun deployment(deployment: DeploymentProperty.Builder.() -> Unit) {
    }

    public fun deploymentConfigName(deploymentConfigName: String) {
    }

    public fun deploymentGroupName(deploymentGroupName: String) {
    }

    public fun deploymentStyle(deploymentStyle: IResolvable) {
    }

    public fun deploymentStyle(deploymentStyle: DeploymentStyleProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d29e4efa135c378ca780a21a52f1ba7ea5f1da54cdc238ff026427ece0c8c8")
    public fun deploymentStyle(deploymentStyle: DeploymentStyleProperty.Builder.() -> Unit) {
    }

    public fun ec2TagFilters(ec2TagFilters: IResolvable) {
    }

    public fun ec2TagFilters(ec2TagFilters: List<Any>) {
    }

    public fun ec2TagSet(ec2TagSet: IResolvable) {
    }

    public fun ec2TagSet(ec2TagSet: EC2TagSetProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c9cb0f0ac28a72197332b33fb3086c02ca7060e3054dd113da761ba1cc806cf")
    public fun ec2TagSet(ec2TagSet: EC2TagSetProperty.Builder.() -> Unit) {
    }

    public fun ecsServices(ecsServices: IResolvable) {
    }

    public fun ecsServices(ecsServices: List<Any>) {
    }

    public fun loadBalancerInfo(loadBalancerInfo: IResolvable) {
    }

    public fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea21af9e88672f0b3f438512b6a6822f34dcad7b1d768041196d4793cb77c2")
    public fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty.Builder.() -> Unit) {
    }

    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable) {
    }

    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>) {
    }

    public fun onPremisesTagSet(onPremisesTagSet: IResolvable) {
    }

    public fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ec1715e6a5b2ceb83f042d6b64ce3eaa0be7b5d73543e2c05f1e81bfc056b1")
    public fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty.Builder.() -> Unit) {
    }

    public fun outdatedInstancesStrategy(outdatedInstancesStrategy: String) {
    }

    public fun serviceRoleArn(serviceRoleArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun terminationHookEnabled(terminationHookEnabled: Boolean) {
    }

    public fun terminationHookEnabled(terminationHookEnabled: IResolvable) {
    }

    public fun triggerConfigurations(triggerConfigurations: IResolvable) {
    }

    public fun triggerConfigurations(triggerConfigurations: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.Builder.create(scope, id)

    public override fun alarmConfiguration(alarmConfiguration: IResolvable) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(IResolvable::unwrap))
    }

    public override fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(AlarmConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaabeeab4581656bbebb3208c6cdea0aae45a6bf07c78a71fb729a258f91c91a")
    public override
        fun alarmConfiguration(alarmConfiguration: AlarmConfigurationProperty.Builder.() -> Unit):
        Unit = alarmConfiguration(AlarmConfigurationProperty(alarmConfiguration))

    public override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public override fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(AutoRollbackConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ee94cf3cecb07799ec4e642605041d5dd6cb1590775b976fcad565e8926e7cf")
    public override
        fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoRollbackConfiguration(AutoRollbackConfigurationProperty(autoRollbackConfiguration))

    public override fun autoScalingGroups(autoScalingGroups: List<String>) {
      cdkBuilder.autoScalingGroups(autoScalingGroups)
    }

    public override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(BlueGreenDeploymentConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1d137387c5573eb1a2270e14f836edf3840e9a2e2536a4ca881d1536cf4f6d")
    public override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        blueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationProperty(blueGreenDeploymentConfiguration))

    public override fun deployment(deployment: IResolvable) {
      cdkBuilder.deployment(deployment.let(IResolvable::unwrap))
    }

    public override fun deployment(deployment: DeploymentProperty) {
      cdkBuilder.deployment(deployment.let(DeploymentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddc69a696c62199b4a8b77f2e5b7e40c6d9e85f2d1ad8574cbb5189ae0cd408d")
    public override fun deployment(deployment: DeploymentProperty.Builder.() -> Unit): Unit =
        deployment(DeploymentProperty(deployment))

    public override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public override fun deploymentStyle(deploymentStyle: IResolvable) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(IResolvable::unwrap))
    }

    public override fun deploymentStyle(deploymentStyle: DeploymentStyleProperty) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(DeploymentStyleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d29e4efa135c378ca780a21a52f1ba7ea5f1da54cdc238ff026427ece0c8c8")
    public override
        fun deploymentStyle(deploymentStyle: DeploymentStyleProperty.Builder.() -> Unit): Unit =
        deploymentStyle(DeploymentStyleProperty(deploymentStyle))

    public override fun ec2TagFilters(ec2TagFilters: IResolvable) {
      cdkBuilder.ec2TagFilters(ec2TagFilters.let(IResolvable::unwrap))
    }

    public override fun ec2TagFilters(ec2TagFilters: List<Any>) {
      cdkBuilder.ec2TagFilters(ec2TagFilters)
    }

    public override fun ec2TagSet(ec2TagSet: IResolvable) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(IResolvable::unwrap))
    }

    public override fun ec2TagSet(ec2TagSet: EC2TagSetProperty) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(EC2TagSetProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c9cb0f0ac28a72197332b33fb3086c02ca7060e3054dd113da761ba1cc806cf")
    public override fun ec2TagSet(ec2TagSet: EC2TagSetProperty.Builder.() -> Unit): Unit =
        ec2TagSet(EC2TagSetProperty(ec2TagSet))

    public override fun ecsServices(ecsServices: IResolvable) {
      cdkBuilder.ecsServices(ecsServices.let(IResolvable::unwrap))
    }

    public override fun ecsServices(ecsServices: List<Any>) {
      cdkBuilder.ecsServices(ecsServices)
    }

    public override fun loadBalancerInfo(loadBalancerInfo: IResolvable) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(IResolvable::unwrap))
    }

    public override fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(LoadBalancerInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea21af9e88672f0b3f438512b6a6822f34dcad7b1d768041196d4793cb77c2")
    public override
        fun loadBalancerInfo(loadBalancerInfo: LoadBalancerInfoProperty.Builder.() -> Unit): Unit =
        loadBalancerInfo(LoadBalancerInfoProperty(loadBalancerInfo))

    public override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.let(IResolvable::unwrap))
    }

    public override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters)
    }

    public override fun onPremisesTagSet(onPremisesTagSet: IResolvable) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(IResolvable::unwrap))
    }

    public override fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(OnPremisesTagSetProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ec1715e6a5b2ceb83f042d6b64ce3eaa0be7b5d73543e2c05f1e81bfc056b1")
    public override
        fun onPremisesTagSet(onPremisesTagSet: OnPremisesTagSetProperty.Builder.() -> Unit): Unit =
        onPremisesTagSet(OnPremisesTagSetProperty(onPremisesTagSet))

    public override fun outdatedInstancesStrategy(outdatedInstancesStrategy: String) {
      cdkBuilder.outdatedInstancesStrategy(outdatedInstancesStrategy)
    }

    public override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun terminationHookEnabled(terminationHookEnabled: Boolean) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled)
    }

    public override fun terminationHookEnabled(terminationHookEnabled: IResolvable) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled.let(IResolvable::unwrap))
    }

    public override fun triggerConfigurations(triggerConfigurations: IResolvable) {
      cdkBuilder.triggerConfigurations(triggerConfigurations.let(IResolvable::unwrap))
    }

    public override fun triggerConfigurations(triggerConfigurations: List<Any>) {
      cdkBuilder.triggerConfigurations(triggerConfigurations)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeploymentGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeploymentGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup):
        CfnDeploymentGroup = CfnDeploymentGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup = wrapped.cdkObject
  }

  public interface RevisionLocationProperty {
    public fun gitHubLocation(): Any? = unwrap(this).getGitHubLocation()

    public fun revisionType(): String? = unwrap(this).getRevisionType()

    public fun s3Location(): Any? = unwrap(this).getS3Location()

    public interface Builder {
      public fun gitHubLocation(gitHubLocation: IResolvable) {
      }

      public fun gitHubLocation(gitHubLocation: GitHubLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("295eb37669b09d2143e3b47e57f08cf96ceacbc38a9c4a6d7cd170c4e70caa75")
      public fun gitHubLocation(gitHubLocation: GitHubLocationProperty.Builder.() -> Unit) {
      }

      public fun revisionType(revisionType: String) {
      }

      public fun s3Location(s3Location: IResolvable) {
      }

      public fun s3Location(s3Location: S3LocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f52dea54f74f2c9aac70e89971d068f11ce7ec4828568e99b1bc940266412956")
      public fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty.builder()

      public override fun gitHubLocation(gitHubLocation: IResolvable) {
        cdkBuilder.gitHubLocation(gitHubLocation.let(IResolvable::unwrap))
      }

      public override fun gitHubLocation(gitHubLocation: GitHubLocationProperty) {
        cdkBuilder.gitHubLocation(gitHubLocation.let(GitHubLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("295eb37669b09d2143e3b47e57f08cf96ceacbc38a9c4a6d7cd170c4e70caa75")
      public override fun gitHubLocation(gitHubLocation: GitHubLocationProperty.Builder.() -> Unit):
          Unit = gitHubLocation(GitHubLocationProperty(gitHubLocation))

      public override fun revisionType(revisionType: String) {
        cdkBuilder.revisionType(revisionType)
      }

      public override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable::unwrap))
      }

      public override fun s3Location(s3Location: S3LocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f52dea54f74f2c9aac70e89971d068f11ce7ec4828568e99b1bc940266412956")
      public override fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3LocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty,
    ) : RevisionLocationProperty {
      public override fun gitHubLocation(): Any? = unwrap(this).getGitHubLocation()

      public override fun revisionType(): String? = unwrap(this).getRevisionType()

      public override fun s3Location(): Any? = unwrap(this).getS3Location()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RevisionLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty):
          RevisionLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RevisionLocationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoRollbackConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun events(events: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun events(events: List<String>) {
        cdkBuilder.events(events)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty,
    ) : AutoRollbackConfigurationProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun events(): List<String> = unwrap(this).getEvents() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutoRollbackConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty):
          AutoRollbackConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoRollbackConfigurationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentStyleProperty {
    public fun deploymentOption(): String? = unwrap(this).getDeploymentOption()

    public fun deploymentType(): String? = unwrap(this).getDeploymentType()

    public interface Builder {
      public fun deploymentOption(deploymentOption: String) {
      }

      public fun deploymentType(deploymentType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty.builder()

      public override fun deploymentOption(deploymentOption: String) {
        cdkBuilder.deploymentOption(deploymentOption)
      }

      public override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty,
    ) : DeploymentStyleProperty {
      public override fun deploymentOption(): String? = unwrap(this).getDeploymentOption()

      public override fun deploymentType(): String? = unwrap(this).getDeploymentType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty):
          DeploymentStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentStyleProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentStyleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoadBalancerInfoProperty {
    public fun elbInfoList(): Any? = unwrap(this).getElbInfoList()

    public fun targetGroupInfoList(): Any? = unwrap(this).getTargetGroupInfoList()

    public fun targetGroupPairInfoList(): Any? = unwrap(this).getTargetGroupPairInfoList()

    public interface Builder {
      public fun elbInfoList(elbInfoList: IResolvable) {
      }

      public fun elbInfoList(elbInfoList: List<Any>) {
      }

      public fun targetGroupInfoList(targetGroupInfoList: IResolvable) {
      }

      public fun targetGroupInfoList(targetGroupInfoList: List<Any>) {
      }

      public fun targetGroupPairInfoList(targetGroupPairInfoList: IResolvable) {
      }

      public fun targetGroupPairInfoList(targetGroupPairInfoList: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty.builder()

      public override fun elbInfoList(elbInfoList: IResolvable) {
        cdkBuilder.elbInfoList(elbInfoList.let(IResolvable::unwrap))
      }

      public override fun elbInfoList(elbInfoList: List<Any>) {
        cdkBuilder.elbInfoList(elbInfoList)
      }

      public override fun targetGroupInfoList(targetGroupInfoList: IResolvable) {
        cdkBuilder.targetGroupInfoList(targetGroupInfoList.let(IResolvable::unwrap))
      }

      public override fun targetGroupInfoList(targetGroupInfoList: List<Any>) {
        cdkBuilder.targetGroupInfoList(targetGroupInfoList)
      }

      public override fun targetGroupPairInfoList(targetGroupPairInfoList: IResolvable) {
        cdkBuilder.targetGroupPairInfoList(targetGroupPairInfoList.let(IResolvable::unwrap))
      }

      public override fun targetGroupPairInfoList(targetGroupPairInfoList: List<Any>) {
        cdkBuilder.targetGroupPairInfoList(targetGroupPairInfoList)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty,
    ) : LoadBalancerInfoProperty {
      public override fun elbInfoList(): Any? = unwrap(this).getElbInfoList()

      public override fun targetGroupInfoList(): Any? = unwrap(this).getTargetGroupInfoList()

      public override fun targetGroupPairInfoList(): Any? =
          unwrap(this).getTargetGroupPairInfoList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty):
          LoadBalancerInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.LoadBalancerInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun ignoreApplicationStopFailures(): Any? =
        unwrap(this).getIgnoreApplicationStopFailures()

    public fun revision(): Any

    public interface Builder {
      public fun description(description: String) {
      }

      public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: Boolean) {
      }

      public fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: IResolvable) {
      }

      public fun revision(revision: IResolvable) {
      }

      public fun revision(revision: RevisionLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42d0c4385c21c785d3bb3c83d15d69dd0221a2a61b2cbfbf3fe8ff4afe3c4eaa")
      public fun revision(revision: RevisionLocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: Boolean) {
        cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures)
      }

      public override
          fun ignoreApplicationStopFailures(ignoreApplicationStopFailures: IResolvable) {
        cdkBuilder.ignoreApplicationStopFailures(ignoreApplicationStopFailures.let(IResolvable::unwrap))
      }

      public override fun revision(revision: IResolvable) {
        cdkBuilder.revision(revision.let(IResolvable::unwrap))
      }

      public override fun revision(revision: RevisionLocationProperty) {
        cdkBuilder.revision(revision.let(RevisionLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42d0c4385c21c785d3bb3c83d15d69dd0221a2a61b2cbfbf3fe8ff4afe3c4eaa")
      public override fun revision(revision: RevisionLocationProperty.Builder.() -> Unit): Unit =
          revision(RevisionLocationProperty(revision))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty,
    ) : DeploymentProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun ignoreApplicationStopFailures(): Any? =
          unwrap(this).getIgnoreApplicationStopFailures()

      public override fun revision(): Any = unwrap(this).getRevision()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty):
          DeploymentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeploymentReadyOptionProperty {
    public fun actionOnTimeout(): String? = unwrap(this).getActionOnTimeout()

    public fun waitTimeInMinutes(): Number? = unwrap(this).getWaitTimeInMinutes()

    public interface Builder {
      public fun actionOnTimeout(actionOnTimeout: String) {
      }

      public fun waitTimeInMinutes(waitTimeInMinutes: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty.builder()

      public override fun actionOnTimeout(actionOnTimeout: String) {
        cdkBuilder.actionOnTimeout(actionOnTimeout)
      }

      public override fun waitTimeInMinutes(waitTimeInMinutes: Number) {
        cdkBuilder.waitTimeInMinutes(waitTimeInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty,
    ) : DeploymentReadyOptionProperty {
      public override fun actionOnTimeout(): String? = unwrap(this).getActionOnTimeout()

      public override fun waitTimeInMinutes(): Number? = unwrap(this).getWaitTimeInMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentReadyOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty):
          DeploymentReadyOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentReadyOptionProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentReadyOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BlueGreenDeploymentConfigurationProperty {
    public fun deploymentReadyOption(): Any? = unwrap(this).getDeploymentReadyOption()

    public fun greenFleetProvisioningOption(): Any? = unwrap(this).getGreenFleetProvisioningOption()

    public fun terminateBlueInstancesOnDeploymentSuccess(): Any? =
        unwrap(this).getTerminateBlueInstancesOnDeploymentSuccess()

    public interface Builder {
      public fun deploymentReadyOption(deploymentReadyOption: IResolvable) {
      }

      public fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94fd38533a579b18b2932fd6cd2473c7f0f5503d4af57771ec94b7e3eb523df9")
      public
          fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty.Builder.() -> Unit) {
      }

      public fun greenFleetProvisioningOption(greenFleetProvisioningOption: IResolvable) {
      }

      public
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa08960f311ab9873f554622000e02a9e86129169233ab7e11b3d1b3dd25f300")
      public
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty.Builder.() -> Unit) {
      }

      public
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: IResolvable) {
      }

      public
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d837d5a1865736ccd468047f8eae8902590024efc7b5ae8866c2d4a91ddae40a")
      public
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.builder()

      public override fun deploymentReadyOption(deploymentReadyOption: IResolvable) {
        cdkBuilder.deploymentReadyOption(deploymentReadyOption.let(IResolvable::unwrap))
      }

      public override
          fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty) {
        cdkBuilder.deploymentReadyOption(deploymentReadyOption.let(DeploymentReadyOptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94fd38533a579b18b2932fd6cd2473c7f0f5503d4af57771ec94b7e3eb523df9")
      public override
          fun deploymentReadyOption(deploymentReadyOption: DeploymentReadyOptionProperty.Builder.() -> Unit):
          Unit = deploymentReadyOption(DeploymentReadyOptionProperty(deploymentReadyOption))

      public override fun greenFleetProvisioningOption(greenFleetProvisioningOption: IResolvable) {
        cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption.let(IResolvable::unwrap))
      }

      public override
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty) {
        cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption.let(GreenFleetProvisioningOptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa08960f311ab9873f554622000e02a9e86129169233ab7e11b3d1b3dd25f300")
      public override
          fun greenFleetProvisioningOption(greenFleetProvisioningOption: GreenFleetProvisioningOptionProperty.Builder.() -> Unit):
          Unit =
          greenFleetProvisioningOption(GreenFleetProvisioningOptionProperty(greenFleetProvisioningOption))

      public override
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: IResolvable) {
        cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess.let(IResolvable::unwrap))
      }

      public override
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty) {
        cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess.let(BlueInstanceTerminationOptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d837d5a1865736ccd468047f8eae8902590024efc7b5ae8866c2d4a91ddae40a")
      public override
          fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOptionProperty.Builder.() -> Unit):
          Unit =
          terminateBlueInstancesOnDeploymentSuccess(BlueInstanceTerminationOptionProperty(terminateBlueInstancesOnDeploymentSuccess))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty,
    ) : BlueGreenDeploymentConfigurationProperty {
      public override fun deploymentReadyOption(): Any? = unwrap(this).getDeploymentReadyOption()

      public override fun greenFleetProvisioningOption(): Any? =
          unwrap(this).getGreenFleetProvisioningOption()

      public override fun terminateBlueInstancesOnDeploymentSuccess(): Any? =
          unwrap(this).getTerminateBlueInstancesOnDeploymentSuccess()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          BlueGreenDeploymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty):
          BlueGreenDeploymentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlueGreenDeploymentConfigurationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AlarmConfigurationProperty {
    public fun alarms(): Any? = unwrap(this).getAlarms()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun ignorePollAlarmFailure(): Any? = unwrap(this).getIgnorePollAlarmFailure()

    public interface Builder {
      public fun alarms(alarms: IResolvable) {
      }

      public fun alarms(alarms: List<Any>) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun ignorePollAlarmFailure(ignorePollAlarmFailure: Boolean) {
      }

      public fun ignorePollAlarmFailure(ignorePollAlarmFailure: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty.builder()

      public override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      public override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun ignorePollAlarmFailure(ignorePollAlarmFailure: Boolean) {
        cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure)
      }

      public override fun ignorePollAlarmFailure(ignorePollAlarmFailure: IResolvable) {
        cdkBuilder.ignorePollAlarmFailure(ignorePollAlarmFailure.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty,
    ) : AlarmConfigurationProperty {
      public override fun alarms(): Any? = unwrap(this).getAlarms()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun ignorePollAlarmFailure(): Any? = unwrap(this).getIgnorePollAlarmFailure()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty):
          AlarmConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmConfigurationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GreenFleetProvisioningOptionProperty {
    public fun action(): String? = unwrap(this).getAction()

    public interface Builder {
      public fun action(action: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.builder()

      public override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty,
    ) : GreenFleetProvisioningOptionProperty {
      public override fun action(): String? = unwrap(this).getAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          GreenFleetProvisioningOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty):
          GreenFleetProvisioningOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GreenFleetProvisioningOptionProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GreenFleetProvisioningOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetGroupInfoProperty {
    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty,
    ) : TargetGroupInfoProperty {
      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty):
          TargetGroupInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ECSServiceProperty {
    public fun clusterName(): String

    public fun serviceName(): String

    public interface Builder {
      public fun clusterName(clusterName: String) {
      }

      public fun serviceName(serviceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty.builder()

      public override fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty,
    ) : ECSServiceProperty {
      public override fun clusterName(): String = unwrap(this).getClusterName()

      public override fun serviceName(): String = unwrap(this).getServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ECSServiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty):
          ECSServiceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ECSServiceProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OnPremisesTagSetProperty {
    public fun onPremisesTagSetList(): Any? = unwrap(this).getOnPremisesTagSetList()

    public interface Builder {
      public fun onPremisesTagSetList(onPremisesTagSetList: IResolvable) {
      }

      public fun onPremisesTagSetList(onPremisesTagSetList: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty.builder()

      public override fun onPremisesTagSetList(onPremisesTagSetList: IResolvable) {
        cdkBuilder.onPremisesTagSetList(onPremisesTagSetList.let(IResolvable::unwrap))
      }

      public override fun onPremisesTagSetList(onPremisesTagSetList: List<Any>) {
        cdkBuilder.onPremisesTagSetList(onPremisesTagSetList)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty,
    ) : OnPremisesTagSetProperty {
      public override fun onPremisesTagSetList(): Any? = unwrap(this).getOnPremisesTagSetList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnPremisesTagSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty):
          OnPremisesTagSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnPremisesTagSetProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrafficRouteProperty {
    public fun listenerArns(): List<String> = unwrap(this).getListenerArns() ?: emptyList()

    public interface Builder {
      public fun listenerArns(listenerArns: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty.builder()

      public override fun listenerArns(listenerArns: List<String>) {
        cdkBuilder.listenerArns(listenerArns)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty,
    ) : TrafficRouteProperty {
      public override fun listenerArns(): List<String> = unwrap(this).getListenerArns() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty):
          TrafficRouteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficRouteProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TrafficRouteProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GitHubLocationProperty {
    public fun commitId(): String

    public fun repository(): String

    public interface Builder {
      public fun commitId(commitId: String) {
      }

      public fun repository(repository: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty.builder()

      public override fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
      }

      public override fun repository(repository: String) {
        cdkBuilder.repository(repository)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty,
    ) : GitHubLocationProperty {
      public override fun commitId(): String = unwrap(this).getCommitId()

      public override fun repository(): String = unwrap(this).getRepository()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GitHubLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty):
          GitHubLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitHubLocationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TriggerConfigProperty {
    public fun triggerEvents(): List<String> = unwrap(this).getTriggerEvents() ?: emptyList()

    public fun triggerName(): String? = unwrap(this).getTriggerName()

    public fun triggerTargetArn(): String? = unwrap(this).getTriggerTargetArn()

    public interface Builder {
      public fun triggerEvents(triggerEvents: List<String>) {
      }

      public fun triggerName(triggerName: String) {
      }

      public fun triggerTargetArn(triggerTargetArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty.builder()

      public override fun triggerEvents(triggerEvents: List<String>) {
        cdkBuilder.triggerEvents(triggerEvents)
      }

      public override fun triggerName(triggerName: String) {
        cdkBuilder.triggerName(triggerName)
      }

      public override fun triggerTargetArn(triggerTargetArn: String) {
        cdkBuilder.triggerTargetArn(triggerTargetArn)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty,
    ) : TriggerConfigProperty {
      public override fun triggerEvents(): List<String> = unwrap(this).getTriggerEvents() ?:
          emptyList()

      public override fun triggerName(): String? = unwrap(this).getTriggerName()

      public override fun triggerTargetArn(): String? = unwrap(this).getTriggerTargetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty):
          TriggerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TriggerConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetGroupPairInfoProperty {
    public fun prodTrafficRoute(): Any? = unwrap(this).getProdTrafficRoute()

    public fun targetGroups(): Any? = unwrap(this).getTargetGroups()

    public fun testTrafficRoute(): Any? = unwrap(this).getTestTrafficRoute()

    public interface Builder {
      public fun prodTrafficRoute(prodTrafficRoute: IResolvable) {
      }

      public fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d860ab0ec4001f9a04db6a01e0514e8d2ef1c4757237aa30465847c65eb9c71")
      public fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty.Builder.() -> Unit) {
      }

      public fun targetGroups(targetGroups: IResolvable) {
      }

      public fun targetGroups(targetGroups: List<Any>) {
      }

      public fun testTrafficRoute(testTrafficRoute: IResolvable) {
      }

      public fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60564982dd88f61bb8d6311e4be46b6ff8dae6389c71852a67066fa8840ed05")
      public fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty.builder()

      public override fun prodTrafficRoute(prodTrafficRoute: IResolvable) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute.let(IResolvable::unwrap))
      }

      public override fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute.let(TrafficRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d860ab0ec4001f9a04db6a01e0514e8d2ef1c4757237aa30465847c65eb9c71")
      public override
          fun prodTrafficRoute(prodTrafficRoute: TrafficRouteProperty.Builder.() -> Unit): Unit =
          prodTrafficRoute(TrafficRouteProperty(prodTrafficRoute))

      public override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      public override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      public override fun testTrafficRoute(testTrafficRoute: IResolvable) {
        cdkBuilder.testTrafficRoute(testTrafficRoute.let(IResolvable::unwrap))
      }

      public override fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty) {
        cdkBuilder.testTrafficRoute(testTrafficRoute.let(TrafficRouteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60564982dd88f61bb8d6311e4be46b6ff8dae6389c71852a67066fa8840ed05")
      public override
          fun testTrafficRoute(testTrafficRoute: TrafficRouteProperty.Builder.() -> Unit): Unit =
          testTrafficRoute(TrafficRouteProperty(testTrafficRoute))

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty,
    ) : TargetGroupPairInfoProperty {
      public override fun prodTrafficRoute(): Any? = unwrap(this).getProdTrafficRoute()

      public override fun targetGroups(): Any? = unwrap(this).getTargetGroups()

      public override fun testTrafficRoute(): Any? = unwrap(this).getTestTrafficRoute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupPairInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty):
          TargetGroupPairInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupPairInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupPairInfoProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BlueInstanceTerminationOptionProperty {
    public fun action(): String? = unwrap(this).getAction()

    public fun terminationWaitTimeInMinutes(): Number? =
        unwrap(this).getTerminationWaitTimeInMinutes()

    public interface Builder {
      public fun action(action: String) {
      }

      public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.builder()

      public override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public override fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
        cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty,
    ) : BlueInstanceTerminationOptionProperty {
      public override fun action(): String? = unwrap(this).getAction()

      public override fun terminationWaitTimeInMinutes(): Number? =
          unwrap(this).getTerminationWaitTimeInMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          BlueInstanceTerminationOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty):
          BlueInstanceTerminationOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlueInstanceTerminationOptionProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AlarmProperty {
    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty,
    ) : AlarmProperty {
      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty):
          AlarmProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun bundleType(): String? = unwrap(this).getBundleType()

    public fun eTag(): String? = unwrap(this).getETag()

    public fun key(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun bundleType(bundleType: String) {
      }

      public fun eTag(eTag: String) {
      }

      public fun key(key: String) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun bundleType(bundleType: String) {
        cdkBuilder.bundleType(bundleType)
      }

      public override fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty,
    ) : S3LocationProperty {
      public override fun bucket(): String = unwrap(this).getBucket()

      public override fun bundleType(): String? = unwrap(this).getBundleType()

      public override fun eTag(): String? = unwrap(this).getETag()

      public override fun key(): String = unwrap(this).getKey()

      public override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EC2TagSetProperty {
    public fun ec2TagSetList(): Any? = unwrap(this).getEc2TagSetList()

    public interface Builder {
      public fun ec2TagSetList(ec2TagSetList: IResolvable) {
      }

      public fun ec2TagSetList(ec2TagSetList: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty.builder()

      public override fun ec2TagSetList(ec2TagSetList: IResolvable) {
        cdkBuilder.ec2TagSetList(ec2TagSetList.let(IResolvable::unwrap))
      }

      public override fun ec2TagSetList(ec2TagSetList: List<Any>) {
        cdkBuilder.ec2TagSetList(ec2TagSetList)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty,
    ) : EC2TagSetProperty {
      public override fun ec2TagSetList(): Any? = unwrap(this).getEc2TagSetList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EC2TagSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty):
          EC2TagSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EC2TagSetProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EC2TagFilterProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String) {
      }

      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty,
    ) : EC2TagFilterProperty {
      public override fun key(): String? = unwrap(this).getKey()

      public override fun type(): String? = unwrap(this).getType()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EC2TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty):
          EC2TagFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EC2TagFilterProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TagFilterProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String) {
      }

      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty,
    ) : TagFilterProperty {
      public override fun key(): String? = unwrap(this).getKey()

      public override fun type(): String? = unwrap(this).getType()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty):
          TagFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFilterProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ELBInfoProperty {
    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty.Builder =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty,
    ) : ELBInfoProperty {
      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ELBInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty):
          ELBInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ELBInfoProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OnPremisesTagSetListObjectProperty {
    public fun onPremisesTagGroup(): Any? = unwrap(this).getOnPremisesTagGroup()

    public interface Builder {
      public fun onPremisesTagGroup(onPremisesTagGroup: IResolvable) {
      }

      public fun onPremisesTagGroup(onPremisesTagGroup: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.builder()

      public override fun onPremisesTagGroup(onPremisesTagGroup: IResolvable) {
        cdkBuilder.onPremisesTagGroup(onPremisesTagGroup.let(IResolvable::unwrap))
      }

      public override fun onPremisesTagGroup(onPremisesTagGroup: List<Any>) {
        cdkBuilder.onPremisesTagGroup(onPremisesTagGroup)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty,
    ) : OnPremisesTagSetListObjectProperty {
      public override fun onPremisesTagGroup(): Any? = unwrap(this).getOnPremisesTagGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnPremisesTagSetListObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty):
          OnPremisesTagSetListObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnPremisesTagSetListObjectProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.OnPremisesTagSetListObjectProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EC2TagSetListObjectProperty {
    public fun ec2TagGroup(): Any? = unwrap(this).getEc2TagGroup()

    public interface Builder {
      public fun ec2TagGroup(ec2TagGroup: IResolvable) {
      }

      public fun ec2TagGroup(ec2TagGroup: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty.builder()

      public override fun ec2TagGroup(ec2TagGroup: IResolvable) {
        cdkBuilder.ec2TagGroup(ec2TagGroup.let(IResolvable::unwrap))
      }

      public override fun ec2TagGroup(ec2TagGroup: List<Any>) {
        cdkBuilder.ec2TagGroup(ec2TagGroup)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty,
    ) : EC2TagSetListObjectProperty {
      public override fun ec2TagGroup(): Any? = unwrap(this).getEc2TagGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EC2TagSetListObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty):
          EC2TagSetListObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EC2TagSetListObjectProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagSetListObjectProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
