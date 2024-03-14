package io.cloudshiftdev.awscdk.services.imagebuilder

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

public open class CfnImageRecipe internal constructor(
  private val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalInstanceConfiguration(): Any? =
      unwrap(this).getAdditionalInstanceConfiguration()

  public open fun additionalInstanceConfiguration(`value`: IResolvable) {
    unwrap(this).setAdditionalInstanceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun additionalInstanceConfiguration(`value`: AdditionalInstanceConfigurationProperty) {
    unwrap(this).setAdditionalInstanceConfiguration(`value`.let(AdditionalInstanceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("87e1addaa4dd7de53714f1ca031ddec8f55e45491d7d3b3a927f67498a81b892")
  public open
      fun additionalInstanceConfiguration(`value`: AdditionalInstanceConfigurationProperty.Builder.() -> Unit):
      Unit = additionalInstanceConfiguration(AdditionalInstanceConfigurationProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public open fun blockDeviceMappings(`value`: IResolvable) {
    unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun blockDeviceMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setBlockDeviceMappings(__idx_ac66f0)
  }

  public open fun components(): Any = unwrap(this).getComponents()

  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable::unwrap))
  }

  public open fun components(__idx_ac66f0: List<Any>) {
    unwrap(this).setComponents(__idx_ac66f0)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parentImage(): String = unwrap(this).getParentImage()

  public open fun parentImage(`value`: String) {
    unwrap(this).setParentImage(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun version(): String = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public open fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  public open fun workingDirectory(`value`: String) {
    unwrap(this).setWorkingDirectory(`value`)
  }

  public interface Builder {
    public fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable) {
    }

    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c792503db491a17e5a33ca7eff774f01e9559bcbfb437dc2ca9d82c53b23915e")
    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
    }

    public fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
    }

    public fun components(components: IResolvable) {
    }

    public fun components(components: List<Any>) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun parentImage(parentImage: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun version(version: String) {
    }

    public fun workingDirectory(workingDirectory: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.Builder.create(scope, id)

    public override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(AdditionalInstanceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c792503db491a17e5a33ca7eff774f01e9559bcbfb437dc2ca9d82c53b23915e")
    public override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: AdditionalInstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        additionalInstanceConfiguration(AdditionalInstanceConfigurationProperty(additionalInstanceConfiguration))

    public override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    public override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    public override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    public override fun components(components: List<Any>) {
      cdkBuilder.components(components)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImageRecipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImageRecipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe):
        CfnImageRecipe = CfnImageRecipe(cdkObject)

    internal fun unwrap(wrapped: CfnImageRecipe):
        software.amazon.awscdk.services.imagebuilder.CfnImageRecipe = wrapped.cdkObject
  }

  public interface ComponentParameterProperty {
    public fun name(): String

    public fun `value`(): List<String>

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty,
    ) : ComponentParameterProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty):
          ComponentParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AdditionalInstanceConfigurationProperty {
    public fun systemsManagerAgent(): Any? = unwrap(this).getSystemsManagerAgent()

    public fun userDataOverride(): String? = unwrap(this).getUserDataOverride()

    public interface Builder {
      public fun systemsManagerAgent(systemsManagerAgent: IResolvable) {
      }

      public fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9103d23f896be0e9de53c701e87aafb2c948661dcff257c9a29cb652d6cb1329")
      public
          fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty.Builder.() -> Unit) {
      }

      public fun userDataOverride(userDataOverride: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty.builder()

      public override fun systemsManagerAgent(systemsManagerAgent: IResolvable) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent.let(IResolvable::unwrap))
      }

      public override fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty) {
        cdkBuilder.systemsManagerAgent(systemsManagerAgent.let(SystemsManagerAgentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9103d23f896be0e9de53c701e87aafb2c948661dcff257c9a29cb652d6cb1329")
      public override
          fun systemsManagerAgent(systemsManagerAgent: SystemsManagerAgentProperty.Builder.() -> Unit):
          Unit = systemsManagerAgent(SystemsManagerAgentProperty(systemsManagerAgent))

      public override fun userDataOverride(userDataOverride: String) {
        cdkBuilder.userDataOverride(userDataOverride)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty,
    ) : AdditionalInstanceConfigurationProperty {
      public override fun systemsManagerAgent(): Any? = unwrap(this).getSystemsManagerAgent()

      public override fun userDataOverride(): String? = unwrap(this).getUserDataOverride()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdditionalInstanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty):
          AdditionalInstanceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalInstanceConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.AdditionalInstanceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentConfigurationProperty {
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun componentArn(componentArn: String) {
      }

      public fun parameters(parameters: IResolvable) {
      }

      public fun parameters(parameters: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty.builder()

      public override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      public override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      public override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty,
    ) : ComponentConfigurationProperty {
      public override fun componentArn(): String? = unwrap(this).getComponentArn()

      public override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty):
          ComponentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.ComponentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SystemsManagerAgentProperty {
    public fun uninstallAfterBuild(): Any? = unwrap(this).getUninstallAfterBuild()

    public interface Builder {
      public fun uninstallAfterBuild(uninstallAfterBuild: Boolean) {
      }

      public fun uninstallAfterBuild(uninstallAfterBuild: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty.builder()

      public override fun uninstallAfterBuild(uninstallAfterBuild: Boolean) {
        cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
      }

      public override fun uninstallAfterBuild(uninstallAfterBuild: IResolvable) {
        cdkBuilder.uninstallAfterBuild(uninstallAfterBuild.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty,
    ) : SystemsManagerAgentProperty {
      public override fun uninstallAfterBuild(): Any? = unwrap(this).getUninstallAfterBuild()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SystemsManagerAgentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty):
          SystemsManagerAgentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemsManagerAgentProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceBlockDeviceMappingProperty {
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    public fun ebs(): Any? = unwrap(this).getEbs()

    public fun noDevice(): String? = unwrap(this).getNoDevice()

    public fun virtualName(): String? = unwrap(this).getVirtualName()

    public interface Builder {
      public fun deviceName(deviceName: String) {
      }

      public fun ebs(ebs: IResolvable) {
      }

      public fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81df05fefd03046b380ec12ea800dec283d0ed7acb50b2a7b9ce3905e31e3b5e")
      public fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit) {
      }

      public fun noDevice(noDevice: String) {
      }

      public fun virtualName(virtualName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty.builder()

      public override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      public override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      public override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty) {
        cdkBuilder.ebs(ebs.let(EbsInstanceBlockDeviceSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81df05fefd03046b380ec12ea800dec283d0ed7acb50b2a7b9ce3905e31e3b5e")
      public override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit):
          Unit = ebs(EbsInstanceBlockDeviceSpecificationProperty(ebs))

      public override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      public override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty,
    ) : InstanceBlockDeviceMappingProperty {
      public override fun deviceName(): String? = unwrap(this).getDeviceName()

      public override fun ebs(): Any? = unwrap(this).getEbs()

      public override fun noDevice(): String? = unwrap(this).getNoDevice()

      public override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceBlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty):
          InstanceBlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceBlockDeviceMappingProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.InstanceBlockDeviceMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbsInstanceBlockDeviceSpecificationProperty {
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    public interface Builder {
      public fun deleteOnTermination(deleteOnTermination: Boolean) {
      }

      public fun deleteOnTermination(deleteOnTermination: IResolvable) {
      }

      public fun encrypted(encrypted: Boolean) {
      }

      public fun encrypted(encrypted: IResolvable) {
      }

      public fun iops(iops: Number) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun snapshotId(snapshotId: String) {
      }

      public fun throughput(throughput: Number) {
      }

      public fun volumeSize(volumeSize: Number) {
      }

      public fun volumeType(volumeType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.builder()

      public override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      public override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      public override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      public override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      public override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      public override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      public override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty,
    ) : EbsInstanceBlockDeviceSpecificationProperty {
      public override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      public override fun encrypted(): Any? = unwrap(this).getEncrypted()

      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      public override fun throughput(): Number? = unwrap(this).getThroughput()

      public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      public override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EbsInstanceBlockDeviceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty):
          EbsInstanceBlockDeviceSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsInstanceBlockDeviceSpecificationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
