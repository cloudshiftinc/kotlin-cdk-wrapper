package io.cloudshiftdev.awscdk.services.mediatailor

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPlaybackConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun adDecisionServerUrl(): String = unwrap(this).getAdDecisionServerUrl()

  public open fun adDecisionServerUrl(`value`: String) {
    unwrap(this).setAdDecisionServerUrl(`value`)
  }

  public open fun attrDashConfigurationManifestEndpointPrefix(): String =
      unwrap(this).getAttrDashConfigurationManifestEndpointPrefix()

  public open fun attrHlsConfigurationManifestEndpointPrefix(): String =
      unwrap(this).getAttrHlsConfigurationManifestEndpointPrefix()

  public open fun attrPlaybackConfigurationArn(): String =
      unwrap(this).getAttrPlaybackConfigurationArn()

  public open fun attrPlaybackEndpointPrefix(): String =
      unwrap(this).getAttrPlaybackEndpointPrefix()

  public open fun attrSessionInitializationEndpointPrefix(): String =
      unwrap(this).getAttrSessionInitializationEndpointPrefix()

  public open fun availSuppression(): Any? = unwrap(this).getAvailSuppression()

  public open fun availSuppression(`value`: IResolvable) {
    unwrap(this).setAvailSuppression(`value`.let(IResolvable::unwrap))
  }

  public open fun availSuppression(`value`: AvailSuppressionProperty) {
    unwrap(this).setAvailSuppression(`value`.let(AvailSuppressionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0722650ed841e5873f8055a23de5d9e8f70b25b0fb992a4c10f4b5f4c88910ad")
  public open fun availSuppression(`value`: AvailSuppressionProperty.Builder.() -> Unit): Unit =
      availSuppression(AvailSuppressionProperty(`value`))

  public open fun bumper(): Any? = unwrap(this).getBumper()

  public open fun bumper(`value`: IResolvable) {
    unwrap(this).setBumper(`value`.let(IResolvable::unwrap))
  }

  public open fun bumper(`value`: BumperProperty) {
    unwrap(this).setBumper(`value`.let(BumperProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e446cdeb96d372745cb057fa05e69cb985c66ff86783a7a9538e0f3de9ec01b9")
  public open fun bumper(`value`: BumperProperty.Builder.() -> Unit): Unit =
      bumper(BumperProperty(`value`))

  public open fun cdnConfiguration(): Any? = unwrap(this).getCdnConfiguration()

  public open fun cdnConfiguration(`value`: IResolvable) {
    unwrap(this).setCdnConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun cdnConfiguration(`value`: CdnConfigurationProperty) {
    unwrap(this).setCdnConfiguration(`value`.let(CdnConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("318c65bbcbf6cc022364e545d1f072f30866f39c9ff5813e031ff2091c20c722")
  public open fun cdnConfiguration(`value`: CdnConfigurationProperty.Builder.() -> Unit): Unit =
      cdnConfiguration(CdnConfigurationProperty(`value`))

  public open fun configurationAliases(): Any? = unwrap(this).getConfigurationAliases()

  public open fun configurationAliases(`value`: IResolvable) {
    unwrap(this).setConfigurationAliases(`value`.let(IResolvable::unwrap))
  }

  public open fun configurationAliases(`this`: Map<String, Any>) {
    unwrap(this).setConfigurationAliases(`this`)
  }

  public open fun dashConfiguration(): Any? = unwrap(this).getDashConfiguration()

  public open fun dashConfiguration(`value`: IResolvable) {
    unwrap(this).setDashConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun dashConfiguration(`value`: DashConfigurationProperty) {
    unwrap(this).setDashConfiguration(`value`.let(DashConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f55999a898fbdbc05716b64f8bab8c0a0c1881e4009ca03e87b678d241a46bd2")
  public open fun dashConfiguration(`value`: DashConfigurationProperty.Builder.() -> Unit): Unit =
      dashConfiguration(DashConfigurationProperty(`value`))

  public open fun hlsConfiguration(): Any? = unwrap(this).getHlsConfiguration()

  public open fun hlsConfiguration(`value`: IResolvable) {
    unwrap(this).setHlsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun hlsConfiguration(`value`: HlsConfigurationProperty) {
    unwrap(this).setHlsConfiguration(`value`.let(HlsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1436f9669210cdede04e252efc34768cbd7663a3eaac3fec573f53570ba4e0ab")
  public open fun hlsConfiguration(`value`: HlsConfigurationProperty.Builder.() -> Unit): Unit =
      hlsConfiguration(HlsConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun livePreRollConfiguration(): Any? = unwrap(this).getLivePreRollConfiguration()

  public open fun livePreRollConfiguration(`value`: IResolvable) {
    unwrap(this).setLivePreRollConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun livePreRollConfiguration(`value`: LivePreRollConfigurationProperty) {
    unwrap(this).setLivePreRollConfiguration(`value`.let(LivePreRollConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0db95b6706374dbec6d68c46cf9a9408d732d7dc66026fc2ed75561b78f5011e")
  public open
      fun livePreRollConfiguration(`value`: LivePreRollConfigurationProperty.Builder.() -> Unit):
      Unit = livePreRollConfiguration(LivePreRollConfigurationProperty(`value`))

  public open fun manifestProcessingRules(): Any? = unwrap(this).getManifestProcessingRules()

  public open fun manifestProcessingRules(`value`: IResolvable) {
    unwrap(this).setManifestProcessingRules(`value`.let(IResolvable::unwrap))
  }

  public open fun manifestProcessingRules(`value`: ManifestProcessingRulesProperty) {
    unwrap(this).setManifestProcessingRules(`value`.let(ManifestProcessingRulesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("520c3725b546ad1bc5f63986b44d4cde1095720d9f0da56ad8b25859a64e80a5")
  public open
      fun manifestProcessingRules(`value`: ManifestProcessingRulesProperty.Builder.() -> Unit): Unit
      = manifestProcessingRules(ManifestProcessingRulesProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun personalizationThresholdSeconds(): Number? =
      unwrap(this).getPersonalizationThresholdSeconds()

  public open fun personalizationThresholdSeconds(`value`: Number) {
    unwrap(this).setPersonalizationThresholdSeconds(`value`)
  }

  public open fun slateAdUrl(): String? = unwrap(this).getSlateAdUrl()

  public open fun slateAdUrl(`value`: String) {
    unwrap(this).setSlateAdUrl(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun transcodeProfileName(): String? = unwrap(this).getTranscodeProfileName()

  public open fun transcodeProfileName(`value`: String) {
    unwrap(this).setTranscodeProfileName(`value`)
  }

  public open fun videoContentSourceUrl(): String = unwrap(this).getVideoContentSourceUrl()

  public open fun videoContentSourceUrl(`value`: String) {
    unwrap(this).setVideoContentSourceUrl(`value`)
  }

  public interface Builder {
    public fun adDecisionServerUrl(adDecisionServerUrl: String)

    public fun availSuppression(availSuppression: IResolvable)

    public fun availSuppression(availSuppression: AvailSuppressionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6924f99449990b6b0d5dd995c60cf2b6f1113dcda5bcf6c7259ebe0819a4567")
    public fun availSuppression(availSuppression: AvailSuppressionProperty.Builder.() -> Unit)

    public fun bumper(bumper: IResolvable)

    public fun bumper(bumper: BumperProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5452ff38542cc70684a10a1039519c9a104dc7f382774202e749c2829ff7448")
    public fun bumper(bumper: BumperProperty.Builder.() -> Unit)

    public fun cdnConfiguration(cdnConfiguration: IResolvable)

    public fun cdnConfiguration(cdnConfiguration: CdnConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0de38d0cd8cd9cf62650be13037818eec5e7b683f6549e8589f2a53dcb4a62d1")
    public fun cdnConfiguration(cdnConfiguration: CdnConfigurationProperty.Builder.() -> Unit)

    public fun configurationAliases(configurationAliases: IResolvable)

    public fun configurationAliases(configurationAliases: Map<String, Any>)

    public fun dashConfiguration(dashConfiguration: IResolvable)

    public fun dashConfiguration(dashConfiguration: DashConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9721fe66029a0ca3f322a6e86e4a46b6a19242ed6d826a69e69cdab00427a55f")
    public fun dashConfiguration(dashConfiguration: DashConfigurationProperty.Builder.() -> Unit)

    public fun hlsConfiguration(hlsConfiguration: IResolvable)

    public fun hlsConfiguration(hlsConfiguration: HlsConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5513dff53429d8e9883e964e7e6c98d600e1f0d5cc869ff26f4eec8a3d6e689b")
    public fun hlsConfiguration(hlsConfiguration: HlsConfigurationProperty.Builder.() -> Unit)

    public fun livePreRollConfiguration(livePreRollConfiguration: IResolvable)

    public fun livePreRollConfiguration(livePreRollConfiguration: LivePreRollConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f82feb9340165b402df0727d1542a0723dda6732cb73a8fadfd92f8aafde4ad8")
    public
        fun livePreRollConfiguration(livePreRollConfiguration: LivePreRollConfigurationProperty.Builder.() -> Unit)

    public fun manifestProcessingRules(manifestProcessingRules: IResolvable)

    public fun manifestProcessingRules(manifestProcessingRules: ManifestProcessingRulesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44a04b713c6699cdab0097b7bfa1aa5622cbb24a44a3a812263d130b49d05e34")
    public
        fun manifestProcessingRules(manifestProcessingRules: ManifestProcessingRulesProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number)

    public fun slateAdUrl(slateAdUrl: String)

    public fun tags(tags: List<CfnTag>)

    public fun transcodeProfileName(transcodeProfileName: String)

    public fun videoContentSourceUrl(videoContentSourceUrl: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.Builder =
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.Builder.create(scope,
        id)

    override fun adDecisionServerUrl(adDecisionServerUrl: String) {
      cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
    }

    override fun availSuppression(availSuppression: IResolvable) {
      cdkBuilder.availSuppression(availSuppression.let(IResolvable::unwrap))
    }

    override fun availSuppression(availSuppression: AvailSuppressionProperty) {
      cdkBuilder.availSuppression(availSuppression.let(AvailSuppressionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6924f99449990b6b0d5dd995c60cf2b6f1113dcda5bcf6c7259ebe0819a4567")
    override fun availSuppression(availSuppression: AvailSuppressionProperty.Builder.() -> Unit):
        Unit = availSuppression(AvailSuppressionProperty(availSuppression))

    override fun bumper(bumper: IResolvable) {
      cdkBuilder.bumper(bumper.let(IResolvable::unwrap))
    }

    override fun bumper(bumper: BumperProperty) {
      cdkBuilder.bumper(bumper.let(BumperProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5452ff38542cc70684a10a1039519c9a104dc7f382774202e749c2829ff7448")
    override fun bumper(bumper: BumperProperty.Builder.() -> Unit): Unit =
        bumper(BumperProperty(bumper))

    override fun cdnConfiguration(cdnConfiguration: IResolvable) {
      cdkBuilder.cdnConfiguration(cdnConfiguration.let(IResolvable::unwrap))
    }

    override fun cdnConfiguration(cdnConfiguration: CdnConfigurationProperty) {
      cdkBuilder.cdnConfiguration(cdnConfiguration.let(CdnConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0de38d0cd8cd9cf62650be13037818eec5e7b683f6549e8589f2a53dcb4a62d1")
    override fun cdnConfiguration(cdnConfiguration: CdnConfigurationProperty.Builder.() -> Unit):
        Unit = cdnConfiguration(CdnConfigurationProperty(cdnConfiguration))

    override fun configurationAliases(configurationAliases: IResolvable) {
      cdkBuilder.configurationAliases(configurationAliases.let(IResolvable::unwrap))
    }

    override fun configurationAliases(configurationAliases: Map<String, Any>) {
      cdkBuilder.configurationAliases(configurationAliases)
    }

    override fun dashConfiguration(dashConfiguration: IResolvable) {
      cdkBuilder.dashConfiguration(dashConfiguration.let(IResolvable::unwrap))
    }

    override fun dashConfiguration(dashConfiguration: DashConfigurationProperty) {
      cdkBuilder.dashConfiguration(dashConfiguration.let(DashConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9721fe66029a0ca3f322a6e86e4a46b6a19242ed6d826a69e69cdab00427a55f")
    override fun dashConfiguration(dashConfiguration: DashConfigurationProperty.Builder.() -> Unit):
        Unit = dashConfiguration(DashConfigurationProperty(dashConfiguration))

    override fun hlsConfiguration(hlsConfiguration: IResolvable) {
      cdkBuilder.hlsConfiguration(hlsConfiguration.let(IResolvable::unwrap))
    }

    override fun hlsConfiguration(hlsConfiguration: HlsConfigurationProperty) {
      cdkBuilder.hlsConfiguration(hlsConfiguration.let(HlsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5513dff53429d8e9883e964e7e6c98d600e1f0d5cc869ff26f4eec8a3d6e689b")
    override fun hlsConfiguration(hlsConfiguration: HlsConfigurationProperty.Builder.() -> Unit):
        Unit = hlsConfiguration(HlsConfigurationProperty(hlsConfiguration))

    override fun livePreRollConfiguration(livePreRollConfiguration: IResolvable) {
      cdkBuilder.livePreRollConfiguration(livePreRollConfiguration.let(IResolvable::unwrap))
    }

    override
        fun livePreRollConfiguration(livePreRollConfiguration: LivePreRollConfigurationProperty) {
      cdkBuilder.livePreRollConfiguration(livePreRollConfiguration.let(LivePreRollConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f82feb9340165b402df0727d1542a0723dda6732cb73a8fadfd92f8aafde4ad8")
    override
        fun livePreRollConfiguration(livePreRollConfiguration: LivePreRollConfigurationProperty.Builder.() -> Unit):
        Unit = livePreRollConfiguration(LivePreRollConfigurationProperty(livePreRollConfiguration))

    override fun manifestProcessingRules(manifestProcessingRules: IResolvable) {
      cdkBuilder.manifestProcessingRules(manifestProcessingRules.let(IResolvable::unwrap))
    }

    override fun manifestProcessingRules(manifestProcessingRules: ManifestProcessingRulesProperty) {
      cdkBuilder.manifestProcessingRules(manifestProcessingRules.let(ManifestProcessingRulesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44a04b713c6699cdab0097b7bfa1aa5622cbb24a44a3a812263d130b49d05e34")
    override
        fun manifestProcessingRules(manifestProcessingRules: ManifestProcessingRulesProperty.Builder.() -> Unit):
        Unit = manifestProcessingRules(ManifestProcessingRulesProperty(manifestProcessingRules))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number) {
      cdkBuilder.personalizationThresholdSeconds(personalizationThresholdSeconds)
    }

    override fun slateAdUrl(slateAdUrl: String) {
      cdkBuilder.slateAdUrl(slateAdUrl)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun transcodeProfileName(transcodeProfileName: String) {
      cdkBuilder.transcodeProfileName(transcodeProfileName)
    }

    override fun videoContentSourceUrl(videoContentSourceUrl: String) {
      cdkBuilder.videoContentSourceUrl(videoContentSourceUrl)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlaybackConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlaybackConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration):
        CfnPlaybackConfiguration = CfnPlaybackConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackConfiguration):
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration = wrapped.cdkObject
  }

  public interface CdnConfigurationProperty {
    public fun adSegmentUrlPrefix(): String? = unwrap(this).getAdSegmentUrlPrefix()

    public fun contentSegmentUrlPrefix(): String? = unwrap(this).getContentSegmentUrlPrefix()

    public interface Builder {
      public fun adSegmentUrlPrefix(adSegmentUrlPrefix: String)

      public fun contentSegmentUrlPrefix(contentSegmentUrlPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.CdnConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.CdnConfigurationProperty.builder()

      override fun adSegmentUrlPrefix(adSegmentUrlPrefix: String) {
        cdkBuilder.adSegmentUrlPrefix(adSegmentUrlPrefix)
      }

      override fun contentSegmentUrlPrefix(contentSegmentUrlPrefix: String) {
        cdkBuilder.contentSegmentUrlPrefix(contentSegmentUrlPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.CdnConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.CdnConfigurationProperty,
    ) : CdnConfigurationProperty {
      override fun adSegmentUrlPrefix(): String? = unwrap(this).getAdSegmentUrlPrefix()

      override fun contentSegmentUrlPrefix(): String? = unwrap(this).getContentSegmentUrlPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CdnConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.CdnConfigurationProperty):
          CdnConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CdnConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.CdnConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LivePreRollConfigurationProperty {
    public fun adDecisionServerUrl(): String? = unwrap(this).getAdDecisionServerUrl()

    public fun maxDurationSeconds(): Number? = unwrap(this).getMaxDurationSeconds()

    public interface Builder {
      public fun adDecisionServerUrl(adDecisionServerUrl: String)

      public fun maxDurationSeconds(maxDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.LivePreRollConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.LivePreRollConfigurationProperty.builder()

      override fun adDecisionServerUrl(adDecisionServerUrl: String) {
        cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
      }

      override fun maxDurationSeconds(maxDurationSeconds: Number) {
        cdkBuilder.maxDurationSeconds(maxDurationSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.LivePreRollConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.LivePreRollConfigurationProperty,
    ) : LivePreRollConfigurationProperty {
      override fun adDecisionServerUrl(): String? = unwrap(this).getAdDecisionServerUrl()

      override fun maxDurationSeconds(): Number? = unwrap(this).getMaxDurationSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LivePreRollConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.LivePreRollConfigurationProperty):
          LivePreRollConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LivePreRollConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.LivePreRollConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DashConfigurationProperty {
    public fun manifestEndpointPrefix(): String? = unwrap(this).getManifestEndpointPrefix()

    public fun mpdLocation(): String? = unwrap(this).getMpdLocation()

    public fun originManifestType(): String? = unwrap(this).getOriginManifestType()

    public interface Builder {
      public fun manifestEndpointPrefix(manifestEndpointPrefix: String)

      public fun mpdLocation(mpdLocation: String)

      public fun originManifestType(originManifestType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.DashConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.DashConfigurationProperty.builder()

      override fun manifestEndpointPrefix(manifestEndpointPrefix: String) {
        cdkBuilder.manifestEndpointPrefix(manifestEndpointPrefix)
      }

      override fun mpdLocation(mpdLocation: String) {
        cdkBuilder.mpdLocation(mpdLocation)
      }

      override fun originManifestType(originManifestType: String) {
        cdkBuilder.originManifestType(originManifestType)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.DashConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.DashConfigurationProperty,
    ) : DashConfigurationProperty {
      override fun manifestEndpointPrefix(): String? = unwrap(this).getManifestEndpointPrefix()

      override fun mpdLocation(): String? = unwrap(this).getMpdLocation()

      override fun originManifestType(): String? = unwrap(this).getOriginManifestType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.DashConfigurationProperty):
          DashConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.DashConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsConfigurationProperty {
    public fun manifestEndpointPrefix(): String? = unwrap(this).getManifestEndpointPrefix()

    public interface Builder {
      public fun manifestEndpointPrefix(manifestEndpointPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.HlsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.HlsConfigurationProperty.builder()

      override fun manifestEndpointPrefix(manifestEndpointPrefix: String) {
        cdkBuilder.manifestEndpointPrefix(manifestEndpointPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.HlsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.HlsConfigurationProperty,
    ) : HlsConfigurationProperty {
      override fun manifestEndpointPrefix(): String? = unwrap(this).getManifestEndpointPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.HlsConfigurationProperty):
          HlsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.HlsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BumperProperty {
    public fun endUrl(): String? = unwrap(this).getEndUrl()

    public fun startUrl(): String? = unwrap(this).getStartUrl()

    public interface Builder {
      public fun endUrl(endUrl: String)

      public fun startUrl(startUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.BumperProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.BumperProperty.builder()

      override fun endUrl(endUrl: String) {
        cdkBuilder.endUrl(endUrl)
      }

      override fun startUrl(startUrl: String) {
        cdkBuilder.startUrl(startUrl)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.BumperProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.BumperProperty,
    ) : BumperProperty {
      override fun endUrl(): String? = unwrap(this).getEndUrl()

      override fun startUrl(): String? = unwrap(this).getStartUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BumperProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.BumperProperty):
          BumperProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BumperProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.BumperProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AvailSuppressionProperty {
    public fun mode(): String? = unwrap(this).getMode()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun mode(mode: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AvailSuppressionProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AvailSuppressionProperty.builder()

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AvailSuppressionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AvailSuppressionProperty,
    ) : AvailSuppressionProperty {
      override fun mode(): String? = unwrap(this).getMode()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AvailSuppressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AvailSuppressionProperty):
          AvailSuppressionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AvailSuppressionProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AvailSuppressionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ManifestProcessingRulesProperty {
    public fun adMarkerPassthrough(): Any? = unwrap(this).getAdMarkerPassthrough()

    public interface Builder {
      public fun adMarkerPassthrough(adMarkerPassthrough: IResolvable)

      public fun adMarkerPassthrough(adMarkerPassthrough: AdMarkerPassthroughProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31a5ddef7bb8163764922d8d7fbbdd01c9762270611101fcd57f0a70c9e385be")
      public
          fun adMarkerPassthrough(adMarkerPassthrough: AdMarkerPassthroughProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.ManifestProcessingRulesProperty.builder()

      override fun adMarkerPassthrough(adMarkerPassthrough: IResolvable) {
        cdkBuilder.adMarkerPassthrough(adMarkerPassthrough.let(IResolvable::unwrap))
      }

      override fun adMarkerPassthrough(adMarkerPassthrough: AdMarkerPassthroughProperty) {
        cdkBuilder.adMarkerPassthrough(adMarkerPassthrough.let(AdMarkerPassthroughProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31a5ddef7bb8163764922d8d7fbbdd01c9762270611101fcd57f0a70c9e385be")
      override
          fun adMarkerPassthrough(adMarkerPassthrough: AdMarkerPassthroughProperty.Builder.() -> Unit):
          Unit = adMarkerPassthrough(AdMarkerPassthroughProperty(adMarkerPassthrough))

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.ManifestProcessingRulesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.ManifestProcessingRulesProperty,
    ) : ManifestProcessingRulesProperty {
      override fun adMarkerPassthrough(): Any? = unwrap(this).getAdMarkerPassthrough()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestProcessingRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.ManifestProcessingRulesProperty):
          ManifestProcessingRulesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestProcessingRulesProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.ManifestProcessingRulesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AdMarkerPassthroughProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AdMarkerPassthroughProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AdMarkerPassthroughProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AdMarkerPassthroughProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AdMarkerPassthroughProperty,
    ) : AdMarkerPassthroughProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AdMarkerPassthroughProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AdMarkerPassthroughProperty):
          AdMarkerPassthroughProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdMarkerPassthroughProperty):
          software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration.AdMarkerPassthroughProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
