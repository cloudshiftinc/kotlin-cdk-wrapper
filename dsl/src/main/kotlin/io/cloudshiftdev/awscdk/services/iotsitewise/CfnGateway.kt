package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGateway internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrGatewayId(): String = unwrap(this).getAttrGatewayId()

  public open fun gatewayCapabilitySummaries(): Any? = unwrap(this).getGatewayCapabilitySummaries()

  public open fun gatewayCapabilitySummaries(`value`: IResolvable) {
    unwrap(this).setGatewayCapabilitySummaries(`value`.let(IResolvable::unwrap))
  }

  public open fun gatewayCapabilitySummaries(__idx_ac66f0: List<Any>) {
    unwrap(this).setGatewayCapabilitySummaries(__idx_ac66f0)
  }

  public open fun gatewayName(): String = unwrap(this).getGatewayName()

  public open fun gatewayName(`value`: String) {
    unwrap(this).setGatewayName(`value`)
  }

  public open fun gatewayPlatform(): Any = unwrap(this).getGatewayPlatform()

  public open fun gatewayPlatform(`value`: IResolvable) {
    unwrap(this).setGatewayPlatform(`value`.let(IResolvable::unwrap))
  }

  public open fun gatewayPlatform(`value`: GatewayPlatformProperty) {
    unwrap(this).setGatewayPlatform(`value`.let(GatewayPlatformProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("402fb47c15f58a9bbd48df590bf23601325404ee9bb7bbef81ee10a687daa8ed")
  public open fun gatewayPlatform(`value`: GatewayPlatformProperty.Builder.() -> Unit): Unit =
      gatewayPlatform(GatewayPlatformProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable) {
    }

    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>) {
    }

    public fun gatewayName(gatewayName: String) {
    }

    public fun gatewayPlatform(gatewayPlatform: IResolvable) {
    }

    public fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67a83972075c055807843f542cb36a800b44e870144de9ea23f8102a70a276ed")
    public fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnGateway.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnGateway.Builder.create(scope, id)

    public override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries.let(IResolvable::unwrap))
    }

    public override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries)
    }

    public override fun gatewayName(gatewayName: String) {
      cdkBuilder.gatewayName(gatewayName)
    }

    public override fun gatewayPlatform(gatewayPlatform: IResolvable) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(IResolvable::unwrap))
    }

    public override fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(GatewayPlatformProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67a83972075c055807843f542cb36a800b44e870144de9ea23f8102a70a276ed")
    public override
        fun gatewayPlatform(gatewayPlatform: GatewayPlatformProperty.Builder.() -> Unit): Unit =
        gatewayPlatform(GatewayPlatformProperty(gatewayPlatform))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnGateway = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway): CfnGateway
        = CfnGateway(cdkObject)

    internal fun unwrap(wrapped: CfnGateway): software.amazon.awscdk.services.iotsitewise.CfnGateway
        = wrapped.cdkObject
  }

  public interface GreengrassV2Property {
    public fun coreDeviceThingName(): String

    public interface Builder {
      public fun coreDeviceThingName(coreDeviceThingName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property.builder()

      public override fun coreDeviceThingName(coreDeviceThingName: String) {
        cdkBuilder.coreDeviceThingName(coreDeviceThingName)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property,
    ) : GreengrassV2Property {
      public override fun coreDeviceThingName(): String = unwrap(this).getCoreDeviceThingName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GreengrassV2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property):
          GreengrassV2Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GreengrassV2Property):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassV2Property = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GreengrassProperty {
    public fun groupArn(): String

    public interface Builder {
      public fun groupArn(groupArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty.builder()

      public override fun groupArn(groupArn: String) {
        cdkBuilder.groupArn(groupArn)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty,
    ) : GreengrassProperty {
      public override fun groupArn(): String = unwrap(this).getGroupArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GreengrassProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty):
          GreengrassProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GreengrassProperty):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GreengrassProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GatewayPlatformProperty {
    public fun greengrass(): Any? = unwrap(this).getGreengrass()

    public fun greengrassV2(): Any? = unwrap(this).getGreengrassV2()

    public interface Builder {
      public fun greengrass(greengrass: IResolvable) {
      }

      public fun greengrass(greengrass: GreengrassProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("565ec39735a4f1c8211fba5c507ef3bd4c8f5c3104cbe93f8ca532f41baac3da")
      public fun greengrass(greengrass: GreengrassProperty.Builder.() -> Unit) {
      }

      public fun greengrassV2(greengrassV2: IResolvable) {
      }

      public fun greengrassV2(greengrassV2: GreengrassV2Property) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca43a8bd608afed1919b0aedc0623e92dc59ed76e4674f3fb5a2b3b3450fd463")
      public fun greengrassV2(greengrassV2: GreengrassV2Property.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty.builder()

      public override fun greengrass(greengrass: IResolvable) {
        cdkBuilder.greengrass(greengrass.let(IResolvable::unwrap))
      }

      public override fun greengrass(greengrass: GreengrassProperty) {
        cdkBuilder.greengrass(greengrass.let(GreengrassProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("565ec39735a4f1c8211fba5c507ef3bd4c8f5c3104cbe93f8ca532f41baac3da")
      public override fun greengrass(greengrass: GreengrassProperty.Builder.() -> Unit): Unit =
          greengrass(GreengrassProperty(greengrass))

      public override fun greengrassV2(greengrassV2: IResolvable) {
        cdkBuilder.greengrassV2(greengrassV2.let(IResolvable::unwrap))
      }

      public override fun greengrassV2(greengrassV2: GreengrassV2Property) {
        cdkBuilder.greengrassV2(greengrassV2.let(GreengrassV2Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca43a8bd608afed1919b0aedc0623e92dc59ed76e4674f3fb5a2b3b3450fd463")
      public override fun greengrassV2(greengrassV2: GreengrassV2Property.Builder.() -> Unit): Unit
          = greengrassV2(GreengrassV2Property(greengrassV2))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty,
    ) : GatewayPlatformProperty {
      public override fun greengrass(): Any? = unwrap(this).getGreengrass()

      public override fun greengrassV2(): Any? = unwrap(this).getGreengrassV2()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayPlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty):
          GatewayPlatformProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayPlatformProperty):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GatewayCapabilitySummaryProperty {
    public fun capabilityConfiguration(): String? = unwrap(this).getCapabilityConfiguration()

    public fun capabilityNamespace(): String

    public interface Builder {
      public fun capabilityConfiguration(capabilityConfiguration: String) {
      }

      public fun capabilityNamespace(capabilityNamespace: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty.builder()

      public override fun capabilityConfiguration(capabilityConfiguration: String) {
        cdkBuilder.capabilityConfiguration(capabilityConfiguration)
      }

      public override fun capabilityNamespace(capabilityNamespace: String) {
        cdkBuilder.capabilityNamespace(capabilityNamespace)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty,
    ) : GatewayCapabilitySummaryProperty {
      public override fun capabilityConfiguration(): String? =
          unwrap(this).getCapabilityConfiguration()

      public override fun capabilityNamespace(): String = unwrap(this).getCapabilityNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayCapabilitySummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty):
          GatewayCapabilitySummaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayCapabilitySummaryProperty):
          software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
