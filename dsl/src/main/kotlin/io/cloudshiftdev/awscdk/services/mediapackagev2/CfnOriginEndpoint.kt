package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnOriginEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

  public open fun channelGroupName(`value`: String) {
    unwrap(this).setChannelGroupName(`value`)
  }

  public open fun channelName(): String = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public open fun containerType(): String? = unwrap(this).getContainerType()

  public open fun containerType(`value`: String) {
    unwrap(this).setContainerType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

  public open fun hlsManifests(`value`: IResolvable) {
    unwrap(this).setHlsManifests(`value`.let(IResolvable::unwrap))
  }

  public open fun hlsManifests(__idx_ac66f0: List<Any>) {
    unwrap(this).setHlsManifests(__idx_ac66f0)
  }

  public open fun hlsManifests(vararg __idx_ac66f0: Any): Unit = hlsManifests(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lowLatencyHlsManifests(): Any? = unwrap(this).getLowLatencyHlsManifests()

  public open fun lowLatencyHlsManifests(`value`: IResolvable) {
    unwrap(this).setLowLatencyHlsManifests(`value`.let(IResolvable::unwrap))
  }

  public open fun lowLatencyHlsManifests(__idx_ac66f0: List<Any>) {
    unwrap(this).setLowLatencyHlsManifests(__idx_ac66f0)
  }

  public open fun lowLatencyHlsManifests(vararg __idx_ac66f0: Any): Unit =
      lowLatencyHlsManifests(__idx_ac66f0.toList())

  public open fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

  public open fun originEndpointName(`value`: String) {
    unwrap(this).setOriginEndpointName(`value`)
  }

  public open fun segment(): Any? = unwrap(this).getSegment()

  public open fun segment(`value`: IResolvable) {
    unwrap(this).setSegment(`value`.let(IResolvable::unwrap))
  }

  public open fun segment(`value`: SegmentProperty) {
    unwrap(this).setSegment(`value`.let(SegmentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0030fa27f15fd8266644709d437fc7ddb95acd4ef255e7f4fb9e8ea963b56a09")
  public open fun segment(`value`: SegmentProperty.Builder.() -> Unit): Unit =
      segment(SegmentProperty(`value`))

  public open fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  public open fun startoverWindowSeconds(`value`: Number) {
    unwrap(this).setStartoverWindowSeconds(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun channelGroupName(channelGroupName: String)

    public fun channelName(channelName: String)

    public fun containerType(containerType: String)

    public fun description(description: String)

    public fun hlsManifests(hlsManifests: IResolvable)

    public fun hlsManifests(hlsManifests: List<Any>)

    public fun hlsManifests(vararg hlsManifests: Any)

    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable)

    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>)

    public fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any)

    public fun originEndpointName(originEndpointName: String)

    public fun segment(segment: IResolvable)

    public fun segment(segment: SegmentProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("888ca8fa0dfe89a1ccb17471efd9347cbeec41d418f2679feca29c30421aa053")
    public fun segment(segment: SegmentProperty.Builder.() -> Unit)

    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.Builder
        = software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.Builder.create(scope, id)

    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hlsManifests(hlsManifests: IResolvable) {
      cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
    }

    override fun hlsManifests(hlsManifests: List<Any>) {
      cdkBuilder.hlsManifests(hlsManifests)
    }

    override fun hlsManifests(vararg hlsManifests: Any): Unit = hlsManifests(hlsManifests.toList())

    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.let(IResolvable::unwrap))
    }

    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests)
    }

    override fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any): Unit =
        lowLatencyHlsManifests(lowLatencyHlsManifests.toList())

    override fun originEndpointName(originEndpointName: String) {
      cdkBuilder.originEndpointName(originEndpointName)
    }

    override fun segment(segment: IResolvable) {
      cdkBuilder.segment(segment.let(IResolvable::unwrap))
    }

    override fun segment(segment: SegmentProperty) {
      cdkBuilder.segment(segment.let(SegmentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("888ca8fa0dfe89a1ccb17471efd9347cbeec41d418f2679feca29c30421aa053")
    override fun segment(segment: SegmentProperty.Builder.() -> Unit): Unit =
        segment(SegmentProperty(segment))

    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint):
        CfnOriginEndpoint = CfnOriginEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpoint):
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint = wrapped.cdkObject
  }

  public interface EncryptionMethodProperty {
    public fun cmafEncryptionMethod(): String? = unwrap(this).getCmafEncryptionMethod()

    public fun tsEncryptionMethod(): String? = unwrap(this).getTsEncryptionMethod()

    public interface Builder {
      public fun cmafEncryptionMethod(cmafEncryptionMethod: String)

      public fun tsEncryptionMethod(tsEncryptionMethod: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty.builder()

      override fun cmafEncryptionMethod(cmafEncryptionMethod: String) {
        cdkBuilder.cmafEncryptionMethod(cmafEncryptionMethod)
      }

      override fun tsEncryptionMethod(tsEncryptionMethod: String) {
        cdkBuilder.tsEncryptionMethod(tsEncryptionMethod)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty,
    ) : EncryptionMethodProperty {
      override fun cmafEncryptionMethod(): String? = unwrap(this).getCmafEncryptionMethod()

      override fun tsEncryptionMethod(): String? = unwrap(this).getTsEncryptionMethod()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty):
          EncryptionMethodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionMethodProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterConfigurationProperty {
    public fun end(): String? = unwrap(this).getEnd()

    public fun manifestFilter(): String? = unwrap(this).getManifestFilter()

    public fun start(): String? = unwrap(this).getStart()

    public fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

    public interface Builder {
      public fun end(end: String)

      public fun manifestFilter(manifestFilter: String)

      public fun start(start: String)

      public fun timeDelaySeconds(timeDelaySeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty.builder()

      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      override fun manifestFilter(manifestFilter: String) {
        cdkBuilder.manifestFilter(manifestFilter)
      }

      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      override fun timeDelaySeconds(timeDelaySeconds: Number) {
        cdkBuilder.timeDelaySeconds(timeDelaySeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty,
    ) : FilterConfigurationProperty {
      override fun end(): String? = unwrap(this).getEnd()

      override fun manifestFilter(): String? = unwrap(this).getManifestFilter()

      override fun start(): String? = unwrap(this).getStart()

      override fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty):
          FilterConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpekeKeyProviderProperty {
    public fun drmSystems(): List<String>

    public fun encryptionContractConfiguration(): Any

    public fun resourceId(): String

    public fun roleArn(): String

    public fun url(): String

    public interface Builder {
      public fun drmSystems(drmSystems: List<String>)

      public fun drmSystems(vararg drmSystems: String)

      public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable)

      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9db9cff9bfbd8728fd67b1051dc3470d4e32793577b17a37cad937f99ec96867")
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit)

      public fun resourceId(resourceId: String)

      public fun roleArn(roleArn: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

      override fun drmSystems(drmSystems: List<String>) {
        cdkBuilder.drmSystems(drmSystems)
      }

      override fun drmSystems(vararg drmSystems: String): Unit = drmSystems(drmSystems.toList())

      override fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable::unwrap))
      }

      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9db9cff9bfbd8728fd67b1051dc3470d4e32793577b17a37cad937f99ec96867")
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit):
          Unit =
          encryptionContractConfiguration(EncryptionContractConfigurationProperty(encryptionContractConfiguration))

      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty,
    ) : SpekeKeyProviderProperty {
      override fun drmSystems(): List<String> = unwrap(this).getDrmSystems()

      override fun encryptionContractConfiguration(): Any =
          unwrap(this).getEncryptionContractConfiguration()

      override fun resourceId(): String = unwrap(this).getResourceId()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpekeKeyProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScteHlsProperty {
    public fun adMarkerHls(): String? = unwrap(this).getAdMarkerHls()

    public interface Builder {
      public fun adMarkerHls(adMarkerHls: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty.builder()

      override fun adMarkerHls(adMarkerHls: String) {
        cdkBuilder.adMarkerHls(adMarkerHls)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty,
    ) : ScteHlsProperty {
      override fun adMarkerHls(): String? = unwrap(this).getAdMarkerHls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScteHlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty):
          ScteHlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScteHlsProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncryptionContractConfigurationProperty {
    public fun presetSpeke20Audio(): String

    public fun presetSpeke20Video(): String

    public interface Builder {
      public fun presetSpeke20Audio(presetSpeke20Audio: String)

      public fun presetSpeke20Video(presetSpeke20Video: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

      override fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
      }

      override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty,
    ) : EncryptionContractConfigurationProperty {
      override fun presetSpeke20Audio(): String = unwrap(this).getPresetSpeke20Audio()

      override fun presetSpeke20Video(): String = unwrap(this).getPresetSpeke20Video()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EncryptionContractConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty):
          EncryptionContractConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionContractConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsManifestConfigurationProperty {
    public fun childManifestName(): String? = unwrap(this).getChildManifestName()

    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    public fun manifestName(): String

    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    public fun scteHls(): Any? = unwrap(this).getScteHls()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun childManifestName(childManifestName: String)

      public fun filterConfiguration(filterConfiguration: IResolvable)

      public fun filterConfiguration(filterConfiguration: FilterConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0aee2c032693bff8484255c2220fc44ce6cb6a02c0f9ebe20ec091ab4fd812a")
      public
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit)

      public fun manifestName(manifestName: String)

      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      public fun scteHls(scteHls: IResolvable)

      public fun scteHls(scteHls: ScteHlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c2552766ba01398d4ac04c908b00e89fb7ee64b4c6f9a85ed57ecc63df313fc")
      public fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty.builder()

      override fun childManifestName(childManifestName: String) {
        cdkBuilder.childManifestName(childManifestName)
      }

      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable::unwrap))
      }

      override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0aee2c032693bff8484255c2220fc44ce6cb6a02c0f9ebe20ec091ab4fd812a")
      override
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(FilterConfigurationProperty(filterConfiguration))

      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      override fun scteHls(scteHls: IResolvable) {
        cdkBuilder.scteHls(scteHls.let(IResolvable::unwrap))
      }

      override fun scteHls(scteHls: ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls.let(ScteHlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c2552766ba01398d4ac04c908b00e89fb7ee64b4c6f9a85ed57ecc63df313fc")
      override fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit): Unit =
          scteHls(ScteHlsProperty(scteHls))

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty,
    ) : HlsManifestConfigurationProperty {
      override fun childManifestName(): String? = unwrap(this).getChildManifestName()

      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

      override fun manifestName(): String = unwrap(this).getManifestName()

      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      override fun scteHls(): Any? = unwrap(this).getScteHls()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty):
          HlsManifestConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SegmentProperty {
    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun includeIframeOnlyStreams(): Any? = unwrap(this).getIncludeIframeOnlyStreams()

    public fun scte(): Any? = unwrap(this).getScte()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun segmentName(): String? = unwrap(this).getSegmentName()

    public fun tsIncludeDvbSubtitles(): Any? = unwrap(this).getTsIncludeDvbSubtitles()

    public fun tsUseAudioRenditionGroup(): Any? = unwrap(this).getTsUseAudioRenditionGroup()

    public interface Builder {
      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: EncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d1bec01a89747d6578cae965850636a5d90e9195105ca0248e95860ef7b6bd1")
      public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit)

      public fun includeIframeOnlyStreams(includeIframeOnlyStreams: Boolean)

      public fun includeIframeOnlyStreams(includeIframeOnlyStreams: IResolvable)

      public fun scte(scte: IResolvable)

      public fun scte(scte: ScteProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dfdadafc1cbc1040d7aee7c3c4106e426cdf53444c360acf09caa8bd35ba364")
      public fun scte(scte: ScteProperty.Builder.() -> Unit)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      public fun segmentName(segmentName: String)

      public fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: Boolean)

      public fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: IResolvable)

      public fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: Boolean)

      public fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty.builder()

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: EncryptionProperty) {
        cdkBuilder.encryption(encryption.let(EncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d1bec01a89747d6578cae965850636a5d90e9195105ca0248e95860ef7b6bd1")
      override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
          encryption(EncryptionProperty(encryption))

      override fun includeIframeOnlyStreams(includeIframeOnlyStreams: Boolean) {
        cdkBuilder.includeIframeOnlyStreams(includeIframeOnlyStreams)
      }

      override fun includeIframeOnlyStreams(includeIframeOnlyStreams: IResolvable) {
        cdkBuilder.includeIframeOnlyStreams(includeIframeOnlyStreams.let(IResolvable::unwrap))
      }

      override fun scte(scte: IResolvable) {
        cdkBuilder.scte(scte.let(IResolvable::unwrap))
      }

      override fun scte(scte: ScteProperty) {
        cdkBuilder.scte(scte.let(ScteProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dfdadafc1cbc1040d7aee7c3c4106e426cdf53444c360acf09caa8bd35ba364")
      override fun scte(scte: ScteProperty.Builder.() -> Unit): Unit = scte(ScteProperty(scte))

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      override fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
      }

      override fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: Boolean) {
        cdkBuilder.tsIncludeDvbSubtitles(tsIncludeDvbSubtitles)
      }

      override fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: IResolvable) {
        cdkBuilder.tsIncludeDvbSubtitles(tsIncludeDvbSubtitles.let(IResolvable::unwrap))
      }

      override fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: Boolean) {
        cdkBuilder.tsUseAudioRenditionGroup(tsUseAudioRenditionGroup)
      }

      override fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: IResolvable) {
        cdkBuilder.tsUseAudioRenditionGroup(tsUseAudioRenditionGroup.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty,
    ) : SegmentProperty {
      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun includeIframeOnlyStreams(): Any? = unwrap(this).getIncludeIframeOnlyStreams()

      override fun scte(): Any? = unwrap(this).getScte()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      override fun segmentName(): String? = unwrap(this).getSegmentName()

      override fun tsIncludeDvbSubtitles(): Any? = unwrap(this).getTsIncludeDvbSubtitles()

      override fun tsUseAudioRenditionGroup(): Any? = unwrap(this).getTsUseAudioRenditionGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty):
          SegmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LowLatencyHlsManifestConfigurationProperty {
    public fun childManifestName(): String? = unwrap(this).getChildManifestName()

    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    public fun manifestName(): String

    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    public fun scteHls(): Any? = unwrap(this).getScteHls()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun childManifestName(childManifestName: String)

      public fun filterConfiguration(filterConfiguration: IResolvable)

      public fun filterConfiguration(filterConfiguration: FilterConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60276fbe3576bbb1f200a20e4faae25c52ef9ea8bc9f0248f931dcc59627ce8")
      public
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit)

      public fun manifestName(manifestName: String)

      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      public fun scteHls(scteHls: IResolvable)

      public fun scteHls(scteHls: ScteHlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687f873b6a36ecb424fbd5ad87d30682ab0a19e26a068ecafd0eab5823883846")
      public fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty.builder()

      override fun childManifestName(childManifestName: String) {
        cdkBuilder.childManifestName(childManifestName)
      }

      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable::unwrap))
      }

      override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60276fbe3576bbb1f200a20e4faae25c52ef9ea8bc9f0248f931dcc59627ce8")
      override
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(FilterConfigurationProperty(filterConfiguration))

      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      override fun scteHls(scteHls: IResolvable) {
        cdkBuilder.scteHls(scteHls.let(IResolvable::unwrap))
      }

      override fun scteHls(scteHls: ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls.let(ScteHlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687f873b6a36ecb424fbd5ad87d30682ab0a19e26a068ecafd0eab5823883846")
      override fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit): Unit =
          scteHls(ScteHlsProperty(scteHls))

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty,
    ) : LowLatencyHlsManifestConfigurationProperty {
      override fun childManifestName(): String? = unwrap(this).getChildManifestName()

      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

      override fun manifestName(): String = unwrap(this).getManifestName()

      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      override fun scteHls(): Any? = unwrap(this).getScteHls()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LowLatencyHlsManifestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty):
          LowLatencyHlsManifestConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LowLatencyHlsManifestConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScteProperty {
    public fun scteFilter(): List<String> = unwrap(this).getScteFilter() ?: emptyList()

    public interface Builder {
      public fun scteFilter(scteFilter: List<String>)

      public fun scteFilter(vararg scteFilter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty.builder()

      override fun scteFilter(scteFilter: List<String>) {
        cdkBuilder.scteFilter(scteFilter)
      }

      override fun scteFilter(vararg scteFilter: String): Unit = scteFilter(scteFilter.toList())

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty,
    ) : ScteProperty {
      override fun scteFilter(): List<String> = unwrap(this).getScteFilter() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty):
          ScteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScteProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EncryptionProperty {
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun encryptionMethod(): Any

    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun constantInitializationVector(constantInitializationVector: String)

      public fun encryptionMethod(encryptionMethod: IResolvable)

      public fun encryptionMethod(encryptionMethod: EncryptionMethodProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b82338da2eb0244c9f97d1e7cf2e2ef5ef53f5c835bb6a06264c958e9fd7ab2")
      public fun encryptionMethod(encryptionMethod: EncryptionMethodProperty.Builder.() -> Unit)

      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("339a27bb3e0ef9f95e7b6f49e755e4597fbf8f1c92ea9044619c2c2b14273e17")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty.builder()

      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      override fun encryptionMethod(encryptionMethod: IResolvable) {
        cdkBuilder.encryptionMethod(encryptionMethod.let(IResolvable::unwrap))
      }

      override fun encryptionMethod(encryptionMethod: EncryptionMethodProperty) {
        cdkBuilder.encryptionMethod(encryptionMethod.let(EncryptionMethodProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b82338da2eb0244c9f97d1e7cf2e2ef5ef53f5c835bb6a06264c958e9fd7ab2")
      override fun encryptionMethod(encryptionMethod: EncryptionMethodProperty.Builder.() -> Unit):
          Unit = encryptionMethod(EncryptionMethodProperty(encryptionMethod))

      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("339a27bb3e0ef9f95e7b6f49e755e4597fbf8f1c92ea9044619c2c2b14273e17")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty,
    ) : EncryptionProperty {
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      override fun encryptionMethod(): Any = unwrap(this).getEncryptionMethod()

      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
