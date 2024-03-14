package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGameServerGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAutoScalingGroupArn(): String = unwrap(this).getAttrAutoScalingGroupArn()

  public open fun attrGameServerGroupArn(): String = unwrap(this).getAttrGameServerGroupArn()

  public open fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  public open fun autoScalingPolicy(`value`: IResolvable) {
    unwrap(this).setAutoScalingPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty) {
    unwrap(this).setAutoScalingPolicy(`value`.let(AutoScalingPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51d7dbb45cbb27245de2f8aaa06ea366f3d60ba0fe38b9d6b4578f0b17d18cd4")
  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty.Builder.() -> Unit): Unit =
      autoScalingPolicy(AutoScalingPolicyProperty(`value`))

  public open fun balancingStrategy(): String? = unwrap(this).getBalancingStrategy()

  public open fun balancingStrategy(`value`: String) {
    unwrap(this).setBalancingStrategy(`value`)
  }

  public open fun deleteOption(): String? = unwrap(this).getDeleteOption()

  public open fun deleteOption(`value`: String) {
    unwrap(this).setDeleteOption(`value`)
  }

  public open fun gameServerGroupName(): String = unwrap(this).getGameServerGroupName()

  public open fun gameServerGroupName(`value`: String) {
    unwrap(this).setGameServerGroupName(`value`)
  }

  public open fun gameServerProtectionPolicy(): String? =
      unwrap(this).getGameServerProtectionPolicy()

  public open fun gameServerProtectionPolicy(`value`: String) {
    unwrap(this).setGameServerProtectionPolicy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceDefinitions(): Any = unwrap(this).getInstanceDefinitions()

  public open fun instanceDefinitions(`value`: IResolvable) {
    unwrap(this).setInstanceDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setInstanceDefinitions(__idx_ac66f0)
  }

  public open fun instanceDefinitions(vararg __idx_ac66f0: Any): Unit =
      instanceDefinitions(__idx_ac66f0.toList())

  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun launchTemplate(`value`: LaunchTemplateProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7ba1a3f567b211d341d6037dd420a6e93ffb5f377633b4a65c3daede1f9525b")
  public open fun launchTemplate(`value`: LaunchTemplateProperty.Builder.() -> Unit): Unit =
      launchTemplate(LaunchTemplateProperty(`value`))

  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

  public open fun minSize(): Number? = unwrap(this).getMinSize()

  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcSubnets(): List<String> = unwrap(this).getVpcSubnets() ?: emptyList()

  public open fun vpcSubnets(`value`: List<String>) {
    unwrap(this).setVpcSubnets(`value`)
  }

  public open fun vpcSubnets(vararg `value`: String): Unit = vpcSubnets(`value`.toList())

  public interface Builder {
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("260b1af760b6009f2926f0ab103dda31affdd9a53f535ca8a3e9e09e0d373604")
    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

    public fun balancingStrategy(balancingStrategy: String)

    public fun deleteOption(deleteOption: String)

    public fun gameServerGroupName(gameServerGroupName: String)

    public fun gameServerProtectionPolicy(gameServerProtectionPolicy: String)

    public fun instanceDefinitions(instanceDefinitions: IResolvable)

    public fun instanceDefinitions(instanceDefinitions: List<Any>)

    public fun instanceDefinitions(vararg instanceDefinitions: Any)

    public fun launchTemplate(launchTemplate: IResolvable)

    public fun launchTemplate(launchTemplate: LaunchTemplateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0c6f4186d7a0bb0682a46568f56d9ab96c36e270752b16591b78b3cbf5f45ad")
    public fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit)

    public fun maxSize(maxSize: Number)

    public fun minSize(minSize: Number)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcSubnets(vpcSubnets: List<String>)

    public fun vpcSubnets(vararg vpcSubnets: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.Builder =
        software.amazon.awscdk.services.gamelift.CfnGameServerGroup.Builder.create(scope, id)

    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("260b1af760b6009f2926f0ab103dda31affdd9a53f535ca8a3e9e09e0d373604")
    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

    override fun balancingStrategy(balancingStrategy: String) {
      cdkBuilder.balancingStrategy(balancingStrategy)
    }

    override fun deleteOption(deleteOption: String) {
      cdkBuilder.deleteOption(deleteOption)
    }

    override fun gameServerGroupName(gameServerGroupName: String) {
      cdkBuilder.gameServerGroupName(gameServerGroupName)
    }

    override fun gameServerProtectionPolicy(gameServerProtectionPolicy: String) {
      cdkBuilder.gameServerProtectionPolicy(gameServerProtectionPolicy)
    }

    override fun instanceDefinitions(instanceDefinitions: IResolvable) {
      cdkBuilder.instanceDefinitions(instanceDefinitions.let(IResolvable::unwrap))
    }

    override fun instanceDefinitions(instanceDefinitions: List<Any>) {
      cdkBuilder.instanceDefinitions(instanceDefinitions)
    }

    override fun instanceDefinitions(vararg instanceDefinitions: Any): Unit =
        instanceDefinitions(instanceDefinitions.toList())

    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    override fun launchTemplate(launchTemplate: LaunchTemplateProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0c6f4186d7a0bb0682a46568f56d9ab96c36e270752b16591b78b3cbf5f45ad")
    override fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit): Unit =
        launchTemplate(LaunchTemplateProperty(launchTemplate))

    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcSubnets(vpcSubnets: List<String>) {
      cdkBuilder.vpcSubnets(vpcSubnets)
    }

    override fun vpcSubnets(vararg vpcSubnets: String): Unit = vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameServerGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGameServerGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGameServerGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup):
        CfnGameServerGroup = CfnGameServerGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGameServerGroup):
        software.amazon.awscdk.services.gamelift.CfnGameServerGroup = wrapped.cdkObject
  }

  public interface LaunchTemplateProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String)

      public fun launchTemplateName(launchTemplateName: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty.builder()

      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty,
    ) : LaunchTemplateProperty {
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty):
          LaunchTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetTrackingConfigurationProperty {
    public fun targetValue(): Number

    public interface Builder {
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty.builder()

      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty,
    ) : TargetTrackingConfigurationProperty {
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty):
          TargetTrackingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoScalingPolicyProperty {
    public fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

    public fun targetTrackingConfiguration(): Any

    public interface Builder {
      public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number)

      public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable)

      public
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea4e8fc6fbae60f62cc711e3cf2d8fd6d3e515c00aeeb96e8d56967a991c260")
      public
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty.builder()

      override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
      }

      override fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(TargetTrackingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea4e8fc6fbae60f62cc711e3cf2d8fd6d3e515c00aeeb96e8d56967a991c260")
      override
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit):
          Unit =
          targetTrackingConfiguration(TargetTrackingConfigurationProperty(targetTrackingConfiguration))

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty,
    ) : AutoScalingPolicyProperty {
      override fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

      override fun targetTrackingConfiguration(): Any =
          unwrap(this).getTargetTrackingConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceDefinitionProperty {
    public fun instanceType(): String

    public fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()

    public interface Builder {
      public fun instanceType(instanceType: String)

      public fun weightedCapacity(weightedCapacity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty.builder()

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun weightedCapacity(weightedCapacity: String) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty,
    ) : InstanceDefinitionProperty {
      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty):
          InstanceDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceDefinitionProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
