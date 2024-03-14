package io.cloudshiftdev.awscdk.services.iotwireless

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

public open class CfnTaskDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun autoCreateTasks(): Any = unwrap(this).getAutoCreateTasks()

  public open fun autoCreateTasks(`value`: Boolean) {
    unwrap(this).setAutoCreateTasks(`value`)
  }

  public open fun autoCreateTasks(`value`: IResolvable) {
    unwrap(this).setAutoCreateTasks(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loRaWanUpdateGatewayTaskEntry(): Any? =
      unwrap(this).getLoRaWanUpdateGatewayTaskEntry()

  public open fun loRaWanUpdateGatewayTaskEntry(`value`: IResolvable) {
    unwrap(this).setLoRaWanUpdateGatewayTaskEntry(`value`.let(IResolvable::unwrap))
  }

  public open fun loRaWanUpdateGatewayTaskEntry(`value`: LoRaWANUpdateGatewayTaskEntryProperty) {
    unwrap(this).setLoRaWanUpdateGatewayTaskEntry(`value`.let(LoRaWANUpdateGatewayTaskEntryProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd114bcf3aaa4f55eb201fd42c4efa24baff839c441452902de638c551e1529e")
  public open
      fun loRaWanUpdateGatewayTaskEntry(`value`: LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit):
      Unit = loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun taskDefinitionType(): String? = unwrap(this).getTaskDefinitionType()

  public open fun taskDefinitionType(`value`: String) {
    unwrap(this).setTaskDefinitionType(`value`)
  }

  public open fun update(): Any? = unwrap(this).getUpdate()

  public open fun update(`value`: IResolvable) {
    unwrap(this).setUpdate(`value`.let(IResolvable::unwrap))
  }

  public open fun update(`value`: UpdateWirelessGatewayTaskCreateProperty) {
    unwrap(this).setUpdate(`value`.let(UpdateWirelessGatewayTaskCreateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3f3e3baec05b04591f177ffb0e9fa881df5d1f0d5868a999b2421cf124cf9c3")
  public open fun update(`value`: UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit): Unit
      = update(UpdateWirelessGatewayTaskCreateProperty(`value`))

  public interface Builder {
    public fun autoCreateTasks(autoCreateTasks: Boolean)

    public fun autoCreateTasks(autoCreateTasks: IResolvable)

    public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable)

    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4029b89ab3c57a112afb8f4a10f136caacb63e73b69ed8aec5cb67efdcf6f365")
    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskDefinitionType(taskDefinitionType: String)

    public fun update(update: IResolvable)

    public fun update(update: UpdateWirelessGatewayTaskCreateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59d42d697f4c628bcaabb093931b235aaafcd93e189237d78bc134273c295dc2")
    public fun update(update: UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.Builder =
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.Builder.create(scope, id)

    override fun autoCreateTasks(autoCreateTasks: Boolean) {
      cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    override fun autoCreateTasks(autoCreateTasks: IResolvable) {
      cdkBuilder.autoCreateTasks(autoCreateTasks.let(IResolvable::unwrap))
    }

    override fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(IResolvable::unwrap))
    }

    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(LoRaWANUpdateGatewayTaskEntryProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4029b89ab3c57a112afb8f4a10f136caacb63e73b69ed8aec5cb67efdcf6f365")
    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit):
        Unit =
        loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty(loRaWanUpdateGatewayTaskEntry))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun taskDefinitionType(taskDefinitionType: String) {
      cdkBuilder.taskDefinitionType(taskDefinitionType)
    }

    override fun update(update: IResolvable) {
      cdkBuilder.update(update.let(IResolvable::unwrap))
    }

    override fun update(update: UpdateWirelessGatewayTaskCreateProperty) {
      cdkBuilder.update(update.let(UpdateWirelessGatewayTaskCreateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59d42d697f4c628bcaabb093931b235aaafcd93e189237d78bc134273c295dc2")
    override fun update(update: UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit): Unit =
        update(UpdateWirelessGatewayTaskCreateProperty(update))

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnTaskDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition):
        CfnTaskDefinition = CfnTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnTaskDefinition):
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinition = wrapped.cdkObject
  }

  public interface UpdateWirelessGatewayTaskCreateProperty {
    public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    public fun updateDataRole(): String? = unwrap(this).getUpdateDataRole()

    public fun updateDataSource(): String? = unwrap(this).getUpdateDataSource()

    public interface Builder {
      public fun loRaWan(loRaWan: IResolvable)

      public fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9e1b2e9bb716c698778bb5a59a337f75a51f4015d1aee0f4516f361f7795069")
      public fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty.Builder.() -> Unit)

      public fun updateDataRole(updateDataRole: String)

      public fun updateDataSource(updateDataSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.builder()

      override fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
      }

      override fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty) {
        cdkBuilder.loRaWan(loRaWan.let(LoRaWANUpdateGatewayTaskCreateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9e1b2e9bb716c698778bb5a59a337f75a51f4015d1aee0f4516f361f7795069")
      override fun loRaWan(loRaWan: LoRaWANUpdateGatewayTaskCreateProperty.Builder.() -> Unit): Unit
          = loRaWan(LoRaWANUpdateGatewayTaskCreateProperty(loRaWan))

      override fun updateDataRole(updateDataRole: String) {
        cdkBuilder.updateDataRole(updateDataRole)
      }

      override fun updateDataSource(updateDataSource: String) {
        cdkBuilder.updateDataSource(updateDataSource)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty,
    ) : UpdateWirelessGatewayTaskCreateProperty {
      override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

      override fun updateDataRole(): String? = unwrap(this).getUpdateDataRole()

      override fun updateDataSource(): String? = unwrap(this).getUpdateDataSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpdateWirelessGatewayTaskCreateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty):
          UpdateWirelessGatewayTaskCreateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateWirelessGatewayTaskCreateProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoRaWANUpdateGatewayTaskCreateProperty {
    public fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

    public fun sigKeyCrc(): Number? = unwrap(this).getSigKeyCrc()

    public fun updateSignature(): String? = unwrap(this).getUpdateSignature()

    public fun updateVersion(): Any? = unwrap(this).getUpdateVersion()

    public interface Builder {
      public fun currentVersion(currentVersion: IResolvable)

      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e3dbdb85fcfaaeccfd1a6ad8772385e5aa1b77e660d8770f4647676c1b51c0")
      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)

      public fun sigKeyCrc(sigKeyCrc: Number)

      public fun updateSignature(updateSignature: String)

      public fun updateVersion(updateVersion: IResolvable)

      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52920c2c3e1f516601d9998280389f4e63f6cb3a334cdf420fd38489c65e9bbf")
      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.builder()

      override fun currentVersion(currentVersion: IResolvable) {
        cdkBuilder.currentVersion(currentVersion.let(IResolvable::unwrap))
      }

      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.currentVersion(currentVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e3dbdb85fcfaaeccfd1a6ad8772385e5aa1b77e660d8770f4647676c1b51c0")
      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = currentVersion(LoRaWANGatewayVersionProperty(currentVersion))

      override fun sigKeyCrc(sigKeyCrc: Number) {
        cdkBuilder.sigKeyCrc(sigKeyCrc)
      }

      override fun updateSignature(updateSignature: String) {
        cdkBuilder.updateSignature(updateSignature)
      }

      override fun updateVersion(updateVersion: IResolvable) {
        cdkBuilder.updateVersion(updateVersion.let(IResolvable::unwrap))
      }

      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.updateVersion(updateVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52920c2c3e1f516601d9998280389f4e63f6cb3a334cdf420fd38489c65e9bbf")
      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = updateVersion(LoRaWANGatewayVersionProperty(updateVersion))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty,
    ) : LoRaWANUpdateGatewayTaskCreateProperty {
      override fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

      override fun sigKeyCrc(): Number? = unwrap(this).getSigKeyCrc()

      override fun updateSignature(): String? = unwrap(this).getUpdateSignature()

      override fun updateVersion(): Any? = unwrap(this).getUpdateVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LoRaWANUpdateGatewayTaskCreateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty):
          LoRaWANUpdateGatewayTaskCreateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANUpdateGatewayTaskCreateProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoRaWANUpdateGatewayTaskEntryProperty {
    public fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

    public fun updateVersion(): Any? = unwrap(this).getUpdateVersion()

    public interface Builder {
      public fun currentVersion(currentVersion: IResolvable)

      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b83f1b58b8ad73fb0907fded0e7c11ce88aca0abf09a4ae8750fcde7ed6bafe")
      public fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)

      public fun updateVersion(updateVersion: IResolvable)

      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a68afc149d3991232ab5c4e32d6fc7ce61c665336a8035635bb16402202f1124")
      public fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.builder()

      override fun currentVersion(currentVersion: IResolvable) {
        cdkBuilder.currentVersion(currentVersion.let(IResolvable::unwrap))
      }

      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.currentVersion(currentVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b83f1b58b8ad73fb0907fded0e7c11ce88aca0abf09a4ae8750fcde7ed6bafe")
      override fun currentVersion(currentVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = currentVersion(LoRaWANGatewayVersionProperty(currentVersion))

      override fun updateVersion(updateVersion: IResolvable) {
        cdkBuilder.updateVersion(updateVersion.let(IResolvable::unwrap))
      }

      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty) {
        cdkBuilder.updateVersion(updateVersion.let(LoRaWANGatewayVersionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a68afc149d3991232ab5c4e32d6fc7ce61c665336a8035635bb16402202f1124")
      override fun updateVersion(updateVersion: LoRaWANGatewayVersionProperty.Builder.() -> Unit):
          Unit = updateVersion(LoRaWANGatewayVersionProperty(updateVersion))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty,
    ) : LoRaWANUpdateGatewayTaskEntryProperty {
      override fun currentVersion(): Any? = unwrap(this).getCurrentVersion()

      override fun updateVersion(): Any? = unwrap(this).getUpdateVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LoRaWANUpdateGatewayTaskEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty):
          LoRaWANUpdateGatewayTaskEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANUpdateGatewayTaskEntryProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoRaWANGatewayVersionProperty {
    public fun model(): String? = unwrap(this).getModel()

    public fun packageVersion(): String? = unwrap(this).getPackageVersion()

    public fun station(): String? = unwrap(this).getStation()

    public interface Builder {
      public fun model(model: String)

      public fun packageVersion(packageVersion: String)

      public fun station(station: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty.builder()

      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      override fun packageVersion(packageVersion: String) {
        cdkBuilder.packageVersion(packageVersion)
      }

      override fun station(station: String) {
        cdkBuilder.station(station)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty,
    ) : LoRaWANGatewayVersionProperty {
      override fun model(): String? = unwrap(this).getModel()

      override fun packageVersion(): String? = unwrap(this).getPackageVersion()

      override fun station(): String? = unwrap(this).getStation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANGatewayVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty):
          LoRaWANGatewayVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANGatewayVersionProperty):
          software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
