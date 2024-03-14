package io.cloudshiftdev.awscdk.services.mediapackage

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

public open class CfnPackagingConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  public open fun cmafPackage(`value`: IResolvable) {
    unwrap(this).setCmafPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun cmafPackage(`value`: CmafPackageProperty) {
    unwrap(this).setCmafPackage(`value`.let(CmafPackageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ea99f10745e5a2cb252cbbdee4b5981038ca897b34ec35595faccaf06feeeb97")
  public open fun cmafPackage(`value`: CmafPackageProperty.Builder.() -> Unit): Unit =
      cmafPackage(CmafPackageProperty(`value`))

  public open fun dashPackage(): Any? = unwrap(this).getDashPackage()

  public open fun dashPackage(`value`: IResolvable) {
    unwrap(this).setDashPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun dashPackage(`value`: DashPackageProperty) {
    unwrap(this).setDashPackage(`value`.let(DashPackageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c16662ef4e97d77d1cab89ef3a9e766f4a86928df255a068f0af226980657c")
  public open fun dashPackage(`value`: DashPackageProperty.Builder.() -> Unit): Unit =
      dashPackage(DashPackageProperty(`value`))

  public open fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  public open fun hlsPackage(`value`: IResolvable) {
    unwrap(this).setHlsPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun hlsPackage(`value`: HlsPackageProperty) {
    unwrap(this).setHlsPackage(`value`.let(HlsPackageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b2142ecd34cbcd02f1fb8c64d1e1409a2590aa0db0c49ad65333ee8adacc98f")
  public open fun hlsPackage(`value`: HlsPackageProperty.Builder.() -> Unit): Unit =
      hlsPackage(HlsPackageProperty(`value`))

  public open fun id(): String = unwrap(this).getId()

  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mssPackage(): Any? = unwrap(this).getMssPackage()

  public open fun mssPackage(`value`: IResolvable) {
    unwrap(this).setMssPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun mssPackage(`value`: MssPackageProperty) {
    unwrap(this).setMssPackage(`value`.let(MssPackageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8d8ed7006e0485bd77316fa9c5c0865c98a67ebdf9526ce86360c7b006dc2816")
  public open fun mssPackage(`value`: MssPackageProperty.Builder.() -> Unit): Unit =
      mssPackage(MssPackageProperty(`value`))

  public open fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

  public open fun packagingGroupId(`value`: String) {
    unwrap(this).setPackagingGroupId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun cmafPackage(cmafPackage: IResolvable)

    public fun cmafPackage(cmafPackage: CmafPackageProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a97cc455baf43ff04dc19998d4e476be0fff980eaab7fb2fd85efb4cfaf52582")
    public fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit)

    public fun dashPackage(dashPackage: IResolvable)

    public fun dashPackage(dashPackage: DashPackageProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1713f82d9228e01b345734359e6afd5da9e43efc394939f4e9c7e4a56e05fb4a")
    public fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit)

    public fun hlsPackage(hlsPackage: IResolvable)

    public fun hlsPackage(hlsPackage: HlsPackageProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5da5e4c726eafbd8439914dcc7a947902d5d23fddf04d55c893228117c224c93")
    public fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun mssPackage(mssPackage: IResolvable)

    public fun mssPackage(mssPackage: MssPackageProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb4218bdb2427217c3aa1741d7196dde0040c95b44ba4a92a8311fa7077e176")
    public fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit)

    public fun packagingGroupId(packagingGroupId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.Builder =
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.Builder.create(scope,
        id)

    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    override fun cmafPackage(cmafPackage: CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CmafPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a97cc455baf43ff04dc19998d4e476be0fff980eaab7fb2fd85efb4cfaf52582")
    override fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit): Unit =
        cmafPackage(CmafPackageProperty(cmafPackage))

    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    override fun dashPackage(dashPackage: DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(DashPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1713f82d9228e01b345734359e6afd5da9e43efc394939f4e9c7e4a56e05fb4a")
    override fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit): Unit =
        dashPackage(DashPackageProperty(dashPackage))

    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    override fun hlsPackage(hlsPackage: HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(HlsPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5da5e4c726eafbd8439914dcc7a947902d5d23fddf04d55c893228117c224c93")
    override fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit): Unit =
        hlsPackage(HlsPackageProperty(hlsPackage))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    override fun mssPackage(mssPackage: MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(MssPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb4218bdb2427217c3aa1741d7196dde0040c95b44ba4a92a8311fa7077e176")
    override fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit): Unit =
        mssPackage(MssPackageProperty(mssPackage))

    override fun packagingGroupId(packagingGroupId: String) {
      cdkBuilder.packagingGroupId(packagingGroupId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPackagingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPackagingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration):
        CfnPackagingConfiguration = CfnPackagingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnPackagingConfiguration):
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration = wrapped.cdkObject
  }

  public interface CmafEncryptionProperty {
    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8db7b287f4d869addecc5e4d6a4491c12bb49517926b9591b5d8dcadc6b57b77")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty.builder()

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8db7b287f4d869addecc5e4d6a4491c12bb49517926b9591b5d8dcadc6b57b77")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty,
    ) : CmafEncryptionProperty {
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CmafEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty):
          CmafEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DashPackageProperty {
    public fun dashManifests(): Any

    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun includeEncoderConfigurationInSegments(): Any? =
        unwrap(this).getIncludeEncoderConfigurationInSegments()

    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    public fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

    public interface Builder {
      public fun dashManifests(dashManifests: IResolvable)

      public fun dashManifests(dashManifests: List<Any>)

      public fun dashManifests(vararg dashManifests: Any)

      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: DashEncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43eca2a40ade88bfc21a51032b082851928c61bb9e40ee06701f24ba5fadd9a9")
      public fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit)

      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean)

      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      public fun periodTriggers(periodTriggers: List<String>)

      public fun periodTriggers(vararg periodTriggers: String)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      public fun segmentTemplateFormat(segmentTemplateFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty.builder()

      override fun dashManifests(dashManifests: IResolvable) {
        cdkBuilder.dashManifests(dashManifests.let(IResolvable::unwrap))
      }

      override fun dashManifests(dashManifests: List<Any>) {
        cdkBuilder.dashManifests(dashManifests)
      }

      override fun dashManifests(vararg dashManifests: Any): Unit =
          dashManifests(dashManifests.toList())

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: DashEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(DashEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43eca2a40ade88bfc21a51032b082851928c61bb9e40ee06701f24ba5fadd9a9")
      override fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(DashEncryptionProperty(encryption))

      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
      }

      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments.let(IResolvable::unwrap))
      }

      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      override fun periodTriggers(periodTriggers: List<String>) {
        cdkBuilder.periodTriggers(periodTriggers)
      }

      override fun periodTriggers(vararg periodTriggers: String): Unit =
          periodTriggers(periodTriggers.toList())

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      override fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty,
    ) : DashPackageProperty {
      override fun dashManifests(): Any = unwrap(this).getDashManifests()

      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun includeEncoderConfigurationInSegments(): Any? =
          unwrap(this).getIncludeEncoderConfigurationInSegments()

      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      override fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      override fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty):
          DashPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DashEncryptionProperty {
    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f71acb67a6c390974394d1529efac75681df0fbc7765e981bf292f492ab6527a")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty.builder()

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f71acb67a6c390974394d1529efac75681df0fbc7765e981bf292f492ab6527a")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty,
    ) : DashEncryptionProperty {
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty):
          DashEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StreamSelectionProperty {
    public fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

    public fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

    public fun streamOrder(): String? = unwrap(this).getStreamOrder()

    public interface Builder {
      public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number)

      public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number)

      public fun streamOrder(streamOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty.builder()

      override fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
        cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
      }

      override fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
        cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
      }

      override fun streamOrder(streamOrder: String) {
        cdkBuilder.streamOrder(streamOrder)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty,
    ) : StreamSelectionProperty {
      override fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

      override fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

      override fun streamOrder(): String? = unwrap(this).getStreamOrder()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty):
          StreamSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSelectionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MssPackageProperty {
    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun mssManifests(): Any

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public interface Builder {
      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: MssEncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f9e6b37a79b75f097ddcc69264afb4d7fb123925c41020613b92e5ced4a3406")
      public fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit)

      public fun mssManifests(mssManifests: IResolvable)

      public fun mssManifests(mssManifests: List<Any>)

      public fun mssManifests(vararg mssManifests: Any)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty.builder()

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: MssEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(MssEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f9e6b37a79b75f097ddcc69264afb4d7fb123925c41020613b92e5ced4a3406")
      override fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(MssEncryptionProperty(encryption))

      override fun mssManifests(mssManifests: IResolvable) {
        cdkBuilder.mssManifests(mssManifests.let(IResolvable::unwrap))
      }

      override fun mssManifests(mssManifests: List<Any>) {
        cdkBuilder.mssManifests(mssManifests)
      }

      override fun mssManifests(vararg mssManifests: Any): Unit =
          mssManifests(mssManifests.toList())

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty,
    ) : MssPackageProperty {
      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun mssManifests(): Any = unwrap(this).getMssManifests()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MssPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty):
          MssPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsEncryptionProperty {
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun constantInitializationVector(constantInitializationVector: String)

      public fun encryptionMethod(encryptionMethod: String)

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d99db2d7e210d25c3acbbe7a79f2f0b396bb312141d40882d12cf86670e468ac")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty.builder()

      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d99db2d7e210d25c3acbbe7a79f2f0b396bb312141d40882d12cf86670e468ac")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty,
    ) : HlsEncryptionProperty {
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty):
          HlsEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsManifestProperty {
    public fun adMarkers(): String? = unwrap(this).getAdMarkers()

    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    public fun manifestName(): String? = unwrap(this).getManifestName()

    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    public fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    public interface Builder {
      public fun adMarkers(adMarkers: String)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      public fun manifestName(manifestName: String)

      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      public fun repeatExtXKey(repeatExtXKey: Boolean)

      public fun repeatExtXKey(repeatExtXKey: IResolvable)

      public fun streamSelection(streamSelection: IResolvable)

      public fun streamSelection(streamSelection: StreamSelectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5423d98286d792acaf6af6c310486c0d09986786ce611d9d72b1ccff1af2a3a")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty.builder()

      override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      override fun repeatExtXKey(repeatExtXKey: Boolean) {
        cdkBuilder.repeatExtXKey(repeatExtXKey)
      }

      override fun repeatExtXKey(repeatExtXKey: IResolvable) {
        cdkBuilder.repeatExtXKey(repeatExtXKey.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5423d98286d792acaf6af6c310486c0d09986786ce611d9d72b1ccff1af2a3a")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty,
    ) : HlsManifestProperty {
      override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      override fun manifestName(): String? = unwrap(this).getManifestName()

      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      override fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty):
          HlsManifestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DashManifestProperty {
    public fun manifestLayout(): String? = unwrap(this).getManifestLayout()

    public fun manifestName(): String? = unwrap(this).getManifestName()

    public fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

    public fun profile(): String? = unwrap(this).getProfile()

    public fun scteMarkersSource(): String? = unwrap(this).getScteMarkersSource()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    public interface Builder {
      public fun manifestLayout(manifestLayout: String)

      public fun manifestName(manifestName: String)

      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number)

      public fun profile(profile: String)

      public fun scteMarkersSource(scteMarkersSource: String)

      public fun streamSelection(streamSelection: IResolvable)

      public fun streamSelection(streamSelection: StreamSelectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88f80b902f77cd6785cc6082f0110d0d285608901dedbd1cc0b33e23ca7c8f0f")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty.builder()

      override fun manifestLayout(manifestLayout: String) {
        cdkBuilder.manifestLayout(manifestLayout)
      }

      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      override fun scteMarkersSource(scteMarkersSource: String) {
        cdkBuilder.scteMarkersSource(scteMarkersSource)
      }

      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88f80b902f77cd6785cc6082f0110d0d285608901dedbd1cc0b33e23ca7c8f0f")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty,
    ) : DashManifestProperty {
      override fun manifestLayout(): String? = unwrap(this).getManifestLayout()

      override fun manifestName(): String? = unwrap(this).getManifestName()

      override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      override fun profile(): String? = unwrap(this).getProfile()

      override fun scteMarkersSource(): String? = unwrap(this).getScteMarkersSource()

      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty):
          DashManifestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpekeKeyProviderProperty {
    public fun encryptionContractConfiguration(): Any? =
        unwrap(this).getEncryptionContractConfiguration()

    public fun roleArn(): String

    public fun systemIds(): List<String>

    public fun url(): String

    public interface Builder {
      public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable)

      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1cece6a6287095e5b7116dfc977999366ec718dc409e810d2572e22ade2d54f8")
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun systemIds(systemIds: List<String>)

      public fun systemIds(vararg systemIds: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty.builder()

      override fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable::unwrap))
      }

      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1cece6a6287095e5b7116dfc977999366ec718dc409e810d2572e22ade2d54f8")
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit):
          Unit =
          encryptionContractConfiguration(EncryptionContractConfigurationProperty(encryptionContractConfiguration))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun systemIds(systemIds: List<String>) {
        cdkBuilder.systemIds(systemIds)
      }

      override fun systemIds(vararg systemIds: String): Unit = systemIds(systemIds.toList())

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty,
    ) : SpekeKeyProviderProperty {
      override fun encryptionContractConfiguration(): Any? =
          unwrap(this).getEncryptionContractConfiguration()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun systemIds(): List<String> = unwrap(this).getSystemIds()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty.builder()

      override fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
      }

      override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty):
          EncryptionContractConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionContractConfigurationProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsPackageProperty {
    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun hlsManifests(): Any

    public fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()

    public interface Builder {
      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: HlsEncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8af0b455d3b7acc944f9336ee53145c04998f1b6a118ef542fc1f7e384f5443")
      public fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit)

      public fun hlsManifests(hlsManifests: IResolvable)

      public fun hlsManifests(hlsManifests: List<Any>)

      public fun hlsManifests(vararg hlsManifests: Any)

      public fun includeDvbSubtitles(includeDvbSubtitles: Boolean)

      public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean)

      public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty.builder()

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: HlsEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(HlsEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8af0b455d3b7acc944f9336ee53145c04998f1b6a118ef542fc1f7e384f5443")
      override fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(HlsEncryptionProperty(encryption))

      override fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
      }

      override fun hlsManifests(hlsManifests: List<Any>) {
        cdkBuilder.hlsManifests(hlsManifests)
      }

      override fun hlsManifests(vararg hlsManifests: Any): Unit =
          hlsManifests(hlsManifests.toList())

      override fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
      }

      override fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles.let(IResolvable::unwrap))
      }

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      override fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
      }

      override fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty,
    ) : HlsPackageProperty {
      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun hlsManifests(): Any = unwrap(this).getHlsManifests()

      override fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      override fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty):
          HlsPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MssManifestProperty {
    public fun manifestName(): String? = unwrap(this).getManifestName()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    public interface Builder {
      public fun manifestName(manifestName: String)

      public fun streamSelection(streamSelection: IResolvable)

      public fun streamSelection(streamSelection: StreamSelectionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753f0eb82d5885d5e439e15010c47c7bda667951b874abaf1fec98f40a2c03dc")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty.builder()

      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753f0eb82d5885d5e439e15010c47c7bda667951b874abaf1fec98f40a2c03dc")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty,
    ) : MssManifestProperty {
      override fun manifestName(): String? = unwrap(this).getManifestName()

      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MssManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty):
          MssManifestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MssEncryptionProperty {
    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eb5bbe084066bbbb590c3d3041bfd5ea1e2d9ba26bd6982a194932eb2024eef")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty.builder()

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eb5bbe084066bbbb590c3d3041bfd5ea1e2d9ba26bd6982a194932eb2024eef")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty,
    ) : MssEncryptionProperty {
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MssEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty):
          MssEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CmafPackageProperty {
    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun hlsManifests(): Any

    public fun includeEncoderConfigurationInSegments(): Any? =
        unwrap(this).getIncludeEncoderConfigurationInSegments()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public interface Builder {
      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: CmafEncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25ad786ab44d860064f55c2d4bc77cc4055ca728bfa14b903c798a4b376fe489")
      public fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit)

      public fun hlsManifests(hlsManifests: IResolvable)

      public fun hlsManifests(hlsManifests: List<Any>)

      public fun hlsManifests(vararg hlsManifests: Any)

      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean)

      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty.builder()

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: CmafEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(CmafEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25ad786ab44d860064f55c2d4bc77cc4055ca728bfa14b903c798a4b376fe489")
      override fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(CmafEncryptionProperty(encryption))

      override fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
      }

      override fun hlsManifests(hlsManifests: List<Any>) {
        cdkBuilder.hlsManifests(hlsManifests)
      }

      override fun hlsManifests(vararg hlsManifests: Any): Unit =
          hlsManifests(hlsManifests.toList())

      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
      }

      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments.let(IResolvable::unwrap))
      }

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty,
    ) : CmafPackageProperty {
      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun hlsManifests(): Any = unwrap(this).getHlsManifests()

      override fun includeEncoderConfigurationInSegments(): Any? =
          unwrap(this).getIncludeEncoderConfigurationInSegments()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CmafPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty):
          CmafPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
