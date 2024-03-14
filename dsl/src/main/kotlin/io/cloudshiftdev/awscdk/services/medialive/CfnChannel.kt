package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
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

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.medialive.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrInputs(): List<String> = unwrap(this).getAttrInputs() ?: emptyList()

  public open fun cdiInputSpecification(): Any? = unwrap(this).getCdiInputSpecification()

  public open fun cdiInputSpecification(`value`: IResolvable) {
    unwrap(this).setCdiInputSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun cdiInputSpecification(`value`: CdiInputSpecificationProperty) {
    unwrap(this).setCdiInputSpecification(`value`.let(CdiInputSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fcfa51c6f16e1e1908836e6f720594b5773c3e8696abdb37d830817755b611a5")
  public open fun cdiInputSpecification(`value`: CdiInputSpecificationProperty.Builder.() -> Unit):
      Unit = cdiInputSpecification(CdiInputSpecificationProperty(`value`))

  public open fun channelClass(): String? = unwrap(this).getChannelClass()

  public open fun channelClass(`value`: String) {
    unwrap(this).setChannelClass(`value`)
  }

  public open fun destinations(): Any? = unwrap(this).getDestinations()

  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable::unwrap))
  }

  public open fun destinations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinations(__idx_ac66f0)
  }

  public open fun encoderSettings(): Any? = unwrap(this).getEncoderSettings()

  public open fun encoderSettings(`value`: IResolvable) {
    unwrap(this).setEncoderSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun encoderSettings(`value`: EncoderSettingsProperty) {
    unwrap(this).setEncoderSettings(`value`.let(EncoderSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2335d04014caea3733e5da5f058cd1062c748b4b191b6dbd239d8f37104b0215")
  public open fun encoderSettings(`value`: EncoderSettingsProperty.Builder.() -> Unit): Unit =
      encoderSettings(EncoderSettingsProperty(`value`))

  public open fun inputAttachments(): Any? = unwrap(this).getInputAttachments()

  public open fun inputAttachments(`value`: IResolvable) {
    unwrap(this).setInputAttachments(`value`.let(IResolvable::unwrap))
  }

  public open fun inputAttachments(__idx_ac66f0: List<Any>) {
    unwrap(this).setInputAttachments(__idx_ac66f0)
  }

  public open fun inputSpecification(): Any? = unwrap(this).getInputSpecification()

  public open fun inputSpecification(`value`: IResolvable) {
    unwrap(this).setInputSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun inputSpecification(`value`: InputSpecificationProperty) {
    unwrap(this).setInputSpecification(`value`.let(InputSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a8d9f8cca55bc1dd393479d05297434556a561310860bac462ec6311e9a355e")
  public open fun inputSpecification(`value`: InputSpecificationProperty.Builder.() -> Unit): Unit =
      inputSpecification(InputSpecificationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logLevel(): String? = unwrap(this).getLogLevel()

  public open fun logLevel(`value`: String) {
    unwrap(this).setLogLevel(`value`)
  }

  public open fun maintenance(): Any? = unwrap(this).getMaintenance()

  public open fun maintenance(`value`: IResolvable) {
    unwrap(this).setMaintenance(`value`.let(IResolvable::unwrap))
  }

  public open fun maintenance(`value`: MaintenanceCreateSettingsProperty) {
    unwrap(this).setMaintenance(`value`.let(MaintenanceCreateSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce29c1528b66103c0458cf59808c08ec027e663dbd553aab7372f24b9f309938")
  public open fun maintenance(`value`: MaintenanceCreateSettingsProperty.Builder.() -> Unit): Unit =
      maintenance(MaintenanceCreateSettingsProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun vpc(): Any? = unwrap(this).getVpc()

  public open fun vpc(`value`: IResolvable) {
    unwrap(this).setVpc(`value`.let(IResolvable::unwrap))
  }

  public open fun vpc(`value`: VpcOutputSettingsProperty) {
    unwrap(this).setVpc(`value`.let(VpcOutputSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc420a6da3f6e928883ae18d1fa17181cf61dd929ff4b01bb05a37adf7bea77d")
  public open fun vpc(`value`: VpcOutputSettingsProperty.Builder.() -> Unit): Unit =
      vpc(VpcOutputSettingsProperty(`value`))

  public interface Builder {
    public fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
    }

    public fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aacee8ea7d493868931951676e6a7998b047d4dba5db835e263f5fe2dc77d6ce")
    public
        fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty.Builder.() -> Unit) {
    }

    public fun channelClass(channelClass: String) {
    }

    public fun destinations(destinations: IResolvable) {
    }

    public fun destinations(destinations: List<Any>) {
    }

    public fun encoderSettings(encoderSettings: IResolvable) {
    }

    public fun encoderSettings(encoderSettings: EncoderSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2314ed8c6250a2bf5498955db0ad5f303fc86059c73255fa29b50f7f96d35b9")
    public fun encoderSettings(encoderSettings: EncoderSettingsProperty.Builder.() -> Unit) {
    }

    public fun inputAttachments(inputAttachments: IResolvable) {
    }

    public fun inputAttachments(inputAttachments: List<Any>) {
    }

    public fun inputSpecification(inputSpecification: IResolvable) {
    }

    public fun inputSpecification(inputSpecification: InputSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a09da5b93c8531e73bbabc998e2e89eced34c8bc3c128cced66fb015c0605e7")
    public
        fun inputSpecification(inputSpecification: InputSpecificationProperty.Builder.() -> Unit) {
    }

    public fun logLevel(logLevel: String) {
    }

    public fun maintenance(maintenance: IResolvable) {
    }

    public fun maintenance(maintenance: MaintenanceCreateSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e659608119eb682e4d6abbf1c66ff8f58f4fa7f39e5d6c1f9971d6b0504f15")
    public fun maintenance(maintenance: MaintenanceCreateSettingsProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun tags(tags: Any) {
    }

    public fun vpc(vpc: IResolvable) {
    }

    public fun vpc(vpc: VpcOutputSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91b7209b4e48950a8454d6c55ff29b62f8b84b5629568dc42e614dcf2ced1b47")
    public fun vpc(vpc: VpcOutputSettingsProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnChannel.Builder =
        software.amazon.awscdk.services.medialive.CfnChannel.Builder.create(scope, id)

    public override fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(IResolvable::unwrap))
    }

    public override
        fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(CdiInputSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aacee8ea7d493868931951676e6a7998b047d4dba5db835e263f5fe2dc77d6ce")
    public override
        fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty.Builder.() -> Unit):
        Unit = cdiInputSpecification(CdiInputSpecificationProperty(cdiInputSpecification))

    public override fun channelClass(channelClass: String) {
      cdkBuilder.channelClass(channelClass)
    }

    public override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    public override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    public override fun encoderSettings(encoderSettings: IResolvable) {
      cdkBuilder.encoderSettings(encoderSettings.let(IResolvable::unwrap))
    }

    public override fun encoderSettings(encoderSettings: EncoderSettingsProperty) {
      cdkBuilder.encoderSettings(encoderSettings.let(EncoderSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2314ed8c6250a2bf5498955db0ad5f303fc86059c73255fa29b50f7f96d35b9")
    public override
        fun encoderSettings(encoderSettings: EncoderSettingsProperty.Builder.() -> Unit): Unit =
        encoderSettings(EncoderSettingsProperty(encoderSettings))

    public override fun inputAttachments(inputAttachments: IResolvable) {
      cdkBuilder.inputAttachments(inputAttachments.let(IResolvable::unwrap))
    }

    public override fun inputAttachments(inputAttachments: List<Any>) {
      cdkBuilder.inputAttachments(inputAttachments)
    }

    public override fun inputSpecification(inputSpecification: IResolvable) {
      cdkBuilder.inputSpecification(inputSpecification.let(IResolvable::unwrap))
    }

    public override fun inputSpecification(inputSpecification: InputSpecificationProperty) {
      cdkBuilder.inputSpecification(inputSpecification.let(InputSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a09da5b93c8531e73bbabc998e2e89eced34c8bc3c128cced66fb015c0605e7")
    public override
        fun inputSpecification(inputSpecification: InputSpecificationProperty.Builder.() -> Unit):
        Unit = inputSpecification(InputSpecificationProperty(inputSpecification))

    public override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    public override fun maintenance(maintenance: IResolvable) {
      cdkBuilder.maintenance(maintenance.let(IResolvable::unwrap))
    }

    public override fun maintenance(maintenance: MaintenanceCreateSettingsProperty) {
      cdkBuilder.maintenance(maintenance.let(MaintenanceCreateSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e659608119eb682e4d6abbf1c66ff8f58f4fa7f39e5d6c1f9971d6b0504f15")
    public override
        fun maintenance(maintenance: MaintenanceCreateSettingsProperty.Builder.() -> Unit): Unit =
        maintenance(MaintenanceCreateSettingsProperty(maintenance))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
    }

    public override fun vpc(vpc: VpcOutputSettingsProperty) {
      cdkBuilder.vpc(vpc.let(VpcOutputSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91b7209b4e48950a8454d6c55ff29b62f8b84b5629568dc42e614dcf2ced1b47")
    public override fun vpc(vpc: VpcOutputSettingsProperty.Builder.() -> Unit): Unit =
        vpc(VpcOutputSettingsProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel): CfnChannel =
        CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel): software.amazon.awscdk.services.medialive.CfnChannel =
        wrapped.cdkObject
  }

  public interface TemporalFilterSettingsProperty {
    public fun postFilterSharpening(): String? = unwrap(this).getPostFilterSharpening()

    public fun strength(): String? = unwrap(this).getStrength()

    public interface Builder {
      public fun postFilterSharpening(postFilterSharpening: String) {
      }

      public fun strength(strength: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty.builder()

      public override fun postFilterSharpening(postFilterSharpening: String) {
        cdkBuilder.postFilterSharpening(postFilterSharpening)
      }

      public override fun strength(strength: String) {
        cdkBuilder.strength(strength)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty,
    ) : TemporalFilterSettingsProperty {
      public override fun postFilterSharpening(): String? = unwrap(this).getPostFilterSharpening()

      public override fun strength(): String? = unwrap(this).getStrength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemporalFilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty):
          TemporalFilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemporalFilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FailoverConditionSettingsProperty {
    public fun audioSilenceSettings(): Any? = unwrap(this).getAudioSilenceSettings()

    public fun inputLossSettings(): Any? = unwrap(this).getInputLossSettings()

    public fun videoBlackSettings(): Any? = unwrap(this).getVideoBlackSettings()

    public interface Builder {
      public fun audioSilenceSettings(audioSilenceSettings: IResolvable) {
      }

      public fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9a4622e27dc9a59db26568c5068f3dba4c1e90432ad8bcca7d47d9931e9c491")
      public
          fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty.Builder.() -> Unit) {
      }

      public fun inputLossSettings(inputLossSettings: IResolvable) {
      }

      public fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6873e8132f190fd34bd4925f124e8201c44e6a922b26129aa6dd8851e6cbf9")
      public
          fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty.Builder.() -> Unit) {
      }

      public fun videoBlackSettings(videoBlackSettings: IResolvable) {
      }

      public fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1eca88803bfaebe36bff25f3b31a2eaf4d314c39ac7d7449b32bd0edb9f7d2b")
      public
          fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty.builder()

      public override fun audioSilenceSettings(audioSilenceSettings: IResolvable) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings.let(IResolvable::unwrap))
      }

      public override
          fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings.let(AudioSilenceFailoverSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9a4622e27dc9a59db26568c5068f3dba4c1e90432ad8bcca7d47d9931e9c491")
      public override
          fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty.Builder.() -> Unit):
          Unit = audioSilenceSettings(AudioSilenceFailoverSettingsProperty(audioSilenceSettings))

      public override fun inputLossSettings(inputLossSettings: IResolvable) {
        cdkBuilder.inputLossSettings(inputLossSettings.let(IResolvable::unwrap))
      }

      public override fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty) {
        cdkBuilder.inputLossSettings(inputLossSettings.let(InputLossFailoverSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6873e8132f190fd34bd4925f124e8201c44e6a922b26129aa6dd8851e6cbf9")
      public override
          fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty.Builder.() -> Unit):
          Unit = inputLossSettings(InputLossFailoverSettingsProperty(inputLossSettings))

      public override fun videoBlackSettings(videoBlackSettings: IResolvable) {
        cdkBuilder.videoBlackSettings(videoBlackSettings.let(IResolvable::unwrap))
      }

      public override
          fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty) {
        cdkBuilder.videoBlackSettings(videoBlackSettings.let(VideoBlackFailoverSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1eca88803bfaebe36bff25f3b31a2eaf4d314c39ac7d7449b32bd0edb9f7d2b")
      public override
          fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty.Builder.() -> Unit):
          Unit = videoBlackSettings(VideoBlackFailoverSettingsProperty(videoBlackSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty,
    ) : FailoverConditionSettingsProperty {
      public override fun audioSilenceSettings(): Any? = unwrap(this).getAudioSilenceSettings()

      public override fun inputLossSettings(): Any? = unwrap(this).getInputLossSettings()

      public override fun videoBlackSettings(): Any? = unwrap(this).getVideoBlackSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FailoverConditionSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty):
          FailoverConditionSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConditionSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TtmlDestinationSettingsProperty {
    public fun styleControl(): String? = unwrap(this).getStyleControl()

    public interface Builder {
      public fun styleControl(styleControl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty.builder()

      public override fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty,
    ) : TtmlDestinationSettingsProperty {
      public override fun styleControl(): String? = unwrap(this).getStyleControl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TtmlDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty):
          TtmlDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TtmlDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MediaPackageOutputDestinationSettingsProperty {
    public fun channelId(): String? = unwrap(this).getChannelId()

    public interface Builder {
      public fun channelId(channelId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty.builder()

      public override fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty,
    ) : MediaPackageOutputDestinationSettingsProperty {
      public override fun channelId(): String? = unwrap(this).getChannelId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MediaPackageOutputDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty):
          MediaPackageOutputDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaPackageOutputDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncoderSettingsProperty {
    public fun audioDescriptions(): Any? = unwrap(this).getAudioDescriptions()

    public fun availBlanking(): Any? = unwrap(this).getAvailBlanking()

    public fun availConfiguration(): Any? = unwrap(this).getAvailConfiguration()

    public fun blackoutSlate(): Any? = unwrap(this).getBlackoutSlate()

    public fun captionDescriptions(): Any? = unwrap(this).getCaptionDescriptions()

    public fun colorCorrectionSettings(): Any? = unwrap(this).getColorCorrectionSettings()

    public fun featureActivations(): Any? = unwrap(this).getFeatureActivations()

    public fun globalConfiguration(): Any? = unwrap(this).getGlobalConfiguration()

    public fun motionGraphicsConfiguration(): Any? = unwrap(this).getMotionGraphicsConfiguration()

    public fun nielsenConfiguration(): Any? = unwrap(this).getNielsenConfiguration()

    public fun outputGroups(): Any? = unwrap(this).getOutputGroups()

    public fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()

    public fun timecodeConfig(): Any? = unwrap(this).getTimecodeConfig()

    public fun videoDescriptions(): Any? = unwrap(this).getVideoDescriptions()

    public interface Builder {
      public fun audioDescriptions(audioDescriptions: IResolvable) {
      }

      public fun audioDescriptions(audioDescriptions: List<Any>) {
      }

      public fun availBlanking(availBlanking: IResolvable) {
      }

      public fun availBlanking(availBlanking: AvailBlankingProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d1f256f38a2cfa8279cd0fef64f78c95b365482243a7b7e1f3ac7f35fad2717")
      public fun availBlanking(availBlanking: AvailBlankingProperty.Builder.() -> Unit) {
      }

      public fun availConfiguration(availConfiguration: IResolvable) {
      }

      public fun availConfiguration(availConfiguration: AvailConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de082af680ca2b39139d9ae193b95b1c5047108cdddfd07607477d5b9d306654")
      public
          fun availConfiguration(availConfiguration: AvailConfigurationProperty.Builder.() -> Unit) {
      }

      public fun blackoutSlate(blackoutSlate: IResolvable) {
      }

      public fun blackoutSlate(blackoutSlate: BlackoutSlateProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9baeed143c2abf51a92a53e595ac64742cdbbdb54c67813d0c50c872f07f546e")
      public fun blackoutSlate(blackoutSlate: BlackoutSlateProperty.Builder.() -> Unit) {
      }

      public fun captionDescriptions(captionDescriptions: IResolvable) {
      }

      public fun captionDescriptions(captionDescriptions: List<Any>) {
      }

      public fun colorCorrectionSettings(colorCorrectionSettings: IResolvable) {
      }

      public fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d7751059623d3453cd3088c55927f6982a5685e67f25fa6bdec7c47e63dc325")
      public
          fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty.Builder.() -> Unit) {
      }

      public fun featureActivations(featureActivations: IResolvable) {
      }

      public fun featureActivations(featureActivations: FeatureActivationsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("574c0d37abdb7d1723b40e15113029c9685786d9f41f9af44dd7b97796dcbe74")
      public
          fun featureActivations(featureActivations: FeatureActivationsProperty.Builder.() -> Unit) {
      }

      public fun globalConfiguration(globalConfiguration: IResolvable) {
      }

      public fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a27409ab5a4b184643ca0062ca649505ba38dde57b2436514d9adbc4af4d89cf")
      public
          fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty.Builder.() -> Unit) {
      }

      public fun motionGraphicsConfiguration(motionGraphicsConfiguration: IResolvable) {
      }

      public
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bce1eb9cf7b54224c18c75e8ca6dcf9dd3f59b0ca515e7422c8cc4cfcca96450")
      public
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty.Builder.() -> Unit) {
      }

      public fun nielsenConfiguration(nielsenConfiguration: IResolvable) {
      }

      public fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d84746321052a6870e72f4b238703d7f7ac248b4369058685ae9b74b3c12b4")
      public
          fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty.Builder.() -> Unit) {
      }

      public fun outputGroups(outputGroups: IResolvable) {
      }

      public fun outputGroups(outputGroups: List<Any>) {
      }

      public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
      }

      public fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8ceafe338ad83f8dc2749873cd585b9935c4b9a6cc703b6d9322f013ef1241e")
      public
          fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit) {
      }

      public fun timecodeConfig(timecodeConfig: IResolvable) {
      }

      public fun timecodeConfig(timecodeConfig: TimecodeConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b390af5b7bb78099e03d9e5eae9f2c772587e60687200d29b332285d1c40af")
      public fun timecodeConfig(timecodeConfig: TimecodeConfigProperty.Builder.() -> Unit) {
      }

      public fun videoDescriptions(videoDescriptions: IResolvable) {
      }

      public fun videoDescriptions(videoDescriptions: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty.builder()

      public override fun audioDescriptions(audioDescriptions: IResolvable) {
        cdkBuilder.audioDescriptions(audioDescriptions.let(IResolvable::unwrap))
      }

      public override fun audioDescriptions(audioDescriptions: List<Any>) {
        cdkBuilder.audioDescriptions(audioDescriptions)
      }

      public override fun availBlanking(availBlanking: IResolvable) {
        cdkBuilder.availBlanking(availBlanking.let(IResolvable::unwrap))
      }

      public override fun availBlanking(availBlanking: AvailBlankingProperty) {
        cdkBuilder.availBlanking(availBlanking.let(AvailBlankingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d1f256f38a2cfa8279cd0fef64f78c95b365482243a7b7e1f3ac7f35fad2717")
      public override fun availBlanking(availBlanking: AvailBlankingProperty.Builder.() -> Unit):
          Unit = availBlanking(AvailBlankingProperty(availBlanking))

      public override fun availConfiguration(availConfiguration: IResolvable) {
        cdkBuilder.availConfiguration(availConfiguration.let(IResolvable::unwrap))
      }

      public override fun availConfiguration(availConfiguration: AvailConfigurationProperty) {
        cdkBuilder.availConfiguration(availConfiguration.let(AvailConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de082af680ca2b39139d9ae193b95b1c5047108cdddfd07607477d5b9d306654")
      public override
          fun availConfiguration(availConfiguration: AvailConfigurationProperty.Builder.() -> Unit):
          Unit = availConfiguration(AvailConfigurationProperty(availConfiguration))

      public override fun blackoutSlate(blackoutSlate: IResolvable) {
        cdkBuilder.blackoutSlate(blackoutSlate.let(IResolvable::unwrap))
      }

      public override fun blackoutSlate(blackoutSlate: BlackoutSlateProperty) {
        cdkBuilder.blackoutSlate(blackoutSlate.let(BlackoutSlateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9baeed143c2abf51a92a53e595ac64742cdbbdb54c67813d0c50c872f07f546e")
      public override fun blackoutSlate(blackoutSlate: BlackoutSlateProperty.Builder.() -> Unit):
          Unit = blackoutSlate(BlackoutSlateProperty(blackoutSlate))

      public override fun captionDescriptions(captionDescriptions: IResolvable) {
        cdkBuilder.captionDescriptions(captionDescriptions.let(IResolvable::unwrap))
      }

      public override fun captionDescriptions(captionDescriptions: List<Any>) {
        cdkBuilder.captionDescriptions(captionDescriptions)
      }

      public override fun colorCorrectionSettings(colorCorrectionSettings: IResolvable) {
        cdkBuilder.colorCorrectionSettings(colorCorrectionSettings.let(IResolvable::unwrap))
      }

      public override
          fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty) {
        cdkBuilder.colorCorrectionSettings(colorCorrectionSettings.let(ColorCorrectionSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d7751059623d3453cd3088c55927f6982a5685e67f25fa6bdec7c47e63dc325")
      public override
          fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty.Builder.() -> Unit):
          Unit = colorCorrectionSettings(ColorCorrectionSettingsProperty(colorCorrectionSettings))

      public override fun featureActivations(featureActivations: IResolvable) {
        cdkBuilder.featureActivations(featureActivations.let(IResolvable::unwrap))
      }

      public override fun featureActivations(featureActivations: FeatureActivationsProperty) {
        cdkBuilder.featureActivations(featureActivations.let(FeatureActivationsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("574c0d37abdb7d1723b40e15113029c9685786d9f41f9af44dd7b97796dcbe74")
      public override
          fun featureActivations(featureActivations: FeatureActivationsProperty.Builder.() -> Unit):
          Unit = featureActivations(FeatureActivationsProperty(featureActivations))

      public override fun globalConfiguration(globalConfiguration: IResolvable) {
        cdkBuilder.globalConfiguration(globalConfiguration.let(IResolvable::unwrap))
      }

      public override fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty) {
        cdkBuilder.globalConfiguration(globalConfiguration.let(GlobalConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a27409ab5a4b184643ca0062ca649505ba38dde57b2436514d9adbc4af4d89cf")
      public override
          fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty.Builder.() -> Unit):
          Unit = globalConfiguration(GlobalConfigurationProperty(globalConfiguration))

      public override fun motionGraphicsConfiguration(motionGraphicsConfiguration: IResolvable) {
        cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty) {
        cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration.let(MotionGraphicsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bce1eb9cf7b54224c18c75e8ca6dcf9dd3f59b0ca515e7422c8cc4cfcca96450")
      public override
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty.Builder.() -> Unit):
          Unit =
          motionGraphicsConfiguration(MotionGraphicsConfigurationProperty(motionGraphicsConfiguration))

      public override fun nielsenConfiguration(nielsenConfiguration: IResolvable) {
        cdkBuilder.nielsenConfiguration(nielsenConfiguration.let(IResolvable::unwrap))
      }

      public override fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty) {
        cdkBuilder.nielsenConfiguration(nielsenConfiguration.let(NielsenConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d84746321052a6870e72f4b238703d7f7ac248b4369058685ae9b74b3c12b4")
      public override
          fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty.Builder.() -> Unit):
          Unit = nielsenConfiguration(NielsenConfigurationProperty(nielsenConfiguration))

      public override fun outputGroups(outputGroups: IResolvable) {
        cdkBuilder.outputGroups(outputGroups.let(IResolvable::unwrap))
      }

      public override fun outputGroups(outputGroups: List<Any>) {
        cdkBuilder.outputGroups(outputGroups)
      }

      public override fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(ThumbnailConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8ceafe338ad83f8dc2749873cd585b9935c4b9a6cc703b6d9322f013ef1241e")
      public override
          fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit):
          Unit = thumbnailConfiguration(ThumbnailConfigurationProperty(thumbnailConfiguration))

      public override fun timecodeConfig(timecodeConfig: IResolvable) {
        cdkBuilder.timecodeConfig(timecodeConfig.let(IResolvable::unwrap))
      }

      public override fun timecodeConfig(timecodeConfig: TimecodeConfigProperty) {
        cdkBuilder.timecodeConfig(timecodeConfig.let(TimecodeConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b390af5b7bb78099e03d9e5eae9f2c772587e60687200d29b332285d1c40af")
      public override fun timecodeConfig(timecodeConfig: TimecodeConfigProperty.Builder.() -> Unit):
          Unit = timecodeConfig(TimecodeConfigProperty(timecodeConfig))

      public override fun videoDescriptions(videoDescriptions: IResolvable) {
        cdkBuilder.videoDescriptions(videoDescriptions.let(IResolvable::unwrap))
      }

      public override fun videoDescriptions(videoDescriptions: List<Any>) {
        cdkBuilder.videoDescriptions(videoDescriptions)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty,
    ) : EncoderSettingsProperty {
      public override fun audioDescriptions(): Any? = unwrap(this).getAudioDescriptions()

      public override fun availBlanking(): Any? = unwrap(this).getAvailBlanking()

      public override fun availConfiguration(): Any? = unwrap(this).getAvailConfiguration()

      public override fun blackoutSlate(): Any? = unwrap(this).getBlackoutSlate()

      public override fun captionDescriptions(): Any? = unwrap(this).getCaptionDescriptions()

      public override fun colorCorrectionSettings(): Any? =
          unwrap(this).getColorCorrectionSettings()

      public override fun featureActivations(): Any? = unwrap(this).getFeatureActivations()

      public override fun globalConfiguration(): Any? = unwrap(this).getGlobalConfiguration()

      public override fun motionGraphicsConfiguration(): Any? =
          unwrap(this).getMotionGraphicsConfiguration()

      public override fun nielsenConfiguration(): Any? = unwrap(this).getNielsenConfiguration()

      public override fun outputGroups(): Any? = unwrap(this).getOutputGroups()

      public override fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()

      public override fun timecodeConfig(): Any? = unwrap(this).getTimecodeConfig()

      public override fun videoDescriptions(): Any? = unwrap(this).getVideoDescriptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncoderSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty):
          EncoderSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncoderSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AribSourceSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty,
    ) : AribSourceSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AribSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty):
          AribSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AribSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FrameCaptureS3SettingsProperty {
    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    public interface Builder {
      public fun cannedAcl(cannedAcl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty.builder()

      public override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty,
    ) : FrameCaptureS3SettingsProperty {
      public override fun cannedAcl(): String? = unwrap(this).getCannedAcl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureS3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty):
          FrameCaptureS3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureS3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AudioSelectorSettingsProperty {
    public fun audioHlsRenditionSelection(): Any? = unwrap(this).getAudioHlsRenditionSelection()

    public fun audioLanguageSelection(): Any? = unwrap(this).getAudioLanguageSelection()

    public fun audioPidSelection(): Any? = unwrap(this).getAudioPidSelection()

    public fun audioTrackSelection(): Any? = unwrap(this).getAudioTrackSelection()

    public interface Builder {
      public fun audioHlsRenditionSelection(audioHlsRenditionSelection: IResolvable) {
      }

      public
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57f473f69aabcdb6115510d9522d392da088acd1a80699e2531c70834760e221")
      public
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty.Builder.() -> Unit) {
      }

      public fun audioLanguageSelection(audioLanguageSelection: IResolvable) {
      }

      public fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365c1b38fd9d10caf08061a5220659122c6d8b8c949b627c9b1dc914540f8d12")
      public
          fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty.Builder.() -> Unit) {
      }

      public fun audioPidSelection(audioPidSelection: IResolvable) {
      }

      public fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4031aa8fdb005243ae93caca7816ed10aad1c82b3568da36acdeea067a639e45")
      public
          fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty.Builder.() -> Unit) {
      }

      public fun audioTrackSelection(audioTrackSelection: IResolvable) {
      }

      public fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cec170abbe3c52964153da491e53bfeb7340d8de0822a228ba39dee4a09876f6")
      public
          fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty.builder()

      public override fun audioHlsRenditionSelection(audioHlsRenditionSelection: IResolvable) {
        cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection.let(IResolvable::unwrap))
      }

      public override
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty) {
        cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection.let(AudioHlsRenditionSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57f473f69aabcdb6115510d9522d392da088acd1a80699e2531c70834760e221")
      public override
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty.Builder.() -> Unit):
          Unit =
          audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty(audioHlsRenditionSelection))

      public override fun audioLanguageSelection(audioLanguageSelection: IResolvable) {
        cdkBuilder.audioLanguageSelection(audioLanguageSelection.let(IResolvable::unwrap))
      }

      public override
          fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty) {
        cdkBuilder.audioLanguageSelection(audioLanguageSelection.let(AudioLanguageSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365c1b38fd9d10caf08061a5220659122c6d8b8c949b627c9b1dc914540f8d12")
      public override
          fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty.Builder.() -> Unit):
          Unit = audioLanguageSelection(AudioLanguageSelectionProperty(audioLanguageSelection))

      public override fun audioPidSelection(audioPidSelection: IResolvable) {
        cdkBuilder.audioPidSelection(audioPidSelection.let(IResolvable::unwrap))
      }

      public override fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty) {
        cdkBuilder.audioPidSelection(audioPidSelection.let(AudioPidSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4031aa8fdb005243ae93caca7816ed10aad1c82b3568da36acdeea067a639e45")
      public override
          fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty.Builder.() -> Unit):
          Unit = audioPidSelection(AudioPidSelectionProperty(audioPidSelection))

      public override fun audioTrackSelection(audioTrackSelection: IResolvable) {
        cdkBuilder.audioTrackSelection(audioTrackSelection.let(IResolvable::unwrap))
      }

      public override fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty) {
        cdkBuilder.audioTrackSelection(audioTrackSelection.let(AudioTrackSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cec170abbe3c52964153da491e53bfeb7340d8de0822a228ba39dee4a09876f6")
      public override
          fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty.Builder.() -> Unit):
          Unit = audioTrackSelection(AudioTrackSelectionProperty(audioTrackSelection))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty,
    ) : AudioSelectorSettingsProperty {
      public override fun audioHlsRenditionSelection(): Any? =
          unwrap(this).getAudioHlsRenditionSelection()

      public override fun audioLanguageSelection(): Any? = unwrap(this).getAudioLanguageSelection()

      public override fun audioPidSelection(): Any? = unwrap(this).getAudioPidSelection()

      public override fun audioTrackSelection(): Any? = unwrap(this).getAudioTrackSelection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioSelectorSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty):
          AudioSelectorSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioSelectorSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AncillarySourceSettingsProperty {
    public fun sourceAncillaryChannelNumber(): Number? =
        unwrap(this).getSourceAncillaryChannelNumber()

    public interface Builder {
      public fun sourceAncillaryChannelNumber(sourceAncillaryChannelNumber: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty.builder()

      public override fun sourceAncillaryChannelNumber(sourceAncillaryChannelNumber: Number) {
        cdkBuilder.sourceAncillaryChannelNumber(sourceAncillaryChannelNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty,
    ) : AncillarySourceSettingsProperty {
      public override fun sourceAncillaryChannelNumber(): Number? =
          unwrap(this).getSourceAncillaryChannelNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AncillarySourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty):
          AncillarySourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AncillarySourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AudioTrackSelectionProperty {
    public fun dolbyEDecode(): Any? = unwrap(this).getDolbyEDecode()

    public fun tracks(): Any? = unwrap(this).getTracks()

    public interface Builder {
      public fun dolbyEDecode(dolbyEDecode: IResolvable) {
      }

      public fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae18f041583763468cb1efee730015c0485091c0148b2b88a351e1bc4623e002")
      public fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty.Builder.() -> Unit) {
      }

      public fun tracks(tracks: IResolvable) {
      }

      public fun tracks(tracks: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty.builder()

      public override fun dolbyEDecode(dolbyEDecode: IResolvable) {
        cdkBuilder.dolbyEDecode(dolbyEDecode.let(IResolvable::unwrap))
      }

      public override fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty) {
        cdkBuilder.dolbyEDecode(dolbyEDecode.let(AudioDolbyEDecodeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae18f041583763468cb1efee730015c0485091c0148b2b88a351e1bc4623e002")
      public override fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty.Builder.() -> Unit):
          Unit = dolbyEDecode(AudioDolbyEDecodeProperty(dolbyEDecode))

      public override fun tracks(tracks: IResolvable) {
        cdkBuilder.tracks(tracks.let(IResolvable::unwrap))
      }

      public override fun tracks(tracks: List<Any>) {
        cdkBuilder.tracks(tracks)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty,
    ) : AudioTrackSelectionProperty {
      public override fun dolbyEDecode(): Any? = unwrap(this).getDolbyEDecode()

      public override fun tracks(): Any? = unwrap(this).getTracks()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioTrackSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty):
          AudioTrackSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioTrackSelectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MsSmoothOutputSettingsProperty {
    public fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    public interface Builder {
      public fun h265PackagingType(h265PackagingType: String) {
      }

      public fun nameModifier(nameModifier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty.builder()

      public override fun h265PackagingType(h265PackagingType: String) {
        cdkBuilder.h265PackagingType(h265PackagingType)
      }

      public override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty,
    ) : MsSmoothOutputSettingsProperty {
      public override fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

      public override fun nameModifier(): String? = unwrap(this).getNameModifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MsSmoothOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty):
          MsSmoothOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MsSmoothOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimecodeBurninSettingsProperty {
    public fun fontSize(): String? = unwrap(this).getFontSize()

    public fun position(): String? = unwrap(this).getPosition()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun fontSize(fontSize: String) {
      }

      public fun position(position: String) {
      }

      public fun prefix(prefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty.builder()

      public override fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
      }

      public override fun position(position: String) {
        cdkBuilder.position(position)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty,
    ) : TimecodeBurninSettingsProperty {
      public override fun fontSize(): String? = unwrap(this).getFontSize()

      public override fun position(): String? = unwrap(this).getPosition()

      public override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimecodeBurninSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty):
          TimecodeBurninSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimecodeBurninSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsSettingsProperty {
    public fun audioOnlyHlsSettings(): Any? = unwrap(this).getAudioOnlyHlsSettings()

    public fun fmp4HlsSettings(): Any? = unwrap(this).getFmp4HlsSettings()

    public fun frameCaptureHlsSettings(): Any? = unwrap(this).getFrameCaptureHlsSettings()

    public fun standardHlsSettings(): Any? = unwrap(this).getStandardHlsSettings()

    public interface Builder {
      public fun audioOnlyHlsSettings(audioOnlyHlsSettings: IResolvable) {
      }

      public fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bb0210fd9a9456e3162e9522934779729e66c9ab5b4842cc1d27123a55bc751")
      public
          fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty.Builder.() -> Unit) {
      }

      public fun fmp4HlsSettings(fmp4HlsSettings: IResolvable) {
      }

      public fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e58fc58d38f6f42e1a071b54196fd03ae7cd87874eef4026b757878a5641216")
      public fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty.Builder.() -> Unit) {
      }

      public fun frameCaptureHlsSettings(frameCaptureHlsSettings: IResolvable) {
      }

      public fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f43465b294ed51517016804135fd9ecf4aa542f567808e8cb9b58aa054e8b068")
      public
          fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty.Builder.() -> Unit) {
      }

      public fun standardHlsSettings(standardHlsSettings: IResolvable) {
      }

      public fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d66e90b7e5bdaf459e62ffba6ca7f9dc821e40a46a92d0d1688dafb9b2ef99d4")
      public
          fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty.builder()

      public override fun audioOnlyHlsSettings(audioOnlyHlsSettings: IResolvable) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings.let(IResolvable::unwrap))
      }

      public override fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings.let(AudioOnlyHlsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bb0210fd9a9456e3162e9522934779729e66c9ab5b4842cc1d27123a55bc751")
      public override
          fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty.Builder.() -> Unit):
          Unit = audioOnlyHlsSettings(AudioOnlyHlsSettingsProperty(audioOnlyHlsSettings))

      public override fun fmp4HlsSettings(fmp4HlsSettings: IResolvable) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings.let(IResolvable::unwrap))
      }

      public override fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings.let(Fmp4HlsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e58fc58d38f6f42e1a071b54196fd03ae7cd87874eef4026b757878a5641216")
      public override
          fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty.Builder.() -> Unit): Unit =
          fmp4HlsSettings(Fmp4HlsSettingsProperty(fmp4HlsSettings))

      public override fun frameCaptureHlsSettings(frameCaptureHlsSettings: IResolvable) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings.let(IResolvable::unwrap))
      }

      public override
          fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings.let(FrameCaptureHlsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f43465b294ed51517016804135fd9ecf4aa542f567808e8cb9b58aa054e8b068")
      public override
          fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureHlsSettings(FrameCaptureHlsSettingsProperty(frameCaptureHlsSettings))

      public override fun standardHlsSettings(standardHlsSettings: IResolvable) {
        cdkBuilder.standardHlsSettings(standardHlsSettings.let(IResolvable::unwrap))
      }

      public override fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty) {
        cdkBuilder.standardHlsSettings(standardHlsSettings.let(StandardHlsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d66e90b7e5bdaf459e62ffba6ca7f9dc821e40a46a92d0d1688dafb9b2ef99d4")
      public override
          fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty.Builder.() -> Unit):
          Unit = standardHlsSettings(StandardHlsSettingsProperty(standardHlsSettings))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty,
    ) : HlsSettingsProperty {
      public override fun audioOnlyHlsSettings(): Any? = unwrap(this).getAudioOnlyHlsSettings()

      public override fun fmp4HlsSettings(): Any? = unwrap(this).getFmp4HlsSettings()

      public override fun frameCaptureHlsSettings(): Any? =
          unwrap(this).getFrameCaptureHlsSettings()

      public override fun standardHlsSettings(): Any? = unwrap(this).getStandardHlsSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty):
          HlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VideoSelectorProperty {
    public fun colorSpace(): String? = unwrap(this).getColorSpace()

    public fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

    public fun colorSpaceUsage(): String? = unwrap(this).getColorSpaceUsage()

    public fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()

    public interface Builder {
      public fun colorSpace(colorSpace: String) {
      }

      public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
      }

      public fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e2421f4c2b0f6e241caf12c279d5f76e520ef75d9a2f716912c7af6979f6502")
      public
          fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty.Builder.() -> Unit) {
      }

      public fun colorSpaceUsage(colorSpaceUsage: String) {
      }

      public fun selectorSettings(selectorSettings: IResolvable) {
      }

      public fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c804652e447ee859f6db2993372d4752d251703d9f04ee632062fb178291ec7")
      public
          fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty.builder()

      public override fun colorSpace(colorSpace: String) {
        cdkBuilder.colorSpace(colorSpace)
      }

      public override fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(IResolvable::unwrap))
      }

      public override
          fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(VideoSelectorColorSpaceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e2421f4c2b0f6e241caf12c279d5f76e520ef75d9a2f716912c7af6979f6502")
      public override
          fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty.Builder.() -> Unit):
          Unit = colorSpaceSettings(VideoSelectorColorSpaceSettingsProperty(colorSpaceSettings))

      public override fun colorSpaceUsage(colorSpaceUsage: String) {
        cdkBuilder.colorSpaceUsage(colorSpaceUsage)
      }

      public override fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings.let(IResolvable::unwrap))
      }

      public override fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings.let(VideoSelectorSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c804652e447ee859f6db2993372d4752d251703d9f04ee632062fb178291ec7")
      public override
          fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty.Builder.() -> Unit):
          Unit = selectorSettings(VideoSelectorSettingsProperty(selectorSettings))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty,
    ) : VideoSelectorProperty {
      public override fun colorSpace(): String? = unwrap(this).getColorSpace()

      public override fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

      public override fun colorSpaceUsage(): String? = unwrap(this).getColorSpaceUsage()

      public override fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty):
          VideoSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VideoSelectorProgramIdProperty {
    public fun programId(): Number? = unwrap(this).getProgramId()

    public interface Builder {
      public fun programId(programId: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty.builder()

      public override fun programId(programId: Number) {
        cdkBuilder.programId(programId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty,
    ) : VideoSelectorProgramIdProperty {
      public override fun programId(): Number? = unwrap(this).getProgramId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorProgramIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty):
          VideoSelectorProgramIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorProgramIdProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsGroupSettingsProperty {
    public fun adMarkers(): List<String> = unwrap(this).getAdMarkers() ?: emptyList()

    public fun baseUrlContent(): String? = unwrap(this).getBaseUrlContent()

    public fun baseUrlContent1(): String? = unwrap(this).getBaseUrlContent1()

    public fun baseUrlManifest(): String? = unwrap(this).getBaseUrlManifest()

    public fun baseUrlManifest1(): String? = unwrap(this).getBaseUrlManifest1()

    public fun captionLanguageMappings(): Any? = unwrap(this).getCaptionLanguageMappings()

    public fun captionLanguageSetting(): String? = unwrap(this).getCaptionLanguageSetting()

    public fun clientCache(): String? = unwrap(this).getClientCache()

    public fun codecSpecification(): String? = unwrap(this).getCodecSpecification()

    public fun constantIv(): String? = unwrap(this).getConstantIv()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun directoryStructure(): String? = unwrap(this).getDirectoryStructure()

    public fun discontinuityTags(): String? = unwrap(this).getDiscontinuityTags()

    public fun encryptionType(): String? = unwrap(this).getEncryptionType()

    public fun hlsCdnSettings(): Any? = unwrap(this).getHlsCdnSettings()

    public fun hlsId3SegmentTagging(): String? = unwrap(this).getHlsId3SegmentTagging()

    public fun iFrameOnlyPlaylists(): String? = unwrap(this).getIFrameOnlyPlaylists()

    public fun incompleteSegmentBehavior(): String? = unwrap(this).getIncompleteSegmentBehavior()

    public fun indexNSegments(): Number? = unwrap(this).getIndexNSegments()

    public fun inputLossAction(): String? = unwrap(this).getInputLossAction()

    public fun ivInManifest(): String? = unwrap(this).getIvInManifest()

    public fun ivSource(): String? = unwrap(this).getIvSource()

    public fun keepSegments(): Number? = unwrap(this).getKeepSegments()

    public fun keyFormat(): String? = unwrap(this).getKeyFormat()

    public fun keyFormatVersions(): String? = unwrap(this).getKeyFormatVersions()

    public fun keyProviderSettings(): Any? = unwrap(this).getKeyProviderSettings()

    public fun manifestCompression(): String? = unwrap(this).getManifestCompression()

    public fun manifestDurationFormat(): String? = unwrap(this).getManifestDurationFormat()

    public fun minSegmentLength(): Number? = unwrap(this).getMinSegmentLength()

    public fun mode(): String? = unwrap(this).getMode()

    public fun outputSelection(): String? = unwrap(this).getOutputSelection()

    public fun programDateTime(): String? = unwrap(this).getProgramDateTime()

    public fun programDateTimeClock(): String? = unwrap(this).getProgramDateTimeClock()

    public fun programDateTimePeriod(): Number? = unwrap(this).getProgramDateTimePeriod()

    public fun redundantManifest(): String? = unwrap(this).getRedundantManifest()

    public fun segmentLength(): Number? = unwrap(this).getSegmentLength()

    public fun segmentationMode(): String? = unwrap(this).getSegmentationMode()

    public fun segmentsPerSubdirectory(): Number? = unwrap(this).getSegmentsPerSubdirectory()

    public fun streamInfResolution(): String? = unwrap(this).getStreamInfResolution()

    public fun timedMetadataId3Frame(): String? = unwrap(this).getTimedMetadataId3Frame()

    public fun timedMetadataId3Period(): Number? = unwrap(this).getTimedMetadataId3Period()

    public fun timestampDeltaMilliseconds(): Number? = unwrap(this).getTimestampDeltaMilliseconds()

    public fun tsFileMode(): String? = unwrap(this).getTsFileMode()

    public interface Builder {
      public fun adMarkers(adMarkers: List<String>) {
      }

      public fun baseUrlContent(baseUrlContent: String) {
      }

      public fun baseUrlContent1(baseUrlContent1: String) {
      }

      public fun baseUrlManifest(baseUrlManifest: String) {
      }

      public fun baseUrlManifest1(baseUrlManifest1: String) {
      }

      public fun captionLanguageMappings(captionLanguageMappings: IResolvable) {
      }

      public fun captionLanguageMappings(captionLanguageMappings: List<Any>) {
      }

      public fun captionLanguageSetting(captionLanguageSetting: String) {
      }

      public fun clientCache(clientCache: String) {
      }

      public fun codecSpecification(codecSpecification: String) {
      }

      public fun constantIv(constantIv: String) {
      }

      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602195d175deb1f788b7b739569a4b3e2a31271a576cbf3a6e09685b2c761a17")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }

      public fun directoryStructure(directoryStructure: String) {
      }

      public fun discontinuityTags(discontinuityTags: String) {
      }

      public fun encryptionType(encryptionType: String) {
      }

      public fun hlsCdnSettings(hlsCdnSettings: IResolvable) {
      }

      public fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84c1338b5d0ca3983e8539a052b22a722994034c4be5a5cdd27f767c459d41eb")
      public fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsId3SegmentTagging(hlsId3SegmentTagging: String) {
      }

      public fun iFrameOnlyPlaylists(iFrameOnlyPlaylists: String) {
      }

      public fun incompleteSegmentBehavior(incompleteSegmentBehavior: String) {
      }

      public fun indexNSegments(indexNSegments: Number) {
      }

      public fun inputLossAction(inputLossAction: String) {
      }

      public fun ivInManifest(ivInManifest: String) {
      }

      public fun ivSource(ivSource: String) {
      }

      public fun keepSegments(keepSegments: Number) {
      }

      public fun keyFormat(keyFormat: String) {
      }

      public fun keyFormatVersions(keyFormatVersions: String) {
      }

      public fun keyProviderSettings(keyProviderSettings: IResolvable) {
      }

      public fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc7b9e6f6ea3911a322f5b6a914349405596807be38e8560a174e4f5120799d1")
      public
          fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty.Builder.() -> Unit) {
      }

      public fun manifestCompression(manifestCompression: String) {
      }

      public fun manifestDurationFormat(manifestDurationFormat: String) {
      }

      public fun minSegmentLength(minSegmentLength: Number) {
      }

      public fun mode(mode: String) {
      }

      public fun outputSelection(outputSelection: String) {
      }

      public fun programDateTime(programDateTime: String) {
      }

      public fun programDateTimeClock(programDateTimeClock: String) {
      }

      public fun programDateTimePeriod(programDateTimePeriod: Number) {
      }

      public fun redundantManifest(redundantManifest: String) {
      }

      public fun segmentLength(segmentLength: Number) {
      }

      public fun segmentationMode(segmentationMode: String) {
      }

      public fun segmentsPerSubdirectory(segmentsPerSubdirectory: Number) {
      }

      public fun streamInfResolution(streamInfResolution: String) {
      }

      public fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
      }

      public fun timedMetadataId3Period(timedMetadataId3Period: Number) {
      }

      public fun timestampDeltaMilliseconds(timestampDeltaMilliseconds: Number) {
      }

      public fun tsFileMode(tsFileMode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty.builder()

      public override fun adMarkers(adMarkers: List<String>) {
        cdkBuilder.adMarkers(adMarkers)
      }

      public override fun baseUrlContent(baseUrlContent: String) {
        cdkBuilder.baseUrlContent(baseUrlContent)
      }

      public override fun baseUrlContent1(baseUrlContent1: String) {
        cdkBuilder.baseUrlContent1(baseUrlContent1)
      }

      public override fun baseUrlManifest(baseUrlManifest: String) {
        cdkBuilder.baseUrlManifest(baseUrlManifest)
      }

      public override fun baseUrlManifest1(baseUrlManifest1: String) {
        cdkBuilder.baseUrlManifest1(baseUrlManifest1)
      }

      public override fun captionLanguageMappings(captionLanguageMappings: IResolvable) {
        cdkBuilder.captionLanguageMappings(captionLanguageMappings.let(IResolvable::unwrap))
      }

      public override fun captionLanguageMappings(captionLanguageMappings: List<Any>) {
        cdkBuilder.captionLanguageMappings(captionLanguageMappings)
      }

      public override fun captionLanguageSetting(captionLanguageSetting: String) {
        cdkBuilder.captionLanguageSetting(captionLanguageSetting)
      }

      public override fun clientCache(clientCache: String) {
        cdkBuilder.clientCache(clientCache)
      }

      public override fun codecSpecification(codecSpecification: String) {
        cdkBuilder.codecSpecification(codecSpecification)
      }

      public override fun constantIv(constantIv: String) {
        cdkBuilder.constantIv(constantIv)
      }

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602195d175deb1f788b7b739569a4b3e2a31271a576cbf3a6e09685b2c761a17")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public override fun directoryStructure(directoryStructure: String) {
        cdkBuilder.directoryStructure(directoryStructure)
      }

      public override fun discontinuityTags(discontinuityTags: String) {
        cdkBuilder.discontinuityTags(discontinuityTags)
      }

      public override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      public override fun hlsCdnSettings(hlsCdnSettings: IResolvable) {
        cdkBuilder.hlsCdnSettings(hlsCdnSettings.let(IResolvable::unwrap))
      }

      public override fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty) {
        cdkBuilder.hlsCdnSettings(hlsCdnSettings.let(HlsCdnSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84c1338b5d0ca3983e8539a052b22a722994034c4be5a5cdd27f767c459d41eb")
      public override fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty.Builder.() -> Unit):
          Unit = hlsCdnSettings(HlsCdnSettingsProperty(hlsCdnSettings))

      public override fun hlsId3SegmentTagging(hlsId3SegmentTagging: String) {
        cdkBuilder.hlsId3SegmentTagging(hlsId3SegmentTagging)
      }

      public override fun iFrameOnlyPlaylists(iFrameOnlyPlaylists: String) {
        cdkBuilder.iFrameOnlyPlaylists(iFrameOnlyPlaylists)
      }

      public override fun incompleteSegmentBehavior(incompleteSegmentBehavior: String) {
        cdkBuilder.incompleteSegmentBehavior(incompleteSegmentBehavior)
      }

      public override fun indexNSegments(indexNSegments: Number) {
        cdkBuilder.indexNSegments(indexNSegments)
      }

      public override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      public override fun ivInManifest(ivInManifest: String) {
        cdkBuilder.ivInManifest(ivInManifest)
      }

      public override fun ivSource(ivSource: String) {
        cdkBuilder.ivSource(ivSource)
      }

      public override fun keepSegments(keepSegments: Number) {
        cdkBuilder.keepSegments(keepSegments)
      }

      public override fun keyFormat(keyFormat: String) {
        cdkBuilder.keyFormat(keyFormat)
      }

      public override fun keyFormatVersions(keyFormatVersions: String) {
        cdkBuilder.keyFormatVersions(keyFormatVersions)
      }

      public override fun keyProviderSettings(keyProviderSettings: IResolvable) {
        cdkBuilder.keyProviderSettings(keyProviderSettings.let(IResolvable::unwrap))
      }

      public override fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty) {
        cdkBuilder.keyProviderSettings(keyProviderSettings.let(KeyProviderSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc7b9e6f6ea3911a322f5b6a914349405596807be38e8560a174e4f5120799d1")
      public override
          fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty.Builder.() -> Unit):
          Unit = keyProviderSettings(KeyProviderSettingsProperty(keyProviderSettings))

      public override fun manifestCompression(manifestCompression: String) {
        cdkBuilder.manifestCompression(manifestCompression)
      }

      public override fun manifestDurationFormat(manifestDurationFormat: String) {
        cdkBuilder.manifestDurationFormat(manifestDurationFormat)
      }

      public override fun minSegmentLength(minSegmentLength: Number) {
        cdkBuilder.minSegmentLength(minSegmentLength)
      }

      public override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public override fun outputSelection(outputSelection: String) {
        cdkBuilder.outputSelection(outputSelection)
      }

      public override fun programDateTime(programDateTime: String) {
        cdkBuilder.programDateTime(programDateTime)
      }

      public override fun programDateTimeClock(programDateTimeClock: String) {
        cdkBuilder.programDateTimeClock(programDateTimeClock)
      }

      public override fun programDateTimePeriod(programDateTimePeriod: Number) {
        cdkBuilder.programDateTimePeriod(programDateTimePeriod)
      }

      public override fun redundantManifest(redundantManifest: String) {
        cdkBuilder.redundantManifest(redundantManifest)
      }

      public override fun segmentLength(segmentLength: Number) {
        cdkBuilder.segmentLength(segmentLength)
      }

      public override fun segmentationMode(segmentationMode: String) {
        cdkBuilder.segmentationMode(segmentationMode)
      }

      public override fun segmentsPerSubdirectory(segmentsPerSubdirectory: Number) {
        cdkBuilder.segmentsPerSubdirectory(segmentsPerSubdirectory)
      }

      public override fun streamInfResolution(streamInfResolution: String) {
        cdkBuilder.streamInfResolution(streamInfResolution)
      }

      public override fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
        cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
      }

      public override fun timedMetadataId3Period(timedMetadataId3Period: Number) {
        cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
      }

      public override fun timestampDeltaMilliseconds(timestampDeltaMilliseconds: Number) {
        cdkBuilder.timestampDeltaMilliseconds(timestampDeltaMilliseconds)
      }

      public override fun tsFileMode(tsFileMode: String) {
        cdkBuilder.tsFileMode(tsFileMode)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty,
    ) : HlsGroupSettingsProperty {
      public override fun adMarkers(): List<String> = unwrap(this).getAdMarkers() ?: emptyList()

      public override fun baseUrlContent(): String? = unwrap(this).getBaseUrlContent()

      public override fun baseUrlContent1(): String? = unwrap(this).getBaseUrlContent1()

      public override fun baseUrlManifest(): String? = unwrap(this).getBaseUrlManifest()

      public override fun baseUrlManifest1(): String? = unwrap(this).getBaseUrlManifest1()

      public override fun captionLanguageMappings(): Any? =
          unwrap(this).getCaptionLanguageMappings()

      public override fun captionLanguageSetting(): String? =
          unwrap(this).getCaptionLanguageSetting()

      public override fun clientCache(): String? = unwrap(this).getClientCache()

      public override fun codecSpecification(): String? = unwrap(this).getCodecSpecification()

      public override fun constantIv(): String? = unwrap(this).getConstantIv()

      public override fun destination(): Any? = unwrap(this).getDestination()

      public override fun directoryStructure(): String? = unwrap(this).getDirectoryStructure()

      public override fun discontinuityTags(): String? = unwrap(this).getDiscontinuityTags()

      public override fun encryptionType(): String? = unwrap(this).getEncryptionType()

      public override fun hlsCdnSettings(): Any? = unwrap(this).getHlsCdnSettings()

      public override fun hlsId3SegmentTagging(): String? = unwrap(this).getHlsId3SegmentTagging()

      public override fun iFrameOnlyPlaylists(): String? = unwrap(this).getIFrameOnlyPlaylists()

      public override fun incompleteSegmentBehavior(): String? =
          unwrap(this).getIncompleteSegmentBehavior()

      public override fun indexNSegments(): Number? = unwrap(this).getIndexNSegments()

      public override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      public override fun ivInManifest(): String? = unwrap(this).getIvInManifest()

      public override fun ivSource(): String? = unwrap(this).getIvSource()

      public override fun keepSegments(): Number? = unwrap(this).getKeepSegments()

      public override fun keyFormat(): String? = unwrap(this).getKeyFormat()

      public override fun keyFormatVersions(): String? = unwrap(this).getKeyFormatVersions()

      public override fun keyProviderSettings(): Any? = unwrap(this).getKeyProviderSettings()

      public override fun manifestCompression(): String? = unwrap(this).getManifestCompression()

      public override fun manifestDurationFormat(): String? =
          unwrap(this).getManifestDurationFormat()

      public override fun minSegmentLength(): Number? = unwrap(this).getMinSegmentLength()

      public override fun mode(): String? = unwrap(this).getMode()

      public override fun outputSelection(): String? = unwrap(this).getOutputSelection()

      public override fun programDateTime(): String? = unwrap(this).getProgramDateTime()

      public override fun programDateTimeClock(): String? = unwrap(this).getProgramDateTimeClock()

      public override fun programDateTimePeriod(): Number? = unwrap(this).getProgramDateTimePeriod()

      public override fun redundantManifest(): String? = unwrap(this).getRedundantManifest()

      public override fun segmentLength(): Number? = unwrap(this).getSegmentLength()

      public override fun segmentationMode(): String? = unwrap(this).getSegmentationMode()

      public override fun segmentsPerSubdirectory(): Number? =
          unwrap(this).getSegmentsPerSubdirectory()

      public override fun streamInfResolution(): String? = unwrap(this).getStreamInfResolution()

      public override fun timedMetadataId3Frame(): String? = unwrap(this).getTimedMetadataId3Frame()

      public override fun timedMetadataId3Period(): Number? =
          unwrap(this).getTimedMetadataId3Period()

      public override fun timestampDeltaMilliseconds(): Number? =
          unwrap(this).getTimestampDeltaMilliseconds()

      public override fun tsFileMode(): String? = unwrap(this).getTsFileMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty):
          HlsGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface BurnInDestinationSettingsProperty {
    public fun alignment(): String? = unwrap(this).getAlignment()

    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    public fun backgroundOpacity(): Number? = unwrap(this).getBackgroundOpacity()

    public fun font(): Any? = unwrap(this).getFont()

    public fun fontColor(): String? = unwrap(this).getFontColor()

    public fun fontOpacity(): Number? = unwrap(this).getFontOpacity()

    public fun fontResolution(): Number? = unwrap(this).getFontResolution()

    public fun fontSize(): String? = unwrap(this).getFontSize()

    public fun outlineColor(): String? = unwrap(this).getOutlineColor()

    public fun outlineSize(): Number? = unwrap(this).getOutlineSize()

    public fun shadowColor(): String? = unwrap(this).getShadowColor()

    public fun shadowOpacity(): Number? = unwrap(this).getShadowOpacity()

    public fun shadowXOffset(): Number? = unwrap(this).getShadowXOffset()

    public fun shadowYOffset(): Number? = unwrap(this).getShadowYOffset()

    public fun teletextGridControl(): String? = unwrap(this).getTeletextGridControl()

    public fun xPosition(): Number? = unwrap(this).getXPosition()

    public fun yPosition(): Number? = unwrap(this).getYPosition()

    public interface Builder {
      public fun alignment(alignment: String) {
      }

      public fun backgroundColor(backgroundColor: String) {
      }

      public fun backgroundOpacity(backgroundOpacity: Number) {
      }

      public fun font(font: IResolvable) {
      }

      public fun font(font: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("598a8f83dd8bb448689e6b1dce1eeab6686b5bed8a56f49049737c1eb08f2a6b")
      public fun font(font: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun fontColor(fontColor: String) {
      }

      public fun fontOpacity(fontOpacity: Number) {
      }

      public fun fontResolution(fontResolution: Number) {
      }

      public fun fontSize(fontSize: String) {
      }

      public fun outlineColor(outlineColor: String) {
      }

      public fun outlineSize(outlineSize: Number) {
      }

      public fun shadowColor(shadowColor: String) {
      }

      public fun shadowOpacity(shadowOpacity: Number) {
      }

      public fun shadowXOffset(shadowXOffset: Number) {
      }

      public fun shadowYOffset(shadowYOffset: Number) {
      }

      public fun teletextGridControl(teletextGridControl: String) {
      }

      public fun xPosition(xPosition: Number) {
      }

      public fun yPosition(yPosition: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty.builder()

      public override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      public override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      public override fun backgroundOpacity(backgroundOpacity: Number) {
        cdkBuilder.backgroundOpacity(backgroundOpacity)
      }

      public override fun font(font: IResolvable) {
        cdkBuilder.font(font.let(IResolvable::unwrap))
      }

      public override fun font(font: InputLocationProperty) {
        cdkBuilder.font(font.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("598a8f83dd8bb448689e6b1dce1eeab6686b5bed8a56f49049737c1eb08f2a6b")
      public override fun font(font: InputLocationProperty.Builder.() -> Unit): Unit =
          font(InputLocationProperty(font))

      public override fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
      }

      public override fun fontOpacity(fontOpacity: Number) {
        cdkBuilder.fontOpacity(fontOpacity)
      }

      public override fun fontResolution(fontResolution: Number) {
        cdkBuilder.fontResolution(fontResolution)
      }

      public override fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
      }

      public override fun outlineColor(outlineColor: String) {
        cdkBuilder.outlineColor(outlineColor)
      }

      public override fun outlineSize(outlineSize: Number) {
        cdkBuilder.outlineSize(outlineSize)
      }

      public override fun shadowColor(shadowColor: String) {
        cdkBuilder.shadowColor(shadowColor)
      }

      public override fun shadowOpacity(shadowOpacity: Number) {
        cdkBuilder.shadowOpacity(shadowOpacity)
      }

      public override fun shadowXOffset(shadowXOffset: Number) {
        cdkBuilder.shadowXOffset(shadowXOffset)
      }

      public override fun shadowYOffset(shadowYOffset: Number) {
        cdkBuilder.shadowYOffset(shadowYOffset)
      }

      public override fun teletextGridControl(teletextGridControl: String) {
        cdkBuilder.teletextGridControl(teletextGridControl)
      }

      public override fun xPosition(xPosition: Number) {
        cdkBuilder.xPosition(xPosition)
      }

      public override fun yPosition(yPosition: Number) {
        cdkBuilder.yPosition(yPosition)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty,
    ) : BurnInDestinationSettingsProperty {
      public override fun alignment(): String? = unwrap(this).getAlignment()

      public override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      public override fun backgroundOpacity(): Number? = unwrap(this).getBackgroundOpacity()

      public override fun font(): Any? = unwrap(this).getFont()

      public override fun fontColor(): String? = unwrap(this).getFontColor()

      public override fun fontOpacity(): Number? = unwrap(this).getFontOpacity()

      public override fun fontResolution(): Number? = unwrap(this).getFontResolution()

      public override fun fontSize(): String? = unwrap(this).getFontSize()

      public override fun outlineColor(): String? = unwrap(this).getOutlineColor()

      public override fun outlineSize(): Number? = unwrap(this).getOutlineSize()

      public override fun shadowColor(): String? = unwrap(this).getShadowColor()

      public override fun shadowOpacity(): Number? = unwrap(this).getShadowOpacity()

      public override fun shadowXOffset(): Number? = unwrap(this).getShadowXOffset()

      public override fun shadowYOffset(): Number? = unwrap(this).getShadowYOffset()

      public override fun teletextGridControl(): String? = unwrap(this).getTeletextGridControl()

      public override fun xPosition(): Number? = unwrap(this).getXPosition()

      public override fun yPosition(): Number? = unwrap(this).getYPosition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          BurnInDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty):
          BurnInDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BurnInDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ArchiveContainerSettingsProperty {
    public fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()

    public fun rawSettings(): Any? = unwrap(this).getRawSettings()

    public interface Builder {
      public fun m2TsSettings(m2TsSettings: IResolvable) {
      }

      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7093d6686b5ef527935fe685b74943267db4667834199c668465e8912aa1d4c8")
      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit) {
      }

      public fun rawSettings(rawSettings: IResolvable) {
      }

      public fun rawSettings(rawSettings: RawSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c1753d7e4b83a3e8537edf2c5e975c81df6f13161acd84c5118feb73038412")
      public fun rawSettings(rawSettings: RawSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty.builder()

      public override fun m2TsSettings(m2TsSettings: IResolvable) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(IResolvable::unwrap))
      }

      public override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(M2tsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7093d6686b5ef527935fe685b74943267db4667834199c668465e8912aa1d4c8")
      public override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit): Unit
          = m2TsSettings(M2tsSettingsProperty(m2TsSettings))

      public override fun rawSettings(rawSettings: IResolvable) {
        cdkBuilder.rawSettings(rawSettings.let(IResolvable::unwrap))
      }

      public override fun rawSettings(rawSettings: RawSettingsProperty) {
        cdkBuilder.rawSettings(rawSettings.let(RawSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c1753d7e4b83a3e8537edf2c5e975c81df6f13161acd84c5118feb73038412")
      public override fun rawSettings(rawSettings: RawSettingsProperty.Builder.() -> Unit): Unit =
          rawSettings(RawSettingsProperty(rawSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty,
    ) : ArchiveContainerSettingsProperty {
      public override fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()

      public override fun rawSettings(): Any? = unwrap(this).getRawSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveContainerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty):
          ArchiveContainerSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveContainerSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CaptionRectangleProperty {
    public fun height(): Number? = unwrap(this).getHeight()

    public fun leftOffset(): Number? = unwrap(this).getLeftOffset()

    public fun topOffset(): Number? = unwrap(this).getTopOffset()

    public fun width(): Number? = unwrap(this).getWidth()

    public interface Builder {
      public fun height(height: Number) {
      }

      public fun leftOffset(leftOffset: Number) {
      }

      public fun topOffset(topOffset: Number) {
      }

      public fun width(width: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty.builder()

      public override fun height(height: Number) {
        cdkBuilder.height(height)
      }

      public override fun leftOffset(leftOffset: Number) {
        cdkBuilder.leftOffset(leftOffset)
      }

      public override fun topOffset(topOffset: Number) {
        cdkBuilder.topOffset(topOffset)
      }

      public override fun width(width: Number) {
        cdkBuilder.width(width)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty,
    ) : CaptionRectangleProperty {
      public override fun height(): Number? = unwrap(this).getHeight()

      public override fun leftOffset(): Number? = unwrap(this).getLeftOffset()

      public override fun topOffset(): Number? = unwrap(this).getTopOffset()

      public override fun width(): Number? = unwrap(this).getWidth()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionRectangleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty):
          CaptionRectangleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionRectangleProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VideoSelectorPidProperty {
    public fun pid(): Number? = unwrap(this).getPid()

    public interface Builder {
      public fun pid(pid: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty.builder()

      public override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty,
    ) : VideoSelectorPidProperty {
      public override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorPidProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty):
          VideoSelectorPidProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorPidProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CaptionSelectorProperty {
    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun name(): String? = unwrap(this).getName()

    public fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()

    public interface Builder {
      public fun languageCode(languageCode: String) {
      }

      public fun name(name: String) {
      }

      public fun selectorSettings(selectorSettings: IResolvable) {
      }

      public fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81158ee68ff4bd4f8535025bc79c2e557c3e5612ad574f8c180adb7c89c943cf")
      public
          fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty.builder()

      public override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings.let(IResolvable::unwrap))
      }

      public override fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings.let(CaptionSelectorSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81158ee68ff4bd4f8535025bc79c2e557c3e5612ad574f8c180adb7c89c943cf")
      public override
          fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty.Builder.() -> Unit):
          Unit = selectorSettings(CaptionSelectorSettingsProperty(selectorSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty,
    ) : CaptionSelectorProperty {
      public override fun languageCode(): String? = unwrap(this).getLanguageCode()

      public override fun name(): String? = unwrap(this).getName()

      public override fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty):
          CaptionSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionSelectorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutomaticInputFailoverSettingsProperty {
    public fun errorClearTimeMsec(): Number? = unwrap(this).getErrorClearTimeMsec()

    public fun failoverConditions(): Any? = unwrap(this).getFailoverConditions()

    public fun inputPreference(): String? = unwrap(this).getInputPreference()

    public fun secondaryInputId(): String? = unwrap(this).getSecondaryInputId()

    public interface Builder {
      public fun errorClearTimeMsec(errorClearTimeMsec: Number) {
      }

      public fun failoverConditions(failoverConditions: IResolvable) {
      }

      public fun failoverConditions(failoverConditions: List<Any>) {
      }

      public fun inputPreference(inputPreference: String) {
      }

      public fun secondaryInputId(secondaryInputId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty.builder()

      public override fun errorClearTimeMsec(errorClearTimeMsec: Number) {
        cdkBuilder.errorClearTimeMsec(errorClearTimeMsec)
      }

      public override fun failoverConditions(failoverConditions: IResolvable) {
        cdkBuilder.failoverConditions(failoverConditions.let(IResolvable::unwrap))
      }

      public override fun failoverConditions(failoverConditions: List<Any>) {
        cdkBuilder.failoverConditions(failoverConditions)
      }

      public override fun inputPreference(inputPreference: String) {
        cdkBuilder.inputPreference(inputPreference)
      }

      public override fun secondaryInputId(secondaryInputId: String) {
        cdkBuilder.secondaryInputId(secondaryInputId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty,
    ) : AutomaticInputFailoverSettingsProperty {
      public override fun errorClearTimeMsec(): Number? = unwrap(this).getErrorClearTimeMsec()

      public override fun failoverConditions(): Any? = unwrap(this).getFailoverConditions()

      public override fun inputPreference(): String? = unwrap(this).getInputPreference()

      public override fun secondaryInputId(): String? = unwrap(this).getSecondaryInputId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutomaticInputFailoverSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty):
          AutomaticInputFailoverSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutomaticInputFailoverSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputDestinationSettingsProperty {
    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    public fun streamName(): String? = unwrap(this).getStreamName()

    public fun url(): String? = unwrap(this).getUrl()

    public fun username(): String? = unwrap(this).getUsername()

    public interface Builder {
      public fun passwordParam(passwordParam: String) {
      }

      public fun streamName(streamName: String) {
      }

      public fun url(url: String) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty.builder()

      public override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      public override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty,
    ) : OutputDestinationSettingsProperty {
      public override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      public override fun streamName(): String? = unwrap(this).getStreamName()

      public override fun url(): String? = unwrap(this).getUrl()

      public override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OutputDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty):
          OutputDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StandardHlsSettingsProperty {
    public fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

    public fun m3u8Settings(): Any? = unwrap(this).getM3U8Settings()

    public interface Builder {
      public fun audioRenditionSets(audioRenditionSets: String) {
      }

      public fun m3u8Settings(m3U8Settings: IResolvable) {
      }

      public fun m3u8Settings(m3U8Settings: M3u8SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38b5e11b940a0f49b93bfecfb05e7fe43fe5e9e271d6f17adb9f58c531eef318")
      public fun m3u8Settings(m3U8Settings: M3u8SettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty.builder()

      public override fun audioRenditionSets(audioRenditionSets: String) {
        cdkBuilder.audioRenditionSets(audioRenditionSets)
      }

      public override fun m3u8Settings(m3U8Settings: IResolvable) {
        cdkBuilder.m3U8Settings(m3U8Settings.let(IResolvable::unwrap))
      }

      public override fun m3u8Settings(m3U8Settings: M3u8SettingsProperty) {
        cdkBuilder.m3U8Settings(m3U8Settings.let(M3u8SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38b5e11b940a0f49b93bfecfb05e7fe43fe5e9e271d6f17adb9f58c531eef318")
      public override fun m3u8Settings(m3U8Settings: M3u8SettingsProperty.Builder.() -> Unit): Unit
          = m3u8Settings(M3u8SettingsProperty(m3U8Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty,
    ) : StandardHlsSettingsProperty {
      public override fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

      public override fun m3u8Settings(): Any? = unwrap(this).getM3U8Settings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StandardHlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty):
          StandardHlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StandardHlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Hdr10SettingsProperty {
    public fun maxCll(): Number? = unwrap(this).getMaxCll()

    public fun maxFall(): Number? = unwrap(this).getMaxFall()

    public interface Builder {
      public fun maxCll(maxCll: Number) {
      }

      public fun maxFall(maxFall: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty.builder()

      public override fun maxCll(maxCll: Number) {
        cdkBuilder.maxCll(maxCll)
      }

      public override fun maxFall(maxFall: Number) {
        cdkBuilder.maxFall(maxFall)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty,
    ) : Hdr10SettingsProperty {
      public override fun maxCll(): Number? = unwrap(this).getMaxCll()

      public override fun maxFall(): Number? = unwrap(this).getMaxFall()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Hdr10SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty):
          Hdr10SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Hdr10SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FailoverConditionProperty {
    public fun failoverConditionSettings(): Any? = unwrap(this).getFailoverConditionSettings()

    public interface Builder {
      public fun failoverConditionSettings(failoverConditionSettings: IResolvable) {
      }

      public
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629b16f62ee290cbd0e82a02bcdbf024d120c3d84b15192f7be5d1b4ca1dc0e0")
      public
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty.builder()

      public override fun failoverConditionSettings(failoverConditionSettings: IResolvable) {
        cdkBuilder.failoverConditionSettings(failoverConditionSettings.let(IResolvable::unwrap))
      }

      public override
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty) {
        cdkBuilder.failoverConditionSettings(failoverConditionSettings.let(FailoverConditionSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629b16f62ee290cbd0e82a02bcdbf024d120c3d84b15192f7be5d1b4ca1dc0e0")
      public override
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty.Builder.() -> Unit):
          Unit =
          failoverConditionSettings(FailoverConditionSettingsProperty(failoverConditionSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty,
    ) : FailoverConditionProperty {
      public override fun failoverConditionSettings(): Any? =
          unwrap(this).getFailoverConditionSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty):
          FailoverConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConditionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VideoBlackFailoverSettingsProperty {
    public fun blackDetectThreshold(): Number? = unwrap(this).getBlackDetectThreshold()

    public fun videoBlackThresholdMsec(): Number? = unwrap(this).getVideoBlackThresholdMsec()

    public interface Builder {
      public fun blackDetectThreshold(blackDetectThreshold: Number) {
      }

      public fun videoBlackThresholdMsec(videoBlackThresholdMsec: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty.builder()

      public override fun blackDetectThreshold(blackDetectThreshold: Number) {
        cdkBuilder.blackDetectThreshold(blackDetectThreshold)
      }

      public override fun videoBlackThresholdMsec(videoBlackThresholdMsec: Number) {
        cdkBuilder.videoBlackThresholdMsec(videoBlackThresholdMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty,
    ) : VideoBlackFailoverSettingsProperty {
      public override fun blackDetectThreshold(): Number? = unwrap(this).getBlackDetectThreshold()

      public override fun videoBlackThresholdMsec(): Number? =
          unwrap(this).getVideoBlackThresholdMsec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VideoBlackFailoverSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty):
          VideoBlackFailoverSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoBlackFailoverSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AudioSelectorProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun selectorSettings(selectorSettings: IResolvable) {
      }

      public fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b47d54560858067562f2574450a11cb064f5e35f13dac5550686750c80cbba97")
      public
          fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings.let(IResolvable::unwrap))
      }

      public override fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings.let(AudioSelectorSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b47d54560858067562f2574450a11cb064f5e35f13dac5550686750c80cbba97")
      public override
          fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty.Builder.() -> Unit):
          Unit = selectorSettings(AudioSelectorSettingsProperty(selectorSettings))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty,
    ) : AudioSelectorProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty):
          AudioSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioSelectorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OutputSettingsProperty {
    public fun archiveOutputSettings(): Any? = unwrap(this).getArchiveOutputSettings()

    public fun frameCaptureOutputSettings(): Any? = unwrap(this).getFrameCaptureOutputSettings()

    public fun hlsOutputSettings(): Any? = unwrap(this).getHlsOutputSettings()

    public fun mediaPackageOutputSettings(): Any? = unwrap(this).getMediaPackageOutputSettings()

    public fun msSmoothOutputSettings(): Any? = unwrap(this).getMsSmoothOutputSettings()

    public fun multiplexOutputSettings(): Any? = unwrap(this).getMultiplexOutputSettings()

    public fun rtmpOutputSettings(): Any? = unwrap(this).getRtmpOutputSettings()

    public fun udpOutputSettings(): Any? = unwrap(this).getUdpOutputSettings()

    public interface Builder {
      public fun archiveOutputSettings(archiveOutputSettings: IResolvable) {
      }

      public fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96508601faf036961ed97cb0f41f5db79d1f5f5f32121ddf0d39ebdd9a28397f")
      public
          fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun frameCaptureOutputSettings(frameCaptureOutputSettings: IResolvable) {
      }

      public
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("637fc0ef1a6446f62c6bb390d919ce51f7f7ba06671c3f81a3be74893638806c")
      public
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsOutputSettings(hlsOutputSettings: IResolvable) {
      }

      public fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9ec5d8e58c4207407034812b09b7bf670556604d103bd82399fa54d6c831127")
      public
          fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun mediaPackageOutputSettings(mediaPackageOutputSettings: IResolvable) {
      }

      public
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("042b9266410320f12735b0c2a3782b15ebdc5cb9e9646757f9eaaf441671bd2a")
      public
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun msSmoothOutputSettings(msSmoothOutputSettings: IResolvable) {
      }

      public fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dc1bd2f0596c3c621f61c1f7dafb428b985a8888d003104f9da9190629b330a")
      public
          fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun multiplexOutputSettings(multiplexOutputSettings: IResolvable) {
      }

      public fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6fb822bb074ba6559b06e35d4c89d57d22c4409e7f385aaf9adced8e9e4cfe")
      public
          fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun rtmpOutputSettings(rtmpOutputSettings: IResolvable) {
      }

      public fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1064347474fea1517c2b20cc253c8021728d3a360fd5d9eb92580980b9c5a302")
      public
          fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun udpOutputSettings(udpOutputSettings: IResolvable) {
      }

      public fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea3fc8126a3b4ba21b6fabc3233e4d25413a43a84dcd5f1c23dcee8909657d3e")
      public
          fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty.builder()

      public override fun archiveOutputSettings(archiveOutputSettings: IResolvable) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings.let(IResolvable::unwrap))
      }

      public override
          fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings.let(ArchiveOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96508601faf036961ed97cb0f41f5db79d1f5f5f32121ddf0d39ebdd9a28397f")
      public override
          fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty.Builder.() -> Unit):
          Unit = archiveOutputSettings(ArchiveOutputSettingsProperty(archiveOutputSettings))

      public override fun frameCaptureOutputSettings(frameCaptureOutputSettings: IResolvable) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings.let(IResolvable::unwrap))
      }

      public override
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings.let(FrameCaptureOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("637fc0ef1a6446f62c6bb390d919ce51f7f7ba06671c3f81a3be74893638806c")
      public override
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty.Builder.() -> Unit):
          Unit =
          frameCaptureOutputSettings(FrameCaptureOutputSettingsProperty(frameCaptureOutputSettings))

      public override fun hlsOutputSettings(hlsOutputSettings: IResolvable) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings.let(IResolvable::unwrap))
      }

      public override fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings.let(HlsOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9ec5d8e58c4207407034812b09b7bf670556604d103bd82399fa54d6c831127")
      public override
          fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty.Builder.() -> Unit):
          Unit = hlsOutputSettings(HlsOutputSettingsProperty(hlsOutputSettings))

      public override fun mediaPackageOutputSettings(mediaPackageOutputSettings: IResolvable) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings.let(IResolvable::unwrap))
      }

      public override
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings.let(MediaPackageOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("042b9266410320f12735b0c2a3782b15ebdc5cb9e9646757f9eaaf441671bd2a")
      public override
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty.Builder.() -> Unit):
          Unit =
          mediaPackageOutputSettings(MediaPackageOutputSettingsProperty(mediaPackageOutputSettings))

      public override fun msSmoothOutputSettings(msSmoothOutputSettings: IResolvable) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings.let(IResolvable::unwrap))
      }

      public override
          fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings.let(MsSmoothOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dc1bd2f0596c3c621f61c1f7dafb428b985a8888d003104f9da9190629b330a")
      public override
          fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty.Builder.() -> Unit):
          Unit = msSmoothOutputSettings(MsSmoothOutputSettingsProperty(msSmoothOutputSettings))

      public override fun multiplexOutputSettings(multiplexOutputSettings: IResolvable) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings.let(IResolvable::unwrap))
      }

      public override
          fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings.let(MultiplexOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6fb822bb074ba6559b06e35d4c89d57d22c4409e7f385aaf9adced8e9e4cfe")
      public override
          fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty.Builder.() -> Unit):
          Unit = multiplexOutputSettings(MultiplexOutputSettingsProperty(multiplexOutputSettings))

      public override fun rtmpOutputSettings(rtmpOutputSettings: IResolvable) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings.let(IResolvable::unwrap))
      }

      public override fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings.let(RtmpOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1064347474fea1517c2b20cc253c8021728d3a360fd5d9eb92580980b9c5a302")
      public override
          fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty.Builder.() -> Unit):
          Unit = rtmpOutputSettings(RtmpOutputSettingsProperty(rtmpOutputSettings))

      public override fun udpOutputSettings(udpOutputSettings: IResolvable) {
        cdkBuilder.udpOutputSettings(udpOutputSettings.let(IResolvable::unwrap))
      }

      public override fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty) {
        cdkBuilder.udpOutputSettings(udpOutputSettings.let(UdpOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea3fc8126a3b4ba21b6fabc3233e4d25413a43a84dcd5f1c23dcee8909657d3e")
      public override
          fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty.Builder.() -> Unit):
          Unit = udpOutputSettings(UdpOutputSettingsProperty(udpOutputSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty,
    ) : OutputSettingsProperty {
      public override fun archiveOutputSettings(): Any? = unwrap(this).getArchiveOutputSettings()

      public override fun frameCaptureOutputSettings(): Any? =
          unwrap(this).getFrameCaptureOutputSettings()

      public override fun hlsOutputSettings(): Any? = unwrap(this).getHlsOutputSettings()

      public override fun mediaPackageOutputSettings(): Any? =
          unwrap(this).getMediaPackageOutputSettings()

      public override fun msSmoothOutputSettings(): Any? = unwrap(this).getMsSmoothOutputSettings()

      public override fun multiplexOutputSettings(): Any? =
          unwrap(this).getMultiplexOutputSettings()

      public override fun rtmpOutputSettings(): Any? = unwrap(this).getRtmpOutputSettings()

      public override fun udpOutputSettings(): Any? = unwrap(this).getUdpOutputSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty):
          OutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NielsenConfigurationProperty {
    public fun distributorId(): String? = unwrap(this).getDistributorId()

    public fun nielsenPcmToId3Tagging(): String? = unwrap(this).getNielsenPcmToId3Tagging()

    public interface Builder {
      public fun distributorId(distributorId: String) {
      }

      public fun nielsenPcmToId3Tagging(nielsenPcmToId3Tagging: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty.builder()

      public override fun distributorId(distributorId: String) {
        cdkBuilder.distributorId(distributorId)
      }

      public override fun nielsenPcmToId3Tagging(nielsenPcmToId3Tagging: String) {
        cdkBuilder.nielsenPcmToId3Tagging(nielsenPcmToId3Tagging)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty,
    ) : NielsenConfigurationProperty {
      public override fun distributorId(): String? = unwrap(this).getDistributorId()

      public override fun nielsenPcmToId3Tagging(): String? =
          unwrap(this).getNielsenPcmToId3Tagging()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NielsenConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty):
          NielsenConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NielsenConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DolbyVision81SettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty,
    ) : DolbyVision81SettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DolbyVision81SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty):
          DolbyVision81SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DolbyVision81SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DvbSdtSettingsProperty {
    public fun outputSdt(): String? = unwrap(this).getOutputSdt()

    public fun repInterval(): Number? = unwrap(this).getRepInterval()

    public fun serviceName(): String? = unwrap(this).getServiceName()

    public fun serviceProviderName(): String? = unwrap(this).getServiceProviderName()

    public interface Builder {
      public fun outputSdt(outputSdt: String) {
      }

      public fun repInterval(repInterval: Number) {
      }

      public fun serviceName(serviceName: String) {
      }

      public fun serviceProviderName(serviceProviderName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty.builder()

      public override fun outputSdt(outputSdt: String) {
        cdkBuilder.outputSdt(outputSdt)
      }

      public override fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public override fun serviceProviderName(serviceProviderName: String) {
        cdkBuilder.serviceProviderName(serviceProviderName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty,
    ) : DvbSdtSettingsProperty {
      public override fun outputSdt(): String? = unwrap(this).getOutputSdt()

      public override fun repInterval(): Number? = unwrap(this).getRepInterval()

      public override fun serviceName(): String? = unwrap(this).getServiceName()

      public override fun serviceProviderName(): String? = unwrap(this).getServiceProviderName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DvbSdtSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty):
          DvbSdtSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbSdtSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DvbSubDestinationSettingsProperty {
    public fun alignment(): String? = unwrap(this).getAlignment()

    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    public fun backgroundOpacity(): Number? = unwrap(this).getBackgroundOpacity()

    public fun font(): Any? = unwrap(this).getFont()

    public fun fontColor(): String? = unwrap(this).getFontColor()

    public fun fontOpacity(): Number? = unwrap(this).getFontOpacity()

    public fun fontResolution(): Number? = unwrap(this).getFontResolution()

    public fun fontSize(): String? = unwrap(this).getFontSize()

    public fun outlineColor(): String? = unwrap(this).getOutlineColor()

    public fun outlineSize(): Number? = unwrap(this).getOutlineSize()

    public fun shadowColor(): String? = unwrap(this).getShadowColor()

    public fun shadowOpacity(): Number? = unwrap(this).getShadowOpacity()

    public fun shadowXOffset(): Number? = unwrap(this).getShadowXOffset()

    public fun shadowYOffset(): Number? = unwrap(this).getShadowYOffset()

    public fun teletextGridControl(): String? = unwrap(this).getTeletextGridControl()

    public fun xPosition(): Number? = unwrap(this).getXPosition()

    public fun yPosition(): Number? = unwrap(this).getYPosition()

    public interface Builder {
      public fun alignment(alignment: String) {
      }

      public fun backgroundColor(backgroundColor: String) {
      }

      public fun backgroundOpacity(backgroundOpacity: Number) {
      }

      public fun font(font: IResolvable) {
      }

      public fun font(font: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5227e364a0e2717d6a35bd34eedf478ab33ea797e1595280ee32edac263126a")
      public fun font(font: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun fontColor(fontColor: String) {
      }

      public fun fontOpacity(fontOpacity: Number) {
      }

      public fun fontResolution(fontResolution: Number) {
      }

      public fun fontSize(fontSize: String) {
      }

      public fun outlineColor(outlineColor: String) {
      }

      public fun outlineSize(outlineSize: Number) {
      }

      public fun shadowColor(shadowColor: String) {
      }

      public fun shadowOpacity(shadowOpacity: Number) {
      }

      public fun shadowXOffset(shadowXOffset: Number) {
      }

      public fun shadowYOffset(shadowYOffset: Number) {
      }

      public fun teletextGridControl(teletextGridControl: String) {
      }

      public fun xPosition(xPosition: Number) {
      }

      public fun yPosition(yPosition: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty.builder()

      public override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      public override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      public override fun backgroundOpacity(backgroundOpacity: Number) {
        cdkBuilder.backgroundOpacity(backgroundOpacity)
      }

      public override fun font(font: IResolvable) {
        cdkBuilder.font(font.let(IResolvable::unwrap))
      }

      public override fun font(font: InputLocationProperty) {
        cdkBuilder.font(font.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5227e364a0e2717d6a35bd34eedf478ab33ea797e1595280ee32edac263126a")
      public override fun font(font: InputLocationProperty.Builder.() -> Unit): Unit =
          font(InputLocationProperty(font))

      public override fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
      }

      public override fun fontOpacity(fontOpacity: Number) {
        cdkBuilder.fontOpacity(fontOpacity)
      }

      public override fun fontResolution(fontResolution: Number) {
        cdkBuilder.fontResolution(fontResolution)
      }

      public override fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
      }

      public override fun outlineColor(outlineColor: String) {
        cdkBuilder.outlineColor(outlineColor)
      }

      public override fun outlineSize(outlineSize: Number) {
        cdkBuilder.outlineSize(outlineSize)
      }

      public override fun shadowColor(shadowColor: String) {
        cdkBuilder.shadowColor(shadowColor)
      }

      public override fun shadowOpacity(shadowOpacity: Number) {
        cdkBuilder.shadowOpacity(shadowOpacity)
      }

      public override fun shadowXOffset(shadowXOffset: Number) {
        cdkBuilder.shadowXOffset(shadowXOffset)
      }

      public override fun shadowYOffset(shadowYOffset: Number) {
        cdkBuilder.shadowYOffset(shadowYOffset)
      }

      public override fun teletextGridControl(teletextGridControl: String) {
        cdkBuilder.teletextGridControl(teletextGridControl)
      }

      public override fun xPosition(xPosition: Number) {
        cdkBuilder.xPosition(xPosition)
      }

      public override fun yPosition(yPosition: Number) {
        cdkBuilder.yPosition(yPosition)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty,
    ) : DvbSubDestinationSettingsProperty {
      public override fun alignment(): String? = unwrap(this).getAlignment()

      public override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      public override fun backgroundOpacity(): Number? = unwrap(this).getBackgroundOpacity()

      public override fun font(): Any? = unwrap(this).getFont()

      public override fun fontColor(): String? = unwrap(this).getFontColor()

      public override fun fontOpacity(): Number? = unwrap(this).getFontOpacity()

      public override fun fontResolution(): Number? = unwrap(this).getFontResolution()

      public override fun fontSize(): String? = unwrap(this).getFontSize()

      public override fun outlineColor(): String? = unwrap(this).getOutlineColor()

      public override fun outlineSize(): Number? = unwrap(this).getOutlineSize()

      public override fun shadowColor(): String? = unwrap(this).getShadowColor()

      public override fun shadowOpacity(): Number? = unwrap(this).getShadowOpacity()

      public override fun shadowXOffset(): Number? = unwrap(this).getShadowXOffset()

      public override fun shadowYOffset(): Number? = unwrap(this).getShadowYOffset()

      public override fun teletextGridControl(): String? = unwrap(this).getTeletextGridControl()

      public override fun xPosition(): Number? = unwrap(this).getXPosition()

      public override fun yPosition(): Number? = unwrap(this).getYPosition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DvbSubDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty):
          DvbSubDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbSubDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DvbSubSourceSettingsProperty {
    public fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

    public fun pid(): Number? = unwrap(this).getPid()

    public interface Builder {
      public fun ocrLanguage(ocrLanguage: String) {
      }

      public fun pid(pid: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty.builder()

      public override fun ocrLanguage(ocrLanguage: String) {
        cdkBuilder.ocrLanguage(ocrLanguage)
      }

      public override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty,
    ) : DvbSubSourceSettingsProperty {
      public override fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

      public override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DvbSubSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty):
          DvbSubSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbSubSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TeletextDestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty,
    ) : TeletextDestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TeletextDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty):
          TeletextDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TeletextDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UdpContainerSettingsProperty {
    public fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()

    public interface Builder {
      public fun m2TsSettings(m2TsSettings: IResolvable) {
      }

      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de00169a1a7b875224dcc32084c600e437c97c6eb3c8f07f07e02283fcb99e06")
      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty.builder()

      public override fun m2TsSettings(m2TsSettings: IResolvable) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(IResolvable::unwrap))
      }

      public override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(M2tsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de00169a1a7b875224dcc32084c600e437c97c6eb3c8f07f07e02283fcb99e06")
      public override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit): Unit
          = m2TsSettings(M2tsSettingsProperty(m2TsSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty,
    ) : UdpContainerSettingsProperty {
      public override fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UdpContainerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty):
          UdpContainerSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UdpContainerSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputLossFailoverSettingsProperty {
    public fun inputLossThresholdMsec(): Number? = unwrap(this).getInputLossThresholdMsec()

    public interface Builder {
      public fun inputLossThresholdMsec(inputLossThresholdMsec: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty.builder()

      public override fun inputLossThresholdMsec(inputLossThresholdMsec: Number) {
        cdkBuilder.inputLossThresholdMsec(inputLossThresholdMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty,
    ) : InputLossFailoverSettingsProperty {
      public override fun inputLossThresholdMsec(): Number? =
          unwrap(this).getInputLossThresholdMsec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InputLossFailoverSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty):
          InputLossFailoverSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLossFailoverSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbuTtDDestinationSettingsProperty {
    public fun copyrightHolder(): String? = unwrap(this).getCopyrightHolder()

    public fun fillLineGap(): String? = unwrap(this).getFillLineGap()

    public fun fontFamily(): String? = unwrap(this).getFontFamily()

    public fun styleControl(): String? = unwrap(this).getStyleControl()

    public interface Builder {
      public fun copyrightHolder(copyrightHolder: String) {
      }

      public fun fillLineGap(fillLineGap: String) {
      }

      public fun fontFamily(fontFamily: String) {
      }

      public fun styleControl(styleControl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty.builder()

      public override fun copyrightHolder(copyrightHolder: String) {
        cdkBuilder.copyrightHolder(copyrightHolder)
      }

      public override fun fillLineGap(fillLineGap: String) {
        cdkBuilder.fillLineGap(fillLineGap)
      }

      public override fun fontFamily(fontFamily: String) {
        cdkBuilder.fontFamily(fontFamily)
      }

      public override fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty,
    ) : EbuTtDDestinationSettingsProperty {
      public override fun copyrightHolder(): String? = unwrap(this).getCopyrightHolder()

      public override fun fillLineGap(): String? = unwrap(this).getFillLineGap()

      public override fun fontFamily(): String? = unwrap(this).getFontFamily()

      public override fun styleControl(): String? = unwrap(this).getStyleControl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EbuTtDDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty):
          EbuTtDDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbuTtDDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EpochLockingSettingsProperty {
    public fun customEpoch(): String? = unwrap(this).getCustomEpoch()

    public fun jamSyncTime(): String? = unwrap(this).getJamSyncTime()

    public interface Builder {
      public fun customEpoch(customEpoch: String) {
      }

      public fun jamSyncTime(jamSyncTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty.builder()

      public override fun customEpoch(customEpoch: String) {
        cdkBuilder.customEpoch(customEpoch)
      }

      public override fun jamSyncTime(jamSyncTime: String) {
        cdkBuilder.jamSyncTime(jamSyncTime)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty,
    ) : EpochLockingSettingsProperty {
      public override fun customEpoch(): String? = unwrap(this).getCustomEpoch()

      public override fun jamSyncTime(): String? = unwrap(this).getJamSyncTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EpochLockingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty):
          EpochLockingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EpochLockingSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsInputSettingsProperty {
    public fun bandwidth(): Number? = unwrap(this).getBandwidth()

    public fun bufferSegments(): Number? = unwrap(this).getBufferSegments()

    public fun retries(): Number? = unwrap(this).getRetries()

    public fun retryInterval(): Number? = unwrap(this).getRetryInterval()

    public fun scte35Source(): String? = unwrap(this).getScte35Source()

    public interface Builder {
      public fun bandwidth(bandwidth: Number) {
      }

      public fun bufferSegments(bufferSegments: Number) {
      }

      public fun retries(retries: Number) {
      }

      public fun retryInterval(retryInterval: Number) {
      }

      public fun scte35Source(scte35Source: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty.builder()

      public override fun bandwidth(bandwidth: Number) {
        cdkBuilder.bandwidth(bandwidth)
      }

      public override fun bufferSegments(bufferSegments: Number) {
        cdkBuilder.bufferSegments(bufferSegments)
      }

      public override fun retries(retries: Number) {
        cdkBuilder.retries(retries)
      }

      public override fun retryInterval(retryInterval: Number) {
        cdkBuilder.retryInterval(retryInterval)
      }

      public override fun scte35Source(scte35Source: String) {
        cdkBuilder.scte35Source(scte35Source)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty,
    ) : HlsInputSettingsProperty {
      public override fun bandwidth(): Number? = unwrap(this).getBandwidth()

      public override fun bufferSegments(): Number? = unwrap(this).getBufferSegments()

      public override fun retries(): Number? = unwrap(this).getRetries()

      public override fun retryInterval(): Number? = unwrap(this).getRetryInterval()

      public override fun scte35Source(): String? = unwrap(this).getScte35Source()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsInputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty):
          HlsInputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsInputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface HlsBasicPutSettingsProperty {
    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number) {
      }

      public fun filecacheDuration(filecacheDuration: Number) {
      }

      public fun numRetries(numRetries: Number) {
      }

      public fun restartDelay(restartDelay: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty.builder()

      public override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      public override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      public override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      public override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty,
    ) : HlsBasicPutSettingsProperty {
      public override fun connectionRetryInterval(): Number? =
          unwrap(this).getConnectionRetryInterval()

      public override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      public override fun numRetries(): Number? = unwrap(this).getNumRetries()

      public override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsBasicPutSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty):
          HlsBasicPutSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsBasicPutSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AudioPidSelectionProperty {
    public fun pid(): Number? = unwrap(this).getPid()

    public interface Builder {
      public fun pid(pid: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty.builder()

      public override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty,
    ) : AudioPidSelectionProperty {
      public override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioPidSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty):
          AudioPidSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioPidSelectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EsamProperty {
    public fun acquisitionPointId(): String? = unwrap(this).getAcquisitionPointId()

    public fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    public fun poisEndpoint(): String? = unwrap(this).getPoisEndpoint()

    public fun username(): String? = unwrap(this).getUsername()

    public fun zoneIdentity(): String? = unwrap(this).getZoneIdentity()

    public interface Builder {
      public fun acquisitionPointId(acquisitionPointId: String) {
      }

      public fun adAvailOffset(adAvailOffset: Number) {
      }

      public fun passwordParam(passwordParam: String) {
      }

      public fun poisEndpoint(poisEndpoint: String) {
      }

      public fun username(username: String) {
      }

      public fun zoneIdentity(zoneIdentity: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty.builder()

      public override fun acquisitionPointId(acquisitionPointId: String) {
        cdkBuilder.acquisitionPointId(acquisitionPointId)
      }

      public override fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
      }

      public override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      public override fun poisEndpoint(poisEndpoint: String) {
        cdkBuilder.poisEndpoint(poisEndpoint)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public override fun zoneIdentity(zoneIdentity: String) {
        cdkBuilder.zoneIdentity(zoneIdentity)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty,
    ) : EsamProperty {
      public override fun acquisitionPointId(): String? = unwrap(this).getAcquisitionPointId()

      public override fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

      public override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      public override fun poisEndpoint(): String? = unwrap(this).getPoisEndpoint()

      public override fun username(): String? = unwrap(this).getUsername()

      public override fun zoneIdentity(): String? = unwrap(this).getZoneIdentity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EsamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty):
          EsamProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EsamProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ArchiveOutputSettingsProperty {
    public fun containerSettings(): Any? = unwrap(this).getContainerSettings()

    public fun extension(): String? = unwrap(this).getExtension()

    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    public interface Builder {
      public fun containerSettings(containerSettings: IResolvable) {
      }

      public fun containerSettings(containerSettings: ArchiveContainerSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b10f91128a6e98b3cdbfdeb6678f677ef83dcf43bea00aa4f041ec7fd1df8f7")
      public
          fun containerSettings(containerSettings: ArchiveContainerSettingsProperty.Builder.() -> Unit) {
      }

      public fun extension(extension: String) {
      }

      public fun nameModifier(nameModifier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty.builder()

      public override fun containerSettings(containerSettings: IResolvable) {
        cdkBuilder.containerSettings(containerSettings.let(IResolvable::unwrap))
      }

      public override fun containerSettings(containerSettings: ArchiveContainerSettingsProperty) {
        cdkBuilder.containerSettings(containerSettings.let(ArchiveContainerSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b10f91128a6e98b3cdbfdeb6678f677ef83dcf43bea00aa4f041ec7fd1df8f7")
      public override
          fun containerSettings(containerSettings: ArchiveContainerSettingsProperty.Builder.() -> Unit):
          Unit = containerSettings(ArchiveContainerSettingsProperty(containerSettings))

      public override fun extension(extension: String) {
        cdkBuilder.extension(extension)
      }

      public override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty,
    ) : ArchiveOutputSettingsProperty {
      public override fun containerSettings(): Any? = unwrap(this).getContainerSettings()

      public override fun extension(): String? = unwrap(this).getExtension()

      public override fun nameModifier(): String? = unwrap(this).getNameModifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty):
          ArchiveOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsMediaStoreSettingsProperty {
    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun mediaStoreStorageClass(): String? = unwrap(this).getMediaStoreStorageClass()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number) {
      }

      public fun filecacheDuration(filecacheDuration: Number) {
      }

      public fun mediaStoreStorageClass(mediaStoreStorageClass: String) {
      }

      public fun numRetries(numRetries: Number) {
      }

      public fun restartDelay(restartDelay: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty.builder()

      public override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      public override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      public override fun mediaStoreStorageClass(mediaStoreStorageClass: String) {
        cdkBuilder.mediaStoreStorageClass(mediaStoreStorageClass)
      }

      public override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      public override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty,
    ) : HlsMediaStoreSettingsProperty {
      public override fun connectionRetryInterval(): Number? =
          unwrap(this).getConnectionRetryInterval()

      public override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      public override fun mediaStoreStorageClass(): String? =
          unwrap(this).getMediaStoreStorageClass()

      public override fun numRetries(): Number? = unwrap(this).getNumRetries()

      public override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsMediaStoreSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty):
          HlsMediaStoreSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsMediaStoreSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RtmpCaptionInfoDestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty,
    ) : RtmpCaptionInfoDestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RtmpCaptionInfoDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty):
          RtmpCaptionInfoDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RtmpCaptionInfoDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AudioWatermarkSettingsProperty {
    public fun nielsenWatermarksSettings(): Any? = unwrap(this).getNielsenWatermarksSettings()

    public interface Builder {
      public fun nielsenWatermarksSettings(nielsenWatermarksSettings: IResolvable) {
      }

      public
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d64823136217a65b6861749cca35190781e837c4765c763fcc01de6191621fe6")
      public
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty.builder()

      public override fun nielsenWatermarksSettings(nielsenWatermarksSettings: IResolvable) {
        cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings.let(IResolvable::unwrap))
      }

      public override
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty) {
        cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings.let(NielsenWatermarksSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d64823136217a65b6861749cca35190781e837c4765c763fcc01de6191621fe6")
      public override
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty.Builder.() -> Unit):
          Unit =
          nielsenWatermarksSettings(NielsenWatermarksSettingsProperty(nielsenWatermarksSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty,
    ) : AudioWatermarkSettingsProperty {
      public override fun nielsenWatermarksSettings(): Any? =
          unwrap(this).getNielsenWatermarksSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioWatermarkSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty):
          AudioWatermarkSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioWatermarkSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsCdnSettingsProperty {
    public fun hlsAkamaiSettings(): Any? = unwrap(this).getHlsAkamaiSettings()

    public fun hlsBasicPutSettings(): Any? = unwrap(this).getHlsBasicPutSettings()

    public fun hlsMediaStoreSettings(): Any? = unwrap(this).getHlsMediaStoreSettings()

    public fun hlsS3Settings(): Any? = unwrap(this).getHlsS3Settings()

    public fun hlsWebdavSettings(): Any? = unwrap(this).getHlsWebdavSettings()

    public interface Builder {
      public fun hlsAkamaiSettings(hlsAkamaiSettings: IResolvable) {
      }

      public fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("885a3ec706d60f0d26783b48ab433319baea0082ea71643fbe0c2562ac252eef")
      public
          fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsBasicPutSettings(hlsBasicPutSettings: IResolvable) {
      }

      public fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d0233d270f0c3c7010e08227c0543cbb684f6ee5c6563e28d7cc38dd2475490")
      public
          fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsMediaStoreSettings(hlsMediaStoreSettings: IResolvable) {
      }

      public fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f183c2557fad997b0cd46ac5ebef6e52f84359853946ca6759adce7925db6d6")
      public
          fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsS3Settings(hlsS3Settings: IResolvable) {
      }

      public fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0088a0d76d24fa0a8896362c68d43d2c23752a7fda8885846cdf354571a30887")
      public fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsWebdavSettings(hlsWebdavSettings: IResolvable) {
      }

      public fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51a72e77c66d4f6e5c1a9f0ca490da16ebc207f7ee5cabcffb332154678ab919")
      public
          fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty.builder()

      public override fun hlsAkamaiSettings(hlsAkamaiSettings: IResolvable) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings.let(IResolvable::unwrap))
      }

      public override fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings.let(HlsAkamaiSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("885a3ec706d60f0d26783b48ab433319baea0082ea71643fbe0c2562ac252eef")
      public override
          fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty.Builder.() -> Unit):
          Unit = hlsAkamaiSettings(HlsAkamaiSettingsProperty(hlsAkamaiSettings))

      public override fun hlsBasicPutSettings(hlsBasicPutSettings: IResolvable) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings.let(IResolvable::unwrap))
      }

      public override fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings.let(HlsBasicPutSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d0233d270f0c3c7010e08227c0543cbb684f6ee5c6563e28d7cc38dd2475490")
      public override
          fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty.Builder.() -> Unit):
          Unit = hlsBasicPutSettings(HlsBasicPutSettingsProperty(hlsBasicPutSettings))

      public override fun hlsMediaStoreSettings(hlsMediaStoreSettings: IResolvable) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings.let(IResolvable::unwrap))
      }

      public override
          fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings.let(HlsMediaStoreSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f183c2557fad997b0cd46ac5ebef6e52f84359853946ca6759adce7925db6d6")
      public override
          fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty.Builder.() -> Unit):
          Unit = hlsMediaStoreSettings(HlsMediaStoreSettingsProperty(hlsMediaStoreSettings))

      public override fun hlsS3Settings(hlsS3Settings: IResolvable) {
        cdkBuilder.hlsS3Settings(hlsS3Settings.let(IResolvable::unwrap))
      }

      public override fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty) {
        cdkBuilder.hlsS3Settings(hlsS3Settings.let(HlsS3SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0088a0d76d24fa0a8896362c68d43d2c23752a7fda8885846cdf354571a30887")
      public override fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty.Builder.() -> Unit):
          Unit = hlsS3Settings(HlsS3SettingsProperty(hlsS3Settings))

      public override fun hlsWebdavSettings(hlsWebdavSettings: IResolvable) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings.let(IResolvable::unwrap))
      }

      public override fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings.let(HlsWebdavSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51a72e77c66d4f6e5c1a9f0ca490da16ebc207f7ee5cabcffb332154678ab919")
      public override
          fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty.Builder.() -> Unit):
          Unit = hlsWebdavSettings(HlsWebdavSettingsProperty(hlsWebdavSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty,
    ) : HlsCdnSettingsProperty {
      public override fun hlsAkamaiSettings(): Any? = unwrap(this).getHlsAkamaiSettings()

      public override fun hlsBasicPutSettings(): Any? = unwrap(this).getHlsBasicPutSettings()

      public override fun hlsMediaStoreSettings(): Any? = unwrap(this).getHlsMediaStoreSettings()

      public override fun hlsS3Settings(): Any? = unwrap(this).getHlsS3Settings()

      public override fun hlsWebdavSettings(): Any? = unwrap(this).getHlsWebdavSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsCdnSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty):
          HlsCdnSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsCdnSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HlsWebdavSettingsProperty {
    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun httpTransferMode(): String? = unwrap(this).getHttpTransferMode()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number) {
      }

      public fun filecacheDuration(filecacheDuration: Number) {
      }

      public fun httpTransferMode(httpTransferMode: String) {
      }

      public fun numRetries(numRetries: Number) {
      }

      public fun restartDelay(restartDelay: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty.builder()

      public override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      public override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      public override fun httpTransferMode(httpTransferMode: String) {
        cdkBuilder.httpTransferMode(httpTransferMode)
      }

      public override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      public override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty,
    ) : HlsWebdavSettingsProperty {
      public override fun connectionRetryInterval(): Number? =
          unwrap(this).getConnectionRetryInterval()

      public override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      public override fun httpTransferMode(): String? = unwrap(this).getHttpTransferMode()

      public override fun numRetries(): Number? = unwrap(this).getNumRetries()

      public override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsWebdavSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty):
          HlsWebdavSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsWebdavSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface Fmp4HlsSettingsProperty {
    public fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

    public fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

    public fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

    public interface Builder {
      public fun audioRenditionSets(audioRenditionSets: String) {
      }

      public fun nielsenId3Behavior(nielsenId3Behavior: String) {
      }

      public fun timedMetadataBehavior(timedMetadataBehavior: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty.builder()

      public override fun audioRenditionSets(audioRenditionSets: String) {
        cdkBuilder.audioRenditionSets(audioRenditionSets)
      }

      public override fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
      }

      public override fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty,
    ) : Fmp4HlsSettingsProperty {
      public override fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

      public override fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

      public override fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Fmp4HlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty):
          Fmp4HlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Fmp4HlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UdpOutputSettingsProperty {
    public fun bufferMsec(): Number? = unwrap(this).getBufferMsec()

    public fun containerSettings(): Any? = unwrap(this).getContainerSettings()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun fecOutputSettings(): Any? = unwrap(this).getFecOutputSettings()

    public interface Builder {
      public fun bufferMsec(bufferMsec: Number) {
      }

      public fun containerSettings(containerSettings: IResolvable) {
      }

      public fun containerSettings(containerSettings: UdpContainerSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74df9c597b89bd508144098b540e43dfa8022f2bd985d484a1eba086ebc32fc7")
      public
          fun containerSettings(containerSettings: UdpContainerSettingsProperty.Builder.() -> Unit) {
      }

      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deacb52f4718c51c83188dd4ac73760ed57f512d6d448bf0d172c52f6faeb877")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }

      public fun fecOutputSettings(fecOutputSettings: IResolvable) {
      }

      public fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434432a33c4ebb01fadf3281ed2be04d8ad3c4e59c68e6cfe0d5816c521c690e")
      public
          fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty.builder()

      public override fun bufferMsec(bufferMsec: Number) {
        cdkBuilder.bufferMsec(bufferMsec)
      }

      public override fun containerSettings(containerSettings: IResolvable) {
        cdkBuilder.containerSettings(containerSettings.let(IResolvable::unwrap))
      }

      public override fun containerSettings(containerSettings: UdpContainerSettingsProperty) {
        cdkBuilder.containerSettings(containerSettings.let(UdpContainerSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74df9c597b89bd508144098b540e43dfa8022f2bd985d484a1eba086ebc32fc7")
      public override
          fun containerSettings(containerSettings: UdpContainerSettingsProperty.Builder.() -> Unit):
          Unit = containerSettings(UdpContainerSettingsProperty(containerSettings))

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deacb52f4718c51c83188dd4ac73760ed57f512d6d448bf0d172c52f6faeb877")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public override fun fecOutputSettings(fecOutputSettings: IResolvable) {
        cdkBuilder.fecOutputSettings(fecOutputSettings.let(IResolvable::unwrap))
      }

      public override fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty) {
        cdkBuilder.fecOutputSettings(fecOutputSettings.let(FecOutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434432a33c4ebb01fadf3281ed2be04d8ad3c4e59c68e6cfe0d5816c521c690e")
      public override
          fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty.Builder.() -> Unit):
          Unit = fecOutputSettings(FecOutputSettingsProperty(fecOutputSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty,
    ) : UdpOutputSettingsProperty {
      public override fun bufferMsec(): Number? = unwrap(this).getBufferMsec()

      public override fun containerSettings(): Any? = unwrap(this).getContainerSettings()

      public override fun destination(): Any? = unwrap(this).getDestination()

      public override fun fecOutputSettings(): Any? = unwrap(this).getFecOutputSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UdpOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty):
          UdpOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UdpOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DvbTdtSettingsProperty {
    public fun repInterval(): Number? = unwrap(this).getRepInterval()

    public interface Builder {
      public fun repInterval(repInterval: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty.builder()

      public override fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty,
    ) : DvbTdtSettingsProperty {
      public override fun repInterval(): Number? = unwrap(this).getRepInterval()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DvbTdtSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty):
          DvbTdtSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbTdtSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioDolbyEDecodeProperty {
    public fun programSelection(): String? = unwrap(this).getProgramSelection()

    public interface Builder {
      public fun programSelection(programSelection: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty.builder()

      public override fun programSelection(programSelection: String) {
        cdkBuilder.programSelection(programSelection)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty,
    ) : AudioDolbyEDecodeProperty {
      public override fun programSelection(): String? = unwrap(this).getProgramSelection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioDolbyEDecodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty):
          AudioDolbyEDecodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioDolbyEDecodeProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CaptionSelectorSettingsProperty {
    public fun ancillarySourceSettings(): Any? = unwrap(this).getAncillarySourceSettings()

    public fun aribSourceSettings(): Any? = unwrap(this).getAribSourceSettings()

    public fun dvbSubSourceSettings(): Any? = unwrap(this).getDvbSubSourceSettings()

    public fun embeddedSourceSettings(): Any? = unwrap(this).getEmbeddedSourceSettings()

    public fun scte20SourceSettings(): Any? = unwrap(this).getScte20SourceSettings()

    public fun scte27SourceSettings(): Any? = unwrap(this).getScte27SourceSettings()

    public fun teletextSourceSettings(): Any? = unwrap(this).getTeletextSourceSettings()

    public interface Builder {
      public fun ancillarySourceSettings(ancillarySourceSettings: IResolvable) {
      }

      public fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace4a48d7bddbc87ae7e74bf4826991eaaf5bf6f0356288c5588277551ecbe7e")
      public
          fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty.Builder.() -> Unit) {
      }

      public fun aribSourceSettings(aribSourceSettings: IResolvable) {
      }

      public fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b93ef36dc37fd94de3544d364ca1d2c9c1171053b73456ea794ebfb65cc9c64")
      public
          fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty.Builder.() -> Unit) {
      }

      public fun dvbSubSourceSettings(dvbSubSourceSettings: IResolvable) {
      }

      public fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cfd2c5cbfd735aaef94c13682637afcf8a76e47ac8d223c085a3248ce541ef1")
      public
          fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty.Builder.() -> Unit) {
      }

      public fun embeddedSourceSettings(embeddedSourceSettings: IResolvable) {
      }

      public fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcb575a2e4a1bf74140f84e26c415021cfd67799c5ba8b95ca7fa2367dbc605b")
      public
          fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty.Builder.() -> Unit) {
      }

      public fun scte20SourceSettings(scte20SourceSettings: IResolvable) {
      }

      public fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5602799ca43989f5875f463abe9e8a33a56f5263a515772a0ac402c8b846c41c")
      public
          fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty.Builder.() -> Unit) {
      }

      public fun scte27SourceSettings(scte27SourceSettings: IResolvable) {
      }

      public fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a15d9c6d5a666cc65469dcfc7cd925e9b80a9440f6498bc85f185f66ac8ec7")
      public
          fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty.Builder.() -> Unit) {
      }

      public fun teletextSourceSettings(teletextSourceSettings: IResolvable) {
      }

      public fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5194196ebc9a57e0ce6d3a571e20026bbed3b5ef8624f29ac481c202bdbd44ab")
      public
          fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty.builder()

      public override fun ancillarySourceSettings(ancillarySourceSettings: IResolvable) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings.let(IResolvable::unwrap))
      }

      public override
          fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings.let(AncillarySourceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace4a48d7bddbc87ae7e74bf4826991eaaf5bf6f0356288c5588277551ecbe7e")
      public override
          fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty.Builder.() -> Unit):
          Unit = ancillarySourceSettings(AncillarySourceSettingsProperty(ancillarySourceSettings))

      public override fun aribSourceSettings(aribSourceSettings: IResolvable) {
        cdkBuilder.aribSourceSettings(aribSourceSettings.let(IResolvable::unwrap))
      }

      public override fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty) {
        cdkBuilder.aribSourceSettings(aribSourceSettings.let(AribSourceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b93ef36dc37fd94de3544d364ca1d2c9c1171053b73456ea794ebfb65cc9c64")
      public override
          fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty.Builder.() -> Unit):
          Unit = aribSourceSettings(AribSourceSettingsProperty(aribSourceSettings))

      public override fun dvbSubSourceSettings(dvbSubSourceSettings: IResolvable) {
        cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings.let(IResolvable::unwrap))
      }

      public override fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty) {
        cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings.let(DvbSubSourceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cfd2c5cbfd735aaef94c13682637afcf8a76e47ac8d223c085a3248ce541ef1")
      public override
          fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty.Builder.() -> Unit):
          Unit = dvbSubSourceSettings(DvbSubSourceSettingsProperty(dvbSubSourceSettings))

      public override fun embeddedSourceSettings(embeddedSourceSettings: IResolvable) {
        cdkBuilder.embeddedSourceSettings(embeddedSourceSettings.let(IResolvable::unwrap))
      }

      public override
          fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty) {
        cdkBuilder.embeddedSourceSettings(embeddedSourceSettings.let(EmbeddedSourceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcb575a2e4a1bf74140f84e26c415021cfd67799c5ba8b95ca7fa2367dbc605b")
      public override
          fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty.Builder.() -> Unit):
          Unit = embeddedSourceSettings(EmbeddedSourceSettingsProperty(embeddedSourceSettings))

      public override fun scte20SourceSettings(scte20SourceSettings: IResolvable) {
        cdkBuilder.scte20SourceSettings(scte20SourceSettings.let(IResolvable::unwrap))
      }

      public override fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty) {
        cdkBuilder.scte20SourceSettings(scte20SourceSettings.let(Scte20SourceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5602799ca43989f5875f463abe9e8a33a56f5263a515772a0ac402c8b846c41c")
      public override
          fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty.Builder.() -> Unit):
          Unit = scte20SourceSettings(Scte20SourceSettingsProperty(scte20SourceSettings))

      public override fun scte27SourceSettings(scte27SourceSettings: IResolvable) {
        cdkBuilder.scte27SourceSettings(scte27SourceSettings.let(IResolvable::unwrap))
      }

      public override fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty) {
        cdkBuilder.scte27SourceSettings(scte27SourceSettings.let(Scte27SourceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a15d9c6d5a666cc65469dcfc7cd925e9b80a9440f6498bc85f185f66ac8ec7")
      public override
          fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty.Builder.() -> Unit):
          Unit = scte27SourceSettings(Scte27SourceSettingsProperty(scte27SourceSettings))

      public override fun teletextSourceSettings(teletextSourceSettings: IResolvable) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings.let(IResolvable::unwrap))
      }

      public override
          fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings.let(TeletextSourceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5194196ebc9a57e0ce6d3a571e20026bbed3b5ef8624f29ac481c202bdbd44ab")
      public override
          fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty.Builder.() -> Unit):
          Unit = teletextSourceSettings(TeletextSourceSettingsProperty(teletextSourceSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty,
    ) : CaptionSelectorSettingsProperty {
      public override fun ancillarySourceSettings(): Any? =
          unwrap(this).getAncillarySourceSettings()

      public override fun aribSourceSettings(): Any? = unwrap(this).getAribSourceSettings()

      public override fun dvbSubSourceSettings(): Any? = unwrap(this).getDvbSubSourceSettings()

      public override fun embeddedSourceSettings(): Any? = unwrap(this).getEmbeddedSourceSettings()

      public override fun scte20SourceSettings(): Any? = unwrap(this).getScte20SourceSettings()

      public override fun scte27SourceSettings(): Any? = unwrap(this).getScte27SourceSettings()

      public override fun teletextSourceSettings(): Any? = unwrap(this).getTeletextSourceSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionSelectorSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty):
          CaptionSelectorSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionSelectorSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ArchiveS3SettingsProperty {
    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    public interface Builder {
      public fun cannedAcl(cannedAcl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty.builder()

      public override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty,
    ) : ArchiveS3SettingsProperty {
      public override fun cannedAcl(): String? = unwrap(this).getCannedAcl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveS3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty):
          ArchiveS3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveS3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AacSettingsProperty {
    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun inputType(): String? = unwrap(this).getInputType()

    public fun profile(): String? = unwrap(this).getProfile()

    public fun rateControlMode(): String? = unwrap(this).getRateControlMode()

    public fun rawFormat(): String? = unwrap(this).getRawFormat()

    public fun sampleRate(): Number? = unwrap(this).getSampleRate()

    public fun spec(): String? = unwrap(this).getSpec()

    public fun vbrQuality(): String? = unwrap(this).getVbrQuality()

    public interface Builder {
      public fun bitrate(bitrate: Number) {
      }

      public fun codingMode(codingMode: String) {
      }

      public fun inputType(inputType: String) {
      }

      public fun profile(profile: String) {
      }

      public fun rateControlMode(rateControlMode: String) {
      }

      public fun rawFormat(rawFormat: String) {
      }

      public fun sampleRate(sampleRate: Number) {
      }

      public fun spec(spec: String) {
      }

      public fun vbrQuality(vbrQuality: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty.builder()

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      public override fun inputType(inputType: String) {
        cdkBuilder.inputType(inputType)
      }

      public override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      public override fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
      }

      public override fun rawFormat(rawFormat: String) {
        cdkBuilder.rawFormat(rawFormat)
      }

      public override fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
      }

      public override fun spec(spec: String) {
        cdkBuilder.spec(spec)
      }

      public override fun vbrQuality(vbrQuality: String) {
        cdkBuilder.vbrQuality(vbrQuality)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty,
    ) : AacSettingsProperty {
      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun codingMode(): String? = unwrap(this).getCodingMode()

      public override fun inputType(): String? = unwrap(this).getInputType()

      public override fun profile(): String? = unwrap(this).getProfile()

      public override fun rateControlMode(): String? = unwrap(this).getRateControlMode()

      public override fun rawFormat(): String? = unwrap(this).getRawFormat()

      public override fun sampleRate(): Number? = unwrap(this).getSampleRate()

      public override fun spec(): String? = unwrap(this).getSpec()

      public override fun vbrQuality(): String? = unwrap(this).getVbrQuality()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AacSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty):
          AacSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AacSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface H265SettingsProperty {
    public fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

    public fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

    public fun alternativeTransferFunction(): String? =
        unwrap(this).getAlternativeTransferFunction()

    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun bufSize(): Number? = unwrap(this).getBufSize()

    public fun colorMetadata(): String? = unwrap(this).getColorMetadata()

    public fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

    public fun filterSettings(): Any? = unwrap(this).getFilterSettings()

    public fun fixedAfd(): String? = unwrap(this).getFixedAfd()

    public fun flickerAq(): String? = unwrap(this).getFlickerAq()

    public fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

    public fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

    public fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

    public fun gopSize(): Number? = unwrap(this).getGopSize()

    public fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

    public fun level(): String? = unwrap(this).getLevel()

    public fun lookAheadRateControl(): String? = unwrap(this).getLookAheadRateControl()

    public fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

    public fun minIInterval(): Number? = unwrap(this).getMinIInterval()

    public fun parDenominator(): Number? = unwrap(this).getParDenominator()

    public fun parNumerator(): Number? = unwrap(this).getParNumerator()

    public fun profile(): String? = unwrap(this).getProfile()

    public fun qvbrQualityLevel(): Number? = unwrap(this).getQvbrQualityLevel()

    public fun rateControlMode(): String? = unwrap(this).getRateControlMode()

    public fun scanType(): String? = unwrap(this).getScanType()

    public fun sceneChangeDetect(): String? = unwrap(this).getSceneChangeDetect()

    public fun slices(): Number? = unwrap(this).getSlices()

    public fun tier(): String? = unwrap(this).getTier()

    public fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

    public fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()

    public interface Builder {
      public fun adaptiveQuantization(adaptiveQuantization: String) {
      }

      public fun afdSignaling(afdSignaling: String) {
      }

      public fun alternativeTransferFunction(alternativeTransferFunction: String) {
      }

      public fun bitrate(bitrate: Number) {
      }

      public fun bufSize(bufSize: Number) {
      }

      public fun colorMetadata(colorMetadata: String) {
      }

      public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
      }

      public fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22b5ddf68b7d0a76417cb7aa87c2962ef416eb8ee445b05fc707a427ba970267")
      public
          fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty.Builder.() -> Unit) {
      }

      public fun filterSettings(filterSettings: IResolvable) {
      }

      public fun filterSettings(filterSettings: H265FilterSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b1a86e61ef9760f486b657eb28e69c07d1c4f58d8b4b48025f01936218d6947")
      public fun filterSettings(filterSettings: H265FilterSettingsProperty.Builder.() -> Unit) {
      }

      public fun fixedAfd(fixedAfd: String) {
      }

      public fun flickerAq(flickerAq: String) {
      }

      public fun framerateDenominator(framerateDenominator: Number) {
      }

      public fun framerateNumerator(framerateNumerator: Number) {
      }

      public fun gopClosedCadence(gopClosedCadence: Number) {
      }

      public fun gopSize(gopSize: Number) {
      }

      public fun gopSizeUnits(gopSizeUnits: String) {
      }

      public fun level(level: String) {
      }

      public fun lookAheadRateControl(lookAheadRateControl: String) {
      }

      public fun maxBitrate(maxBitrate: Number) {
      }

      public fun minIInterval(minIInterval: Number) {
      }

      public fun parDenominator(parDenominator: Number) {
      }

      public fun parNumerator(parNumerator: Number) {
      }

      public fun profile(profile: String) {
      }

      public fun qvbrQualityLevel(qvbrQualityLevel: Number) {
      }

      public fun rateControlMode(rateControlMode: String) {
      }

      public fun scanType(scanType: String) {
      }

      public fun sceneChangeDetect(sceneChangeDetect: String) {
      }

      public fun slices(slices: Number) {
      }

      public fun tier(tier: String) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04610e4a9dbce0540320e1fc4806b5539e5ba8c856e69ea2953f7f2cdd2780a1")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit) {
      }

      public fun timecodeInsertion(timecodeInsertion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty.builder()

      public override fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
      }

      public override fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
      }

      public override fun alternativeTransferFunction(alternativeTransferFunction: String) {
        cdkBuilder.alternativeTransferFunction(alternativeTransferFunction)
      }

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun bufSize(bufSize: Number) {
        cdkBuilder.bufSize(bufSize)
      }

      public override fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
      }

      public override fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(IResolvable::unwrap))
      }

      public override fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(H265ColorSpaceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22b5ddf68b7d0a76417cb7aa87c2962ef416eb8ee445b05fc707a427ba970267")
      public override
          fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty.Builder.() -> Unit):
          Unit = colorSpaceSettings(H265ColorSpaceSettingsProperty(colorSpaceSettings))

      public override fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings.let(IResolvable::unwrap))
      }

      public override fun filterSettings(filterSettings: H265FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings.let(H265FilterSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b1a86e61ef9760f486b657eb28e69c07d1c4f58d8b4b48025f01936218d6947")
      public override
          fun filterSettings(filterSettings: H265FilterSettingsProperty.Builder.() -> Unit): Unit =
          filterSettings(H265FilterSettingsProperty(filterSettings))

      public override fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
      }

      public override fun flickerAq(flickerAq: String) {
        cdkBuilder.flickerAq(flickerAq)
      }

      public override fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
      }

      public override fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
      }

      public override fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
      }

      public override fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
      }

      public override fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
      }

      public override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public override fun lookAheadRateControl(lookAheadRateControl: String) {
        cdkBuilder.lookAheadRateControl(lookAheadRateControl)
      }

      public override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      public override fun minIInterval(minIInterval: Number) {
        cdkBuilder.minIInterval(minIInterval)
      }

      public override fun parDenominator(parDenominator: Number) {
        cdkBuilder.parDenominator(parDenominator)
      }

      public override fun parNumerator(parNumerator: Number) {
        cdkBuilder.parNumerator(parNumerator)
      }

      public override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      public override fun qvbrQualityLevel(qvbrQualityLevel: Number) {
        cdkBuilder.qvbrQualityLevel(qvbrQualityLevel)
      }

      public override fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
      }

      public override fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
      }

      public override fun sceneChangeDetect(sceneChangeDetect: String) {
        cdkBuilder.sceneChangeDetect(sceneChangeDetect)
      }

      public override fun slices(slices: Number) {
        cdkBuilder.slices(slices)
      }

      public override fun tier(tier: String) {
        cdkBuilder.tier(tier)
      }

      public override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04610e4a9dbce0540320e1fc4806b5539e5ba8c856e69ea2953f7f2cdd2780a1")
      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      public override fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty,
    ) : H265SettingsProperty {
      public override fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

      public override fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

      public override fun alternativeTransferFunction(): String? =
          unwrap(this).getAlternativeTransferFunction()

      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun bufSize(): Number? = unwrap(this).getBufSize()

      public override fun colorMetadata(): String? = unwrap(this).getColorMetadata()

      public override fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

      public override fun filterSettings(): Any? = unwrap(this).getFilterSettings()

      public override fun fixedAfd(): String? = unwrap(this).getFixedAfd()

      public override fun flickerAq(): String? = unwrap(this).getFlickerAq()

      public override fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

      public override fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

      public override fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

      public override fun gopSize(): Number? = unwrap(this).getGopSize()

      public override fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

      public override fun level(): String? = unwrap(this).getLevel()

      public override fun lookAheadRateControl(): String? = unwrap(this).getLookAheadRateControl()

      public override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

      public override fun minIInterval(): Number? = unwrap(this).getMinIInterval()

      public override fun parDenominator(): Number? = unwrap(this).getParDenominator()

      public override fun parNumerator(): Number? = unwrap(this).getParNumerator()

      public override fun profile(): String? = unwrap(this).getProfile()

      public override fun qvbrQualityLevel(): Number? = unwrap(this).getQvbrQualityLevel()

      public override fun rateControlMode(): String? = unwrap(this).getRateControlMode()

      public override fun scanType(): String? = unwrap(this).getScanType()

      public override fun sceneChangeDetect(): String? = unwrap(this).getSceneChangeDetect()

      public override fun slices(): Number? = unwrap(this).getSlices()

      public override fun tier(): String? = unwrap(this).getTier()

      public override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

      public override fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): H265SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty):
          H265SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H265SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MultiplexGroupSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty,
    ) : MultiplexGroupSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty):
          MultiplexGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AvailBlankingProperty {
    public fun availBlankingImage(): Any? = unwrap(this).getAvailBlankingImage()

    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun availBlankingImage(availBlankingImage: IResolvable) {
      }

      public fun availBlankingImage(availBlankingImage: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac579c524f824b06d7349c8cced246b66e95444570e4303f02723bc77a6c9e68")
      public fun availBlankingImage(availBlankingImage: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun state(state: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty.builder()

      public override fun availBlankingImage(availBlankingImage: IResolvable) {
        cdkBuilder.availBlankingImage(availBlankingImage.let(IResolvable::unwrap))
      }

      public override fun availBlankingImage(availBlankingImage: InputLocationProperty) {
        cdkBuilder.availBlankingImage(availBlankingImage.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac579c524f824b06d7349c8cced246b66e95444570e4303f02723bc77a6c9e68")
      public override
          fun availBlankingImage(availBlankingImage: InputLocationProperty.Builder.() -> Unit): Unit
          = availBlankingImage(InputLocationProperty(availBlankingImage))

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty,
    ) : AvailBlankingProperty {
      public override fun availBlankingImage(): Any? = unwrap(this).getAvailBlankingImage()

      public override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AvailBlankingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty):
          AvailBlankingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AvailBlankingProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioLanguageSelectionProperty {
    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun languageSelectionPolicy(): String? = unwrap(this).getLanguageSelectionPolicy()

    public interface Builder {
      public fun languageCode(languageCode: String) {
      }

      public fun languageSelectionPolicy(languageSelectionPolicy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty.builder()

      public override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      public override fun languageSelectionPolicy(languageSelectionPolicy: String) {
        cdkBuilder.languageSelectionPolicy(languageSelectionPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty,
    ) : AudioLanguageSelectionProperty {
      public override fun languageCode(): String? = unwrap(this).getLanguageCode()

      public override fun languageSelectionPolicy(): String? =
          unwrap(this).getLanguageSelectionPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLanguageSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty):
          AudioLanguageSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLanguageSelectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputChannelLevelProperty {
    public fun gain(): Number? = unwrap(this).getGain()

    public fun inputChannel(): Number? = unwrap(this).getInputChannel()

    public interface Builder {
      public fun gain(gain: Number) {
      }

      public fun inputChannel(inputChannel: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty.builder()

      public override fun gain(gain: Number) {
        cdkBuilder.gain(gain)
      }

      public override fun inputChannel(inputChannel: Number) {
        cdkBuilder.inputChannel(inputChannel)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty,
    ) : InputChannelLevelProperty {
      public override fun gain(): Number? = unwrap(this).getGain()

      public override fun inputChannel(): Number? = unwrap(this).getInputChannel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputChannelLevelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty):
          InputChannelLevelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputChannelLevelProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface M2tsSettingsProperty {
    public fun absentInputAudioBehavior(): String? = unwrap(this).getAbsentInputAudioBehavior()

    public fun arib(): String? = unwrap(this).getArib()

    public fun aribCaptionsPid(): String? = unwrap(this).getAribCaptionsPid()

    public fun aribCaptionsPidControl(): String? = unwrap(this).getAribCaptionsPidControl()

    public fun audioBufferModel(): String? = unwrap(this).getAudioBufferModel()

    public fun audioFramesPerPes(): Number? = unwrap(this).getAudioFramesPerPes()

    public fun audioPids(): String? = unwrap(this).getAudioPids()

    public fun audioStreamType(): String? = unwrap(this).getAudioStreamType()

    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun bufferModel(): String? = unwrap(this).getBufferModel()

    public fun ccDescriptor(): String? = unwrap(this).getCcDescriptor()

    public fun dvbNitSettings(): Any? = unwrap(this).getDvbNitSettings()

    public fun dvbSdtSettings(): Any? = unwrap(this).getDvbSdtSettings()

    public fun dvbSubPids(): String? = unwrap(this).getDvbSubPids()

    public fun dvbTdtSettings(): Any? = unwrap(this).getDvbTdtSettings()

    public fun dvbTeletextPid(): String? = unwrap(this).getDvbTeletextPid()

    public fun ebif(): String? = unwrap(this).getEbif()

    public fun ebpAudioInterval(): String? = unwrap(this).getEbpAudioInterval()

    public fun ebpLookaheadMs(): Number? = unwrap(this).getEbpLookaheadMs()

    public fun ebpPlacement(): String? = unwrap(this).getEbpPlacement()

    public fun ecmPid(): String? = unwrap(this).getEcmPid()

    public fun esRateInPes(): String? = unwrap(this).getEsRateInPes()

    public fun etvPlatformPid(): String? = unwrap(this).getEtvPlatformPid()

    public fun etvSignalPid(): String? = unwrap(this).getEtvSignalPid()

    public fun fragmentTime(): Number? = unwrap(this).getFragmentTime()

    public fun klv(): String? = unwrap(this).getKlv()

    public fun klvDataPids(): String? = unwrap(this).getKlvDataPids()

    public fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

    public fun nullPacketBitrate(): Number? = unwrap(this).getNullPacketBitrate()

    public fun patInterval(): Number? = unwrap(this).getPatInterval()

    public fun pcrControl(): String? = unwrap(this).getPcrControl()

    public fun pcrPeriod(): Number? = unwrap(this).getPcrPeriod()

    public fun pcrPid(): String? = unwrap(this).getPcrPid()

    public fun pmtInterval(): Number? = unwrap(this).getPmtInterval()

    public fun pmtPid(): String? = unwrap(this).getPmtPid()

    public fun programNum(): Number? = unwrap(this).getProgramNum()

    public fun rateMode(): String? = unwrap(this).getRateMode()

    public fun scte27Pids(): String? = unwrap(this).getScte27Pids()

    public fun scte35Control(): String? = unwrap(this).getScte35Control()

    public fun scte35Pid(): String? = unwrap(this).getScte35Pid()

    public fun scte35PrerollPullupMilliseconds(): Number? =
        unwrap(this).getScte35PrerollPullupMilliseconds()

    public fun segmentationMarkers(): String? = unwrap(this).getSegmentationMarkers()

    public fun segmentationStyle(): String? = unwrap(this).getSegmentationStyle()

    public fun segmentationTime(): Number? = unwrap(this).getSegmentationTime()

    public fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

    public fun timedMetadataPid(): String? = unwrap(this).getTimedMetadataPid()

    public fun transportStreamId(): Number? = unwrap(this).getTransportStreamId()

    public fun videoPid(): String? = unwrap(this).getVideoPid()

    public interface Builder {
      public fun absentInputAudioBehavior(absentInputAudioBehavior: String) {
      }

      public fun arib(arib: String) {
      }

      public fun aribCaptionsPid(aribCaptionsPid: String) {
      }

      public fun aribCaptionsPidControl(aribCaptionsPidControl: String) {
      }

      public fun audioBufferModel(audioBufferModel: String) {
      }

      public fun audioFramesPerPes(audioFramesPerPes: Number) {
      }

      public fun audioPids(audioPids: String) {
      }

      public fun audioStreamType(audioStreamType: String) {
      }

      public fun bitrate(bitrate: Number) {
      }

      public fun bufferModel(bufferModel: String) {
      }

      public fun ccDescriptor(ccDescriptor: String) {
      }

      public fun dvbNitSettings(dvbNitSettings: IResolvable) {
      }

      public fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f54fa6b4608e98d8aad0cbc872cd3872c1756045c8c6b6291d0df0ede0396d4")
      public fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty.Builder.() -> Unit) {
      }

      public fun dvbSdtSettings(dvbSdtSettings: IResolvable) {
      }

      public fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579bf1784c3c8a484a23bc2b64fea0c0481a64750412977246e839cbdc15314e")
      public fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty.Builder.() -> Unit) {
      }

      public fun dvbSubPids(dvbSubPids: String) {
      }

      public fun dvbTdtSettings(dvbTdtSettings: IResolvable) {
      }

      public fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d22f099001de97bf51423f044364514090d55e7972d8923c76aaa09cfed27dce")
      public fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty.Builder.() -> Unit) {
      }

      public fun dvbTeletextPid(dvbTeletextPid: String) {
      }

      public fun ebif(ebif: String) {
      }

      public fun ebpAudioInterval(ebpAudioInterval: String) {
      }

      public fun ebpLookaheadMs(ebpLookaheadMs: Number) {
      }

      public fun ebpPlacement(ebpPlacement: String) {
      }

      public fun ecmPid(ecmPid: String) {
      }

      public fun esRateInPes(esRateInPes: String) {
      }

      public fun etvPlatformPid(etvPlatformPid: String) {
      }

      public fun etvSignalPid(etvSignalPid: String) {
      }

      public fun fragmentTime(fragmentTime: Number) {
      }

      public fun klv(klv: String) {
      }

      public fun klvDataPids(klvDataPids: String) {
      }

      public fun nielsenId3Behavior(nielsenId3Behavior: String) {
      }

      public fun nullPacketBitrate(nullPacketBitrate: Number) {
      }

      public fun patInterval(patInterval: Number) {
      }

      public fun pcrControl(pcrControl: String) {
      }

      public fun pcrPeriod(pcrPeriod: Number) {
      }

      public fun pcrPid(pcrPid: String) {
      }

      public fun pmtInterval(pmtInterval: Number) {
      }

      public fun pmtPid(pmtPid: String) {
      }

      public fun programNum(programNum: Number) {
      }

      public fun rateMode(rateMode: String) {
      }

      public fun scte27Pids(scte27Pids: String) {
      }

      public fun scte35Control(scte35Control: String) {
      }

      public fun scte35Pid(scte35Pid: String) {
      }

      public fun scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds: Number) {
      }

      public fun segmentationMarkers(segmentationMarkers: String) {
      }

      public fun segmentationStyle(segmentationStyle: String) {
      }

      public fun segmentationTime(segmentationTime: Number) {
      }

      public fun timedMetadataBehavior(timedMetadataBehavior: String) {
      }

      public fun timedMetadataPid(timedMetadataPid: String) {
      }

      public fun transportStreamId(transportStreamId: Number) {
      }

      public fun videoPid(videoPid: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty.builder()

      public override fun absentInputAudioBehavior(absentInputAudioBehavior: String) {
        cdkBuilder.absentInputAudioBehavior(absentInputAudioBehavior)
      }

      public override fun arib(arib: String) {
        cdkBuilder.arib(arib)
      }

      public override fun aribCaptionsPid(aribCaptionsPid: String) {
        cdkBuilder.aribCaptionsPid(aribCaptionsPid)
      }

      public override fun aribCaptionsPidControl(aribCaptionsPidControl: String) {
        cdkBuilder.aribCaptionsPidControl(aribCaptionsPidControl)
      }

      public override fun audioBufferModel(audioBufferModel: String) {
        cdkBuilder.audioBufferModel(audioBufferModel)
      }

      public override fun audioFramesPerPes(audioFramesPerPes: Number) {
        cdkBuilder.audioFramesPerPes(audioFramesPerPes)
      }

      public override fun audioPids(audioPids: String) {
        cdkBuilder.audioPids(audioPids)
      }

      public override fun audioStreamType(audioStreamType: String) {
        cdkBuilder.audioStreamType(audioStreamType)
      }

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun bufferModel(bufferModel: String) {
        cdkBuilder.bufferModel(bufferModel)
      }

      public override fun ccDescriptor(ccDescriptor: String) {
        cdkBuilder.ccDescriptor(ccDescriptor)
      }

      public override fun dvbNitSettings(dvbNitSettings: IResolvable) {
        cdkBuilder.dvbNitSettings(dvbNitSettings.let(IResolvable::unwrap))
      }

      public override fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty) {
        cdkBuilder.dvbNitSettings(dvbNitSettings.let(DvbNitSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f54fa6b4608e98d8aad0cbc872cd3872c1756045c8c6b6291d0df0ede0396d4")
      public override fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty.Builder.() -> Unit):
          Unit = dvbNitSettings(DvbNitSettingsProperty(dvbNitSettings))

      public override fun dvbSdtSettings(dvbSdtSettings: IResolvable) {
        cdkBuilder.dvbSdtSettings(dvbSdtSettings.let(IResolvable::unwrap))
      }

      public override fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty) {
        cdkBuilder.dvbSdtSettings(dvbSdtSettings.let(DvbSdtSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579bf1784c3c8a484a23bc2b64fea0c0481a64750412977246e839cbdc15314e")
      public override fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty.Builder.() -> Unit):
          Unit = dvbSdtSettings(DvbSdtSettingsProperty(dvbSdtSettings))

      public override fun dvbSubPids(dvbSubPids: String) {
        cdkBuilder.dvbSubPids(dvbSubPids)
      }

      public override fun dvbTdtSettings(dvbTdtSettings: IResolvable) {
        cdkBuilder.dvbTdtSettings(dvbTdtSettings.let(IResolvable::unwrap))
      }

      public override fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty) {
        cdkBuilder.dvbTdtSettings(dvbTdtSettings.let(DvbTdtSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d22f099001de97bf51423f044364514090d55e7972d8923c76aaa09cfed27dce")
      public override fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty.Builder.() -> Unit):
          Unit = dvbTdtSettings(DvbTdtSettingsProperty(dvbTdtSettings))

      public override fun dvbTeletextPid(dvbTeletextPid: String) {
        cdkBuilder.dvbTeletextPid(dvbTeletextPid)
      }

      public override fun ebif(ebif: String) {
        cdkBuilder.ebif(ebif)
      }

      public override fun ebpAudioInterval(ebpAudioInterval: String) {
        cdkBuilder.ebpAudioInterval(ebpAudioInterval)
      }

      public override fun ebpLookaheadMs(ebpLookaheadMs: Number) {
        cdkBuilder.ebpLookaheadMs(ebpLookaheadMs)
      }

      public override fun ebpPlacement(ebpPlacement: String) {
        cdkBuilder.ebpPlacement(ebpPlacement)
      }

      public override fun ecmPid(ecmPid: String) {
        cdkBuilder.ecmPid(ecmPid)
      }

      public override fun esRateInPes(esRateInPes: String) {
        cdkBuilder.esRateInPes(esRateInPes)
      }

      public override fun etvPlatformPid(etvPlatformPid: String) {
        cdkBuilder.etvPlatformPid(etvPlatformPid)
      }

      public override fun etvSignalPid(etvSignalPid: String) {
        cdkBuilder.etvSignalPid(etvSignalPid)
      }

      public override fun fragmentTime(fragmentTime: Number) {
        cdkBuilder.fragmentTime(fragmentTime)
      }

      public override fun klv(klv: String) {
        cdkBuilder.klv(klv)
      }

      public override fun klvDataPids(klvDataPids: String) {
        cdkBuilder.klvDataPids(klvDataPids)
      }

      public override fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
      }

      public override fun nullPacketBitrate(nullPacketBitrate: Number) {
        cdkBuilder.nullPacketBitrate(nullPacketBitrate)
      }

      public override fun patInterval(patInterval: Number) {
        cdkBuilder.patInterval(patInterval)
      }

      public override fun pcrControl(pcrControl: String) {
        cdkBuilder.pcrControl(pcrControl)
      }

      public override fun pcrPeriod(pcrPeriod: Number) {
        cdkBuilder.pcrPeriod(pcrPeriod)
      }

      public override fun pcrPid(pcrPid: String) {
        cdkBuilder.pcrPid(pcrPid)
      }

      public override fun pmtInterval(pmtInterval: Number) {
        cdkBuilder.pmtInterval(pmtInterval)
      }

      public override fun pmtPid(pmtPid: String) {
        cdkBuilder.pmtPid(pmtPid)
      }

      public override fun programNum(programNum: Number) {
        cdkBuilder.programNum(programNum)
      }

      public override fun rateMode(rateMode: String) {
        cdkBuilder.rateMode(rateMode)
      }

      public override fun scte27Pids(scte27Pids: String) {
        cdkBuilder.scte27Pids(scte27Pids)
      }

      public override fun scte35Control(scte35Control: String) {
        cdkBuilder.scte35Control(scte35Control)
      }

      public override fun scte35Pid(scte35Pid: String) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      public override fun scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds: Number) {
        cdkBuilder.scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds)
      }

      public override fun segmentationMarkers(segmentationMarkers: String) {
        cdkBuilder.segmentationMarkers(segmentationMarkers)
      }

      public override fun segmentationStyle(segmentationStyle: String) {
        cdkBuilder.segmentationStyle(segmentationStyle)
      }

      public override fun segmentationTime(segmentationTime: Number) {
        cdkBuilder.segmentationTime(segmentationTime)
      }

      public override fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
      }

      public override fun timedMetadataPid(timedMetadataPid: String) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
      }

      public override fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
      }

      public override fun videoPid(videoPid: String) {
        cdkBuilder.videoPid(videoPid)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty,
    ) : M2tsSettingsProperty {
      public override fun absentInputAudioBehavior(): String? =
          unwrap(this).getAbsentInputAudioBehavior()

      public override fun arib(): String? = unwrap(this).getArib()

      public override fun aribCaptionsPid(): String? = unwrap(this).getAribCaptionsPid()

      public override fun aribCaptionsPidControl(): String? =
          unwrap(this).getAribCaptionsPidControl()

      public override fun audioBufferModel(): String? = unwrap(this).getAudioBufferModel()

      public override fun audioFramesPerPes(): Number? = unwrap(this).getAudioFramesPerPes()

      public override fun audioPids(): String? = unwrap(this).getAudioPids()

      public override fun audioStreamType(): String? = unwrap(this).getAudioStreamType()

      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun bufferModel(): String? = unwrap(this).getBufferModel()

      public override fun ccDescriptor(): String? = unwrap(this).getCcDescriptor()

      public override fun dvbNitSettings(): Any? = unwrap(this).getDvbNitSettings()

      public override fun dvbSdtSettings(): Any? = unwrap(this).getDvbSdtSettings()

      public override fun dvbSubPids(): String? = unwrap(this).getDvbSubPids()

      public override fun dvbTdtSettings(): Any? = unwrap(this).getDvbTdtSettings()

      public override fun dvbTeletextPid(): String? = unwrap(this).getDvbTeletextPid()

      public override fun ebif(): String? = unwrap(this).getEbif()

      public override fun ebpAudioInterval(): String? = unwrap(this).getEbpAudioInterval()

      public override fun ebpLookaheadMs(): Number? = unwrap(this).getEbpLookaheadMs()

      public override fun ebpPlacement(): String? = unwrap(this).getEbpPlacement()

      public override fun ecmPid(): String? = unwrap(this).getEcmPid()

      public override fun esRateInPes(): String? = unwrap(this).getEsRateInPes()

      public override fun etvPlatformPid(): String? = unwrap(this).getEtvPlatformPid()

      public override fun etvSignalPid(): String? = unwrap(this).getEtvSignalPid()

      public override fun fragmentTime(): Number? = unwrap(this).getFragmentTime()

      public override fun klv(): String? = unwrap(this).getKlv()

      public override fun klvDataPids(): String? = unwrap(this).getKlvDataPids()

      public override fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

      public override fun nullPacketBitrate(): Number? = unwrap(this).getNullPacketBitrate()

      public override fun patInterval(): Number? = unwrap(this).getPatInterval()

      public override fun pcrControl(): String? = unwrap(this).getPcrControl()

      public override fun pcrPeriod(): Number? = unwrap(this).getPcrPeriod()

      public override fun pcrPid(): String? = unwrap(this).getPcrPid()

      public override fun pmtInterval(): Number? = unwrap(this).getPmtInterval()

      public override fun pmtPid(): String? = unwrap(this).getPmtPid()

      public override fun programNum(): Number? = unwrap(this).getProgramNum()

      public override fun rateMode(): String? = unwrap(this).getRateMode()

      public override fun scte27Pids(): String? = unwrap(this).getScte27Pids()

      public override fun scte35Control(): String? = unwrap(this).getScte35Control()

      public override fun scte35Pid(): String? = unwrap(this).getScte35Pid()

      public override fun scte35PrerollPullupMilliseconds(): Number? =
          unwrap(this).getScte35PrerollPullupMilliseconds()

      public override fun segmentationMarkers(): String? = unwrap(this).getSegmentationMarkers()

      public override fun segmentationStyle(): String? = unwrap(this).getSegmentationStyle()

      public override fun segmentationTime(): Number? = unwrap(this).getSegmentationTime()

      public override fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

      public override fun timedMetadataPid(): String? = unwrap(this).getTimedMetadataPid()

      public override fun transportStreamId(): Number? = unwrap(this).getTransportStreamId()

      public override fun videoPid(): String? = unwrap(this).getVideoPid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): M2tsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty):
          M2tsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: M2tsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcOutputSettingsProperty {
    public fun publicAddressAllocationIds(): List<String> =
        unwrap(this).getPublicAddressAllocationIds() ?: emptyList()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun publicAddressAllocationIds(publicAddressAllocationIds: List<String>) {
      }

      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty.builder()

      public override fun publicAddressAllocationIds(publicAddressAllocationIds: List<String>) {
        cdkBuilder.publicAddressAllocationIds(publicAddressAllocationIds)
      }

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty,
    ) : VpcOutputSettingsProperty {
      public override fun publicAddressAllocationIds(): List<String> =
          unwrap(this).getPublicAddressAllocationIds() ?: emptyList()

      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty):
          VpcOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AudioSilenceFailoverSettingsProperty {
    public fun audioSelectorName(): String? = unwrap(this).getAudioSelectorName()

    public fun audioSilenceThresholdMsec(): Number? = unwrap(this).getAudioSilenceThresholdMsec()

    public interface Builder {
      public fun audioSelectorName(audioSelectorName: String) {
      }

      public fun audioSilenceThresholdMsec(audioSilenceThresholdMsec: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty.builder()

      public override fun audioSelectorName(audioSelectorName: String) {
        cdkBuilder.audioSelectorName(audioSelectorName)
      }

      public override fun audioSilenceThresholdMsec(audioSilenceThresholdMsec: Number) {
        cdkBuilder.audioSilenceThresholdMsec(audioSilenceThresholdMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty,
    ) : AudioSilenceFailoverSettingsProperty {
      public override fun audioSelectorName(): String? = unwrap(this).getAudioSelectorName()

      public override fun audioSilenceThresholdMsec(): Number? =
          unwrap(this).getAudioSilenceThresholdMsec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioSilenceFailoverSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty):
          AudioSilenceFailoverSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioSilenceFailoverSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ThumbnailConfigurationProperty {
    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun state(state: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty.builder()

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty,
    ) : ThumbnailConfigurationProperty {
      public override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThumbnailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty):
          ThumbnailConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThumbnailConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RtmpGroupSettingsProperty {
    public fun adMarkers(): List<String> = unwrap(this).getAdMarkers() ?: emptyList()

    public fun authenticationScheme(): String? = unwrap(this).getAuthenticationScheme()

    public fun cacheFullBehavior(): String? = unwrap(this).getCacheFullBehavior()

    public fun cacheLength(): Number? = unwrap(this).getCacheLength()

    public fun captionData(): String? = unwrap(this).getCaptionData()

    public fun includeFillerNalUnits(): String? = unwrap(this).getIncludeFillerNalUnits()

    public fun inputLossAction(): String? = unwrap(this).getInputLossAction()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    public interface Builder {
      public fun adMarkers(adMarkers: List<String>) {
      }

      public fun authenticationScheme(authenticationScheme: String) {
      }

      public fun cacheFullBehavior(cacheFullBehavior: String) {
      }

      public fun cacheLength(cacheLength: Number) {
      }

      public fun captionData(captionData: String) {
      }

      public fun includeFillerNalUnits(includeFillerNalUnits: String) {
      }

      public fun inputLossAction(inputLossAction: String) {
      }

      public fun restartDelay(restartDelay: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty.builder()

      public override fun adMarkers(adMarkers: List<String>) {
        cdkBuilder.adMarkers(adMarkers)
      }

      public override fun authenticationScheme(authenticationScheme: String) {
        cdkBuilder.authenticationScheme(authenticationScheme)
      }

      public override fun cacheFullBehavior(cacheFullBehavior: String) {
        cdkBuilder.cacheFullBehavior(cacheFullBehavior)
      }

      public override fun cacheLength(cacheLength: Number) {
        cdkBuilder.cacheLength(cacheLength)
      }

      public override fun captionData(captionData: String) {
        cdkBuilder.captionData(captionData)
      }

      public override fun includeFillerNalUnits(includeFillerNalUnits: String) {
        cdkBuilder.includeFillerNalUnits(includeFillerNalUnits)
      }

      public override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      public override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty,
    ) : RtmpGroupSettingsProperty {
      public override fun adMarkers(): List<String> = unwrap(this).getAdMarkers() ?: emptyList()

      public override fun authenticationScheme(): String? = unwrap(this).getAuthenticationScheme()

      public override fun cacheFullBehavior(): String? = unwrap(this).getCacheFullBehavior()

      public override fun cacheLength(): Number? = unwrap(this).getCacheLength()

      public override fun captionData(): String? = unwrap(this).getCaptionData()

      public override fun includeFillerNalUnits(): String? = unwrap(this).getIncludeFillerNalUnits()

      public override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      public override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RtmpGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty):
          RtmpGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RtmpGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface Rec709SettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty,
    ) : Rec709SettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Rec709SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty):
          Rec709SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Rec709SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CaptionDestinationSettingsProperty {
    public fun aribDestinationSettings(): Any? = unwrap(this).getAribDestinationSettings()

    public fun burnInDestinationSettings(): Any? = unwrap(this).getBurnInDestinationSettings()

    public fun dvbSubDestinationSettings(): Any? = unwrap(this).getDvbSubDestinationSettings()

    public fun ebuTtDDestinationSettings(): Any? = unwrap(this).getEbuTtDDestinationSettings()

    public fun embeddedDestinationSettings(): Any? = unwrap(this).getEmbeddedDestinationSettings()

    public fun embeddedPlusScte20DestinationSettings(): Any? =
        unwrap(this).getEmbeddedPlusScte20DestinationSettings()

    public fun rtmpCaptionInfoDestinationSettings(): Any? =
        unwrap(this).getRtmpCaptionInfoDestinationSettings()

    public fun scte20PlusEmbeddedDestinationSettings(): Any? =
        unwrap(this).getScte20PlusEmbeddedDestinationSettings()

    public fun scte27DestinationSettings(): Any? = unwrap(this).getScte27DestinationSettings()

    public fun smpteTtDestinationSettings(): Any? = unwrap(this).getSmpteTtDestinationSettings()

    public fun teletextDestinationSettings(): Any? = unwrap(this).getTeletextDestinationSettings()

    public fun ttmlDestinationSettings(): Any? = unwrap(this).getTtmlDestinationSettings()

    public fun webvttDestinationSettings(): Any? = unwrap(this).getWebvttDestinationSettings()

    public interface Builder {
      public fun aribDestinationSettings(aribDestinationSettings: IResolvable) {
      }

      public fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9924425c9a3a1b178f1a0a461ae690ba282649b6b96300d474bf7e78f01160cb")
      public
          fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun burnInDestinationSettings(burnInDestinationSettings: IResolvable) {
      }

      public
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ab6db43caec45221944294f84565ddf5860051552bce6ec66c12ba63154755")
      public
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun dvbSubDestinationSettings(dvbSubDestinationSettings: IResolvable) {
      }

      public
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfd24d60c5cf9a28eed30c83dc757a614b6bf038e55c065ef282f49768a0be59")
      public
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: IResolvable) {
      }

      public
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc852a803c72bf30f5a1f47db88388014afb7d236a5d33e491f1b4c301cee6f")
      public
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun embeddedDestinationSettings(embeddedDestinationSettings: IResolvable) {
      }

      public
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ef1e9387047b8b7c83b7cb13467485cd2fe653e2e1eb711c5b0fe251ca08625")
      public
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: IResolvable) {
      }

      public
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00c9aa9109abee9fd7fca8eed5ca2f69850bd750fdbd7ea198da53801e1bf82d")
      public
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty.Builder.() -> Unit) {
      }

      public
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: IResolvable) {
      }

      public
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a1fac1026402dc57b1fa40332a62e214f03036b60c3fb7f639cb262bbd0470c")
      public
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: IResolvable) {
      }

      public
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c84eecbc71f5512a0981a731885258bcab29da3ae2d77ced74466733c8f24434")
      public
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun scte27DestinationSettings(scte27DestinationSettings: IResolvable) {
      }

      public
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b0fe46cfbd068efea72762170dc6fd899d94d5613734d7956a12e474be2812")
      public
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun smpteTtDestinationSettings(smpteTtDestinationSettings: IResolvable) {
      }

      public
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("243045e0056e48ab19cf97a16552e087ace3d96f0dc98c05c4b8783ae61bcb27")
      public
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun teletextDestinationSettings(teletextDestinationSettings: IResolvable) {
      }

      public
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24fd78b59fa8b08238a4a3e1d5900a72b01abfcbedecdbb73c299f211e69a3d7")
      public
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun ttmlDestinationSettings(ttmlDestinationSettings: IResolvable) {
      }

      public fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7733463d00c11736790e121b842e4098cccac26d8b6d55e6f6667e37c9b982ca")
      public
          fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun webvttDestinationSettings(webvttDestinationSettings: IResolvable) {
      }

      public
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9bb9d0998adbfbe443b42629ccfcaa9e8cb937c88d156d6f9c9afda12e867cc5")
      public
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty.builder()

      public override fun aribDestinationSettings(aribDestinationSettings: IResolvable) {
        cdkBuilder.aribDestinationSettings(aribDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty) {
        cdkBuilder.aribDestinationSettings(aribDestinationSettings.let(AribDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9924425c9a3a1b178f1a0a461ae690ba282649b6b96300d474bf7e78f01160cb")
      public override
          fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty.Builder.() -> Unit):
          Unit = aribDestinationSettings(AribDestinationSettingsProperty(aribDestinationSettings))

      public override fun burnInDestinationSettings(burnInDestinationSettings: IResolvable) {
        cdkBuilder.burnInDestinationSettings(burnInDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty) {
        cdkBuilder.burnInDestinationSettings(burnInDestinationSettings.let(BurnInDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ab6db43caec45221944294f84565ddf5860051552bce6ec66c12ba63154755")
      public override
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          burnInDestinationSettings(BurnInDestinationSettingsProperty(burnInDestinationSettings))

      public override fun dvbSubDestinationSettings(dvbSubDestinationSettings: IResolvable) {
        cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty) {
        cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings.let(DvbSubDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfd24d60c5cf9a28eed30c83dc757a614b6bf038e55c065ef282f49768a0be59")
      public override
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          dvbSubDestinationSettings(DvbSubDestinationSettingsProperty(dvbSubDestinationSettings))

      public override fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: IResolvable) {
        cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty) {
        cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings.let(EbuTtDDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc852a803c72bf30f5a1f47db88388014afb7d236a5d33e491f1b4c301cee6f")
      public override
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          ebuTtDDestinationSettings(EbuTtDDestinationSettingsProperty(ebuTtDDestinationSettings))

      public override fun embeddedDestinationSettings(embeddedDestinationSettings: IResolvable) {
        cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty) {
        cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings.let(EmbeddedDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ef1e9387047b8b7c83b7cb13467485cd2fe653e2e1eb711c5b0fe251ca08625")
      public override
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          embeddedDestinationSettings(EmbeddedDestinationSettingsProperty(embeddedDestinationSettings))

      public override
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: IResolvable) {
        cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty) {
        cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings.let(EmbeddedPlusScte20DestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00c9aa9109abee9fd7fca8eed5ca2f69850bd750fdbd7ea198da53801e1bf82d")
      public override
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          embeddedPlusScte20DestinationSettings(EmbeddedPlusScte20DestinationSettingsProperty(embeddedPlusScte20DestinationSettings))

      public override
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: IResolvable) {
        cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty) {
        cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings.let(RtmpCaptionInfoDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a1fac1026402dc57b1fa40332a62e214f03036b60c3fb7f639cb262bbd0470c")
      public override
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          rtmpCaptionInfoDestinationSettings(RtmpCaptionInfoDestinationSettingsProperty(rtmpCaptionInfoDestinationSettings))

      public override
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: IResolvable) {
        cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty) {
        cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings.let(Scte20PlusEmbeddedDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c84eecbc71f5512a0981a731885258bcab29da3ae2d77ced74466733c8f24434")
      public override
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          scte20PlusEmbeddedDestinationSettings(Scte20PlusEmbeddedDestinationSettingsProperty(scte20PlusEmbeddedDestinationSettings))

      public override fun scte27DestinationSettings(scte27DestinationSettings: IResolvable) {
        cdkBuilder.scte27DestinationSettings(scte27DestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty) {
        cdkBuilder.scte27DestinationSettings(scte27DestinationSettings.let(Scte27DestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b0fe46cfbd068efea72762170dc6fd899d94d5613734d7956a12e474be2812")
      public override
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          scte27DestinationSettings(Scte27DestinationSettingsProperty(scte27DestinationSettings))

      public override fun smpteTtDestinationSettings(smpteTtDestinationSettings: IResolvable) {
        cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty) {
        cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings.let(SmpteTtDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("243045e0056e48ab19cf97a16552e087ace3d96f0dc98c05c4b8783ae61bcb27")
      public override
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          smpteTtDestinationSettings(SmpteTtDestinationSettingsProperty(smpteTtDestinationSettings))

      public override fun teletextDestinationSettings(teletextDestinationSettings: IResolvable) {
        cdkBuilder.teletextDestinationSettings(teletextDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty) {
        cdkBuilder.teletextDestinationSettings(teletextDestinationSettings.let(TeletextDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24fd78b59fa8b08238a4a3e1d5900a72b01abfcbedecdbb73c299f211e69a3d7")
      public override
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          teletextDestinationSettings(TeletextDestinationSettingsProperty(teletextDestinationSettings))

      public override fun ttmlDestinationSettings(ttmlDestinationSettings: IResolvable) {
        cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty) {
        cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings.let(TtmlDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7733463d00c11736790e121b842e4098cccac26d8b6d55e6f6667e37c9b982ca")
      public override
          fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty.Builder.() -> Unit):
          Unit = ttmlDestinationSettings(TtmlDestinationSettingsProperty(ttmlDestinationSettings))

      public override fun webvttDestinationSettings(webvttDestinationSettings: IResolvable) {
        cdkBuilder.webvttDestinationSettings(webvttDestinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty) {
        cdkBuilder.webvttDestinationSettings(webvttDestinationSettings.let(WebvttDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9bb9d0998adbfbe443b42629ccfcaa9e8cb937c88d156d6f9c9afda12e867cc5")
      public override
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          webvttDestinationSettings(WebvttDestinationSettingsProperty(webvttDestinationSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty,
    ) : CaptionDestinationSettingsProperty {
      public override fun aribDestinationSettings(): Any? =
          unwrap(this).getAribDestinationSettings()

      public override fun burnInDestinationSettings(): Any? =
          unwrap(this).getBurnInDestinationSettings()

      public override fun dvbSubDestinationSettings(): Any? =
          unwrap(this).getDvbSubDestinationSettings()

      public override fun ebuTtDDestinationSettings(): Any? =
          unwrap(this).getEbuTtDDestinationSettings()

      public override fun embeddedDestinationSettings(): Any? =
          unwrap(this).getEmbeddedDestinationSettings()

      public override fun embeddedPlusScte20DestinationSettings(): Any? =
          unwrap(this).getEmbeddedPlusScte20DestinationSettings()

      public override fun rtmpCaptionInfoDestinationSettings(): Any? =
          unwrap(this).getRtmpCaptionInfoDestinationSettings()

      public override fun scte20PlusEmbeddedDestinationSettings(): Any? =
          unwrap(this).getScte20PlusEmbeddedDestinationSettings()

      public override fun scte27DestinationSettings(): Any? =
          unwrap(this).getScte27DestinationSettings()

      public override fun smpteTtDestinationSettings(): Any? =
          unwrap(this).getSmpteTtDestinationSettings()

      public override fun teletextDestinationSettings(): Any? =
          unwrap(this).getTeletextDestinationSettings()

      public override fun ttmlDestinationSettings(): Any? =
          unwrap(this).getTtmlDestinationSettings()

      public override fun webvttDestinationSettings(): Any? =
          unwrap(this).getWebvttDestinationSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CaptionDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty):
          CaptionDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AvailSettingsProperty {
    public fun esam(): Any? = unwrap(this).getEsam()

    public fun scte35SpliceInsert(): Any? = unwrap(this).getScte35SpliceInsert()

    public fun scte35TimeSignalApos(): Any? = unwrap(this).getScte35TimeSignalApos()

    public interface Builder {
      public fun esam(esam: IResolvable) {
      }

      public fun esam(esam: EsamProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed5f7c3bb0f2db73506c673ced941f1e87182447d144dcfe09b998539a44844a")
      public fun esam(esam: EsamProperty.Builder.() -> Unit) {
      }

      public fun scte35SpliceInsert(scte35SpliceInsert: IResolvable) {
      }

      public fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867a67f52a8d8ab533710c200e2111aedee7f3a666d2206c424e528d79e97be0")
      public
          fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty.Builder.() -> Unit) {
      }

      public fun scte35TimeSignalApos(scte35TimeSignalApos: IResolvable) {
      }

      public fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fbccce3e31010e4a4409f84ad95318d6008e84ec33652c390db519b8a021152")
      public
          fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty.builder()

      public override fun esam(esam: IResolvable) {
        cdkBuilder.esam(esam.let(IResolvable::unwrap))
      }

      public override fun esam(esam: EsamProperty) {
        cdkBuilder.esam(esam.let(EsamProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed5f7c3bb0f2db73506c673ced941f1e87182447d144dcfe09b998539a44844a")
      public override fun esam(esam: EsamProperty.Builder.() -> Unit): Unit =
          esam(EsamProperty(esam))

      public override fun scte35SpliceInsert(scte35SpliceInsert: IResolvable) {
        cdkBuilder.scte35SpliceInsert(scte35SpliceInsert.let(IResolvable::unwrap))
      }

      public override fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty) {
        cdkBuilder.scte35SpliceInsert(scte35SpliceInsert.let(Scte35SpliceInsertProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867a67f52a8d8ab533710c200e2111aedee7f3a666d2206c424e528d79e97be0")
      public override
          fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty.Builder.() -> Unit):
          Unit = scte35SpliceInsert(Scte35SpliceInsertProperty(scte35SpliceInsert))

      public override fun scte35TimeSignalApos(scte35TimeSignalApos: IResolvable) {
        cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos.let(IResolvable::unwrap))
      }

      public override fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty) {
        cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos.let(Scte35TimeSignalAposProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fbccce3e31010e4a4409f84ad95318d6008e84ec33652c390db519b8a021152")
      public override
          fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty.Builder.() -> Unit):
          Unit = scte35TimeSignalApos(Scte35TimeSignalAposProperty(scte35TimeSignalApos))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty,
    ) : AvailSettingsProperty {
      public override fun esam(): Any? = unwrap(this).getEsam()

      public override fun scte35SpliceInsert(): Any? = unwrap(this).getScte35SpliceInsert()

      public override fun scte35TimeSignalApos(): Any? = unwrap(this).getScte35TimeSignalApos()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AvailSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty):
          AvailSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AvailSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EmbeddedPlusScte20DestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty,
    ) : EmbeddedPlusScte20DestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EmbeddedPlusScte20DestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty):
          EmbeddedPlusScte20DestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmbeddedPlusScte20DestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputDestinationProperty {
    public fun id(): String? = unwrap(this).getId()

    public fun mediaPackageSettings(): Any? = unwrap(this).getMediaPackageSettings()

    public fun multiplexSettings(): Any? = unwrap(this).getMultiplexSettings()

    public fun settings(): Any? = unwrap(this).getSettings()

    public interface Builder {
      public fun id(id: String) {
      }

      public fun mediaPackageSettings(mediaPackageSettings: IResolvable) {
      }

      public fun mediaPackageSettings(mediaPackageSettings: List<Any>) {
      }

      public fun multiplexSettings(multiplexSettings: IResolvable) {
      }

      public
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece15e037ba8cc31b632e08040e50a80980271794019a29ab98417858d8a4fed")
      public
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun tings(settings: IResolvable) {
      }

      public fun tings(settings: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty.builder()

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun mediaPackageSettings(mediaPackageSettings: IResolvable) {
        cdkBuilder.mediaPackageSettings(mediaPackageSettings.let(IResolvable::unwrap))
      }

      public override fun mediaPackageSettings(mediaPackageSettings: List<Any>) {
        cdkBuilder.mediaPackageSettings(mediaPackageSettings)
      }

      public override fun multiplexSettings(multiplexSettings: IResolvable) {
        cdkBuilder.multiplexSettings(multiplexSettings.let(IResolvable::unwrap))
      }

      public override
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty) {
        cdkBuilder.multiplexSettings(multiplexSettings.let(MultiplexProgramChannelDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece15e037ba8cc31b632e08040e50a80980271794019a29ab98417858d8a4fed")
      public override
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          multiplexSettings(MultiplexProgramChannelDestinationSettingsProperty(multiplexSettings))

      public override fun tings(settings: IResolvable) {
        cdkBuilder.settings(settings.let(IResolvable::unwrap))
      }

      public override fun tings(settings: List<Any>) {
        cdkBuilder.settings(settings)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty,
    ) : OutputDestinationProperty {
      public override fun id(): String? = unwrap(this).getId()

      public override fun mediaPackageSettings(): Any? = unwrap(this).getMediaPackageSettings()

      public override fun multiplexSettings(): Any? = unwrap(this).getMultiplexSettings()

      public override fun settings(): Any? = unwrap(this).getSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty):
          OutputDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputDestinationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InputLossBehaviorProperty {
    public fun blackFrameMsec(): Number? = unwrap(this).getBlackFrameMsec()

    public fun inputLossImageColor(): String? = unwrap(this).getInputLossImageColor()

    public fun inputLossImageSlate(): Any? = unwrap(this).getInputLossImageSlate()

    public fun inputLossImageType(): String? = unwrap(this).getInputLossImageType()

    public fun repeatFrameMsec(): Number? = unwrap(this).getRepeatFrameMsec()

    public interface Builder {
      public fun blackFrameMsec(blackFrameMsec: Number) {
      }

      public fun inputLossImageColor(inputLossImageColor: String) {
      }

      public fun inputLossImageSlate(inputLossImageSlate: IResolvable) {
      }

      public fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cfe8d542c52f225e2cb0f83322cf9508c28c73c9ed3281eee1e25d0c8b197fc")
      public
          fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun inputLossImageType(inputLossImageType: String) {
      }

      public fun repeatFrameMsec(repeatFrameMsec: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty.builder()

      public override fun blackFrameMsec(blackFrameMsec: Number) {
        cdkBuilder.blackFrameMsec(blackFrameMsec)
      }

      public override fun inputLossImageColor(inputLossImageColor: String) {
        cdkBuilder.inputLossImageColor(inputLossImageColor)
      }

      public override fun inputLossImageSlate(inputLossImageSlate: IResolvable) {
        cdkBuilder.inputLossImageSlate(inputLossImageSlate.let(IResolvable::unwrap))
      }

      public override fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty) {
        cdkBuilder.inputLossImageSlate(inputLossImageSlate.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cfe8d542c52f225e2cb0f83322cf9508c28c73c9ed3281eee1e25d0c8b197fc")
      public override
          fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty.Builder.() -> Unit):
          Unit = inputLossImageSlate(InputLocationProperty(inputLossImageSlate))

      public override fun inputLossImageType(inputLossImageType: String) {
        cdkBuilder.inputLossImageType(inputLossImageType)
      }

      public override fun repeatFrameMsec(repeatFrameMsec: Number) {
        cdkBuilder.repeatFrameMsec(repeatFrameMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty,
    ) : InputLossBehaviorProperty {
      public override fun blackFrameMsec(): Number? = unwrap(this).getBlackFrameMsec()

      public override fun inputLossImageColor(): String? = unwrap(this).getInputLossImageColor()

      public override fun inputLossImageSlate(): Any? = unwrap(this).getInputLossImageSlate()

      public override fun inputLossImageType(): String? = unwrap(this).getInputLossImageType()

      public override fun repeatFrameMsec(): Number? = unwrap(this).getRepeatFrameMsec()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputLossBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty):
          InputLossBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLossBehaviorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface Rec601SettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty,
    ) : Rec601SettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Rec601SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty):
          Rec601SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Rec601SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RtmpOutputSettingsProperty {
    public fun certificateMode(): String? = unwrap(this).getCertificateMode()

    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public interface Builder {
      public fun certificateMode(certificateMode: String) {
      }

      public fun connectionRetryInterval(connectionRetryInterval: Number) {
      }

      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c5e65102a47013b7485722391ced830b572583337c88b61f847e4da12e1bc33")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }

      public fun numRetries(numRetries: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty.builder()

      public override fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
      }

      public override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c5e65102a47013b7485722391ced830b572583337c88b61f847e4da12e1bc33")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty,
    ) : RtmpOutputSettingsProperty {
      public override fun certificateMode(): String? = unwrap(this).getCertificateMode()

      public override fun connectionRetryInterval(): Number? =
          unwrap(this).getConnectionRetryInterval()

      public override fun destination(): Any? = unwrap(this).getDestination()

      public override fun numRetries(): Number? = unwrap(this).getNumRetries()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RtmpOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty):
          RtmpOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RtmpOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface Scte27DestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty,
    ) : Scte27DestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          Scte27DestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty):
          Scte27DestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte27DestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Scte35SpliceInsertProperty {
    public fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

    public fun noRegionalBlackoutFlag(): String? = unwrap(this).getNoRegionalBlackoutFlag()

    public fun webDeliveryAllowedFlag(): String? = unwrap(this).getWebDeliveryAllowedFlag()

    public interface Builder {
      public fun adAvailOffset(adAvailOffset: Number) {
      }

      public fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
      }

      public fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty.builder()

      public override fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
      }

      public override fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
        cdkBuilder.noRegionalBlackoutFlag(noRegionalBlackoutFlag)
      }

      public override fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
        cdkBuilder.webDeliveryAllowedFlag(webDeliveryAllowedFlag)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty,
    ) : Scte35SpliceInsertProperty {
      public override fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

      public override fun noRegionalBlackoutFlag(): String? =
          unwrap(this).getNoRegionalBlackoutFlag()

      public override fun webDeliveryAllowedFlag(): String? =
          unwrap(this).getWebDeliveryAllowedFlag()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Scte35SpliceInsertProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty):
          Scte35SpliceInsertProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte35SpliceInsertProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface HlsS3SettingsProperty {
    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    public interface Builder {
      public fun cannedAcl(cannedAcl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty.builder()

      public override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty,
    ) : HlsS3SettingsProperty {
      public override fun cannedAcl(): String? = unwrap(this).getCannedAcl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsS3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty):
          HlsS3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsS3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ColorCorrectionSettingsProperty {
    public fun globalColorCorrections(): Any? = unwrap(this).getGlobalColorCorrections()

    public interface Builder {
      public fun globalColorCorrections(globalColorCorrections: IResolvable) {
      }

      public fun globalColorCorrections(globalColorCorrections: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty.builder()

      public override fun globalColorCorrections(globalColorCorrections: IResolvable) {
        cdkBuilder.globalColorCorrections(globalColorCorrections.let(IResolvable::unwrap))
      }

      public override fun globalColorCorrections(globalColorCorrections: List<Any>) {
        cdkBuilder.globalColorCorrections(globalColorCorrections)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty,
    ) : ColorCorrectionSettingsProperty {
      public override fun globalColorCorrections(): Any? = unwrap(this).getGlobalColorCorrections()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColorCorrectionSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty):
          ColorCorrectionSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColorCorrectionSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MediaPackageOutputSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty,
    ) : MediaPackageOutputSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MediaPackageOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty):
          MediaPackageOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaPackageOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AudioNormalizationSettingsProperty {
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    public fun algorithmControl(): String? = unwrap(this).getAlgorithmControl()

    public fun targetLkfs(): Number? = unwrap(this).getTargetLkfs()

    public interface Builder {
      public fun algorithm(algorithm: String) {
      }

      public fun algorithmControl(algorithmControl: String) {
      }

      public fun targetLkfs(targetLkfs: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty.builder()

      public override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      public override fun algorithmControl(algorithmControl: String) {
        cdkBuilder.algorithmControl(algorithmControl)
      }

      public override fun targetLkfs(targetLkfs: Number) {
        cdkBuilder.targetLkfs(targetLkfs)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty,
    ) : AudioNormalizationSettingsProperty {
      public override fun algorithm(): String? = unwrap(this).getAlgorithm()

      public override fun algorithmControl(): String? = unwrap(this).getAlgorithmControl()

      public override fun targetLkfs(): Number? = unwrap(this).getTargetLkfs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioNormalizationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty):
          AudioNormalizationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioNormalizationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MsSmoothGroupSettingsProperty {
    public fun acquisitionPointId(): String? = unwrap(this).getAcquisitionPointId()

    public fun audioOnlyTimecodeControl(): String? = unwrap(this).getAudioOnlyTimecodeControl()

    public fun certificateMode(): String? = unwrap(this).getCertificateMode()

    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun eventId(): String? = unwrap(this).getEventId()

    public fun eventIdMode(): String? = unwrap(this).getEventIdMode()

    public fun eventStopBehavior(): String? = unwrap(this).getEventStopBehavior()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun fragmentLength(): Number? = unwrap(this).getFragmentLength()

    public fun inputLossAction(): String? = unwrap(this).getInputLossAction()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    public fun segmentationMode(): String? = unwrap(this).getSegmentationMode()

    public fun sendDelayMs(): Number? = unwrap(this).getSendDelayMs()

    public fun sparseTrackType(): String? = unwrap(this).getSparseTrackType()

    public fun streamManifestBehavior(): String? = unwrap(this).getStreamManifestBehavior()

    public fun timestampOffset(): String? = unwrap(this).getTimestampOffset()

    public fun timestampOffsetMode(): String? = unwrap(this).getTimestampOffsetMode()

    public interface Builder {
      public fun acquisitionPointId(acquisitionPointId: String) {
      }

      public fun audioOnlyTimecodeControl(audioOnlyTimecodeControl: String) {
      }

      public fun certificateMode(certificateMode: String) {
      }

      public fun connectionRetryInterval(connectionRetryInterval: Number) {
      }

      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28b16325180464eefcd18721c4acfc6129074ad981f963ed0c25ae5c16c7305e")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }

      public fun eventId(eventId: String) {
      }

      public fun eventIdMode(eventIdMode: String) {
      }

      public fun eventStopBehavior(eventStopBehavior: String) {
      }

      public fun filecacheDuration(filecacheDuration: Number) {
      }

      public fun fragmentLength(fragmentLength: Number) {
      }

      public fun inputLossAction(inputLossAction: String) {
      }

      public fun numRetries(numRetries: Number) {
      }

      public fun restartDelay(restartDelay: Number) {
      }

      public fun segmentationMode(segmentationMode: String) {
      }

      public fun sendDelayMs(sendDelayMs: Number) {
      }

      public fun sparseTrackType(sparseTrackType: String) {
      }

      public fun streamManifestBehavior(streamManifestBehavior: String) {
      }

      public fun timestampOffset(timestampOffset: String) {
      }

      public fun timestampOffsetMode(timestampOffsetMode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty.builder()

      public override fun acquisitionPointId(acquisitionPointId: String) {
        cdkBuilder.acquisitionPointId(acquisitionPointId)
      }

      public override fun audioOnlyTimecodeControl(audioOnlyTimecodeControl: String) {
        cdkBuilder.audioOnlyTimecodeControl(audioOnlyTimecodeControl)
      }

      public override fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
      }

      public override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28b16325180464eefcd18721c4acfc6129074ad981f963ed0c25ae5c16c7305e")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public override fun eventId(eventId: String) {
        cdkBuilder.eventId(eventId)
      }

      public override fun eventIdMode(eventIdMode: String) {
        cdkBuilder.eventIdMode(eventIdMode)
      }

      public override fun eventStopBehavior(eventStopBehavior: String) {
        cdkBuilder.eventStopBehavior(eventStopBehavior)
      }

      public override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      public override fun fragmentLength(fragmentLength: Number) {
        cdkBuilder.fragmentLength(fragmentLength)
      }

      public override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      public override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      public override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public override fun segmentationMode(segmentationMode: String) {
        cdkBuilder.segmentationMode(segmentationMode)
      }

      public override fun sendDelayMs(sendDelayMs: Number) {
        cdkBuilder.sendDelayMs(sendDelayMs)
      }

      public override fun sparseTrackType(sparseTrackType: String) {
        cdkBuilder.sparseTrackType(sparseTrackType)
      }

      public override fun streamManifestBehavior(streamManifestBehavior: String) {
        cdkBuilder.streamManifestBehavior(streamManifestBehavior)
      }

      public override fun timestampOffset(timestampOffset: String) {
        cdkBuilder.timestampOffset(timestampOffset)
      }

      public override fun timestampOffsetMode(timestampOffsetMode: String) {
        cdkBuilder.timestampOffsetMode(timestampOffsetMode)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty,
    ) : MsSmoothGroupSettingsProperty {
      public override fun acquisitionPointId(): String? = unwrap(this).getAcquisitionPointId()

      public override fun audioOnlyTimecodeControl(): String? =
          unwrap(this).getAudioOnlyTimecodeControl()

      public override fun certificateMode(): String? = unwrap(this).getCertificateMode()

      public override fun connectionRetryInterval(): Number? =
          unwrap(this).getConnectionRetryInterval()

      public override fun destination(): Any? = unwrap(this).getDestination()

      public override fun eventId(): String? = unwrap(this).getEventId()

      public override fun eventIdMode(): String? = unwrap(this).getEventIdMode()

      public override fun eventStopBehavior(): String? = unwrap(this).getEventStopBehavior()

      public override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      public override fun fragmentLength(): Number? = unwrap(this).getFragmentLength()

      public override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      public override fun numRetries(): Number? = unwrap(this).getNumRetries()

      public override fun restartDelay(): Number? = unwrap(this).getRestartDelay()

      public override fun segmentationMode(): String? = unwrap(this).getSegmentationMode()

      public override fun sendDelayMs(): Number? = unwrap(this).getSendDelayMs()

      public override fun sparseTrackType(): String? = unwrap(this).getSparseTrackType()

      public override fun streamManifestBehavior(): String? =
          unwrap(this).getStreamManifestBehavior()

      public override fun timestampOffset(): String? = unwrap(this).getTimestampOffset()

      public override fun timestampOffsetMode(): String? = unwrap(this).getTimestampOffsetMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MsSmoothGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty):
          MsSmoothGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MsSmoothGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColorCorrectionProperty {
    public fun inputColorSpace(): String? = unwrap(this).getInputColorSpace()

    public fun outputColorSpace(): String? = unwrap(this).getOutputColorSpace()

    public fun uri(): String? = unwrap(this).getUri()

    public interface Builder {
      public fun inputColorSpace(inputColorSpace: String) {
      }

      public fun outputColorSpace(outputColorSpace: String) {
      }

      public fun uri(uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty.builder()

      public override fun inputColorSpace(inputColorSpace: String) {
        cdkBuilder.inputColorSpace(inputColorSpace)
      }

      public override fun outputColorSpace(outputColorSpace: String) {
        cdkBuilder.outputColorSpace(outputColorSpace)
      }

      public override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty,
    ) : ColorCorrectionProperty {
      public override fun inputColorSpace(): String? = unwrap(this).getInputColorSpace()

      public override fun outputColorSpace(): String? = unwrap(this).getOutputColorSpace()

      public override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColorCorrectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty):
          ColorCorrectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColorCorrectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FrameCaptureGroupSettingsProperty {
    public fun destination(): Any? = unwrap(this).getDestination()

    public fun frameCaptureCdnSettings(): Any? = unwrap(this).getFrameCaptureCdnSettings()

    public interface Builder {
      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9856cbc3d03f26a360384cab57e12cb1f22a4e06f7c1fac35b80c95e6067e184")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }

      public fun frameCaptureCdnSettings(frameCaptureCdnSettings: IResolvable) {
      }

      public fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85dbbe320ce33bec193e6f343670d9440c84e5c58aae48abafbce652f98b513e")
      public
          fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty.builder()

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9856cbc3d03f26a360384cab57e12cb1f22a4e06f7c1fac35b80c95e6067e184")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public override fun frameCaptureCdnSettings(frameCaptureCdnSettings: IResolvable) {
        cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings.let(IResolvable::unwrap))
      }

      public override
          fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty) {
        cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings.let(FrameCaptureCdnSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85dbbe320ce33bec193e6f343670d9440c84e5c58aae48abafbce652f98b513e")
      public override
          fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureCdnSettings(FrameCaptureCdnSettingsProperty(frameCaptureCdnSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty,
    ) : FrameCaptureGroupSettingsProperty {
      public override fun destination(): Any? = unwrap(this).getDestination()

      public override fun frameCaptureCdnSettings(): Any? =
          unwrap(this).getFrameCaptureCdnSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FrameCaptureGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty):
          FrameCaptureGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UdpGroupSettingsProperty {
    public fun inputLossAction(): String? = unwrap(this).getInputLossAction()

    public fun timedMetadataId3Frame(): String? = unwrap(this).getTimedMetadataId3Frame()

    public fun timedMetadataId3Period(): Number? = unwrap(this).getTimedMetadataId3Period()

    public interface Builder {
      public fun inputLossAction(inputLossAction: String) {
      }

      public fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
      }

      public fun timedMetadataId3Period(timedMetadataId3Period: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty.builder()

      public override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      public override fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
        cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
      }

      public override fun timedMetadataId3Period(timedMetadataId3Period: Number) {
        cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty,
    ) : UdpGroupSettingsProperty {
      public override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      public override fun timedMetadataId3Frame(): String? = unwrap(this).getTimedMetadataId3Frame()

      public override fun timedMetadataId3Period(): Number? =
          unwrap(this).getTimedMetadataId3Period()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UdpGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty):
          UdpGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UdpGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RemixSettingsProperty {
    public fun channelMappings(): Any? = unwrap(this).getChannelMappings()

    public fun channelsIn(): Number? = unwrap(this).getChannelsIn()

    public fun channelsOut(): Number? = unwrap(this).getChannelsOut()

    public interface Builder {
      public fun channelMappings(channelMappings: IResolvable) {
      }

      public fun channelMappings(channelMappings: List<Any>) {
      }

      public fun channelsIn(channelsIn: Number) {
      }

      public fun channelsOut(channelsOut: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty.builder()

      public override fun channelMappings(channelMappings: IResolvable) {
        cdkBuilder.channelMappings(channelMappings.let(IResolvable::unwrap))
      }

      public override fun channelMappings(channelMappings: List<Any>) {
        cdkBuilder.channelMappings(channelMappings)
      }

      public override fun channelsIn(channelsIn: Number) {
        cdkBuilder.channelsIn(channelsIn)
      }

      public override fun channelsOut(channelsOut: Number) {
        cdkBuilder.channelsOut(channelsOut)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty,
    ) : RemixSettingsProperty {
      public override fun channelMappings(): Any? = unwrap(this).getChannelMappings()

      public override fun channelsIn(): Number? = unwrap(this).getChannelsIn()

      public override fun channelsOut(): Number? = unwrap(this).getChannelsOut()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RemixSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty):
          RemixSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemixSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ColorSpacePassthroughSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty,
    ) : ColorSpacePassthroughSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ColorSpacePassthroughSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty):
          ColorSpacePassthroughSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColorSpacePassthroughSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkInputSettingsProperty {
    public fun hlsInputSettings(): Any? = unwrap(this).getHlsInputSettings()

    public fun serverValidation(): String? = unwrap(this).getServerValidation()

    public interface Builder {
      public fun hlsInputSettings(hlsInputSettings: IResolvable) {
      }

      public fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63fa83903cb5729012027ed88c7bfdde8e004071033b6652ee3c768997257d51")
      public fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty.Builder.() -> Unit) {
      }

      public fun serverValidation(serverValidation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty.builder()

      public override fun hlsInputSettings(hlsInputSettings: IResolvable) {
        cdkBuilder.hlsInputSettings(hlsInputSettings.let(IResolvable::unwrap))
      }

      public override fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty) {
        cdkBuilder.hlsInputSettings(hlsInputSettings.let(HlsInputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63fa83903cb5729012027ed88c7bfdde8e004071033b6652ee3c768997257d51")
      public override
          fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty.Builder.() -> Unit): Unit
          = hlsInputSettings(HlsInputSettingsProperty(hlsInputSettings))

      public override fun serverValidation(serverValidation: String) {
        cdkBuilder.serverValidation(serverValidation)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty,
    ) : NetworkInputSettingsProperty {
      public override fun hlsInputSettings(): Any? = unwrap(this).getHlsInputSettings()

      public override fun serverValidation(): String? = unwrap(this).getServerValidation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty):
          NetworkInputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MediaPackageGroupSettingsProperty {
    public fun destination(): Any? = unwrap(this).getDestination()

    public interface Builder {
      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713636ca4eccf016520d54b41a47fb2c5ec4af5b2de0a11a2c9e46f6b0f9b284")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty.builder()

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713636ca4eccf016520d54b41a47fb2c5ec4af5b2de0a11a2c9e46f6b0f9b284")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty,
    ) : MediaPackageGroupSettingsProperty {
      public override fun destination(): Any? = unwrap(this).getDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MediaPackageGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty):
          MediaPackageGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaPackageGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StaticKeySettingsProperty {
    public fun keyProviderServer(): Any? = unwrap(this).getKeyProviderServer()

    public fun staticKeyValue(): String? = unwrap(this).getStaticKeyValue()

    public interface Builder {
      public fun keyProviderServer(keyProviderServer: IResolvable) {
      }

      public fun keyProviderServer(keyProviderServer: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa33d117d76d6f8ddf5adf69b60f682c89fe53780c940d718df2c5b929eeb57")
      public fun keyProviderServer(keyProviderServer: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun staticKeyValue(staticKeyValue: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty.builder()

      public override fun keyProviderServer(keyProviderServer: IResolvable) {
        cdkBuilder.keyProviderServer(keyProviderServer.let(IResolvable::unwrap))
      }

      public override fun keyProviderServer(keyProviderServer: InputLocationProperty) {
        cdkBuilder.keyProviderServer(keyProviderServer.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa33d117d76d6f8ddf5adf69b60f682c89fe53780c940d718df2c5b929eeb57")
      public override
          fun keyProviderServer(keyProviderServer: InputLocationProperty.Builder.() -> Unit): Unit =
          keyProviderServer(InputLocationProperty(keyProviderServer))

      public override fun staticKeyValue(staticKeyValue: String) {
        cdkBuilder.staticKeyValue(staticKeyValue)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty,
    ) : StaticKeySettingsProperty {
      public override fun keyProviderServer(): Any? = unwrap(this).getKeyProviderServer()

      public override fun staticKeyValue(): String? = unwrap(this).getStaticKeyValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StaticKeySettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty):
          StaticKeySettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StaticKeySettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MotionGraphicsConfigurationProperty {
    public fun motionGraphicsInsertion(): String? = unwrap(this).getMotionGraphicsInsertion()

    public fun motionGraphicsSettings(): Any? = unwrap(this).getMotionGraphicsSettings()

    public interface Builder {
      public fun motionGraphicsInsertion(motionGraphicsInsertion: String) {
      }

      public fun motionGraphicsSettings(motionGraphicsSettings: IResolvable) {
      }

      public fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3a7271f89321ad17772aa32489d7d3647324393dd12a21a17c02f3c4993bcb9")
      public
          fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty.builder()

      public override fun motionGraphicsInsertion(motionGraphicsInsertion: String) {
        cdkBuilder.motionGraphicsInsertion(motionGraphicsInsertion)
      }

      public override fun motionGraphicsSettings(motionGraphicsSettings: IResolvable) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings.let(IResolvable::unwrap))
      }

      public override
          fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings.let(MotionGraphicsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3a7271f89321ad17772aa32489d7d3647324393dd12a21a17c02f3c4993bcb9")
      public override
          fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty.Builder.() -> Unit):
          Unit = motionGraphicsSettings(MotionGraphicsSettingsProperty(motionGraphicsSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty,
    ) : MotionGraphicsConfigurationProperty {
      public override fun motionGraphicsInsertion(): String? =
          unwrap(this).getMotionGraphicsInsertion()

      public override fun motionGraphicsSettings(): Any? = unwrap(this).getMotionGraphicsSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MotionGraphicsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty):
          MotionGraphicsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MotionGraphicsConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FrameCaptureHlsSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty,
    ) : FrameCaptureHlsSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureHlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty):
          FrameCaptureHlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureHlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputLocationProperty {
    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    public fun uri(): String? = unwrap(this).getUri()

    public fun username(): String? = unwrap(this).getUsername()

    public interface Builder {
      public fun passwordParam(passwordParam: String) {
      }

      public fun uri(uri: String) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty.builder()

      public override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      public override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty,
    ) : InputLocationProperty {
      public override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      public override fun uri(): String? = unwrap(this).getUri()

      public override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty):
          InputLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLocationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VideoCodecSettingsProperty {
    public fun frameCaptureSettings(): Any? = unwrap(this).getFrameCaptureSettings()

    public fun h264Settings(): Any? = unwrap(this).getH264Settings()

    public fun h265Settings(): Any? = unwrap(this).getH265Settings()

    public fun mpeg2Settings(): Any? = unwrap(this).getMpeg2Settings()

    public interface Builder {
      public fun frameCaptureSettings(frameCaptureSettings: IResolvable) {
      }

      public fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222c62772bf18b14036723a2d521cdb01e8137f202f75bb2683d6fded0bdf2c1")
      public
          fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty.Builder.() -> Unit) {
      }

      public fun h264Settings(h264Settings: IResolvable) {
      }

      public fun h264Settings(h264Settings: H264SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c077ec3e18f44e6ffc841e43a8223e933183c8d0c58c6b9f35a4e28b5578c651")
      public fun h264Settings(h264Settings: H264SettingsProperty.Builder.() -> Unit) {
      }

      public fun h265Settings(h265Settings: IResolvable) {
      }

      public fun h265Settings(h265Settings: H265SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d205d9eb647853e8b9d4108b737b8d4d5154eb19ebbc3a6590c9038afee3602f")
      public fun h265Settings(h265Settings: H265SettingsProperty.Builder.() -> Unit) {
      }

      public fun mpeg2Settings(mpeg2Settings: IResolvable) {
      }

      public fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7aeca5da7e0cc286f334cbbb6afddc31d22c5a69c13c3918aa4dc89287d1d9")
      public fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty.builder()

      public override fun frameCaptureSettings(frameCaptureSettings: IResolvable) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings.let(IResolvable::unwrap))
      }

      public override fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings.let(FrameCaptureSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222c62772bf18b14036723a2d521cdb01e8137f202f75bb2683d6fded0bdf2c1")
      public override
          fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureSettings(FrameCaptureSettingsProperty(frameCaptureSettings))

      public override fun h264Settings(h264Settings: IResolvable) {
        cdkBuilder.h264Settings(h264Settings.let(IResolvable::unwrap))
      }

      public override fun h264Settings(h264Settings: H264SettingsProperty) {
        cdkBuilder.h264Settings(h264Settings.let(H264SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c077ec3e18f44e6ffc841e43a8223e933183c8d0c58c6b9f35a4e28b5578c651")
      public override fun h264Settings(h264Settings: H264SettingsProperty.Builder.() -> Unit): Unit
          = h264Settings(H264SettingsProperty(h264Settings))

      public override fun h265Settings(h265Settings: IResolvable) {
        cdkBuilder.h265Settings(h265Settings.let(IResolvable::unwrap))
      }

      public override fun h265Settings(h265Settings: H265SettingsProperty) {
        cdkBuilder.h265Settings(h265Settings.let(H265SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d205d9eb647853e8b9d4108b737b8d4d5154eb19ebbc3a6590c9038afee3602f")
      public override fun h265Settings(h265Settings: H265SettingsProperty.Builder.() -> Unit): Unit
          = h265Settings(H265SettingsProperty(h265Settings))

      public override fun mpeg2Settings(mpeg2Settings: IResolvable) {
        cdkBuilder.mpeg2Settings(mpeg2Settings.let(IResolvable::unwrap))
      }

      public override fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty) {
        cdkBuilder.mpeg2Settings(mpeg2Settings.let(Mpeg2SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7aeca5da7e0cc286f334cbbb6afddc31d22c5a69c13c3918aa4dc89287d1d9")
      public override fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty.Builder.() -> Unit):
          Unit = mpeg2Settings(Mpeg2SettingsProperty(mpeg2Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty,
    ) : VideoCodecSettingsProperty {
      public override fun frameCaptureSettings(): Any? = unwrap(this).getFrameCaptureSettings()

      public override fun h264Settings(): Any? = unwrap(this).getH264Settings()

      public override fun h265Settings(): Any? = unwrap(this).getH265Settings()

      public override fun mpeg2Settings(): Any? = unwrap(this).getMpeg2Settings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VideoCodecSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty):
          VideoCodecSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoCodecSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface Scte20SourceSettingsProperty {
    public fun convert608To708(): String? = unwrap(this).getConvert608To708()

    public fun source608ChannelNumber(): Number? = unwrap(this).getSource608ChannelNumber()

    public interface Builder {
      public fun convert608To708(convert608To708: String) {
      }

      public fun source608ChannelNumber(source608ChannelNumber: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty.builder()

      public override fun convert608To708(convert608To708: String) {
        cdkBuilder.convert608To708(convert608To708)
      }

      public override fun source608ChannelNumber(source608ChannelNumber: Number) {
        cdkBuilder.source608ChannelNumber(source608ChannelNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty,
    ) : Scte20SourceSettingsProperty {
      public override fun convert608To708(): String? = unwrap(this).getConvert608To708()

      public override fun source608ChannelNumber(): Number? =
          unwrap(this).getSource608ChannelNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Scte20SourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty):
          Scte20SourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte20SourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AvailConfigurationProperty {
    public fun availSettings(): Any? = unwrap(this).getAvailSettings()

    public interface Builder {
      public fun availSettings(availSettings: IResolvable) {
      }

      public fun availSettings(availSettings: AvailSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("240d5e0606d729c84794d102fb2ba988f76c879c4aaef20e19080d639b518ac5")
      public fun availSettings(availSettings: AvailSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty.builder()

      public override fun availSettings(availSettings: IResolvable) {
        cdkBuilder.availSettings(availSettings.let(IResolvable::unwrap))
      }

      public override fun availSettings(availSettings: AvailSettingsProperty) {
        cdkBuilder.availSettings(availSettings.let(AvailSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("240d5e0606d729c84794d102fb2ba988f76c879c4aaef20e19080d639b518ac5")
      public override fun availSettings(availSettings: AvailSettingsProperty.Builder.() -> Unit):
          Unit = availSettings(AvailSettingsProperty(availSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty,
    ) : AvailConfigurationProperty {
      public override fun availSettings(): Any? = unwrap(this).getAvailSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AvailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty):
          AvailConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AvailConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OutputLocationRefProperty {
    public fun destinationRefId(): String? = unwrap(this).getDestinationRefId()

    public interface Builder {
      public fun destinationRefId(destinationRefId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty.builder()

      public override fun destinationRefId(destinationRefId: String) {
        cdkBuilder.destinationRefId(destinationRefId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty,
    ) : OutputLocationRefProperty {
      public override fun destinationRefId(): String? = unwrap(this).getDestinationRefId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputLocationRefProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty):
          OutputLocationRefProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputLocationRefProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SmpteTtDestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty,
    ) : SmpteTtDestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SmpteTtDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty):
          SmpteTtDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmpteTtDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AudioTrackProperty {
    public fun track(): Number? = unwrap(this).getTrack()

    public interface Builder {
      public fun track(track: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty.builder()

      public override fun track(track: Number) {
        cdkBuilder.track(track)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty,
    ) : AudioTrackProperty {
      public override fun track(): Number? = unwrap(this).getTrack()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioTrackProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty):
          AudioTrackProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioTrackProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HlsOutputSettingsProperty {
    public fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

    public fun hlsSettings(): Any? = unwrap(this).getHlsSettings()

    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    public fun segmentModifier(): String? = unwrap(this).getSegmentModifier()

    public interface Builder {
      public fun h265PackagingType(h265PackagingType: String) {
      }

      public fun hlsSettings(hlsSettings: IResolvable) {
      }

      public fun hlsSettings(hlsSettings: HlsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78605301163dbb54e1bc1f60ec8465b400d180739ddf3353dca1f8349ab163c1")
      public fun hlsSettings(hlsSettings: HlsSettingsProperty.Builder.() -> Unit) {
      }

      public fun nameModifier(nameModifier: String) {
      }

      public fun segmentModifier(segmentModifier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty.builder()

      public override fun h265PackagingType(h265PackagingType: String) {
        cdkBuilder.h265PackagingType(h265PackagingType)
      }

      public override fun hlsSettings(hlsSettings: IResolvable) {
        cdkBuilder.hlsSettings(hlsSettings.let(IResolvable::unwrap))
      }

      public override fun hlsSettings(hlsSettings: HlsSettingsProperty) {
        cdkBuilder.hlsSettings(hlsSettings.let(HlsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78605301163dbb54e1bc1f60ec8465b400d180739ddf3353dca1f8349ab163c1")
      public override fun hlsSettings(hlsSettings: HlsSettingsProperty.Builder.() -> Unit): Unit =
          hlsSettings(HlsSettingsProperty(hlsSettings))

      public override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      public override fun segmentModifier(segmentModifier: String) {
        cdkBuilder.segmentModifier(segmentModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty,
    ) : HlsOutputSettingsProperty {
      public override fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

      public override fun hlsSettings(): Any? = unwrap(this).getHlsSettings()

      public override fun nameModifier(): String? = unwrap(this).getNameModifier()

      public override fun segmentModifier(): String? = unwrap(this).getSegmentModifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty):
          HlsOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AudioChannelMappingProperty {
    public fun inputChannelLevels(): Any? = unwrap(this).getInputChannelLevels()

    public fun outputChannel(): Number? = unwrap(this).getOutputChannel()

    public interface Builder {
      public fun inputChannelLevels(inputChannelLevels: IResolvable) {
      }

      public fun inputChannelLevels(inputChannelLevels: List<Any>) {
      }

      public fun outputChannel(outputChannel: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty.builder()

      public override fun inputChannelLevels(inputChannelLevels: IResolvable) {
        cdkBuilder.inputChannelLevels(inputChannelLevels.let(IResolvable::unwrap))
      }

      public override fun inputChannelLevels(inputChannelLevels: List<Any>) {
        cdkBuilder.inputChannelLevels(inputChannelLevels)
      }

      public override fun outputChannel(outputChannel: Number) {
        cdkBuilder.outputChannel(outputChannel)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty,
    ) : AudioChannelMappingProperty {
      public override fun inputChannelLevels(): Any? = unwrap(this).getInputChannelLevels()

      public override fun outputChannel(): Number? = unwrap(this).getOutputChannel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioChannelMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty):
          AudioChannelMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioChannelMappingProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PassThroughSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty,
    ) : PassThroughSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PassThroughSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty):
          PassThroughSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PassThroughSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HtmlMotionGraphicsSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty,
    ) : HtmlMotionGraphicsSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HtmlMotionGraphicsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty):
          HtmlMotionGraphicsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HtmlMotionGraphicsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Eac3AtmosSettingsProperty {
    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun dialnorm(): Number? = unwrap(this).getDialnorm()

    public fun drcLine(): String? = unwrap(this).getDrcLine()

    public fun drcRf(): String? = unwrap(this).getDrcRf()

    public fun heightTrim(): Number? = unwrap(this).getHeightTrim()

    public fun surroundTrim(): Number? = unwrap(this).getSurroundTrim()

    public interface Builder {
      public fun bitrate(bitrate: Number) {
      }

      public fun codingMode(codingMode: String) {
      }

      public fun dialnorm(dialnorm: Number) {
      }

      public fun drcLine(drcLine: String) {
      }

      public fun drcRf(drcRf: String) {
      }

      public fun heightTrim(heightTrim: Number) {
      }

      public fun surroundTrim(surroundTrim: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty.builder()

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      public override fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
      }

      public override fun drcLine(drcLine: String) {
        cdkBuilder.drcLine(drcLine)
      }

      public override fun drcRf(drcRf: String) {
        cdkBuilder.drcRf(drcRf)
      }

      public override fun heightTrim(heightTrim: Number) {
        cdkBuilder.heightTrim(heightTrim)
      }

      public override fun surroundTrim(surroundTrim: Number) {
        cdkBuilder.surroundTrim(surroundTrim)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty,
    ) : Eac3AtmosSettingsProperty {
      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun codingMode(): String? = unwrap(this).getCodingMode()

      public override fun dialnorm(): Number? = unwrap(this).getDialnorm()

      public override fun drcLine(): String? = unwrap(this).getDrcLine()

      public override fun drcRf(): String? = unwrap(this).getDrcRf()

      public override fun heightTrim(): Number? = unwrap(this).getHeightTrim()

      public override fun surroundTrim(): Number? = unwrap(this).getSurroundTrim()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Eac3AtmosSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty):
          Eac3AtmosSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Eac3AtmosSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NielsenWatermarksSettingsProperty {
    public fun nielsenCbetSettings(): Any? = unwrap(this).getNielsenCbetSettings()

    public fun nielsenDistributionType(): String? = unwrap(this).getNielsenDistributionType()

    public fun nielsenNaesIiNwSettings(): Any? = unwrap(this).getNielsenNaesIiNwSettings()

    public interface Builder {
      public fun nielsenCbetSettings(nielsenCbetSettings: IResolvable) {
      }

      public fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35333d3f44aa56de26abd03af7cc97f42b05a1141ac054f99a76ddc6892352d8")
      public fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty.Builder.() -> Unit) {
      }

      public fun nielsenDistributionType(nielsenDistributionType: String) {
      }

      public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: IResolvable) {
      }

      public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("805148ec889bfd17c184fe783d22acec7decede80d044d2eb08a4a9e6bd5934d")
      public
          fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty.builder()

      public override fun nielsenCbetSettings(nielsenCbetSettings: IResolvable) {
        cdkBuilder.nielsenCbetSettings(nielsenCbetSettings.let(IResolvable::unwrap))
      }

      public override fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty) {
        cdkBuilder.nielsenCbetSettings(nielsenCbetSettings.let(NielsenCBETProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35333d3f44aa56de26abd03af7cc97f42b05a1141ac054f99a76ddc6892352d8")
      public override
          fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty.Builder.() -> Unit): Unit
          = nielsenCbetSettings(NielsenCBETProperty(nielsenCbetSettings))

      public override fun nielsenDistributionType(nielsenDistributionType: String) {
        cdkBuilder.nielsenDistributionType(nielsenDistributionType)
      }

      public override fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: IResolvable) {
        cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings.let(IResolvable::unwrap))
      }

      public override
          fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty) {
        cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings.let(NielsenNaesIiNwProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("805148ec889bfd17c184fe783d22acec7decede80d044d2eb08a4a9e6bd5934d")
      public override
          fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty.Builder.() -> Unit):
          Unit = nielsenNaesIiNwSettings(NielsenNaesIiNwProperty(nielsenNaesIiNwSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty,
    ) : NielsenWatermarksSettingsProperty {
      public override fun nielsenCbetSettings(): Any? = unwrap(this).getNielsenCbetSettings()

      public override fun nielsenDistributionType(): String? =
          unwrap(this).getNielsenDistributionType()

      public override fun nielsenNaesIiNwSettings(): Any? =
          unwrap(this).getNielsenNaesIiNwSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NielsenWatermarksSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty):
          NielsenWatermarksSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NielsenWatermarksSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CaptionDescriptionProperty {
    public fun accessibility(): String? = unwrap(this).getAccessibility()

    public fun captionSelectorName(): String? = unwrap(this).getCaptionSelectorName()

    public fun destinationSettings(): Any? = unwrap(this).getDestinationSettings()

    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun languageDescription(): String? = unwrap(this).getLanguageDescription()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun accessibility(accessibility: String) {
      }

      public fun captionSelectorName(captionSelectorName: String) {
      }

      public fun destinationSettings(destinationSettings: IResolvable) {
      }

      public fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f1770abcbc58775ad8bd56af514fbcdc88ca0b96ef4da293ace57be6c40f7e2")
      public
          fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty.Builder.() -> Unit) {
      }

      public fun languageCode(languageCode: String) {
      }

      public fun languageDescription(languageDescription: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty.builder()

      public override fun accessibility(accessibility: String) {
        cdkBuilder.accessibility(accessibility)
      }

      public override fun captionSelectorName(captionSelectorName: String) {
        cdkBuilder.captionSelectorName(captionSelectorName)
      }

      public override fun destinationSettings(destinationSettings: IResolvable) {
        cdkBuilder.destinationSettings(destinationSettings.let(IResolvable::unwrap))
      }

      public override
          fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty) {
        cdkBuilder.destinationSettings(destinationSettings.let(CaptionDestinationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f1770abcbc58775ad8bd56af514fbcdc88ca0b96ef4da293ace57be6c40f7e2")
      public override
          fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty.Builder.() -> Unit):
          Unit = destinationSettings(CaptionDestinationSettingsProperty(destinationSettings))

      public override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      public override fun languageDescription(languageDescription: String) {
        cdkBuilder.languageDescription(languageDescription)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty,
    ) : CaptionDescriptionProperty {
      public override fun accessibility(): String? = unwrap(this).getAccessibility()

      public override fun captionSelectorName(): String? = unwrap(this).getCaptionSelectorName()

      public override fun destinationSettings(): Any? = unwrap(this).getDestinationSettings()

      public override fun languageCode(): String? = unwrap(this).getLanguageCode()

      public override fun languageDescription(): String? = unwrap(this).getLanguageDescription()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty):
          CaptionDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionDescriptionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CaptionLanguageMappingProperty {
    public fun captionChannel(): Number? = unwrap(this).getCaptionChannel()

    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun languageDescription(): String? = unwrap(this).getLanguageDescription()

    public interface Builder {
      public fun captionChannel(captionChannel: Number) {
      }

      public fun languageCode(languageCode: String) {
      }

      public fun languageDescription(languageDescription: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty.builder()

      public override fun captionChannel(captionChannel: Number) {
        cdkBuilder.captionChannel(captionChannel)
      }

      public override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      public override fun languageDescription(languageDescription: String) {
        cdkBuilder.languageDescription(languageDescription)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty,
    ) : CaptionLanguageMappingProperty {
      public override fun captionChannel(): Number? = unwrap(this).getCaptionChannel()

      public override fun languageCode(): String? = unwrap(this).getLanguageCode()

      public override fun languageDescription(): String? = unwrap(this).getLanguageDescription()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionLanguageMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty):
          CaptionLanguageMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionLanguageMappingProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FrameCaptureOutputSettingsProperty {
    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    public interface Builder {
      public fun nameModifier(nameModifier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty.builder()

      public override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty,
    ) : FrameCaptureOutputSettingsProperty {
      public override fun nameModifier(): String? = unwrap(this).getNameModifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FrameCaptureOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty):
          FrameCaptureOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface H264SettingsProperty {
    public fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

    public fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun bufFillPct(): Number? = unwrap(this).getBufFillPct()

    public fun bufSize(): Number? = unwrap(this).getBufSize()

    public fun colorMetadata(): String? = unwrap(this).getColorMetadata()

    public fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

    public fun entropyEncoding(): String? = unwrap(this).getEntropyEncoding()

    public fun filterSettings(): Any? = unwrap(this).getFilterSettings()

    public fun fixedAfd(): String? = unwrap(this).getFixedAfd()

    public fun flickerAq(): String? = unwrap(this).getFlickerAq()

    public fun forceFieldPictures(): String? = unwrap(this).getForceFieldPictures()

    public fun framerateControl(): String? = unwrap(this).getFramerateControl()

    public fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

    public fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

    public fun gopBReference(): String? = unwrap(this).getGopBReference()

    public fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

    public fun gopNumBFrames(): Number? = unwrap(this).getGopNumBFrames()

    public fun gopSize(): Number? = unwrap(this).getGopSize()

    public fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

    public fun level(): String? = unwrap(this).getLevel()

    public fun lookAheadRateControl(): String? = unwrap(this).getLookAheadRateControl()

    public fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

    public fun minIInterval(): Number? = unwrap(this).getMinIInterval()

    public fun numRefFrames(): Number? = unwrap(this).getNumRefFrames()

    public fun parControl(): String? = unwrap(this).getParControl()

    public fun parDenominator(): Number? = unwrap(this).getParDenominator()

    public fun parNumerator(): Number? = unwrap(this).getParNumerator()

    public fun profile(): String? = unwrap(this).getProfile()

    public fun qualityLevel(): String? = unwrap(this).getQualityLevel()

    public fun qvbrQualityLevel(): Number? = unwrap(this).getQvbrQualityLevel()

    public fun rateControlMode(): String? = unwrap(this).getRateControlMode()

    public fun scanType(): String? = unwrap(this).getScanType()

    public fun sceneChangeDetect(): String? = unwrap(this).getSceneChangeDetect()

    public fun slices(): Number? = unwrap(this).getSlices()

    public fun softness(): Number? = unwrap(this).getSoftness()

    public fun spatialAq(): String? = unwrap(this).getSpatialAq()

    public fun subgopLength(): String? = unwrap(this).getSubgopLength()

    public fun syntax(): String? = unwrap(this).getSyntax()

    public fun temporalAq(): String? = unwrap(this).getTemporalAq()

    public fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

    public fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()

    public interface Builder {
      public fun adaptiveQuantization(adaptiveQuantization: String) {
      }

      public fun afdSignaling(afdSignaling: String) {
      }

      public fun bitrate(bitrate: Number) {
      }

      public fun bufFillPct(bufFillPct: Number) {
      }

      public fun bufSize(bufSize: Number) {
      }

      public fun colorMetadata(colorMetadata: String) {
      }

      public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
      }

      public fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("040b672b23dcea5b979db503894f0422badeb4a70de1aeaba3c8dba1414d4cd2")
      public
          fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty.Builder.() -> Unit) {
      }

      public fun entropyEncoding(entropyEncoding: String) {
      }

      public fun filterSettings(filterSettings: IResolvable) {
      }

      public fun filterSettings(filterSettings: H264FilterSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4784a9e838832f79036b52ca493da9f3be2549c718a2984878f69785abd6c8b")
      public fun filterSettings(filterSettings: H264FilterSettingsProperty.Builder.() -> Unit) {
      }

      public fun fixedAfd(fixedAfd: String) {
      }

      public fun flickerAq(flickerAq: String) {
      }

      public fun forceFieldPictures(forceFieldPictures: String) {
      }

      public fun framerateControl(framerateControl: String) {
      }

      public fun framerateDenominator(framerateDenominator: Number) {
      }

      public fun framerateNumerator(framerateNumerator: Number) {
      }

      public fun gopBReference(gopBReference: String) {
      }

      public fun gopClosedCadence(gopClosedCadence: Number) {
      }

      public fun gopNumBFrames(gopNumBFrames: Number) {
      }

      public fun gopSize(gopSize: Number) {
      }

      public fun gopSizeUnits(gopSizeUnits: String) {
      }

      public fun level(level: String) {
      }

      public fun lookAheadRateControl(lookAheadRateControl: String) {
      }

      public fun maxBitrate(maxBitrate: Number) {
      }

      public fun minIInterval(minIInterval: Number) {
      }

      public fun numRefFrames(numRefFrames: Number) {
      }

      public fun parControl(parControl: String) {
      }

      public fun parDenominator(parDenominator: Number) {
      }

      public fun parNumerator(parNumerator: Number) {
      }

      public fun profile(profile: String) {
      }

      public fun qualityLevel(qualityLevel: String) {
      }

      public fun qvbrQualityLevel(qvbrQualityLevel: Number) {
      }

      public fun rateControlMode(rateControlMode: String) {
      }

      public fun scanType(scanType: String) {
      }

      public fun sceneChangeDetect(sceneChangeDetect: String) {
      }

      public fun slices(slices: Number) {
      }

      public fun softness(softness: Number) {
      }

      public fun spatialAq(spatialAq: String) {
      }

      public fun subgopLength(subgopLength: String) {
      }

      public fun syntax(syntax: String) {
      }

      public fun temporalAq(temporalAq: String) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62643fd88f34450bd48fc495cc91e3e5239fc404fc1f3ed5e8679376335b6a45")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit) {
      }

      public fun timecodeInsertion(timecodeInsertion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty.builder()

      public override fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
      }

      public override fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
      }

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun bufFillPct(bufFillPct: Number) {
        cdkBuilder.bufFillPct(bufFillPct)
      }

      public override fun bufSize(bufSize: Number) {
        cdkBuilder.bufSize(bufSize)
      }

      public override fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
      }

      public override fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(IResolvable::unwrap))
      }

      public override fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(H264ColorSpaceSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("040b672b23dcea5b979db503894f0422badeb4a70de1aeaba3c8dba1414d4cd2")
      public override
          fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty.Builder.() -> Unit):
          Unit = colorSpaceSettings(H264ColorSpaceSettingsProperty(colorSpaceSettings))

      public override fun entropyEncoding(entropyEncoding: String) {
        cdkBuilder.entropyEncoding(entropyEncoding)
      }

      public override fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings.let(IResolvable::unwrap))
      }

      public override fun filterSettings(filterSettings: H264FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings.let(H264FilterSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4784a9e838832f79036b52ca493da9f3be2549c718a2984878f69785abd6c8b")
      public override
          fun filterSettings(filterSettings: H264FilterSettingsProperty.Builder.() -> Unit): Unit =
          filterSettings(H264FilterSettingsProperty(filterSettings))

      public override fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
      }

      public override fun flickerAq(flickerAq: String) {
        cdkBuilder.flickerAq(flickerAq)
      }

      public override fun forceFieldPictures(forceFieldPictures: String) {
        cdkBuilder.forceFieldPictures(forceFieldPictures)
      }

      public override fun framerateControl(framerateControl: String) {
        cdkBuilder.framerateControl(framerateControl)
      }

      public override fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
      }

      public override fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
      }

      public override fun gopBReference(gopBReference: String) {
        cdkBuilder.gopBReference(gopBReference)
      }

      public override fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
      }

      public override fun gopNumBFrames(gopNumBFrames: Number) {
        cdkBuilder.gopNumBFrames(gopNumBFrames)
      }

      public override fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
      }

      public override fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
      }

      public override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public override fun lookAheadRateControl(lookAheadRateControl: String) {
        cdkBuilder.lookAheadRateControl(lookAheadRateControl)
      }

      public override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      public override fun minIInterval(minIInterval: Number) {
        cdkBuilder.minIInterval(minIInterval)
      }

      public override fun numRefFrames(numRefFrames: Number) {
        cdkBuilder.numRefFrames(numRefFrames)
      }

      public override fun parControl(parControl: String) {
        cdkBuilder.parControl(parControl)
      }

      public override fun parDenominator(parDenominator: Number) {
        cdkBuilder.parDenominator(parDenominator)
      }

      public override fun parNumerator(parNumerator: Number) {
        cdkBuilder.parNumerator(parNumerator)
      }

      public override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      public override fun qualityLevel(qualityLevel: String) {
        cdkBuilder.qualityLevel(qualityLevel)
      }

      public override fun qvbrQualityLevel(qvbrQualityLevel: Number) {
        cdkBuilder.qvbrQualityLevel(qvbrQualityLevel)
      }

      public override fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
      }

      public override fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
      }

      public override fun sceneChangeDetect(sceneChangeDetect: String) {
        cdkBuilder.sceneChangeDetect(sceneChangeDetect)
      }

      public override fun slices(slices: Number) {
        cdkBuilder.slices(slices)
      }

      public override fun softness(softness: Number) {
        cdkBuilder.softness(softness)
      }

      public override fun spatialAq(spatialAq: String) {
        cdkBuilder.spatialAq(spatialAq)
      }

      public override fun subgopLength(subgopLength: String) {
        cdkBuilder.subgopLength(subgopLength)
      }

      public override fun syntax(syntax: String) {
        cdkBuilder.syntax(syntax)
      }

      public override fun temporalAq(temporalAq: String) {
        cdkBuilder.temporalAq(temporalAq)
      }

      public override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62643fd88f34450bd48fc495cc91e3e5239fc404fc1f3ed5e8679376335b6a45")
      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      public override fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty,
    ) : H264SettingsProperty {
      public override fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

      public override fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun bufFillPct(): Number? = unwrap(this).getBufFillPct()

      public override fun bufSize(): Number? = unwrap(this).getBufSize()

      public override fun colorMetadata(): String? = unwrap(this).getColorMetadata()

      public override fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

      public override fun entropyEncoding(): String? = unwrap(this).getEntropyEncoding()

      public override fun filterSettings(): Any? = unwrap(this).getFilterSettings()

      public override fun fixedAfd(): String? = unwrap(this).getFixedAfd()

      public override fun flickerAq(): String? = unwrap(this).getFlickerAq()

      public override fun forceFieldPictures(): String? = unwrap(this).getForceFieldPictures()

      public override fun framerateControl(): String? = unwrap(this).getFramerateControl()

      public override fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

      public override fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

      public override fun gopBReference(): String? = unwrap(this).getGopBReference()

      public override fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

      public override fun gopNumBFrames(): Number? = unwrap(this).getGopNumBFrames()

      public override fun gopSize(): Number? = unwrap(this).getGopSize()

      public override fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

      public override fun level(): String? = unwrap(this).getLevel()

      public override fun lookAheadRateControl(): String? = unwrap(this).getLookAheadRateControl()

      public override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

      public override fun minIInterval(): Number? = unwrap(this).getMinIInterval()

      public override fun numRefFrames(): Number? = unwrap(this).getNumRefFrames()

      public override fun parControl(): String? = unwrap(this).getParControl()

      public override fun parDenominator(): Number? = unwrap(this).getParDenominator()

      public override fun parNumerator(): Number? = unwrap(this).getParNumerator()

      public override fun profile(): String? = unwrap(this).getProfile()

      public override fun qualityLevel(): String? = unwrap(this).getQualityLevel()

      public override fun qvbrQualityLevel(): Number? = unwrap(this).getQvbrQualityLevel()

      public override fun rateControlMode(): String? = unwrap(this).getRateControlMode()

      public override fun scanType(): String? = unwrap(this).getScanType()

      public override fun sceneChangeDetect(): String? = unwrap(this).getSceneChangeDetect()

      public override fun slices(): Number? = unwrap(this).getSlices()

      public override fun softness(): Number? = unwrap(this).getSoftness()

      public override fun spatialAq(): String? = unwrap(this).getSpatialAq()

      public override fun subgopLength(): String? = unwrap(this).getSubgopLength()

      public override fun syntax(): String? = unwrap(this).getSyntax()

      public override fun temporalAq(): String? = unwrap(this).getTemporalAq()

      public override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

      public override fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): H264SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty):
          H264SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H264SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TimecodeConfigProperty {
    public fun source(): String? = unwrap(this).getSource()

    public fun syncThreshold(): Number? = unwrap(this).getSyncThreshold()

    public interface Builder {
      public fun source(source: String) {
      }

      public fun syncThreshold(syncThreshold: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty.builder()

      public override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public override fun syncThreshold(syncThreshold: Number) {
        cdkBuilder.syncThreshold(syncThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty,
    ) : TimecodeConfigProperty {
      public override fun source(): String? = unwrap(this).getSource()

      public override fun syncThreshold(): Number? = unwrap(this).getSyncThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimecodeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty):
          TimecodeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimecodeConfigProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface Ac3SettingsProperty {
    public fun attenuationControl(): String? = unwrap(this).getAttenuationControl()

    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun bitstreamMode(): String? = unwrap(this).getBitstreamMode()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun dialnorm(): Number? = unwrap(this).getDialnorm()

    public fun drcProfile(): String? = unwrap(this).getDrcProfile()

    public fun lfeFilter(): String? = unwrap(this).getLfeFilter()

    public fun metadataControl(): String? = unwrap(this).getMetadataControl()

    public interface Builder {
      public fun attenuationControl(attenuationControl: String) {
      }

      public fun bitrate(bitrate: Number) {
      }

      public fun bitstreamMode(bitstreamMode: String) {
      }

      public fun codingMode(codingMode: String) {
      }

      public fun dialnorm(dialnorm: Number) {
      }

      public fun drcProfile(drcProfile: String) {
      }

      public fun lfeFilter(lfeFilter: String) {
      }

      public fun metadataControl(metadataControl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty.builder()

      public override fun attenuationControl(attenuationControl: String) {
        cdkBuilder.attenuationControl(attenuationControl)
      }

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun bitstreamMode(bitstreamMode: String) {
        cdkBuilder.bitstreamMode(bitstreamMode)
      }

      public override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      public override fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
      }

      public override fun drcProfile(drcProfile: String) {
        cdkBuilder.drcProfile(drcProfile)
      }

      public override fun lfeFilter(lfeFilter: String) {
        cdkBuilder.lfeFilter(lfeFilter)
      }

      public override fun metadataControl(metadataControl: String) {
        cdkBuilder.metadataControl(metadataControl)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty,
    ) : Ac3SettingsProperty {
      public override fun attenuationControl(): String? = unwrap(this).getAttenuationControl()

      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun bitstreamMode(): String? = unwrap(this).getBitstreamMode()

      public override fun codingMode(): String? = unwrap(this).getCodingMode()

      public override fun dialnorm(): Number? = unwrap(this).getDialnorm()

      public override fun drcProfile(): String? = unwrap(this).getDrcProfile()

      public override fun lfeFilter(): String? = unwrap(this).getLfeFilter()

      public override fun metadataControl(): String? = unwrap(this).getMetadataControl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ac3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty):
          Ac3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ac3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MotionGraphicsSettingsProperty {
    public fun htmlMotionGraphicsSettings(): Any? = unwrap(this).getHtmlMotionGraphicsSettings()

    public interface Builder {
      public fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: IResolvable) {
      }

      public
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea95aecca987c781dec9f8f8117be78dd45740fe58cdbdc9a5bee61973ea6ea5")
      public
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty.builder()

      public override fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: IResolvable) {
        cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings.let(IResolvable::unwrap))
      }

      public override
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty) {
        cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings.let(HtmlMotionGraphicsSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea95aecca987c781dec9f8f8117be78dd45740fe58cdbdc9a5bee61973ea6ea5")
      public override
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty.Builder.() -> Unit):
          Unit =
          htmlMotionGraphicsSettings(HtmlMotionGraphicsSettingsProperty(htmlMotionGraphicsSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty,
    ) : MotionGraphicsSettingsProperty {
      public override fun htmlMotionGraphicsSettings(): Any? =
          unwrap(this).getHtmlMotionGraphicsSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MotionGraphicsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty):
          MotionGraphicsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MotionGraphicsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface H265FilterSettingsProperty {
    public fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()

    public interface Builder {
      public fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
      }

      public fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65928fbd39e48021517a19731dd947e298d3beba075d062f34b8fa48f167175b")
      public
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty.builder()

      public override fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(IResolvable::unwrap))
      }

      public override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(TemporalFilterSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65928fbd39e48021517a19731dd947e298d3beba075d062f34b8fa48f167175b")
      public override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit):
          Unit = temporalFilterSettings(TemporalFilterSettingsProperty(temporalFilterSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty,
    ) : H265FilterSettingsProperty {
      public override fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): H265FilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty):
          H265FilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H265FilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FecOutputSettingsProperty {
    public fun columnDepth(): Number? = unwrap(this).getColumnDepth()

    public fun includeFec(): String? = unwrap(this).getIncludeFec()

    public fun rowLength(): Number? = unwrap(this).getRowLength()

    public interface Builder {
      public fun columnDepth(columnDepth: Number) {
      }

      public fun includeFec(includeFec: String) {
      }

      public fun rowLength(rowLength: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty.builder()

      public override fun columnDepth(columnDepth: Number) {
        cdkBuilder.columnDepth(columnDepth)
      }

      public override fun includeFec(includeFec: String) {
        cdkBuilder.includeFec(includeFec)
      }

      public override fun rowLength(rowLength: Number) {
        cdkBuilder.rowLength(rowLength)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty,
    ) : FecOutputSettingsProperty {
      public override fun columnDepth(): Number? = unwrap(this).getColumnDepth()

      public override fun includeFec(): String? = unwrap(this).getIncludeFec()

      public override fun rowLength(): Number? = unwrap(this).getRowLength()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FecOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty):
          FecOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FecOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AudioCodecSettingsProperty {
    public fun aacSettings(): Any? = unwrap(this).getAacSettings()

    public fun ac3Settings(): Any? = unwrap(this).getAc3Settings()

    public fun eac3AtmosSettings(): Any? = unwrap(this).getEac3AtmosSettings()

    public fun eac3Settings(): Any? = unwrap(this).getEac3Settings()

    public fun mp2Settings(): Any? = unwrap(this).getMp2Settings()

    public fun passThroughSettings(): Any? = unwrap(this).getPassThroughSettings()

    public fun wavSettings(): Any? = unwrap(this).getWavSettings()

    public interface Builder {
      public fun aacSettings(aacSettings: IResolvable) {
      }

      public fun aacSettings(aacSettings: AacSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3d8bbb6c06e236e6292600ece96fb30e4abdcf719e39087e5840348da476c3")
      public fun aacSettings(aacSettings: AacSettingsProperty.Builder.() -> Unit) {
      }

      public fun ac3Settings(ac3Settings: IResolvable) {
      }

      public fun ac3Settings(ac3Settings: Ac3SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e9dec7e39639776b792de10f424b5e64c7a6b1497b3681c1b2a222e702d0bb3")
      public fun ac3Settings(ac3Settings: Ac3SettingsProperty.Builder.() -> Unit) {
      }

      public fun eac3AtmosSettings(eac3AtmosSettings: IResolvable) {
      }

      public fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46036ada089740fa53234723fce5bc8dab10fc5fd212d766a051f5084871af43")
      public
          fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty.Builder.() -> Unit) {
      }

      public fun eac3Settings(eac3Settings: IResolvable) {
      }

      public fun eac3Settings(eac3Settings: Eac3SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e079ab7c3c2717b053f8936d3b8c3a3d0a41c87cc849aedc8165761d9b9b168e")
      public fun eac3Settings(eac3Settings: Eac3SettingsProperty.Builder.() -> Unit) {
      }

      public fun mp2Settings(mp2Settings: IResolvable) {
      }

      public fun mp2Settings(mp2Settings: Mp2SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd377a944c5b24bc2b89dbb05688227491c4bf7e380f5877e6d0013e968038f")
      public fun mp2Settings(mp2Settings: Mp2SettingsProperty.Builder.() -> Unit) {
      }

      public fun passThroughSettings(passThroughSettings: IResolvable) {
      }

      public fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c975aa5d5defefacdb94ae44d94fde35164b786bab0bd1de87d32cd1988113a5")
      public
          fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty.Builder.() -> Unit) {
      }

      public fun wavSettings(wavSettings: IResolvable) {
      }

      public fun wavSettings(wavSettings: WavSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17813353f8d0c733258c398a29a167358c5c1cc2f93bfda1583b8f0701c2c55d")
      public fun wavSettings(wavSettings: WavSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty.builder()

      public override fun aacSettings(aacSettings: IResolvable) {
        cdkBuilder.aacSettings(aacSettings.let(IResolvable::unwrap))
      }

      public override fun aacSettings(aacSettings: AacSettingsProperty) {
        cdkBuilder.aacSettings(aacSettings.let(AacSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3d8bbb6c06e236e6292600ece96fb30e4abdcf719e39087e5840348da476c3")
      public override fun aacSettings(aacSettings: AacSettingsProperty.Builder.() -> Unit): Unit =
          aacSettings(AacSettingsProperty(aacSettings))

      public override fun ac3Settings(ac3Settings: IResolvable) {
        cdkBuilder.ac3Settings(ac3Settings.let(IResolvable::unwrap))
      }

      public override fun ac3Settings(ac3Settings: Ac3SettingsProperty) {
        cdkBuilder.ac3Settings(ac3Settings.let(Ac3SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e9dec7e39639776b792de10f424b5e64c7a6b1497b3681c1b2a222e702d0bb3")
      public override fun ac3Settings(ac3Settings: Ac3SettingsProperty.Builder.() -> Unit): Unit =
          ac3Settings(Ac3SettingsProperty(ac3Settings))

      public override fun eac3AtmosSettings(eac3AtmosSettings: IResolvable) {
        cdkBuilder.eac3AtmosSettings(eac3AtmosSettings.let(IResolvable::unwrap))
      }

      public override fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty) {
        cdkBuilder.eac3AtmosSettings(eac3AtmosSettings.let(Eac3AtmosSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46036ada089740fa53234723fce5bc8dab10fc5fd212d766a051f5084871af43")
      public override
          fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty.Builder.() -> Unit):
          Unit = eac3AtmosSettings(Eac3AtmosSettingsProperty(eac3AtmosSettings))

      public override fun eac3Settings(eac3Settings: IResolvable) {
        cdkBuilder.eac3Settings(eac3Settings.let(IResolvable::unwrap))
      }

      public override fun eac3Settings(eac3Settings: Eac3SettingsProperty) {
        cdkBuilder.eac3Settings(eac3Settings.let(Eac3SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e079ab7c3c2717b053f8936d3b8c3a3d0a41c87cc849aedc8165761d9b9b168e")
      public override fun eac3Settings(eac3Settings: Eac3SettingsProperty.Builder.() -> Unit): Unit
          = eac3Settings(Eac3SettingsProperty(eac3Settings))

      public override fun mp2Settings(mp2Settings: IResolvable) {
        cdkBuilder.mp2Settings(mp2Settings.let(IResolvable::unwrap))
      }

      public override fun mp2Settings(mp2Settings: Mp2SettingsProperty) {
        cdkBuilder.mp2Settings(mp2Settings.let(Mp2SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd377a944c5b24bc2b89dbb05688227491c4bf7e380f5877e6d0013e968038f")
      public override fun mp2Settings(mp2Settings: Mp2SettingsProperty.Builder.() -> Unit): Unit =
          mp2Settings(Mp2SettingsProperty(mp2Settings))

      public override fun passThroughSettings(passThroughSettings: IResolvable) {
        cdkBuilder.passThroughSettings(passThroughSettings.let(IResolvable::unwrap))
      }

      public override fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty) {
        cdkBuilder.passThroughSettings(passThroughSettings.let(PassThroughSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c975aa5d5defefacdb94ae44d94fde35164b786bab0bd1de87d32cd1988113a5")
      public override
          fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty.Builder.() -> Unit):
          Unit = passThroughSettings(PassThroughSettingsProperty(passThroughSettings))

      public override fun wavSettings(wavSettings: IResolvable) {
        cdkBuilder.wavSettings(wavSettings.let(IResolvable::unwrap))
      }

      public override fun wavSettings(wavSettings: WavSettingsProperty) {
        cdkBuilder.wavSettings(wavSettings.let(WavSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17813353f8d0c733258c398a29a167358c5c1cc2f93bfda1583b8f0701c2c55d")
      public override fun wavSettings(wavSettings: WavSettingsProperty.Builder.() -> Unit): Unit =
          wavSettings(WavSettingsProperty(wavSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty,
    ) : AudioCodecSettingsProperty {
      public override fun aacSettings(): Any? = unwrap(this).getAacSettings()

      public override fun ac3Settings(): Any? = unwrap(this).getAc3Settings()

      public override fun eac3AtmosSettings(): Any? = unwrap(this).getEac3AtmosSettings()

      public override fun eac3Settings(): Any? = unwrap(this).getEac3Settings()

      public override fun mp2Settings(): Any? = unwrap(this).getMp2Settings()

      public override fun passThroughSettings(): Any? = unwrap(this).getPassThroughSettings()

      public override fun wavSettings(): Any? = unwrap(this).getWavSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioCodecSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty):
          AudioCodecSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioCodecSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface Mpeg2FilterSettingsProperty {
    public fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()

    public interface Builder {
      public fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
      }

      public fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22bbefe6ccacc93679508e1706701d4c45494b961cf4045bcff947b9b3627b5a")
      public
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty.builder()

      public override fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(IResolvable::unwrap))
      }

      public override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(TemporalFilterSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22bbefe6ccacc93679508e1706701d4c45494b961cf4045bcff947b9b3627b5a")
      public override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit):
          Unit = temporalFilterSettings(TemporalFilterSettingsProperty(temporalFilterSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty,
    ) : Mpeg2FilterSettingsProperty {
      public override fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Mpeg2FilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty):
          Mpeg2FilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Mpeg2FilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EmbeddedDestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty,
    ) : EmbeddedDestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EmbeddedDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty):
          EmbeddedDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmbeddedDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexProgramChannelDestinationSettingsProperty {
    public fun multiplexId(): String? = unwrap(this).getMultiplexId()

    public fun programName(): String? = unwrap(this).getProgramName()

    public interface Builder {
      public fun multiplexId(multiplexId: String) {
      }

      public fun programName(programName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.builder()

      public override fun multiplexId(multiplexId: String) {
        cdkBuilder.multiplexId(multiplexId)
      }

      public override fun programName(programName: String) {
        cdkBuilder.programName(programName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty,
    ) : MultiplexProgramChannelDestinationSettingsProperty {
      public override fun multiplexId(): String? = unwrap(this).getMultiplexId()

      public override fun programName(): String? = unwrap(this).getProgramName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexProgramChannelDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty):
          MultiplexProgramChannelDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexProgramChannelDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputGroupSettingsProperty {
    public fun archiveGroupSettings(): Any? = unwrap(this).getArchiveGroupSettings()

    public fun frameCaptureGroupSettings(): Any? = unwrap(this).getFrameCaptureGroupSettings()

    public fun hlsGroupSettings(): Any? = unwrap(this).getHlsGroupSettings()

    public fun mediaPackageGroupSettings(): Any? = unwrap(this).getMediaPackageGroupSettings()

    public fun msSmoothGroupSettings(): Any? = unwrap(this).getMsSmoothGroupSettings()

    public fun multiplexGroupSettings(): Any? = unwrap(this).getMultiplexGroupSettings()

    public fun rtmpGroupSettings(): Any? = unwrap(this).getRtmpGroupSettings()

    public fun udpGroupSettings(): Any? = unwrap(this).getUdpGroupSettings()

    public interface Builder {
      public fun archiveGroupSettings(archiveGroupSettings: IResolvable) {
      }

      public fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4974113d5d2cba0b7423c1d194d0262eb916d552b8af23daefcea844afe0a39")
      public
          fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun frameCaptureGroupSettings(frameCaptureGroupSettings: IResolvable) {
      }

      public
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47f198a83ef74edfc2ae0ee73833037da5b016c1dd5a03421c0fe74859f8b6fc")
      public
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsGroupSettings(hlsGroupSettings: IResolvable) {
      }

      public fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d1da1b75520e53dfc2a85505a55e57fe5d2e0e10adb797171ac7b2bf2d3776")
      public fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun mediaPackageGroupSettings(mediaPackageGroupSettings: IResolvable) {
      }

      public
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("896cf8394af2a685df0c139595ab6b3459517c1b361726932f7ff095a5d785b5")
      public
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun msSmoothGroupSettings(msSmoothGroupSettings: IResolvable) {
      }

      public fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e176d86435dd1cc8f61fc2106bca89a19a04311a732bcd8c1dd9def80845dc90")
      public
          fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun multiplexGroupSettings(multiplexGroupSettings: IResolvable) {
      }

      public fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5a1025262892dbe9108832edb8a9d312421be63a28567111073acfcfe0b813e")
      public
          fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun rtmpGroupSettings(rtmpGroupSettings: IResolvable) {
      }

      public fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72d6ef372e33f1e29fcb9a476db73cea06e8ed8486049d9531962c64a08e6031")
      public
          fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun udpGroupSettings(udpGroupSettings: IResolvable) {
      }

      public fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5305ece5eca3ce2b7308ab74e84d182d681fdfabb98ea58266083bcf05c1fbb3")
      public fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty.builder()

      public override fun archiveGroupSettings(archiveGroupSettings: IResolvable) {
        cdkBuilder.archiveGroupSettings(archiveGroupSettings.let(IResolvable::unwrap))
      }

      public override fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty) {
        cdkBuilder.archiveGroupSettings(archiveGroupSettings.let(ArchiveGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4974113d5d2cba0b7423c1d194d0262eb916d552b8af23daefcea844afe0a39")
      public override
          fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty.Builder.() -> Unit):
          Unit = archiveGroupSettings(ArchiveGroupSettingsProperty(archiveGroupSettings))

      public override fun frameCaptureGroupSettings(frameCaptureGroupSettings: IResolvable) {
        cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings.let(IResolvable::unwrap))
      }

      public override
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty) {
        cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings.let(FrameCaptureGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47f198a83ef74edfc2ae0ee73833037da5b016c1dd5a03421c0fe74859f8b6fc")
      public override
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty.Builder.() -> Unit):
          Unit =
          frameCaptureGroupSettings(FrameCaptureGroupSettingsProperty(frameCaptureGroupSettings))

      public override fun hlsGroupSettings(hlsGroupSettings: IResolvable) {
        cdkBuilder.hlsGroupSettings(hlsGroupSettings.let(IResolvable::unwrap))
      }

      public override fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty) {
        cdkBuilder.hlsGroupSettings(hlsGroupSettings.let(HlsGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d1da1b75520e53dfc2a85505a55e57fe5d2e0e10adb797171ac7b2bf2d3776")
      public override
          fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty.Builder.() -> Unit): Unit
          = hlsGroupSettings(HlsGroupSettingsProperty(hlsGroupSettings))

      public override fun mediaPackageGroupSettings(mediaPackageGroupSettings: IResolvable) {
        cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings.let(IResolvable::unwrap))
      }

      public override
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty) {
        cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings.let(MediaPackageGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("896cf8394af2a685df0c139595ab6b3459517c1b361726932f7ff095a5d785b5")
      public override
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty.Builder.() -> Unit):
          Unit =
          mediaPackageGroupSettings(MediaPackageGroupSettingsProperty(mediaPackageGroupSettings))

      public override fun msSmoothGroupSettings(msSmoothGroupSettings: IResolvable) {
        cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings.let(IResolvable::unwrap))
      }

      public override
          fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty) {
        cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings.let(MsSmoothGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e176d86435dd1cc8f61fc2106bca89a19a04311a732bcd8c1dd9def80845dc90")
      public override
          fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty.Builder.() -> Unit):
          Unit = msSmoothGroupSettings(MsSmoothGroupSettingsProperty(msSmoothGroupSettings))

      public override fun multiplexGroupSettings(multiplexGroupSettings: IResolvable) {
        cdkBuilder.multiplexGroupSettings(multiplexGroupSettings.let(IResolvable::unwrap))
      }

      public override
          fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty) {
        cdkBuilder.multiplexGroupSettings(multiplexGroupSettings.let(MultiplexGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5a1025262892dbe9108832edb8a9d312421be63a28567111073acfcfe0b813e")
      public override
          fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty.Builder.() -> Unit):
          Unit = multiplexGroupSettings(MultiplexGroupSettingsProperty(multiplexGroupSettings))

      public override fun rtmpGroupSettings(rtmpGroupSettings: IResolvable) {
        cdkBuilder.rtmpGroupSettings(rtmpGroupSettings.let(IResolvable::unwrap))
      }

      public override fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty) {
        cdkBuilder.rtmpGroupSettings(rtmpGroupSettings.let(RtmpGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72d6ef372e33f1e29fcb9a476db73cea06e8ed8486049d9531962c64a08e6031")
      public override
          fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty.Builder.() -> Unit):
          Unit = rtmpGroupSettings(RtmpGroupSettingsProperty(rtmpGroupSettings))

      public override fun udpGroupSettings(udpGroupSettings: IResolvable) {
        cdkBuilder.udpGroupSettings(udpGroupSettings.let(IResolvable::unwrap))
      }

      public override fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty) {
        cdkBuilder.udpGroupSettings(udpGroupSettings.let(UdpGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5305ece5eca3ce2b7308ab74e84d182d681fdfabb98ea58266083bcf05c1fbb3")
      public override
          fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty.Builder.() -> Unit): Unit
          = udpGroupSettings(UdpGroupSettingsProperty(udpGroupSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty,
    ) : OutputGroupSettingsProperty {
      public override fun archiveGroupSettings(): Any? = unwrap(this).getArchiveGroupSettings()

      public override fun frameCaptureGroupSettings(): Any? =
          unwrap(this).getFrameCaptureGroupSettings()

      public override fun hlsGroupSettings(): Any? = unwrap(this).getHlsGroupSettings()

      public override fun mediaPackageGroupSettings(): Any? =
          unwrap(this).getMediaPackageGroupSettings()

      public override fun msSmoothGroupSettings(): Any? = unwrap(this).getMsSmoothGroupSettings()

      public override fun multiplexGroupSettings(): Any? = unwrap(this).getMultiplexGroupSettings()

      public override fun rtmpGroupSettings(): Any? = unwrap(this).getRtmpGroupSettings()

      public override fun udpGroupSettings(): Any? = unwrap(this).getUdpGroupSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty):
          OutputGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Eac3SettingsProperty {
    public fun attenuationControl(): String? = unwrap(this).getAttenuationControl()

    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun bitstreamMode(): String? = unwrap(this).getBitstreamMode()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun dcFilter(): String? = unwrap(this).getDcFilter()

    public fun dialnorm(): Number? = unwrap(this).getDialnorm()

    public fun drcLine(): String? = unwrap(this).getDrcLine()

    public fun drcRf(): String? = unwrap(this).getDrcRf()

    public fun lfeControl(): String? = unwrap(this).getLfeControl()

    public fun lfeFilter(): String? = unwrap(this).getLfeFilter()

    public fun loRoCenterMixLevel(): Number? = unwrap(this).getLoRoCenterMixLevel()

    public fun loRoSurroundMixLevel(): Number? = unwrap(this).getLoRoSurroundMixLevel()

    public fun ltRtCenterMixLevel(): Number? = unwrap(this).getLtRtCenterMixLevel()

    public fun ltRtSurroundMixLevel(): Number? = unwrap(this).getLtRtSurroundMixLevel()

    public fun metadataControl(): String? = unwrap(this).getMetadataControl()

    public fun passthroughControl(): String? = unwrap(this).getPassthroughControl()

    public fun phaseControl(): String? = unwrap(this).getPhaseControl()

    public fun stereoDownmix(): String? = unwrap(this).getStereoDownmix()

    public fun surroundExMode(): String? = unwrap(this).getSurroundExMode()

    public fun surroundMode(): String? = unwrap(this).getSurroundMode()

    public interface Builder {
      public fun attenuationControl(attenuationControl: String) {
      }

      public fun bitrate(bitrate: Number) {
      }

      public fun bitstreamMode(bitstreamMode: String) {
      }

      public fun codingMode(codingMode: String) {
      }

      public fun dcFilter(dcFilter: String) {
      }

      public fun dialnorm(dialnorm: Number) {
      }

      public fun drcLine(drcLine: String) {
      }

      public fun drcRf(drcRf: String) {
      }

      public fun lfeControl(lfeControl: String) {
      }

      public fun lfeFilter(lfeFilter: String) {
      }

      public fun loRoCenterMixLevel(loRoCenterMixLevel: Number) {
      }

      public fun loRoSurroundMixLevel(loRoSurroundMixLevel: Number) {
      }

      public fun ltRtCenterMixLevel(ltRtCenterMixLevel: Number) {
      }

      public fun ltRtSurroundMixLevel(ltRtSurroundMixLevel: Number) {
      }

      public fun metadataControl(metadataControl: String) {
      }

      public fun passthroughControl(passthroughControl: String) {
      }

      public fun phaseControl(phaseControl: String) {
      }

      public fun stereoDownmix(stereoDownmix: String) {
      }

      public fun surroundExMode(surroundExMode: String) {
      }

      public fun surroundMode(surroundMode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty.builder()

      public override fun attenuationControl(attenuationControl: String) {
        cdkBuilder.attenuationControl(attenuationControl)
      }

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun bitstreamMode(bitstreamMode: String) {
        cdkBuilder.bitstreamMode(bitstreamMode)
      }

      public override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      public override fun dcFilter(dcFilter: String) {
        cdkBuilder.dcFilter(dcFilter)
      }

      public override fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
      }

      public override fun drcLine(drcLine: String) {
        cdkBuilder.drcLine(drcLine)
      }

      public override fun drcRf(drcRf: String) {
        cdkBuilder.drcRf(drcRf)
      }

      public override fun lfeControl(lfeControl: String) {
        cdkBuilder.lfeControl(lfeControl)
      }

      public override fun lfeFilter(lfeFilter: String) {
        cdkBuilder.lfeFilter(lfeFilter)
      }

      public override fun loRoCenterMixLevel(loRoCenterMixLevel: Number) {
        cdkBuilder.loRoCenterMixLevel(loRoCenterMixLevel)
      }

      public override fun loRoSurroundMixLevel(loRoSurroundMixLevel: Number) {
        cdkBuilder.loRoSurroundMixLevel(loRoSurroundMixLevel)
      }

      public override fun ltRtCenterMixLevel(ltRtCenterMixLevel: Number) {
        cdkBuilder.ltRtCenterMixLevel(ltRtCenterMixLevel)
      }

      public override fun ltRtSurroundMixLevel(ltRtSurroundMixLevel: Number) {
        cdkBuilder.ltRtSurroundMixLevel(ltRtSurroundMixLevel)
      }

      public override fun metadataControl(metadataControl: String) {
        cdkBuilder.metadataControl(metadataControl)
      }

      public override fun passthroughControl(passthroughControl: String) {
        cdkBuilder.passthroughControl(passthroughControl)
      }

      public override fun phaseControl(phaseControl: String) {
        cdkBuilder.phaseControl(phaseControl)
      }

      public override fun stereoDownmix(stereoDownmix: String) {
        cdkBuilder.stereoDownmix(stereoDownmix)
      }

      public override fun surroundExMode(surroundExMode: String) {
        cdkBuilder.surroundExMode(surroundExMode)
      }

      public override fun surroundMode(surroundMode: String) {
        cdkBuilder.surroundMode(surroundMode)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty,
    ) : Eac3SettingsProperty {
      public override fun attenuationControl(): String? = unwrap(this).getAttenuationControl()

      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun bitstreamMode(): String? = unwrap(this).getBitstreamMode()

      public override fun codingMode(): String? = unwrap(this).getCodingMode()

      public override fun dcFilter(): String? = unwrap(this).getDcFilter()

      public override fun dialnorm(): Number? = unwrap(this).getDialnorm()

      public override fun drcLine(): String? = unwrap(this).getDrcLine()

      public override fun drcRf(): String? = unwrap(this).getDrcRf()

      public override fun lfeControl(): String? = unwrap(this).getLfeControl()

      public override fun lfeFilter(): String? = unwrap(this).getLfeFilter()

      public override fun loRoCenterMixLevel(): Number? = unwrap(this).getLoRoCenterMixLevel()

      public override fun loRoSurroundMixLevel(): Number? = unwrap(this).getLoRoSurroundMixLevel()

      public override fun ltRtCenterMixLevel(): Number? = unwrap(this).getLtRtCenterMixLevel()

      public override fun ltRtSurroundMixLevel(): Number? = unwrap(this).getLtRtSurroundMixLevel()

      public override fun metadataControl(): String? = unwrap(this).getMetadataControl()

      public override fun passthroughControl(): String? = unwrap(this).getPassthroughControl()

      public override fun phaseControl(): String? = unwrap(this).getPhaseControl()

      public override fun stereoDownmix(): String? = unwrap(this).getStereoDownmix()

      public override fun surroundExMode(): String? = unwrap(this).getSurroundExMode()

      public override fun surroundMode(): String? = unwrap(this).getSurroundMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Eac3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty):
          Eac3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Eac3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface H264FilterSettingsProperty {
    public fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()

    public interface Builder {
      public fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
      }

      public fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("138f62dfbe2b2497cceee7f1ce656cf2de46835f66910fba26851abde99311b8")
      public
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty.builder()

      public override fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(IResolvable::unwrap))
      }

      public override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(TemporalFilterSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("138f62dfbe2b2497cceee7f1ce656cf2de46835f66910fba26851abde99311b8")
      public override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit):
          Unit = temporalFilterSettings(TemporalFilterSettingsProperty(temporalFilterSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty,
    ) : H264FilterSettingsProperty {
      public override fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): H264FilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty):
          H264FilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H264FilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KeyProviderSettingsProperty {
    public fun staticKeySettings(): Any? = unwrap(this).getStaticKeySettings()

    public interface Builder {
      public fun staticKeySettings(staticKeySettings: IResolvable) {
      }

      public fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a12120b72e91dd34a46bf4583553378d1d5e84df7329d78a942e4201a37db7e8")
      public
          fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty.builder()

      public override fun staticKeySettings(staticKeySettings: IResolvable) {
        cdkBuilder.staticKeySettings(staticKeySettings.let(IResolvable::unwrap))
      }

      public override fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty) {
        cdkBuilder.staticKeySettings(staticKeySettings.let(StaticKeySettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a12120b72e91dd34a46bf4583553378d1d5e84df7329d78a942e4201a37db7e8")
      public override
          fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty.Builder.() -> Unit):
          Unit = staticKeySettings(StaticKeySettingsProperty(staticKeySettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty,
    ) : KeyProviderSettingsProperty {
      public override fun staticKeySettings(): Any? = unwrap(this).getStaticKeySettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyProviderSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty):
          KeyProviderSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyProviderSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MaintenanceUpdateSettingsProperty {
    public fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

    public fun maintenanceScheduledDate(): String? = unwrap(this).getMaintenanceScheduledDate()

    public fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()

    public interface Builder {
      public fun maintenanceDay(maintenanceDay: String) {
      }

      public fun maintenanceScheduledDate(maintenanceScheduledDate: String) {
      }

      public fun maintenanceStartTime(maintenanceStartTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty.builder()

      public override fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
      }

      public override fun maintenanceScheduledDate(maintenanceScheduledDate: String) {
        cdkBuilder.maintenanceScheduledDate(maintenanceScheduledDate)
      }

      public override fun maintenanceStartTime(maintenanceStartTime: String) {
        cdkBuilder.maintenanceStartTime(maintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty,
    ) : MaintenanceUpdateSettingsProperty {
      public override fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

      public override fun maintenanceScheduledDate(): String? =
          unwrap(this).getMaintenanceScheduledDate()

      public override fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceUpdateSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty):
          MaintenanceUpdateSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceUpdateSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WavSettingsProperty {
    public fun bitDepth(): Number? = unwrap(this).getBitDepth()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun sampleRate(): Number? = unwrap(this).getSampleRate()

    public interface Builder {
      public fun bitDepth(bitDepth: Number) {
      }

      public fun codingMode(codingMode: String) {
      }

      public fun sampleRate(sampleRate: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty.builder()

      public override fun bitDepth(bitDepth: Number) {
        cdkBuilder.bitDepth(bitDepth)
      }

      public override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      public override fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty,
    ) : WavSettingsProperty {
      public override fun bitDepth(): Number? = unwrap(this).getBitDepth()

      public override fun codingMode(): String? = unwrap(this).getCodingMode()

      public override fun sampleRate(): Number? = unwrap(this).getSampleRate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WavSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty):
          WavSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WavSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MaintenanceCreateSettingsProperty {
    public fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

    public fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()

    public interface Builder {
      public fun maintenanceDay(maintenanceDay: String) {
      }

      public fun maintenanceStartTime(maintenanceStartTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty.builder()

      public override fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
      }

      public override fun maintenanceStartTime(maintenanceStartTime: String) {
        cdkBuilder.maintenanceStartTime(maintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty,
    ) : MaintenanceCreateSettingsProperty {
      public override fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

      public override fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceCreateSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty):
          MaintenanceCreateSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceCreateSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AribDestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty,
    ) : AribDestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AribDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty):
          AribDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AribDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FeatureActivationsProperty {
    public fun inputPrepareScheduleActions(): String? =
        unwrap(this).getInputPrepareScheduleActions()

    public fun outputStaticImageOverlayScheduleActions(): String? =
        unwrap(this).getOutputStaticImageOverlayScheduleActions()

    public interface Builder {
      public fun inputPrepareScheduleActions(inputPrepareScheduleActions: String) {
      }

      public
          fun outputStaticImageOverlayScheduleActions(outputStaticImageOverlayScheduleActions: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty.builder()

      public override fun inputPrepareScheduleActions(inputPrepareScheduleActions: String) {
        cdkBuilder.inputPrepareScheduleActions(inputPrepareScheduleActions)
      }

      public override
          fun outputStaticImageOverlayScheduleActions(outputStaticImageOverlayScheduleActions: String) {
        cdkBuilder.outputStaticImageOverlayScheduleActions(outputStaticImageOverlayScheduleActions)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty,
    ) : FeatureActivationsProperty {
      public override fun inputPrepareScheduleActions(): String? =
          unwrap(this).getInputPrepareScheduleActions()

      public override fun outputStaticImageOverlayScheduleActions(): String? =
          unwrap(this).getOutputStaticImageOverlayScheduleActions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FeatureActivationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty):
          FeatureActivationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FeatureActivationsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ArchiveGroupSettingsProperty {
    public fun archiveCdnSettings(): Any? = unwrap(this).getArchiveCdnSettings()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun rolloverInterval(): Number? = unwrap(this).getRolloverInterval()

    public interface Builder {
      public fun archiveCdnSettings(archiveCdnSettings: IResolvable) {
      }

      public fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b80cc730b6b2162a011a34d3dcad0860dd4100c68ca411a813152e32071dae0")
      public
          fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty.Builder.() -> Unit) {
      }

      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebe47c70734a0f9cb9b1401503411b86635b867034c353504b63fc3e8c52c4bc")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }

      public fun rolloverInterval(rolloverInterval: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty.builder()

      public override fun archiveCdnSettings(archiveCdnSettings: IResolvable) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings.let(IResolvable::unwrap))
      }

      public override fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings.let(ArchiveCdnSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b80cc730b6b2162a011a34d3dcad0860dd4100c68ca411a813152e32071dae0")
      public override
          fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty.Builder.() -> Unit):
          Unit = archiveCdnSettings(ArchiveCdnSettingsProperty(archiveCdnSettings))

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebe47c70734a0f9cb9b1401503411b86635b867034c353504b63fc3e8c52c4bc")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public override fun rolloverInterval(rolloverInterval: Number) {
        cdkBuilder.rolloverInterval(rolloverInterval)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty,
    ) : ArchiveGroupSettingsProperty {
      public override fun archiveCdnSettings(): Any? = unwrap(this).getArchiveCdnSettings()

      public override fun destination(): Any? = unwrap(this).getDestination()

      public override fun rolloverInterval(): Number? = unwrap(this).getRolloverInterval()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty):
          ArchiveGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NielsenNaesIiNwProperty {
    public fun checkDigitString(): String? = unwrap(this).getCheckDigitString()

    public fun sid(): Number? = unwrap(this).getSid()

    public fun timezone(): String? = unwrap(this).getTimezone()

    public interface Builder {
      public fun checkDigitString(checkDigitString: String) {
      }

      public fun sid(sid: Number) {
      }

      public fun timezone(timezone: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty.builder()

      public override fun checkDigitString(checkDigitString: String) {
        cdkBuilder.checkDigitString(checkDigitString)
      }

      public override fun sid(sid: Number) {
        cdkBuilder.sid(sid)
      }

      public override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty,
    ) : NielsenNaesIiNwProperty {
      public override fun checkDigitString(): String? = unwrap(this).getCheckDigitString()

      public override fun sid(): Number? = unwrap(this).getSid()

      public override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NielsenNaesIiNwProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty):
          NielsenNaesIiNwProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NielsenNaesIiNwProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NielsenCBETProperty {
    public fun cbetCheckDigitString(): String? = unwrap(this).getCbetCheckDigitString()

    public fun cbetStepaside(): String? = unwrap(this).getCbetStepaside()

    public fun csid(): String? = unwrap(this).getCsid()

    public interface Builder {
      public fun cbetCheckDigitString(cbetCheckDigitString: String) {
      }

      public fun cbetStepaside(cbetStepaside: String) {
      }

      public fun csid(csid: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty.builder()

      public override fun cbetCheckDigitString(cbetCheckDigitString: String) {
        cdkBuilder.cbetCheckDigitString(cbetCheckDigitString)
      }

      public override fun cbetStepaside(cbetStepaside: String) {
        cdkBuilder.cbetStepaside(cbetStepaside)
      }

      public override fun csid(csid: String) {
        cdkBuilder.csid(csid)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty,
    ) : NielsenCBETProperty {
      public override fun cbetCheckDigitString(): String? = unwrap(this).getCbetCheckDigitString()

      public override fun cbetStepaside(): String? = unwrap(this).getCbetStepaside()

      public override fun csid(): String? = unwrap(this).getCsid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NielsenCBETProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty):
          NielsenCBETProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NielsenCBETProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DvbNitSettingsProperty {
    public fun networkId(): Number? = unwrap(this).getNetworkId()

    public fun networkName(): String? = unwrap(this).getNetworkName()

    public fun repInterval(): Number? = unwrap(this).getRepInterval()

    public interface Builder {
      public fun networkId(networkId: Number) {
      }

      public fun networkName(networkName: String) {
      }

      public fun repInterval(repInterval: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty.builder()

      public override fun networkId(networkId: Number) {
        cdkBuilder.networkId(networkId)
      }

      public override fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
      }

      public override fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty,
    ) : DvbNitSettingsProperty {
      public override fun networkId(): Number? = unwrap(this).getNetworkId()

      public override fun networkName(): String? = unwrap(this).getNetworkName()

      public override fun repInterval(): Number? = unwrap(this).getRepInterval()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DvbNitSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty):
          DvbNitSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbNitSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface H265ColorSpaceSettingsProperty {
    public fun colorSpacePassthroughSettings(): Any? =
        unwrap(this).getColorSpacePassthroughSettings()

    public fun dolbyVision81Settings(): Any? = unwrap(this).getDolbyVision81Settings()

    public fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()

    public fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

    public fun rec709Settings(): Any? = unwrap(this).getRec709Settings()

    public interface Builder {
      public fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
      }

      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9965f647b90eae7f2b3f71ef17f3e94d9db2335ec498e10c00f38e70f26ac1b")
      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit) {
      }

      public fun dolbyVision81Settings(dolbyVision81Settings: IResolvable) {
      }

      public fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb0360cbca25a72c00fddb075e3eacd4e05003fd645739c7bd7dd474939eca5c")
      public
          fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty.Builder.() -> Unit) {
      }

      public fun hdr10Settings(hdr10Settings: IResolvable) {
      }

      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d08816bd3a3b8e97c2a6a0b50d770f7438e8fa5fc8a54dbc7d0bc5eee0faacb9")
      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit) {
      }

      public fun rec601Settings(rec601Settings: IResolvable) {
      }

      public fun rec601Settings(rec601Settings: Rec601SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bac6dc7c984a5ff7eed46cdaf50f0b32250e21bbbeab31345b4b913c3430f570")
      public fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit) {
      }

      public fun rec709Settings(rec709Settings: IResolvable) {
      }

      public fun rec709Settings(rec709Settings: Rec709SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ff2691ea97e75495de6d779843eff7f211f3ede6c93bb8eb80d70a37ade8c2e")
      public fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty.builder()

      public override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(IResolvable::unwrap))
      }

      public override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(ColorSpacePassthroughSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9965f647b90eae7f2b3f71ef17f3e94d9db2335ec498e10c00f38e70f26ac1b")
      public override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit):
          Unit =
          colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty(colorSpacePassthroughSettings))

      public override fun dolbyVision81Settings(dolbyVision81Settings: IResolvable) {
        cdkBuilder.dolbyVision81Settings(dolbyVision81Settings.let(IResolvable::unwrap))
      }

      public override
          fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty) {
        cdkBuilder.dolbyVision81Settings(dolbyVision81Settings.let(DolbyVision81SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb0360cbca25a72c00fddb075e3eacd4e05003fd645739c7bd7dd474939eca5c")
      public override
          fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty.Builder.() -> Unit):
          Unit = dolbyVision81Settings(DolbyVision81SettingsProperty(dolbyVision81Settings))

      public override fun hdr10Settings(hdr10Settings: IResolvable) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(IResolvable::unwrap))
      }

      public override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(Hdr10SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d08816bd3a3b8e97c2a6a0b50d770f7438e8fa5fc8a54dbc7d0bc5eee0faacb9")
      public override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit):
          Unit = hdr10Settings(Hdr10SettingsProperty(hdr10Settings))

      public override fun rec601Settings(rec601Settings: IResolvable) {
        cdkBuilder.rec601Settings(rec601Settings.let(IResolvable::unwrap))
      }

      public override fun rec601Settings(rec601Settings: Rec601SettingsProperty) {
        cdkBuilder.rec601Settings(rec601Settings.let(Rec601SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bac6dc7c984a5ff7eed46cdaf50f0b32250e21bbbeab31345b4b913c3430f570")
      public override fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit):
          Unit = rec601Settings(Rec601SettingsProperty(rec601Settings))

      public override fun rec709Settings(rec709Settings: IResolvable) {
        cdkBuilder.rec709Settings(rec709Settings.let(IResolvable::unwrap))
      }

      public override fun rec709Settings(rec709Settings: Rec709SettingsProperty) {
        cdkBuilder.rec709Settings(rec709Settings.let(Rec709SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ff2691ea97e75495de6d779843eff7f211f3ede6c93bb8eb80d70a37ade8c2e")
      public override fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit):
          Unit = rec709Settings(Rec709SettingsProperty(rec709Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty,
    ) : H265ColorSpaceSettingsProperty {
      public override fun colorSpacePassthroughSettings(): Any? =
          unwrap(this).getColorSpacePassthroughSettings()

      public override fun dolbyVision81Settings(): Any? = unwrap(this).getDolbyVision81Settings()

      public override fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()

      public override fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

      public override fun rec709Settings(): Any? = unwrap(this).getRec709Settings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): H265ColorSpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty):
          H265ColorSpaceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H265ColorSpaceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Scte35TimeSignalAposProperty {
    public fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

    public fun noRegionalBlackoutFlag(): String? = unwrap(this).getNoRegionalBlackoutFlag()

    public fun webDeliveryAllowedFlag(): String? = unwrap(this).getWebDeliveryAllowedFlag()

    public interface Builder {
      public fun adAvailOffset(adAvailOffset: Number) {
      }

      public fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
      }

      public fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty.builder()

      public override fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
      }

      public override fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
        cdkBuilder.noRegionalBlackoutFlag(noRegionalBlackoutFlag)
      }

      public override fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
        cdkBuilder.webDeliveryAllowedFlag(webDeliveryAllowedFlag)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty,
    ) : Scte35TimeSignalAposProperty {
      public override fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

      public override fun noRegionalBlackoutFlag(): String? =
          unwrap(this).getNoRegionalBlackoutFlag()

      public override fun webDeliveryAllowedFlag(): String? =
          unwrap(this).getWebDeliveryAllowedFlag()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Scte35TimeSignalAposProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty):
          Scte35TimeSignalAposProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte35TimeSignalAposProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BlackoutSlateProperty {
    public fun blackoutSlateImage(): Any? = unwrap(this).getBlackoutSlateImage()

    public fun networkEndBlackout(): String? = unwrap(this).getNetworkEndBlackout()

    public fun networkEndBlackoutImage(): Any? = unwrap(this).getNetworkEndBlackoutImage()

    public fun networkId(): String? = unwrap(this).getNetworkId()

    public fun state(): String? = unwrap(this).getState()

    public interface Builder {
      public fun blackoutSlateImage(blackoutSlateImage: IResolvable) {
      }

      public fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a4bfe7ddb7de6188dce591adb16cc21b40f1effc794e606f15c56b4592f423")
      public fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun networkEndBlackout(networkEndBlackout: String) {
      }

      public fun networkEndBlackoutImage(networkEndBlackoutImage: IResolvable) {
      }

      public fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("662fe3b56989a7090783508b63dce0c8b01436811c3f3d41512dc62da17b7901")
      public
          fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun networkId(networkId: String) {
      }

      public fun state(state: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty.builder()

      public override fun blackoutSlateImage(blackoutSlateImage: IResolvable) {
        cdkBuilder.blackoutSlateImage(blackoutSlateImage.let(IResolvable::unwrap))
      }

      public override fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty) {
        cdkBuilder.blackoutSlateImage(blackoutSlateImage.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a4bfe7ddb7de6188dce591adb16cc21b40f1effc794e606f15c56b4592f423")
      public override
          fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty.Builder.() -> Unit): Unit
          = blackoutSlateImage(InputLocationProperty(blackoutSlateImage))

      public override fun networkEndBlackout(networkEndBlackout: String) {
        cdkBuilder.networkEndBlackout(networkEndBlackout)
      }

      public override fun networkEndBlackoutImage(networkEndBlackoutImage: IResolvable) {
        cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage.let(IResolvable::unwrap))
      }

      public override fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty) {
        cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("662fe3b56989a7090783508b63dce0c8b01436811c3f3d41512dc62da17b7901")
      public override
          fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty.Builder.() -> Unit):
          Unit = networkEndBlackoutImage(InputLocationProperty(networkEndBlackoutImage))

      public override fun networkId(networkId: String) {
        cdkBuilder.networkId(networkId)
      }

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty,
    ) : BlackoutSlateProperty {
      public override fun blackoutSlateImage(): Any? = unwrap(this).getBlackoutSlateImage()

      public override fun networkEndBlackout(): String? = unwrap(this).getNetworkEndBlackout()

      public override fun networkEndBlackoutImage(): Any? =
          unwrap(this).getNetworkEndBlackoutImage()

      public override fun networkId(): String? = unwrap(this).getNetworkId()

      public override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BlackoutSlateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty):
          BlackoutSlateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlackoutSlateProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface Scte27SourceSettingsProperty {
    public fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

    public fun pid(): Number? = unwrap(this).getPid()

    public interface Builder {
      public fun ocrLanguage(ocrLanguage: String) {
      }

      public fun pid(pid: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty.builder()

      public override fun ocrLanguage(ocrLanguage: String) {
        cdkBuilder.ocrLanguage(ocrLanguage)
      }

      public override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty,
    ) : Scte27SourceSettingsProperty {
      public override fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

      public override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Scte27SourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty):
          Scte27SourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte27SourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsAkamaiSettingsProperty {
    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun httpTransferMode(): String? = unwrap(this).getHttpTransferMode()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    public fun salt(): String? = unwrap(this).getSalt()

    public fun token(): String? = unwrap(this).getToken()

    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number) {
      }

      public fun filecacheDuration(filecacheDuration: Number) {
      }

      public fun httpTransferMode(httpTransferMode: String) {
      }

      public fun numRetries(numRetries: Number) {
      }

      public fun restartDelay(restartDelay: Number) {
      }

      public fun salt(salt: String) {
      }

      public fun token(token: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty.builder()

      public override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      public override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      public override fun httpTransferMode(httpTransferMode: String) {
        cdkBuilder.httpTransferMode(httpTransferMode)
      }

      public override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      public override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public override fun salt(salt: String) {
        cdkBuilder.salt(salt)
      }

      public override fun token(token: String) {
        cdkBuilder.token(token)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty,
    ) : HlsAkamaiSettingsProperty {
      public override fun connectionRetryInterval(): Number? =
          unwrap(this).getConnectionRetryInterval()

      public override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      public override fun httpTransferMode(): String? = unwrap(this).getHttpTransferMode()

      public override fun numRetries(): Number? = unwrap(this).getNumRetries()

      public override fun restartDelay(): Number? = unwrap(this).getRestartDelay()

      public override fun salt(): String? = unwrap(this).getSalt()

      public override fun token(): String? = unwrap(this).getToken()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsAkamaiSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty):
          HlsAkamaiSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsAkamaiSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RawSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty.builder()

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty,
    ) : RawSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RawSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty):
          RawSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RawSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TeletextSourceSettingsProperty {
    public fun outputRectangle(): Any? = unwrap(this).getOutputRectangle()

    public fun pageNumber(): String? = unwrap(this).getPageNumber()

    public interface Builder {
      public fun outputRectangle(outputRectangle: IResolvable) {
      }

      public fun outputRectangle(outputRectangle: CaptionRectangleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89662f7eb20ebf7d562a28fb0e19873d7aa3d5d8c41196753fd2479948bcaa31")
      public fun outputRectangle(outputRectangle: CaptionRectangleProperty.Builder.() -> Unit) {
      }

      public fun pageNumber(pageNumber: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty.builder()

      public override fun outputRectangle(outputRectangle: IResolvable) {
        cdkBuilder.outputRectangle(outputRectangle.let(IResolvable::unwrap))
      }

      public override fun outputRectangle(outputRectangle: CaptionRectangleProperty) {
        cdkBuilder.outputRectangle(outputRectangle.let(CaptionRectangleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89662f7eb20ebf7d562a28fb0e19873d7aa3d5d8c41196753fd2479948bcaa31")
      public override
          fun outputRectangle(outputRectangle: CaptionRectangleProperty.Builder.() -> Unit): Unit =
          outputRectangle(CaptionRectangleProperty(outputRectangle))

      public override fun pageNumber(pageNumber: String) {
        cdkBuilder.pageNumber(pageNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty,
    ) : TeletextSourceSettingsProperty {
      public override fun outputRectangle(): Any? = unwrap(this).getOutputRectangle()

      public override fun pageNumber(): String? = unwrap(this).getPageNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TeletextSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty):
          TeletextSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TeletextSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GlobalConfigurationProperty {
    public fun initialAudioGain(): Number? = unwrap(this).getInitialAudioGain()

    public fun inputEndAction(): String? = unwrap(this).getInputEndAction()

    public fun inputLossBehavior(): Any? = unwrap(this).getInputLossBehavior()

    public fun outputLockingMode(): String? = unwrap(this).getOutputLockingMode()

    public fun outputLockingSettings(): Any? = unwrap(this).getOutputLockingSettings()

    public fun outputTimingSource(): String? = unwrap(this).getOutputTimingSource()

    public fun supportLowFramerateInputs(): String? = unwrap(this).getSupportLowFramerateInputs()

    public interface Builder {
      public fun initialAudioGain(initialAudioGain: Number) {
      }

      public fun inputEndAction(inputEndAction: String) {
      }

      public fun inputLossBehavior(inputLossBehavior: IResolvable) {
      }

      public fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("452e65136d8633130eff6a66c90b63116ca9f72781ec31729ed8e7ceeeb4b57e")
      public
          fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty.Builder.() -> Unit) {
      }

      public fun outputLockingMode(outputLockingMode: String) {
      }

      public fun outputLockingSettings(outputLockingSettings: IResolvable) {
      }

      public fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33e1a462c9b03633886fec8f9d3433c0a8c03a70255070d198064ff4392b7f22")
      public
          fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty.Builder.() -> Unit) {
      }

      public fun outputTimingSource(outputTimingSource: String) {
      }

      public fun supportLowFramerateInputs(supportLowFramerateInputs: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty.builder()

      public override fun initialAudioGain(initialAudioGain: Number) {
        cdkBuilder.initialAudioGain(initialAudioGain)
      }

      public override fun inputEndAction(inputEndAction: String) {
        cdkBuilder.inputEndAction(inputEndAction)
      }

      public override fun inputLossBehavior(inputLossBehavior: IResolvable) {
        cdkBuilder.inputLossBehavior(inputLossBehavior.let(IResolvable::unwrap))
      }

      public override fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty) {
        cdkBuilder.inputLossBehavior(inputLossBehavior.let(InputLossBehaviorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("452e65136d8633130eff6a66c90b63116ca9f72781ec31729ed8e7ceeeb4b57e")
      public override
          fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty.Builder.() -> Unit):
          Unit = inputLossBehavior(InputLossBehaviorProperty(inputLossBehavior))

      public override fun outputLockingMode(outputLockingMode: String) {
        cdkBuilder.outputLockingMode(outputLockingMode)
      }

      public override fun outputLockingSettings(outputLockingSettings: IResolvable) {
        cdkBuilder.outputLockingSettings(outputLockingSettings.let(IResolvable::unwrap))
      }

      public override
          fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty) {
        cdkBuilder.outputLockingSettings(outputLockingSettings.let(OutputLockingSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33e1a462c9b03633886fec8f9d3433c0a8c03a70255070d198064ff4392b7f22")
      public override
          fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty.Builder.() -> Unit):
          Unit = outputLockingSettings(OutputLockingSettingsProperty(outputLockingSettings))

      public override fun outputTimingSource(outputTimingSource: String) {
        cdkBuilder.outputTimingSource(outputTimingSource)
      }

      public override fun supportLowFramerateInputs(supportLowFramerateInputs: String) {
        cdkBuilder.supportLowFramerateInputs(supportLowFramerateInputs)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty,
    ) : GlobalConfigurationProperty {
      public override fun initialAudioGain(): Number? = unwrap(this).getInitialAudioGain()

      public override fun inputEndAction(): String? = unwrap(this).getInputEndAction()

      public override fun inputLossBehavior(): Any? = unwrap(this).getInputLossBehavior()

      public override fun outputLockingMode(): String? = unwrap(this).getOutputLockingMode()

      public override fun outputLockingSettings(): Any? = unwrap(this).getOutputLockingSettings()

      public override fun outputTimingSource(): String? = unwrap(this).getOutputTimingSource()

      public override fun supportLowFramerateInputs(): String? =
          unwrap(this).getSupportLowFramerateInputs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GlobalConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty):
          GlobalConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputLockingSettingsProperty {
    public fun epochLockingSettings(): Any? = unwrap(this).getEpochLockingSettings()

    public fun pipelineLockingSettings(): Any? = unwrap(this).getPipelineLockingSettings()

    public interface Builder {
      public fun epochLockingSettings(epochLockingSettings: IResolvable) {
      }

      public fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fbe7732f40fa05bb3647cf51400e4b1bfaa926f508e4856383c430c83b3834")
      public
          fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty.Builder.() -> Unit) {
      }

      public fun pipelineLockingSettings(pipelineLockingSettings: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty.builder()

      public override fun epochLockingSettings(epochLockingSettings: IResolvable) {
        cdkBuilder.epochLockingSettings(epochLockingSettings.let(IResolvable::unwrap))
      }

      public override fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty) {
        cdkBuilder.epochLockingSettings(epochLockingSettings.let(EpochLockingSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fbe7732f40fa05bb3647cf51400e4b1bfaa926f508e4856383c430c83b3834")
      public override
          fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty.Builder.() -> Unit):
          Unit = epochLockingSettings(EpochLockingSettingsProperty(epochLockingSettings))

      public override fun pipelineLockingSettings(pipelineLockingSettings: Any) {
        cdkBuilder.pipelineLockingSettings(pipelineLockingSettings)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty,
    ) : OutputLockingSettingsProperty {
      public override fun epochLockingSettings(): Any? = unwrap(this).getEpochLockingSettings()

      public override fun pipelineLockingSettings(): Any? =
          unwrap(this).getPipelineLockingSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputLockingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty):
          OutputLockingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputLockingSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EmbeddedSourceSettingsProperty {
    public fun convert608To708(): String? = unwrap(this).getConvert608To708()

    public fun scte20Detection(): String? = unwrap(this).getScte20Detection()

    public fun source608ChannelNumber(): Number? = unwrap(this).getSource608ChannelNumber()

    public fun source608TrackNumber(): Number? = unwrap(this).getSource608TrackNumber()

    public interface Builder {
      public fun convert608To708(convert608To708: String) {
      }

      public fun scte20Detection(scte20Detection: String) {
      }

      public fun source608ChannelNumber(source608ChannelNumber: Number) {
      }

      public fun source608TrackNumber(source608TrackNumber: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty.builder()

      public override fun convert608To708(convert608To708: String) {
        cdkBuilder.convert608To708(convert608To708)
      }

      public override fun scte20Detection(scte20Detection: String) {
        cdkBuilder.scte20Detection(scte20Detection)
      }

      public override fun source608ChannelNumber(source608ChannelNumber: Number) {
        cdkBuilder.source608ChannelNumber(source608ChannelNumber)
      }

      public override fun source608TrackNumber(source608TrackNumber: Number) {
        cdkBuilder.source608TrackNumber(source608TrackNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty,
    ) : EmbeddedSourceSettingsProperty {
      public override fun convert608To708(): String? = unwrap(this).getConvert608To708()

      public override fun scte20Detection(): String? = unwrap(this).getScte20Detection()

      public override fun source608ChannelNumber(): Number? =
          unwrap(this).getSource608ChannelNumber()

      public override fun source608TrackNumber(): Number? = unwrap(this).getSource608TrackNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EmbeddedSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty):
          EmbeddedSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmbeddedSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VideoSelectorSettingsProperty {
    public fun videoSelectorPid(): Any? = unwrap(this).getVideoSelectorPid()

    public fun videoSelectorProgramId(): Any? = unwrap(this).getVideoSelectorProgramId()

    public interface Builder {
      public fun videoSelectorPid(videoSelectorPid: IResolvable) {
      }

      public fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b493cd2d8667bed2aaa0a4a99807ca42c8cb76aa5c141820de8d595a470e0b2c")
      public fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty.Builder.() -> Unit) {
      }

      public fun videoSelectorProgramId(videoSelectorProgramId: IResolvable) {
      }

      public fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26c1c65f209f4c8d5b86051333090e136aae2c00db917fa13b828a3411767e1d")
      public
          fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty.builder()

      public override fun videoSelectorPid(videoSelectorPid: IResolvable) {
        cdkBuilder.videoSelectorPid(videoSelectorPid.let(IResolvable::unwrap))
      }

      public override fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty) {
        cdkBuilder.videoSelectorPid(videoSelectorPid.let(VideoSelectorPidProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b493cd2d8667bed2aaa0a4a99807ca42c8cb76aa5c141820de8d595a470e0b2c")
      public override
          fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty.Builder.() -> Unit): Unit
          = videoSelectorPid(VideoSelectorPidProperty(videoSelectorPid))

      public override fun videoSelectorProgramId(videoSelectorProgramId: IResolvable) {
        cdkBuilder.videoSelectorProgramId(videoSelectorProgramId.let(IResolvable::unwrap))
      }

      public override
          fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty) {
        cdkBuilder.videoSelectorProgramId(videoSelectorProgramId.let(VideoSelectorProgramIdProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26c1c65f209f4c8d5b86051333090e136aae2c00db917fa13b828a3411767e1d")
      public override
          fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty.Builder.() -> Unit):
          Unit = videoSelectorProgramId(VideoSelectorProgramIdProperty(videoSelectorProgramId))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty,
    ) : VideoSelectorSettingsProperty {
      public override fun videoSelectorPid(): Any? = unwrap(this).getVideoSelectorPid()

      public override fun videoSelectorProgramId(): Any? = unwrap(this).getVideoSelectorProgramId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty):
          VideoSelectorSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Mpeg2SettingsProperty {
    public fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

    public fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

    public fun colorMetadata(): String? = unwrap(this).getColorMetadata()

    public fun colorSpace(): String? = unwrap(this).getColorSpace()

    public fun displayAspectRatio(): String? = unwrap(this).getDisplayAspectRatio()

    public fun filterSettings(): Any? = unwrap(this).getFilterSettings()

    public fun fixedAfd(): String? = unwrap(this).getFixedAfd()

    public fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

    public fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

    public fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

    public fun gopNumBFrames(): Number? = unwrap(this).getGopNumBFrames()

    public fun gopSize(): Number? = unwrap(this).getGopSize()

    public fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

    public fun scanType(): String? = unwrap(this).getScanType()

    public fun subgopLength(): String? = unwrap(this).getSubgopLength()

    public fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

    public fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()

    public interface Builder {
      public fun adaptiveQuantization(adaptiveQuantization: String) {
      }

      public fun afdSignaling(afdSignaling: String) {
      }

      public fun colorMetadata(colorMetadata: String) {
      }

      public fun colorSpace(colorSpace: String) {
      }

      public fun displayAspectRatio(displayAspectRatio: String) {
      }

      public fun filterSettings(filterSettings: IResolvable) {
      }

      public fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be564491ba4947997cb88f1d39cec65027058d4a110a733024c5643b65190a7e")
      public fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty.Builder.() -> Unit) {
      }

      public fun fixedAfd(fixedAfd: String) {
      }

      public fun framerateDenominator(framerateDenominator: Number) {
      }

      public fun framerateNumerator(framerateNumerator: Number) {
      }

      public fun gopClosedCadence(gopClosedCadence: Number) {
      }

      public fun gopNumBFrames(gopNumBFrames: Number) {
      }

      public fun gopSize(gopSize: Number) {
      }

      public fun gopSizeUnits(gopSizeUnits: String) {
      }

      public fun scanType(scanType: String) {
      }

      public fun subgopLength(subgopLength: String) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("511ffd4fd65b23cf75c730359e970a2dc3f39b15bd3384c7f6d4964e48c1bf39")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit) {
      }

      public fun timecodeInsertion(timecodeInsertion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty.builder()

      public override fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
      }

      public override fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
      }

      public override fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
      }

      public override fun colorSpace(colorSpace: String) {
        cdkBuilder.colorSpace(colorSpace)
      }

      public override fun displayAspectRatio(displayAspectRatio: String) {
        cdkBuilder.displayAspectRatio(displayAspectRatio)
      }

      public override fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings.let(IResolvable::unwrap))
      }

      public override fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings.let(Mpeg2FilterSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be564491ba4947997cb88f1d39cec65027058d4a110a733024c5643b65190a7e")
      public override
          fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty.Builder.() -> Unit): Unit =
          filterSettings(Mpeg2FilterSettingsProperty(filterSettings))

      public override fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
      }

      public override fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
      }

      public override fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
      }

      public override fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
      }

      public override fun gopNumBFrames(gopNumBFrames: Number) {
        cdkBuilder.gopNumBFrames(gopNumBFrames)
      }

      public override fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
      }

      public override fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
      }

      public override fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
      }

      public override fun subgopLength(subgopLength: String) {
        cdkBuilder.subgopLength(subgopLength)
      }

      public override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("511ffd4fd65b23cf75c730359e970a2dc3f39b15bd3384c7f6d4964e48c1bf39")
      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      public override fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty,
    ) : Mpeg2SettingsProperty {
      public override fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

      public override fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

      public override fun colorMetadata(): String? = unwrap(this).getColorMetadata()

      public override fun colorSpace(): String? = unwrap(this).getColorSpace()

      public override fun displayAspectRatio(): String? = unwrap(this).getDisplayAspectRatio()

      public override fun filterSettings(): Any? = unwrap(this).getFilterSettings()

      public override fun fixedAfd(): String? = unwrap(this).getFixedAfd()

      public override fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

      public override fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

      public override fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

      public override fun gopNumBFrames(): Number? = unwrap(this).getGopNumBFrames()

      public override fun gopSize(): Number? = unwrap(this).getGopSize()

      public override fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

      public override fun scanType(): String? = unwrap(this).getScanType()

      public override fun subgopLength(): String? = unwrap(this).getSubgopLength()

      public override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

      public override fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Mpeg2SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty):
          Mpeg2SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Mpeg2SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioHlsRenditionSelectionProperty {
    public fun groupId(): String? = unwrap(this).getGroupId()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun groupId(groupId: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty.builder()

      public override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty,
    ) : AudioHlsRenditionSelectionProperty {
      public override fun groupId(): String? = unwrap(this).getGroupId()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioHlsRenditionSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty):
          AudioHlsRenditionSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioHlsRenditionSelectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Mp2SettingsProperty {
    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun sampleRate(): Number? = unwrap(this).getSampleRate()

    public interface Builder {
      public fun bitrate(bitrate: Number) {
      }

      public fun codingMode(codingMode: String) {
      }

      public fun sampleRate(sampleRate: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty.builder()

      public override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      public override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      public override fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty,
    ) : Mp2SettingsProperty {
      public override fun bitrate(): Number? = unwrap(this).getBitrate()

      public override fun codingMode(): String? = unwrap(this).getCodingMode()

      public override fun sampleRate(): Number? = unwrap(this).getSampleRate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Mp2SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty):
          Mp2SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Mp2SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VideoSelectorColorSpaceSettingsProperty {
    public fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()

    public interface Builder {
      public fun hdr10Settings(hdr10Settings: IResolvable) {
      }

      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f20bb5313106114bba895cd120c35561f191f4b705f44a9ada20b65b8c81b4")
      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty.builder()

      public override fun hdr10Settings(hdr10Settings: IResolvable) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(IResolvable::unwrap))
      }

      public override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(Hdr10SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f20bb5313106114bba895cd120c35561f191f4b705f44a9ada20b65b8c81b4")
      public override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit):
          Unit = hdr10Settings(Hdr10SettingsProperty(hdr10Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty,
    ) : VideoSelectorColorSpaceSettingsProperty {
      public override fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VideoSelectorColorSpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty):
          VideoSelectorColorSpaceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorColorSpaceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface Scte20PlusEmbeddedDestinationSettingsProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty,
    ) : Scte20PlusEmbeddedDestinationSettingsProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          Scte20PlusEmbeddedDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty):
          Scte20PlusEmbeddedDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte20PlusEmbeddedDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputSpecificationProperty {
    public fun codec(): String? = unwrap(this).getCodec()

    public fun maximumBitrate(): String? = unwrap(this).getMaximumBitrate()

    public fun resolution(): String? = unwrap(this).getResolution()

    public interface Builder {
      public fun codec(codec: String) {
      }

      public fun maximumBitrate(maximumBitrate: String) {
      }

      public fun resolution(resolution: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty.builder()

      public override fun codec(codec: String) {
        cdkBuilder.codec(codec)
      }

      public override fun maximumBitrate(maximumBitrate: String) {
        cdkBuilder.maximumBitrate(maximumBitrate)
      }

      public override fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty,
    ) : InputSpecificationProperty {
      public override fun codec(): String? = unwrap(this).getCodec()

      public override fun maximumBitrate(): String? = unwrap(this).getMaximumBitrate()

      public override fun resolution(): String? = unwrap(this).getResolution()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty):
          InputSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSpecificationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AudioOnlyHlsSettingsProperty {
    public fun audioGroupId(): String? = unwrap(this).getAudioGroupId()

    public fun audioOnlyImage(): Any? = unwrap(this).getAudioOnlyImage()

    public fun audioTrackType(): String? = unwrap(this).getAudioTrackType()

    public fun segmentType(): String? = unwrap(this).getSegmentType()

    public interface Builder {
      public fun audioGroupId(audioGroupId: String) {
      }

      public fun audioOnlyImage(audioOnlyImage: IResolvable) {
      }

      public fun audioOnlyImage(audioOnlyImage: InputLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0b904ecc0cd02d179624f5b7eda3212371cd969fd95cde2563b4f1e64da7ff8")
      public fun audioOnlyImage(audioOnlyImage: InputLocationProperty.Builder.() -> Unit) {
      }

      public fun audioTrackType(audioTrackType: String) {
      }

      public fun segmentType(segmentType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty.builder()

      public override fun audioGroupId(audioGroupId: String) {
        cdkBuilder.audioGroupId(audioGroupId)
      }

      public override fun audioOnlyImage(audioOnlyImage: IResolvable) {
        cdkBuilder.audioOnlyImage(audioOnlyImage.let(IResolvable::unwrap))
      }

      public override fun audioOnlyImage(audioOnlyImage: InputLocationProperty) {
        cdkBuilder.audioOnlyImage(audioOnlyImage.let(InputLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0b904ecc0cd02d179624f5b7eda3212371cd969fd95cde2563b4f1e64da7ff8")
      public override fun audioOnlyImage(audioOnlyImage: InputLocationProperty.Builder.() -> Unit):
          Unit = audioOnlyImage(InputLocationProperty(audioOnlyImage))

      public override fun audioTrackType(audioTrackType: String) {
        cdkBuilder.audioTrackType(audioTrackType)
      }

      public override fun segmentType(segmentType: String) {
        cdkBuilder.segmentType(segmentType)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty,
    ) : AudioOnlyHlsSettingsProperty {
      public override fun audioGroupId(): String? = unwrap(this).getAudioGroupId()

      public override fun audioOnlyImage(): Any? = unwrap(this).getAudioOnlyImage()

      public override fun audioTrackType(): String? = unwrap(this).getAudioTrackType()

      public override fun segmentType(): String? = unwrap(this).getSegmentType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioOnlyHlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty):
          AudioOnlyHlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioOnlyHlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FrameCaptureSettingsProperty {
    public fun captureInterval(): Number? = unwrap(this).getCaptureInterval()

    public fun captureIntervalUnits(): String? = unwrap(this).getCaptureIntervalUnits()

    public fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

    public interface Builder {
      public fun captureInterval(captureInterval: Number) {
      }

      public fun captureIntervalUnits(captureIntervalUnits: String) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
      }

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5b4690554ee1d0077f692580204cc0135e0104f7a57fa124127fafa7e75dc43")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty.builder()

      public override fun captureInterval(captureInterval: Number) {
        cdkBuilder.captureInterval(captureInterval)
      }

      public override fun captureIntervalUnits(captureIntervalUnits: String) {
        cdkBuilder.captureIntervalUnits(captureIntervalUnits)
      }

      public override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5b4690554ee1d0077f692580204cc0135e0104f7a57fa124127fafa7e75dc43")
      public override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty,
    ) : FrameCaptureSettingsProperty {
      public override fun captureInterval(): Number? = unwrap(this).getCaptureInterval()

      public override fun captureIntervalUnits(): String? = unwrap(this).getCaptureIntervalUnits()

      public override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty):
          FrameCaptureSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputAttachmentProperty {
    public fun automaticInputFailoverSettings(): Any? =
        unwrap(this).getAutomaticInputFailoverSettings()

    public fun inputAttachmentName(): String? = unwrap(this).getInputAttachmentName()

    public fun inputId(): String? = unwrap(this).getInputId()

    public fun inputSettings(): Any? = unwrap(this).getInputSettings()

    public interface Builder {
      public fun automaticInputFailoverSettings(automaticInputFailoverSettings: IResolvable) {
      }

      public
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954fc978f58ba5eaf0d23afb3834f555b4f16005f79105ca819f13e721439d3f")
      public
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty.Builder.() -> Unit) {
      }

      public fun inputAttachmentName(inputAttachmentName: String) {
      }

      public fun inputId(inputId: String) {
      }

      public fun inputSettings(inputSettings: IResolvable) {
      }

      public fun inputSettings(inputSettings: InputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40fd982f031418e7a89f9e8318bb9b2455be74009e2c8102957b842f53500f5a")
      public fun inputSettings(inputSettings: InputSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty.builder()

      public override
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: IResolvable) {
        cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings.let(IResolvable::unwrap))
      }

      public override
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty) {
        cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings.let(AutomaticInputFailoverSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954fc978f58ba5eaf0d23afb3834f555b4f16005f79105ca819f13e721439d3f")
      public override
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty.Builder.() -> Unit):
          Unit =
          automaticInputFailoverSettings(AutomaticInputFailoverSettingsProperty(automaticInputFailoverSettings))

      public override fun inputAttachmentName(inputAttachmentName: String) {
        cdkBuilder.inputAttachmentName(inputAttachmentName)
      }

      public override fun inputId(inputId: String) {
        cdkBuilder.inputId(inputId)
      }

      public override fun inputSettings(inputSettings: IResolvable) {
        cdkBuilder.inputSettings(inputSettings.let(IResolvable::unwrap))
      }

      public override fun inputSettings(inputSettings: InputSettingsProperty) {
        cdkBuilder.inputSettings(inputSettings.let(InputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40fd982f031418e7a89f9e8318bb9b2455be74009e2c8102957b842f53500f5a")
      public override fun inputSettings(inputSettings: InputSettingsProperty.Builder.() -> Unit):
          Unit = inputSettings(InputSettingsProperty(inputSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty,
    ) : InputAttachmentProperty {
      public override fun automaticInputFailoverSettings(): Any? =
          unwrap(this).getAutomaticInputFailoverSettings()

      public override fun inputAttachmentName(): String? = unwrap(this).getInputAttachmentName()

      public override fun inputId(): String? = unwrap(this).getInputId()

      public override fun inputSettings(): Any? = unwrap(this).getInputSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty):
          InputAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputAttachmentProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WebvttDestinationSettingsProperty {
    public fun styleControl(): String? = unwrap(this).getStyleControl()

    public interface Builder {
      public fun styleControl(styleControl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty.builder()

      public override fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty,
    ) : WebvttDestinationSettingsProperty {
      public override fun styleControl(): String? = unwrap(this).getStyleControl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebvttDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty):
          WebvttDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebvttDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VideoDescriptionProperty {
    public fun codecSettings(): Any? = unwrap(this).getCodecSettings()

    public fun height(): Number? = unwrap(this).getHeight()

    public fun name(): String? = unwrap(this).getName()

    public fun respondToAfd(): String? = unwrap(this).getRespondToAfd()

    public fun scalingBehavior(): String? = unwrap(this).getScalingBehavior()

    public fun sharpness(): Number? = unwrap(this).getSharpness()

    public fun width(): Number? = unwrap(this).getWidth()

    public interface Builder {
      public fun codecSettings(codecSettings: IResolvable) {
      }

      public fun codecSettings(codecSettings: VideoCodecSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69dab3e5c50533464654d9f350f7b87163f440f123de1e172b43e62bbf084294")
      public fun codecSettings(codecSettings: VideoCodecSettingsProperty.Builder.() -> Unit) {
      }

      public fun height(height: Number) {
      }

      public fun name(name: String) {
      }

      public fun respondToAfd(respondToAfd: String) {
      }

      public fun scalingBehavior(scalingBehavior: String) {
      }

      public fun sharpness(sharpness: Number) {
      }

      public fun width(width: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty.builder()

      public override fun codecSettings(codecSettings: IResolvable) {
        cdkBuilder.codecSettings(codecSettings.let(IResolvable::unwrap))
      }

      public override fun codecSettings(codecSettings: VideoCodecSettingsProperty) {
        cdkBuilder.codecSettings(codecSettings.let(VideoCodecSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69dab3e5c50533464654d9f350f7b87163f440f123de1e172b43e62bbf084294")
      public override
          fun codecSettings(codecSettings: VideoCodecSettingsProperty.Builder.() -> Unit): Unit =
          codecSettings(VideoCodecSettingsProperty(codecSettings))

      public override fun height(height: Number) {
        cdkBuilder.height(height)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun respondToAfd(respondToAfd: String) {
        cdkBuilder.respondToAfd(respondToAfd)
      }

      public override fun scalingBehavior(scalingBehavior: String) {
        cdkBuilder.scalingBehavior(scalingBehavior)
      }

      public override fun sharpness(sharpness: Number) {
        cdkBuilder.sharpness(sharpness)
      }

      public override fun width(width: Number) {
        cdkBuilder.width(width)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty,
    ) : VideoDescriptionProperty {
      public override fun codecSettings(): Any? = unwrap(this).getCodecSettings()

      public override fun height(): Number? = unwrap(this).getHeight()

      public override fun name(): String? = unwrap(this).getName()

      public override fun respondToAfd(): String? = unwrap(this).getRespondToAfd()

      public override fun scalingBehavior(): String? = unwrap(this).getScalingBehavior()

      public override fun sharpness(): Number? = unwrap(this).getSharpness()

      public override fun width(): Number? = unwrap(this).getWidth()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VideoDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty):
          VideoDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoDescriptionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FrameCaptureCdnSettingsProperty {
    public fun frameCaptureS3Settings(): Any? = unwrap(this).getFrameCaptureS3Settings()

    public interface Builder {
      public fun frameCaptureS3Settings(frameCaptureS3Settings: IResolvable) {
      }

      public fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d13d87e77b9a162260c01338cc60dc3b2d0d02413fd8bc9f1ce8a0eedab5b072")
      public
          fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty.builder()

      public override fun frameCaptureS3Settings(frameCaptureS3Settings: IResolvable) {
        cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings.let(IResolvable::unwrap))
      }

      public override
          fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty) {
        cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings.let(FrameCaptureS3SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d13d87e77b9a162260c01338cc60dc3b2d0d02413fd8bc9f1ce8a0eedab5b072")
      public override
          fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureS3Settings(FrameCaptureS3SettingsProperty(frameCaptureS3Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty,
    ) : FrameCaptureCdnSettingsProperty {
      public override fun frameCaptureS3Settings(): Any? = unwrap(this).getFrameCaptureS3Settings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureCdnSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty):
          FrameCaptureCdnSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureCdnSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputProperty {
    public fun audioDescriptionNames(): List<String> = unwrap(this).getAudioDescriptionNames() ?:
        emptyList()

    public fun captionDescriptionNames(): List<String> = unwrap(this).getCaptionDescriptionNames()
        ?: emptyList()

    public fun outputName(): String? = unwrap(this).getOutputName()

    public fun outputSettings(): Any? = unwrap(this).getOutputSettings()

    public fun videoDescriptionName(): String? = unwrap(this).getVideoDescriptionName()

    public interface Builder {
      public fun audioDescriptionNames(audioDescriptionNames: List<String>) {
      }

      public fun captionDescriptionNames(captionDescriptionNames: List<String>) {
      }

      public fun outputName(outputName: String) {
      }

      public fun outputSettings(outputSettings: IResolvable) {
      }

      public fun outputSettings(outputSettings: OutputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a98bc1584f04fa8a024b754a607451ea1405c99186a5e81bf2f0d23caee1c98")
      public fun outputSettings(outputSettings: OutputSettingsProperty.Builder.() -> Unit) {
      }

      public fun videoDescriptionName(videoDescriptionName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty.builder()

      public override fun audioDescriptionNames(audioDescriptionNames: List<String>) {
        cdkBuilder.audioDescriptionNames(audioDescriptionNames)
      }

      public override fun captionDescriptionNames(captionDescriptionNames: List<String>) {
        cdkBuilder.captionDescriptionNames(captionDescriptionNames)
      }

      public override fun outputName(outputName: String) {
        cdkBuilder.outputName(outputName)
      }

      public override fun outputSettings(outputSettings: IResolvable) {
        cdkBuilder.outputSettings(outputSettings.let(IResolvable::unwrap))
      }

      public override fun outputSettings(outputSettings: OutputSettingsProperty) {
        cdkBuilder.outputSettings(outputSettings.let(OutputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a98bc1584f04fa8a024b754a607451ea1405c99186a5e81bf2f0d23caee1c98")
      public override fun outputSettings(outputSettings: OutputSettingsProperty.Builder.() -> Unit):
          Unit = outputSettings(OutputSettingsProperty(outputSettings))

      public override fun videoDescriptionName(videoDescriptionName: String) {
        cdkBuilder.videoDescriptionName(videoDescriptionName)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty,
    ) : OutputProperty {
      public override fun audioDescriptionNames(): List<String> =
          unwrap(this).getAudioDescriptionNames() ?: emptyList()

      public override fun captionDescriptionNames(): List<String> =
          unwrap(this).getCaptionDescriptionNames() ?: emptyList()

      public override fun outputName(): String? = unwrap(this).getOutputName()

      public override fun outputSettings(): Any? = unwrap(this).getOutputSettings()

      public override fun videoDescriptionName(): String? = unwrap(this).getVideoDescriptionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty):
          OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AudioDescriptionProperty {
    public fun audioNormalizationSettings(): Any? = unwrap(this).getAudioNormalizationSettings()

    public fun audioSelectorName(): String? = unwrap(this).getAudioSelectorName()

    public fun audioType(): String? = unwrap(this).getAudioType()

    public fun audioTypeControl(): String? = unwrap(this).getAudioTypeControl()

    public fun audioWatermarkingSettings(): Any? = unwrap(this).getAudioWatermarkingSettings()

    public fun codecSettings(): Any? = unwrap(this).getCodecSettings()

    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun languageCodeControl(): String? = unwrap(this).getLanguageCodeControl()

    public fun name(): String? = unwrap(this).getName()

    public fun remixSettings(): Any? = unwrap(this).getRemixSettings()

    public fun streamName(): String? = unwrap(this).getStreamName()

    public interface Builder {
      public fun audioNormalizationSettings(audioNormalizationSettings: IResolvable) {
      }

      public
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("216768d41e6e6d1f80bcb8f843aceb98dbc5aed86cc5134a7fc84ee122c996e6")
      public
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty.Builder.() -> Unit) {
      }

      public fun audioSelectorName(audioSelectorName: String) {
      }

      public fun audioType(audioType: String) {
      }

      public fun audioTypeControl(audioTypeControl: String) {
      }

      public fun audioWatermarkingSettings(audioWatermarkingSettings: IResolvable) {
      }

      public
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e08144084fc63acb6cff58ce1f9ef24cc9a57617e9be88455e6ec17729e6af3")
      public
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty.Builder.() -> Unit) {
      }

      public fun codecSettings(codecSettings: IResolvable) {
      }

      public fun codecSettings(codecSettings: AudioCodecSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c42506e665d5fcf25b8618524c3292f798a8472eb4f40265596a7a76145f57")
      public fun codecSettings(codecSettings: AudioCodecSettingsProperty.Builder.() -> Unit) {
      }

      public fun languageCode(languageCode: String) {
      }

      public fun languageCodeControl(languageCodeControl: String) {
      }

      public fun name(name: String) {
      }

      public fun remixSettings(remixSettings: IResolvable) {
      }

      public fun remixSettings(remixSettings: RemixSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297466270cb6d7f67c19dda437ee28668d92ca5958cbc52ba9ba212200abd6e3")
      public fun remixSettings(remixSettings: RemixSettingsProperty.Builder.() -> Unit) {
      }

      public fun streamName(streamName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty.builder()

      public override fun audioNormalizationSettings(audioNormalizationSettings: IResolvable) {
        cdkBuilder.audioNormalizationSettings(audioNormalizationSettings.let(IResolvable::unwrap))
      }

      public override
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty) {
        cdkBuilder.audioNormalizationSettings(audioNormalizationSettings.let(AudioNormalizationSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("216768d41e6e6d1f80bcb8f843aceb98dbc5aed86cc5134a7fc84ee122c996e6")
      public override
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty.Builder.() -> Unit):
          Unit =
          audioNormalizationSettings(AudioNormalizationSettingsProperty(audioNormalizationSettings))

      public override fun audioSelectorName(audioSelectorName: String) {
        cdkBuilder.audioSelectorName(audioSelectorName)
      }

      public override fun audioType(audioType: String) {
        cdkBuilder.audioType(audioType)
      }

      public override fun audioTypeControl(audioTypeControl: String) {
        cdkBuilder.audioTypeControl(audioTypeControl)
      }

      public override fun audioWatermarkingSettings(audioWatermarkingSettings: IResolvable) {
        cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings.let(IResolvable::unwrap))
      }

      public override
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty) {
        cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings.let(AudioWatermarkSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e08144084fc63acb6cff58ce1f9ef24cc9a57617e9be88455e6ec17729e6af3")
      public override
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty.Builder.() -> Unit):
          Unit =
          audioWatermarkingSettings(AudioWatermarkSettingsProperty(audioWatermarkingSettings))

      public override fun codecSettings(codecSettings: IResolvable) {
        cdkBuilder.codecSettings(codecSettings.let(IResolvable::unwrap))
      }

      public override fun codecSettings(codecSettings: AudioCodecSettingsProperty) {
        cdkBuilder.codecSettings(codecSettings.let(AudioCodecSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c42506e665d5fcf25b8618524c3292f798a8472eb4f40265596a7a76145f57")
      public override
          fun codecSettings(codecSettings: AudioCodecSettingsProperty.Builder.() -> Unit): Unit =
          codecSettings(AudioCodecSettingsProperty(codecSettings))

      public override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      public override fun languageCodeControl(languageCodeControl: String) {
        cdkBuilder.languageCodeControl(languageCodeControl)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun remixSettings(remixSettings: IResolvable) {
        cdkBuilder.remixSettings(remixSettings.let(IResolvable::unwrap))
      }

      public override fun remixSettings(remixSettings: RemixSettingsProperty) {
        cdkBuilder.remixSettings(remixSettings.let(RemixSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297466270cb6d7f67c19dda437ee28668d92ca5958cbc52ba9ba212200abd6e3")
      public override fun remixSettings(remixSettings: RemixSettingsProperty.Builder.() -> Unit):
          Unit = remixSettings(RemixSettingsProperty(remixSettings))

      public override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty,
    ) : AudioDescriptionProperty {
      public override fun audioNormalizationSettings(): Any? =
          unwrap(this).getAudioNormalizationSettings()

      public override fun audioSelectorName(): String? = unwrap(this).getAudioSelectorName()

      public override fun audioType(): String? = unwrap(this).getAudioType()

      public override fun audioTypeControl(): String? = unwrap(this).getAudioTypeControl()

      public override fun audioWatermarkingSettings(): Any? =
          unwrap(this).getAudioWatermarkingSettings()

      public override fun codecSettings(): Any? = unwrap(this).getCodecSettings()

      public override fun languageCode(): String? = unwrap(this).getLanguageCode()

      public override fun languageCodeControl(): String? = unwrap(this).getLanguageCodeControl()

      public override fun name(): String? = unwrap(this).getName()

      public override fun remixSettings(): Any? = unwrap(this).getRemixSettings()

      public override fun streamName(): String? = unwrap(this).getStreamName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AudioDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty):
          AudioDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioDescriptionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ArchiveCdnSettingsProperty {
    public fun archiveS3Settings(): Any? = unwrap(this).getArchiveS3Settings()

    public interface Builder {
      public fun archiveS3Settings(archiveS3Settings: IResolvable) {
      }

      public fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("250acecba5671297fd79bf23aef4d0a15a8a10ee8362caee84c0b96686eb4498")
      public
          fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty.builder()

      public override fun archiveS3Settings(archiveS3Settings: IResolvable) {
        cdkBuilder.archiveS3Settings(archiveS3Settings.let(IResolvable::unwrap))
      }

      public override fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty) {
        cdkBuilder.archiveS3Settings(archiveS3Settings.let(ArchiveS3SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("250acecba5671297fd79bf23aef4d0a15a8a10ee8362caee84c0b96686eb4498")
      public override
          fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty.Builder.() -> Unit):
          Unit = archiveS3Settings(ArchiveS3SettingsProperty(archiveS3Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty,
    ) : ArchiveCdnSettingsProperty {
      public override fun archiveS3Settings(): Any? = unwrap(this).getArchiveS3Settings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveCdnSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty):
          ArchiveCdnSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveCdnSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface M3u8SettingsProperty {
    public fun audioFramesPerPes(): Number? = unwrap(this).getAudioFramesPerPes()

    public fun audioPids(): String? = unwrap(this).getAudioPids()

    public fun ecmPid(): String? = unwrap(this).getEcmPid()

    public fun klvBehavior(): String? = unwrap(this).getKlvBehavior()

    public fun klvDataPids(): String? = unwrap(this).getKlvDataPids()

    public fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

    public fun patInterval(): Number? = unwrap(this).getPatInterval()

    public fun pcrControl(): String? = unwrap(this).getPcrControl()

    public fun pcrPeriod(): Number? = unwrap(this).getPcrPeriod()

    public fun pcrPid(): String? = unwrap(this).getPcrPid()

    public fun pmtInterval(): Number? = unwrap(this).getPmtInterval()

    public fun pmtPid(): String? = unwrap(this).getPmtPid()

    public fun programNum(): Number? = unwrap(this).getProgramNum()

    public fun scte35Behavior(): String? = unwrap(this).getScte35Behavior()

    public fun scte35Pid(): String? = unwrap(this).getScte35Pid()

    public fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

    public fun timedMetadataPid(): String? = unwrap(this).getTimedMetadataPid()

    public fun transportStreamId(): Number? = unwrap(this).getTransportStreamId()

    public fun videoPid(): String? = unwrap(this).getVideoPid()

    public interface Builder {
      public fun audioFramesPerPes(audioFramesPerPes: Number) {
      }

      public fun audioPids(audioPids: String) {
      }

      public fun ecmPid(ecmPid: String) {
      }

      public fun klvBehavior(klvBehavior: String) {
      }

      public fun klvDataPids(klvDataPids: String) {
      }

      public fun nielsenId3Behavior(nielsenId3Behavior: String) {
      }

      public fun patInterval(patInterval: Number) {
      }

      public fun pcrControl(pcrControl: String) {
      }

      public fun pcrPeriod(pcrPeriod: Number) {
      }

      public fun pcrPid(pcrPid: String) {
      }

      public fun pmtInterval(pmtInterval: Number) {
      }

      public fun pmtPid(pmtPid: String) {
      }

      public fun programNum(programNum: Number) {
      }

      public fun scte35Behavior(scte35Behavior: String) {
      }

      public fun scte35Pid(scte35Pid: String) {
      }

      public fun timedMetadataBehavior(timedMetadataBehavior: String) {
      }

      public fun timedMetadataPid(timedMetadataPid: String) {
      }

      public fun transportStreamId(transportStreamId: Number) {
      }

      public fun videoPid(videoPid: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty.builder()

      public override fun audioFramesPerPes(audioFramesPerPes: Number) {
        cdkBuilder.audioFramesPerPes(audioFramesPerPes)
      }

      public override fun audioPids(audioPids: String) {
        cdkBuilder.audioPids(audioPids)
      }

      public override fun ecmPid(ecmPid: String) {
        cdkBuilder.ecmPid(ecmPid)
      }

      public override fun klvBehavior(klvBehavior: String) {
        cdkBuilder.klvBehavior(klvBehavior)
      }

      public override fun klvDataPids(klvDataPids: String) {
        cdkBuilder.klvDataPids(klvDataPids)
      }

      public override fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
      }

      public override fun patInterval(patInterval: Number) {
        cdkBuilder.patInterval(patInterval)
      }

      public override fun pcrControl(pcrControl: String) {
        cdkBuilder.pcrControl(pcrControl)
      }

      public override fun pcrPeriod(pcrPeriod: Number) {
        cdkBuilder.pcrPeriod(pcrPeriod)
      }

      public override fun pcrPid(pcrPid: String) {
        cdkBuilder.pcrPid(pcrPid)
      }

      public override fun pmtInterval(pmtInterval: Number) {
        cdkBuilder.pmtInterval(pmtInterval)
      }

      public override fun pmtPid(pmtPid: String) {
        cdkBuilder.pmtPid(pmtPid)
      }

      public override fun programNum(programNum: Number) {
        cdkBuilder.programNum(programNum)
      }

      public override fun scte35Behavior(scte35Behavior: String) {
        cdkBuilder.scte35Behavior(scte35Behavior)
      }

      public override fun scte35Pid(scte35Pid: String) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      public override fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
      }

      public override fun timedMetadataPid(timedMetadataPid: String) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
      }

      public override fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
      }

      public override fun videoPid(videoPid: String) {
        cdkBuilder.videoPid(videoPid)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty,
    ) : M3u8SettingsProperty {
      public override fun audioFramesPerPes(): Number? = unwrap(this).getAudioFramesPerPes()

      public override fun audioPids(): String? = unwrap(this).getAudioPids()

      public override fun ecmPid(): String? = unwrap(this).getEcmPid()

      public override fun klvBehavior(): String? = unwrap(this).getKlvBehavior()

      public override fun klvDataPids(): String? = unwrap(this).getKlvDataPids()

      public override fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

      public override fun patInterval(): Number? = unwrap(this).getPatInterval()

      public override fun pcrControl(): String? = unwrap(this).getPcrControl()

      public override fun pcrPeriod(): Number? = unwrap(this).getPcrPeriod()

      public override fun pcrPid(): String? = unwrap(this).getPcrPid()

      public override fun pmtInterval(): Number? = unwrap(this).getPmtInterval()

      public override fun pmtPid(): String? = unwrap(this).getPmtPid()

      public override fun programNum(): Number? = unwrap(this).getProgramNum()

      public override fun scte35Behavior(): String? = unwrap(this).getScte35Behavior()

      public override fun scte35Pid(): String? = unwrap(this).getScte35Pid()

      public override fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

      public override fun timedMetadataPid(): String? = unwrap(this).getTimedMetadataPid()

      public override fun transportStreamId(): Number? = unwrap(this).getTransportStreamId()

      public override fun videoPid(): String? = unwrap(this).getVideoPid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): M3u8SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty):
          M3u8SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: M3u8SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MultiplexOutputSettingsProperty {
    public fun destination(): Any? = unwrap(this).getDestination()

    public interface Builder {
      public fun destination(destination: IResolvable) {
      }

      public fun destination(destination: OutputLocationRefProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a769fabdcb8bbc2fbfed33b9c962ee1fe84bb6e7196dae0feee82db66870f2")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty.builder()

      public override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      public override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a769fabdcb8bbc2fbfed33b9c962ee1fe84bb6e7196dae0feee82db66870f2")
      public override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit):
          Unit = destination(OutputLocationRefProperty(destination))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty,
    ) : MultiplexOutputSettingsProperty {
      public override fun destination(): Any? = unwrap(this).getDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty):
          MultiplexOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputGroupProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun outputGroupSettings(): Any? = unwrap(this).getOutputGroupSettings()

    public fun outputs(): Any? = unwrap(this).getOutputs()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun outputGroupSettings(outputGroupSettings: IResolvable) {
      }

      public fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd44c528858248e89969298ab25840235ecefbd41ff8ea355b500fc678dadb4b")
      public
          fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty.Builder.() -> Unit) {
      }

      public fun outputs(outputs: IResolvable) {
      }

      public fun outputs(outputs: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun outputGroupSettings(outputGroupSettings: IResolvable) {
        cdkBuilder.outputGroupSettings(outputGroupSettings.let(IResolvable::unwrap))
      }

      public override fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty) {
        cdkBuilder.outputGroupSettings(outputGroupSettings.let(OutputGroupSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd44c528858248e89969298ab25840235ecefbd41ff8ea355b500fc678dadb4b")
      public override
          fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty.Builder.() -> Unit):
          Unit = outputGroupSettings(OutputGroupSettingsProperty(outputGroupSettings))

      public override fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
      }

      public override fun outputs(outputs: List<Any>) {
        cdkBuilder.outputs(outputs)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty,
    ) : OutputGroupProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun outputGroupSettings(): Any? = unwrap(this).getOutputGroupSettings()

      public override fun outputs(): Any? = unwrap(this).getOutputs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty):
          OutputGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputGroupProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface H264ColorSpaceSettingsProperty {
    public fun colorSpacePassthroughSettings(): Any? =
        unwrap(this).getColorSpacePassthroughSettings()

    public fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

    public fun rec709Settings(): Any? = unwrap(this).getRec709Settings()

    public interface Builder {
      public fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
      }

      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("453cd7e3dd70ab3d39b2d1a987818873b1720aea9573a51e253eda5a40b0a71c")
      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit) {
      }

      public fun rec601Settings(rec601Settings: IResolvable) {
      }

      public fun rec601Settings(rec601Settings: Rec601SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c3773ba753bd5a1459a519395fcda14f1a6f48030d19c071d4a7d003eba1b0c")
      public fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit) {
      }

      public fun rec709Settings(rec709Settings: IResolvable) {
      }

      public fun rec709Settings(rec709Settings: Rec709SettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08b60bc9f6c9d6702c1694a28e40a608ec2b81456631dd8b5181cde7e242f35b")
      public fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty.builder()

      public override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(IResolvable::unwrap))
      }

      public override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(ColorSpacePassthroughSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("453cd7e3dd70ab3d39b2d1a987818873b1720aea9573a51e253eda5a40b0a71c")
      public override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit):
          Unit =
          colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty(colorSpacePassthroughSettings))

      public override fun rec601Settings(rec601Settings: IResolvable) {
        cdkBuilder.rec601Settings(rec601Settings.let(IResolvable::unwrap))
      }

      public override fun rec601Settings(rec601Settings: Rec601SettingsProperty) {
        cdkBuilder.rec601Settings(rec601Settings.let(Rec601SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c3773ba753bd5a1459a519395fcda14f1a6f48030d19c071d4a7d003eba1b0c")
      public override fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit):
          Unit = rec601Settings(Rec601SettingsProperty(rec601Settings))

      public override fun rec709Settings(rec709Settings: IResolvable) {
        cdkBuilder.rec709Settings(rec709Settings.let(IResolvable::unwrap))
      }

      public override fun rec709Settings(rec709Settings: Rec709SettingsProperty) {
        cdkBuilder.rec709Settings(rec709Settings.let(Rec709SettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08b60bc9f6c9d6702c1694a28e40a608ec2b81456631dd8b5181cde7e242f35b")
      public override fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit):
          Unit = rec709Settings(Rec709SettingsProperty(rec709Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty,
    ) : H264ColorSpaceSettingsProperty {
      public override fun colorSpacePassthroughSettings(): Any? =
          unwrap(this).getColorSpacePassthroughSettings()

      public override fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

      public override fun rec709Settings(): Any? = unwrap(this).getRec709Settings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): H264ColorSpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty):
          H264ColorSpaceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H264ColorSpaceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CdiInputSpecificationProperty {
    public fun resolution(): String? = unwrap(this).getResolution()

    public interface Builder {
      public fun resolution(resolution: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty.builder()

      public override fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty,
    ) : CdiInputSpecificationProperty {
      public override fun resolution(): String? = unwrap(this).getResolution()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CdiInputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty):
          CdiInputSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CdiInputSpecificationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputSettingsProperty {
    public fun audioSelectors(): Any? = unwrap(this).getAudioSelectors()

    public fun captionSelectors(): Any? = unwrap(this).getCaptionSelectors()

    public fun deblockFilter(): String? = unwrap(this).getDeblockFilter()

    public fun denoiseFilter(): String? = unwrap(this).getDenoiseFilter()

    public fun filterStrength(): Number? = unwrap(this).getFilterStrength()

    public fun inputFilter(): String? = unwrap(this).getInputFilter()

    public fun networkInputSettings(): Any? = unwrap(this).getNetworkInputSettings()

    public fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

    public fun smpte2038DataPreference(): String? = unwrap(this).getSmpte2038DataPreference()

    public fun sourceEndBehavior(): String? = unwrap(this).getSourceEndBehavior()

    public fun videoSelector(): Any? = unwrap(this).getVideoSelector()

    public interface Builder {
      public fun audioSelectors(audioSelectors: IResolvable) {
      }

      public fun audioSelectors(audioSelectors: List<Any>) {
      }

      public fun captionSelectors(captionSelectors: IResolvable) {
      }

      public fun captionSelectors(captionSelectors: List<Any>) {
      }

      public fun deblockFilter(deblockFilter: String) {
      }

      public fun denoiseFilter(denoiseFilter: String) {
      }

      public fun filterStrength(filterStrength: Number) {
      }

      public fun inputFilter(inputFilter: String) {
      }

      public fun networkInputSettings(networkInputSettings: IResolvable) {
      }

      public fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd1926c05f2854910e295cb271ef5e0c13c3594dd7c9a0ac19b6e99cac82211")
      public
          fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty.Builder.() -> Unit) {
      }

      public fun scte35Pid(scte35Pid: Number) {
      }

      public fun smpte2038DataPreference(smpte2038DataPreference: String) {
      }

      public fun sourceEndBehavior(sourceEndBehavior: String) {
      }

      public fun videoSelector(videoSelector: IResolvable) {
      }

      public fun videoSelector(videoSelector: VideoSelectorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e82eb43173605a3c4a5e230255e7f4f2b72fe85c5f6c4f217ce63856b8f00323")
      public fun videoSelector(videoSelector: VideoSelectorProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty.builder()

      public override fun audioSelectors(audioSelectors: IResolvable) {
        cdkBuilder.audioSelectors(audioSelectors.let(IResolvable::unwrap))
      }

      public override fun audioSelectors(audioSelectors: List<Any>) {
        cdkBuilder.audioSelectors(audioSelectors)
      }

      public override fun captionSelectors(captionSelectors: IResolvable) {
        cdkBuilder.captionSelectors(captionSelectors.let(IResolvable::unwrap))
      }

      public override fun captionSelectors(captionSelectors: List<Any>) {
        cdkBuilder.captionSelectors(captionSelectors)
      }

      public override fun deblockFilter(deblockFilter: String) {
        cdkBuilder.deblockFilter(deblockFilter)
      }

      public override fun denoiseFilter(denoiseFilter: String) {
        cdkBuilder.denoiseFilter(denoiseFilter)
      }

      public override fun filterStrength(filterStrength: Number) {
        cdkBuilder.filterStrength(filterStrength)
      }

      public override fun inputFilter(inputFilter: String) {
        cdkBuilder.inputFilter(inputFilter)
      }

      public override fun networkInputSettings(networkInputSettings: IResolvable) {
        cdkBuilder.networkInputSettings(networkInputSettings.let(IResolvable::unwrap))
      }

      public override fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty) {
        cdkBuilder.networkInputSettings(networkInputSettings.let(NetworkInputSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd1926c05f2854910e295cb271ef5e0c13c3594dd7c9a0ac19b6e99cac82211")
      public override
          fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty.Builder.() -> Unit):
          Unit = networkInputSettings(NetworkInputSettingsProperty(networkInputSettings))

      public override fun scte35Pid(scte35Pid: Number) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      public override fun smpte2038DataPreference(smpte2038DataPreference: String) {
        cdkBuilder.smpte2038DataPreference(smpte2038DataPreference)
      }

      public override fun sourceEndBehavior(sourceEndBehavior: String) {
        cdkBuilder.sourceEndBehavior(sourceEndBehavior)
      }

      public override fun videoSelector(videoSelector: IResolvable) {
        cdkBuilder.videoSelector(videoSelector.let(IResolvable::unwrap))
      }

      public override fun videoSelector(videoSelector: VideoSelectorProperty) {
        cdkBuilder.videoSelector(videoSelector.let(VideoSelectorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e82eb43173605a3c4a5e230255e7f4f2b72fe85c5f6c4f217ce63856b8f00323")
      public override fun videoSelector(videoSelector: VideoSelectorProperty.Builder.() -> Unit):
          Unit = videoSelector(VideoSelectorProperty(videoSelector))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty,
    ) : InputSettingsProperty {
      public override fun audioSelectors(): Any? = unwrap(this).getAudioSelectors()

      public override fun captionSelectors(): Any? = unwrap(this).getCaptionSelectors()

      public override fun deblockFilter(): String? = unwrap(this).getDeblockFilter()

      public override fun denoiseFilter(): String? = unwrap(this).getDenoiseFilter()

      public override fun filterStrength(): Number? = unwrap(this).getFilterStrength()

      public override fun inputFilter(): String? = unwrap(this).getInputFilter()

      public override fun networkInputSettings(): Any? = unwrap(this).getNetworkInputSettings()

      public override fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

      public override fun smpte2038DataPreference(): String? =
          unwrap(this).getSmpte2038DataPreference()

      public override fun sourceEndBehavior(): String? = unwrap(this).getSourceEndBehavior()

      public override fun videoSelector(): Any? = unwrap(this).getVideoSelector()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty):
          InputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
