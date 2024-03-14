package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNodegroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun amiType(): String? = unwrap(this).getAmiType()

  public open fun amiType(`value`: String) {
    unwrap(this).setAmiType(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrClusterName(): String = unwrap(this).getAttrClusterName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrNodegroupName(): String = unwrap(this).getAttrNodegroupName()

  public open fun capacityType(): String? = unwrap(this).getCapacityType()

  public open fun capacityType(`value`: String) {
    unwrap(this).setCapacityType(`value`)
  }

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun diskSize(): Number? = unwrap(this).getDiskSize()

  public open fun diskSize(`value`: Number) {
    unwrap(this).setDiskSize(`value`)
  }

  public open fun forceUpdateEnabled(): Any? = unwrap(this).getForceUpdateEnabled()

  public open fun forceUpdateEnabled(`value`: Boolean) {
    unwrap(this).setForceUpdateEnabled(`value`)
  }

  public open fun forceUpdateEnabled(`value`: IResolvable) {
    unwrap(this).setForceUpdateEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  public open fun instanceTypes(`value`: List<String>) {
    unwrap(this).setInstanceTypes(`value`)
  }

  public open fun instanceTypes(vararg `value`: String): Unit = instanceTypes(`value`.toList())

  public open fun labels(): Any? = unwrap(this).getLabels()

  public open fun labels(`value`: IResolvable) {
    unwrap(this).setLabels(`value`.let(IResolvable::unwrap))
  }

  public open fun labels(`value`: Map<String, String>) {
    unwrap(this).setLabels(`value`)
  }

  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a5f66481a02aaf3745dcc97639fe91048324fa5a66dbd712c77907fb65a95a4")
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
      Unit = launchTemplate(LaunchTemplateSpecificationProperty(`value`))

  public open fun nodeRole(): String = unwrap(this).getNodeRole()

  public open fun nodeRole(`value`: String) {
    unwrap(this).setNodeRole(`value`)
  }

  public open fun nodegroupName(): String? = unwrap(this).getNodegroupName()

  public open fun nodegroupName(`value`: String) {
    unwrap(this).setNodegroupName(`value`)
  }

  public open fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

  public open fun releaseVersion(`value`: String) {
    unwrap(this).setReleaseVersion(`value`)
  }

  public open fun remoteAccess(): Any? = unwrap(this).getRemoteAccess()

  public open fun remoteAccess(`value`: IResolvable) {
    unwrap(this).setRemoteAccess(`value`.let(IResolvable::unwrap))
  }

  public open fun remoteAccess(`value`: RemoteAccessProperty) {
    unwrap(this).setRemoteAccess(`value`.let(RemoteAccessProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0a13b210227591ba798c1f3cc9326757e84e45bb46380b951fa2e82121e78f5")
  public open fun remoteAccess(`value`: RemoteAccessProperty.Builder.() -> Unit): Unit =
      remoteAccess(RemoteAccessProperty(`value`))

  public open fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  public open fun scalingConfig(`value`: IResolvable) {
    unwrap(this).setScalingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun scalingConfig(`value`: ScalingConfigProperty) {
    unwrap(this).setScalingConfig(`value`.let(ScalingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01eaf0ee320f0401dfa3956db7b14aefb52fff51ca80253b1ed3d533a61b70db")
  public open fun scalingConfig(`value`: ScalingConfigProperty.Builder.() -> Unit): Unit =
      scalingConfig(ScalingConfigProperty(`value`))

  public open fun subnets(): List<String> = unwrap(this).getSubnets()

  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun taints(): Any? = unwrap(this).getTaints()

  public open fun taints(`value`: IResolvable) {
    unwrap(this).setTaints(`value`.let(IResolvable::unwrap))
  }

  public open fun taints(__idx_ac66f0: List<Any>) {
    unwrap(this).setTaints(__idx_ac66f0)
  }

  public open fun taints(vararg __idx_ac66f0: Any): Unit = taints(__idx_ac66f0.toList())

  public open fun updateConfig(): Any? = unwrap(this).getUpdateConfig()

  public open fun updateConfig(`value`: IResolvable) {
    unwrap(this).setUpdateConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun updateConfig(`value`: UpdateConfigProperty) {
    unwrap(this).setUpdateConfig(`value`.let(UpdateConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fb53899535eaab6a1c796449b23e0b1f9e8e4468252c065115715c2f546fa751")
  public open fun updateConfig(`value`: UpdateConfigProperty.Builder.() -> Unit): Unit =
      updateConfig(UpdateConfigProperty(`value`))

  public open fun version(): String? = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public interface Builder {
    public fun amiType(amiType: String)

    public fun capacityType(capacityType: String)

    public fun clusterName(clusterName: String)

    public fun diskSize(diskSize: Number)

    public fun forceUpdateEnabled(forceUpdateEnabled: Boolean)

    public fun forceUpdateEnabled(forceUpdateEnabled: IResolvable)

    public fun instanceTypes(instanceTypes: List<String>)

    public fun instanceTypes(vararg instanceTypes: String)

    public fun labels(labels: IResolvable)

    public fun labels(labels: Map<String, String>)

    public fun launchTemplate(launchTemplate: IResolvable)

    public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5068e50e47e72b3ca242878b66224aab505a0ee1fd81a4c5f18f7fa09be6ffbb")
    public
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    public fun nodeRole(nodeRole: String)

    public fun nodegroupName(nodegroupName: String)

    public fun releaseVersion(releaseVersion: String)

    public fun remoteAccess(remoteAccess: IResolvable)

    public fun remoteAccess(remoteAccess: RemoteAccessProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82542f9443ef3a2998f13604cf218be5d421703ca8bd76e7665b75614c9a70bb")
    public fun remoteAccess(remoteAccess: RemoteAccessProperty.Builder.() -> Unit)

    public fun scalingConfig(scalingConfig: IResolvable)

    public fun scalingConfig(scalingConfig: ScalingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d474cf15f29677c1e2f73f1335826830b07542e05be7dce571165d79bfd1c7b")
    public fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit)

    public fun subnets(subnets: List<String>)

    public fun subnets(vararg subnets: String)

    public fun tags(tags: Map<String, String>)

    public fun taints(taints: IResolvable)

    public fun taints(taints: List<Any>)

    public fun taints(vararg taints: Any)

    public fun updateConfig(updateConfig: IResolvable)

    public fun updateConfig(updateConfig: UpdateConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10744ef3f8e694462160026bb5d9bfd15ba5bf27ea2f4c0c27caa1bb5194d743")
    public fun updateConfig(updateConfig: UpdateConfigProperty.Builder.() -> Unit)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnNodegroup.Builder =
        software.amazon.awscdk.services.eks.CfnNodegroup.Builder.create(scope, id)

    override fun amiType(amiType: String) {
      cdkBuilder.amiType(amiType)
    }

    override fun capacityType(capacityType: String) {
      cdkBuilder.capacityType(capacityType)
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

    override fun forceUpdateEnabled(forceUpdateEnabled: Boolean) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled)
    }

    override fun forceUpdateEnabled(forceUpdateEnabled: IResolvable) {
      cdkBuilder.forceUpdateEnabled(forceUpdateEnabled.let(IResolvable::unwrap))
    }

    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5068e50e47e72b3ca242878b66224aab505a0ee1fd81a4c5f18f7fa09be6ffbb")
    override
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

    override fun nodeRole(nodeRole: String) {
      cdkBuilder.nodeRole(nodeRole)
    }

    override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

    override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

    override fun remoteAccess(remoteAccess: IResolvable) {
      cdkBuilder.remoteAccess(remoteAccess.let(IResolvable::unwrap))
    }

    override fun remoteAccess(remoteAccess: RemoteAccessProperty) {
      cdkBuilder.remoteAccess(remoteAccess.let(RemoteAccessProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82542f9443ef3a2998f13604cf218be5d421703ca8bd76e7665b75614c9a70bb")
    override fun remoteAccess(remoteAccess: RemoteAccessProperty.Builder.() -> Unit): Unit =
        remoteAccess(RemoteAccessProperty(remoteAccess))

    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    override fun scalingConfig(scalingConfig: ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(ScalingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d474cf15f29677c1e2f73f1335826830b07542e05be7dce571165d79bfd1c7b")
    override fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit): Unit =
        scalingConfig(ScalingConfigProperty(scalingConfig))

    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taints(taints: IResolvable) {
      cdkBuilder.taints(taints.let(IResolvable::unwrap))
    }

    override fun taints(taints: List<Any>) {
      cdkBuilder.taints(taints)
    }

    override fun taints(vararg taints: Any): Unit = taints(taints.toList())

    override fun updateConfig(updateConfig: IResolvable) {
      cdkBuilder.updateConfig(updateConfig.let(IResolvable::unwrap))
    }

    override fun updateConfig(updateConfig: UpdateConfigProperty) {
      cdkBuilder.updateConfig(updateConfig.let(UpdateConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10744ef3f8e694462160026bb5d9bfd15ba5bf27ea2f4c0c27caa1bb5194d743")
    override fun updateConfig(updateConfig: UpdateConfigProperty.Builder.() -> Unit): Unit =
        updateConfig(UpdateConfigProperty(updateConfig))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNodegroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNodegroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup): CfnNodegroup =
        CfnNodegroup(cdkObject)

    internal fun unwrap(wrapped: CfnNodegroup): software.amazon.awscdk.services.eks.CfnNodegroup =
        wrapped.cdkObject
  }

  public interface TaintProperty {
    public fun effect(): String? = unwrap(this).getEffect()

    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun effect(effect: String)

      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty.Builder
          = software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty.builder()

      override fun effect(effect: String) {
        cdkBuilder.effect(effect)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty,
    ) : TaintProperty {
      override fun effect(): String? = unwrap(this).getEffect()

      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty):
          TaintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaintProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.TaintProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateSpecificationProperty {
    public fun id(): String? = unwrap(this).getId()

    public fun name(): String? = unwrap(this).getName()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun id(id: String)

      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty,
    ) : LaunchTemplateSpecificationProperty {
      override fun id(): String? = unwrap(this).getId()

      override fun name(): String? = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty):
          LaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.LaunchTemplateSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RemoteAccessProperty {
    public fun ec2SshKey(): String

    public fun sourceSecurityGroups(): List<String> = unwrap(this).getSourceSecurityGroups() ?:
        emptyList()

    public interface Builder {
      public fun ec2SshKey(ec2SshKey: String)

      public fun sourceSecurityGroups(sourceSecurityGroups: List<String>)

      public fun sourceSecurityGroups(vararg sourceSecurityGroups: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty.Builder =
          software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty.builder()

      override fun ec2SshKey(ec2SshKey: String) {
        cdkBuilder.ec2SshKey(ec2SshKey)
      }

      override fun sourceSecurityGroups(sourceSecurityGroups: List<String>) {
        cdkBuilder.sourceSecurityGroups(sourceSecurityGroups)
      }

      override fun sourceSecurityGroups(vararg sourceSecurityGroups: String): Unit =
          sourceSecurityGroups(sourceSecurityGroups.toList())

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty,
    ) : RemoteAccessProperty {
      override fun ec2SshKey(): String = unwrap(this).getEc2SshKey()

      override fun sourceSecurityGroups(): List<String> = unwrap(this).getSourceSecurityGroups() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RemoteAccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty):
          RemoteAccessProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoteAccessProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.RemoteAccessProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UpdateConfigProperty {
    public fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

    public fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()

    public interface Builder {
      public fun maxUnavailable(maxUnavailable: Number)

      public fun maxUnavailablePercentage(maxUnavailablePercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty.builder()

      override fun maxUnavailable(maxUnavailable: Number) {
        cdkBuilder.maxUnavailable(maxUnavailable)
      }

      override fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
        cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty,
    ) : UpdateConfigProperty {
      override fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

      override fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UpdateConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty):
          UpdateConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateConfigProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScalingConfigProperty {
    public fun desiredSize(): Number? = unwrap(this).getDesiredSize()

    public fun maxSize(): Number? = unwrap(this).getMaxSize()

    public fun minSize(): Number? = unwrap(this).getMinSize()

    public interface Builder {
      public fun desiredSize(desiredSize: Number)

      public fun maxSize(maxSize: Number)

      public fun minSize(minSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty.Builder =
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty.builder()

      override fun desiredSize(desiredSize: Number) {
        cdkBuilder.desiredSize(desiredSize)
      }

      override fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
      }

      override fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty,
    ) : ScalingConfigProperty {
      override fun desiredSize(): Number? = unwrap(this).getDesiredSize()

      override fun maxSize(): Number? = unwrap(this).getMaxSize()

      override fun minSize(): Number? = unwrap(this).getMinSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty):
          ScalingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigProperty):
          software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
