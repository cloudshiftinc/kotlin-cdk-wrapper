package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnMultiplex internal constructor(
  private val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPipelinesRunningCount(): Number = unwrap(this).getAttrPipelinesRunningCount()

  public open fun attrProgramCount(): Number = unwrap(this).getAttrProgramCount()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun destinations(): Any? = unwrap(this).getDestinations()

  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable::unwrap))
  }

  public open fun destinations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinations(__idx_ac66f0)
  }

  public open fun destinations(vararg __idx_ac66f0: Any): Unit = destinations(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun multiplexSettings(): Any = unwrap(this).getMultiplexSettings()

  public open fun multiplexSettings(`value`: IResolvable) {
    unwrap(this).setMultiplexSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun multiplexSettings(`value`: MultiplexSettingsProperty) {
    unwrap(this).setMultiplexSettings(`value`.let(MultiplexSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d77642a3d1aff7c1c2b69132c9bec5fe92ded4de3ec1940e2e187944f6361c1d")
  public open fun multiplexSettings(`value`: MultiplexSettingsProperty.Builder.() -> Unit): Unit =
      multiplexSettings(MultiplexSettingsProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun multiplexSettings(multiplexSettings: IResolvable)

    public fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f48a3161dab0e0572a7a8b048700145d2d36e6dc63d0a03419f9b9db2492680c")
    public fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnMultiplex.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplex.Builder.create(scope, id)

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    override fun multiplexSettings(multiplexSettings: IResolvable) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(IResolvable::unwrap))
    }

    override fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(MultiplexSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f48a3161dab0e0572a7a8b048700145d2d36e6dc63d0a03419f9b9db2492680c")
    override fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty.Builder.() -> Unit):
        Unit = multiplexSettings(MultiplexSettingsProperty(multiplexSettings))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplex = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiplex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiplex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex):
        CfnMultiplex = CfnMultiplex(cdkObject)

    internal fun unwrap(wrapped: CfnMultiplex):
        software.amazon.awscdk.services.medialive.CfnMultiplex = wrapped.cdkObject
  }

  public interface MultiplexMediaConnectOutputDestinationSettingsProperty {
    public fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

    public interface Builder {
      public fun entitlementArn(entitlementArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty.builder()

      override fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty,
    ) : MultiplexMediaConnectOutputDestinationSettingsProperty {
      override fun entitlementArn(): String? = unwrap(this).getEntitlementArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexMediaConnectOutputDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty):
          MultiplexMediaConnectOutputDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexMediaConnectOutputDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexSettingsProperty {
    public fun maximumVideoBufferDelayMilliseconds(): Number? =
        unwrap(this).getMaximumVideoBufferDelayMilliseconds()

    public fun transportStreamBitrate(): Number

    public fun transportStreamId(): Number

    public fun transportStreamReservedBitrate(): Number? =
        unwrap(this).getTransportStreamReservedBitrate()

    public interface Builder {
      public fun maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds: Number)

      public fun transportStreamBitrate(transportStreamBitrate: Number)

      public fun transportStreamId(transportStreamId: Number)

      public fun transportStreamReservedBitrate(transportStreamReservedBitrate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty.builder()

      override
          fun maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds: Number) {
        cdkBuilder.maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds)
      }

      override fun transportStreamBitrate(transportStreamBitrate: Number) {
        cdkBuilder.transportStreamBitrate(transportStreamBitrate)
      }

      override fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
      }

      override fun transportStreamReservedBitrate(transportStreamReservedBitrate: Number) {
        cdkBuilder.transportStreamReservedBitrate(transportStreamReservedBitrate)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty,
    ) : MultiplexSettingsProperty {
      override fun maximumVideoBufferDelayMilliseconds(): Number? =
          unwrap(this).getMaximumVideoBufferDelayMilliseconds()

      override fun transportStreamBitrate(): Number = unwrap(this).getTransportStreamBitrate()

      override fun transportStreamId(): Number = unwrap(this).getTransportStreamId()

      override fun transportStreamReservedBitrate(): Number? =
          unwrap(this).getTransportStreamReservedBitrate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty):
          MultiplexSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexOutputDestinationProperty {
    public fun multiplexMediaConnectOutputDestinationSettings(): Any? =
        unwrap(this).getMultiplexMediaConnectOutputDestinationSettings()

    public interface Builder {
      public
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: IResolvable)

      public
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2569c3f12cb772a27991b1621a83c9f430ff4d781d3da6fbd420a85060180260")
      public
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty.builder()

      override
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: IResolvable) {
        cdkBuilder.multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty) {
        cdkBuilder.multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings.let(MultiplexMediaConnectOutputDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2569c3f12cb772a27991b1621a83c9f430ff4d781d3da6fbd420a85060180260")
      override
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          multiplexMediaConnectOutputDestinationSettings(MultiplexMediaConnectOutputDestinationSettingsProperty(multiplexMediaConnectOutputDestinationSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty,
    ) : MultiplexOutputDestinationProperty {
      override fun multiplexMediaConnectOutputDestinationSettings(): Any? =
          unwrap(this).getMultiplexMediaConnectOutputDestinationSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexOutputDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty):
          MultiplexOutputDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexOutputDestinationProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
