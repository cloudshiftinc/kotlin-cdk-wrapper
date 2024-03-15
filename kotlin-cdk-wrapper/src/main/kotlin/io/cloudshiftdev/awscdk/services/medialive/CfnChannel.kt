@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.medialive.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrInputs(): List<String> = unwrap(this).getAttrInputs()

  public open fun cdiInputSpecification(): Any? = unwrap(this).getCdiInputSpecification()

  public open fun cdiInputSpecification(`value`: IResolvable) {
    unwrap(this).setCdiInputSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun cdiInputSpecification(`value`: CdiInputSpecificationProperty) {
    unwrap(this).setCdiInputSpecification(`value`.let(CdiInputSpecificationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun destinations(vararg __idx_ac66f0: Any): Unit = destinations(__idx_ac66f0.toList())

  public open fun encoderSettings(): Any? = unwrap(this).getEncoderSettings()

  public open fun encoderSettings(`value`: IResolvable) {
    unwrap(this).setEncoderSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun encoderSettings(`value`: EncoderSettingsProperty) {
    unwrap(this).setEncoderSettings(`value`.let(EncoderSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun inputAttachments(vararg __idx_ac66f0: Any): Unit =
      inputAttachments(__idx_ac66f0.toList())

  public open fun inputSpecification(): Any? = unwrap(this).getInputSpecification()

  public open fun inputSpecification(`value`: IResolvable) {
    unwrap(this).setInputSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun inputSpecification(`value`: InputSpecificationProperty) {
    unwrap(this).setInputSpecification(`value`.let(InputSpecificationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc420a6da3f6e928883ae18d1fa17181cf61dd929ff4b01bb05a37adf7bea77d")
  public open fun vpc(`value`: VpcOutputSettingsProperty.Builder.() -> Unit): Unit =
      vpc(VpcOutputSettingsProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun cdiInputSpecification(cdiInputSpecification: IResolvable)

    public fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aacee8ea7d493868931951676e6a7998b047d4dba5db835e263f5fe2dc77d6ce")
    public
        fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty.Builder.() -> Unit)

    public fun channelClass(channelClass: String)

    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun encoderSettings(encoderSettings: IResolvable)

    public fun encoderSettings(encoderSettings: EncoderSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2314ed8c6250a2bf5498955db0ad5f303fc86059c73255fa29b50f7f96d35b9")
    public fun encoderSettings(encoderSettings: EncoderSettingsProperty.Builder.() -> Unit)

    public fun inputAttachments(inputAttachments: IResolvable)

    public fun inputAttachments(inputAttachments: List<Any>)

    public fun inputAttachments(vararg inputAttachments: Any)

    public fun inputSpecification(inputSpecification: IResolvable)

    public fun inputSpecification(inputSpecification: InputSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a09da5b93c8531e73bbabc998e2e89eced34c8bc3c128cced66fb015c0605e7")
    public fun inputSpecification(inputSpecification: InputSpecificationProperty.Builder.() -> Unit)

    public fun logLevel(logLevel: String)

    public fun maintenance(maintenance: IResolvable)

    public fun maintenance(maintenance: MaintenanceCreateSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e659608119eb682e4d6abbf1c66ff8f58f4fa7f39e5d6c1f9971d6b0504f15")
    public fun maintenance(maintenance: MaintenanceCreateSettingsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: Any)

    public fun vpc(vpc: IResolvable)

    public fun vpc(vpc: VpcOutputSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91b7209b4e48950a8454d6c55ff29b62f8b84b5629568dc42e614dcf2ced1b47")
    public fun vpc(vpc: VpcOutputSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnChannel.Builder =
        software.amazon.awscdk.services.medialive.CfnChannel.Builder.create(scope, id)

    override fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(IResolvable::unwrap))
    }

    override fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(CdiInputSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aacee8ea7d493868931951676e6a7998b047d4dba5db835e263f5fe2dc77d6ce")
    override
        fun cdiInputSpecification(cdiInputSpecification: CdiInputSpecificationProperty.Builder.() -> Unit):
        Unit = cdiInputSpecification(CdiInputSpecificationProperty(cdiInputSpecification))

    override fun channelClass(channelClass: String) {
      cdkBuilder.channelClass(channelClass)
    }

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    override fun encoderSettings(encoderSettings: IResolvable) {
      cdkBuilder.encoderSettings(encoderSettings.let(IResolvable::unwrap))
    }

    override fun encoderSettings(encoderSettings: EncoderSettingsProperty) {
      cdkBuilder.encoderSettings(encoderSettings.let(EncoderSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2314ed8c6250a2bf5498955db0ad5f303fc86059c73255fa29b50f7f96d35b9")
    override fun encoderSettings(encoderSettings: EncoderSettingsProperty.Builder.() -> Unit): Unit
        = encoderSettings(EncoderSettingsProperty(encoderSettings))

    override fun inputAttachments(inputAttachments: IResolvable) {
      cdkBuilder.inputAttachments(inputAttachments.let(IResolvable::unwrap))
    }

    override fun inputAttachments(inputAttachments: List<Any>) {
      cdkBuilder.inputAttachments(inputAttachments)
    }

    override fun inputAttachments(vararg inputAttachments: Any): Unit =
        inputAttachments(inputAttachments.toList())

    override fun inputSpecification(inputSpecification: IResolvable) {
      cdkBuilder.inputSpecification(inputSpecification.let(IResolvable::unwrap))
    }

    override fun inputSpecification(inputSpecification: InputSpecificationProperty) {
      cdkBuilder.inputSpecification(inputSpecification.let(InputSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a09da5b93c8531e73bbabc998e2e89eced34c8bc3c128cced66fb015c0605e7")
    override
        fun inputSpecification(inputSpecification: InputSpecificationProperty.Builder.() -> Unit):
        Unit = inputSpecification(InputSpecificationProperty(inputSpecification))

    override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    override fun maintenance(maintenance: IResolvable) {
      cdkBuilder.maintenance(maintenance.let(IResolvable::unwrap))
    }

    override fun maintenance(maintenance: MaintenanceCreateSettingsProperty) {
      cdkBuilder.maintenance(maintenance.let(MaintenanceCreateSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e659608119eb682e4d6abbf1c66ff8f58f4fa7f39e5d6c1f9971d6b0504f15")
    override fun maintenance(maintenance: MaintenanceCreateSettingsProperty.Builder.() -> Unit):
        Unit = maintenance(MaintenanceCreateSettingsProperty(maintenance))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
    }

    override fun vpc(vpc: VpcOutputSettingsProperty) {
      cdkBuilder.vpc(vpc.let(VpcOutputSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91b7209b4e48950a8454d6c55ff29b62f8b84b5629568dc42e614dcf2ced1b47")
    override fun vpc(vpc: VpcOutputSettingsProperty.Builder.() -> Unit): Unit =
        vpc(VpcOutputSettingsProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnChannel.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun postFilterSharpening(postFilterSharpening: String)

      public fun strength(strength: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty.builder()

      override fun postFilterSharpening(postFilterSharpening: String) {
        cdkBuilder.postFilterSharpening(postFilterSharpening)
      }

      override fun strength(strength: String) {
        cdkBuilder.strength(strength)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty,
    ) : CdkObject(cdkObject), TemporalFilterSettingsProperty {
      override fun postFilterSharpening(): String? = unwrap(this).getPostFilterSharpening()

      override fun strength(): String? = unwrap(this).getStrength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemporalFilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty):
          TemporalFilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemporalFilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.TemporalFilterSettingsProperty
    }
  }

  public interface FailoverConditionSettingsProperty {
    public fun audioSilenceSettings(): Any? = unwrap(this).getAudioSilenceSettings()

    public fun inputLossSettings(): Any? = unwrap(this).getInputLossSettings()

    public fun videoBlackSettings(): Any? = unwrap(this).getVideoBlackSettings()

    @CdkDslMarker
    public interface Builder {
      public fun audioSilenceSettings(audioSilenceSettings: IResolvable)

      public fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9a4622e27dc9a59db26568c5068f3dba4c1e90432ad8bcca7d47d9931e9c491")
      public
          fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty.Builder.() -> Unit)

      public fun inputLossSettings(inputLossSettings: IResolvable)

      public fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6873e8132f190fd34bd4925f124e8201c44e6a922b26129aa6dd8851e6cbf9")
      public
          fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty.Builder.() -> Unit)

      public fun videoBlackSettings(videoBlackSettings: IResolvable)

      public fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1eca88803bfaebe36bff25f3b31a2eaf4d314c39ac7d7449b32bd0edb9f7d2b")
      public
          fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty.builder()

      override fun audioSilenceSettings(audioSilenceSettings: IResolvable) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings.let(IResolvable::unwrap))
      }

      override
          fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings.let(AudioSilenceFailoverSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9a4622e27dc9a59db26568c5068f3dba4c1e90432ad8bcca7d47d9931e9c491")
      override
          fun audioSilenceSettings(audioSilenceSettings: AudioSilenceFailoverSettingsProperty.Builder.() -> Unit):
          Unit = audioSilenceSettings(AudioSilenceFailoverSettingsProperty(audioSilenceSettings))

      override fun inputLossSettings(inputLossSettings: IResolvable) {
        cdkBuilder.inputLossSettings(inputLossSettings.let(IResolvable::unwrap))
      }

      override fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty) {
        cdkBuilder.inputLossSettings(inputLossSettings.let(InputLossFailoverSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6873e8132f190fd34bd4925f124e8201c44e6a922b26129aa6dd8851e6cbf9")
      override
          fun inputLossSettings(inputLossSettings: InputLossFailoverSettingsProperty.Builder.() -> Unit):
          Unit = inputLossSettings(InputLossFailoverSettingsProperty(inputLossSettings))

      override fun videoBlackSettings(videoBlackSettings: IResolvable) {
        cdkBuilder.videoBlackSettings(videoBlackSettings.let(IResolvable::unwrap))
      }

      override fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty) {
        cdkBuilder.videoBlackSettings(videoBlackSettings.let(VideoBlackFailoverSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1eca88803bfaebe36bff25f3b31a2eaf4d314c39ac7d7449b32bd0edb9f7d2b")
      override
          fun videoBlackSettings(videoBlackSettings: VideoBlackFailoverSettingsProperty.Builder.() -> Unit):
          Unit = videoBlackSettings(VideoBlackFailoverSettingsProperty(videoBlackSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty,
    ) : CdkObject(cdkObject), FailoverConditionSettingsProperty {
      override fun audioSilenceSettings(): Any? = unwrap(this).getAudioSilenceSettings()

      override fun inputLossSettings(): Any? = unwrap(this).getInputLossSettings()

      override fun videoBlackSettings(): Any? = unwrap(this).getVideoBlackSettings()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty
    }
  }

  public interface TtmlDestinationSettingsProperty {
    public fun styleControl(): String? = unwrap(this).getStyleControl()

    @CdkDslMarker
    public interface Builder {
      public fun styleControl(styleControl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty.builder()

      override fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty,
    ) : CdkObject(cdkObject), TtmlDestinationSettingsProperty {
      override fun styleControl(): String? = unwrap(this).getStyleControl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TtmlDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty):
          TtmlDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TtmlDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty
    }
  }

  public interface MediaPackageOutputDestinationSettingsProperty {
    public fun channelId(): String? = unwrap(this).getChannelId()

    @CdkDslMarker
    public interface Builder {
      public fun channelId(channelId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty.builder()

      override fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty,
    ) : CdkObject(cdkObject), MediaPackageOutputDestinationSettingsProperty {
      override fun channelId(): String? = unwrap(this).getChannelId()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun audioDescriptions(audioDescriptions: IResolvable)

      public fun audioDescriptions(audioDescriptions: List<Any>)

      public fun audioDescriptions(vararg audioDescriptions: Any)

      public fun availBlanking(availBlanking: IResolvable)

      public fun availBlanking(availBlanking: AvailBlankingProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d1f256f38a2cfa8279cd0fef64f78c95b365482243a7b7e1f3ac7f35fad2717")
      public fun availBlanking(availBlanking: AvailBlankingProperty.Builder.() -> Unit)

      public fun availConfiguration(availConfiguration: IResolvable)

      public fun availConfiguration(availConfiguration: AvailConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de082af680ca2b39139d9ae193b95b1c5047108cdddfd07607477d5b9d306654")
      public
          fun availConfiguration(availConfiguration: AvailConfigurationProperty.Builder.() -> Unit)

      public fun blackoutSlate(blackoutSlate: IResolvable)

      public fun blackoutSlate(blackoutSlate: BlackoutSlateProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9baeed143c2abf51a92a53e595ac64742cdbbdb54c67813d0c50c872f07f546e")
      public fun blackoutSlate(blackoutSlate: BlackoutSlateProperty.Builder.() -> Unit)

      public fun captionDescriptions(captionDescriptions: IResolvable)

      public fun captionDescriptions(captionDescriptions: List<Any>)

      public fun captionDescriptions(vararg captionDescriptions: Any)

      public fun colorCorrectionSettings(colorCorrectionSettings: IResolvable)

      public fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d7751059623d3453cd3088c55927f6982a5685e67f25fa6bdec7c47e63dc325")
      public
          fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty.Builder.() -> Unit)

      public fun featureActivations(featureActivations: IResolvable)

      public fun featureActivations(featureActivations: FeatureActivationsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("574c0d37abdb7d1723b40e15113029c9685786d9f41f9af44dd7b97796dcbe74")
      public
          fun featureActivations(featureActivations: FeatureActivationsProperty.Builder.() -> Unit)

      public fun globalConfiguration(globalConfiguration: IResolvable)

      public fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a27409ab5a4b184643ca0062ca649505ba38dde57b2436514d9adbc4af4d89cf")
      public
          fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty.Builder.() -> Unit)

      public fun motionGraphicsConfiguration(motionGraphicsConfiguration: IResolvable)

      public
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bce1eb9cf7b54224c18c75e8ca6dcf9dd3f59b0ca515e7422c8cc4cfcca96450")
      public
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty.Builder.() -> Unit)

      public fun nielsenConfiguration(nielsenConfiguration: IResolvable)

      public fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d84746321052a6870e72f4b238703d7f7ac248b4369058685ae9b74b3c12b4")
      public
          fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty.Builder.() -> Unit)

      public fun outputGroups(outputGroups: IResolvable)

      public fun outputGroups(outputGroups: List<Any>)

      public fun outputGroups(vararg outputGroups: Any)

      public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable)

      public fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8ceafe338ad83f8dc2749873cd585b9935c4b9a6cc703b6d9322f013ef1241e")
      public
          fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit)

      public fun timecodeConfig(timecodeConfig: IResolvable)

      public fun timecodeConfig(timecodeConfig: TimecodeConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b390af5b7bb78099e03d9e5eae9f2c772587e60687200d29b332285d1c40af")
      public fun timecodeConfig(timecodeConfig: TimecodeConfigProperty.Builder.() -> Unit)

      public fun videoDescriptions(videoDescriptions: IResolvable)

      public fun videoDescriptions(videoDescriptions: List<Any>)

      public fun videoDescriptions(vararg videoDescriptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty.builder()

      override fun audioDescriptions(audioDescriptions: IResolvable) {
        cdkBuilder.audioDescriptions(audioDescriptions.let(IResolvable::unwrap))
      }

      override fun audioDescriptions(audioDescriptions: List<Any>) {
        cdkBuilder.audioDescriptions(audioDescriptions)
      }

      override fun audioDescriptions(vararg audioDescriptions: Any): Unit =
          audioDescriptions(audioDescriptions.toList())

      override fun availBlanking(availBlanking: IResolvable) {
        cdkBuilder.availBlanking(availBlanking.let(IResolvable::unwrap))
      }

      override fun availBlanking(availBlanking: AvailBlankingProperty) {
        cdkBuilder.availBlanking(availBlanking.let(AvailBlankingProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d1f256f38a2cfa8279cd0fef64f78c95b365482243a7b7e1f3ac7f35fad2717")
      override fun availBlanking(availBlanking: AvailBlankingProperty.Builder.() -> Unit): Unit =
          availBlanking(AvailBlankingProperty(availBlanking))

      override fun availConfiguration(availConfiguration: IResolvable) {
        cdkBuilder.availConfiguration(availConfiguration.let(IResolvable::unwrap))
      }

      override fun availConfiguration(availConfiguration: AvailConfigurationProperty) {
        cdkBuilder.availConfiguration(availConfiguration.let(AvailConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de082af680ca2b39139d9ae193b95b1c5047108cdddfd07607477d5b9d306654")
      override
          fun availConfiguration(availConfiguration: AvailConfigurationProperty.Builder.() -> Unit):
          Unit = availConfiguration(AvailConfigurationProperty(availConfiguration))

      override fun blackoutSlate(blackoutSlate: IResolvable) {
        cdkBuilder.blackoutSlate(blackoutSlate.let(IResolvable::unwrap))
      }

      override fun blackoutSlate(blackoutSlate: BlackoutSlateProperty) {
        cdkBuilder.blackoutSlate(blackoutSlate.let(BlackoutSlateProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9baeed143c2abf51a92a53e595ac64742cdbbdb54c67813d0c50c872f07f546e")
      override fun blackoutSlate(blackoutSlate: BlackoutSlateProperty.Builder.() -> Unit): Unit =
          blackoutSlate(BlackoutSlateProperty(blackoutSlate))

      override fun captionDescriptions(captionDescriptions: IResolvable) {
        cdkBuilder.captionDescriptions(captionDescriptions.let(IResolvable::unwrap))
      }

      override fun captionDescriptions(captionDescriptions: List<Any>) {
        cdkBuilder.captionDescriptions(captionDescriptions)
      }

      override fun captionDescriptions(vararg captionDescriptions: Any): Unit =
          captionDescriptions(captionDescriptions.toList())

      override fun colorCorrectionSettings(colorCorrectionSettings: IResolvable) {
        cdkBuilder.colorCorrectionSettings(colorCorrectionSettings.let(IResolvable::unwrap))
      }

      override
          fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty) {
        cdkBuilder.colorCorrectionSettings(colorCorrectionSettings.let(ColorCorrectionSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d7751059623d3453cd3088c55927f6982a5685e67f25fa6bdec7c47e63dc325")
      override
          fun colorCorrectionSettings(colorCorrectionSettings: ColorCorrectionSettingsProperty.Builder.() -> Unit):
          Unit = colorCorrectionSettings(ColorCorrectionSettingsProperty(colorCorrectionSettings))

      override fun featureActivations(featureActivations: IResolvable) {
        cdkBuilder.featureActivations(featureActivations.let(IResolvable::unwrap))
      }

      override fun featureActivations(featureActivations: FeatureActivationsProperty) {
        cdkBuilder.featureActivations(featureActivations.let(FeatureActivationsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("574c0d37abdb7d1723b40e15113029c9685786d9f41f9af44dd7b97796dcbe74")
      override
          fun featureActivations(featureActivations: FeatureActivationsProperty.Builder.() -> Unit):
          Unit = featureActivations(FeatureActivationsProperty(featureActivations))

      override fun globalConfiguration(globalConfiguration: IResolvable) {
        cdkBuilder.globalConfiguration(globalConfiguration.let(IResolvable::unwrap))
      }

      override fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty) {
        cdkBuilder.globalConfiguration(globalConfiguration.let(GlobalConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a27409ab5a4b184643ca0062ca649505ba38dde57b2436514d9adbc4af4d89cf")
      override
          fun globalConfiguration(globalConfiguration: GlobalConfigurationProperty.Builder.() -> Unit):
          Unit = globalConfiguration(GlobalConfigurationProperty(globalConfiguration))

      override fun motionGraphicsConfiguration(motionGraphicsConfiguration: IResolvable) {
        cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration.let(IResolvable::unwrap))
      }

      override
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty) {
        cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration.let(MotionGraphicsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bce1eb9cf7b54224c18c75e8ca6dcf9dd3f59b0ca515e7422c8cc4cfcca96450")
      override
          fun motionGraphicsConfiguration(motionGraphicsConfiguration: MotionGraphicsConfigurationProperty.Builder.() -> Unit):
          Unit =
          motionGraphicsConfiguration(MotionGraphicsConfigurationProperty(motionGraphicsConfiguration))

      override fun nielsenConfiguration(nielsenConfiguration: IResolvable) {
        cdkBuilder.nielsenConfiguration(nielsenConfiguration.let(IResolvable::unwrap))
      }

      override fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty) {
        cdkBuilder.nielsenConfiguration(nielsenConfiguration.let(NielsenConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d84746321052a6870e72f4b238703d7f7ac248b4369058685ae9b74b3c12b4")
      override
          fun nielsenConfiguration(nielsenConfiguration: NielsenConfigurationProperty.Builder.() -> Unit):
          Unit = nielsenConfiguration(NielsenConfigurationProperty(nielsenConfiguration))

      override fun outputGroups(outputGroups: IResolvable) {
        cdkBuilder.outputGroups(outputGroups.let(IResolvable::unwrap))
      }

      override fun outputGroups(outputGroups: List<Any>) {
        cdkBuilder.outputGroups(outputGroups)
      }

      override fun outputGroups(vararg outputGroups: Any): Unit =
          outputGroups(outputGroups.toList())

      override fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(IResolvable::unwrap))
      }

      override fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(ThumbnailConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8ceafe338ad83f8dc2749873cd585b9935c4b9a6cc703b6d9322f013ef1241e")
      override
          fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit):
          Unit = thumbnailConfiguration(ThumbnailConfigurationProperty(thumbnailConfiguration))

      override fun timecodeConfig(timecodeConfig: IResolvable) {
        cdkBuilder.timecodeConfig(timecodeConfig.let(IResolvable::unwrap))
      }

      override fun timecodeConfig(timecodeConfig: TimecodeConfigProperty) {
        cdkBuilder.timecodeConfig(timecodeConfig.let(TimecodeConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b390af5b7bb78099e03d9e5eae9f2c772587e60687200d29b332285d1c40af")
      override fun timecodeConfig(timecodeConfig: TimecodeConfigProperty.Builder.() -> Unit): Unit =
          timecodeConfig(TimecodeConfigProperty(timecodeConfig))

      override fun videoDescriptions(videoDescriptions: IResolvable) {
        cdkBuilder.videoDescriptions(videoDescriptions.let(IResolvable::unwrap))
      }

      override fun videoDescriptions(videoDescriptions: List<Any>) {
        cdkBuilder.videoDescriptions(videoDescriptions)
      }

      override fun videoDescriptions(vararg videoDescriptions: Any): Unit =
          videoDescriptions(videoDescriptions.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty,
    ) : CdkObject(cdkObject), EncoderSettingsProperty {
      override fun audioDescriptions(): Any? = unwrap(this).getAudioDescriptions()

      override fun availBlanking(): Any? = unwrap(this).getAvailBlanking()

      override fun availConfiguration(): Any? = unwrap(this).getAvailConfiguration()

      override fun blackoutSlate(): Any? = unwrap(this).getBlackoutSlate()

      override fun captionDescriptions(): Any? = unwrap(this).getCaptionDescriptions()

      override fun colorCorrectionSettings(): Any? = unwrap(this).getColorCorrectionSettings()

      override fun featureActivations(): Any? = unwrap(this).getFeatureActivations()

      override fun globalConfiguration(): Any? = unwrap(this).getGlobalConfiguration()

      override fun motionGraphicsConfiguration(): Any? =
          unwrap(this).getMotionGraphicsConfiguration()

      override fun nielsenConfiguration(): Any? = unwrap(this).getNielsenConfiguration()

      override fun outputGroups(): Any? = unwrap(this).getOutputGroups()

      override fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()

      override fun timecodeConfig(): Any? = unwrap(this).getTimecodeConfig()

      override fun videoDescriptions(): Any? = unwrap(this).getVideoDescriptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncoderSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty):
          EncoderSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncoderSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty
    }
  }

  public interface AribSourceSettingsProperty {
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty,
    ) : CdkObject(cdkObject), AribSourceSettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AribSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty):
          AribSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AribSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty
    }
  }

  public interface FrameCaptureS3SettingsProperty {
    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    @CdkDslMarker
    public interface Builder {
      public fun cannedAcl(cannedAcl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty.builder()

      override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty,
    ) : CdkObject(cdkObject), FrameCaptureS3SettingsProperty {
      override fun cannedAcl(): String? = unwrap(this).getCannedAcl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureS3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty):
          FrameCaptureS3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureS3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty
    }
  }

  public interface AudioSelectorSettingsProperty {
    public fun audioHlsRenditionSelection(): Any? = unwrap(this).getAudioHlsRenditionSelection()

    public fun audioLanguageSelection(): Any? = unwrap(this).getAudioLanguageSelection()

    public fun audioPidSelection(): Any? = unwrap(this).getAudioPidSelection()

    public fun audioTrackSelection(): Any? = unwrap(this).getAudioTrackSelection()

    @CdkDslMarker
    public interface Builder {
      public fun audioHlsRenditionSelection(audioHlsRenditionSelection: IResolvable)

      public
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57f473f69aabcdb6115510d9522d392da088acd1a80699e2531c70834760e221")
      public
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty.Builder.() -> Unit)

      public fun audioLanguageSelection(audioLanguageSelection: IResolvable)

      public fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365c1b38fd9d10caf08061a5220659122c6d8b8c949b627c9b1dc914540f8d12")
      public
          fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty.Builder.() -> Unit)

      public fun audioPidSelection(audioPidSelection: IResolvable)

      public fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4031aa8fdb005243ae93caca7816ed10aad1c82b3568da36acdeea067a639e45")
      public fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty.Builder.() -> Unit)

      public fun audioTrackSelection(audioTrackSelection: IResolvable)

      public fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cec170abbe3c52964153da491e53bfeb7340d8de0822a228ba39dee4a09876f6")
      public
          fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty.builder()

      override fun audioHlsRenditionSelection(audioHlsRenditionSelection: IResolvable) {
        cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection.let(IResolvable::unwrap))
      }

      override
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty) {
        cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection.let(AudioHlsRenditionSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57f473f69aabcdb6115510d9522d392da088acd1a80699e2531c70834760e221")
      override
          fun audioHlsRenditionSelection(audioHlsRenditionSelection: AudioHlsRenditionSelectionProperty.Builder.() -> Unit):
          Unit =
          audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty(audioHlsRenditionSelection))

      override fun audioLanguageSelection(audioLanguageSelection: IResolvable) {
        cdkBuilder.audioLanguageSelection(audioLanguageSelection.let(IResolvable::unwrap))
      }

      override fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty) {
        cdkBuilder.audioLanguageSelection(audioLanguageSelection.let(AudioLanguageSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365c1b38fd9d10caf08061a5220659122c6d8b8c949b627c9b1dc914540f8d12")
      override
          fun audioLanguageSelection(audioLanguageSelection: AudioLanguageSelectionProperty.Builder.() -> Unit):
          Unit = audioLanguageSelection(AudioLanguageSelectionProperty(audioLanguageSelection))

      override fun audioPidSelection(audioPidSelection: IResolvable) {
        cdkBuilder.audioPidSelection(audioPidSelection.let(IResolvable::unwrap))
      }

      override fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty) {
        cdkBuilder.audioPidSelection(audioPidSelection.let(AudioPidSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4031aa8fdb005243ae93caca7816ed10aad1c82b3568da36acdeea067a639e45")
      override
          fun audioPidSelection(audioPidSelection: AudioPidSelectionProperty.Builder.() -> Unit):
          Unit = audioPidSelection(AudioPidSelectionProperty(audioPidSelection))

      override fun audioTrackSelection(audioTrackSelection: IResolvable) {
        cdkBuilder.audioTrackSelection(audioTrackSelection.let(IResolvable::unwrap))
      }

      override fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty) {
        cdkBuilder.audioTrackSelection(audioTrackSelection.let(AudioTrackSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cec170abbe3c52964153da491e53bfeb7340d8de0822a228ba39dee4a09876f6")
      override
          fun audioTrackSelection(audioTrackSelection: AudioTrackSelectionProperty.Builder.() -> Unit):
          Unit = audioTrackSelection(AudioTrackSelectionProperty(audioTrackSelection))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty,
    ) : CdkObject(cdkObject), AudioSelectorSettingsProperty {
      override fun audioHlsRenditionSelection(): Any? = unwrap(this).getAudioHlsRenditionSelection()

      override fun audioLanguageSelection(): Any? = unwrap(this).getAudioLanguageSelection()

      override fun audioPidSelection(): Any? = unwrap(this).getAudioPidSelection()

      override fun audioTrackSelection(): Any? = unwrap(this).getAudioTrackSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioSelectorSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty):
          AudioSelectorSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioSelectorSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty
    }
  }

  public interface AncillarySourceSettingsProperty {
    public fun sourceAncillaryChannelNumber(): Number? =
        unwrap(this).getSourceAncillaryChannelNumber()

    @CdkDslMarker
    public interface Builder {
      public fun sourceAncillaryChannelNumber(sourceAncillaryChannelNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty.builder()

      override fun sourceAncillaryChannelNumber(sourceAncillaryChannelNumber: Number) {
        cdkBuilder.sourceAncillaryChannelNumber(sourceAncillaryChannelNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty,
    ) : CdkObject(cdkObject), AncillarySourceSettingsProperty {
      override fun sourceAncillaryChannelNumber(): Number? =
          unwrap(this).getSourceAncillaryChannelNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AncillarySourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty):
          AncillarySourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AncillarySourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty
    }
  }

  public interface AudioTrackSelectionProperty {
    public fun dolbyEDecode(): Any? = unwrap(this).getDolbyEDecode()

    public fun tracks(): Any? = unwrap(this).getTracks()

    @CdkDslMarker
    public interface Builder {
      public fun dolbyEDecode(dolbyEDecode: IResolvable)

      public fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae18f041583763468cb1efee730015c0485091c0148b2b88a351e1bc4623e002")
      public fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty.Builder.() -> Unit)

      public fun tracks(tracks: IResolvable)

      public fun tracks(tracks: List<Any>)

      public fun tracks(vararg tracks: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty.builder()

      override fun dolbyEDecode(dolbyEDecode: IResolvable) {
        cdkBuilder.dolbyEDecode(dolbyEDecode.let(IResolvable::unwrap))
      }

      override fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty) {
        cdkBuilder.dolbyEDecode(dolbyEDecode.let(AudioDolbyEDecodeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae18f041583763468cb1efee730015c0485091c0148b2b88a351e1bc4623e002")
      override fun dolbyEDecode(dolbyEDecode: AudioDolbyEDecodeProperty.Builder.() -> Unit): Unit =
          dolbyEDecode(AudioDolbyEDecodeProperty(dolbyEDecode))

      override fun tracks(tracks: IResolvable) {
        cdkBuilder.tracks(tracks.let(IResolvable::unwrap))
      }

      override fun tracks(tracks: List<Any>) {
        cdkBuilder.tracks(tracks)
      }

      override fun tracks(vararg tracks: Any): Unit = tracks(tracks.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty,
    ) : CdkObject(cdkObject), AudioTrackSelectionProperty {
      override fun dolbyEDecode(): Any? = unwrap(this).getDolbyEDecode()

      override fun tracks(): Any? = unwrap(this).getTracks()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioTrackSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty):
          AudioTrackSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioTrackSelectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty
    }
  }

  public interface MsSmoothOutputSettingsProperty {
    public fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    @CdkDslMarker
    public interface Builder {
      public fun h265PackagingType(h265PackagingType: String)

      public fun nameModifier(nameModifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty.builder()

      override fun h265PackagingType(h265PackagingType: String) {
        cdkBuilder.h265PackagingType(h265PackagingType)
      }

      override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty,
    ) : CdkObject(cdkObject), MsSmoothOutputSettingsProperty {
      override fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

      override fun nameModifier(): String? = unwrap(this).getNameModifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MsSmoothOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty):
          MsSmoothOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MsSmoothOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty
    }
  }

  public interface TimecodeBurninSettingsProperty {
    public fun fontSize(): String? = unwrap(this).getFontSize()

    public fun position(): String? = unwrap(this).getPosition()

    public fun prefix(): String? = unwrap(this).getPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun fontSize(fontSize: String)

      public fun position(position: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty.builder()

      override fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
      }

      override fun position(position: String) {
        cdkBuilder.position(position)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty,
    ) : CdkObject(cdkObject), TimecodeBurninSettingsProperty {
      override fun fontSize(): String? = unwrap(this).getFontSize()

      override fun position(): String? = unwrap(this).getPosition()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimecodeBurninSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty):
          TimecodeBurninSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimecodeBurninSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeBurninSettingsProperty
    }
  }

  public interface HlsSettingsProperty {
    public fun audioOnlyHlsSettings(): Any? = unwrap(this).getAudioOnlyHlsSettings()

    public fun fmp4HlsSettings(): Any? = unwrap(this).getFmp4HlsSettings()

    public fun frameCaptureHlsSettings(): Any? = unwrap(this).getFrameCaptureHlsSettings()

    public fun standardHlsSettings(): Any? = unwrap(this).getStandardHlsSettings()

    @CdkDslMarker
    public interface Builder {
      public fun audioOnlyHlsSettings(audioOnlyHlsSettings: IResolvable)

      public fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bb0210fd9a9456e3162e9522934779729e66c9ab5b4842cc1d27123a55bc751")
      public
          fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty.Builder.() -> Unit)

      public fun fmp4HlsSettings(fmp4HlsSettings: IResolvable)

      public fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e58fc58d38f6f42e1a071b54196fd03ae7cd87874eef4026b757878a5641216")
      public fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty.Builder.() -> Unit)

      public fun frameCaptureHlsSettings(frameCaptureHlsSettings: IResolvable)

      public fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f43465b294ed51517016804135fd9ecf4aa542f567808e8cb9b58aa054e8b068")
      public
          fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty.Builder.() -> Unit)

      public fun standardHlsSettings(standardHlsSettings: IResolvable)

      public fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d66e90b7e5bdaf459e62ffba6ca7f9dc821e40a46a92d0d1688dafb9b2ef99d4")
      public
          fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty.builder()

      override fun audioOnlyHlsSettings(audioOnlyHlsSettings: IResolvable) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings.let(IResolvable::unwrap))
      }

      override fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings.let(AudioOnlyHlsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bb0210fd9a9456e3162e9522934779729e66c9ab5b4842cc1d27123a55bc751")
      override
          fun audioOnlyHlsSettings(audioOnlyHlsSettings: AudioOnlyHlsSettingsProperty.Builder.() -> Unit):
          Unit = audioOnlyHlsSettings(AudioOnlyHlsSettingsProperty(audioOnlyHlsSettings))

      override fun fmp4HlsSettings(fmp4HlsSettings: IResolvable) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings.let(IResolvable::unwrap))
      }

      override fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings.let(Fmp4HlsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e58fc58d38f6f42e1a071b54196fd03ae7cd87874eef4026b757878a5641216")
      override fun fmp4HlsSettings(fmp4HlsSettings: Fmp4HlsSettingsProperty.Builder.() -> Unit):
          Unit = fmp4HlsSettings(Fmp4HlsSettingsProperty(fmp4HlsSettings))

      override fun frameCaptureHlsSettings(frameCaptureHlsSettings: IResolvable) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings.let(IResolvable::unwrap))
      }

      override
          fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings.let(FrameCaptureHlsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f43465b294ed51517016804135fd9ecf4aa542f567808e8cb9b58aa054e8b068")
      override
          fun frameCaptureHlsSettings(frameCaptureHlsSettings: FrameCaptureHlsSettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureHlsSettings(FrameCaptureHlsSettingsProperty(frameCaptureHlsSettings))

      override fun standardHlsSettings(standardHlsSettings: IResolvable) {
        cdkBuilder.standardHlsSettings(standardHlsSettings.let(IResolvable::unwrap))
      }

      override fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty) {
        cdkBuilder.standardHlsSettings(standardHlsSettings.let(StandardHlsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d66e90b7e5bdaf459e62ffba6ca7f9dc821e40a46a92d0d1688dafb9b2ef99d4")
      override
          fun standardHlsSettings(standardHlsSettings: StandardHlsSettingsProperty.Builder.() -> Unit):
          Unit = standardHlsSettings(StandardHlsSettingsProperty(standardHlsSettings))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty,
    ) : CdkObject(cdkObject), HlsSettingsProperty {
      override fun audioOnlyHlsSettings(): Any? = unwrap(this).getAudioOnlyHlsSettings()

      override fun fmp4HlsSettings(): Any? = unwrap(this).getFmp4HlsSettings()

      override fun frameCaptureHlsSettings(): Any? = unwrap(this).getFrameCaptureHlsSettings()

      override fun standardHlsSettings(): Any? = unwrap(this).getStandardHlsSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty):
          HlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty
    }
  }

  public interface VideoSelectorProperty {
    public fun colorSpace(): String? = unwrap(this).getColorSpace()

    public fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

    public fun colorSpaceUsage(): String? = unwrap(this).getColorSpaceUsage()

    public fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()

    @CdkDslMarker
    public interface Builder {
      public fun colorSpace(colorSpace: String)

      public fun colorSpaceSettings(colorSpaceSettings: IResolvable)

      public fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e2421f4c2b0f6e241caf12c279d5f76e520ef75d9a2f716912c7af6979f6502")
      public
          fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty.Builder.() -> Unit)

      public fun colorSpaceUsage(colorSpaceUsage: String)

      public fun selectorSettings(selectorSettings: IResolvable)

      public fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c804652e447ee859f6db2993372d4752d251703d9f04ee632062fb178291ec7")
      public
          fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty.builder()

      override fun colorSpace(colorSpace: String) {
        cdkBuilder.colorSpace(colorSpace)
      }

      override fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(IResolvable::unwrap))
      }

      override fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(VideoSelectorColorSpaceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e2421f4c2b0f6e241caf12c279d5f76e520ef75d9a2f716912c7af6979f6502")
      override
          fun colorSpaceSettings(colorSpaceSettings: VideoSelectorColorSpaceSettingsProperty.Builder.() -> Unit):
          Unit = colorSpaceSettings(VideoSelectorColorSpaceSettingsProperty(colorSpaceSettings))

      override fun colorSpaceUsage(colorSpaceUsage: String) {
        cdkBuilder.colorSpaceUsage(colorSpaceUsage)
      }

      override fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings.let(IResolvable::unwrap))
      }

      override fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings.let(VideoSelectorSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c804652e447ee859f6db2993372d4752d251703d9f04ee632062fb178291ec7")
      override
          fun selectorSettings(selectorSettings: VideoSelectorSettingsProperty.Builder.() -> Unit):
          Unit = selectorSettings(VideoSelectorSettingsProperty(selectorSettings))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty,
    ) : CdkObject(cdkObject), VideoSelectorProperty {
      override fun colorSpace(): String? = unwrap(this).getColorSpace()

      override fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

      override fun colorSpaceUsage(): String? = unwrap(this).getColorSpaceUsage()

      override fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty):
          VideoSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty
    }
  }

  public interface VideoSelectorProgramIdProperty {
    public fun programId(): Number? = unwrap(this).getProgramId()

    @CdkDslMarker
    public interface Builder {
      public fun programId(programId: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty.builder()

      override fun programId(programId: Number) {
        cdkBuilder.programId(programId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty,
    ) : CdkObject(cdkObject), VideoSelectorProgramIdProperty {
      override fun programId(): Number? = unwrap(this).getProgramId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorProgramIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty):
          VideoSelectorProgramIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorProgramIdProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adMarkers(adMarkers: List<String>)

      public fun adMarkers(vararg adMarkers: String)

      public fun baseUrlContent(baseUrlContent: String)

      public fun baseUrlContent1(baseUrlContent1: String)

      public fun baseUrlManifest(baseUrlManifest: String)

      public fun baseUrlManifest1(baseUrlManifest1: String)

      public fun captionLanguageMappings(captionLanguageMappings: IResolvable)

      public fun captionLanguageMappings(captionLanguageMappings: List<Any>)

      public fun captionLanguageMappings(vararg captionLanguageMappings: Any)

      public fun captionLanguageSetting(captionLanguageSetting: String)

      public fun clientCache(clientCache: String)

      public fun codecSpecification(codecSpecification: String)

      public fun constantIv(constantIv: String)

      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602195d175deb1f788b7b739569a4b3e2a31271a576cbf3a6e09685b2c761a17")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)

      public fun directoryStructure(directoryStructure: String)

      public fun discontinuityTags(discontinuityTags: String)

      public fun encryptionType(encryptionType: String)

      public fun hlsCdnSettings(hlsCdnSettings: IResolvable)

      public fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84c1338b5d0ca3983e8539a052b22a722994034c4be5a5cdd27f767c459d41eb")
      public fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty.Builder.() -> Unit)

      public fun hlsId3SegmentTagging(hlsId3SegmentTagging: String)

      public fun iFrameOnlyPlaylists(iFrameOnlyPlaylists: String)

      public fun incompleteSegmentBehavior(incompleteSegmentBehavior: String)

      public fun indexNSegments(indexNSegments: Number)

      public fun inputLossAction(inputLossAction: String)

      public fun ivInManifest(ivInManifest: String)

      public fun ivSource(ivSource: String)

      public fun keepSegments(keepSegments: Number)

      public fun keyFormat(keyFormat: String)

      public fun keyFormatVersions(keyFormatVersions: String)

      public fun keyProviderSettings(keyProviderSettings: IResolvable)

      public fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc7b9e6f6ea3911a322f5b6a914349405596807be38e8560a174e4f5120799d1")
      public
          fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty.Builder.() -> Unit)

      public fun manifestCompression(manifestCompression: String)

      public fun manifestDurationFormat(manifestDurationFormat: String)

      public fun minSegmentLength(minSegmentLength: Number)

      public fun mode(mode: String)

      public fun outputSelection(outputSelection: String)

      public fun programDateTime(programDateTime: String)

      public fun programDateTimeClock(programDateTimeClock: String)

      public fun programDateTimePeriod(programDateTimePeriod: Number)

      public fun redundantManifest(redundantManifest: String)

      public fun segmentLength(segmentLength: Number)

      public fun segmentationMode(segmentationMode: String)

      public fun segmentsPerSubdirectory(segmentsPerSubdirectory: Number)

      public fun streamInfResolution(streamInfResolution: String)

      public fun timedMetadataId3Frame(timedMetadataId3Frame: String)

      public fun timedMetadataId3Period(timedMetadataId3Period: Number)

      public fun timestampDeltaMilliseconds(timestampDeltaMilliseconds: Number)

      public fun tsFileMode(tsFileMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty.builder()

      override fun adMarkers(adMarkers: List<String>) {
        cdkBuilder.adMarkers(adMarkers)
      }

      override fun adMarkers(vararg adMarkers: String): Unit = adMarkers(adMarkers.toList())

      override fun baseUrlContent(baseUrlContent: String) {
        cdkBuilder.baseUrlContent(baseUrlContent)
      }

      override fun baseUrlContent1(baseUrlContent1: String) {
        cdkBuilder.baseUrlContent1(baseUrlContent1)
      }

      override fun baseUrlManifest(baseUrlManifest: String) {
        cdkBuilder.baseUrlManifest(baseUrlManifest)
      }

      override fun baseUrlManifest1(baseUrlManifest1: String) {
        cdkBuilder.baseUrlManifest1(baseUrlManifest1)
      }

      override fun captionLanguageMappings(captionLanguageMappings: IResolvable) {
        cdkBuilder.captionLanguageMappings(captionLanguageMappings.let(IResolvable::unwrap))
      }

      override fun captionLanguageMappings(captionLanguageMappings: List<Any>) {
        cdkBuilder.captionLanguageMappings(captionLanguageMappings)
      }

      override fun captionLanguageMappings(vararg captionLanguageMappings: Any): Unit =
          captionLanguageMappings(captionLanguageMappings.toList())

      override fun captionLanguageSetting(captionLanguageSetting: String) {
        cdkBuilder.captionLanguageSetting(captionLanguageSetting)
      }

      override fun clientCache(clientCache: String) {
        cdkBuilder.clientCache(clientCache)
      }

      override fun codecSpecification(codecSpecification: String) {
        cdkBuilder.codecSpecification(codecSpecification)
      }

      override fun constantIv(constantIv: String) {
        cdkBuilder.constantIv(constantIv)
      }

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("602195d175deb1f788b7b739569a4b3e2a31271a576cbf3a6e09685b2c761a17")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      override fun directoryStructure(directoryStructure: String) {
        cdkBuilder.directoryStructure(directoryStructure)
      }

      override fun discontinuityTags(discontinuityTags: String) {
        cdkBuilder.discontinuityTags(discontinuityTags)
      }

      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      override fun hlsCdnSettings(hlsCdnSettings: IResolvable) {
        cdkBuilder.hlsCdnSettings(hlsCdnSettings.let(IResolvable::unwrap))
      }

      override fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty) {
        cdkBuilder.hlsCdnSettings(hlsCdnSettings.let(HlsCdnSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84c1338b5d0ca3983e8539a052b22a722994034c4be5a5cdd27f767c459d41eb")
      override fun hlsCdnSettings(hlsCdnSettings: HlsCdnSettingsProperty.Builder.() -> Unit): Unit =
          hlsCdnSettings(HlsCdnSettingsProperty(hlsCdnSettings))

      override fun hlsId3SegmentTagging(hlsId3SegmentTagging: String) {
        cdkBuilder.hlsId3SegmentTagging(hlsId3SegmentTagging)
      }

      override fun iFrameOnlyPlaylists(iFrameOnlyPlaylists: String) {
        cdkBuilder.iFrameOnlyPlaylists(iFrameOnlyPlaylists)
      }

      override fun incompleteSegmentBehavior(incompleteSegmentBehavior: String) {
        cdkBuilder.incompleteSegmentBehavior(incompleteSegmentBehavior)
      }

      override fun indexNSegments(indexNSegments: Number) {
        cdkBuilder.indexNSegments(indexNSegments)
      }

      override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      override fun ivInManifest(ivInManifest: String) {
        cdkBuilder.ivInManifest(ivInManifest)
      }

      override fun ivSource(ivSource: String) {
        cdkBuilder.ivSource(ivSource)
      }

      override fun keepSegments(keepSegments: Number) {
        cdkBuilder.keepSegments(keepSegments)
      }

      override fun keyFormat(keyFormat: String) {
        cdkBuilder.keyFormat(keyFormat)
      }

      override fun keyFormatVersions(keyFormatVersions: String) {
        cdkBuilder.keyFormatVersions(keyFormatVersions)
      }

      override fun keyProviderSettings(keyProviderSettings: IResolvable) {
        cdkBuilder.keyProviderSettings(keyProviderSettings.let(IResolvable::unwrap))
      }

      override fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty) {
        cdkBuilder.keyProviderSettings(keyProviderSettings.let(KeyProviderSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc7b9e6f6ea3911a322f5b6a914349405596807be38e8560a174e4f5120799d1")
      override
          fun keyProviderSettings(keyProviderSettings: KeyProviderSettingsProperty.Builder.() -> Unit):
          Unit = keyProviderSettings(KeyProviderSettingsProperty(keyProviderSettings))

      override fun manifestCompression(manifestCompression: String) {
        cdkBuilder.manifestCompression(manifestCompression)
      }

      override fun manifestDurationFormat(manifestDurationFormat: String) {
        cdkBuilder.manifestDurationFormat(manifestDurationFormat)
      }

      override fun minSegmentLength(minSegmentLength: Number) {
        cdkBuilder.minSegmentLength(minSegmentLength)
      }

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun outputSelection(outputSelection: String) {
        cdkBuilder.outputSelection(outputSelection)
      }

      override fun programDateTime(programDateTime: String) {
        cdkBuilder.programDateTime(programDateTime)
      }

      override fun programDateTimeClock(programDateTimeClock: String) {
        cdkBuilder.programDateTimeClock(programDateTimeClock)
      }

      override fun programDateTimePeriod(programDateTimePeriod: Number) {
        cdkBuilder.programDateTimePeriod(programDateTimePeriod)
      }

      override fun redundantManifest(redundantManifest: String) {
        cdkBuilder.redundantManifest(redundantManifest)
      }

      override fun segmentLength(segmentLength: Number) {
        cdkBuilder.segmentLength(segmentLength)
      }

      override fun segmentationMode(segmentationMode: String) {
        cdkBuilder.segmentationMode(segmentationMode)
      }

      override fun segmentsPerSubdirectory(segmentsPerSubdirectory: Number) {
        cdkBuilder.segmentsPerSubdirectory(segmentsPerSubdirectory)
      }

      override fun streamInfResolution(streamInfResolution: String) {
        cdkBuilder.streamInfResolution(streamInfResolution)
      }

      override fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
        cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
      }

      override fun timedMetadataId3Period(timedMetadataId3Period: Number) {
        cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
      }

      override fun timestampDeltaMilliseconds(timestampDeltaMilliseconds: Number) {
        cdkBuilder.timestampDeltaMilliseconds(timestampDeltaMilliseconds)
      }

      override fun tsFileMode(tsFileMode: String) {
        cdkBuilder.tsFileMode(tsFileMode)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty,
    ) : CdkObject(cdkObject), HlsGroupSettingsProperty {
      override fun adMarkers(): List<String> = unwrap(this).getAdMarkers() ?: emptyList()

      override fun baseUrlContent(): String? = unwrap(this).getBaseUrlContent()

      override fun baseUrlContent1(): String? = unwrap(this).getBaseUrlContent1()

      override fun baseUrlManifest(): String? = unwrap(this).getBaseUrlManifest()

      override fun baseUrlManifest1(): String? = unwrap(this).getBaseUrlManifest1()

      override fun captionLanguageMappings(): Any? = unwrap(this).getCaptionLanguageMappings()

      override fun captionLanguageSetting(): String? = unwrap(this).getCaptionLanguageSetting()

      override fun clientCache(): String? = unwrap(this).getClientCache()

      override fun codecSpecification(): String? = unwrap(this).getCodecSpecification()

      override fun constantIv(): String? = unwrap(this).getConstantIv()

      override fun destination(): Any? = unwrap(this).getDestination()

      override fun directoryStructure(): String? = unwrap(this).getDirectoryStructure()

      override fun discontinuityTags(): String? = unwrap(this).getDiscontinuityTags()

      override fun encryptionType(): String? = unwrap(this).getEncryptionType()

      override fun hlsCdnSettings(): Any? = unwrap(this).getHlsCdnSettings()

      override fun hlsId3SegmentTagging(): String? = unwrap(this).getHlsId3SegmentTagging()

      override fun iFrameOnlyPlaylists(): String? = unwrap(this).getIFrameOnlyPlaylists()

      override fun incompleteSegmentBehavior(): String? =
          unwrap(this).getIncompleteSegmentBehavior()

      override fun indexNSegments(): Number? = unwrap(this).getIndexNSegments()

      override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      override fun ivInManifest(): String? = unwrap(this).getIvInManifest()

      override fun ivSource(): String? = unwrap(this).getIvSource()

      override fun keepSegments(): Number? = unwrap(this).getKeepSegments()

      override fun keyFormat(): String? = unwrap(this).getKeyFormat()

      override fun keyFormatVersions(): String? = unwrap(this).getKeyFormatVersions()

      override fun keyProviderSettings(): Any? = unwrap(this).getKeyProviderSettings()

      override fun manifestCompression(): String? = unwrap(this).getManifestCompression()

      override fun manifestDurationFormat(): String? = unwrap(this).getManifestDurationFormat()

      override fun minSegmentLength(): Number? = unwrap(this).getMinSegmentLength()

      override fun mode(): String? = unwrap(this).getMode()

      override fun outputSelection(): String? = unwrap(this).getOutputSelection()

      override fun programDateTime(): String? = unwrap(this).getProgramDateTime()

      override fun programDateTimeClock(): String? = unwrap(this).getProgramDateTimeClock()

      override fun programDateTimePeriod(): Number? = unwrap(this).getProgramDateTimePeriod()

      override fun redundantManifest(): String? = unwrap(this).getRedundantManifest()

      override fun segmentLength(): Number? = unwrap(this).getSegmentLength()

      override fun segmentationMode(): String? = unwrap(this).getSegmentationMode()

      override fun segmentsPerSubdirectory(): Number? = unwrap(this).getSegmentsPerSubdirectory()

      override fun streamInfResolution(): String? = unwrap(this).getStreamInfResolution()

      override fun timedMetadataId3Frame(): String? = unwrap(this).getTimedMetadataId3Frame()

      override fun timedMetadataId3Period(): Number? = unwrap(this).getTimedMetadataId3Period()

      override fun timestampDeltaMilliseconds(): Number? =
          unwrap(this).getTimestampDeltaMilliseconds()

      override fun tsFileMode(): String? = unwrap(this).getTsFileMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty):
          HlsGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsGroupSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun alignment(alignment: String)

      public fun backgroundColor(backgroundColor: String)

      public fun backgroundOpacity(backgroundOpacity: Number)

      public fun font(font: IResolvable)

      public fun font(font: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("598a8f83dd8bb448689e6b1dce1eeab6686b5bed8a56f49049737c1eb08f2a6b")
      public fun font(font: InputLocationProperty.Builder.() -> Unit)

      public fun fontColor(fontColor: String)

      public fun fontOpacity(fontOpacity: Number)

      public fun fontResolution(fontResolution: Number)

      public fun fontSize(fontSize: String)

      public fun outlineColor(outlineColor: String)

      public fun outlineSize(outlineSize: Number)

      public fun shadowColor(shadowColor: String)

      public fun shadowOpacity(shadowOpacity: Number)

      public fun shadowXOffset(shadowXOffset: Number)

      public fun shadowYOffset(shadowYOffset: Number)

      public fun teletextGridControl(teletextGridControl: String)

      public fun xPosition(xPosition: Number)

      public fun yPosition(yPosition: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty.builder()

      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      override fun backgroundOpacity(backgroundOpacity: Number) {
        cdkBuilder.backgroundOpacity(backgroundOpacity)
      }

      override fun font(font: IResolvable) {
        cdkBuilder.font(font.let(IResolvable::unwrap))
      }

      override fun font(font: InputLocationProperty) {
        cdkBuilder.font(font.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("598a8f83dd8bb448689e6b1dce1eeab6686b5bed8a56f49049737c1eb08f2a6b")
      override fun font(font: InputLocationProperty.Builder.() -> Unit): Unit =
          font(InputLocationProperty(font))

      override fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
      }

      override fun fontOpacity(fontOpacity: Number) {
        cdkBuilder.fontOpacity(fontOpacity)
      }

      override fun fontResolution(fontResolution: Number) {
        cdkBuilder.fontResolution(fontResolution)
      }

      override fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
      }

      override fun outlineColor(outlineColor: String) {
        cdkBuilder.outlineColor(outlineColor)
      }

      override fun outlineSize(outlineSize: Number) {
        cdkBuilder.outlineSize(outlineSize)
      }

      override fun shadowColor(shadowColor: String) {
        cdkBuilder.shadowColor(shadowColor)
      }

      override fun shadowOpacity(shadowOpacity: Number) {
        cdkBuilder.shadowOpacity(shadowOpacity)
      }

      override fun shadowXOffset(shadowXOffset: Number) {
        cdkBuilder.shadowXOffset(shadowXOffset)
      }

      override fun shadowYOffset(shadowYOffset: Number) {
        cdkBuilder.shadowYOffset(shadowYOffset)
      }

      override fun teletextGridControl(teletextGridControl: String) {
        cdkBuilder.teletextGridControl(teletextGridControl)
      }

      override fun xPosition(xPosition: Number) {
        cdkBuilder.xPosition(xPosition)
      }

      override fun yPosition(yPosition: Number) {
        cdkBuilder.yPosition(yPosition)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty,
    ) : CdkObject(cdkObject), BurnInDestinationSettingsProperty {
      override fun alignment(): String? = unwrap(this).getAlignment()

      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      override fun backgroundOpacity(): Number? = unwrap(this).getBackgroundOpacity()

      override fun font(): Any? = unwrap(this).getFont()

      override fun fontColor(): String? = unwrap(this).getFontColor()

      override fun fontOpacity(): Number? = unwrap(this).getFontOpacity()

      override fun fontResolution(): Number? = unwrap(this).getFontResolution()

      override fun fontSize(): String? = unwrap(this).getFontSize()

      override fun outlineColor(): String? = unwrap(this).getOutlineColor()

      override fun outlineSize(): Number? = unwrap(this).getOutlineSize()

      override fun shadowColor(): String? = unwrap(this).getShadowColor()

      override fun shadowOpacity(): Number? = unwrap(this).getShadowOpacity()

      override fun shadowXOffset(): Number? = unwrap(this).getShadowXOffset()

      override fun shadowYOffset(): Number? = unwrap(this).getShadowYOffset()

      override fun teletextGridControl(): String? = unwrap(this).getTeletextGridControl()

      override fun xPosition(): Number? = unwrap(this).getXPosition()

      override fun yPosition(): Number? = unwrap(this).getYPosition()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty
    }
  }

  public interface ArchiveContainerSettingsProperty {
    public fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()

    public fun rawSettings(): Any? = unwrap(this).getRawSettings()

    @CdkDslMarker
    public interface Builder {
      public fun m2TsSettings(m2TsSettings: IResolvable)

      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7093d6686b5ef527935fe685b74943267db4667834199c668465e8912aa1d4c8")
      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit)

      public fun rawSettings(rawSettings: IResolvable)

      public fun rawSettings(rawSettings: RawSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c1753d7e4b83a3e8537edf2c5e975c81df6f13161acd84c5118feb73038412")
      public fun rawSettings(rawSettings: RawSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty.builder()

      override fun m2TsSettings(m2TsSettings: IResolvable) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(IResolvable::unwrap))
      }

      override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(M2tsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7093d6686b5ef527935fe685b74943267db4667834199c668465e8912aa1d4c8")
      override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit): Unit =
          m2TsSettings(M2tsSettingsProperty(m2TsSettings))

      override fun rawSettings(rawSettings: IResolvable) {
        cdkBuilder.rawSettings(rawSettings.let(IResolvable::unwrap))
      }

      override fun rawSettings(rawSettings: RawSettingsProperty) {
        cdkBuilder.rawSettings(rawSettings.let(RawSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c1753d7e4b83a3e8537edf2c5e975c81df6f13161acd84c5118feb73038412")
      override fun rawSettings(rawSettings: RawSettingsProperty.Builder.() -> Unit): Unit =
          rawSettings(RawSettingsProperty(rawSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty,
    ) : CdkObject(cdkObject), ArchiveContainerSettingsProperty {
      override fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()

      override fun rawSettings(): Any? = unwrap(this).getRawSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveContainerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty):
          ArchiveContainerSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveContainerSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty
    }
  }

  public interface CaptionRectangleProperty {
    public fun height(): Number? = unwrap(this).getHeight()

    public fun leftOffset(): Number? = unwrap(this).getLeftOffset()

    public fun topOffset(): Number? = unwrap(this).getTopOffset()

    public fun width(): Number? = unwrap(this).getWidth()

    @CdkDslMarker
    public interface Builder {
      public fun height(height: Number)

      public fun leftOffset(leftOffset: Number)

      public fun topOffset(topOffset: Number)

      public fun width(width: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty.builder()

      override fun height(height: Number) {
        cdkBuilder.height(height)
      }

      override fun leftOffset(leftOffset: Number) {
        cdkBuilder.leftOffset(leftOffset)
      }

      override fun topOffset(topOffset: Number) {
        cdkBuilder.topOffset(topOffset)
      }

      override fun width(width: Number) {
        cdkBuilder.width(width)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty,
    ) : CdkObject(cdkObject), CaptionRectangleProperty {
      override fun height(): Number? = unwrap(this).getHeight()

      override fun leftOffset(): Number? = unwrap(this).getLeftOffset()

      override fun topOffset(): Number? = unwrap(this).getTopOffset()

      override fun width(): Number? = unwrap(this).getWidth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionRectangleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty):
          CaptionRectangleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionRectangleProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionRectangleProperty
    }
  }

  public interface VideoSelectorPidProperty {
    public fun pid(): Number? = unwrap(this).getPid()

    @CdkDslMarker
    public interface Builder {
      public fun pid(pid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty.builder()

      override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty,
    ) : CdkObject(cdkObject), VideoSelectorPidProperty {
      override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorPidProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty):
          VideoSelectorPidProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorPidProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorPidProperty
    }
  }

  public interface CaptionSelectorProperty {
    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun name(): String? = unwrap(this).getName()

    public fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()

    @CdkDslMarker
    public interface Builder {
      public fun languageCode(languageCode: String)

      public fun name(name: String)

      public fun selectorSettings(selectorSettings: IResolvable)

      public fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81158ee68ff4bd4f8535025bc79c2e557c3e5612ad574f8c180adb7c89c943cf")
      public
          fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty.builder()

      override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings.let(IResolvable::unwrap))
      }

      override fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings.let(CaptionSelectorSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81158ee68ff4bd4f8535025bc79c2e557c3e5612ad574f8c180adb7c89c943cf")
      override
          fun selectorSettings(selectorSettings: CaptionSelectorSettingsProperty.Builder.() -> Unit):
          Unit = selectorSettings(CaptionSelectorSettingsProperty(selectorSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty,
    ) : CdkObject(cdkObject), CaptionSelectorProperty {
      override fun languageCode(): String? = unwrap(this).getLanguageCode()

      override fun name(): String? = unwrap(this).getName()

      override fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty):
          CaptionSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionSelectorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorProperty
    }
  }

  public interface AutomaticInputFailoverSettingsProperty {
    public fun errorClearTimeMsec(): Number? = unwrap(this).getErrorClearTimeMsec()

    public fun failoverConditions(): Any? = unwrap(this).getFailoverConditions()

    public fun inputPreference(): String? = unwrap(this).getInputPreference()

    public fun secondaryInputId(): String? = unwrap(this).getSecondaryInputId()

    @CdkDslMarker
    public interface Builder {
      public fun errorClearTimeMsec(errorClearTimeMsec: Number)

      public fun failoverConditions(failoverConditions: IResolvable)

      public fun failoverConditions(failoverConditions: List<Any>)

      public fun failoverConditions(vararg failoverConditions: Any)

      public fun inputPreference(inputPreference: String)

      public fun secondaryInputId(secondaryInputId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty.builder()

      override fun errorClearTimeMsec(errorClearTimeMsec: Number) {
        cdkBuilder.errorClearTimeMsec(errorClearTimeMsec)
      }

      override fun failoverConditions(failoverConditions: IResolvable) {
        cdkBuilder.failoverConditions(failoverConditions.let(IResolvable::unwrap))
      }

      override fun failoverConditions(failoverConditions: List<Any>) {
        cdkBuilder.failoverConditions(failoverConditions)
      }

      override fun failoverConditions(vararg failoverConditions: Any): Unit =
          failoverConditions(failoverConditions.toList())

      override fun inputPreference(inputPreference: String) {
        cdkBuilder.inputPreference(inputPreference)
      }

      override fun secondaryInputId(secondaryInputId: String) {
        cdkBuilder.secondaryInputId(secondaryInputId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty,
    ) : CdkObject(cdkObject), AutomaticInputFailoverSettingsProperty {
      override fun errorClearTimeMsec(): Number? = unwrap(this).getErrorClearTimeMsec()

      override fun failoverConditions(): Any? = unwrap(this).getFailoverConditions()

      override fun inputPreference(): String? = unwrap(this).getInputPreference()

      override fun secondaryInputId(): String? = unwrap(this).getSecondaryInputId()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty
    }
  }

  public interface OutputDestinationSettingsProperty {
    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    public fun streamName(): String? = unwrap(this).getStreamName()

    public fun url(): String? = unwrap(this).getUrl()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun passwordParam(passwordParam: String)

      public fun streamName(streamName: String)

      public fun url(url: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty.builder()

      override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty,
    ) : CdkObject(cdkObject), OutputDestinationSettingsProperty {
      override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      override fun streamName(): String? = unwrap(this).getStreamName()

      override fun url(): String? = unwrap(this).getUrl()

      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty
    }
  }

  public interface StandardHlsSettingsProperty {
    public fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

    public fun m3u8Settings(): Any? = unwrap(this).getM3U8Settings()

    @CdkDslMarker
    public interface Builder {
      public fun audioRenditionSets(audioRenditionSets: String)

      public fun m3u8Settings(m3U8Settings: IResolvable)

      public fun m3u8Settings(m3U8Settings: M3u8SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38b5e11b940a0f49b93bfecfb05e7fe43fe5e9e271d6f17adb9f58c531eef318")
      public fun m3u8Settings(m3U8Settings: M3u8SettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty.builder()

      override fun audioRenditionSets(audioRenditionSets: String) {
        cdkBuilder.audioRenditionSets(audioRenditionSets)
      }

      override fun m3u8Settings(m3U8Settings: IResolvable) {
        cdkBuilder.m3U8Settings(m3U8Settings.let(IResolvable::unwrap))
      }

      override fun m3u8Settings(m3U8Settings: M3u8SettingsProperty) {
        cdkBuilder.m3U8Settings(m3U8Settings.let(M3u8SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38b5e11b940a0f49b93bfecfb05e7fe43fe5e9e271d6f17adb9f58c531eef318")
      override fun m3u8Settings(m3U8Settings: M3u8SettingsProperty.Builder.() -> Unit): Unit =
          m3u8Settings(M3u8SettingsProperty(m3U8Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty,
    ) : CdkObject(cdkObject), StandardHlsSettingsProperty {
      override fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

      override fun m3u8Settings(): Any? = unwrap(this).getM3U8Settings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StandardHlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty):
          StandardHlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StandardHlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty
    }
  }

  public interface Hdr10SettingsProperty {
    public fun maxCll(): Number? = unwrap(this).getMaxCll()

    public fun maxFall(): Number? = unwrap(this).getMaxFall()

    @CdkDslMarker
    public interface Builder {
      public fun maxCll(maxCll: Number)

      public fun maxFall(maxFall: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty.builder()

      override fun maxCll(maxCll: Number) {
        cdkBuilder.maxCll(maxCll)
      }

      override fun maxFall(maxFall: Number) {
        cdkBuilder.maxFall(maxFall)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty,
    ) : CdkObject(cdkObject), Hdr10SettingsProperty {
      override fun maxCll(): Number? = unwrap(this).getMaxCll()

      override fun maxFall(): Number? = unwrap(this).getMaxFall()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Hdr10SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty):
          Hdr10SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Hdr10SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty
    }
  }

  public interface FailoverConditionProperty {
    public fun failoverConditionSettings(): Any? = unwrap(this).getFailoverConditionSettings()

    @CdkDslMarker
    public interface Builder {
      public fun failoverConditionSettings(failoverConditionSettings: IResolvable)

      public
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629b16f62ee290cbd0e82a02bcdbf024d120c3d84b15192f7be5d1b4ca1dc0e0")
      public
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty.builder()

      override fun failoverConditionSettings(failoverConditionSettings: IResolvable) {
        cdkBuilder.failoverConditionSettings(failoverConditionSettings.let(IResolvable::unwrap))
      }

      override
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty) {
        cdkBuilder.failoverConditionSettings(failoverConditionSettings.let(FailoverConditionSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629b16f62ee290cbd0e82a02bcdbf024d120c3d84b15192f7be5d1b4ca1dc0e0")
      override
          fun failoverConditionSettings(failoverConditionSettings: FailoverConditionSettingsProperty.Builder.() -> Unit):
          Unit =
          failoverConditionSettings(FailoverConditionSettingsProperty(failoverConditionSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty,
    ) : CdkObject(cdkObject), FailoverConditionProperty {
      override fun failoverConditionSettings(): Any? = unwrap(this).getFailoverConditionSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty):
          FailoverConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConditionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionProperty
    }
  }

  public interface VideoBlackFailoverSettingsProperty {
    public fun blackDetectThreshold(): Number? = unwrap(this).getBlackDetectThreshold()

    public fun videoBlackThresholdMsec(): Number? = unwrap(this).getVideoBlackThresholdMsec()

    @CdkDslMarker
    public interface Builder {
      public fun blackDetectThreshold(blackDetectThreshold: Number)

      public fun videoBlackThresholdMsec(videoBlackThresholdMsec: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty.builder()

      override fun blackDetectThreshold(blackDetectThreshold: Number) {
        cdkBuilder.blackDetectThreshold(blackDetectThreshold)
      }

      override fun videoBlackThresholdMsec(videoBlackThresholdMsec: Number) {
        cdkBuilder.videoBlackThresholdMsec(videoBlackThresholdMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty,
    ) : CdkObject(cdkObject), VideoBlackFailoverSettingsProperty {
      override fun blackDetectThreshold(): Number? = unwrap(this).getBlackDetectThreshold()

      override fun videoBlackThresholdMsec(): Number? = unwrap(this).getVideoBlackThresholdMsec()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty
    }
  }

  public interface AudioSelectorProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun selectorSettings(selectorSettings: IResolvable)

      public fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b47d54560858067562f2574450a11cb064f5e35f13dac5550686750c80cbba97")
      public
          fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings.let(IResolvable::unwrap))
      }

      override fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings.let(AudioSelectorSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b47d54560858067562f2574450a11cb064f5e35f13dac5550686750c80cbba97")
      override
          fun selectorSettings(selectorSettings: AudioSelectorSettingsProperty.Builder.() -> Unit):
          Unit = selectorSettings(AudioSelectorSettingsProperty(selectorSettings))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty,
    ) : CdkObject(cdkObject), AudioSelectorProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun selectorSettings(): Any? = unwrap(this).getSelectorSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty):
          AudioSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioSelectorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun archiveOutputSettings(archiveOutputSettings: IResolvable)

      public fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96508601faf036961ed97cb0f41f5db79d1f5f5f32121ddf0d39ebdd9a28397f")
      public
          fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty.Builder.() -> Unit)

      public fun frameCaptureOutputSettings(frameCaptureOutputSettings: IResolvable)

      public
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("637fc0ef1a6446f62c6bb390d919ce51f7f7ba06671c3f81a3be74893638806c")
      public
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty.Builder.() -> Unit)

      public fun hlsOutputSettings(hlsOutputSettings: IResolvable)

      public fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9ec5d8e58c4207407034812b09b7bf670556604d103bd82399fa54d6c831127")
      public fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty.Builder.() -> Unit)

      public fun mediaPackageOutputSettings(mediaPackageOutputSettings: IResolvable)

      public
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("042b9266410320f12735b0c2a3782b15ebdc5cb9e9646757f9eaaf441671bd2a")
      public
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty.Builder.() -> Unit)

      public fun msSmoothOutputSettings(msSmoothOutputSettings: IResolvable)

      public fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dc1bd2f0596c3c621f61c1f7dafb428b985a8888d003104f9da9190629b330a")
      public
          fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty.Builder.() -> Unit)

      public fun multiplexOutputSettings(multiplexOutputSettings: IResolvable)

      public fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6fb822bb074ba6559b06e35d4c89d57d22c4409e7f385aaf9adced8e9e4cfe")
      public
          fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty.Builder.() -> Unit)

      public fun rtmpOutputSettings(rtmpOutputSettings: IResolvable)

      public fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1064347474fea1517c2b20cc253c8021728d3a360fd5d9eb92580980b9c5a302")
      public
          fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty.Builder.() -> Unit)

      public fun udpOutputSettings(udpOutputSettings: IResolvable)

      public fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea3fc8126a3b4ba21b6fabc3233e4d25413a43a84dcd5f1c23dcee8909657d3e")
      public fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty.builder()

      override fun archiveOutputSettings(archiveOutputSettings: IResolvable) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings.let(IResolvable::unwrap))
      }

      override fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings.let(ArchiveOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96508601faf036961ed97cb0f41f5db79d1f5f5f32121ddf0d39ebdd9a28397f")
      override
          fun archiveOutputSettings(archiveOutputSettings: ArchiveOutputSettingsProperty.Builder.() -> Unit):
          Unit = archiveOutputSettings(ArchiveOutputSettingsProperty(archiveOutputSettings))

      override fun frameCaptureOutputSettings(frameCaptureOutputSettings: IResolvable) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings.let(IResolvable::unwrap))
      }

      override
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings.let(FrameCaptureOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("637fc0ef1a6446f62c6bb390d919ce51f7f7ba06671c3f81a3be74893638806c")
      override
          fun frameCaptureOutputSettings(frameCaptureOutputSettings: FrameCaptureOutputSettingsProperty.Builder.() -> Unit):
          Unit =
          frameCaptureOutputSettings(FrameCaptureOutputSettingsProperty(frameCaptureOutputSettings))

      override fun hlsOutputSettings(hlsOutputSettings: IResolvable) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings.let(IResolvable::unwrap))
      }

      override fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings.let(HlsOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9ec5d8e58c4207407034812b09b7bf670556604d103bd82399fa54d6c831127")
      override
          fun hlsOutputSettings(hlsOutputSettings: HlsOutputSettingsProperty.Builder.() -> Unit):
          Unit = hlsOutputSettings(HlsOutputSettingsProperty(hlsOutputSettings))

      override fun mediaPackageOutputSettings(mediaPackageOutputSettings: IResolvable) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings.let(IResolvable::unwrap))
      }

      override
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings.let(MediaPackageOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("042b9266410320f12735b0c2a3782b15ebdc5cb9e9646757f9eaaf441671bd2a")
      override
          fun mediaPackageOutputSettings(mediaPackageOutputSettings: MediaPackageOutputSettingsProperty.Builder.() -> Unit):
          Unit =
          mediaPackageOutputSettings(MediaPackageOutputSettingsProperty(mediaPackageOutputSettings))

      override fun msSmoothOutputSettings(msSmoothOutputSettings: IResolvable) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings.let(IResolvable::unwrap))
      }

      override fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings.let(MsSmoothOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dc1bd2f0596c3c621f61c1f7dafb428b985a8888d003104f9da9190629b330a")
      override
          fun msSmoothOutputSettings(msSmoothOutputSettings: MsSmoothOutputSettingsProperty.Builder.() -> Unit):
          Unit = msSmoothOutputSettings(MsSmoothOutputSettingsProperty(msSmoothOutputSettings))

      override fun multiplexOutputSettings(multiplexOutputSettings: IResolvable) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings.let(IResolvable::unwrap))
      }

      override
          fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings.let(MultiplexOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6fb822bb074ba6559b06e35d4c89d57d22c4409e7f385aaf9adced8e9e4cfe")
      override
          fun multiplexOutputSettings(multiplexOutputSettings: MultiplexOutputSettingsProperty.Builder.() -> Unit):
          Unit = multiplexOutputSettings(MultiplexOutputSettingsProperty(multiplexOutputSettings))

      override fun rtmpOutputSettings(rtmpOutputSettings: IResolvable) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings.let(IResolvable::unwrap))
      }

      override fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings.let(RtmpOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1064347474fea1517c2b20cc253c8021728d3a360fd5d9eb92580980b9c5a302")
      override
          fun rtmpOutputSettings(rtmpOutputSettings: RtmpOutputSettingsProperty.Builder.() -> Unit):
          Unit = rtmpOutputSettings(RtmpOutputSettingsProperty(rtmpOutputSettings))

      override fun udpOutputSettings(udpOutputSettings: IResolvable) {
        cdkBuilder.udpOutputSettings(udpOutputSettings.let(IResolvable::unwrap))
      }

      override fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty) {
        cdkBuilder.udpOutputSettings(udpOutputSettings.let(UdpOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea3fc8126a3b4ba21b6fabc3233e4d25413a43a84dcd5f1c23dcee8909657d3e")
      override
          fun udpOutputSettings(udpOutputSettings: UdpOutputSettingsProperty.Builder.() -> Unit):
          Unit = udpOutputSettings(UdpOutputSettingsProperty(udpOutputSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty,
    ) : CdkObject(cdkObject), OutputSettingsProperty {
      override fun archiveOutputSettings(): Any? = unwrap(this).getArchiveOutputSettings()

      override fun frameCaptureOutputSettings(): Any? = unwrap(this).getFrameCaptureOutputSettings()

      override fun hlsOutputSettings(): Any? = unwrap(this).getHlsOutputSettings()

      override fun mediaPackageOutputSettings(): Any? = unwrap(this).getMediaPackageOutputSettings()

      override fun msSmoothOutputSettings(): Any? = unwrap(this).getMsSmoothOutputSettings()

      override fun multiplexOutputSettings(): Any? = unwrap(this).getMultiplexOutputSettings()

      override fun rtmpOutputSettings(): Any? = unwrap(this).getRtmpOutputSettings()

      override fun udpOutputSettings(): Any? = unwrap(this).getUdpOutputSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty):
          OutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty
    }
  }

  public interface NielsenConfigurationProperty {
    public fun distributorId(): String? = unwrap(this).getDistributorId()

    public fun nielsenPcmToId3Tagging(): String? = unwrap(this).getNielsenPcmToId3Tagging()

    @CdkDslMarker
    public interface Builder {
      public fun distributorId(distributorId: String)

      public fun nielsenPcmToId3Tagging(nielsenPcmToId3Tagging: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty.builder()

      override fun distributorId(distributorId: String) {
        cdkBuilder.distributorId(distributorId)
      }

      override fun nielsenPcmToId3Tagging(nielsenPcmToId3Tagging: String) {
        cdkBuilder.nielsenPcmToId3Tagging(nielsenPcmToId3Tagging)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty,
    ) : CdkObject(cdkObject), NielsenConfigurationProperty {
      override fun distributorId(): String? = unwrap(this).getDistributorId()

      override fun nielsenPcmToId3Tagging(): String? = unwrap(this).getNielsenPcmToId3Tagging()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NielsenConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty):
          NielsenConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NielsenConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty
    }
  }

  public interface DolbyVision81SettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty,
    ) : CdkObject(cdkObject), DolbyVision81SettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DolbyVision81SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty):
          DolbyVision81SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DolbyVision81SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.DolbyVision81SettingsProperty
    }
  }

  public interface DvbSdtSettingsProperty {
    public fun outputSdt(): String? = unwrap(this).getOutputSdt()

    public fun repInterval(): Number? = unwrap(this).getRepInterval()

    public fun serviceName(): String? = unwrap(this).getServiceName()

    public fun serviceProviderName(): String? = unwrap(this).getServiceProviderName()

    @CdkDslMarker
    public interface Builder {
      public fun outputSdt(outputSdt: String)

      public fun repInterval(repInterval: Number)

      public fun serviceName(serviceName: String)

      public fun serviceProviderName(serviceProviderName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty.builder()

      override fun outputSdt(outputSdt: String) {
        cdkBuilder.outputSdt(outputSdt)
      }

      override fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
      }

      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      override fun serviceProviderName(serviceProviderName: String) {
        cdkBuilder.serviceProviderName(serviceProviderName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty,
    ) : CdkObject(cdkObject), DvbSdtSettingsProperty {
      override fun outputSdt(): String? = unwrap(this).getOutputSdt()

      override fun repInterval(): Number? = unwrap(this).getRepInterval()

      override fun serviceName(): String? = unwrap(this).getServiceName()

      override fun serviceProviderName(): String? = unwrap(this).getServiceProviderName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DvbSdtSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty):
          DvbSdtSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbSdtSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun alignment(alignment: String)

      public fun backgroundColor(backgroundColor: String)

      public fun backgroundOpacity(backgroundOpacity: Number)

      public fun font(font: IResolvable)

      public fun font(font: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5227e364a0e2717d6a35bd34eedf478ab33ea797e1595280ee32edac263126a")
      public fun font(font: InputLocationProperty.Builder.() -> Unit)

      public fun fontColor(fontColor: String)

      public fun fontOpacity(fontOpacity: Number)

      public fun fontResolution(fontResolution: Number)

      public fun fontSize(fontSize: String)

      public fun outlineColor(outlineColor: String)

      public fun outlineSize(outlineSize: Number)

      public fun shadowColor(shadowColor: String)

      public fun shadowOpacity(shadowOpacity: Number)

      public fun shadowXOffset(shadowXOffset: Number)

      public fun shadowYOffset(shadowYOffset: Number)

      public fun teletextGridControl(teletextGridControl: String)

      public fun xPosition(xPosition: Number)

      public fun yPosition(yPosition: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty.builder()

      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      override fun backgroundOpacity(backgroundOpacity: Number) {
        cdkBuilder.backgroundOpacity(backgroundOpacity)
      }

      override fun font(font: IResolvable) {
        cdkBuilder.font(font.let(IResolvable::unwrap))
      }

      override fun font(font: InputLocationProperty) {
        cdkBuilder.font(font.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5227e364a0e2717d6a35bd34eedf478ab33ea797e1595280ee32edac263126a")
      override fun font(font: InputLocationProperty.Builder.() -> Unit): Unit =
          font(InputLocationProperty(font))

      override fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
      }

      override fun fontOpacity(fontOpacity: Number) {
        cdkBuilder.fontOpacity(fontOpacity)
      }

      override fun fontResolution(fontResolution: Number) {
        cdkBuilder.fontResolution(fontResolution)
      }

      override fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
      }

      override fun outlineColor(outlineColor: String) {
        cdkBuilder.outlineColor(outlineColor)
      }

      override fun outlineSize(outlineSize: Number) {
        cdkBuilder.outlineSize(outlineSize)
      }

      override fun shadowColor(shadowColor: String) {
        cdkBuilder.shadowColor(shadowColor)
      }

      override fun shadowOpacity(shadowOpacity: Number) {
        cdkBuilder.shadowOpacity(shadowOpacity)
      }

      override fun shadowXOffset(shadowXOffset: Number) {
        cdkBuilder.shadowXOffset(shadowXOffset)
      }

      override fun shadowYOffset(shadowYOffset: Number) {
        cdkBuilder.shadowYOffset(shadowYOffset)
      }

      override fun teletextGridControl(teletextGridControl: String) {
        cdkBuilder.teletextGridControl(teletextGridControl)
      }

      override fun xPosition(xPosition: Number) {
        cdkBuilder.xPosition(xPosition)
      }

      override fun yPosition(yPosition: Number) {
        cdkBuilder.yPosition(yPosition)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty,
    ) : CdkObject(cdkObject), DvbSubDestinationSettingsProperty {
      override fun alignment(): String? = unwrap(this).getAlignment()

      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      override fun backgroundOpacity(): Number? = unwrap(this).getBackgroundOpacity()

      override fun font(): Any? = unwrap(this).getFont()

      override fun fontColor(): String? = unwrap(this).getFontColor()

      override fun fontOpacity(): Number? = unwrap(this).getFontOpacity()

      override fun fontResolution(): Number? = unwrap(this).getFontResolution()

      override fun fontSize(): String? = unwrap(this).getFontSize()

      override fun outlineColor(): String? = unwrap(this).getOutlineColor()

      override fun outlineSize(): Number? = unwrap(this).getOutlineSize()

      override fun shadowColor(): String? = unwrap(this).getShadowColor()

      override fun shadowOpacity(): Number? = unwrap(this).getShadowOpacity()

      override fun shadowXOffset(): Number? = unwrap(this).getShadowXOffset()

      override fun shadowYOffset(): Number? = unwrap(this).getShadowYOffset()

      override fun teletextGridControl(): String? = unwrap(this).getTeletextGridControl()

      override fun xPosition(): Number? = unwrap(this).getXPosition()

      override fun yPosition(): Number? = unwrap(this).getYPosition()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty
    }
  }

  public interface DvbSubSourceSettingsProperty {
    public fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

    public fun pid(): Number? = unwrap(this).getPid()

    @CdkDslMarker
    public interface Builder {
      public fun ocrLanguage(ocrLanguage: String)

      public fun pid(pid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty.builder()

      override fun ocrLanguage(ocrLanguage: String) {
        cdkBuilder.ocrLanguage(ocrLanguage)
      }

      override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty,
    ) : CdkObject(cdkObject), DvbSubSourceSettingsProperty {
      override fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

      override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DvbSubSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty):
          DvbSubSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbSubSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty
    }
  }

  public interface TeletextDestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty,
    ) : CdkObject(cdkObject), TeletextDestinationSettingsProperty

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty
    }
  }

  public interface UdpContainerSettingsProperty {
    public fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()

    @CdkDslMarker
    public interface Builder {
      public fun m2TsSettings(m2TsSettings: IResolvable)

      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de00169a1a7b875224dcc32084c600e437c97c6eb3c8f07f07e02283fcb99e06")
      public fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty.builder()

      override fun m2TsSettings(m2TsSettings: IResolvable) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(IResolvable::unwrap))
      }

      override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty) {
        cdkBuilder.m2TsSettings(m2TsSettings.let(M2tsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de00169a1a7b875224dcc32084c600e437c97c6eb3c8f07f07e02283fcb99e06")
      override fun m2TsSettings(m2TsSettings: M2tsSettingsProperty.Builder.() -> Unit): Unit =
          m2TsSettings(M2tsSettingsProperty(m2TsSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty,
    ) : CdkObject(cdkObject), UdpContainerSettingsProperty {
      override fun m2TsSettings(): Any? = unwrap(this).getM2TsSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UdpContainerSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty):
          UdpContainerSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UdpContainerSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.UdpContainerSettingsProperty
    }
  }

  public interface InputLossFailoverSettingsProperty {
    public fun inputLossThresholdMsec(): Number? = unwrap(this).getInputLossThresholdMsec()

    @CdkDslMarker
    public interface Builder {
      public fun inputLossThresholdMsec(inputLossThresholdMsec: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty.builder()

      override fun inputLossThresholdMsec(inputLossThresholdMsec: Number) {
        cdkBuilder.inputLossThresholdMsec(inputLossThresholdMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty,
    ) : CdkObject(cdkObject), InputLossFailoverSettingsProperty {
      override fun inputLossThresholdMsec(): Number? = unwrap(this).getInputLossThresholdMsec()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty
    }
  }

  public interface EbuTtDDestinationSettingsProperty {
    public fun copyrightHolder(): String? = unwrap(this).getCopyrightHolder()

    public fun fillLineGap(): String? = unwrap(this).getFillLineGap()

    public fun fontFamily(): String? = unwrap(this).getFontFamily()

    public fun styleControl(): String? = unwrap(this).getStyleControl()

    @CdkDslMarker
    public interface Builder {
      public fun copyrightHolder(copyrightHolder: String)

      public fun fillLineGap(fillLineGap: String)

      public fun fontFamily(fontFamily: String)

      public fun styleControl(styleControl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty.builder()

      override fun copyrightHolder(copyrightHolder: String) {
        cdkBuilder.copyrightHolder(copyrightHolder)
      }

      override fun fillLineGap(fillLineGap: String) {
        cdkBuilder.fillLineGap(fillLineGap)
      }

      override fun fontFamily(fontFamily: String) {
        cdkBuilder.fontFamily(fontFamily)
      }

      override fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty,
    ) : CdkObject(cdkObject), EbuTtDDestinationSettingsProperty {
      override fun copyrightHolder(): String? = unwrap(this).getCopyrightHolder()

      override fun fillLineGap(): String? = unwrap(this).getFillLineGap()

      override fun fontFamily(): String? = unwrap(this).getFontFamily()

      override fun styleControl(): String? = unwrap(this).getStyleControl()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty
    }
  }

  public interface EpochLockingSettingsProperty {
    public fun customEpoch(): String? = unwrap(this).getCustomEpoch()

    public fun jamSyncTime(): String? = unwrap(this).getJamSyncTime()

    @CdkDslMarker
    public interface Builder {
      public fun customEpoch(customEpoch: String)

      public fun jamSyncTime(jamSyncTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty.builder()

      override fun customEpoch(customEpoch: String) {
        cdkBuilder.customEpoch(customEpoch)
      }

      override fun jamSyncTime(jamSyncTime: String) {
        cdkBuilder.jamSyncTime(jamSyncTime)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty,
    ) : CdkObject(cdkObject), EpochLockingSettingsProperty {
      override fun customEpoch(): String? = unwrap(this).getCustomEpoch()

      override fun jamSyncTime(): String? = unwrap(this).getJamSyncTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EpochLockingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty):
          EpochLockingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EpochLockingSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.EpochLockingSettingsProperty
    }
  }

  public interface HlsInputSettingsProperty {
    public fun bandwidth(): Number? = unwrap(this).getBandwidth()

    public fun bufferSegments(): Number? = unwrap(this).getBufferSegments()

    public fun retries(): Number? = unwrap(this).getRetries()

    public fun retryInterval(): Number? = unwrap(this).getRetryInterval()

    public fun scte35Source(): String? = unwrap(this).getScte35Source()

    @CdkDslMarker
    public interface Builder {
      public fun bandwidth(bandwidth: Number)

      public fun bufferSegments(bufferSegments: Number)

      public fun retries(retries: Number)

      public fun retryInterval(retryInterval: Number)

      public fun scte35Source(scte35Source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty.builder()

      override fun bandwidth(bandwidth: Number) {
        cdkBuilder.bandwidth(bandwidth)
      }

      override fun bufferSegments(bufferSegments: Number) {
        cdkBuilder.bufferSegments(bufferSegments)
      }

      override fun retries(retries: Number) {
        cdkBuilder.retries(retries)
      }

      override fun retryInterval(retryInterval: Number) {
        cdkBuilder.retryInterval(retryInterval)
      }

      override fun scte35Source(scte35Source: String) {
        cdkBuilder.scte35Source(scte35Source)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty,
    ) : CdkObject(cdkObject), HlsInputSettingsProperty {
      override fun bandwidth(): Number? = unwrap(this).getBandwidth()

      override fun bufferSegments(): Number? = unwrap(this).getBufferSegments()

      override fun retries(): Number? = unwrap(this).getRetries()

      override fun retryInterval(): Number? = unwrap(this).getRetryInterval()

      override fun scte35Source(): String? = unwrap(this).getScte35Source()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsInputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty):
          HlsInputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsInputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty
    }
  }

  public interface HlsBasicPutSettingsProperty {
    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    @CdkDslMarker
    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number)

      public fun filecacheDuration(filecacheDuration: Number)

      public fun numRetries(numRetries: Number)

      public fun restartDelay(restartDelay: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty.builder()

      override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty,
    ) : CdkObject(cdkObject), HlsBasicPutSettingsProperty {
      override fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

      override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      override fun numRetries(): Number? = unwrap(this).getNumRetries()

      override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsBasicPutSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty):
          HlsBasicPutSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsBasicPutSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty
    }
  }

  public interface AudioPidSelectionProperty {
    public fun pid(): Number? = unwrap(this).getPid()

    @CdkDslMarker
    public interface Builder {
      public fun pid(pid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty.builder()

      override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty,
    ) : CdkObject(cdkObject), AudioPidSelectionProperty {
      override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioPidSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty):
          AudioPidSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioPidSelectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty
    }
  }

  public interface EsamProperty {
    public fun acquisitionPointId(): String? = unwrap(this).getAcquisitionPointId()

    public fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    public fun poisEndpoint(): String? = unwrap(this).getPoisEndpoint()

    public fun username(): String? = unwrap(this).getUsername()

    public fun zoneIdentity(): String? = unwrap(this).getZoneIdentity()

    @CdkDslMarker
    public interface Builder {
      public fun acquisitionPointId(acquisitionPointId: String)

      public fun adAvailOffset(adAvailOffset: Number)

      public fun passwordParam(passwordParam: String)

      public fun poisEndpoint(poisEndpoint: String)

      public fun username(username: String)

      public fun zoneIdentity(zoneIdentity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty.builder()

      override fun acquisitionPointId(acquisitionPointId: String) {
        cdkBuilder.acquisitionPointId(acquisitionPointId)
      }

      override fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
      }

      override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      override fun poisEndpoint(poisEndpoint: String) {
        cdkBuilder.poisEndpoint(poisEndpoint)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      override fun zoneIdentity(zoneIdentity: String) {
        cdkBuilder.zoneIdentity(zoneIdentity)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty,
    ) : CdkObject(cdkObject), EsamProperty {
      override fun acquisitionPointId(): String? = unwrap(this).getAcquisitionPointId()

      override fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

      override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      override fun poisEndpoint(): String? = unwrap(this).getPoisEndpoint()

      override fun username(): String? = unwrap(this).getUsername()

      override fun zoneIdentity(): String? = unwrap(this).getZoneIdentity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EsamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty):
          EsamProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EsamProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnChannel.EsamProperty
    }
  }

  public interface ArchiveOutputSettingsProperty {
    public fun containerSettings(): Any? = unwrap(this).getContainerSettings()

    public fun extension(): String? = unwrap(this).getExtension()

    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    @CdkDslMarker
    public interface Builder {
      public fun containerSettings(containerSettings: IResolvable)

      public fun containerSettings(containerSettings: ArchiveContainerSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b10f91128a6e98b3cdbfdeb6678f677ef83dcf43bea00aa4f041ec7fd1df8f7")
      public
          fun containerSettings(containerSettings: ArchiveContainerSettingsProperty.Builder.() -> Unit)

      public fun extension(extension: String)

      public fun nameModifier(nameModifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty.builder()

      override fun containerSettings(containerSettings: IResolvable) {
        cdkBuilder.containerSettings(containerSettings.let(IResolvable::unwrap))
      }

      override fun containerSettings(containerSettings: ArchiveContainerSettingsProperty) {
        cdkBuilder.containerSettings(containerSettings.let(ArchiveContainerSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b10f91128a6e98b3cdbfdeb6678f677ef83dcf43bea00aa4f041ec7fd1df8f7")
      override
          fun containerSettings(containerSettings: ArchiveContainerSettingsProperty.Builder.() -> Unit):
          Unit = containerSettings(ArchiveContainerSettingsProperty(containerSettings))

      override fun extension(extension: String) {
        cdkBuilder.extension(extension)
      }

      override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty,
    ) : CdkObject(cdkObject), ArchiveOutputSettingsProperty {
      override fun containerSettings(): Any? = unwrap(this).getContainerSettings()

      override fun extension(): String? = unwrap(this).getExtension()

      override fun nameModifier(): String? = unwrap(this).getNameModifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty):
          ArchiveOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty
    }
  }

  public interface HlsMediaStoreSettingsProperty {
    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun mediaStoreStorageClass(): String? = unwrap(this).getMediaStoreStorageClass()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    @CdkDslMarker
    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number)

      public fun filecacheDuration(filecacheDuration: Number)

      public fun mediaStoreStorageClass(mediaStoreStorageClass: String)

      public fun numRetries(numRetries: Number)

      public fun restartDelay(restartDelay: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty.builder()

      override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      override fun mediaStoreStorageClass(mediaStoreStorageClass: String) {
        cdkBuilder.mediaStoreStorageClass(mediaStoreStorageClass)
      }

      override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty,
    ) : CdkObject(cdkObject), HlsMediaStoreSettingsProperty {
      override fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

      override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      override fun mediaStoreStorageClass(): String? = unwrap(this).getMediaStoreStorageClass()

      override fun numRetries(): Number? = unwrap(this).getNumRetries()

      override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsMediaStoreSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty):
          HlsMediaStoreSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsMediaStoreSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty
    }
  }

  public interface RtmpCaptionInfoDestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty,
    ) : CdkObject(cdkObject), RtmpCaptionInfoDestinationSettingsProperty

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty
    }
  }

  public interface AudioWatermarkSettingsProperty {
    public fun nielsenWatermarksSettings(): Any? = unwrap(this).getNielsenWatermarksSettings()

    @CdkDslMarker
    public interface Builder {
      public fun nielsenWatermarksSettings(nielsenWatermarksSettings: IResolvable)

      public
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d64823136217a65b6861749cca35190781e837c4765c763fcc01de6191621fe6")
      public
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty.builder()

      override fun nielsenWatermarksSettings(nielsenWatermarksSettings: IResolvable) {
        cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings.let(IResolvable::unwrap))
      }

      override
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty) {
        cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings.let(NielsenWatermarksSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d64823136217a65b6861749cca35190781e837c4765c763fcc01de6191621fe6")
      override
          fun nielsenWatermarksSettings(nielsenWatermarksSettings: NielsenWatermarksSettingsProperty.Builder.() -> Unit):
          Unit =
          nielsenWatermarksSettings(NielsenWatermarksSettingsProperty(nielsenWatermarksSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty,
    ) : CdkObject(cdkObject), AudioWatermarkSettingsProperty {
      override fun nielsenWatermarksSettings(): Any? = unwrap(this).getNielsenWatermarksSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioWatermarkSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty):
          AudioWatermarkSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioWatermarkSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioWatermarkSettingsProperty
    }
  }

  public interface HlsCdnSettingsProperty {
    public fun hlsAkamaiSettings(): Any? = unwrap(this).getHlsAkamaiSettings()

    public fun hlsBasicPutSettings(): Any? = unwrap(this).getHlsBasicPutSettings()

    public fun hlsMediaStoreSettings(): Any? = unwrap(this).getHlsMediaStoreSettings()

    public fun hlsS3Settings(): Any? = unwrap(this).getHlsS3Settings()

    public fun hlsWebdavSettings(): Any? = unwrap(this).getHlsWebdavSettings()

    @CdkDslMarker
    public interface Builder {
      public fun hlsAkamaiSettings(hlsAkamaiSettings: IResolvable)

      public fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("885a3ec706d60f0d26783b48ab433319baea0082ea71643fbe0c2562ac252eef")
      public fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty.Builder.() -> Unit)

      public fun hlsBasicPutSettings(hlsBasicPutSettings: IResolvable)

      public fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d0233d270f0c3c7010e08227c0543cbb684f6ee5c6563e28d7cc38dd2475490")
      public
          fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty.Builder.() -> Unit)

      public fun hlsMediaStoreSettings(hlsMediaStoreSettings: IResolvable)

      public fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f183c2557fad997b0cd46ac5ebef6e52f84359853946ca6759adce7925db6d6")
      public
          fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty.Builder.() -> Unit)

      public fun hlsS3Settings(hlsS3Settings: IResolvable)

      public fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0088a0d76d24fa0a8896362c68d43d2c23752a7fda8885846cdf354571a30887")
      public fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty.Builder.() -> Unit)

      public fun hlsWebdavSettings(hlsWebdavSettings: IResolvable)

      public fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51a72e77c66d4f6e5c1a9f0ca490da16ebc207f7ee5cabcffb332154678ab919")
      public fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty.builder()

      override fun hlsAkamaiSettings(hlsAkamaiSettings: IResolvable) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings.let(IResolvable::unwrap))
      }

      override fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings.let(HlsAkamaiSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("885a3ec706d60f0d26783b48ab433319baea0082ea71643fbe0c2562ac252eef")
      override
          fun hlsAkamaiSettings(hlsAkamaiSettings: HlsAkamaiSettingsProperty.Builder.() -> Unit):
          Unit = hlsAkamaiSettings(HlsAkamaiSettingsProperty(hlsAkamaiSettings))

      override fun hlsBasicPutSettings(hlsBasicPutSettings: IResolvable) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings.let(IResolvable::unwrap))
      }

      override fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings.let(HlsBasicPutSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d0233d270f0c3c7010e08227c0543cbb684f6ee5c6563e28d7cc38dd2475490")
      override
          fun hlsBasicPutSettings(hlsBasicPutSettings: HlsBasicPutSettingsProperty.Builder.() -> Unit):
          Unit = hlsBasicPutSettings(HlsBasicPutSettingsProperty(hlsBasicPutSettings))

      override fun hlsMediaStoreSettings(hlsMediaStoreSettings: IResolvable) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings.let(IResolvable::unwrap))
      }

      override fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings.let(HlsMediaStoreSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f183c2557fad997b0cd46ac5ebef6e52f84359853946ca6759adce7925db6d6")
      override
          fun hlsMediaStoreSettings(hlsMediaStoreSettings: HlsMediaStoreSettingsProperty.Builder.() -> Unit):
          Unit = hlsMediaStoreSettings(HlsMediaStoreSettingsProperty(hlsMediaStoreSettings))

      override fun hlsS3Settings(hlsS3Settings: IResolvable) {
        cdkBuilder.hlsS3Settings(hlsS3Settings.let(IResolvable::unwrap))
      }

      override fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty) {
        cdkBuilder.hlsS3Settings(hlsS3Settings.let(HlsS3SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0088a0d76d24fa0a8896362c68d43d2c23752a7fda8885846cdf354571a30887")
      override fun hlsS3Settings(hlsS3Settings: HlsS3SettingsProperty.Builder.() -> Unit): Unit =
          hlsS3Settings(HlsS3SettingsProperty(hlsS3Settings))

      override fun hlsWebdavSettings(hlsWebdavSettings: IResolvable) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings.let(IResolvable::unwrap))
      }

      override fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings.let(HlsWebdavSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51a72e77c66d4f6e5c1a9f0ca490da16ebc207f7ee5cabcffb332154678ab919")
      override
          fun hlsWebdavSettings(hlsWebdavSettings: HlsWebdavSettingsProperty.Builder.() -> Unit):
          Unit = hlsWebdavSettings(HlsWebdavSettingsProperty(hlsWebdavSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty,
    ) : CdkObject(cdkObject), HlsCdnSettingsProperty {
      override fun hlsAkamaiSettings(): Any? = unwrap(this).getHlsAkamaiSettings()

      override fun hlsBasicPutSettings(): Any? = unwrap(this).getHlsBasicPutSettings()

      override fun hlsMediaStoreSettings(): Any? = unwrap(this).getHlsMediaStoreSettings()

      override fun hlsS3Settings(): Any? = unwrap(this).getHlsS3Settings()

      override fun hlsWebdavSettings(): Any? = unwrap(this).getHlsWebdavSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsCdnSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty):
          HlsCdnSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsCdnSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty
    }
  }

  public interface HlsWebdavSettingsProperty {
    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

    public fun httpTransferMode(): String? = unwrap(this).getHttpTransferMode()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    public fun restartDelay(): Number? = unwrap(this).getRestartDelay()

    @CdkDslMarker
    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number)

      public fun filecacheDuration(filecacheDuration: Number)

      public fun httpTransferMode(httpTransferMode: String)

      public fun numRetries(numRetries: Number)

      public fun restartDelay(restartDelay: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty.builder()

      override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      override fun httpTransferMode(httpTransferMode: String) {
        cdkBuilder.httpTransferMode(httpTransferMode)
      }

      override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty,
    ) : CdkObject(cdkObject), HlsWebdavSettingsProperty {
      override fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

      override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      override fun httpTransferMode(): String? = unwrap(this).getHttpTransferMode()

      override fun numRetries(): Number? = unwrap(this).getNumRetries()

      override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsWebdavSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty):
          HlsWebdavSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsWebdavSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty
    }
  }

  public interface Fmp4HlsSettingsProperty {
    public fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

    public fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

    public fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

    @CdkDslMarker
    public interface Builder {
      public fun audioRenditionSets(audioRenditionSets: String)

      public fun nielsenId3Behavior(nielsenId3Behavior: String)

      public fun timedMetadataBehavior(timedMetadataBehavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty.builder()

      override fun audioRenditionSets(audioRenditionSets: String) {
        cdkBuilder.audioRenditionSets(audioRenditionSets)
      }

      override fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
      }

      override fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty,
    ) : CdkObject(cdkObject), Fmp4HlsSettingsProperty {
      override fun audioRenditionSets(): String? = unwrap(this).getAudioRenditionSets()

      override fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

      override fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Fmp4HlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty):
          Fmp4HlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Fmp4HlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty
    }
  }

  public interface UdpOutputSettingsProperty {
    public fun bufferMsec(): Number? = unwrap(this).getBufferMsec()

    public fun containerSettings(): Any? = unwrap(this).getContainerSettings()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun fecOutputSettings(): Any? = unwrap(this).getFecOutputSettings()

    @CdkDslMarker
    public interface Builder {
      public fun bufferMsec(bufferMsec: Number)

      public fun containerSettings(containerSettings: IResolvable)

      public fun containerSettings(containerSettings: UdpContainerSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74df9c597b89bd508144098b540e43dfa8022f2bd985d484a1eba086ebc32fc7")
      public
          fun containerSettings(containerSettings: UdpContainerSettingsProperty.Builder.() -> Unit)

      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deacb52f4718c51c83188dd4ac73760ed57f512d6d448bf0d172c52f6faeb877")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)

      public fun fecOutputSettings(fecOutputSettings: IResolvable)

      public fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434432a33c4ebb01fadf3281ed2be04d8ad3c4e59c68e6cfe0d5816c521c690e")
      public fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty.builder()

      override fun bufferMsec(bufferMsec: Number) {
        cdkBuilder.bufferMsec(bufferMsec)
      }

      override fun containerSettings(containerSettings: IResolvable) {
        cdkBuilder.containerSettings(containerSettings.let(IResolvable::unwrap))
      }

      override fun containerSettings(containerSettings: UdpContainerSettingsProperty) {
        cdkBuilder.containerSettings(containerSettings.let(UdpContainerSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74df9c597b89bd508144098b540e43dfa8022f2bd985d484a1eba086ebc32fc7")
      override
          fun containerSettings(containerSettings: UdpContainerSettingsProperty.Builder.() -> Unit):
          Unit = containerSettings(UdpContainerSettingsProperty(containerSettings))

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deacb52f4718c51c83188dd4ac73760ed57f512d6d448bf0d172c52f6faeb877")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      override fun fecOutputSettings(fecOutputSettings: IResolvable) {
        cdkBuilder.fecOutputSettings(fecOutputSettings.let(IResolvable::unwrap))
      }

      override fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty) {
        cdkBuilder.fecOutputSettings(fecOutputSettings.let(FecOutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("434432a33c4ebb01fadf3281ed2be04d8ad3c4e59c68e6cfe0d5816c521c690e")
      override
          fun fecOutputSettings(fecOutputSettings: FecOutputSettingsProperty.Builder.() -> Unit):
          Unit = fecOutputSettings(FecOutputSettingsProperty(fecOutputSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty,
    ) : CdkObject(cdkObject), UdpOutputSettingsProperty {
      override fun bufferMsec(): Number? = unwrap(this).getBufferMsec()

      override fun containerSettings(): Any? = unwrap(this).getContainerSettings()

      override fun destination(): Any? = unwrap(this).getDestination()

      override fun fecOutputSettings(): Any? = unwrap(this).getFecOutputSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UdpOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty):
          UdpOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UdpOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.UdpOutputSettingsProperty
    }
  }

  public interface DvbTdtSettingsProperty {
    public fun repInterval(): Number? = unwrap(this).getRepInterval()

    @CdkDslMarker
    public interface Builder {
      public fun repInterval(repInterval: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty.builder()

      override fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty,
    ) : CdkObject(cdkObject), DvbTdtSettingsProperty {
      override fun repInterval(): Number? = unwrap(this).getRepInterval()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DvbTdtSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty):
          DvbTdtSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbTdtSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty
    }
  }

  public interface AudioDolbyEDecodeProperty {
    public fun programSelection(): String? = unwrap(this).getProgramSelection()

    @CdkDslMarker
    public interface Builder {
      public fun programSelection(programSelection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty.builder()

      override fun programSelection(programSelection: String) {
        cdkBuilder.programSelection(programSelection)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty,
    ) : CdkObject(cdkObject), AudioDolbyEDecodeProperty {
      override fun programSelection(): String? = unwrap(this).getProgramSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioDolbyEDecodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty):
          AudioDolbyEDecodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioDolbyEDecodeProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDolbyEDecodeProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun ancillarySourceSettings(ancillarySourceSettings: IResolvable)

      public fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace4a48d7bddbc87ae7e74bf4826991eaaf5bf6f0356288c5588277551ecbe7e")
      public
          fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty.Builder.() -> Unit)

      public fun aribSourceSettings(aribSourceSettings: IResolvable)

      public fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b93ef36dc37fd94de3544d364ca1d2c9c1171053b73456ea794ebfb65cc9c64")
      public
          fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty.Builder.() -> Unit)

      public fun dvbSubSourceSettings(dvbSubSourceSettings: IResolvable)

      public fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cfd2c5cbfd735aaef94c13682637afcf8a76e47ac8d223c085a3248ce541ef1")
      public
          fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty.Builder.() -> Unit)

      public fun embeddedSourceSettings(embeddedSourceSettings: IResolvable)

      public fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcb575a2e4a1bf74140f84e26c415021cfd67799c5ba8b95ca7fa2367dbc605b")
      public
          fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty.Builder.() -> Unit)

      public fun scte20SourceSettings(scte20SourceSettings: IResolvable)

      public fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5602799ca43989f5875f463abe9e8a33a56f5263a515772a0ac402c8b846c41c")
      public
          fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty.Builder.() -> Unit)

      public fun scte27SourceSettings(scte27SourceSettings: IResolvable)

      public fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a15d9c6d5a666cc65469dcfc7cd925e9b80a9440f6498bc85f185f66ac8ec7")
      public
          fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty.Builder.() -> Unit)

      public fun teletextSourceSettings(teletextSourceSettings: IResolvable)

      public fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5194196ebc9a57e0ce6d3a571e20026bbed3b5ef8624f29ac481c202bdbd44ab")
      public
          fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty.builder()

      override fun ancillarySourceSettings(ancillarySourceSettings: IResolvable) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings.let(IResolvable::unwrap))
      }

      override
          fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings.let(AncillarySourceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ace4a48d7bddbc87ae7e74bf4826991eaaf5bf6f0356288c5588277551ecbe7e")
      override
          fun ancillarySourceSettings(ancillarySourceSettings: AncillarySourceSettingsProperty.Builder.() -> Unit):
          Unit = ancillarySourceSettings(AncillarySourceSettingsProperty(ancillarySourceSettings))

      override fun aribSourceSettings(aribSourceSettings: IResolvable) {
        cdkBuilder.aribSourceSettings(aribSourceSettings.let(IResolvable::unwrap))
      }

      override fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty) {
        cdkBuilder.aribSourceSettings(aribSourceSettings.let(AribSourceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b93ef36dc37fd94de3544d364ca1d2c9c1171053b73456ea794ebfb65cc9c64")
      override
          fun aribSourceSettings(aribSourceSettings: AribSourceSettingsProperty.Builder.() -> Unit):
          Unit = aribSourceSettings(AribSourceSettingsProperty(aribSourceSettings))

      override fun dvbSubSourceSettings(dvbSubSourceSettings: IResolvable) {
        cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings.let(IResolvable::unwrap))
      }

      override fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty) {
        cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings.let(DvbSubSourceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cfd2c5cbfd735aaef94c13682637afcf8a76e47ac8d223c085a3248ce541ef1")
      override
          fun dvbSubSourceSettings(dvbSubSourceSettings: DvbSubSourceSettingsProperty.Builder.() -> Unit):
          Unit = dvbSubSourceSettings(DvbSubSourceSettingsProperty(dvbSubSourceSettings))

      override fun embeddedSourceSettings(embeddedSourceSettings: IResolvable) {
        cdkBuilder.embeddedSourceSettings(embeddedSourceSettings.let(IResolvable::unwrap))
      }

      override fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty) {
        cdkBuilder.embeddedSourceSettings(embeddedSourceSettings.let(EmbeddedSourceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcb575a2e4a1bf74140f84e26c415021cfd67799c5ba8b95ca7fa2367dbc605b")
      override
          fun embeddedSourceSettings(embeddedSourceSettings: EmbeddedSourceSettingsProperty.Builder.() -> Unit):
          Unit = embeddedSourceSettings(EmbeddedSourceSettingsProperty(embeddedSourceSettings))

      override fun scte20SourceSettings(scte20SourceSettings: IResolvable) {
        cdkBuilder.scte20SourceSettings(scte20SourceSettings.let(IResolvable::unwrap))
      }

      override fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty) {
        cdkBuilder.scte20SourceSettings(scte20SourceSettings.let(Scte20SourceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5602799ca43989f5875f463abe9e8a33a56f5263a515772a0ac402c8b846c41c")
      override
          fun scte20SourceSettings(scte20SourceSettings: Scte20SourceSettingsProperty.Builder.() -> Unit):
          Unit = scte20SourceSettings(Scte20SourceSettingsProperty(scte20SourceSettings))

      override fun scte27SourceSettings(scte27SourceSettings: IResolvable) {
        cdkBuilder.scte27SourceSettings(scte27SourceSettings.let(IResolvable::unwrap))
      }

      override fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty) {
        cdkBuilder.scte27SourceSettings(scte27SourceSettings.let(Scte27SourceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a15d9c6d5a666cc65469dcfc7cd925e9b80a9440f6498bc85f185f66ac8ec7")
      override
          fun scte27SourceSettings(scte27SourceSettings: Scte27SourceSettingsProperty.Builder.() -> Unit):
          Unit = scte27SourceSettings(Scte27SourceSettingsProperty(scte27SourceSettings))

      override fun teletextSourceSettings(teletextSourceSettings: IResolvable) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings.let(IResolvable::unwrap))
      }

      override fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings.let(TeletextSourceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5194196ebc9a57e0ce6d3a571e20026bbed3b5ef8624f29ac481c202bdbd44ab")
      override
          fun teletextSourceSettings(teletextSourceSettings: TeletextSourceSettingsProperty.Builder.() -> Unit):
          Unit = teletextSourceSettings(TeletextSourceSettingsProperty(teletextSourceSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty,
    ) : CdkObject(cdkObject), CaptionSelectorSettingsProperty {
      override fun ancillarySourceSettings(): Any? = unwrap(this).getAncillarySourceSettings()

      override fun aribSourceSettings(): Any? = unwrap(this).getAribSourceSettings()

      override fun dvbSubSourceSettings(): Any? = unwrap(this).getDvbSubSourceSettings()

      override fun embeddedSourceSettings(): Any? = unwrap(this).getEmbeddedSourceSettings()

      override fun scte20SourceSettings(): Any? = unwrap(this).getScte20SourceSettings()

      override fun scte27SourceSettings(): Any? = unwrap(this).getScte27SourceSettings()

      override fun teletextSourceSettings(): Any? = unwrap(this).getTeletextSourceSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionSelectorSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty):
          CaptionSelectorSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionSelectorSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty
    }
  }

  public interface ArchiveS3SettingsProperty {
    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    @CdkDslMarker
    public interface Builder {
      public fun cannedAcl(cannedAcl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty.builder()

      override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty,
    ) : CdkObject(cdkObject), ArchiveS3SettingsProperty {
      override fun cannedAcl(): String? = unwrap(this).getCannedAcl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveS3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty):
          ArchiveS3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveS3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun bitrate(bitrate: Number)

      public fun codingMode(codingMode: String)

      public fun inputType(inputType: String)

      public fun profile(profile: String)

      public fun rateControlMode(rateControlMode: String)

      public fun rawFormat(rawFormat: String)

      public fun sampleRate(sampleRate: Number)

      public fun spec(spec: String)

      public fun vbrQuality(vbrQuality: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty.builder()

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      override fun inputType(inputType: String) {
        cdkBuilder.inputType(inputType)
      }

      override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      override fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
      }

      override fun rawFormat(rawFormat: String) {
        cdkBuilder.rawFormat(rawFormat)
      }

      override fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
      }

      override fun spec(spec: String) {
        cdkBuilder.spec(spec)
      }

      override fun vbrQuality(vbrQuality: String) {
        cdkBuilder.vbrQuality(vbrQuality)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty,
    ) : CdkObject(cdkObject), AacSettingsProperty {
      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun codingMode(): String? = unwrap(this).getCodingMode()

      override fun inputType(): String? = unwrap(this).getInputType()

      override fun profile(): String? = unwrap(this).getProfile()

      override fun rateControlMode(): String? = unwrap(this).getRateControlMode()

      override fun rawFormat(): String? = unwrap(this).getRawFormat()

      override fun sampleRate(): Number? = unwrap(this).getSampleRate()

      override fun spec(): String? = unwrap(this).getSpec()

      override fun vbrQuality(): String? = unwrap(this).getVbrQuality()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AacSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty):
          AacSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AacSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adaptiveQuantization(adaptiveQuantization: String)

      public fun afdSignaling(afdSignaling: String)

      public fun alternativeTransferFunction(alternativeTransferFunction: String)

      public fun bitrate(bitrate: Number)

      public fun bufSize(bufSize: Number)

      public fun colorMetadata(colorMetadata: String)

      public fun colorSpaceSettings(colorSpaceSettings: IResolvable)

      public fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22b5ddf68b7d0a76417cb7aa87c2962ef416eb8ee445b05fc707a427ba970267")
      public
          fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty.Builder.() -> Unit)

      public fun filterSettings(filterSettings: IResolvable)

      public fun filterSettings(filterSettings: H265FilterSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b1a86e61ef9760f486b657eb28e69c07d1c4f58d8b4b48025f01936218d6947")
      public fun filterSettings(filterSettings: H265FilterSettingsProperty.Builder.() -> Unit)

      public fun fixedAfd(fixedAfd: String)

      public fun flickerAq(flickerAq: String)

      public fun framerateDenominator(framerateDenominator: Number)

      public fun framerateNumerator(framerateNumerator: Number)

      public fun gopClosedCadence(gopClosedCadence: Number)

      public fun gopSize(gopSize: Number)

      public fun gopSizeUnits(gopSizeUnits: String)

      public fun level(level: String)

      public fun lookAheadRateControl(lookAheadRateControl: String)

      public fun maxBitrate(maxBitrate: Number)

      public fun minIInterval(minIInterval: Number)

      public fun parDenominator(parDenominator: Number)

      public fun parNumerator(parNumerator: Number)

      public fun profile(profile: String)

      public fun qvbrQualityLevel(qvbrQualityLevel: Number)

      public fun rateControlMode(rateControlMode: String)

      public fun scanType(scanType: String)

      public fun sceneChangeDetect(sceneChangeDetect: String)

      public fun slices(slices: Number)

      public fun tier(tier: String)

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable)

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04610e4a9dbce0540320e1fc4806b5539e5ba8c856e69ea2953f7f2cdd2780a1")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit)

      public fun timecodeInsertion(timecodeInsertion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty.builder()

      override fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
      }

      override fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
      }

      override fun alternativeTransferFunction(alternativeTransferFunction: String) {
        cdkBuilder.alternativeTransferFunction(alternativeTransferFunction)
      }

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun bufSize(bufSize: Number) {
        cdkBuilder.bufSize(bufSize)
      }

      override fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
      }

      override fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(IResolvable::unwrap))
      }

      override fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(H265ColorSpaceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22b5ddf68b7d0a76417cb7aa87c2962ef416eb8ee445b05fc707a427ba970267")
      override
          fun colorSpaceSettings(colorSpaceSettings: H265ColorSpaceSettingsProperty.Builder.() -> Unit):
          Unit = colorSpaceSettings(H265ColorSpaceSettingsProperty(colorSpaceSettings))

      override fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings.let(IResolvable::unwrap))
      }

      override fun filterSettings(filterSettings: H265FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings.let(H265FilterSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b1a86e61ef9760f486b657eb28e69c07d1c4f58d8b4b48025f01936218d6947")
      override fun filterSettings(filterSettings: H265FilterSettingsProperty.Builder.() -> Unit):
          Unit = filterSettings(H265FilterSettingsProperty(filterSettings))

      override fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
      }

      override fun flickerAq(flickerAq: String) {
        cdkBuilder.flickerAq(flickerAq)
      }

      override fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
      }

      override fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
      }

      override fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
      }

      override fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
      }

      override fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
      }

      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      override fun lookAheadRateControl(lookAheadRateControl: String) {
        cdkBuilder.lookAheadRateControl(lookAheadRateControl)
      }

      override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      override fun minIInterval(minIInterval: Number) {
        cdkBuilder.minIInterval(minIInterval)
      }

      override fun parDenominator(parDenominator: Number) {
        cdkBuilder.parDenominator(parDenominator)
      }

      override fun parNumerator(parNumerator: Number) {
        cdkBuilder.parNumerator(parNumerator)
      }

      override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      override fun qvbrQualityLevel(qvbrQualityLevel: Number) {
        cdkBuilder.qvbrQualityLevel(qvbrQualityLevel)
      }

      override fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
      }

      override fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
      }

      override fun sceneChangeDetect(sceneChangeDetect: String) {
        cdkBuilder.sceneChangeDetect(sceneChangeDetect)
      }

      override fun slices(slices: Number) {
        cdkBuilder.slices(slices)
      }

      override fun tier(tier: String) {
        cdkBuilder.tier(tier)
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04610e4a9dbce0540320e1fc4806b5539e5ba8c856e69ea2953f7f2cdd2780a1")
      override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      override fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty,
    ) : CdkObject(cdkObject), H265SettingsProperty {
      override fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

      override fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

      override fun alternativeTransferFunction(): String? =
          unwrap(this).getAlternativeTransferFunction()

      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun bufSize(): Number? = unwrap(this).getBufSize()

      override fun colorMetadata(): String? = unwrap(this).getColorMetadata()

      override fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

      override fun filterSettings(): Any? = unwrap(this).getFilterSettings()

      override fun fixedAfd(): String? = unwrap(this).getFixedAfd()

      override fun flickerAq(): String? = unwrap(this).getFlickerAq()

      override fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

      override fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

      override fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

      override fun gopSize(): Number? = unwrap(this).getGopSize()

      override fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

      override fun level(): String? = unwrap(this).getLevel()

      override fun lookAheadRateControl(): String? = unwrap(this).getLookAheadRateControl()

      override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

      override fun minIInterval(): Number? = unwrap(this).getMinIInterval()

      override fun parDenominator(): Number? = unwrap(this).getParDenominator()

      override fun parNumerator(): Number? = unwrap(this).getParNumerator()

      override fun profile(): String? = unwrap(this).getProfile()

      override fun qvbrQualityLevel(): Number? = unwrap(this).getQvbrQualityLevel()

      override fun rateControlMode(): String? = unwrap(this).getRateControlMode()

      override fun scanType(): String? = unwrap(this).getScanType()

      override fun sceneChangeDetect(): String? = unwrap(this).getSceneChangeDetect()

      override fun slices(): Number? = unwrap(this).getSlices()

      override fun tier(): String? = unwrap(this).getTier()

      override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

      override fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): H265SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty):
          H265SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H265SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty
    }
  }

  public interface MultiplexGroupSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexGroupSettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty):
          MultiplexGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexGroupSettingsProperty
    }
  }

  public interface AvailBlankingProperty {
    public fun availBlankingImage(): Any? = unwrap(this).getAvailBlankingImage()

    public fun state(): String? = unwrap(this).getState()

    @CdkDslMarker
    public interface Builder {
      public fun availBlankingImage(availBlankingImage: IResolvable)

      public fun availBlankingImage(availBlankingImage: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac579c524f824b06d7349c8cced246b66e95444570e4303f02723bc77a6c9e68")
      public fun availBlankingImage(availBlankingImage: InputLocationProperty.Builder.() -> Unit)

      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty.builder()

      override fun availBlankingImage(availBlankingImage: IResolvable) {
        cdkBuilder.availBlankingImage(availBlankingImage.let(IResolvable::unwrap))
      }

      override fun availBlankingImage(availBlankingImage: InputLocationProperty) {
        cdkBuilder.availBlankingImage(availBlankingImage.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac579c524f824b06d7349c8cced246b66e95444570e4303f02723bc77a6c9e68")
      override fun availBlankingImage(availBlankingImage: InputLocationProperty.Builder.() -> Unit):
          Unit = availBlankingImage(InputLocationProperty(availBlankingImage))

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty,
    ) : CdkObject(cdkObject), AvailBlankingProperty {
      override fun availBlankingImage(): Any? = unwrap(this).getAvailBlankingImage()

      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AvailBlankingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty):
          AvailBlankingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AvailBlankingProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty
    }
  }

  public interface AudioLanguageSelectionProperty {
    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun languageSelectionPolicy(): String? = unwrap(this).getLanguageSelectionPolicy()

    @CdkDslMarker
    public interface Builder {
      public fun languageCode(languageCode: String)

      public fun languageSelectionPolicy(languageSelectionPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty.builder()

      override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      override fun languageSelectionPolicy(languageSelectionPolicy: String) {
        cdkBuilder.languageSelectionPolicy(languageSelectionPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty,
    ) : CdkObject(cdkObject), AudioLanguageSelectionProperty {
      override fun languageCode(): String? = unwrap(this).getLanguageCode()

      override fun languageSelectionPolicy(): String? = unwrap(this).getLanguageSelectionPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioLanguageSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty):
          AudioLanguageSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioLanguageSelectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty
    }
  }

  public interface InputChannelLevelProperty {
    public fun gain(): Number? = unwrap(this).getGain()

    public fun inputChannel(): Number? = unwrap(this).getInputChannel()

    @CdkDslMarker
    public interface Builder {
      public fun gain(gain: Number)

      public fun inputChannel(inputChannel: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty.builder()

      override fun gain(gain: Number) {
        cdkBuilder.gain(gain)
      }

      override fun inputChannel(inputChannel: Number) {
        cdkBuilder.inputChannel(inputChannel)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty,
    ) : CdkObject(cdkObject), InputChannelLevelProperty {
      override fun gain(): Number? = unwrap(this).getGain()

      override fun inputChannel(): Number? = unwrap(this).getInputChannel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputChannelLevelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty):
          InputChannelLevelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputChannelLevelProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.InputChannelLevelProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun absentInputAudioBehavior(absentInputAudioBehavior: String)

      public fun arib(arib: String)

      public fun aribCaptionsPid(aribCaptionsPid: String)

      public fun aribCaptionsPidControl(aribCaptionsPidControl: String)

      public fun audioBufferModel(audioBufferModel: String)

      public fun audioFramesPerPes(audioFramesPerPes: Number)

      public fun audioPids(audioPids: String)

      public fun audioStreamType(audioStreamType: String)

      public fun bitrate(bitrate: Number)

      public fun bufferModel(bufferModel: String)

      public fun ccDescriptor(ccDescriptor: String)

      public fun dvbNitSettings(dvbNitSettings: IResolvable)

      public fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f54fa6b4608e98d8aad0cbc872cd3872c1756045c8c6b6291d0df0ede0396d4")
      public fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty.Builder.() -> Unit)

      public fun dvbSdtSettings(dvbSdtSettings: IResolvable)

      public fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579bf1784c3c8a484a23bc2b64fea0c0481a64750412977246e839cbdc15314e")
      public fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty.Builder.() -> Unit)

      public fun dvbSubPids(dvbSubPids: String)

      public fun dvbTdtSettings(dvbTdtSettings: IResolvable)

      public fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d22f099001de97bf51423f044364514090d55e7972d8923c76aaa09cfed27dce")
      public fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty.Builder.() -> Unit)

      public fun dvbTeletextPid(dvbTeletextPid: String)

      public fun ebif(ebif: String)

      public fun ebpAudioInterval(ebpAudioInterval: String)

      public fun ebpLookaheadMs(ebpLookaheadMs: Number)

      public fun ebpPlacement(ebpPlacement: String)

      public fun ecmPid(ecmPid: String)

      public fun esRateInPes(esRateInPes: String)

      public fun etvPlatformPid(etvPlatformPid: String)

      public fun etvSignalPid(etvSignalPid: String)

      public fun fragmentTime(fragmentTime: Number)

      public fun klv(klv: String)

      public fun klvDataPids(klvDataPids: String)

      public fun nielsenId3Behavior(nielsenId3Behavior: String)

      public fun nullPacketBitrate(nullPacketBitrate: Number)

      public fun patInterval(patInterval: Number)

      public fun pcrControl(pcrControl: String)

      public fun pcrPeriod(pcrPeriod: Number)

      public fun pcrPid(pcrPid: String)

      public fun pmtInterval(pmtInterval: Number)

      public fun pmtPid(pmtPid: String)

      public fun programNum(programNum: Number)

      public fun rateMode(rateMode: String)

      public fun scte27Pids(scte27Pids: String)

      public fun scte35Control(scte35Control: String)

      public fun scte35Pid(scte35Pid: String)

      public fun scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds: Number)

      public fun segmentationMarkers(segmentationMarkers: String)

      public fun segmentationStyle(segmentationStyle: String)

      public fun segmentationTime(segmentationTime: Number)

      public fun timedMetadataBehavior(timedMetadataBehavior: String)

      public fun timedMetadataPid(timedMetadataPid: String)

      public fun transportStreamId(transportStreamId: Number)

      public fun videoPid(videoPid: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty.builder()

      override fun absentInputAudioBehavior(absentInputAudioBehavior: String) {
        cdkBuilder.absentInputAudioBehavior(absentInputAudioBehavior)
      }

      override fun arib(arib: String) {
        cdkBuilder.arib(arib)
      }

      override fun aribCaptionsPid(aribCaptionsPid: String) {
        cdkBuilder.aribCaptionsPid(aribCaptionsPid)
      }

      override fun aribCaptionsPidControl(aribCaptionsPidControl: String) {
        cdkBuilder.aribCaptionsPidControl(aribCaptionsPidControl)
      }

      override fun audioBufferModel(audioBufferModel: String) {
        cdkBuilder.audioBufferModel(audioBufferModel)
      }

      override fun audioFramesPerPes(audioFramesPerPes: Number) {
        cdkBuilder.audioFramesPerPes(audioFramesPerPes)
      }

      override fun audioPids(audioPids: String) {
        cdkBuilder.audioPids(audioPids)
      }

      override fun audioStreamType(audioStreamType: String) {
        cdkBuilder.audioStreamType(audioStreamType)
      }

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun bufferModel(bufferModel: String) {
        cdkBuilder.bufferModel(bufferModel)
      }

      override fun ccDescriptor(ccDescriptor: String) {
        cdkBuilder.ccDescriptor(ccDescriptor)
      }

      override fun dvbNitSettings(dvbNitSettings: IResolvable) {
        cdkBuilder.dvbNitSettings(dvbNitSettings.let(IResolvable::unwrap))
      }

      override fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty) {
        cdkBuilder.dvbNitSettings(dvbNitSettings.let(DvbNitSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f54fa6b4608e98d8aad0cbc872cd3872c1756045c8c6b6291d0df0ede0396d4")
      override fun dvbNitSettings(dvbNitSettings: DvbNitSettingsProperty.Builder.() -> Unit): Unit =
          dvbNitSettings(DvbNitSettingsProperty(dvbNitSettings))

      override fun dvbSdtSettings(dvbSdtSettings: IResolvable) {
        cdkBuilder.dvbSdtSettings(dvbSdtSettings.let(IResolvable::unwrap))
      }

      override fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty) {
        cdkBuilder.dvbSdtSettings(dvbSdtSettings.let(DvbSdtSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("579bf1784c3c8a484a23bc2b64fea0c0481a64750412977246e839cbdc15314e")
      override fun dvbSdtSettings(dvbSdtSettings: DvbSdtSettingsProperty.Builder.() -> Unit): Unit =
          dvbSdtSettings(DvbSdtSettingsProperty(dvbSdtSettings))

      override fun dvbSubPids(dvbSubPids: String) {
        cdkBuilder.dvbSubPids(dvbSubPids)
      }

      override fun dvbTdtSettings(dvbTdtSettings: IResolvable) {
        cdkBuilder.dvbTdtSettings(dvbTdtSettings.let(IResolvable::unwrap))
      }

      override fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty) {
        cdkBuilder.dvbTdtSettings(dvbTdtSettings.let(DvbTdtSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d22f099001de97bf51423f044364514090d55e7972d8923c76aaa09cfed27dce")
      override fun dvbTdtSettings(dvbTdtSettings: DvbTdtSettingsProperty.Builder.() -> Unit): Unit =
          dvbTdtSettings(DvbTdtSettingsProperty(dvbTdtSettings))

      override fun dvbTeletextPid(dvbTeletextPid: String) {
        cdkBuilder.dvbTeletextPid(dvbTeletextPid)
      }

      override fun ebif(ebif: String) {
        cdkBuilder.ebif(ebif)
      }

      override fun ebpAudioInterval(ebpAudioInterval: String) {
        cdkBuilder.ebpAudioInterval(ebpAudioInterval)
      }

      override fun ebpLookaheadMs(ebpLookaheadMs: Number) {
        cdkBuilder.ebpLookaheadMs(ebpLookaheadMs)
      }

      override fun ebpPlacement(ebpPlacement: String) {
        cdkBuilder.ebpPlacement(ebpPlacement)
      }

      override fun ecmPid(ecmPid: String) {
        cdkBuilder.ecmPid(ecmPid)
      }

      override fun esRateInPes(esRateInPes: String) {
        cdkBuilder.esRateInPes(esRateInPes)
      }

      override fun etvPlatformPid(etvPlatformPid: String) {
        cdkBuilder.etvPlatformPid(etvPlatformPid)
      }

      override fun etvSignalPid(etvSignalPid: String) {
        cdkBuilder.etvSignalPid(etvSignalPid)
      }

      override fun fragmentTime(fragmentTime: Number) {
        cdkBuilder.fragmentTime(fragmentTime)
      }

      override fun klv(klv: String) {
        cdkBuilder.klv(klv)
      }

      override fun klvDataPids(klvDataPids: String) {
        cdkBuilder.klvDataPids(klvDataPids)
      }

      override fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
      }

      override fun nullPacketBitrate(nullPacketBitrate: Number) {
        cdkBuilder.nullPacketBitrate(nullPacketBitrate)
      }

      override fun patInterval(patInterval: Number) {
        cdkBuilder.patInterval(patInterval)
      }

      override fun pcrControl(pcrControl: String) {
        cdkBuilder.pcrControl(pcrControl)
      }

      override fun pcrPeriod(pcrPeriod: Number) {
        cdkBuilder.pcrPeriod(pcrPeriod)
      }

      override fun pcrPid(pcrPid: String) {
        cdkBuilder.pcrPid(pcrPid)
      }

      override fun pmtInterval(pmtInterval: Number) {
        cdkBuilder.pmtInterval(pmtInterval)
      }

      override fun pmtPid(pmtPid: String) {
        cdkBuilder.pmtPid(pmtPid)
      }

      override fun programNum(programNum: Number) {
        cdkBuilder.programNum(programNum)
      }

      override fun rateMode(rateMode: String) {
        cdkBuilder.rateMode(rateMode)
      }

      override fun scte27Pids(scte27Pids: String) {
        cdkBuilder.scte27Pids(scte27Pids)
      }

      override fun scte35Control(scte35Control: String) {
        cdkBuilder.scte35Control(scte35Control)
      }

      override fun scte35Pid(scte35Pid: String) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      override fun scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds: Number) {
        cdkBuilder.scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds)
      }

      override fun segmentationMarkers(segmentationMarkers: String) {
        cdkBuilder.segmentationMarkers(segmentationMarkers)
      }

      override fun segmentationStyle(segmentationStyle: String) {
        cdkBuilder.segmentationStyle(segmentationStyle)
      }

      override fun segmentationTime(segmentationTime: Number) {
        cdkBuilder.segmentationTime(segmentationTime)
      }

      override fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
      }

      override fun timedMetadataPid(timedMetadataPid: String) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
      }

      override fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
      }

      override fun videoPid(videoPid: String) {
        cdkBuilder.videoPid(videoPid)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty,
    ) : CdkObject(cdkObject), M2tsSettingsProperty {
      override fun absentInputAudioBehavior(): String? = unwrap(this).getAbsentInputAudioBehavior()

      override fun arib(): String? = unwrap(this).getArib()

      override fun aribCaptionsPid(): String? = unwrap(this).getAribCaptionsPid()

      override fun aribCaptionsPidControl(): String? = unwrap(this).getAribCaptionsPidControl()

      override fun audioBufferModel(): String? = unwrap(this).getAudioBufferModel()

      override fun audioFramesPerPes(): Number? = unwrap(this).getAudioFramesPerPes()

      override fun audioPids(): String? = unwrap(this).getAudioPids()

      override fun audioStreamType(): String? = unwrap(this).getAudioStreamType()

      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun bufferModel(): String? = unwrap(this).getBufferModel()

      override fun ccDescriptor(): String? = unwrap(this).getCcDescriptor()

      override fun dvbNitSettings(): Any? = unwrap(this).getDvbNitSettings()

      override fun dvbSdtSettings(): Any? = unwrap(this).getDvbSdtSettings()

      override fun dvbSubPids(): String? = unwrap(this).getDvbSubPids()

      override fun dvbTdtSettings(): Any? = unwrap(this).getDvbTdtSettings()

      override fun dvbTeletextPid(): String? = unwrap(this).getDvbTeletextPid()

      override fun ebif(): String? = unwrap(this).getEbif()

      override fun ebpAudioInterval(): String? = unwrap(this).getEbpAudioInterval()

      override fun ebpLookaheadMs(): Number? = unwrap(this).getEbpLookaheadMs()

      override fun ebpPlacement(): String? = unwrap(this).getEbpPlacement()

      override fun ecmPid(): String? = unwrap(this).getEcmPid()

      override fun esRateInPes(): String? = unwrap(this).getEsRateInPes()

      override fun etvPlatformPid(): String? = unwrap(this).getEtvPlatformPid()

      override fun etvSignalPid(): String? = unwrap(this).getEtvSignalPid()

      override fun fragmentTime(): Number? = unwrap(this).getFragmentTime()

      override fun klv(): String? = unwrap(this).getKlv()

      override fun klvDataPids(): String? = unwrap(this).getKlvDataPids()

      override fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

      override fun nullPacketBitrate(): Number? = unwrap(this).getNullPacketBitrate()

      override fun patInterval(): Number? = unwrap(this).getPatInterval()

      override fun pcrControl(): String? = unwrap(this).getPcrControl()

      override fun pcrPeriod(): Number? = unwrap(this).getPcrPeriod()

      override fun pcrPid(): String? = unwrap(this).getPcrPid()

      override fun pmtInterval(): Number? = unwrap(this).getPmtInterval()

      override fun pmtPid(): String? = unwrap(this).getPmtPid()

      override fun programNum(): Number? = unwrap(this).getProgramNum()

      override fun rateMode(): String? = unwrap(this).getRateMode()

      override fun scte27Pids(): String? = unwrap(this).getScte27Pids()

      override fun scte35Control(): String? = unwrap(this).getScte35Control()

      override fun scte35Pid(): String? = unwrap(this).getScte35Pid()

      override fun scte35PrerollPullupMilliseconds(): Number? =
          unwrap(this).getScte35PrerollPullupMilliseconds()

      override fun segmentationMarkers(): String? = unwrap(this).getSegmentationMarkers()

      override fun segmentationStyle(): String? = unwrap(this).getSegmentationStyle()

      override fun segmentationTime(): Number? = unwrap(this).getSegmentationTime()

      override fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

      override fun timedMetadataPid(): String? = unwrap(this).getTimedMetadataPid()

      override fun transportStreamId(): Number? = unwrap(this).getTransportStreamId()

      override fun videoPid(): String? = unwrap(this).getVideoPid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): M2tsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty):
          M2tsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: M2tsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty
    }
  }

  public interface VpcOutputSettingsProperty {
    public fun publicAddressAllocationIds(): List<String> =
        unwrap(this).getPublicAddressAllocationIds() ?: emptyList()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun publicAddressAllocationIds(publicAddressAllocationIds: List<String>)

      public fun publicAddressAllocationIds(vararg publicAddressAllocationIds: String)

      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty.builder()

      override fun publicAddressAllocationIds(publicAddressAllocationIds: List<String>) {
        cdkBuilder.publicAddressAllocationIds(publicAddressAllocationIds)
      }

      override fun publicAddressAllocationIds(vararg publicAddressAllocationIds: String): Unit =
          publicAddressAllocationIds(publicAddressAllocationIds.toList())

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty,
    ) : CdkObject(cdkObject), VpcOutputSettingsProperty {
      override fun publicAddressAllocationIds(): List<String> =
          unwrap(this).getPublicAddressAllocationIds() ?: emptyList()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty):
          VpcOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty
    }
  }

  public interface AudioSilenceFailoverSettingsProperty {
    public fun audioSelectorName(): String? = unwrap(this).getAudioSelectorName()

    public fun audioSilenceThresholdMsec(): Number? = unwrap(this).getAudioSilenceThresholdMsec()

    @CdkDslMarker
    public interface Builder {
      public fun audioSelectorName(audioSelectorName: String)

      public fun audioSilenceThresholdMsec(audioSilenceThresholdMsec: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty.builder()

      override fun audioSelectorName(audioSelectorName: String) {
        cdkBuilder.audioSelectorName(audioSelectorName)
      }

      override fun audioSilenceThresholdMsec(audioSilenceThresholdMsec: Number) {
        cdkBuilder.audioSilenceThresholdMsec(audioSilenceThresholdMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty,
    ) : CdkObject(cdkObject), AudioSilenceFailoverSettingsProperty {
      override fun audioSelectorName(): String? = unwrap(this).getAudioSelectorName()

      override fun audioSilenceThresholdMsec(): Number? =
          unwrap(this).getAudioSilenceThresholdMsec()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty
    }
  }

  public interface ThumbnailConfigurationProperty {
    public fun state(): String? = unwrap(this).getState()

    @CdkDslMarker
    public interface Builder {
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty.builder()

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty,
    ) : CdkObject(cdkObject), ThumbnailConfigurationProperty {
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThumbnailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty):
          ThumbnailConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThumbnailConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ThumbnailConfigurationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adMarkers(adMarkers: List<String>)

      public fun adMarkers(vararg adMarkers: String)

      public fun authenticationScheme(authenticationScheme: String)

      public fun cacheFullBehavior(cacheFullBehavior: String)

      public fun cacheLength(cacheLength: Number)

      public fun captionData(captionData: String)

      public fun includeFillerNalUnits(includeFillerNalUnits: String)

      public fun inputLossAction(inputLossAction: String)

      public fun restartDelay(restartDelay: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty.builder()

      override fun adMarkers(adMarkers: List<String>) {
        cdkBuilder.adMarkers(adMarkers)
      }

      override fun adMarkers(vararg adMarkers: String): Unit = adMarkers(adMarkers.toList())

      override fun authenticationScheme(authenticationScheme: String) {
        cdkBuilder.authenticationScheme(authenticationScheme)
      }

      override fun cacheFullBehavior(cacheFullBehavior: String) {
        cdkBuilder.cacheFullBehavior(cacheFullBehavior)
      }

      override fun cacheLength(cacheLength: Number) {
        cdkBuilder.cacheLength(cacheLength)
      }

      override fun captionData(captionData: String) {
        cdkBuilder.captionData(captionData)
      }

      override fun includeFillerNalUnits(includeFillerNalUnits: String) {
        cdkBuilder.includeFillerNalUnits(includeFillerNalUnits)
      }

      override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty,
    ) : CdkObject(cdkObject), RtmpGroupSettingsProperty {
      override fun adMarkers(): List<String> = unwrap(this).getAdMarkers() ?: emptyList()

      override fun authenticationScheme(): String? = unwrap(this).getAuthenticationScheme()

      override fun cacheFullBehavior(): String? = unwrap(this).getCacheFullBehavior()

      override fun cacheLength(): Number? = unwrap(this).getCacheLength()

      override fun captionData(): String? = unwrap(this).getCaptionData()

      override fun includeFillerNalUnits(): String? = unwrap(this).getIncludeFillerNalUnits()

      override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      override fun restartDelay(): Number? = unwrap(this).getRestartDelay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RtmpGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty):
          RtmpGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RtmpGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty
    }
  }

  public interface Rec709SettingsProperty {
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty,
    ) : CdkObject(cdkObject), Rec709SettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Rec709SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty):
          Rec709SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Rec709SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun aribDestinationSettings(aribDestinationSettings: IResolvable)

      public fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9924425c9a3a1b178f1a0a461ae690ba282649b6b96300d474bf7e78f01160cb")
      public
          fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty.Builder.() -> Unit)

      public fun burnInDestinationSettings(burnInDestinationSettings: IResolvable)

      public
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ab6db43caec45221944294f84565ddf5860051552bce6ec66c12ba63154755")
      public
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty.Builder.() -> Unit)

      public fun dvbSubDestinationSettings(dvbSubDestinationSettings: IResolvable)

      public
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfd24d60c5cf9a28eed30c83dc757a614b6bf038e55c065ef282f49768a0be59")
      public
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty.Builder.() -> Unit)

      public fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: IResolvable)

      public
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc852a803c72bf30f5a1f47db88388014afb7d236a5d33e491f1b4c301cee6f")
      public
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty.Builder.() -> Unit)

      public fun embeddedDestinationSettings(embeddedDestinationSettings: IResolvable)

      public
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ef1e9387047b8b7c83b7cb13467485cd2fe653e2e1eb711c5b0fe251ca08625")
      public
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty.Builder.() -> Unit)

      public
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: IResolvable)

      public
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00c9aa9109abee9fd7fca8eed5ca2f69850bd750fdbd7ea198da53801e1bf82d")
      public
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty.Builder.() -> Unit)

      public fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: IResolvable)

      public
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a1fac1026402dc57b1fa40332a62e214f03036b60c3fb7f639cb262bbd0470c")
      public
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty.Builder.() -> Unit)

      public
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: IResolvable)

      public
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c84eecbc71f5512a0981a731885258bcab29da3ae2d77ced74466733c8f24434")
      public
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty.Builder.() -> Unit)

      public fun scte27DestinationSettings(scte27DestinationSettings: IResolvable)

      public
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b0fe46cfbd068efea72762170dc6fd899d94d5613734d7956a12e474be2812")
      public
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty.Builder.() -> Unit)

      public fun smpteTtDestinationSettings(smpteTtDestinationSettings: IResolvable)

      public
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("243045e0056e48ab19cf97a16552e087ace3d96f0dc98c05c4b8783ae61bcb27")
      public
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty.Builder.() -> Unit)

      public fun teletextDestinationSettings(teletextDestinationSettings: IResolvable)

      public
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24fd78b59fa8b08238a4a3e1d5900a72b01abfcbedecdbb73c299f211e69a3d7")
      public
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty.Builder.() -> Unit)

      public fun ttmlDestinationSettings(ttmlDestinationSettings: IResolvable)

      public fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7733463d00c11736790e121b842e4098cccac26d8b6d55e6f6667e37c9b982ca")
      public
          fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty.Builder.() -> Unit)

      public fun webvttDestinationSettings(webvttDestinationSettings: IResolvable)

      public
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9bb9d0998adbfbe443b42629ccfcaa9e8cb937c88d156d6f9c9afda12e867cc5")
      public
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty.builder()

      override fun aribDestinationSettings(aribDestinationSettings: IResolvable) {
        cdkBuilder.aribDestinationSettings(aribDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty) {
        cdkBuilder.aribDestinationSettings(aribDestinationSettings.let(AribDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9924425c9a3a1b178f1a0a461ae690ba282649b6b96300d474bf7e78f01160cb")
      override
          fun aribDestinationSettings(aribDestinationSettings: AribDestinationSettingsProperty.Builder.() -> Unit):
          Unit = aribDestinationSettings(AribDestinationSettingsProperty(aribDestinationSettings))

      override fun burnInDestinationSettings(burnInDestinationSettings: IResolvable) {
        cdkBuilder.burnInDestinationSettings(burnInDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty) {
        cdkBuilder.burnInDestinationSettings(burnInDestinationSettings.let(BurnInDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ab6db43caec45221944294f84565ddf5860051552bce6ec66c12ba63154755")
      override
          fun burnInDestinationSettings(burnInDestinationSettings: BurnInDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          burnInDestinationSettings(BurnInDestinationSettingsProperty(burnInDestinationSettings))

      override fun dvbSubDestinationSettings(dvbSubDestinationSettings: IResolvable) {
        cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty) {
        cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings.let(DvbSubDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfd24d60c5cf9a28eed30c83dc757a614b6bf038e55c065ef282f49768a0be59")
      override
          fun dvbSubDestinationSettings(dvbSubDestinationSettings: DvbSubDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          dvbSubDestinationSettings(DvbSubDestinationSettingsProperty(dvbSubDestinationSettings))

      override fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: IResolvable) {
        cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty) {
        cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings.let(EbuTtDDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cc852a803c72bf30f5a1f47db88388014afb7d236a5d33e491f1b4c301cee6f")
      override
          fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: EbuTtDDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          ebuTtDDestinationSettings(EbuTtDDestinationSettingsProperty(ebuTtDDestinationSettings))

      override fun embeddedDestinationSettings(embeddedDestinationSettings: IResolvable) {
        cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty) {
        cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings.let(EmbeddedDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ef1e9387047b8b7c83b7cb13467485cd2fe653e2e1eb711c5b0fe251ca08625")
      override
          fun embeddedDestinationSettings(embeddedDestinationSettings: EmbeddedDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          embeddedDestinationSettings(EmbeddedDestinationSettingsProperty(embeddedDestinationSettings))

      override
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: IResolvable) {
        cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty) {
        cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings.let(EmbeddedPlusScte20DestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00c9aa9109abee9fd7fca8eed5ca2f69850bd750fdbd7ea198da53801e1bf82d")
      override
          fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          embeddedPlusScte20DestinationSettings(EmbeddedPlusScte20DestinationSettingsProperty(embeddedPlusScte20DestinationSettings))

      override
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: IResolvable) {
        cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty) {
        cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings.let(RtmpCaptionInfoDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a1fac1026402dc57b1fa40332a62e214f03036b60c3fb7f639cb262bbd0470c")
      override
          fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          rtmpCaptionInfoDestinationSettings(RtmpCaptionInfoDestinationSettingsProperty(rtmpCaptionInfoDestinationSettings))

      override
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: IResolvable) {
        cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty) {
        cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings.let(Scte20PlusEmbeddedDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c84eecbc71f5512a0981a731885258bcab29da3ae2d77ced74466733c8f24434")
      override
          fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          scte20PlusEmbeddedDestinationSettings(Scte20PlusEmbeddedDestinationSettingsProperty(scte20PlusEmbeddedDestinationSettings))

      override fun scte27DestinationSettings(scte27DestinationSettings: IResolvable) {
        cdkBuilder.scte27DestinationSettings(scte27DestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty) {
        cdkBuilder.scte27DestinationSettings(scte27DestinationSettings.let(Scte27DestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b0fe46cfbd068efea72762170dc6fd899d94d5613734d7956a12e474be2812")
      override
          fun scte27DestinationSettings(scte27DestinationSettings: Scte27DestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          scte27DestinationSettings(Scte27DestinationSettingsProperty(scte27DestinationSettings))

      override fun smpteTtDestinationSettings(smpteTtDestinationSettings: IResolvable) {
        cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty) {
        cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings.let(SmpteTtDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("243045e0056e48ab19cf97a16552e087ace3d96f0dc98c05c4b8783ae61bcb27")
      override
          fun smpteTtDestinationSettings(smpteTtDestinationSettings: SmpteTtDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          smpteTtDestinationSettings(SmpteTtDestinationSettingsProperty(smpteTtDestinationSettings))

      override fun teletextDestinationSettings(teletextDestinationSettings: IResolvable) {
        cdkBuilder.teletextDestinationSettings(teletextDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty) {
        cdkBuilder.teletextDestinationSettings(teletextDestinationSettings.let(TeletextDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24fd78b59fa8b08238a4a3e1d5900a72b01abfcbedecdbb73c299f211e69a3d7")
      override
          fun teletextDestinationSettings(teletextDestinationSettings: TeletextDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          teletextDestinationSettings(TeletextDestinationSettingsProperty(teletextDestinationSettings))

      override fun ttmlDestinationSettings(ttmlDestinationSettings: IResolvable) {
        cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty) {
        cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings.let(TtmlDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7733463d00c11736790e121b842e4098cccac26d8b6d55e6f6667e37c9b982ca")
      override
          fun ttmlDestinationSettings(ttmlDestinationSettings: TtmlDestinationSettingsProperty.Builder.() -> Unit):
          Unit = ttmlDestinationSettings(TtmlDestinationSettingsProperty(ttmlDestinationSettings))

      override fun webvttDestinationSettings(webvttDestinationSettings: IResolvable) {
        cdkBuilder.webvttDestinationSettings(webvttDestinationSettings.let(IResolvable::unwrap))
      }

      override
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty) {
        cdkBuilder.webvttDestinationSettings(webvttDestinationSettings.let(WebvttDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9bb9d0998adbfbe443b42629ccfcaa9e8cb937c88d156d6f9c9afda12e867cc5")
      override
          fun webvttDestinationSettings(webvttDestinationSettings: WebvttDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          webvttDestinationSettings(WebvttDestinationSettingsProperty(webvttDestinationSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty,
    ) : CdkObject(cdkObject), CaptionDestinationSettingsProperty {
      override fun aribDestinationSettings(): Any? = unwrap(this).getAribDestinationSettings()

      override fun burnInDestinationSettings(): Any? = unwrap(this).getBurnInDestinationSettings()

      override fun dvbSubDestinationSettings(): Any? = unwrap(this).getDvbSubDestinationSettings()

      override fun ebuTtDDestinationSettings(): Any? = unwrap(this).getEbuTtDDestinationSettings()

      override fun embeddedDestinationSettings(): Any? =
          unwrap(this).getEmbeddedDestinationSettings()

      override fun embeddedPlusScte20DestinationSettings(): Any? =
          unwrap(this).getEmbeddedPlusScte20DestinationSettings()

      override fun rtmpCaptionInfoDestinationSettings(): Any? =
          unwrap(this).getRtmpCaptionInfoDestinationSettings()

      override fun scte20PlusEmbeddedDestinationSettings(): Any? =
          unwrap(this).getScte20PlusEmbeddedDestinationSettings()

      override fun scte27DestinationSettings(): Any? = unwrap(this).getScte27DestinationSettings()

      override fun smpteTtDestinationSettings(): Any? = unwrap(this).getSmpteTtDestinationSettings()

      override fun teletextDestinationSettings(): Any? =
          unwrap(this).getTeletextDestinationSettings()

      override fun ttmlDestinationSettings(): Any? = unwrap(this).getTtmlDestinationSettings()

      override fun webvttDestinationSettings(): Any? = unwrap(this).getWebvttDestinationSettings()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty
    }
  }

  public interface AvailSettingsProperty {
    public fun esam(): Any? = unwrap(this).getEsam()

    public fun scte35SpliceInsert(): Any? = unwrap(this).getScte35SpliceInsert()

    public fun scte35TimeSignalApos(): Any? = unwrap(this).getScte35TimeSignalApos()

    @CdkDslMarker
    public interface Builder {
      public fun esam(esam: IResolvable)

      public fun esam(esam: EsamProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed5f7c3bb0f2db73506c673ced941f1e87182447d144dcfe09b998539a44844a")
      public fun esam(esam: EsamProperty.Builder.() -> Unit)

      public fun scte35SpliceInsert(scte35SpliceInsert: IResolvable)

      public fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867a67f52a8d8ab533710c200e2111aedee7f3a666d2206c424e528d79e97be0")
      public
          fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty.Builder.() -> Unit)

      public fun scte35TimeSignalApos(scte35TimeSignalApos: IResolvable)

      public fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fbccce3e31010e4a4409f84ad95318d6008e84ec33652c390db519b8a021152")
      public
          fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty.builder()

      override fun esam(esam: IResolvable) {
        cdkBuilder.esam(esam.let(IResolvable::unwrap))
      }

      override fun esam(esam: EsamProperty) {
        cdkBuilder.esam(esam.let(EsamProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed5f7c3bb0f2db73506c673ced941f1e87182447d144dcfe09b998539a44844a")
      override fun esam(esam: EsamProperty.Builder.() -> Unit): Unit = esam(EsamProperty(esam))

      override fun scte35SpliceInsert(scte35SpliceInsert: IResolvable) {
        cdkBuilder.scte35SpliceInsert(scte35SpliceInsert.let(IResolvable::unwrap))
      }

      override fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty) {
        cdkBuilder.scte35SpliceInsert(scte35SpliceInsert.let(Scte35SpliceInsertProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("867a67f52a8d8ab533710c200e2111aedee7f3a666d2206c424e528d79e97be0")
      override
          fun scte35SpliceInsert(scte35SpliceInsert: Scte35SpliceInsertProperty.Builder.() -> Unit):
          Unit = scte35SpliceInsert(Scte35SpliceInsertProperty(scte35SpliceInsert))

      override fun scte35TimeSignalApos(scte35TimeSignalApos: IResolvable) {
        cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos.let(IResolvable::unwrap))
      }

      override fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty) {
        cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos.let(Scte35TimeSignalAposProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fbccce3e31010e4a4409f84ad95318d6008e84ec33652c390db519b8a021152")
      override
          fun scte35TimeSignalApos(scte35TimeSignalApos: Scte35TimeSignalAposProperty.Builder.() -> Unit):
          Unit = scte35TimeSignalApos(Scte35TimeSignalAposProperty(scte35TimeSignalApos))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty,
    ) : CdkObject(cdkObject), AvailSettingsProperty {
      override fun esam(): Any? = unwrap(this).getEsam()

      override fun scte35SpliceInsert(): Any? = unwrap(this).getScte35SpliceInsert()

      override fun scte35TimeSignalApos(): Any? = unwrap(this).getScte35TimeSignalApos()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AvailSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty):
          AvailSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AvailSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty
    }
  }

  public interface EmbeddedPlusScte20DestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty,
    ) : CdkObject(cdkObject), EmbeddedPlusScte20DestinationSettingsProperty

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty
    }
  }

  public interface OutputDestinationProperty {
    public fun id(): String? = unwrap(this).getId()

    public fun mediaPackageSettings(): Any? = unwrap(this).getMediaPackageSettings()

    public fun multiplexSettings(): Any? = unwrap(this).getMultiplexSettings()

    public fun settings(): Any? = unwrap(this).getSettings()

    @CdkDslMarker
    public interface Builder {
      public fun id(id: String)

      public fun mediaPackageSettings(mediaPackageSettings: IResolvable)

      public fun mediaPackageSettings(mediaPackageSettings: List<Any>)

      public fun mediaPackageSettings(vararg mediaPackageSettings: Any)

      public fun multiplexSettings(multiplexSettings: IResolvable)

      public
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece15e037ba8cc31b632e08040e50a80980271794019a29ab98417858d8a4fed")
      public
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty.Builder.() -> Unit)

      public fun tings(settings: IResolvable)

      public fun tings(settings: List<Any>)

      public fun tings(vararg settings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun mediaPackageSettings(mediaPackageSettings: IResolvable) {
        cdkBuilder.mediaPackageSettings(mediaPackageSettings.let(IResolvable::unwrap))
      }

      override fun mediaPackageSettings(mediaPackageSettings: List<Any>) {
        cdkBuilder.mediaPackageSettings(mediaPackageSettings)
      }

      override fun mediaPackageSettings(vararg mediaPackageSettings: Any): Unit =
          mediaPackageSettings(mediaPackageSettings.toList())

      override fun multiplexSettings(multiplexSettings: IResolvable) {
        cdkBuilder.multiplexSettings(multiplexSettings.let(IResolvable::unwrap))
      }

      override
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty) {
        cdkBuilder.multiplexSettings(multiplexSettings.let(MultiplexProgramChannelDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ece15e037ba8cc31b632e08040e50a80980271794019a29ab98417858d8a4fed")
      override
          fun multiplexSettings(multiplexSettings: MultiplexProgramChannelDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          multiplexSettings(MultiplexProgramChannelDestinationSettingsProperty(multiplexSettings))

      override fun tings(settings: IResolvable) {
        cdkBuilder.settings(settings.let(IResolvable::unwrap))
      }

      override fun tings(settings: List<Any>) {
        cdkBuilder.settings(settings)
      }

      override fun tings(vararg settings: Any): Unit = tings(settings.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty,
    ) : CdkObject(cdkObject), OutputDestinationProperty {
      override fun id(): String? = unwrap(this).getId()

      override fun mediaPackageSettings(): Any? = unwrap(this).getMediaPackageSettings()

      override fun multiplexSettings(): Any? = unwrap(this).getMultiplexSettings()

      override fun settings(): Any? = unwrap(this).getSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty):
          OutputDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputDestinationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationProperty
    }
  }

  public interface InputLossBehaviorProperty {
    public fun blackFrameMsec(): Number? = unwrap(this).getBlackFrameMsec()

    public fun inputLossImageColor(): String? = unwrap(this).getInputLossImageColor()

    public fun inputLossImageSlate(): Any? = unwrap(this).getInputLossImageSlate()

    public fun inputLossImageType(): String? = unwrap(this).getInputLossImageType()

    public fun repeatFrameMsec(): Number? = unwrap(this).getRepeatFrameMsec()

    @CdkDslMarker
    public interface Builder {
      public fun blackFrameMsec(blackFrameMsec: Number)

      public fun inputLossImageColor(inputLossImageColor: String)

      public fun inputLossImageSlate(inputLossImageSlate: IResolvable)

      public fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cfe8d542c52f225e2cb0f83322cf9508c28c73c9ed3281eee1e25d0c8b197fc")
      public fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty.Builder.() -> Unit)

      public fun inputLossImageType(inputLossImageType: String)

      public fun repeatFrameMsec(repeatFrameMsec: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty.builder()

      override fun blackFrameMsec(blackFrameMsec: Number) {
        cdkBuilder.blackFrameMsec(blackFrameMsec)
      }

      override fun inputLossImageColor(inputLossImageColor: String) {
        cdkBuilder.inputLossImageColor(inputLossImageColor)
      }

      override fun inputLossImageSlate(inputLossImageSlate: IResolvable) {
        cdkBuilder.inputLossImageSlate(inputLossImageSlate.let(IResolvable::unwrap))
      }

      override fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty) {
        cdkBuilder.inputLossImageSlate(inputLossImageSlate.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cfe8d542c52f225e2cb0f83322cf9508c28c73c9ed3281eee1e25d0c8b197fc")
      override
          fun inputLossImageSlate(inputLossImageSlate: InputLocationProperty.Builder.() -> Unit):
          Unit = inputLossImageSlate(InputLocationProperty(inputLossImageSlate))

      override fun inputLossImageType(inputLossImageType: String) {
        cdkBuilder.inputLossImageType(inputLossImageType)
      }

      override fun repeatFrameMsec(repeatFrameMsec: Number) {
        cdkBuilder.repeatFrameMsec(repeatFrameMsec)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty,
    ) : CdkObject(cdkObject), InputLossBehaviorProperty {
      override fun blackFrameMsec(): Number? = unwrap(this).getBlackFrameMsec()

      override fun inputLossImageColor(): String? = unwrap(this).getInputLossImageColor()

      override fun inputLossImageSlate(): Any? = unwrap(this).getInputLossImageSlate()

      override fun inputLossImageType(): String? = unwrap(this).getInputLossImageType()

      override fun repeatFrameMsec(): Number? = unwrap(this).getRepeatFrameMsec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputLossBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty):
          InputLossBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLossBehaviorProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty
    }
  }

  public interface Rec601SettingsProperty {
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty,
    ) : CdkObject(cdkObject), Rec601SettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Rec601SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty):
          Rec601SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Rec601SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty
    }
  }

  public interface RtmpOutputSettingsProperty {
    public fun certificateMode(): String? = unwrap(this).getCertificateMode()

    public fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun numRetries(): Number? = unwrap(this).getNumRetries()

    @CdkDslMarker
    public interface Builder {
      public fun certificateMode(certificateMode: String)

      public fun connectionRetryInterval(connectionRetryInterval: Number)

      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c5e65102a47013b7485722391ced830b572583337c88b61f847e4da12e1bc33")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)

      public fun numRetries(numRetries: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty.builder()

      override fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
      }

      override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c5e65102a47013b7485722391ced830b572583337c88b61f847e4da12e1bc33")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty,
    ) : CdkObject(cdkObject), RtmpOutputSettingsProperty {
      override fun certificateMode(): String? = unwrap(this).getCertificateMode()

      override fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

      override fun destination(): Any? = unwrap(this).getDestination()

      override fun numRetries(): Number? = unwrap(this).getNumRetries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RtmpOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty):
          RtmpOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RtmpOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty
    }
  }

  public interface Scte27DestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty,
    ) : CdkObject(cdkObject), Scte27DestinationSettingsProperty

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty
    }
  }

  public interface Scte35SpliceInsertProperty {
    public fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

    public fun noRegionalBlackoutFlag(): String? = unwrap(this).getNoRegionalBlackoutFlag()

    public fun webDeliveryAllowedFlag(): String? = unwrap(this).getWebDeliveryAllowedFlag()

    @CdkDslMarker
    public interface Builder {
      public fun adAvailOffset(adAvailOffset: Number)

      public fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String)

      public fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty.builder()

      override fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
      }

      override fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
        cdkBuilder.noRegionalBlackoutFlag(noRegionalBlackoutFlag)
      }

      override fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
        cdkBuilder.webDeliveryAllowedFlag(webDeliveryAllowedFlag)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty,
    ) : CdkObject(cdkObject), Scte35SpliceInsertProperty {
      override fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

      override fun noRegionalBlackoutFlag(): String? = unwrap(this).getNoRegionalBlackoutFlag()

      override fun webDeliveryAllowedFlag(): String? = unwrap(this).getWebDeliveryAllowedFlag()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Scte35SpliceInsertProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty):
          Scte35SpliceInsertProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte35SpliceInsertProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty
    }
  }

  public interface HlsS3SettingsProperty {
    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    @CdkDslMarker
    public interface Builder {
      public fun cannedAcl(cannedAcl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty.builder()

      override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty,
    ) : CdkObject(cdkObject), HlsS3SettingsProperty {
      override fun cannedAcl(): String? = unwrap(this).getCannedAcl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsS3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty):
          HlsS3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsS3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty
    }
  }

  public interface ColorCorrectionSettingsProperty {
    public fun globalColorCorrections(): Any? = unwrap(this).getGlobalColorCorrections()

    @CdkDslMarker
    public interface Builder {
      public fun globalColorCorrections(globalColorCorrections: IResolvable)

      public fun globalColorCorrections(globalColorCorrections: List<Any>)

      public fun globalColorCorrections(vararg globalColorCorrections: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty.builder()

      override fun globalColorCorrections(globalColorCorrections: IResolvable) {
        cdkBuilder.globalColorCorrections(globalColorCorrections.let(IResolvable::unwrap))
      }

      override fun globalColorCorrections(globalColorCorrections: List<Any>) {
        cdkBuilder.globalColorCorrections(globalColorCorrections)
      }

      override fun globalColorCorrections(vararg globalColorCorrections: Any): Unit =
          globalColorCorrections(globalColorCorrections.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty,
    ) : CdkObject(cdkObject), ColorCorrectionSettingsProperty {
      override fun globalColorCorrections(): Any? = unwrap(this).getGlobalColorCorrections()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColorCorrectionSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty):
          ColorCorrectionSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColorCorrectionSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionSettingsProperty
    }
  }

  public interface MediaPackageOutputSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty,
    ) : CdkObject(cdkObject), MediaPackageOutputSettingsProperty

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputSettingsProperty
    }
  }

  public interface AudioNormalizationSettingsProperty {
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    public fun algorithmControl(): String? = unwrap(this).getAlgorithmControl()

    public fun targetLkfs(): Number? = unwrap(this).getTargetLkfs()

    @CdkDslMarker
    public interface Builder {
      public fun algorithm(algorithm: String)

      public fun algorithmControl(algorithmControl: String)

      public fun targetLkfs(targetLkfs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty.builder()

      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      override fun algorithmControl(algorithmControl: String) {
        cdkBuilder.algorithmControl(algorithmControl)
      }

      override fun targetLkfs(targetLkfs: Number) {
        cdkBuilder.targetLkfs(targetLkfs)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty,
    ) : CdkObject(cdkObject), AudioNormalizationSettingsProperty {
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      override fun algorithmControl(): String? = unwrap(this).getAlgorithmControl()

      override fun targetLkfs(): Number? = unwrap(this).getTargetLkfs()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun acquisitionPointId(acquisitionPointId: String)

      public fun audioOnlyTimecodeControl(audioOnlyTimecodeControl: String)

      public fun certificateMode(certificateMode: String)

      public fun connectionRetryInterval(connectionRetryInterval: Number)

      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28b16325180464eefcd18721c4acfc6129074ad981f963ed0c25ae5c16c7305e")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)

      public fun eventId(eventId: String)

      public fun eventIdMode(eventIdMode: String)

      public fun eventStopBehavior(eventStopBehavior: String)

      public fun filecacheDuration(filecacheDuration: Number)

      public fun fragmentLength(fragmentLength: Number)

      public fun inputLossAction(inputLossAction: String)

      public fun numRetries(numRetries: Number)

      public fun restartDelay(restartDelay: Number)

      public fun segmentationMode(segmentationMode: String)

      public fun sendDelayMs(sendDelayMs: Number)

      public fun sparseTrackType(sparseTrackType: String)

      public fun streamManifestBehavior(streamManifestBehavior: String)

      public fun timestampOffset(timestampOffset: String)

      public fun timestampOffsetMode(timestampOffsetMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty.builder()

      override fun acquisitionPointId(acquisitionPointId: String) {
        cdkBuilder.acquisitionPointId(acquisitionPointId)
      }

      override fun audioOnlyTimecodeControl(audioOnlyTimecodeControl: String) {
        cdkBuilder.audioOnlyTimecodeControl(audioOnlyTimecodeControl)
      }

      override fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
      }

      override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28b16325180464eefcd18721c4acfc6129074ad981f963ed0c25ae5c16c7305e")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      override fun eventId(eventId: String) {
        cdkBuilder.eventId(eventId)
      }

      override fun eventIdMode(eventIdMode: String) {
        cdkBuilder.eventIdMode(eventIdMode)
      }

      override fun eventStopBehavior(eventStopBehavior: String) {
        cdkBuilder.eventStopBehavior(eventStopBehavior)
      }

      override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      override fun fragmentLength(fragmentLength: Number) {
        cdkBuilder.fragmentLength(fragmentLength)
      }

      override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      override fun segmentationMode(segmentationMode: String) {
        cdkBuilder.segmentationMode(segmentationMode)
      }

      override fun sendDelayMs(sendDelayMs: Number) {
        cdkBuilder.sendDelayMs(sendDelayMs)
      }

      override fun sparseTrackType(sparseTrackType: String) {
        cdkBuilder.sparseTrackType(sparseTrackType)
      }

      override fun streamManifestBehavior(streamManifestBehavior: String) {
        cdkBuilder.streamManifestBehavior(streamManifestBehavior)
      }

      override fun timestampOffset(timestampOffset: String) {
        cdkBuilder.timestampOffset(timestampOffset)
      }

      override fun timestampOffsetMode(timestampOffsetMode: String) {
        cdkBuilder.timestampOffsetMode(timestampOffsetMode)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty,
    ) : CdkObject(cdkObject), MsSmoothGroupSettingsProperty {
      override fun acquisitionPointId(): String? = unwrap(this).getAcquisitionPointId()

      override fun audioOnlyTimecodeControl(): String? = unwrap(this).getAudioOnlyTimecodeControl()

      override fun certificateMode(): String? = unwrap(this).getCertificateMode()

      override fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

      override fun destination(): Any? = unwrap(this).getDestination()

      override fun eventId(): String? = unwrap(this).getEventId()

      override fun eventIdMode(): String? = unwrap(this).getEventIdMode()

      override fun eventStopBehavior(): String? = unwrap(this).getEventStopBehavior()

      override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      override fun fragmentLength(): Number? = unwrap(this).getFragmentLength()

      override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      override fun numRetries(): Number? = unwrap(this).getNumRetries()

      override fun restartDelay(): Number? = unwrap(this).getRestartDelay()

      override fun segmentationMode(): String? = unwrap(this).getSegmentationMode()

      override fun sendDelayMs(): Number? = unwrap(this).getSendDelayMs()

      override fun sparseTrackType(): String? = unwrap(this).getSparseTrackType()

      override fun streamManifestBehavior(): String? = unwrap(this).getStreamManifestBehavior()

      override fun timestampOffset(): String? = unwrap(this).getTimestampOffset()

      override fun timestampOffsetMode(): String? = unwrap(this).getTimestampOffsetMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MsSmoothGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty):
          MsSmoothGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MsSmoothGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothGroupSettingsProperty
    }
  }

  public interface ColorCorrectionProperty {
    public fun inputColorSpace(): String? = unwrap(this).getInputColorSpace()

    public fun outputColorSpace(): String? = unwrap(this).getOutputColorSpace()

    public fun uri(): String? = unwrap(this).getUri()

    @CdkDslMarker
    public interface Builder {
      public fun inputColorSpace(inputColorSpace: String)

      public fun outputColorSpace(outputColorSpace: String)

      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty.builder()

      override fun inputColorSpace(inputColorSpace: String) {
        cdkBuilder.inputColorSpace(inputColorSpace)
      }

      override fun outputColorSpace(outputColorSpace: String) {
        cdkBuilder.outputColorSpace(outputColorSpace)
      }

      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty,
    ) : CdkObject(cdkObject), ColorCorrectionProperty {
      override fun inputColorSpace(): String? = unwrap(this).getInputColorSpace()

      override fun outputColorSpace(): String? = unwrap(this).getOutputColorSpace()

      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColorCorrectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty):
          ColorCorrectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColorCorrectionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ColorCorrectionProperty
    }
  }

  public interface FrameCaptureGroupSettingsProperty {
    public fun destination(): Any? = unwrap(this).getDestination()

    public fun frameCaptureCdnSettings(): Any? = unwrap(this).getFrameCaptureCdnSettings()

    @CdkDslMarker
    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9856cbc3d03f26a360384cab57e12cb1f22a4e06f7c1fac35b80c95e6067e184")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)

      public fun frameCaptureCdnSettings(frameCaptureCdnSettings: IResolvable)

      public fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85dbbe320ce33bec193e6f343670d9440c84e5c58aae48abafbce652f98b513e")
      public
          fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9856cbc3d03f26a360384cab57e12cb1f22a4e06f7c1fac35b80c95e6067e184")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      override fun frameCaptureCdnSettings(frameCaptureCdnSettings: IResolvable) {
        cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings.let(IResolvable::unwrap))
      }

      override
          fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty) {
        cdkBuilder.frameCaptureCdnSettings(frameCaptureCdnSettings.let(FrameCaptureCdnSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85dbbe320ce33bec193e6f343670d9440c84e5c58aae48abafbce652f98b513e")
      override
          fun frameCaptureCdnSettings(frameCaptureCdnSettings: FrameCaptureCdnSettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureCdnSettings(FrameCaptureCdnSettingsProperty(frameCaptureCdnSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty,
    ) : CdkObject(cdkObject), FrameCaptureGroupSettingsProperty {
      override fun destination(): Any? = unwrap(this).getDestination()

      override fun frameCaptureCdnSettings(): Any? = unwrap(this).getFrameCaptureCdnSettings()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty
    }
  }

  public interface UdpGroupSettingsProperty {
    public fun inputLossAction(): String? = unwrap(this).getInputLossAction()

    public fun timedMetadataId3Frame(): String? = unwrap(this).getTimedMetadataId3Frame()

    public fun timedMetadataId3Period(): Number? = unwrap(this).getTimedMetadataId3Period()

    @CdkDslMarker
    public interface Builder {
      public fun inputLossAction(inputLossAction: String)

      public fun timedMetadataId3Frame(timedMetadataId3Frame: String)

      public fun timedMetadataId3Period(timedMetadataId3Period: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty.builder()

      override fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
      }

      override fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
        cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
      }

      override fun timedMetadataId3Period(timedMetadataId3Period: Number) {
        cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty,
    ) : CdkObject(cdkObject), UdpGroupSettingsProperty {
      override fun inputLossAction(): String? = unwrap(this).getInputLossAction()

      override fun timedMetadataId3Frame(): String? = unwrap(this).getTimedMetadataId3Frame()

      override fun timedMetadataId3Period(): Number? = unwrap(this).getTimedMetadataId3Period()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UdpGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty):
          UdpGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UdpGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty
    }
  }

  public interface RemixSettingsProperty {
    public fun channelMappings(): Any? = unwrap(this).getChannelMappings()

    public fun channelsIn(): Number? = unwrap(this).getChannelsIn()

    public fun channelsOut(): Number? = unwrap(this).getChannelsOut()

    @CdkDslMarker
    public interface Builder {
      public fun channelMappings(channelMappings: IResolvable)

      public fun channelMappings(channelMappings: List<Any>)

      public fun channelMappings(vararg channelMappings: Any)

      public fun channelsIn(channelsIn: Number)

      public fun channelsOut(channelsOut: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty.builder()

      override fun channelMappings(channelMappings: IResolvable) {
        cdkBuilder.channelMappings(channelMappings.let(IResolvable::unwrap))
      }

      override fun channelMappings(channelMappings: List<Any>) {
        cdkBuilder.channelMappings(channelMappings)
      }

      override fun channelMappings(vararg channelMappings: Any): Unit =
          channelMappings(channelMappings.toList())

      override fun channelsIn(channelsIn: Number) {
        cdkBuilder.channelsIn(channelsIn)
      }

      override fun channelsOut(channelsOut: Number) {
        cdkBuilder.channelsOut(channelsOut)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty,
    ) : CdkObject(cdkObject), RemixSettingsProperty {
      override fun channelMappings(): Any? = unwrap(this).getChannelMappings()

      override fun channelsIn(): Number? = unwrap(this).getChannelsIn()

      override fun channelsOut(): Number? = unwrap(this).getChannelsOut()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RemixSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty):
          RemixSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemixSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty
    }
  }

  public interface ColorSpacePassthroughSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty,
    ) : CdkObject(cdkObject), ColorSpacePassthroughSettingsProperty

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty
    }
  }

  public interface NetworkInputSettingsProperty {
    public fun hlsInputSettings(): Any? = unwrap(this).getHlsInputSettings()

    public fun serverValidation(): String? = unwrap(this).getServerValidation()

    @CdkDslMarker
    public interface Builder {
      public fun hlsInputSettings(hlsInputSettings: IResolvable)

      public fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63fa83903cb5729012027ed88c7bfdde8e004071033b6652ee3c768997257d51")
      public fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty.Builder.() -> Unit)

      public fun serverValidation(serverValidation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty.builder()

      override fun hlsInputSettings(hlsInputSettings: IResolvable) {
        cdkBuilder.hlsInputSettings(hlsInputSettings.let(IResolvable::unwrap))
      }

      override fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty) {
        cdkBuilder.hlsInputSettings(hlsInputSettings.let(HlsInputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63fa83903cb5729012027ed88c7bfdde8e004071033b6652ee3c768997257d51")
      override fun hlsInputSettings(hlsInputSettings: HlsInputSettingsProperty.Builder.() -> Unit):
          Unit = hlsInputSettings(HlsInputSettingsProperty(hlsInputSettings))

      override fun serverValidation(serverValidation: String) {
        cdkBuilder.serverValidation(serverValidation)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty,
    ) : CdkObject(cdkObject), NetworkInputSettingsProperty {
      override fun hlsInputSettings(): Any? = unwrap(this).getHlsInputSettings()

      override fun serverValidation(): String? = unwrap(this).getServerValidation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty):
          NetworkInputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty
    }
  }

  public interface MediaPackageGroupSettingsProperty {
    public fun destination(): Any? = unwrap(this).getDestination()

    @CdkDslMarker
    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713636ca4eccf016520d54b41a47fb2c5ec4af5b2de0a11a2c9e46f6b0f9b284")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("713636ca4eccf016520d54b41a47fb2c5ec4af5b2de0a11a2c9e46f6b0f9b284")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty,
    ) : CdkObject(cdkObject), MediaPackageGroupSettingsProperty {
      override fun destination(): Any? = unwrap(this).getDestination()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageGroupSettingsProperty
    }
  }

  public interface StaticKeySettingsProperty {
    public fun keyProviderServer(): Any? = unwrap(this).getKeyProviderServer()

    public fun staticKeyValue(): String? = unwrap(this).getStaticKeyValue()

    @CdkDslMarker
    public interface Builder {
      public fun keyProviderServer(keyProviderServer: IResolvable)

      public fun keyProviderServer(keyProviderServer: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa33d117d76d6f8ddf5adf69b60f682c89fe53780c940d718df2c5b929eeb57")
      public fun keyProviderServer(keyProviderServer: InputLocationProperty.Builder.() -> Unit)

      public fun staticKeyValue(staticKeyValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty.builder()

      override fun keyProviderServer(keyProviderServer: IResolvable) {
        cdkBuilder.keyProviderServer(keyProviderServer.let(IResolvable::unwrap))
      }

      override fun keyProviderServer(keyProviderServer: InputLocationProperty) {
        cdkBuilder.keyProviderServer(keyProviderServer.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa33d117d76d6f8ddf5adf69b60f682c89fe53780c940d718df2c5b929eeb57")
      override fun keyProviderServer(keyProviderServer: InputLocationProperty.Builder.() -> Unit):
          Unit = keyProviderServer(InputLocationProperty(keyProviderServer))

      override fun staticKeyValue(staticKeyValue: String) {
        cdkBuilder.staticKeyValue(staticKeyValue)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty,
    ) : CdkObject(cdkObject), StaticKeySettingsProperty {
      override fun keyProviderServer(): Any? = unwrap(this).getKeyProviderServer()

      override fun staticKeyValue(): String? = unwrap(this).getStaticKeyValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StaticKeySettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty):
          StaticKeySettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StaticKeySettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty
    }
  }

  public interface MotionGraphicsConfigurationProperty {
    public fun motionGraphicsInsertion(): String? = unwrap(this).getMotionGraphicsInsertion()

    public fun motionGraphicsSettings(): Any? = unwrap(this).getMotionGraphicsSettings()

    @CdkDslMarker
    public interface Builder {
      public fun motionGraphicsInsertion(motionGraphicsInsertion: String)

      public fun motionGraphicsSettings(motionGraphicsSettings: IResolvable)

      public fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3a7271f89321ad17772aa32489d7d3647324393dd12a21a17c02f3c4993bcb9")
      public
          fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty.builder()

      override fun motionGraphicsInsertion(motionGraphicsInsertion: String) {
        cdkBuilder.motionGraphicsInsertion(motionGraphicsInsertion)
      }

      override fun motionGraphicsSettings(motionGraphicsSettings: IResolvable) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings.let(IResolvable::unwrap))
      }

      override fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings.let(MotionGraphicsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3a7271f89321ad17772aa32489d7d3647324393dd12a21a17c02f3c4993bcb9")
      override
          fun motionGraphicsSettings(motionGraphicsSettings: MotionGraphicsSettingsProperty.Builder.() -> Unit):
          Unit = motionGraphicsSettings(MotionGraphicsSettingsProperty(motionGraphicsSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty,
    ) : CdkObject(cdkObject), MotionGraphicsConfigurationProperty {
      override fun motionGraphicsInsertion(): String? = unwrap(this).getMotionGraphicsInsertion()

      override fun motionGraphicsSettings(): Any? = unwrap(this).getMotionGraphicsSettings()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty
    }
  }

  public interface FrameCaptureHlsSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty,
    ) : CdkObject(cdkObject), FrameCaptureHlsSettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureHlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty):
          FrameCaptureHlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureHlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty
    }
  }

  public interface InputLocationProperty {
    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    public fun uri(): String? = unwrap(this).getUri()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun passwordParam(passwordParam: String)

      public fun uri(uri: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty.builder()

      override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty,
    ) : CdkObject(cdkObject), InputLocationProperty {
      override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      override fun uri(): String? = unwrap(this).getUri()

      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty):
          InputLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLocationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty
    }
  }

  public interface VideoCodecSettingsProperty {
    public fun frameCaptureSettings(): Any? = unwrap(this).getFrameCaptureSettings()

    public fun h264Settings(): Any? = unwrap(this).getH264Settings()

    public fun h265Settings(): Any? = unwrap(this).getH265Settings()

    public fun mpeg2Settings(): Any? = unwrap(this).getMpeg2Settings()

    @CdkDslMarker
    public interface Builder {
      public fun frameCaptureSettings(frameCaptureSettings: IResolvable)

      public fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222c62772bf18b14036723a2d521cdb01e8137f202f75bb2683d6fded0bdf2c1")
      public
          fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty.Builder.() -> Unit)

      public fun h264Settings(h264Settings: IResolvable)

      public fun h264Settings(h264Settings: H264SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c077ec3e18f44e6ffc841e43a8223e933183c8d0c58c6b9f35a4e28b5578c651")
      public fun h264Settings(h264Settings: H264SettingsProperty.Builder.() -> Unit)

      public fun h265Settings(h265Settings: IResolvable)

      public fun h265Settings(h265Settings: H265SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d205d9eb647853e8b9d4108b737b8d4d5154eb19ebbc3a6590c9038afee3602f")
      public fun h265Settings(h265Settings: H265SettingsProperty.Builder.() -> Unit)

      public fun mpeg2Settings(mpeg2Settings: IResolvable)

      public fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7aeca5da7e0cc286f334cbbb6afddc31d22c5a69c13c3918aa4dc89287d1d9")
      public fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty.builder()

      override fun frameCaptureSettings(frameCaptureSettings: IResolvable) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings.let(IResolvable::unwrap))
      }

      override fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings.let(FrameCaptureSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222c62772bf18b14036723a2d521cdb01e8137f202f75bb2683d6fded0bdf2c1")
      override
          fun frameCaptureSettings(frameCaptureSettings: FrameCaptureSettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureSettings(FrameCaptureSettingsProperty(frameCaptureSettings))

      override fun h264Settings(h264Settings: IResolvable) {
        cdkBuilder.h264Settings(h264Settings.let(IResolvable::unwrap))
      }

      override fun h264Settings(h264Settings: H264SettingsProperty) {
        cdkBuilder.h264Settings(h264Settings.let(H264SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c077ec3e18f44e6ffc841e43a8223e933183c8d0c58c6b9f35a4e28b5578c651")
      override fun h264Settings(h264Settings: H264SettingsProperty.Builder.() -> Unit): Unit =
          h264Settings(H264SettingsProperty(h264Settings))

      override fun h265Settings(h265Settings: IResolvable) {
        cdkBuilder.h265Settings(h265Settings.let(IResolvable::unwrap))
      }

      override fun h265Settings(h265Settings: H265SettingsProperty) {
        cdkBuilder.h265Settings(h265Settings.let(H265SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d205d9eb647853e8b9d4108b737b8d4d5154eb19ebbc3a6590c9038afee3602f")
      override fun h265Settings(h265Settings: H265SettingsProperty.Builder.() -> Unit): Unit =
          h265Settings(H265SettingsProperty(h265Settings))

      override fun mpeg2Settings(mpeg2Settings: IResolvable) {
        cdkBuilder.mpeg2Settings(mpeg2Settings.let(IResolvable::unwrap))
      }

      override fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty) {
        cdkBuilder.mpeg2Settings(mpeg2Settings.let(Mpeg2SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca7aeca5da7e0cc286f334cbbb6afddc31d22c5a69c13c3918aa4dc89287d1d9")
      override fun mpeg2Settings(mpeg2Settings: Mpeg2SettingsProperty.Builder.() -> Unit): Unit =
          mpeg2Settings(Mpeg2SettingsProperty(mpeg2Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty,
    ) : CdkObject(cdkObject), VideoCodecSettingsProperty {
      override fun frameCaptureSettings(): Any? = unwrap(this).getFrameCaptureSettings()

      override fun h264Settings(): Any? = unwrap(this).getH264Settings()

      override fun h265Settings(): Any? = unwrap(this).getH265Settings()

      override fun mpeg2Settings(): Any? = unwrap(this).getMpeg2Settings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoCodecSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty):
          VideoCodecSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoCodecSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty
    }
  }

  public interface Scte20SourceSettingsProperty {
    public fun convert608To708(): String? = unwrap(this).getConvert608To708()

    public fun source608ChannelNumber(): Number? = unwrap(this).getSource608ChannelNumber()

    @CdkDslMarker
    public interface Builder {
      public fun convert608To708(convert608To708: String)

      public fun source608ChannelNumber(source608ChannelNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty.builder()

      override fun convert608To708(convert608To708: String) {
        cdkBuilder.convert608To708(convert608To708)
      }

      override fun source608ChannelNumber(source608ChannelNumber: Number) {
        cdkBuilder.source608ChannelNumber(source608ChannelNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty,
    ) : CdkObject(cdkObject), Scte20SourceSettingsProperty {
      override fun convert608To708(): String? = unwrap(this).getConvert608To708()

      override fun source608ChannelNumber(): Number? = unwrap(this).getSource608ChannelNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Scte20SourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty):
          Scte20SourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte20SourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty
    }
  }

  public interface AvailConfigurationProperty {
    public fun availSettings(): Any? = unwrap(this).getAvailSettings()

    @CdkDslMarker
    public interface Builder {
      public fun availSettings(availSettings: IResolvable)

      public fun availSettings(availSettings: AvailSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("240d5e0606d729c84794d102fb2ba988f76c879c4aaef20e19080d639b518ac5")
      public fun availSettings(availSettings: AvailSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty.builder()

      override fun availSettings(availSettings: IResolvable) {
        cdkBuilder.availSettings(availSettings.let(IResolvable::unwrap))
      }

      override fun availSettings(availSettings: AvailSettingsProperty) {
        cdkBuilder.availSettings(availSettings.let(AvailSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("240d5e0606d729c84794d102fb2ba988f76c879c4aaef20e19080d639b518ac5")
      override fun availSettings(availSettings: AvailSettingsProperty.Builder.() -> Unit): Unit =
          availSettings(AvailSettingsProperty(availSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty,
    ) : CdkObject(cdkObject), AvailConfigurationProperty {
      override fun availSettings(): Any? = unwrap(this).getAvailSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AvailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty):
          AvailConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AvailConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty
    }
  }

  public interface OutputLocationRefProperty {
    public fun destinationRefId(): String? = unwrap(this).getDestinationRefId()

    @CdkDslMarker
    public interface Builder {
      public fun destinationRefId(destinationRefId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty.builder()

      override fun destinationRefId(destinationRefId: String) {
        cdkBuilder.destinationRefId(destinationRefId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty,
    ) : CdkObject(cdkObject), OutputLocationRefProperty {
      override fun destinationRefId(): String? = unwrap(this).getDestinationRefId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputLocationRefProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty):
          OutputLocationRefProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputLocationRefProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty
    }
  }

  public interface SmpteTtDestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty,
    ) : CdkObject(cdkObject), SmpteTtDestinationSettingsProperty

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty
    }
  }

  public interface AudioTrackProperty {
    public fun track(): Number? = unwrap(this).getTrack()

    @CdkDslMarker
    public interface Builder {
      public fun track(track: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty.builder()

      override fun track(track: Number) {
        cdkBuilder.track(track)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty,
    ) : CdkObject(cdkObject), AudioTrackProperty {
      override fun track(): Number? = unwrap(this).getTrack()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioTrackProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty):
          AudioTrackProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioTrackProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty
    }
  }

  public interface HlsOutputSettingsProperty {
    public fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

    public fun hlsSettings(): Any? = unwrap(this).getHlsSettings()

    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    public fun segmentModifier(): String? = unwrap(this).getSegmentModifier()

    @CdkDslMarker
    public interface Builder {
      public fun h265PackagingType(h265PackagingType: String)

      public fun hlsSettings(hlsSettings: IResolvable)

      public fun hlsSettings(hlsSettings: HlsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78605301163dbb54e1bc1f60ec8465b400d180739ddf3353dca1f8349ab163c1")
      public fun hlsSettings(hlsSettings: HlsSettingsProperty.Builder.() -> Unit)

      public fun nameModifier(nameModifier: String)

      public fun segmentModifier(segmentModifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty.builder()

      override fun h265PackagingType(h265PackagingType: String) {
        cdkBuilder.h265PackagingType(h265PackagingType)
      }

      override fun hlsSettings(hlsSettings: IResolvable) {
        cdkBuilder.hlsSettings(hlsSettings.let(IResolvable::unwrap))
      }

      override fun hlsSettings(hlsSettings: HlsSettingsProperty) {
        cdkBuilder.hlsSettings(hlsSettings.let(HlsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78605301163dbb54e1bc1f60ec8465b400d180739ddf3353dca1f8349ab163c1")
      override fun hlsSettings(hlsSettings: HlsSettingsProperty.Builder.() -> Unit): Unit =
          hlsSettings(HlsSettingsProperty(hlsSettings))

      override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      override fun segmentModifier(segmentModifier: String) {
        cdkBuilder.segmentModifier(segmentModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty,
    ) : CdkObject(cdkObject), HlsOutputSettingsProperty {
      override fun h265PackagingType(): String? = unwrap(this).getH265PackagingType()

      override fun hlsSettings(): Any? = unwrap(this).getHlsSettings()

      override fun nameModifier(): String? = unwrap(this).getNameModifier()

      override fun segmentModifier(): String? = unwrap(this).getSegmentModifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty):
          HlsOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsOutputSettingsProperty
    }
  }

  public interface AudioChannelMappingProperty {
    public fun inputChannelLevels(): Any? = unwrap(this).getInputChannelLevels()

    public fun outputChannel(): Number? = unwrap(this).getOutputChannel()

    @CdkDslMarker
    public interface Builder {
      public fun inputChannelLevels(inputChannelLevels: IResolvable)

      public fun inputChannelLevels(inputChannelLevels: List<Any>)

      public fun inputChannelLevels(vararg inputChannelLevels: Any)

      public fun outputChannel(outputChannel: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty.builder()

      override fun inputChannelLevels(inputChannelLevels: IResolvable) {
        cdkBuilder.inputChannelLevels(inputChannelLevels.let(IResolvable::unwrap))
      }

      override fun inputChannelLevels(inputChannelLevels: List<Any>) {
        cdkBuilder.inputChannelLevels(inputChannelLevels)
      }

      override fun inputChannelLevels(vararg inputChannelLevels: Any): Unit =
          inputChannelLevels(inputChannelLevels.toList())

      override fun outputChannel(outputChannel: Number) {
        cdkBuilder.outputChannel(outputChannel)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty,
    ) : CdkObject(cdkObject), AudioChannelMappingProperty {
      override fun inputChannelLevels(): Any? = unwrap(this).getInputChannelLevels()

      override fun outputChannel(): Number? = unwrap(this).getOutputChannel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioChannelMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty):
          AudioChannelMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioChannelMappingProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty
    }
  }

  public interface PassThroughSettingsProperty {
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty.builder()

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty,
    ) : CdkObject(cdkObject), PassThroughSettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PassThroughSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty):
          PassThroughSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PassThroughSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.PassThroughSettingsProperty
    }
  }

  public interface HtmlMotionGraphicsSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty,
    ) : CdkObject(cdkObject), HtmlMotionGraphicsSettingsProperty

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HtmlMotionGraphicsSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun bitrate(bitrate: Number)

      public fun codingMode(codingMode: String)

      public fun dialnorm(dialnorm: Number)

      public fun drcLine(drcLine: String)

      public fun drcRf(drcRf: String)

      public fun heightTrim(heightTrim: Number)

      public fun surroundTrim(surroundTrim: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty.builder()

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      override fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
      }

      override fun drcLine(drcLine: String) {
        cdkBuilder.drcLine(drcLine)
      }

      override fun drcRf(drcRf: String) {
        cdkBuilder.drcRf(drcRf)
      }

      override fun heightTrim(heightTrim: Number) {
        cdkBuilder.heightTrim(heightTrim)
      }

      override fun surroundTrim(surroundTrim: Number) {
        cdkBuilder.surroundTrim(surroundTrim)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty,
    ) : CdkObject(cdkObject), Eac3AtmosSettingsProperty {
      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun codingMode(): String? = unwrap(this).getCodingMode()

      override fun dialnorm(): Number? = unwrap(this).getDialnorm()

      override fun drcLine(): String? = unwrap(this).getDrcLine()

      override fun drcRf(): String? = unwrap(this).getDrcRf()

      override fun heightTrim(): Number? = unwrap(this).getHeightTrim()

      override fun surroundTrim(): Number? = unwrap(this).getSurroundTrim()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Eac3AtmosSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty):
          Eac3AtmosSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Eac3AtmosSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3AtmosSettingsProperty
    }
  }

  public interface NielsenWatermarksSettingsProperty {
    public fun nielsenCbetSettings(): Any? = unwrap(this).getNielsenCbetSettings()

    public fun nielsenDistributionType(): String? = unwrap(this).getNielsenDistributionType()

    public fun nielsenNaesIiNwSettings(): Any? = unwrap(this).getNielsenNaesIiNwSettings()

    @CdkDslMarker
    public interface Builder {
      public fun nielsenCbetSettings(nielsenCbetSettings: IResolvable)

      public fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35333d3f44aa56de26abd03af7cc97f42b05a1141ac054f99a76ddc6892352d8")
      public fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty.Builder.() -> Unit)

      public fun nielsenDistributionType(nielsenDistributionType: String)

      public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: IResolvable)

      public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("805148ec889bfd17c184fe783d22acec7decede80d044d2eb08a4a9e6bd5934d")
      public
          fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty.builder()

      override fun nielsenCbetSettings(nielsenCbetSettings: IResolvable) {
        cdkBuilder.nielsenCbetSettings(nielsenCbetSettings.let(IResolvable::unwrap))
      }

      override fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty) {
        cdkBuilder.nielsenCbetSettings(nielsenCbetSettings.let(NielsenCBETProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35333d3f44aa56de26abd03af7cc97f42b05a1141ac054f99a76ddc6892352d8")
      override fun nielsenCbetSettings(nielsenCbetSettings: NielsenCBETProperty.Builder.() -> Unit):
          Unit = nielsenCbetSettings(NielsenCBETProperty(nielsenCbetSettings))

      override fun nielsenDistributionType(nielsenDistributionType: String) {
        cdkBuilder.nielsenDistributionType(nielsenDistributionType)
      }

      override fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: IResolvable) {
        cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings.let(IResolvable::unwrap))
      }

      override fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty) {
        cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings.let(NielsenNaesIiNwProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("805148ec889bfd17c184fe783d22acec7decede80d044d2eb08a4a9e6bd5934d")
      override
          fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: NielsenNaesIiNwProperty.Builder.() -> Unit):
          Unit = nielsenNaesIiNwSettings(NielsenNaesIiNwProperty(nielsenNaesIiNwSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty,
    ) : CdkObject(cdkObject), NielsenWatermarksSettingsProperty {
      override fun nielsenCbetSettings(): Any? = unwrap(this).getNielsenCbetSettings()

      override fun nielsenDistributionType(): String? = unwrap(this).getNielsenDistributionType()

      override fun nielsenNaesIiNwSettings(): Any? = unwrap(this).getNielsenNaesIiNwSettings()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenWatermarksSettingsProperty
    }
  }

  public interface CaptionDescriptionProperty {
    public fun accessibility(): String? = unwrap(this).getAccessibility()

    public fun captionSelectorName(): String? = unwrap(this).getCaptionSelectorName()

    public fun destinationSettings(): Any? = unwrap(this).getDestinationSettings()

    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun languageDescription(): String? = unwrap(this).getLanguageDescription()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun accessibility(accessibility: String)

      public fun captionSelectorName(captionSelectorName: String)

      public fun destinationSettings(destinationSettings: IResolvable)

      public fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f1770abcbc58775ad8bd56af514fbcdc88ca0b96ef4da293ace57be6c40f7e2")
      public
          fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty.Builder.() -> Unit)

      public fun languageCode(languageCode: String)

      public fun languageDescription(languageDescription: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty.builder()

      override fun accessibility(accessibility: String) {
        cdkBuilder.accessibility(accessibility)
      }

      override fun captionSelectorName(captionSelectorName: String) {
        cdkBuilder.captionSelectorName(captionSelectorName)
      }

      override fun destinationSettings(destinationSettings: IResolvable) {
        cdkBuilder.destinationSettings(destinationSettings.let(IResolvable::unwrap))
      }

      override fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty) {
        cdkBuilder.destinationSettings(destinationSettings.let(CaptionDestinationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f1770abcbc58775ad8bd56af514fbcdc88ca0b96ef4da293ace57be6c40f7e2")
      override
          fun destinationSettings(destinationSettings: CaptionDestinationSettingsProperty.Builder.() -> Unit):
          Unit = destinationSettings(CaptionDestinationSettingsProperty(destinationSettings))

      override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      override fun languageDescription(languageDescription: String) {
        cdkBuilder.languageDescription(languageDescription)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty,
    ) : CdkObject(cdkObject), CaptionDescriptionProperty {
      override fun accessibility(): String? = unwrap(this).getAccessibility()

      override fun captionSelectorName(): String? = unwrap(this).getCaptionSelectorName()

      override fun destinationSettings(): Any? = unwrap(this).getDestinationSettings()

      override fun languageCode(): String? = unwrap(this).getLanguageCode()

      override fun languageDescription(): String? = unwrap(this).getLanguageDescription()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty):
          CaptionDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionDescriptionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionDescriptionProperty
    }
  }

  public interface CaptionLanguageMappingProperty {
    public fun captionChannel(): Number? = unwrap(this).getCaptionChannel()

    public fun languageCode(): String? = unwrap(this).getLanguageCode()

    public fun languageDescription(): String? = unwrap(this).getLanguageDescription()

    @CdkDslMarker
    public interface Builder {
      public fun captionChannel(captionChannel: Number)

      public fun languageCode(languageCode: String)

      public fun languageDescription(languageDescription: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty.builder()

      override fun captionChannel(captionChannel: Number) {
        cdkBuilder.captionChannel(captionChannel)
      }

      override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      override fun languageDescription(languageDescription: String) {
        cdkBuilder.languageDescription(languageDescription)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty,
    ) : CdkObject(cdkObject), CaptionLanguageMappingProperty {
      override fun captionChannel(): Number? = unwrap(this).getCaptionChannel()

      override fun languageCode(): String? = unwrap(this).getLanguageCode()

      override fun languageDescription(): String? = unwrap(this).getLanguageDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptionLanguageMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty):
          CaptionLanguageMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptionLanguageMappingProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.CaptionLanguageMappingProperty
    }
  }

  public interface FrameCaptureOutputSettingsProperty {
    public fun nameModifier(): String? = unwrap(this).getNameModifier()

    @CdkDslMarker
    public interface Builder {
      public fun nameModifier(nameModifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty.builder()

      override fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty,
    ) : CdkObject(cdkObject), FrameCaptureOutputSettingsProperty {
      override fun nameModifier(): String? = unwrap(this).getNameModifier()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adaptiveQuantization(adaptiveQuantization: String)

      public fun afdSignaling(afdSignaling: String)

      public fun bitrate(bitrate: Number)

      public fun bufFillPct(bufFillPct: Number)

      public fun bufSize(bufSize: Number)

      public fun colorMetadata(colorMetadata: String)

      public fun colorSpaceSettings(colorSpaceSettings: IResolvable)

      public fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("040b672b23dcea5b979db503894f0422badeb4a70de1aeaba3c8dba1414d4cd2")
      public
          fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty.Builder.() -> Unit)

      public fun entropyEncoding(entropyEncoding: String)

      public fun filterSettings(filterSettings: IResolvable)

      public fun filterSettings(filterSettings: H264FilterSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4784a9e838832f79036b52ca493da9f3be2549c718a2984878f69785abd6c8b")
      public fun filterSettings(filterSettings: H264FilterSettingsProperty.Builder.() -> Unit)

      public fun fixedAfd(fixedAfd: String)

      public fun flickerAq(flickerAq: String)

      public fun forceFieldPictures(forceFieldPictures: String)

      public fun framerateControl(framerateControl: String)

      public fun framerateDenominator(framerateDenominator: Number)

      public fun framerateNumerator(framerateNumerator: Number)

      public fun gopBReference(gopBReference: String)

      public fun gopClosedCadence(gopClosedCadence: Number)

      public fun gopNumBFrames(gopNumBFrames: Number)

      public fun gopSize(gopSize: Number)

      public fun gopSizeUnits(gopSizeUnits: String)

      public fun level(level: String)

      public fun lookAheadRateControl(lookAheadRateControl: String)

      public fun maxBitrate(maxBitrate: Number)

      public fun minIInterval(minIInterval: Number)

      public fun numRefFrames(numRefFrames: Number)

      public fun parControl(parControl: String)

      public fun parDenominator(parDenominator: Number)

      public fun parNumerator(parNumerator: Number)

      public fun profile(profile: String)

      public fun qualityLevel(qualityLevel: String)

      public fun qvbrQualityLevel(qvbrQualityLevel: Number)

      public fun rateControlMode(rateControlMode: String)

      public fun scanType(scanType: String)

      public fun sceneChangeDetect(sceneChangeDetect: String)

      public fun slices(slices: Number)

      public fun softness(softness: Number)

      public fun spatialAq(spatialAq: String)

      public fun subgopLength(subgopLength: String)

      public fun syntax(syntax: String)

      public fun temporalAq(temporalAq: String)

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable)

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62643fd88f34450bd48fc495cc91e3e5239fc404fc1f3ed5e8679376335b6a45")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit)

      public fun timecodeInsertion(timecodeInsertion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty.builder()

      override fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
      }

      override fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
      }

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun bufFillPct(bufFillPct: Number) {
        cdkBuilder.bufFillPct(bufFillPct)
      }

      override fun bufSize(bufSize: Number) {
        cdkBuilder.bufSize(bufSize)
      }

      override fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
      }

      override fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(IResolvable::unwrap))
      }

      override fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings.let(H264ColorSpaceSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("040b672b23dcea5b979db503894f0422badeb4a70de1aeaba3c8dba1414d4cd2")
      override
          fun colorSpaceSettings(colorSpaceSettings: H264ColorSpaceSettingsProperty.Builder.() -> Unit):
          Unit = colorSpaceSettings(H264ColorSpaceSettingsProperty(colorSpaceSettings))

      override fun entropyEncoding(entropyEncoding: String) {
        cdkBuilder.entropyEncoding(entropyEncoding)
      }

      override fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings.let(IResolvable::unwrap))
      }

      override fun filterSettings(filterSettings: H264FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings.let(H264FilterSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4784a9e838832f79036b52ca493da9f3be2549c718a2984878f69785abd6c8b")
      override fun filterSettings(filterSettings: H264FilterSettingsProperty.Builder.() -> Unit):
          Unit = filterSettings(H264FilterSettingsProperty(filterSettings))

      override fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
      }

      override fun flickerAq(flickerAq: String) {
        cdkBuilder.flickerAq(flickerAq)
      }

      override fun forceFieldPictures(forceFieldPictures: String) {
        cdkBuilder.forceFieldPictures(forceFieldPictures)
      }

      override fun framerateControl(framerateControl: String) {
        cdkBuilder.framerateControl(framerateControl)
      }

      override fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
      }

      override fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
      }

      override fun gopBReference(gopBReference: String) {
        cdkBuilder.gopBReference(gopBReference)
      }

      override fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
      }

      override fun gopNumBFrames(gopNumBFrames: Number) {
        cdkBuilder.gopNumBFrames(gopNumBFrames)
      }

      override fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
      }

      override fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
      }

      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      override fun lookAheadRateControl(lookAheadRateControl: String) {
        cdkBuilder.lookAheadRateControl(lookAheadRateControl)
      }

      override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      override fun minIInterval(minIInterval: Number) {
        cdkBuilder.minIInterval(minIInterval)
      }

      override fun numRefFrames(numRefFrames: Number) {
        cdkBuilder.numRefFrames(numRefFrames)
      }

      override fun parControl(parControl: String) {
        cdkBuilder.parControl(parControl)
      }

      override fun parDenominator(parDenominator: Number) {
        cdkBuilder.parDenominator(parDenominator)
      }

      override fun parNumerator(parNumerator: Number) {
        cdkBuilder.parNumerator(parNumerator)
      }

      override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      override fun qualityLevel(qualityLevel: String) {
        cdkBuilder.qualityLevel(qualityLevel)
      }

      override fun qvbrQualityLevel(qvbrQualityLevel: Number) {
        cdkBuilder.qvbrQualityLevel(qvbrQualityLevel)
      }

      override fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
      }

      override fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
      }

      override fun sceneChangeDetect(sceneChangeDetect: String) {
        cdkBuilder.sceneChangeDetect(sceneChangeDetect)
      }

      override fun slices(slices: Number) {
        cdkBuilder.slices(slices)
      }

      override fun softness(softness: Number) {
        cdkBuilder.softness(softness)
      }

      override fun spatialAq(spatialAq: String) {
        cdkBuilder.spatialAq(spatialAq)
      }

      override fun subgopLength(subgopLength: String) {
        cdkBuilder.subgopLength(subgopLength)
      }

      override fun syntax(syntax: String) {
        cdkBuilder.syntax(syntax)
      }

      override fun temporalAq(temporalAq: String) {
        cdkBuilder.temporalAq(temporalAq)
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62643fd88f34450bd48fc495cc91e3e5239fc404fc1f3ed5e8679376335b6a45")
      override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      override fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty,
    ) : CdkObject(cdkObject), H264SettingsProperty {
      override fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

      override fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun bufFillPct(): Number? = unwrap(this).getBufFillPct()

      override fun bufSize(): Number? = unwrap(this).getBufSize()

      override fun colorMetadata(): String? = unwrap(this).getColorMetadata()

      override fun colorSpaceSettings(): Any? = unwrap(this).getColorSpaceSettings()

      override fun entropyEncoding(): String? = unwrap(this).getEntropyEncoding()

      override fun filterSettings(): Any? = unwrap(this).getFilterSettings()

      override fun fixedAfd(): String? = unwrap(this).getFixedAfd()

      override fun flickerAq(): String? = unwrap(this).getFlickerAq()

      override fun forceFieldPictures(): String? = unwrap(this).getForceFieldPictures()

      override fun framerateControl(): String? = unwrap(this).getFramerateControl()

      override fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

      override fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

      override fun gopBReference(): String? = unwrap(this).getGopBReference()

      override fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

      override fun gopNumBFrames(): Number? = unwrap(this).getGopNumBFrames()

      override fun gopSize(): Number? = unwrap(this).getGopSize()

      override fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

      override fun level(): String? = unwrap(this).getLevel()

      override fun lookAheadRateControl(): String? = unwrap(this).getLookAheadRateControl()

      override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

      override fun minIInterval(): Number? = unwrap(this).getMinIInterval()

      override fun numRefFrames(): Number? = unwrap(this).getNumRefFrames()

      override fun parControl(): String? = unwrap(this).getParControl()

      override fun parDenominator(): Number? = unwrap(this).getParDenominator()

      override fun parNumerator(): Number? = unwrap(this).getParNumerator()

      override fun profile(): String? = unwrap(this).getProfile()

      override fun qualityLevel(): String? = unwrap(this).getQualityLevel()

      override fun qvbrQualityLevel(): Number? = unwrap(this).getQvbrQualityLevel()

      override fun rateControlMode(): String? = unwrap(this).getRateControlMode()

      override fun scanType(): String? = unwrap(this).getScanType()

      override fun sceneChangeDetect(): String? = unwrap(this).getSceneChangeDetect()

      override fun slices(): Number? = unwrap(this).getSlices()

      override fun softness(): Number? = unwrap(this).getSoftness()

      override fun spatialAq(): String? = unwrap(this).getSpatialAq()

      override fun subgopLength(): String? = unwrap(this).getSubgopLength()

      override fun syntax(): String? = unwrap(this).getSyntax()

      override fun temporalAq(): String? = unwrap(this).getTemporalAq()

      override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

      override fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): H264SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty):
          H264SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H264SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty
    }
  }

  public interface TimecodeConfigProperty {
    public fun source(): String? = unwrap(this).getSource()

    public fun syncThreshold(): Number? = unwrap(this).getSyncThreshold()

    @CdkDslMarker
    public interface Builder {
      public fun source(source: String)

      public fun syncThreshold(syncThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty.builder()

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      override fun syncThreshold(syncThreshold: Number) {
        cdkBuilder.syncThreshold(syncThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty,
    ) : CdkObject(cdkObject), TimecodeConfigProperty {
      override fun source(): String? = unwrap(this).getSource()

      override fun syncThreshold(): Number? = unwrap(this).getSyncThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimecodeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty):
          TimecodeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimecodeConfigProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun attenuationControl(attenuationControl: String)

      public fun bitrate(bitrate: Number)

      public fun bitstreamMode(bitstreamMode: String)

      public fun codingMode(codingMode: String)

      public fun dialnorm(dialnorm: Number)

      public fun drcProfile(drcProfile: String)

      public fun lfeFilter(lfeFilter: String)

      public fun metadataControl(metadataControl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty.builder()

      override fun attenuationControl(attenuationControl: String) {
        cdkBuilder.attenuationControl(attenuationControl)
      }

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun bitstreamMode(bitstreamMode: String) {
        cdkBuilder.bitstreamMode(bitstreamMode)
      }

      override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      override fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
      }

      override fun drcProfile(drcProfile: String) {
        cdkBuilder.drcProfile(drcProfile)
      }

      override fun lfeFilter(lfeFilter: String) {
        cdkBuilder.lfeFilter(lfeFilter)
      }

      override fun metadataControl(metadataControl: String) {
        cdkBuilder.metadataControl(metadataControl)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty,
    ) : CdkObject(cdkObject), Ac3SettingsProperty {
      override fun attenuationControl(): String? = unwrap(this).getAttenuationControl()

      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun bitstreamMode(): String? = unwrap(this).getBitstreamMode()

      override fun codingMode(): String? = unwrap(this).getCodingMode()

      override fun dialnorm(): Number? = unwrap(this).getDialnorm()

      override fun drcProfile(): String? = unwrap(this).getDrcProfile()

      override fun lfeFilter(): String? = unwrap(this).getLfeFilter()

      override fun metadataControl(): String? = unwrap(this).getMetadataControl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ac3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty):
          Ac3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ac3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Ac3SettingsProperty
    }
  }

  public interface MotionGraphicsSettingsProperty {
    public fun htmlMotionGraphicsSettings(): Any? = unwrap(this).getHtmlMotionGraphicsSettings()

    @CdkDslMarker
    public interface Builder {
      public fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: IResolvable)

      public
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea95aecca987c781dec9f8f8117be78dd45740fe58cdbdc9a5bee61973ea6ea5")
      public
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty.builder()

      override fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: IResolvable) {
        cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings.let(IResolvable::unwrap))
      }

      override
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty) {
        cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings.let(HtmlMotionGraphicsSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea95aecca987c781dec9f8f8117be78dd45740fe58cdbdc9a5bee61973ea6ea5")
      override
          fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: HtmlMotionGraphicsSettingsProperty.Builder.() -> Unit):
          Unit =
          htmlMotionGraphicsSettings(HtmlMotionGraphicsSettingsProperty(htmlMotionGraphicsSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty,
    ) : CdkObject(cdkObject), MotionGraphicsSettingsProperty {
      override fun htmlMotionGraphicsSettings(): Any? = unwrap(this).getHtmlMotionGraphicsSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MotionGraphicsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty):
          MotionGraphicsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MotionGraphicsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsSettingsProperty
    }
  }

  public interface H265FilterSettingsProperty {
    public fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()

    @CdkDslMarker
    public interface Builder {
      public fun temporalFilterSettings(temporalFilterSettings: IResolvable)

      public fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65928fbd39e48021517a19731dd947e298d3beba075d062f34b8fa48f167175b")
      public
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty.builder()

      override fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(IResolvable::unwrap))
      }

      override fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(TemporalFilterSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65928fbd39e48021517a19731dd947e298d3beba075d062f34b8fa48f167175b")
      override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit):
          Unit = temporalFilterSettings(TemporalFilterSettingsProperty(temporalFilterSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty,
    ) : CdkObject(cdkObject), H265FilterSettingsProperty {
      override fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): H265FilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty):
          H265FilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H265FilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.H265FilterSettingsProperty
    }
  }

  public interface FecOutputSettingsProperty {
    public fun columnDepth(): Number? = unwrap(this).getColumnDepth()

    public fun includeFec(): String? = unwrap(this).getIncludeFec()

    public fun rowLength(): Number? = unwrap(this).getRowLength()

    @CdkDslMarker
    public interface Builder {
      public fun columnDepth(columnDepth: Number)

      public fun includeFec(includeFec: String)

      public fun rowLength(rowLength: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty.builder()

      override fun columnDepth(columnDepth: Number) {
        cdkBuilder.columnDepth(columnDepth)
      }

      override fun includeFec(includeFec: String) {
        cdkBuilder.includeFec(includeFec)
      }

      override fun rowLength(rowLength: Number) {
        cdkBuilder.rowLength(rowLength)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty,
    ) : CdkObject(cdkObject), FecOutputSettingsProperty {
      override fun columnDepth(): Number? = unwrap(this).getColumnDepth()

      override fun includeFec(): String? = unwrap(this).getIncludeFec()

      override fun rowLength(): Number? = unwrap(this).getRowLength()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FecOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty):
          FecOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FecOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun aacSettings(aacSettings: IResolvable)

      public fun aacSettings(aacSettings: AacSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3d8bbb6c06e236e6292600ece96fb30e4abdcf719e39087e5840348da476c3")
      public fun aacSettings(aacSettings: AacSettingsProperty.Builder.() -> Unit)

      public fun ac3Settings(ac3Settings: IResolvable)

      public fun ac3Settings(ac3Settings: Ac3SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e9dec7e39639776b792de10f424b5e64c7a6b1497b3681c1b2a222e702d0bb3")
      public fun ac3Settings(ac3Settings: Ac3SettingsProperty.Builder.() -> Unit)

      public fun eac3AtmosSettings(eac3AtmosSettings: IResolvable)

      public fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46036ada089740fa53234723fce5bc8dab10fc5fd212d766a051f5084871af43")
      public fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty.Builder.() -> Unit)

      public fun eac3Settings(eac3Settings: IResolvable)

      public fun eac3Settings(eac3Settings: Eac3SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e079ab7c3c2717b053f8936d3b8c3a3d0a41c87cc849aedc8165761d9b9b168e")
      public fun eac3Settings(eac3Settings: Eac3SettingsProperty.Builder.() -> Unit)

      public fun mp2Settings(mp2Settings: IResolvable)

      public fun mp2Settings(mp2Settings: Mp2SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd377a944c5b24bc2b89dbb05688227491c4bf7e380f5877e6d0013e968038f")
      public fun mp2Settings(mp2Settings: Mp2SettingsProperty.Builder.() -> Unit)

      public fun passThroughSettings(passThroughSettings: IResolvable)

      public fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c975aa5d5defefacdb94ae44d94fde35164b786bab0bd1de87d32cd1988113a5")
      public
          fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty.Builder.() -> Unit)

      public fun wavSettings(wavSettings: IResolvable)

      public fun wavSettings(wavSettings: WavSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17813353f8d0c733258c398a29a167358c5c1cc2f93bfda1583b8f0701c2c55d")
      public fun wavSettings(wavSettings: WavSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty.builder()

      override fun aacSettings(aacSettings: IResolvable) {
        cdkBuilder.aacSettings(aacSettings.let(IResolvable::unwrap))
      }

      override fun aacSettings(aacSettings: AacSettingsProperty) {
        cdkBuilder.aacSettings(aacSettings.let(AacSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3d8bbb6c06e236e6292600ece96fb30e4abdcf719e39087e5840348da476c3")
      override fun aacSettings(aacSettings: AacSettingsProperty.Builder.() -> Unit): Unit =
          aacSettings(AacSettingsProperty(aacSettings))

      override fun ac3Settings(ac3Settings: IResolvable) {
        cdkBuilder.ac3Settings(ac3Settings.let(IResolvable::unwrap))
      }

      override fun ac3Settings(ac3Settings: Ac3SettingsProperty) {
        cdkBuilder.ac3Settings(ac3Settings.let(Ac3SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e9dec7e39639776b792de10f424b5e64c7a6b1497b3681c1b2a222e702d0bb3")
      override fun ac3Settings(ac3Settings: Ac3SettingsProperty.Builder.() -> Unit): Unit =
          ac3Settings(Ac3SettingsProperty(ac3Settings))

      override fun eac3AtmosSettings(eac3AtmosSettings: IResolvable) {
        cdkBuilder.eac3AtmosSettings(eac3AtmosSettings.let(IResolvable::unwrap))
      }

      override fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty) {
        cdkBuilder.eac3AtmosSettings(eac3AtmosSettings.let(Eac3AtmosSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46036ada089740fa53234723fce5bc8dab10fc5fd212d766a051f5084871af43")
      override
          fun eac3AtmosSettings(eac3AtmosSettings: Eac3AtmosSettingsProperty.Builder.() -> Unit):
          Unit = eac3AtmosSettings(Eac3AtmosSettingsProperty(eac3AtmosSettings))

      override fun eac3Settings(eac3Settings: IResolvable) {
        cdkBuilder.eac3Settings(eac3Settings.let(IResolvable::unwrap))
      }

      override fun eac3Settings(eac3Settings: Eac3SettingsProperty) {
        cdkBuilder.eac3Settings(eac3Settings.let(Eac3SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e079ab7c3c2717b053f8936d3b8c3a3d0a41c87cc849aedc8165761d9b9b168e")
      override fun eac3Settings(eac3Settings: Eac3SettingsProperty.Builder.() -> Unit): Unit =
          eac3Settings(Eac3SettingsProperty(eac3Settings))

      override fun mp2Settings(mp2Settings: IResolvable) {
        cdkBuilder.mp2Settings(mp2Settings.let(IResolvable::unwrap))
      }

      override fun mp2Settings(mp2Settings: Mp2SettingsProperty) {
        cdkBuilder.mp2Settings(mp2Settings.let(Mp2SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd377a944c5b24bc2b89dbb05688227491c4bf7e380f5877e6d0013e968038f")
      override fun mp2Settings(mp2Settings: Mp2SettingsProperty.Builder.() -> Unit): Unit =
          mp2Settings(Mp2SettingsProperty(mp2Settings))

      override fun passThroughSettings(passThroughSettings: IResolvable) {
        cdkBuilder.passThroughSettings(passThroughSettings.let(IResolvable::unwrap))
      }

      override fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty) {
        cdkBuilder.passThroughSettings(passThroughSettings.let(PassThroughSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c975aa5d5defefacdb94ae44d94fde35164b786bab0bd1de87d32cd1988113a5")
      override
          fun passThroughSettings(passThroughSettings: PassThroughSettingsProperty.Builder.() -> Unit):
          Unit = passThroughSettings(PassThroughSettingsProperty(passThroughSettings))

      override fun wavSettings(wavSettings: IResolvable) {
        cdkBuilder.wavSettings(wavSettings.let(IResolvable::unwrap))
      }

      override fun wavSettings(wavSettings: WavSettingsProperty) {
        cdkBuilder.wavSettings(wavSettings.let(WavSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17813353f8d0c733258c398a29a167358c5c1cc2f93bfda1583b8f0701c2c55d")
      override fun wavSettings(wavSettings: WavSettingsProperty.Builder.() -> Unit): Unit =
          wavSettings(WavSettingsProperty(wavSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty,
    ) : CdkObject(cdkObject), AudioCodecSettingsProperty {
      override fun aacSettings(): Any? = unwrap(this).getAacSettings()

      override fun ac3Settings(): Any? = unwrap(this).getAc3Settings()

      override fun eac3AtmosSettings(): Any? = unwrap(this).getEac3AtmosSettings()

      override fun eac3Settings(): Any? = unwrap(this).getEac3Settings()

      override fun mp2Settings(): Any? = unwrap(this).getMp2Settings()

      override fun passThroughSettings(): Any? = unwrap(this).getPassThroughSettings()

      override fun wavSettings(): Any? = unwrap(this).getWavSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioCodecSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty):
          AudioCodecSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioCodecSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty
    }
  }

  public interface Mpeg2FilterSettingsProperty {
    public fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()

    @CdkDslMarker
    public interface Builder {
      public fun temporalFilterSettings(temporalFilterSettings: IResolvable)

      public fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22bbefe6ccacc93679508e1706701d4c45494b961cf4045bcff947b9b3627b5a")
      public
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty.builder()

      override fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(IResolvable::unwrap))
      }

      override fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(TemporalFilterSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22bbefe6ccacc93679508e1706701d4c45494b961cf4045bcff947b9b3627b5a")
      override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit):
          Unit = temporalFilterSettings(TemporalFilterSettingsProperty(temporalFilterSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty,
    ) : CdkObject(cdkObject), Mpeg2FilterSettingsProperty {
      override fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Mpeg2FilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty):
          Mpeg2FilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Mpeg2FilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2FilterSettingsProperty
    }
  }

  public interface EmbeddedDestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty,
    ) : CdkObject(cdkObject), EmbeddedDestinationSettingsProperty

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty
    }
  }

  public interface MultiplexProgramChannelDestinationSettingsProperty {
    public fun multiplexId(): String? = unwrap(this).getMultiplexId()

    public fun programName(): String? = unwrap(this).getProgramName()

    @CdkDslMarker
    public interface Builder {
      public fun multiplexId(multiplexId: String)

      public fun programName(programName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.builder()

      override fun multiplexId(multiplexId: String) {
        cdkBuilder.multiplexId(multiplexId)
      }

      override fun programName(programName: String) {
        cdkBuilder.programName(programName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexProgramChannelDestinationSettingsProperty {
      override fun multiplexId(): String? = unwrap(this).getMultiplexId()

      override fun programName(): String? = unwrap(this).getProgramName()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexProgramChannelDestinationSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun archiveGroupSettings(archiveGroupSettings: IResolvable)

      public fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4974113d5d2cba0b7423c1d194d0262eb916d552b8af23daefcea844afe0a39")
      public
          fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty.Builder.() -> Unit)

      public fun frameCaptureGroupSettings(frameCaptureGroupSettings: IResolvable)

      public
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47f198a83ef74edfc2ae0ee73833037da5b016c1dd5a03421c0fe74859f8b6fc")
      public
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty.Builder.() -> Unit)

      public fun hlsGroupSettings(hlsGroupSettings: IResolvable)

      public fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d1da1b75520e53dfc2a85505a55e57fe5d2e0e10adb797171ac7b2bf2d3776")
      public fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty.Builder.() -> Unit)

      public fun mediaPackageGroupSettings(mediaPackageGroupSettings: IResolvable)

      public
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("896cf8394af2a685df0c139595ab6b3459517c1b361726932f7ff095a5d785b5")
      public
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty.Builder.() -> Unit)

      public fun msSmoothGroupSettings(msSmoothGroupSettings: IResolvable)

      public fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e176d86435dd1cc8f61fc2106bca89a19a04311a732bcd8c1dd9def80845dc90")
      public
          fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty.Builder.() -> Unit)

      public fun multiplexGroupSettings(multiplexGroupSettings: IResolvable)

      public fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5a1025262892dbe9108832edb8a9d312421be63a28567111073acfcfe0b813e")
      public
          fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty.Builder.() -> Unit)

      public fun rtmpGroupSettings(rtmpGroupSettings: IResolvable)

      public fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72d6ef372e33f1e29fcb9a476db73cea06e8ed8486049d9531962c64a08e6031")
      public fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty.Builder.() -> Unit)

      public fun udpGroupSettings(udpGroupSettings: IResolvable)

      public fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5305ece5eca3ce2b7308ab74e84d182d681fdfabb98ea58266083bcf05c1fbb3")
      public fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty.builder()

      override fun archiveGroupSettings(archiveGroupSettings: IResolvable) {
        cdkBuilder.archiveGroupSettings(archiveGroupSettings.let(IResolvable::unwrap))
      }

      override fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty) {
        cdkBuilder.archiveGroupSettings(archiveGroupSettings.let(ArchiveGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4974113d5d2cba0b7423c1d194d0262eb916d552b8af23daefcea844afe0a39")
      override
          fun archiveGroupSettings(archiveGroupSettings: ArchiveGroupSettingsProperty.Builder.() -> Unit):
          Unit = archiveGroupSettings(ArchiveGroupSettingsProperty(archiveGroupSettings))

      override fun frameCaptureGroupSettings(frameCaptureGroupSettings: IResolvable) {
        cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings.let(IResolvable::unwrap))
      }

      override
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty) {
        cdkBuilder.frameCaptureGroupSettings(frameCaptureGroupSettings.let(FrameCaptureGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47f198a83ef74edfc2ae0ee73833037da5b016c1dd5a03421c0fe74859f8b6fc")
      override
          fun frameCaptureGroupSettings(frameCaptureGroupSettings: FrameCaptureGroupSettingsProperty.Builder.() -> Unit):
          Unit =
          frameCaptureGroupSettings(FrameCaptureGroupSettingsProperty(frameCaptureGroupSettings))

      override fun hlsGroupSettings(hlsGroupSettings: IResolvable) {
        cdkBuilder.hlsGroupSettings(hlsGroupSettings.let(IResolvable::unwrap))
      }

      override fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty) {
        cdkBuilder.hlsGroupSettings(hlsGroupSettings.let(HlsGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d1da1b75520e53dfc2a85505a55e57fe5d2e0e10adb797171ac7b2bf2d3776")
      override fun hlsGroupSettings(hlsGroupSettings: HlsGroupSettingsProperty.Builder.() -> Unit):
          Unit = hlsGroupSettings(HlsGroupSettingsProperty(hlsGroupSettings))

      override fun mediaPackageGroupSettings(mediaPackageGroupSettings: IResolvable) {
        cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings.let(IResolvable::unwrap))
      }

      override
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty) {
        cdkBuilder.mediaPackageGroupSettings(mediaPackageGroupSettings.let(MediaPackageGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("896cf8394af2a685df0c139595ab6b3459517c1b361726932f7ff095a5d785b5")
      override
          fun mediaPackageGroupSettings(mediaPackageGroupSettings: MediaPackageGroupSettingsProperty.Builder.() -> Unit):
          Unit =
          mediaPackageGroupSettings(MediaPackageGroupSettingsProperty(mediaPackageGroupSettings))

      override fun msSmoothGroupSettings(msSmoothGroupSettings: IResolvable) {
        cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings.let(IResolvable::unwrap))
      }

      override fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty) {
        cdkBuilder.msSmoothGroupSettings(msSmoothGroupSettings.let(MsSmoothGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e176d86435dd1cc8f61fc2106bca89a19a04311a732bcd8c1dd9def80845dc90")
      override
          fun msSmoothGroupSettings(msSmoothGroupSettings: MsSmoothGroupSettingsProperty.Builder.() -> Unit):
          Unit = msSmoothGroupSettings(MsSmoothGroupSettingsProperty(msSmoothGroupSettings))

      override fun multiplexGroupSettings(multiplexGroupSettings: IResolvable) {
        cdkBuilder.multiplexGroupSettings(multiplexGroupSettings.let(IResolvable::unwrap))
      }

      override fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty) {
        cdkBuilder.multiplexGroupSettings(multiplexGroupSettings.let(MultiplexGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5a1025262892dbe9108832edb8a9d312421be63a28567111073acfcfe0b813e")
      override
          fun multiplexGroupSettings(multiplexGroupSettings: MultiplexGroupSettingsProperty.Builder.() -> Unit):
          Unit = multiplexGroupSettings(MultiplexGroupSettingsProperty(multiplexGroupSettings))

      override fun rtmpGroupSettings(rtmpGroupSettings: IResolvable) {
        cdkBuilder.rtmpGroupSettings(rtmpGroupSettings.let(IResolvable::unwrap))
      }

      override fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty) {
        cdkBuilder.rtmpGroupSettings(rtmpGroupSettings.let(RtmpGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72d6ef372e33f1e29fcb9a476db73cea06e8ed8486049d9531962c64a08e6031")
      override
          fun rtmpGroupSettings(rtmpGroupSettings: RtmpGroupSettingsProperty.Builder.() -> Unit):
          Unit = rtmpGroupSettings(RtmpGroupSettingsProperty(rtmpGroupSettings))

      override fun udpGroupSettings(udpGroupSettings: IResolvable) {
        cdkBuilder.udpGroupSettings(udpGroupSettings.let(IResolvable::unwrap))
      }

      override fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty) {
        cdkBuilder.udpGroupSettings(udpGroupSettings.let(UdpGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5305ece5eca3ce2b7308ab74e84d182d681fdfabb98ea58266083bcf05c1fbb3")
      override fun udpGroupSettings(udpGroupSettings: UdpGroupSettingsProperty.Builder.() -> Unit):
          Unit = udpGroupSettings(UdpGroupSettingsProperty(udpGroupSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty,
    ) : CdkObject(cdkObject), OutputGroupSettingsProperty {
      override fun archiveGroupSettings(): Any? = unwrap(this).getArchiveGroupSettings()

      override fun frameCaptureGroupSettings(): Any? = unwrap(this).getFrameCaptureGroupSettings()

      override fun hlsGroupSettings(): Any? = unwrap(this).getHlsGroupSettings()

      override fun mediaPackageGroupSettings(): Any? = unwrap(this).getMediaPackageGroupSettings()

      override fun msSmoothGroupSettings(): Any? = unwrap(this).getMsSmoothGroupSettings()

      override fun multiplexGroupSettings(): Any? = unwrap(this).getMultiplexGroupSettings()

      override fun rtmpGroupSettings(): Any? = unwrap(this).getRtmpGroupSettings()

      override fun udpGroupSettings(): Any? = unwrap(this).getUdpGroupSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty):
          OutputGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun attenuationControl(attenuationControl: String)

      public fun bitrate(bitrate: Number)

      public fun bitstreamMode(bitstreamMode: String)

      public fun codingMode(codingMode: String)

      public fun dcFilter(dcFilter: String)

      public fun dialnorm(dialnorm: Number)

      public fun drcLine(drcLine: String)

      public fun drcRf(drcRf: String)

      public fun lfeControl(lfeControl: String)

      public fun lfeFilter(lfeFilter: String)

      public fun loRoCenterMixLevel(loRoCenterMixLevel: Number)

      public fun loRoSurroundMixLevel(loRoSurroundMixLevel: Number)

      public fun ltRtCenterMixLevel(ltRtCenterMixLevel: Number)

      public fun ltRtSurroundMixLevel(ltRtSurroundMixLevel: Number)

      public fun metadataControl(metadataControl: String)

      public fun passthroughControl(passthroughControl: String)

      public fun phaseControl(phaseControl: String)

      public fun stereoDownmix(stereoDownmix: String)

      public fun surroundExMode(surroundExMode: String)

      public fun surroundMode(surroundMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty.builder()

      override fun attenuationControl(attenuationControl: String) {
        cdkBuilder.attenuationControl(attenuationControl)
      }

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun bitstreamMode(bitstreamMode: String) {
        cdkBuilder.bitstreamMode(bitstreamMode)
      }

      override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      override fun dcFilter(dcFilter: String) {
        cdkBuilder.dcFilter(dcFilter)
      }

      override fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
      }

      override fun drcLine(drcLine: String) {
        cdkBuilder.drcLine(drcLine)
      }

      override fun drcRf(drcRf: String) {
        cdkBuilder.drcRf(drcRf)
      }

      override fun lfeControl(lfeControl: String) {
        cdkBuilder.lfeControl(lfeControl)
      }

      override fun lfeFilter(lfeFilter: String) {
        cdkBuilder.lfeFilter(lfeFilter)
      }

      override fun loRoCenterMixLevel(loRoCenterMixLevel: Number) {
        cdkBuilder.loRoCenterMixLevel(loRoCenterMixLevel)
      }

      override fun loRoSurroundMixLevel(loRoSurroundMixLevel: Number) {
        cdkBuilder.loRoSurroundMixLevel(loRoSurroundMixLevel)
      }

      override fun ltRtCenterMixLevel(ltRtCenterMixLevel: Number) {
        cdkBuilder.ltRtCenterMixLevel(ltRtCenterMixLevel)
      }

      override fun ltRtSurroundMixLevel(ltRtSurroundMixLevel: Number) {
        cdkBuilder.ltRtSurroundMixLevel(ltRtSurroundMixLevel)
      }

      override fun metadataControl(metadataControl: String) {
        cdkBuilder.metadataControl(metadataControl)
      }

      override fun passthroughControl(passthroughControl: String) {
        cdkBuilder.passthroughControl(passthroughControl)
      }

      override fun phaseControl(phaseControl: String) {
        cdkBuilder.phaseControl(phaseControl)
      }

      override fun stereoDownmix(stereoDownmix: String) {
        cdkBuilder.stereoDownmix(stereoDownmix)
      }

      override fun surroundExMode(surroundExMode: String) {
        cdkBuilder.surroundExMode(surroundExMode)
      }

      override fun surroundMode(surroundMode: String) {
        cdkBuilder.surroundMode(surroundMode)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty,
    ) : CdkObject(cdkObject), Eac3SettingsProperty {
      override fun attenuationControl(): String? = unwrap(this).getAttenuationControl()

      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun bitstreamMode(): String? = unwrap(this).getBitstreamMode()

      override fun codingMode(): String? = unwrap(this).getCodingMode()

      override fun dcFilter(): String? = unwrap(this).getDcFilter()

      override fun dialnorm(): Number? = unwrap(this).getDialnorm()

      override fun drcLine(): String? = unwrap(this).getDrcLine()

      override fun drcRf(): String? = unwrap(this).getDrcRf()

      override fun lfeControl(): String? = unwrap(this).getLfeControl()

      override fun lfeFilter(): String? = unwrap(this).getLfeFilter()

      override fun loRoCenterMixLevel(): Number? = unwrap(this).getLoRoCenterMixLevel()

      override fun loRoSurroundMixLevel(): Number? = unwrap(this).getLoRoSurroundMixLevel()

      override fun ltRtCenterMixLevel(): Number? = unwrap(this).getLtRtCenterMixLevel()

      override fun ltRtSurroundMixLevel(): Number? = unwrap(this).getLtRtSurroundMixLevel()

      override fun metadataControl(): String? = unwrap(this).getMetadataControl()

      override fun passthroughControl(): String? = unwrap(this).getPassthroughControl()

      override fun phaseControl(): String? = unwrap(this).getPhaseControl()

      override fun stereoDownmix(): String? = unwrap(this).getStereoDownmix()

      override fun surroundExMode(): String? = unwrap(this).getSurroundExMode()

      override fun surroundMode(): String? = unwrap(this).getSurroundMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Eac3SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty):
          Eac3SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Eac3SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Eac3SettingsProperty
    }
  }

  public interface H264FilterSettingsProperty {
    public fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()

    @CdkDslMarker
    public interface Builder {
      public fun temporalFilterSettings(temporalFilterSettings: IResolvable)

      public fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("138f62dfbe2b2497cceee7f1ce656cf2de46835f66910fba26851abde99311b8")
      public
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty.builder()

      override fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(IResolvable::unwrap))
      }

      override fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings.let(TemporalFilterSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("138f62dfbe2b2497cceee7f1ce656cf2de46835f66910fba26851abde99311b8")
      override
          fun temporalFilterSettings(temporalFilterSettings: TemporalFilterSettingsProperty.Builder.() -> Unit):
          Unit = temporalFilterSettings(TemporalFilterSettingsProperty(temporalFilterSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty,
    ) : CdkObject(cdkObject), H264FilterSettingsProperty {
      override fun temporalFilterSettings(): Any? = unwrap(this).getTemporalFilterSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): H264FilterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty):
          H264FilterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H264FilterSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.H264FilterSettingsProperty
    }
  }

  public interface KeyProviderSettingsProperty {
    public fun staticKeySettings(): Any? = unwrap(this).getStaticKeySettings()

    @CdkDslMarker
    public interface Builder {
      public fun staticKeySettings(staticKeySettings: IResolvable)

      public fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a12120b72e91dd34a46bf4583553378d1d5e84df7329d78a942e4201a37db7e8")
      public fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty.builder()

      override fun staticKeySettings(staticKeySettings: IResolvable) {
        cdkBuilder.staticKeySettings(staticKeySettings.let(IResolvable::unwrap))
      }

      override fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty) {
        cdkBuilder.staticKeySettings(staticKeySettings.let(StaticKeySettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a12120b72e91dd34a46bf4583553378d1d5e84df7329d78a942e4201a37db7e8")
      override
          fun staticKeySettings(staticKeySettings: StaticKeySettingsProperty.Builder.() -> Unit):
          Unit = staticKeySettings(StaticKeySettingsProperty(staticKeySettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty,
    ) : CdkObject(cdkObject), KeyProviderSettingsProperty {
      override fun staticKeySettings(): Any? = unwrap(this).getStaticKeySettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyProviderSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty):
          KeyProviderSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyProviderSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.KeyProviderSettingsProperty
    }
  }

  public interface MaintenanceUpdateSettingsProperty {
    public fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

    public fun maintenanceScheduledDate(): String? = unwrap(this).getMaintenanceScheduledDate()

    public fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()

    @CdkDslMarker
    public interface Builder {
      public fun maintenanceDay(maintenanceDay: String)

      public fun maintenanceScheduledDate(maintenanceScheduledDate: String)

      public fun maintenanceStartTime(maintenanceStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty.builder()

      override fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
      }

      override fun maintenanceScheduledDate(maintenanceScheduledDate: String) {
        cdkBuilder.maintenanceScheduledDate(maintenanceScheduledDate)
      }

      override fun maintenanceStartTime(maintenanceStartTime: String) {
        cdkBuilder.maintenanceStartTime(maintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty,
    ) : CdkObject(cdkObject), MaintenanceUpdateSettingsProperty {
      override fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

      override fun maintenanceScheduledDate(): String? = unwrap(this).getMaintenanceScheduledDate()

      override fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceUpdateSettingsProperty
    }
  }

  public interface WavSettingsProperty {
    public fun bitDepth(): Number? = unwrap(this).getBitDepth()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun sampleRate(): Number? = unwrap(this).getSampleRate()

    @CdkDslMarker
    public interface Builder {
      public fun bitDepth(bitDepth: Number)

      public fun codingMode(codingMode: String)

      public fun sampleRate(sampleRate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty.builder()

      override fun bitDepth(bitDepth: Number) {
        cdkBuilder.bitDepth(bitDepth)
      }

      override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      override fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty,
    ) : CdkObject(cdkObject), WavSettingsProperty {
      override fun bitDepth(): Number? = unwrap(this).getBitDepth()

      override fun codingMode(): String? = unwrap(this).getCodingMode()

      override fun sampleRate(): Number? = unwrap(this).getSampleRate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WavSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty):
          WavSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WavSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.WavSettingsProperty
    }
  }

  public interface MaintenanceCreateSettingsProperty {
    public fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

    public fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()

    @CdkDslMarker
    public interface Builder {
      public fun maintenanceDay(maintenanceDay: String)

      public fun maintenanceStartTime(maintenanceStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty.builder()

      override fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
      }

      override fun maintenanceStartTime(maintenanceStartTime: String) {
        cdkBuilder.maintenanceStartTime(maintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty,
    ) : CdkObject(cdkObject), MaintenanceCreateSettingsProperty {
      override fun maintenanceDay(): String? = unwrap(this).getMaintenanceDay()

      override fun maintenanceStartTime(): String? = unwrap(this).getMaintenanceStartTime()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MaintenanceCreateSettingsProperty
    }
  }

  public interface AribDestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty,
    ) : CdkObject(cdkObject), AribDestinationSettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AribDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty):
          AribDestinationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AribDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty
    }
  }

  public interface FeatureActivationsProperty {
    public fun inputPrepareScheduleActions(): String? =
        unwrap(this).getInputPrepareScheduleActions()

    public fun outputStaticImageOverlayScheduleActions(): String? =
        unwrap(this).getOutputStaticImageOverlayScheduleActions()

    @CdkDslMarker
    public interface Builder {
      public fun inputPrepareScheduleActions(inputPrepareScheduleActions: String)

      public
          fun outputStaticImageOverlayScheduleActions(outputStaticImageOverlayScheduleActions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty.builder()

      override fun inputPrepareScheduleActions(inputPrepareScheduleActions: String) {
        cdkBuilder.inputPrepareScheduleActions(inputPrepareScheduleActions)
      }

      override
          fun outputStaticImageOverlayScheduleActions(outputStaticImageOverlayScheduleActions: String) {
        cdkBuilder.outputStaticImageOverlayScheduleActions(outputStaticImageOverlayScheduleActions)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty,
    ) : CdkObject(cdkObject), FeatureActivationsProperty {
      override fun inputPrepareScheduleActions(): String? =
          unwrap(this).getInputPrepareScheduleActions()

      override fun outputStaticImageOverlayScheduleActions(): String? =
          unwrap(this).getOutputStaticImageOverlayScheduleActions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FeatureActivationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty):
          FeatureActivationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FeatureActivationsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty
    }
  }

  public interface ArchiveGroupSettingsProperty {
    public fun archiveCdnSettings(): Any? = unwrap(this).getArchiveCdnSettings()

    public fun destination(): Any? = unwrap(this).getDestination()

    public fun rolloverInterval(): Number? = unwrap(this).getRolloverInterval()

    @CdkDslMarker
    public interface Builder {
      public fun archiveCdnSettings(archiveCdnSettings: IResolvable)

      public fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b80cc730b6b2162a011a34d3dcad0860dd4100c68ca411a813152e32071dae0")
      public
          fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty.Builder.() -> Unit)

      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebe47c70734a0f9cb9b1401503411b86635b867034c353504b63fc3e8c52c4bc")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)

      public fun rolloverInterval(rolloverInterval: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty.builder()

      override fun archiveCdnSettings(archiveCdnSettings: IResolvable) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings.let(IResolvable::unwrap))
      }

      override fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings.let(ArchiveCdnSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b80cc730b6b2162a011a34d3dcad0860dd4100c68ca411a813152e32071dae0")
      override
          fun archiveCdnSettings(archiveCdnSettings: ArchiveCdnSettingsProperty.Builder.() -> Unit):
          Unit = archiveCdnSettings(ArchiveCdnSettingsProperty(archiveCdnSettings))

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebe47c70734a0f9cb9b1401503411b86635b867034c353504b63fc3e8c52c4bc")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      override fun rolloverInterval(rolloverInterval: Number) {
        cdkBuilder.rolloverInterval(rolloverInterval)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty,
    ) : CdkObject(cdkObject), ArchiveGroupSettingsProperty {
      override fun archiveCdnSettings(): Any? = unwrap(this).getArchiveCdnSettings()

      override fun destination(): Any? = unwrap(this).getDestination()

      override fun rolloverInterval(): Number? = unwrap(this).getRolloverInterval()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty):
          ArchiveGroupSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty
    }
  }

  public interface NielsenNaesIiNwProperty {
    public fun checkDigitString(): String? = unwrap(this).getCheckDigitString()

    public fun sid(): Number? = unwrap(this).getSid()

    public fun timezone(): String? = unwrap(this).getTimezone()

    @CdkDslMarker
    public interface Builder {
      public fun checkDigitString(checkDigitString: String)

      public fun sid(sid: Number)

      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty.builder()

      override fun checkDigitString(checkDigitString: String) {
        cdkBuilder.checkDigitString(checkDigitString)
      }

      override fun sid(sid: Number) {
        cdkBuilder.sid(sid)
      }

      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty,
    ) : CdkObject(cdkObject), NielsenNaesIiNwProperty {
      override fun checkDigitString(): String? = unwrap(this).getCheckDigitString()

      override fun sid(): Number? = unwrap(this).getSid()

      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NielsenNaesIiNwProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty):
          NielsenNaesIiNwProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NielsenNaesIiNwProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenNaesIiNwProperty
    }
  }

  public interface NielsenCBETProperty {
    public fun cbetCheckDigitString(): String? = unwrap(this).getCbetCheckDigitString()

    public fun cbetStepaside(): String? = unwrap(this).getCbetStepaside()

    public fun csid(): String? = unwrap(this).getCsid()

    @CdkDslMarker
    public interface Builder {
      public fun cbetCheckDigitString(cbetCheckDigitString: String)

      public fun cbetStepaside(cbetStepaside: String)

      public fun csid(csid: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty.builder()

      override fun cbetCheckDigitString(cbetCheckDigitString: String) {
        cdkBuilder.cbetCheckDigitString(cbetCheckDigitString)
      }

      override fun cbetStepaside(cbetStepaside: String) {
        cdkBuilder.cbetStepaside(cbetStepaside)
      }

      override fun csid(csid: String) {
        cdkBuilder.csid(csid)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty,
    ) : CdkObject(cdkObject), NielsenCBETProperty {
      override fun cbetCheckDigitString(): String? = unwrap(this).getCbetCheckDigitString()

      override fun cbetStepaside(): String? = unwrap(this).getCbetStepaside()

      override fun csid(): String? = unwrap(this).getCsid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NielsenCBETProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty):
          NielsenCBETProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NielsenCBETProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.NielsenCBETProperty
    }
  }

  public interface DvbNitSettingsProperty {
    public fun networkId(): Number? = unwrap(this).getNetworkId()

    public fun networkName(): String? = unwrap(this).getNetworkName()

    public fun repInterval(): Number? = unwrap(this).getRepInterval()

    @CdkDslMarker
    public interface Builder {
      public fun networkId(networkId: Number)

      public fun networkName(networkName: String)

      public fun repInterval(repInterval: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty.builder()

      override fun networkId(networkId: Number) {
        cdkBuilder.networkId(networkId)
      }

      override fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
      }

      override fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty,
    ) : CdkObject(cdkObject), DvbNitSettingsProperty {
      override fun networkId(): Number? = unwrap(this).getNetworkId()

      override fun networkName(): String? = unwrap(this).getNetworkName()

      override fun repInterval(): Number? = unwrap(this).getRepInterval()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DvbNitSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty):
          DvbNitSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DvbNitSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty
    }
  }

  public interface H265ColorSpaceSettingsProperty {
    public fun colorSpacePassthroughSettings(): Any? =
        unwrap(this).getColorSpacePassthroughSettings()

    public fun dolbyVision81Settings(): Any? = unwrap(this).getDolbyVision81Settings()

    public fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()

    public fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

    public fun rec709Settings(): Any? = unwrap(this).getRec709Settings()

    @CdkDslMarker
    public interface Builder {
      public fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable)

      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9965f647b90eae7f2b3f71ef17f3e94d9db2335ec498e10c00f38e70f26ac1b")
      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit)

      public fun dolbyVision81Settings(dolbyVision81Settings: IResolvable)

      public fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb0360cbca25a72c00fddb075e3eacd4e05003fd645739c7bd7dd474939eca5c")
      public
          fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty.Builder.() -> Unit)

      public fun hdr10Settings(hdr10Settings: IResolvable)

      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d08816bd3a3b8e97c2a6a0b50d770f7438e8fa5fc8a54dbc7d0bc5eee0faacb9")
      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit)

      public fun rec601Settings(rec601Settings: IResolvable)

      public fun rec601Settings(rec601Settings: Rec601SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bac6dc7c984a5ff7eed46cdaf50f0b32250e21bbbeab31345b4b913c3430f570")
      public fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit)

      public fun rec709Settings(rec709Settings: IResolvable)

      public fun rec709Settings(rec709Settings: Rec709SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ff2691ea97e75495de6d779843eff7f211f3ede6c93bb8eb80d70a37ade8c2e")
      public fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty.builder()

      override fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(IResolvable::unwrap))
      }

      override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(ColorSpacePassthroughSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9965f647b90eae7f2b3f71ef17f3e94d9db2335ec498e10c00f38e70f26ac1b")
      override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit):
          Unit =
          colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty(colorSpacePassthroughSettings))

      override fun dolbyVision81Settings(dolbyVision81Settings: IResolvable) {
        cdkBuilder.dolbyVision81Settings(dolbyVision81Settings.let(IResolvable::unwrap))
      }

      override fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty) {
        cdkBuilder.dolbyVision81Settings(dolbyVision81Settings.let(DolbyVision81SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb0360cbca25a72c00fddb075e3eacd4e05003fd645739c7bd7dd474939eca5c")
      override
          fun dolbyVision81Settings(dolbyVision81Settings: DolbyVision81SettingsProperty.Builder.() -> Unit):
          Unit = dolbyVision81Settings(DolbyVision81SettingsProperty(dolbyVision81Settings))

      override fun hdr10Settings(hdr10Settings: IResolvable) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(IResolvable::unwrap))
      }

      override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(Hdr10SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d08816bd3a3b8e97c2a6a0b50d770f7438e8fa5fc8a54dbc7d0bc5eee0faacb9")
      override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit): Unit =
          hdr10Settings(Hdr10SettingsProperty(hdr10Settings))

      override fun rec601Settings(rec601Settings: IResolvable) {
        cdkBuilder.rec601Settings(rec601Settings.let(IResolvable::unwrap))
      }

      override fun rec601Settings(rec601Settings: Rec601SettingsProperty) {
        cdkBuilder.rec601Settings(rec601Settings.let(Rec601SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bac6dc7c984a5ff7eed46cdaf50f0b32250e21bbbeab31345b4b913c3430f570")
      override fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit): Unit =
          rec601Settings(Rec601SettingsProperty(rec601Settings))

      override fun rec709Settings(rec709Settings: IResolvable) {
        cdkBuilder.rec709Settings(rec709Settings.let(IResolvable::unwrap))
      }

      override fun rec709Settings(rec709Settings: Rec709SettingsProperty) {
        cdkBuilder.rec709Settings(rec709Settings.let(Rec709SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ff2691ea97e75495de6d779843eff7f211f3ede6c93bb8eb80d70a37ade8c2e")
      override fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit): Unit =
          rec709Settings(Rec709SettingsProperty(rec709Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty,
    ) : CdkObject(cdkObject), H265ColorSpaceSettingsProperty {
      override fun colorSpacePassthroughSettings(): Any? =
          unwrap(this).getColorSpacePassthroughSettings()

      override fun dolbyVision81Settings(): Any? = unwrap(this).getDolbyVision81Settings()

      override fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()

      override fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

      override fun rec709Settings(): Any? = unwrap(this).getRec709Settings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): H265ColorSpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty):
          H265ColorSpaceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H265ColorSpaceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty
    }
  }

  public interface Scte35TimeSignalAposProperty {
    public fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

    public fun noRegionalBlackoutFlag(): String? = unwrap(this).getNoRegionalBlackoutFlag()

    public fun webDeliveryAllowedFlag(): String? = unwrap(this).getWebDeliveryAllowedFlag()

    @CdkDslMarker
    public interface Builder {
      public fun adAvailOffset(adAvailOffset: Number)

      public fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String)

      public fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty.builder()

      override fun adAvailOffset(adAvailOffset: Number) {
        cdkBuilder.adAvailOffset(adAvailOffset)
      }

      override fun noRegionalBlackoutFlag(noRegionalBlackoutFlag: String) {
        cdkBuilder.noRegionalBlackoutFlag(noRegionalBlackoutFlag)
      }

      override fun webDeliveryAllowedFlag(webDeliveryAllowedFlag: String) {
        cdkBuilder.webDeliveryAllowedFlag(webDeliveryAllowedFlag)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty,
    ) : CdkObject(cdkObject), Scte35TimeSignalAposProperty {
      override fun adAvailOffset(): Number? = unwrap(this).getAdAvailOffset()

      override fun noRegionalBlackoutFlag(): String? = unwrap(this).getNoRegionalBlackoutFlag()

      override fun webDeliveryAllowedFlag(): String? = unwrap(this).getWebDeliveryAllowedFlag()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Scte35TimeSignalAposProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty):
          Scte35TimeSignalAposProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte35TimeSignalAposProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty
    }
  }

  public interface BlackoutSlateProperty {
    public fun blackoutSlateImage(): Any? = unwrap(this).getBlackoutSlateImage()

    public fun networkEndBlackout(): String? = unwrap(this).getNetworkEndBlackout()

    public fun networkEndBlackoutImage(): Any? = unwrap(this).getNetworkEndBlackoutImage()

    public fun networkId(): String? = unwrap(this).getNetworkId()

    public fun state(): String? = unwrap(this).getState()

    @CdkDslMarker
    public interface Builder {
      public fun blackoutSlateImage(blackoutSlateImage: IResolvable)

      public fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a4bfe7ddb7de6188dce591adb16cc21b40f1effc794e606f15c56b4592f423")
      public fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty.Builder.() -> Unit)

      public fun networkEndBlackout(networkEndBlackout: String)

      public fun networkEndBlackoutImage(networkEndBlackoutImage: IResolvable)

      public fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("662fe3b56989a7090783508b63dce0c8b01436811c3f3d41512dc62da17b7901")
      public
          fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty.Builder.() -> Unit)

      public fun networkId(networkId: String)

      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty.builder()

      override fun blackoutSlateImage(blackoutSlateImage: IResolvable) {
        cdkBuilder.blackoutSlateImage(blackoutSlateImage.let(IResolvable::unwrap))
      }

      override fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty) {
        cdkBuilder.blackoutSlateImage(blackoutSlateImage.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a4bfe7ddb7de6188dce591adb16cc21b40f1effc794e606f15c56b4592f423")
      override fun blackoutSlateImage(blackoutSlateImage: InputLocationProperty.Builder.() -> Unit):
          Unit = blackoutSlateImage(InputLocationProperty(blackoutSlateImage))

      override fun networkEndBlackout(networkEndBlackout: String) {
        cdkBuilder.networkEndBlackout(networkEndBlackout)
      }

      override fun networkEndBlackoutImage(networkEndBlackoutImage: IResolvable) {
        cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage.let(IResolvable::unwrap))
      }

      override fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty) {
        cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("662fe3b56989a7090783508b63dce0c8b01436811c3f3d41512dc62da17b7901")
      override
          fun networkEndBlackoutImage(networkEndBlackoutImage: InputLocationProperty.Builder.() -> Unit):
          Unit = networkEndBlackoutImage(InputLocationProperty(networkEndBlackoutImage))

      override fun networkId(networkId: String) {
        cdkBuilder.networkId(networkId)
      }

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty,
    ) : CdkObject(cdkObject), BlackoutSlateProperty {
      override fun blackoutSlateImage(): Any? = unwrap(this).getBlackoutSlateImage()

      override fun networkEndBlackout(): String? = unwrap(this).getNetworkEndBlackout()

      override fun networkEndBlackoutImage(): Any? = unwrap(this).getNetworkEndBlackoutImage()

      override fun networkId(): String? = unwrap(this).getNetworkId()

      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlackoutSlateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty):
          BlackoutSlateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlackoutSlateProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty
    }
  }

  public interface Scte27SourceSettingsProperty {
    public fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

    public fun pid(): Number? = unwrap(this).getPid()

    @CdkDslMarker
    public interface Builder {
      public fun ocrLanguage(ocrLanguage: String)

      public fun pid(pid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty.builder()

      override fun ocrLanguage(ocrLanguage: String) {
        cdkBuilder.ocrLanguage(ocrLanguage)
      }

      override fun pid(pid: Number) {
        cdkBuilder.pid(pid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty,
    ) : CdkObject(cdkObject), Scte27SourceSettingsProperty {
      override fun ocrLanguage(): String? = unwrap(this).getOcrLanguage()

      override fun pid(): Number? = unwrap(this).getPid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Scte27SourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty):
          Scte27SourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Scte27SourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun connectionRetryInterval(connectionRetryInterval: Number)

      public fun filecacheDuration(filecacheDuration: Number)

      public fun httpTransferMode(httpTransferMode: String)

      public fun numRetries(numRetries: Number)

      public fun restartDelay(restartDelay: Number)

      public fun salt(salt: String)

      public fun token(token: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty.builder()

      override fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
      }

      override fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
      }

      override fun httpTransferMode(httpTransferMode: String) {
        cdkBuilder.httpTransferMode(httpTransferMode)
      }

      override fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
      }

      override fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
      }

      override fun salt(salt: String) {
        cdkBuilder.salt(salt)
      }

      override fun token(token: String) {
        cdkBuilder.token(token)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty,
    ) : CdkObject(cdkObject), HlsAkamaiSettingsProperty {
      override fun connectionRetryInterval(): Number? = unwrap(this).getConnectionRetryInterval()

      override fun filecacheDuration(): Number? = unwrap(this).getFilecacheDuration()

      override fun httpTransferMode(): String? = unwrap(this).getHttpTransferMode()

      override fun numRetries(): Number? = unwrap(this).getNumRetries()

      override fun restartDelay(): Number? = unwrap(this).getRestartDelay()

      override fun salt(): String? = unwrap(this).getSalt()

      override fun token(): String? = unwrap(this).getToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsAkamaiSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty):
          HlsAkamaiSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsAkamaiSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty
    }
  }

  public interface RawSettingsProperty {
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty.builder()

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty,
    ) : CdkObject(cdkObject), RawSettingsProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RawSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty):
          RawSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RawSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty
    }
  }

  public interface TeletextSourceSettingsProperty {
    public fun outputRectangle(): Any? = unwrap(this).getOutputRectangle()

    public fun pageNumber(): String? = unwrap(this).getPageNumber()

    @CdkDslMarker
    public interface Builder {
      public fun outputRectangle(outputRectangle: IResolvable)

      public fun outputRectangle(outputRectangle: CaptionRectangleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89662f7eb20ebf7d562a28fb0e19873d7aa3d5d8c41196753fd2479948bcaa31")
      public fun outputRectangle(outputRectangle: CaptionRectangleProperty.Builder.() -> Unit)

      public fun pageNumber(pageNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty.builder()

      override fun outputRectangle(outputRectangle: IResolvable) {
        cdkBuilder.outputRectangle(outputRectangle.let(IResolvable::unwrap))
      }

      override fun outputRectangle(outputRectangle: CaptionRectangleProperty) {
        cdkBuilder.outputRectangle(outputRectangle.let(CaptionRectangleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89662f7eb20ebf7d562a28fb0e19873d7aa3d5d8c41196753fd2479948bcaa31")
      override fun outputRectangle(outputRectangle: CaptionRectangleProperty.Builder.() -> Unit):
          Unit = outputRectangle(CaptionRectangleProperty(outputRectangle))

      override fun pageNumber(pageNumber: String) {
        cdkBuilder.pageNumber(pageNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty,
    ) : CdkObject(cdkObject), TeletextSourceSettingsProperty {
      override fun outputRectangle(): Any? = unwrap(this).getOutputRectangle()

      override fun pageNumber(): String? = unwrap(this).getPageNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TeletextSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty):
          TeletextSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TeletextSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun initialAudioGain(initialAudioGain: Number)

      public fun inputEndAction(inputEndAction: String)

      public fun inputLossBehavior(inputLossBehavior: IResolvable)

      public fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("452e65136d8633130eff6a66c90b63116ca9f72781ec31729ed8e7ceeeb4b57e")
      public fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty.Builder.() -> Unit)

      public fun outputLockingMode(outputLockingMode: String)

      public fun outputLockingSettings(outputLockingSettings: IResolvable)

      public fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33e1a462c9b03633886fec8f9d3433c0a8c03a70255070d198064ff4392b7f22")
      public
          fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty.Builder.() -> Unit)

      public fun outputTimingSource(outputTimingSource: String)

      public fun supportLowFramerateInputs(supportLowFramerateInputs: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty.builder()

      override fun initialAudioGain(initialAudioGain: Number) {
        cdkBuilder.initialAudioGain(initialAudioGain)
      }

      override fun inputEndAction(inputEndAction: String) {
        cdkBuilder.inputEndAction(inputEndAction)
      }

      override fun inputLossBehavior(inputLossBehavior: IResolvable) {
        cdkBuilder.inputLossBehavior(inputLossBehavior.let(IResolvable::unwrap))
      }

      override fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty) {
        cdkBuilder.inputLossBehavior(inputLossBehavior.let(InputLossBehaviorProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("452e65136d8633130eff6a66c90b63116ca9f72781ec31729ed8e7ceeeb4b57e")
      override
          fun inputLossBehavior(inputLossBehavior: InputLossBehaviorProperty.Builder.() -> Unit):
          Unit = inputLossBehavior(InputLossBehaviorProperty(inputLossBehavior))

      override fun outputLockingMode(outputLockingMode: String) {
        cdkBuilder.outputLockingMode(outputLockingMode)
      }

      override fun outputLockingSettings(outputLockingSettings: IResolvable) {
        cdkBuilder.outputLockingSettings(outputLockingSettings.let(IResolvable::unwrap))
      }

      override fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty) {
        cdkBuilder.outputLockingSettings(outputLockingSettings.let(OutputLockingSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33e1a462c9b03633886fec8f9d3433c0a8c03a70255070d198064ff4392b7f22")
      override
          fun outputLockingSettings(outputLockingSettings: OutputLockingSettingsProperty.Builder.() -> Unit):
          Unit = outputLockingSettings(OutputLockingSettingsProperty(outputLockingSettings))

      override fun outputTimingSource(outputTimingSource: String) {
        cdkBuilder.outputTimingSource(outputTimingSource)
      }

      override fun supportLowFramerateInputs(supportLowFramerateInputs: String) {
        cdkBuilder.supportLowFramerateInputs(supportLowFramerateInputs)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty,
    ) : CdkObject(cdkObject), GlobalConfigurationProperty {
      override fun initialAudioGain(): Number? = unwrap(this).getInitialAudioGain()

      override fun inputEndAction(): String? = unwrap(this).getInputEndAction()

      override fun inputLossBehavior(): Any? = unwrap(this).getInputLossBehavior()

      override fun outputLockingMode(): String? = unwrap(this).getOutputLockingMode()

      override fun outputLockingSettings(): Any? = unwrap(this).getOutputLockingSettings()

      override fun outputTimingSource(): String? = unwrap(this).getOutputTimingSource()

      override fun supportLowFramerateInputs(): String? =
          unwrap(this).getSupportLowFramerateInputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlobalConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty):
          GlobalConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalConfigurationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty
    }
  }

  public interface OutputLockingSettingsProperty {
    public fun epochLockingSettings(): Any? = unwrap(this).getEpochLockingSettings()

    public fun pipelineLockingSettings(): Any? = unwrap(this).getPipelineLockingSettings()

    @CdkDslMarker
    public interface Builder {
      public fun epochLockingSettings(epochLockingSettings: IResolvable)

      public fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fbe7732f40fa05bb3647cf51400e4b1bfaa926f508e4856383c430c83b3834")
      public
          fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty.Builder.() -> Unit)

      public fun pipelineLockingSettings(pipelineLockingSettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty.builder()

      override fun epochLockingSettings(epochLockingSettings: IResolvable) {
        cdkBuilder.epochLockingSettings(epochLockingSettings.let(IResolvable::unwrap))
      }

      override fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty) {
        cdkBuilder.epochLockingSettings(epochLockingSettings.let(EpochLockingSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fbe7732f40fa05bb3647cf51400e4b1bfaa926f508e4856383c430c83b3834")
      override
          fun epochLockingSettings(epochLockingSettings: EpochLockingSettingsProperty.Builder.() -> Unit):
          Unit = epochLockingSettings(EpochLockingSettingsProperty(epochLockingSettings))

      override fun pipelineLockingSettings(pipelineLockingSettings: Any) {
        cdkBuilder.pipelineLockingSettings(pipelineLockingSettings)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty,
    ) : CdkObject(cdkObject), OutputLockingSettingsProperty {
      override fun epochLockingSettings(): Any? = unwrap(this).getEpochLockingSettings()

      override fun pipelineLockingSettings(): Any? = unwrap(this).getPipelineLockingSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputLockingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty):
          OutputLockingSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputLockingSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputLockingSettingsProperty
    }
  }

  public interface EmbeddedSourceSettingsProperty {
    public fun convert608To708(): String? = unwrap(this).getConvert608To708()

    public fun scte20Detection(): String? = unwrap(this).getScte20Detection()

    public fun source608ChannelNumber(): Number? = unwrap(this).getSource608ChannelNumber()

    public fun source608TrackNumber(): Number? = unwrap(this).getSource608TrackNumber()

    @CdkDslMarker
    public interface Builder {
      public fun convert608To708(convert608To708: String)

      public fun scte20Detection(scte20Detection: String)

      public fun source608ChannelNumber(source608ChannelNumber: Number)

      public fun source608TrackNumber(source608TrackNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty.builder()

      override fun convert608To708(convert608To708: String) {
        cdkBuilder.convert608To708(convert608To708)
      }

      override fun scte20Detection(scte20Detection: String) {
        cdkBuilder.scte20Detection(scte20Detection)
      }

      override fun source608ChannelNumber(source608ChannelNumber: Number) {
        cdkBuilder.source608ChannelNumber(source608ChannelNumber)
      }

      override fun source608TrackNumber(source608TrackNumber: Number) {
        cdkBuilder.source608TrackNumber(source608TrackNumber)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty,
    ) : CdkObject(cdkObject), EmbeddedSourceSettingsProperty {
      override fun convert608To708(): String? = unwrap(this).getConvert608To708()

      override fun scte20Detection(): String? = unwrap(this).getScte20Detection()

      override fun source608ChannelNumber(): Number? = unwrap(this).getSource608ChannelNumber()

      override fun source608TrackNumber(): Number? = unwrap(this).getSource608TrackNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EmbeddedSourceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty):
          EmbeddedSourceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmbeddedSourceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty
    }
  }

  public interface VideoSelectorSettingsProperty {
    public fun videoSelectorPid(): Any? = unwrap(this).getVideoSelectorPid()

    public fun videoSelectorProgramId(): Any? = unwrap(this).getVideoSelectorProgramId()

    @CdkDslMarker
    public interface Builder {
      public fun videoSelectorPid(videoSelectorPid: IResolvable)

      public fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b493cd2d8667bed2aaa0a4a99807ca42c8cb76aa5c141820de8d595a470e0b2c")
      public fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty.Builder.() -> Unit)

      public fun videoSelectorProgramId(videoSelectorProgramId: IResolvable)

      public fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26c1c65f209f4c8d5b86051333090e136aae2c00db917fa13b828a3411767e1d")
      public
          fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty.builder()

      override fun videoSelectorPid(videoSelectorPid: IResolvable) {
        cdkBuilder.videoSelectorPid(videoSelectorPid.let(IResolvable::unwrap))
      }

      override fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty) {
        cdkBuilder.videoSelectorPid(videoSelectorPid.let(VideoSelectorPidProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b493cd2d8667bed2aaa0a4a99807ca42c8cb76aa5c141820de8d595a470e0b2c")
      override fun videoSelectorPid(videoSelectorPid: VideoSelectorPidProperty.Builder.() -> Unit):
          Unit = videoSelectorPid(VideoSelectorPidProperty(videoSelectorPid))

      override fun videoSelectorProgramId(videoSelectorProgramId: IResolvable) {
        cdkBuilder.videoSelectorProgramId(videoSelectorProgramId.let(IResolvable::unwrap))
      }

      override fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty) {
        cdkBuilder.videoSelectorProgramId(videoSelectorProgramId.let(VideoSelectorProgramIdProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26c1c65f209f4c8d5b86051333090e136aae2c00db917fa13b828a3411767e1d")
      override
          fun videoSelectorProgramId(videoSelectorProgramId: VideoSelectorProgramIdProperty.Builder.() -> Unit):
          Unit = videoSelectorProgramId(VideoSelectorProgramIdProperty(videoSelectorProgramId))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty,
    ) : CdkObject(cdkObject), VideoSelectorSettingsProperty {
      override fun videoSelectorPid(): Any? = unwrap(this).getVideoSelectorPid()

      override fun videoSelectorProgramId(): Any? = unwrap(this).getVideoSelectorProgramId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoSelectorSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty):
          VideoSelectorSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoSelectorSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adaptiveQuantization(adaptiveQuantization: String)

      public fun afdSignaling(afdSignaling: String)

      public fun colorMetadata(colorMetadata: String)

      public fun colorSpace(colorSpace: String)

      public fun displayAspectRatio(displayAspectRatio: String)

      public fun filterSettings(filterSettings: IResolvable)

      public fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be564491ba4947997cb88f1d39cec65027058d4a110a733024c5643b65190a7e")
      public fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty.Builder.() -> Unit)

      public fun fixedAfd(fixedAfd: String)

      public fun framerateDenominator(framerateDenominator: Number)

      public fun framerateNumerator(framerateNumerator: Number)

      public fun gopClosedCadence(gopClosedCadence: Number)

      public fun gopNumBFrames(gopNumBFrames: Number)

      public fun gopSize(gopSize: Number)

      public fun gopSizeUnits(gopSizeUnits: String)

      public fun scanType(scanType: String)

      public fun subgopLength(subgopLength: String)

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable)

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("511ffd4fd65b23cf75c730359e970a2dc3f39b15bd3384c7f6d4964e48c1bf39")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit)

      public fun timecodeInsertion(timecodeInsertion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty.builder()

      override fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
      }

      override fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
      }

      override fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
      }

      override fun colorSpace(colorSpace: String) {
        cdkBuilder.colorSpace(colorSpace)
      }

      override fun displayAspectRatio(displayAspectRatio: String) {
        cdkBuilder.displayAspectRatio(displayAspectRatio)
      }

      override fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings.let(IResolvable::unwrap))
      }

      override fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings.let(Mpeg2FilterSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be564491ba4947997cb88f1d39cec65027058d4a110a733024c5643b65190a7e")
      override fun filterSettings(filterSettings: Mpeg2FilterSettingsProperty.Builder.() -> Unit):
          Unit = filterSettings(Mpeg2FilterSettingsProperty(filterSettings))

      override fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
      }

      override fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
      }

      override fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
      }

      override fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
      }

      override fun gopNumBFrames(gopNumBFrames: Number) {
        cdkBuilder.gopNumBFrames(gopNumBFrames)
      }

      override fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
      }

      override fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
      }

      override fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
      }

      override fun subgopLength(subgopLength: String) {
        cdkBuilder.subgopLength(subgopLength)
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("511ffd4fd65b23cf75c730359e970a2dc3f39b15bd3384c7f6d4964e48c1bf39")
      override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      override fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty,
    ) : CdkObject(cdkObject), Mpeg2SettingsProperty {
      override fun adaptiveQuantization(): String? = unwrap(this).getAdaptiveQuantization()

      override fun afdSignaling(): String? = unwrap(this).getAfdSignaling()

      override fun colorMetadata(): String? = unwrap(this).getColorMetadata()

      override fun colorSpace(): String? = unwrap(this).getColorSpace()

      override fun displayAspectRatio(): String? = unwrap(this).getDisplayAspectRatio()

      override fun filterSettings(): Any? = unwrap(this).getFilterSettings()

      override fun fixedAfd(): String? = unwrap(this).getFixedAfd()

      override fun framerateDenominator(): Number? = unwrap(this).getFramerateDenominator()

      override fun framerateNumerator(): Number? = unwrap(this).getFramerateNumerator()

      override fun gopClosedCadence(): Number? = unwrap(this).getGopClosedCadence()

      override fun gopNumBFrames(): Number? = unwrap(this).getGopNumBFrames()

      override fun gopSize(): Number? = unwrap(this).getGopSize()

      override fun gopSizeUnits(): String? = unwrap(this).getGopSizeUnits()

      override fun scanType(): String? = unwrap(this).getScanType()

      override fun subgopLength(): String? = unwrap(this).getSubgopLength()

      override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

      override fun timecodeInsertion(): String? = unwrap(this).getTimecodeInsertion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Mpeg2SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty):
          Mpeg2SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Mpeg2SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty
    }
  }

  public interface AudioHlsRenditionSelectionProperty {
    public fun groupId(): String? = unwrap(this).getGroupId()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun groupId(groupId: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty.builder()

      override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty,
    ) : CdkObject(cdkObject), AudioHlsRenditionSelectionProperty {
      override fun groupId(): String? = unwrap(this).getGroupId()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioHlsRenditionSelectionProperty
    }
  }

  public interface Mp2SettingsProperty {
    public fun bitrate(): Number? = unwrap(this).getBitrate()

    public fun codingMode(): String? = unwrap(this).getCodingMode()

    public fun sampleRate(): Number? = unwrap(this).getSampleRate()

    @CdkDslMarker
    public interface Builder {
      public fun bitrate(bitrate: Number)

      public fun codingMode(codingMode: String)

      public fun sampleRate(sampleRate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty.builder()

      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      override fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
      }

      override fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty,
    ) : CdkObject(cdkObject), Mp2SettingsProperty {
      override fun bitrate(): Number? = unwrap(this).getBitrate()

      override fun codingMode(): String? = unwrap(this).getCodingMode()

      override fun sampleRate(): Number? = unwrap(this).getSampleRate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Mp2SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty):
          Mp2SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Mp2SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Mp2SettingsProperty
    }
  }

  public interface VideoSelectorColorSpaceSettingsProperty {
    public fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()

    @CdkDslMarker
    public interface Builder {
      public fun hdr10Settings(hdr10Settings: IResolvable)

      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f20bb5313106114bba895cd120c35561f191f4b705f44a9ada20b65b8c81b4")
      public fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty.builder()

      override fun hdr10Settings(hdr10Settings: IResolvable) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(IResolvable::unwrap))
      }

      override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty) {
        cdkBuilder.hdr10Settings(hdr10Settings.let(Hdr10SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f20bb5313106114bba895cd120c35561f191f4b705f44a9ada20b65b8c81b4")
      override fun hdr10Settings(hdr10Settings: Hdr10SettingsProperty.Builder.() -> Unit): Unit =
          hdr10Settings(Hdr10SettingsProperty(hdr10Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty,
    ) : CdkObject(cdkObject), VideoSelectorColorSpaceSettingsProperty {
      override fun hdr10Settings(): Any? = unwrap(this).getHdr10Settings()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty
    }
  }

  public interface Scte20PlusEmbeddedDestinationSettingsProperty {
    @CdkDslMarker
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty,
    ) : CdkObject(cdkObject), Scte20PlusEmbeddedDestinationSettingsProperty

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty
    }
  }

  public interface InputSpecificationProperty {
    public fun codec(): String? = unwrap(this).getCodec()

    public fun maximumBitrate(): String? = unwrap(this).getMaximumBitrate()

    public fun resolution(): String? = unwrap(this).getResolution()

    @CdkDslMarker
    public interface Builder {
      public fun codec(codec: String)

      public fun maximumBitrate(maximumBitrate: String)

      public fun resolution(resolution: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty.builder()

      override fun codec(codec: String) {
        cdkBuilder.codec(codec)
      }

      override fun maximumBitrate(maximumBitrate: String) {
        cdkBuilder.maximumBitrate(maximumBitrate)
      }

      override fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty,
    ) : CdkObject(cdkObject), InputSpecificationProperty {
      override fun codec(): String? = unwrap(this).getCodec()

      override fun maximumBitrate(): String? = unwrap(this).getMaximumBitrate()

      override fun resolution(): String? = unwrap(this).getResolution()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty):
          InputSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSpecificationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.InputSpecificationProperty
    }
  }

  public interface AudioOnlyHlsSettingsProperty {
    public fun audioGroupId(): String? = unwrap(this).getAudioGroupId()

    public fun audioOnlyImage(): Any? = unwrap(this).getAudioOnlyImage()

    public fun audioTrackType(): String? = unwrap(this).getAudioTrackType()

    public fun segmentType(): String? = unwrap(this).getSegmentType()

    @CdkDslMarker
    public interface Builder {
      public fun audioGroupId(audioGroupId: String)

      public fun audioOnlyImage(audioOnlyImage: IResolvable)

      public fun audioOnlyImage(audioOnlyImage: InputLocationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0b904ecc0cd02d179624f5b7eda3212371cd969fd95cde2563b4f1e64da7ff8")
      public fun audioOnlyImage(audioOnlyImage: InputLocationProperty.Builder.() -> Unit)

      public fun audioTrackType(audioTrackType: String)

      public fun segmentType(segmentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty.builder()

      override fun audioGroupId(audioGroupId: String) {
        cdkBuilder.audioGroupId(audioGroupId)
      }

      override fun audioOnlyImage(audioOnlyImage: IResolvable) {
        cdkBuilder.audioOnlyImage(audioOnlyImage.let(IResolvable::unwrap))
      }

      override fun audioOnlyImage(audioOnlyImage: InputLocationProperty) {
        cdkBuilder.audioOnlyImage(audioOnlyImage.let(InputLocationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0b904ecc0cd02d179624f5b7eda3212371cd969fd95cde2563b4f1e64da7ff8")
      override fun audioOnlyImage(audioOnlyImage: InputLocationProperty.Builder.() -> Unit): Unit =
          audioOnlyImage(InputLocationProperty(audioOnlyImage))

      override fun audioTrackType(audioTrackType: String) {
        cdkBuilder.audioTrackType(audioTrackType)
      }

      override fun segmentType(segmentType: String) {
        cdkBuilder.segmentType(segmentType)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty,
    ) : CdkObject(cdkObject), AudioOnlyHlsSettingsProperty {
      override fun audioGroupId(): String? = unwrap(this).getAudioGroupId()

      override fun audioOnlyImage(): Any? = unwrap(this).getAudioOnlyImage()

      override fun audioTrackType(): String? = unwrap(this).getAudioTrackType()

      override fun segmentType(): String? = unwrap(this).getSegmentType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioOnlyHlsSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty):
          AudioOnlyHlsSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioOnlyHlsSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty
    }
  }

  public interface FrameCaptureSettingsProperty {
    public fun captureInterval(): Number? = unwrap(this).getCaptureInterval()

    public fun captureIntervalUnits(): String? = unwrap(this).getCaptureIntervalUnits()

    public fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()

    @CdkDslMarker
    public interface Builder {
      public fun captureInterval(captureInterval: Number)

      public fun captureIntervalUnits(captureIntervalUnits: String)

      public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable)

      public fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5b4690554ee1d0077f692580204cc0135e0104f7a57fa124127fafa7e75dc43")
      public
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty.builder()

      override fun captureInterval(captureInterval: Number) {
        cdkBuilder.captureInterval(captureInterval)
      }

      override fun captureIntervalUnits(captureIntervalUnits: String) {
        cdkBuilder.captureIntervalUnits(captureIntervalUnits)
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(IResolvable::unwrap))
      }

      override fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings.let(TimecodeBurninSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5b4690554ee1d0077f692580204cc0135e0104f7a57fa124127fafa7e75dc43")
      override
          fun timecodeBurninSettings(timecodeBurninSettings: TimecodeBurninSettingsProperty.Builder.() -> Unit):
          Unit = timecodeBurninSettings(TimecodeBurninSettingsProperty(timecodeBurninSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty,
    ) : CdkObject(cdkObject), FrameCaptureSettingsProperty {
      override fun captureInterval(): Number? = unwrap(this).getCaptureInterval()

      override fun captureIntervalUnits(): String? = unwrap(this).getCaptureIntervalUnits()

      override fun timecodeBurninSettings(): Any? = unwrap(this).getTimecodeBurninSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty):
          FrameCaptureSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty
    }
  }

  public interface InputAttachmentProperty {
    public fun automaticInputFailoverSettings(): Any? =
        unwrap(this).getAutomaticInputFailoverSettings()

    public fun inputAttachmentName(): String? = unwrap(this).getInputAttachmentName()

    public fun inputId(): String? = unwrap(this).getInputId()

    public fun inputSettings(): Any? = unwrap(this).getInputSettings()

    @CdkDslMarker
    public interface Builder {
      public fun automaticInputFailoverSettings(automaticInputFailoverSettings: IResolvable)

      public
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954fc978f58ba5eaf0d23afb3834f555b4f16005f79105ca819f13e721439d3f")
      public
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty.Builder.() -> Unit)

      public fun inputAttachmentName(inputAttachmentName: String)

      public fun inputId(inputId: String)

      public fun inputSettings(inputSettings: IResolvable)

      public fun inputSettings(inputSettings: InputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40fd982f031418e7a89f9e8318bb9b2455be74009e2c8102957b842f53500f5a")
      public fun inputSettings(inputSettings: InputSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty.builder()

      override fun automaticInputFailoverSettings(automaticInputFailoverSettings: IResolvable) {
        cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings.let(IResolvable::unwrap))
      }

      override
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty) {
        cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings.let(AutomaticInputFailoverSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("954fc978f58ba5eaf0d23afb3834f555b4f16005f79105ca819f13e721439d3f")
      override
          fun automaticInputFailoverSettings(automaticInputFailoverSettings: AutomaticInputFailoverSettingsProperty.Builder.() -> Unit):
          Unit =
          automaticInputFailoverSettings(AutomaticInputFailoverSettingsProperty(automaticInputFailoverSettings))

      override fun inputAttachmentName(inputAttachmentName: String) {
        cdkBuilder.inputAttachmentName(inputAttachmentName)
      }

      override fun inputId(inputId: String) {
        cdkBuilder.inputId(inputId)
      }

      override fun inputSettings(inputSettings: IResolvable) {
        cdkBuilder.inputSettings(inputSettings.let(IResolvable::unwrap))
      }

      override fun inputSettings(inputSettings: InputSettingsProperty) {
        cdkBuilder.inputSettings(inputSettings.let(InputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40fd982f031418e7a89f9e8318bb9b2455be74009e2c8102957b842f53500f5a")
      override fun inputSettings(inputSettings: InputSettingsProperty.Builder.() -> Unit): Unit =
          inputSettings(InputSettingsProperty(inputSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty,
    ) : CdkObject(cdkObject), InputAttachmentProperty {
      override fun automaticInputFailoverSettings(): Any? =
          unwrap(this).getAutomaticInputFailoverSettings()

      override fun inputAttachmentName(): String? = unwrap(this).getInputAttachmentName()

      override fun inputId(): String? = unwrap(this).getInputId()

      override fun inputSettings(): Any? = unwrap(this).getInputSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty):
          InputAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputAttachmentProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty
    }
  }

  public interface WebvttDestinationSettingsProperty {
    public fun styleControl(): String? = unwrap(this).getStyleControl()

    @CdkDslMarker
    public interface Builder {
      public fun styleControl(styleControl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty.builder()

      override fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty,
    ) : CdkObject(cdkObject), WebvttDestinationSettingsProperty {
      override fun styleControl(): String? = unwrap(this).getStyleControl()
    }

    public companion object {
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
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun codecSettings(codecSettings: IResolvable)

      public fun codecSettings(codecSettings: VideoCodecSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69dab3e5c50533464654d9f350f7b87163f440f123de1e172b43e62bbf084294")
      public fun codecSettings(codecSettings: VideoCodecSettingsProperty.Builder.() -> Unit)

      public fun height(height: Number)

      public fun name(name: String)

      public fun respondToAfd(respondToAfd: String)

      public fun scalingBehavior(scalingBehavior: String)

      public fun sharpness(sharpness: Number)

      public fun width(width: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty.builder()

      override fun codecSettings(codecSettings: IResolvable) {
        cdkBuilder.codecSettings(codecSettings.let(IResolvable::unwrap))
      }

      override fun codecSettings(codecSettings: VideoCodecSettingsProperty) {
        cdkBuilder.codecSettings(codecSettings.let(VideoCodecSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69dab3e5c50533464654d9f350f7b87163f440f123de1e172b43e62bbf084294")
      override fun codecSettings(codecSettings: VideoCodecSettingsProperty.Builder.() -> Unit): Unit
          = codecSettings(VideoCodecSettingsProperty(codecSettings))

      override fun height(height: Number) {
        cdkBuilder.height(height)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun respondToAfd(respondToAfd: String) {
        cdkBuilder.respondToAfd(respondToAfd)
      }

      override fun scalingBehavior(scalingBehavior: String) {
        cdkBuilder.scalingBehavior(scalingBehavior)
      }

      override fun sharpness(sharpness: Number) {
        cdkBuilder.sharpness(sharpness)
      }

      override fun width(width: Number) {
        cdkBuilder.width(width)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty,
    ) : CdkObject(cdkObject), VideoDescriptionProperty {
      override fun codecSettings(): Any? = unwrap(this).getCodecSettings()

      override fun height(): Number? = unwrap(this).getHeight()

      override fun name(): String? = unwrap(this).getName()

      override fun respondToAfd(): String? = unwrap(this).getRespondToAfd()

      override fun scalingBehavior(): String? = unwrap(this).getScalingBehavior()

      override fun sharpness(): Number? = unwrap(this).getSharpness()

      override fun width(): Number? = unwrap(this).getWidth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty):
          VideoDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoDescriptionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.VideoDescriptionProperty
    }
  }

  public interface FrameCaptureCdnSettingsProperty {
    public fun frameCaptureS3Settings(): Any? = unwrap(this).getFrameCaptureS3Settings()

    @CdkDslMarker
    public interface Builder {
      public fun frameCaptureS3Settings(frameCaptureS3Settings: IResolvable)

      public fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d13d87e77b9a162260c01338cc60dc3b2d0d02413fd8bc9f1ce8a0eedab5b072")
      public
          fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty.builder()

      override fun frameCaptureS3Settings(frameCaptureS3Settings: IResolvable) {
        cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings.let(IResolvable::unwrap))
      }

      override fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty) {
        cdkBuilder.frameCaptureS3Settings(frameCaptureS3Settings.let(FrameCaptureS3SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d13d87e77b9a162260c01338cc60dc3b2d0d02413fd8bc9f1ce8a0eedab5b072")
      override
          fun frameCaptureS3Settings(frameCaptureS3Settings: FrameCaptureS3SettingsProperty.Builder.() -> Unit):
          Unit = frameCaptureS3Settings(FrameCaptureS3SettingsProperty(frameCaptureS3Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty,
    ) : CdkObject(cdkObject), FrameCaptureCdnSettingsProperty {
      override fun frameCaptureS3Settings(): Any? = unwrap(this).getFrameCaptureS3Settings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrameCaptureCdnSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty):
          FrameCaptureCdnSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameCaptureCdnSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun audioDescriptionNames(audioDescriptionNames: List<String>)

      public fun audioDescriptionNames(vararg audioDescriptionNames: String)

      public fun captionDescriptionNames(captionDescriptionNames: List<String>)

      public fun captionDescriptionNames(vararg captionDescriptionNames: String)

      public fun outputName(outputName: String)

      public fun outputSettings(outputSettings: IResolvable)

      public fun outputSettings(outputSettings: OutputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a98bc1584f04fa8a024b754a607451ea1405c99186a5e81bf2f0d23caee1c98")
      public fun outputSettings(outputSettings: OutputSettingsProperty.Builder.() -> Unit)

      public fun videoDescriptionName(videoDescriptionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty.builder()

      override fun audioDescriptionNames(audioDescriptionNames: List<String>) {
        cdkBuilder.audioDescriptionNames(audioDescriptionNames)
      }

      override fun audioDescriptionNames(vararg audioDescriptionNames: String): Unit =
          audioDescriptionNames(audioDescriptionNames.toList())

      override fun captionDescriptionNames(captionDescriptionNames: List<String>) {
        cdkBuilder.captionDescriptionNames(captionDescriptionNames)
      }

      override fun captionDescriptionNames(vararg captionDescriptionNames: String): Unit =
          captionDescriptionNames(captionDescriptionNames.toList())

      override fun outputName(outputName: String) {
        cdkBuilder.outputName(outputName)
      }

      override fun outputSettings(outputSettings: IResolvable) {
        cdkBuilder.outputSettings(outputSettings.let(IResolvable::unwrap))
      }

      override fun outputSettings(outputSettings: OutputSettingsProperty) {
        cdkBuilder.outputSettings(outputSettings.let(OutputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a98bc1584f04fa8a024b754a607451ea1405c99186a5e81bf2f0d23caee1c98")
      override fun outputSettings(outputSettings: OutputSettingsProperty.Builder.() -> Unit): Unit =
          outputSettings(OutputSettingsProperty(outputSettings))

      override fun videoDescriptionName(videoDescriptionName: String) {
        cdkBuilder.videoDescriptionName(videoDescriptionName)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty,
    ) : CdkObject(cdkObject), OutputProperty {
      override fun audioDescriptionNames(): List<String> = unwrap(this).getAudioDescriptionNames()
          ?: emptyList()

      override fun captionDescriptionNames(): List<String> =
          unwrap(this).getCaptionDescriptionNames() ?: emptyList()

      override fun outputName(): String? = unwrap(this).getOutputName()

      override fun outputSettings(): Any? = unwrap(this).getOutputSettings()

      override fun videoDescriptionName(): String? = unwrap(this).getVideoDescriptionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty):
          OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun audioNormalizationSettings(audioNormalizationSettings: IResolvable)

      public
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("216768d41e6e6d1f80bcb8f843aceb98dbc5aed86cc5134a7fc84ee122c996e6")
      public
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty.Builder.() -> Unit)

      public fun audioSelectorName(audioSelectorName: String)

      public fun audioType(audioType: String)

      public fun audioTypeControl(audioTypeControl: String)

      public fun audioWatermarkingSettings(audioWatermarkingSettings: IResolvable)

      public
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e08144084fc63acb6cff58ce1f9ef24cc9a57617e9be88455e6ec17729e6af3")
      public
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty.Builder.() -> Unit)

      public fun codecSettings(codecSettings: IResolvable)

      public fun codecSettings(codecSettings: AudioCodecSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c42506e665d5fcf25b8618524c3292f798a8472eb4f40265596a7a76145f57")
      public fun codecSettings(codecSettings: AudioCodecSettingsProperty.Builder.() -> Unit)

      public fun languageCode(languageCode: String)

      public fun languageCodeControl(languageCodeControl: String)

      public fun name(name: String)

      public fun remixSettings(remixSettings: IResolvable)

      public fun remixSettings(remixSettings: RemixSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297466270cb6d7f67c19dda437ee28668d92ca5958cbc52ba9ba212200abd6e3")
      public fun remixSettings(remixSettings: RemixSettingsProperty.Builder.() -> Unit)

      public fun streamName(streamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty.builder()

      override fun audioNormalizationSettings(audioNormalizationSettings: IResolvable) {
        cdkBuilder.audioNormalizationSettings(audioNormalizationSettings.let(IResolvable::unwrap))
      }

      override
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty) {
        cdkBuilder.audioNormalizationSettings(audioNormalizationSettings.let(AudioNormalizationSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("216768d41e6e6d1f80bcb8f843aceb98dbc5aed86cc5134a7fc84ee122c996e6")
      override
          fun audioNormalizationSettings(audioNormalizationSettings: AudioNormalizationSettingsProperty.Builder.() -> Unit):
          Unit =
          audioNormalizationSettings(AudioNormalizationSettingsProperty(audioNormalizationSettings))

      override fun audioSelectorName(audioSelectorName: String) {
        cdkBuilder.audioSelectorName(audioSelectorName)
      }

      override fun audioType(audioType: String) {
        cdkBuilder.audioType(audioType)
      }

      override fun audioTypeControl(audioTypeControl: String) {
        cdkBuilder.audioTypeControl(audioTypeControl)
      }

      override fun audioWatermarkingSettings(audioWatermarkingSettings: IResolvable) {
        cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings.let(IResolvable::unwrap))
      }

      override
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty) {
        cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings.let(AudioWatermarkSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e08144084fc63acb6cff58ce1f9ef24cc9a57617e9be88455e6ec17729e6af3")
      override
          fun audioWatermarkingSettings(audioWatermarkingSettings: AudioWatermarkSettingsProperty.Builder.() -> Unit):
          Unit =
          audioWatermarkingSettings(AudioWatermarkSettingsProperty(audioWatermarkingSettings))

      override fun codecSettings(codecSettings: IResolvable) {
        cdkBuilder.codecSettings(codecSettings.let(IResolvable::unwrap))
      }

      override fun codecSettings(codecSettings: AudioCodecSettingsProperty) {
        cdkBuilder.codecSettings(codecSettings.let(AudioCodecSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c42506e665d5fcf25b8618524c3292f798a8472eb4f40265596a7a76145f57")
      override fun codecSettings(codecSettings: AudioCodecSettingsProperty.Builder.() -> Unit): Unit
          = codecSettings(AudioCodecSettingsProperty(codecSettings))

      override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      override fun languageCodeControl(languageCodeControl: String) {
        cdkBuilder.languageCodeControl(languageCodeControl)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun remixSettings(remixSettings: IResolvable) {
        cdkBuilder.remixSettings(remixSettings.let(IResolvable::unwrap))
      }

      override fun remixSettings(remixSettings: RemixSettingsProperty) {
        cdkBuilder.remixSettings(remixSettings.let(RemixSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297466270cb6d7f67c19dda437ee28668d92ca5958cbc52ba9ba212200abd6e3")
      override fun remixSettings(remixSettings: RemixSettingsProperty.Builder.() -> Unit): Unit =
          remixSettings(RemixSettingsProperty(remixSettings))

      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty,
    ) : CdkObject(cdkObject), AudioDescriptionProperty {
      override fun audioNormalizationSettings(): Any? = unwrap(this).getAudioNormalizationSettings()

      override fun audioSelectorName(): String? = unwrap(this).getAudioSelectorName()

      override fun audioType(): String? = unwrap(this).getAudioType()

      override fun audioTypeControl(): String? = unwrap(this).getAudioTypeControl()

      override fun audioWatermarkingSettings(): Any? = unwrap(this).getAudioWatermarkingSettings()

      override fun codecSettings(): Any? = unwrap(this).getCodecSettings()

      override fun languageCode(): String? = unwrap(this).getLanguageCode()

      override fun languageCodeControl(): String? = unwrap(this).getLanguageCodeControl()

      override fun name(): String? = unwrap(this).getName()

      override fun remixSettings(): Any? = unwrap(this).getRemixSettings()

      override fun streamName(): String? = unwrap(this).getStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty):
          AudioDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioDescriptionProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty
    }
  }

  public interface ArchiveCdnSettingsProperty {
    public fun archiveS3Settings(): Any? = unwrap(this).getArchiveS3Settings()

    @CdkDslMarker
    public interface Builder {
      public fun archiveS3Settings(archiveS3Settings: IResolvable)

      public fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("250acecba5671297fd79bf23aef4d0a15a8a10ee8362caee84c0b96686eb4498")
      public fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty.builder()

      override fun archiveS3Settings(archiveS3Settings: IResolvable) {
        cdkBuilder.archiveS3Settings(archiveS3Settings.let(IResolvable::unwrap))
      }

      override fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty) {
        cdkBuilder.archiveS3Settings(archiveS3Settings.let(ArchiveS3SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("250acecba5671297fd79bf23aef4d0a15a8a10ee8362caee84c0b96686eb4498")
      override
          fun archiveS3Settings(archiveS3Settings: ArchiveS3SettingsProperty.Builder.() -> Unit):
          Unit = archiveS3Settings(ArchiveS3SettingsProperty(archiveS3Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty,
    ) : CdkObject(cdkObject), ArchiveCdnSettingsProperty {
      override fun archiveS3Settings(): Any? = unwrap(this).getArchiveS3Settings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveCdnSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty):
          ArchiveCdnSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveCdnSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun audioFramesPerPes(audioFramesPerPes: Number)

      public fun audioPids(audioPids: String)

      public fun ecmPid(ecmPid: String)

      public fun klvBehavior(klvBehavior: String)

      public fun klvDataPids(klvDataPids: String)

      public fun nielsenId3Behavior(nielsenId3Behavior: String)

      public fun patInterval(patInterval: Number)

      public fun pcrControl(pcrControl: String)

      public fun pcrPeriod(pcrPeriod: Number)

      public fun pcrPid(pcrPid: String)

      public fun pmtInterval(pmtInterval: Number)

      public fun pmtPid(pmtPid: String)

      public fun programNum(programNum: Number)

      public fun scte35Behavior(scte35Behavior: String)

      public fun scte35Pid(scte35Pid: String)

      public fun timedMetadataBehavior(timedMetadataBehavior: String)

      public fun timedMetadataPid(timedMetadataPid: String)

      public fun transportStreamId(transportStreamId: Number)

      public fun videoPid(videoPid: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty.builder()

      override fun audioFramesPerPes(audioFramesPerPes: Number) {
        cdkBuilder.audioFramesPerPes(audioFramesPerPes)
      }

      override fun audioPids(audioPids: String) {
        cdkBuilder.audioPids(audioPids)
      }

      override fun ecmPid(ecmPid: String) {
        cdkBuilder.ecmPid(ecmPid)
      }

      override fun klvBehavior(klvBehavior: String) {
        cdkBuilder.klvBehavior(klvBehavior)
      }

      override fun klvDataPids(klvDataPids: String) {
        cdkBuilder.klvDataPids(klvDataPids)
      }

      override fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
      }

      override fun patInterval(patInterval: Number) {
        cdkBuilder.patInterval(patInterval)
      }

      override fun pcrControl(pcrControl: String) {
        cdkBuilder.pcrControl(pcrControl)
      }

      override fun pcrPeriod(pcrPeriod: Number) {
        cdkBuilder.pcrPeriod(pcrPeriod)
      }

      override fun pcrPid(pcrPid: String) {
        cdkBuilder.pcrPid(pcrPid)
      }

      override fun pmtInterval(pmtInterval: Number) {
        cdkBuilder.pmtInterval(pmtInterval)
      }

      override fun pmtPid(pmtPid: String) {
        cdkBuilder.pmtPid(pmtPid)
      }

      override fun programNum(programNum: Number) {
        cdkBuilder.programNum(programNum)
      }

      override fun scte35Behavior(scte35Behavior: String) {
        cdkBuilder.scte35Behavior(scte35Behavior)
      }

      override fun scte35Pid(scte35Pid: String) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      override fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
      }

      override fun timedMetadataPid(timedMetadataPid: String) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
      }

      override fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
      }

      override fun videoPid(videoPid: String) {
        cdkBuilder.videoPid(videoPid)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty,
    ) : CdkObject(cdkObject), M3u8SettingsProperty {
      override fun audioFramesPerPes(): Number? = unwrap(this).getAudioFramesPerPes()

      override fun audioPids(): String? = unwrap(this).getAudioPids()

      override fun ecmPid(): String? = unwrap(this).getEcmPid()

      override fun klvBehavior(): String? = unwrap(this).getKlvBehavior()

      override fun klvDataPids(): String? = unwrap(this).getKlvDataPids()

      override fun nielsenId3Behavior(): String? = unwrap(this).getNielsenId3Behavior()

      override fun patInterval(): Number? = unwrap(this).getPatInterval()

      override fun pcrControl(): String? = unwrap(this).getPcrControl()

      override fun pcrPeriod(): Number? = unwrap(this).getPcrPeriod()

      override fun pcrPid(): String? = unwrap(this).getPcrPid()

      override fun pmtInterval(): Number? = unwrap(this).getPmtInterval()

      override fun pmtPid(): String? = unwrap(this).getPmtPid()

      override fun programNum(): Number? = unwrap(this).getProgramNum()

      override fun scte35Behavior(): String? = unwrap(this).getScte35Behavior()

      override fun scte35Pid(): String? = unwrap(this).getScte35Pid()

      override fun timedMetadataBehavior(): String? = unwrap(this).getTimedMetadataBehavior()

      override fun timedMetadataPid(): String? = unwrap(this).getTimedMetadataPid()

      override fun transportStreamId(): Number? = unwrap(this).getTransportStreamId()

      override fun videoPid(): String? = unwrap(this).getVideoPid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): M3u8SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty):
          M3u8SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: M3u8SettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.M3u8SettingsProperty
    }
  }

  public interface MultiplexOutputSettingsProperty {
    public fun destination(): Any? = unwrap(this).getDestination()

    @CdkDslMarker
    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: OutputLocationRefProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a769fabdcb8bbc2fbfed33b9c962ee1fe84bb6e7196dae0feee82db66870f2")
      public fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: OutputLocationRefProperty) {
        cdkBuilder.destination(destination.let(OutputLocationRefProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a769fabdcb8bbc2fbfed33b9c962ee1fe84bb6e7196dae0feee82db66870f2")
      override fun destination(destination: OutputLocationRefProperty.Builder.() -> Unit): Unit =
          destination(OutputLocationRefProperty(destination))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexOutputSettingsProperty {
      override fun destination(): Any? = unwrap(this).getDestination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexOutputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty):
          MultiplexOutputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexOutputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.MultiplexOutputSettingsProperty
    }
  }

  public interface OutputGroupProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun outputGroupSettings(): Any? = unwrap(this).getOutputGroupSettings()

    public fun outputs(): Any? = unwrap(this).getOutputs()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun outputGroupSettings(outputGroupSettings: IResolvable)

      public fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd44c528858248e89969298ab25840235ecefbd41ff8ea355b500fc678dadb4b")
      public
          fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty.Builder.() -> Unit)

      public fun outputs(outputs: IResolvable)

      public fun outputs(outputs: List<Any>)

      public fun outputs(vararg outputs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun outputGroupSettings(outputGroupSettings: IResolvable) {
        cdkBuilder.outputGroupSettings(outputGroupSettings.let(IResolvable::unwrap))
      }

      override fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty) {
        cdkBuilder.outputGroupSettings(outputGroupSettings.let(OutputGroupSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd44c528858248e89969298ab25840235ecefbd41ff8ea355b500fc678dadb4b")
      override
          fun outputGroupSettings(outputGroupSettings: OutputGroupSettingsProperty.Builder.() -> Unit):
          Unit = outputGroupSettings(OutputGroupSettingsProperty(outputGroupSettings))

      override fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
      }

      override fun outputs(outputs: List<Any>) {
        cdkBuilder.outputs(outputs)
      }

      override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty,
    ) : CdkObject(cdkObject), OutputGroupProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun outputGroupSettings(): Any? = unwrap(this).getOutputGroupSettings()

      override fun outputs(): Any? = unwrap(this).getOutputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty):
          OutputGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputGroupProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.OutputGroupProperty
    }
  }

  public interface H264ColorSpaceSettingsProperty {
    public fun colorSpacePassthroughSettings(): Any? =
        unwrap(this).getColorSpacePassthroughSettings()

    public fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

    public fun rec709Settings(): Any? = unwrap(this).getRec709Settings()

    @CdkDslMarker
    public interface Builder {
      public fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable)

      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("453cd7e3dd70ab3d39b2d1a987818873b1720aea9573a51e253eda5a40b0a71c")
      public
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit)

      public fun rec601Settings(rec601Settings: IResolvable)

      public fun rec601Settings(rec601Settings: Rec601SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c3773ba753bd5a1459a519395fcda14f1a6f48030d19c071d4a7d003eba1b0c")
      public fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit)

      public fun rec709Settings(rec709Settings: IResolvable)

      public fun rec709Settings(rec709Settings: Rec709SettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08b60bc9f6c9d6702c1694a28e40a608ec2b81456631dd8b5181cde7e242f35b")
      public fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty.builder()

      override fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: IResolvable) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(IResolvable::unwrap))
      }

      override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty) {
        cdkBuilder.colorSpacePassthroughSettings(colorSpacePassthroughSettings.let(ColorSpacePassthroughSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("453cd7e3dd70ab3d39b2d1a987818873b1720aea9573a51e253eda5a40b0a71c")
      override
          fun colorSpacePassthroughSettings(colorSpacePassthroughSettings: ColorSpacePassthroughSettingsProperty.Builder.() -> Unit):
          Unit =
          colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty(colorSpacePassthroughSettings))

      override fun rec601Settings(rec601Settings: IResolvable) {
        cdkBuilder.rec601Settings(rec601Settings.let(IResolvable::unwrap))
      }

      override fun rec601Settings(rec601Settings: Rec601SettingsProperty) {
        cdkBuilder.rec601Settings(rec601Settings.let(Rec601SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c3773ba753bd5a1459a519395fcda14f1a6f48030d19c071d4a7d003eba1b0c")
      override fun rec601Settings(rec601Settings: Rec601SettingsProperty.Builder.() -> Unit): Unit =
          rec601Settings(Rec601SettingsProperty(rec601Settings))

      override fun rec709Settings(rec709Settings: IResolvable) {
        cdkBuilder.rec709Settings(rec709Settings.let(IResolvable::unwrap))
      }

      override fun rec709Settings(rec709Settings: Rec709SettingsProperty) {
        cdkBuilder.rec709Settings(rec709Settings.let(Rec709SettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08b60bc9f6c9d6702c1694a28e40a608ec2b81456631dd8b5181cde7e242f35b")
      override fun rec709Settings(rec709Settings: Rec709SettingsProperty.Builder.() -> Unit): Unit =
          rec709Settings(Rec709SettingsProperty(rec709Settings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty,
    ) : CdkObject(cdkObject), H264ColorSpaceSettingsProperty {
      override fun colorSpacePassthroughSettings(): Any? =
          unwrap(this).getColorSpacePassthroughSettings()

      override fun rec601Settings(): Any? = unwrap(this).getRec601Settings()

      override fun rec709Settings(): Any? = unwrap(this).getRec709Settings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): H264ColorSpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty):
          H264ColorSpaceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: H264ColorSpaceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty
    }
  }

  public interface CdiInputSpecificationProperty {
    public fun resolution(): String? = unwrap(this).getResolution()

    @CdkDslMarker
    public interface Builder {
      public fun resolution(resolution: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty.builder()

      override fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty,
    ) : CdkObject(cdkObject), CdiInputSpecificationProperty {
      override fun resolution(): String? = unwrap(this).getResolution()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CdiInputSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty):
          CdiInputSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CdiInputSpecificationProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.CdiInputSpecificationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun audioSelectors(audioSelectors: IResolvable)

      public fun audioSelectors(audioSelectors: List<Any>)

      public fun audioSelectors(vararg audioSelectors: Any)

      public fun captionSelectors(captionSelectors: IResolvable)

      public fun captionSelectors(captionSelectors: List<Any>)

      public fun captionSelectors(vararg captionSelectors: Any)

      public fun deblockFilter(deblockFilter: String)

      public fun denoiseFilter(denoiseFilter: String)

      public fun filterStrength(filterStrength: Number)

      public fun inputFilter(inputFilter: String)

      public fun networkInputSettings(networkInputSettings: IResolvable)

      public fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd1926c05f2854910e295cb271ef5e0c13c3594dd7c9a0ac19b6e99cac82211")
      public
          fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty.Builder.() -> Unit)

      public fun scte35Pid(scte35Pid: Number)

      public fun smpte2038DataPreference(smpte2038DataPreference: String)

      public fun sourceEndBehavior(sourceEndBehavior: String)

      public fun videoSelector(videoSelector: IResolvable)

      public fun videoSelector(videoSelector: VideoSelectorProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e82eb43173605a3c4a5e230255e7f4f2b72fe85c5f6c4f217ce63856b8f00323")
      public fun videoSelector(videoSelector: VideoSelectorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty.builder()

      override fun audioSelectors(audioSelectors: IResolvable) {
        cdkBuilder.audioSelectors(audioSelectors.let(IResolvable::unwrap))
      }

      override fun audioSelectors(audioSelectors: List<Any>) {
        cdkBuilder.audioSelectors(audioSelectors)
      }

      override fun audioSelectors(vararg audioSelectors: Any): Unit =
          audioSelectors(audioSelectors.toList())

      override fun captionSelectors(captionSelectors: IResolvable) {
        cdkBuilder.captionSelectors(captionSelectors.let(IResolvable::unwrap))
      }

      override fun captionSelectors(captionSelectors: List<Any>) {
        cdkBuilder.captionSelectors(captionSelectors)
      }

      override fun captionSelectors(vararg captionSelectors: Any): Unit =
          captionSelectors(captionSelectors.toList())

      override fun deblockFilter(deblockFilter: String) {
        cdkBuilder.deblockFilter(deblockFilter)
      }

      override fun denoiseFilter(denoiseFilter: String) {
        cdkBuilder.denoiseFilter(denoiseFilter)
      }

      override fun filterStrength(filterStrength: Number) {
        cdkBuilder.filterStrength(filterStrength)
      }

      override fun inputFilter(inputFilter: String) {
        cdkBuilder.inputFilter(inputFilter)
      }

      override fun networkInputSettings(networkInputSettings: IResolvable) {
        cdkBuilder.networkInputSettings(networkInputSettings.let(IResolvable::unwrap))
      }

      override fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty) {
        cdkBuilder.networkInputSettings(networkInputSettings.let(NetworkInputSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccd1926c05f2854910e295cb271ef5e0c13c3594dd7c9a0ac19b6e99cac82211")
      override
          fun networkInputSettings(networkInputSettings: NetworkInputSettingsProperty.Builder.() -> Unit):
          Unit = networkInputSettings(NetworkInputSettingsProperty(networkInputSettings))

      override fun scte35Pid(scte35Pid: Number) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      override fun smpte2038DataPreference(smpte2038DataPreference: String) {
        cdkBuilder.smpte2038DataPreference(smpte2038DataPreference)
      }

      override fun sourceEndBehavior(sourceEndBehavior: String) {
        cdkBuilder.sourceEndBehavior(sourceEndBehavior)
      }

      override fun videoSelector(videoSelector: IResolvable) {
        cdkBuilder.videoSelector(videoSelector.let(IResolvable::unwrap))
      }

      override fun videoSelector(videoSelector: VideoSelectorProperty) {
        cdkBuilder.videoSelector(videoSelector.let(VideoSelectorProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e82eb43173605a3c4a5e230255e7f4f2b72fe85c5f6c4f217ce63856b8f00323")
      override fun videoSelector(videoSelector: VideoSelectorProperty.Builder.() -> Unit): Unit =
          videoSelector(VideoSelectorProperty(videoSelector))

      public fun build(): software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty,
    ) : CdkObject(cdkObject), InputSettingsProperty {
      override fun audioSelectors(): Any? = unwrap(this).getAudioSelectors()

      override fun captionSelectors(): Any? = unwrap(this).getCaptionSelectors()

      override fun deblockFilter(): String? = unwrap(this).getDeblockFilter()

      override fun denoiseFilter(): String? = unwrap(this).getDenoiseFilter()

      override fun filterStrength(): Number? = unwrap(this).getFilterStrength()

      override fun inputFilter(): String? = unwrap(this).getInputFilter()

      override fun networkInputSettings(): Any? = unwrap(this).getNetworkInputSettings()

      override fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

      override fun smpte2038DataPreference(): String? = unwrap(this).getSmpte2038DataPreference()

      override fun sourceEndBehavior(): String? = unwrap(this).getSourceEndBehavior()

      override fun videoSelector(): Any? = unwrap(this).getVideoSelector()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty):
          InputSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty
    }
  }
}
