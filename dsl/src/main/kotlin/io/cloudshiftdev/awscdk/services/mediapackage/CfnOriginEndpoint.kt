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

public open class CfnOriginEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  public open fun authorization(): Any? = unwrap(this).getAuthorization()

  public open fun authorization(`value`: IResolvable) {
    unwrap(this).setAuthorization(`value`.let(IResolvable::unwrap))
  }

  public open fun authorization(`value`: AuthorizationProperty) {
    unwrap(this).setAuthorization(`value`.let(AuthorizationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c0bdcf2382d217003371a366e735b1d08a2be7a8be28a026b56c3364dacdad")
  public open fun authorization(`value`: AuthorizationProperty.Builder.() -> Unit): Unit =
      authorization(AuthorizationProperty(`value`))

  public open fun channelId(): String = unwrap(this).getChannelId()

  public open fun channelId(`value`: String) {
    unwrap(this).setChannelId(`value`)
  }

  public open fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  public open fun cmafPackage(`value`: IResolvable) {
    unwrap(this).setCmafPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun cmafPackage(`value`: CmafPackageProperty) {
    unwrap(this).setCmafPackage(`value`.let(CmafPackageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b649452bb1089e65f94e54e1400a0d9c1d77d031581f4e4ccec7a6612bacdc5f")
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
  @JvmName("61a997a92b16e411079cf7310c606f5cad8d8763dadbb5f8dd0bf92239164862")
  public open fun dashPackage(`value`: DashPackageProperty.Builder.() -> Unit): Unit =
      dashPackage(DashPackageProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  public open fun hlsPackage(`value`: IResolvable) {
    unwrap(this).setHlsPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun hlsPackage(`value`: HlsPackageProperty) {
    unwrap(this).setHlsPackage(`value`.let(HlsPackageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7b69d1fa6edccb0188749d2de59b7cab4ccdad804e4becf37912f64eae8d73a2")
  public open fun hlsPackage(`value`: HlsPackageProperty.Builder.() -> Unit): Unit =
      hlsPackage(HlsPackageProperty(`value`))

  public open fun id(): String = unwrap(this).getId()

  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun manifestName(): String? = unwrap(this).getManifestName()

  public open fun manifestName(`value`: String) {
    unwrap(this).setManifestName(`value`)
  }

  public open fun mssPackage(): Any? = unwrap(this).getMssPackage()

  public open fun mssPackage(`value`: IResolvable) {
    unwrap(this).setMssPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun mssPackage(`value`: MssPackageProperty) {
    unwrap(this).setMssPackage(`value`.let(MssPackageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8724e6a3fc876d57f781026f5c786c3244160a0b6738ca0953cc03abb5d2d28")
  public open fun mssPackage(`value`: MssPackageProperty.Builder.() -> Unit): Unit =
      mssPackage(MssPackageProperty(`value`))

  public open fun origination(): String? = unwrap(this).getOrigination()

  public open fun origination(`value`: String) {
    unwrap(this).setOrigination(`value`)
  }

  public open fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  public open fun startoverWindowSeconds(`value`: Number) {
    unwrap(this).setStartoverWindowSeconds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

  public open fun timeDelaySeconds(`value`: Number) {
    unwrap(this).setTimeDelaySeconds(`value`)
  }

  public open fun whitelist(): List<String> = unwrap(this).getWhitelist() ?: emptyList()

  public open fun whitelist(`value`: List<String>) {
    unwrap(this).setWhitelist(`value`)
  }

  public interface Builder {
    public fun authorization(authorization: IResolvable) {
    }

    public fun authorization(authorization: AuthorizationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97fcf3e9063ad56e7085d7c35a18890a28370cabd5ef99a38f46be5db7b69107")
    public fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit) {
    }

    public fun channelId(channelId: String) {
    }

    public fun cmafPackage(cmafPackage: IResolvable) {
    }

    public fun cmafPackage(cmafPackage: CmafPackageProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa5760a41763aac28b9e675a3b40c4e18606545322da91febad65639153df08")
    public fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit) {
    }

    public fun dashPackage(dashPackage: IResolvable) {
    }

    public fun dashPackage(dashPackage: DashPackageProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7b8292e6e0e6a0d73c620650197ed90918cd10e794c28f5bef40278c14926e")
    public fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun hlsPackage(hlsPackage: IResolvable) {
    }

    public fun hlsPackage(hlsPackage: HlsPackageProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b04ac551306ae3ac6c2d3d4f1f64dbdf984e40f7166ffd884b7c18e7705e978")
    public fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit) {
    }

    public fun id(id: String) {
    }

    public fun manifestName(manifestName: String) {
    }

    public fun mssPackage(mssPackage: IResolvable) {
    }

    public fun mssPackage(mssPackage: MssPackageProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fd056cbafc82c1730dc05dd4c3dc0d7502008627714d8b3e0a5c7700e49ba0")
    public fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit) {
    }

    public fun origination(origination: String) {
    }

    public fun startoverWindowSeconds(startoverWindowSeconds: Number) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun timeDelaySeconds(timeDelaySeconds: Number) {
    }

    public fun whitelist(whitelist: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.Builder =
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.Builder.create(scope, id)

    public override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    public override fun authorization(authorization: AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(AuthorizationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97fcf3e9063ad56e7085d7c35a18890a28370cabd5ef99a38f46be5db7b69107")
    public override fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit): Unit
        = authorization(AuthorizationProperty(authorization))

    public override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    public override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    public override fun cmafPackage(cmafPackage: CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CmafPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa5760a41763aac28b9e675a3b40c4e18606545322da91febad65639153df08")
    public override fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit): Unit =
        cmafPackage(CmafPackageProperty(cmafPackage))

    public override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    public override fun dashPackage(dashPackage: DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(DashPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7b8292e6e0e6a0d73c620650197ed90918cd10e794c28f5bef40278c14926e")
    public override fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit): Unit =
        dashPackage(DashPackageProperty(dashPackage))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    public override fun hlsPackage(hlsPackage: HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(HlsPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b04ac551306ae3ac6c2d3d4f1f64dbdf984e40f7166ffd884b7c18e7705e978")
    public override fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit): Unit =
        hlsPackage(HlsPackageProperty(hlsPackage))

    public override fun id(id: String) {
      cdkBuilder.id(id)
    }

    public override fun manifestName(manifestName: String) {
      cdkBuilder.manifestName(manifestName)
    }

    public override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    public override fun mssPackage(mssPackage: MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(MssPackageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fd056cbafc82c1730dc05dd4c3dc0d7502008627714d8b3e0a5c7700e49ba0")
    public override fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit): Unit =
        mssPackage(MssPackageProperty(mssPackage))

    public override fun origination(origination: String) {
      cdkBuilder.origination(origination)
    }

    public override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun timeDelaySeconds(timeDelaySeconds: Number) {
      cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    public override fun whitelist(whitelist: List<String>) {
      cdkBuilder.whitelist(whitelist)
    }

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint =
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint):
        CfnOriginEndpoint = CfnOriginEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpoint):
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint = wrapped.cdkObject
  }

  public interface MssPackageProperty {
    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    public interface Builder {
      public fun encryption(encryption: IResolvable) {
      }

      public fun encryption(encryption: MssEncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6440d39ca8d9a8c40d15cf80df5bd57e971d7d2bd1803cd4107003b46af13628")
      public fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit) {
      }

      public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
      }

      public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
      }

      public fun streamSelection(streamSelection: IResolvable) {
      }

      public fun streamSelection(streamSelection: StreamSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4175e1ef5ed609f7966bcfad0b3aeb10b8b4956ec2e456c2f1057f60ebb641a9")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty.builder()

      public override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      public override fun encryption(encryption: MssEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(MssEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6440d39ca8d9a8c40d15cf80df5bd57e971d7d2bd1803cd4107003b46af13628")
      public override fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(MssEncryptionProperty(encryption))

      public override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      public override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      public override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4175e1ef5ed609f7966bcfad0b3aeb10b8b4956ec2e456c2f1057f60ebb641a9")
      public override
          fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit): Unit =
          streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty,
    ) : MssPackageProperty {
      public override fun encryption(): Any? = unwrap(this).getEncryption()

      public override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      public override fun segmentDurationSeconds(): Number? =
          unwrap(this).getSegmentDurationSeconds()

      public override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MssPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty):
          MssPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CmafPackageProperty {
    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun segmentPrefix(): String? = unwrap(this).getSegmentPrefix()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    public interface Builder {
      public fun encryption(encryption: IResolvable) {
      }

      public fun encryption(encryption: CmafEncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78196d1b0daab96676bcb7cb1ed6a754d345c918367a6bb55f3e6c4f33a733a7")
      public fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit) {
      }

      public fun hlsManifests(hlsManifests: IResolvable) {
      }

      public fun hlsManifests(hlsManifests: List<Any>) {
      }

      public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
      }

      public fun segmentPrefix(segmentPrefix: String) {
      }

      public fun streamSelection(streamSelection: IResolvable) {
      }

      public fun streamSelection(streamSelection: StreamSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87448f8eefe25bed723f1b18695f5ec731121e2d992694889b75880fa85e14c9")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty.builder()

      public override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      public override fun encryption(encryption: CmafEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(CmafEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78196d1b0daab96676bcb7cb1ed6a754d345c918367a6bb55f3e6c4f33a733a7")
      public override fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(CmafEncryptionProperty(encryption))

      public override fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
      }

      public override fun hlsManifests(hlsManifests: List<Any>) {
        cdkBuilder.hlsManifests(hlsManifests)
      }

      public override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public override fun segmentPrefix(segmentPrefix: String) {
        cdkBuilder.segmentPrefix(segmentPrefix)
      }

      public override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      public override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87448f8eefe25bed723f1b18695f5ec731121e2d992694889b75880fa85e14c9")
      public override
          fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit): Unit =
          streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty,
    ) : CmafPackageProperty {
      public override fun encryption(): Any? = unwrap(this).getEncryption()

      public override fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

      public override fun segmentDurationSeconds(): Number? =
          unwrap(this).getSegmentDurationSeconds()

      public override fun segmentPrefix(): String? = unwrap(this).getSegmentPrefix()

      public override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CmafPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty):
          CmafPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AuthorizationProperty {
    public fun cdnIdentifierSecret(): String

    public fun secretsRoleArn(): String

    public interface Builder {
      public fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
      }

      public fun secretsRoleArn(secretsRoleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.builder()

      public override fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
        cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
      }

      public override fun secretsRoleArn(secretsRoleArn: String) {
        cdkBuilder.secretsRoleArn(secretsRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty,
    ) : AuthorizationProperty {
      public override fun cdnIdentifierSecret(): String = unwrap(this).getCdnIdentifierSecret()

      public override fun secretsRoleArn(): String = unwrap(this).getSecretsRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty):
          AuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpekeKeyProviderProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public fun encryptionContractConfiguration(): Any? =
        unwrap(this).getEncryptionContractConfiguration()

    public fun resourceId(): String

    public fun roleArn(): String

    public fun systemIds(): List<String>

    public fun url(): String

    public interface Builder {
      public fun certificateArn(certificateArn: String) {
      }

      public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
      }

      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fba1a01bae904772c3b3b4f3acadd72b1868f4529f2b5d53749d90fe77850f")
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit) {
      }

      public fun resourceId(resourceId: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun systemIds(systemIds: List<String>) {
      }

      public fun url(url: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

      public override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public override
          fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fba1a01bae904772c3b3b4f3acadd72b1868f4529f2b5d53749d90fe77850f")
      public override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit):
          Unit =
          encryptionContractConfiguration(EncryptionContractConfigurationProperty(encryptionContractConfiguration))

      public override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun systemIds(systemIds: List<String>) {
        cdkBuilder.systemIds(systemIds)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty,
    ) : SpekeKeyProviderProperty {
      public override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      public override fun encryptionContractConfiguration(): Any? =
          unwrap(this).getEncryptionContractConfiguration()

      public override fun resourceId(): String = unwrap(this).getResourceId()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun systemIds(): List<String> = unwrap(this).getSystemIds() ?: emptyList()

      public override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpekeKeyProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsManifestProperty {
    public fun adMarkers(): String? = unwrap(this).getAdMarkers()

    public fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

    public fun adsOnDeliveryRestrictions(): String? = unwrap(this).getAdsOnDeliveryRestrictions()

    public fun id(): String

    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    public fun manifestName(): String? = unwrap(this).getManifestName()

    public fun playlistType(): String? = unwrap(this).getPlaylistType()

    public fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun adMarkers(adMarkers: String) {
      }

      public fun adTriggers(adTriggers: List<String>) {
      }

      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
      }

      public fun id(id: String) {
      }

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
      }

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
      }

      public fun manifestName(manifestName: String) {
      }

      public fun playlistType(playlistType: String) {
      }

      public fun playlistWindowSeconds(playlistWindowSeconds: Number) {
      }

      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
      }

      public fun url(url: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.builder()

      public override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      public override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      public override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      public override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      public override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      public override fun playlistType(playlistType: String) {
        cdkBuilder.playlistType(playlistType)
      }

      public override fun playlistWindowSeconds(playlistWindowSeconds: Number) {
        cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
      }

      public override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty,
    ) : HlsManifestProperty {
      public override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      public override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      public override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      public override fun id(): String = unwrap(this).getId()

      public override fun includeIframeOnlyStream(): Any? =
          unwrap(this).getIncludeIframeOnlyStream()

      public override fun manifestName(): String? = unwrap(this).getManifestName()

      public override fun playlistType(): String? = unwrap(this).getPlaylistType()

      public override fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

      public override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      public override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty):
          HlsManifestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsPackageProperty {
    public fun adMarkers(): String? = unwrap(this).getAdMarkers()

    public fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

    public fun adsOnDeliveryRestrictions(): String? = unwrap(this).getAdsOnDeliveryRestrictions()

    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    public fun playlistType(): String? = unwrap(this).getPlaylistType()

    public fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    public fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()

    public interface Builder {
      public fun adMarkers(adMarkers: String) {
      }

      public fun adTriggers(adTriggers: List<String>) {
      }

      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
      }

      public fun encryption(encryption: IResolvable) {
      }

      public fun encryption(encryption: HlsEncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b900de351db94148571062a983ca815c20f194a2d322cd02772af17c93c6febc")
      public fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit) {
      }

      public fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
      }

      public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
      }

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
      }

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
      }

      public fun playlistType(playlistType: String) {
      }

      public fun playlistWindowSeconds(playlistWindowSeconds: Number) {
      }

      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
      }

      public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
      }

      public fun streamSelection(streamSelection: IResolvable) {
      }

      public fun streamSelection(streamSelection: StreamSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e619665dfc697c58e1e80ef5fb726de90301736ca4ea3fd52eec226effa20d3f")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit) {
      }

      public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
      }

      public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty.builder()

      public override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      public override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      public override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      public override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      public override fun encryption(encryption: HlsEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(HlsEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b900de351db94148571062a983ca815c20f194a2d322cd02772af17c93c6febc")
      public override fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(HlsEncryptionProperty(encryption))

      public override fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
      }

      public override fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles.let(IResolvable::unwrap))
      }

      public override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      public override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      public override fun playlistType(playlistType: String) {
        cdkBuilder.playlistType(playlistType)
      }

      public override fun playlistWindowSeconds(playlistWindowSeconds: Number) {
        cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
      }

      public override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      public override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      public override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e619665dfc697c58e1e80ef5fb726de90301736ca4ea3fd52eec226effa20d3f")
      public override
          fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit): Unit =
          streamSelection(StreamSelectionProperty(streamSelection))

      public override fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
      }

      public override fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty,
    ) : HlsPackageProperty {
      public override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      public override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      public override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      public override fun encryption(): Any? = unwrap(this).getEncryption()

      public override fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

      public override fun includeIframeOnlyStream(): Any? =
          unwrap(this).getIncludeIframeOnlyStream()

      public override fun playlistType(): String? = unwrap(this).getPlaylistType()

      public override fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

      public override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      public override fun segmentDurationSeconds(): Number? =
          unwrap(this).getSegmentDurationSeconds()

      public override fun streamSelection(): Any? = unwrap(this).getStreamSelection()

      public override fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty):
          HlsPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StreamSelectionProperty {
    public fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

    public fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

    public fun streamOrder(): String? = unwrap(this).getStreamOrder()

    public interface Builder {
      public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
      }

      public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
      }

      public fun streamOrder(streamOrder: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty.builder()

      public override fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
        cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
      }

      public override fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
        cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
      }

      public override fun streamOrder(streamOrder: String) {
        cdkBuilder.streamOrder(streamOrder)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty,
    ) : StreamSelectionProperty {
      public override fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

      public override fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

      public override fun streamOrder(): String? = unwrap(this).getStreamOrder()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty):
          StreamSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSelectionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CmafEncryptionProperty {
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun constantInitializationVector(constantInitializationVector: String) {
      }

      public fun encryptionMethod(encryptionMethod: String) {
      }

      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
      }

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
      }

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d41f3d947944d41f0bac8496160097adc1e6c97148897e374c518d63e4efba")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.builder()

      public override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      public override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      public override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      public override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      public override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d41f3d947944d41f0bac8496160097adc1e6c97148897e374c518d63e4efba")
      public override
          fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit): Unit
          = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty,
    ) : CmafEncryptionProperty {
      public override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      public override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      public override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      public override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CmafEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty):
          CmafEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncryptionContractConfigurationProperty {
    public fun presetSpeke20Audio(): String

    public fun presetSpeke20Video(): String

    public interface Builder {
      public fun presetSpeke20Audio(presetSpeke20Audio: String) {
      }

      public fun presetSpeke20Video(presetSpeke20Video: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

      public override fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
      }

      public override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty,
    ) : EncryptionContractConfigurationProperty {
      public override fun presetSpeke20Audio(): String = unwrap(this).getPresetSpeke20Audio()

      public override fun presetSpeke20Video(): String = unwrap(this).getPresetSpeke20Video()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty):
          EncryptionContractConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionContractConfigurationProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HlsEncryptionProperty {
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    public fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun constantInitializationVector(constantInitializationVector: String) {
      }

      public fun encryptionMethod(encryptionMethod: String) {
      }

      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
      }

      public fun repeatExtXKey(repeatExtXKey: Boolean) {
      }

      public fun repeatExtXKey(repeatExtXKey: IResolvable) {
      }

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
      }

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cef8146b0592c3a2aabbb8a511c58ba9dc55a21669525f5b827d482e6256add")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.builder()

      public override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      public override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      public override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      public override fun repeatExtXKey(repeatExtXKey: Boolean) {
        cdkBuilder.repeatExtXKey(repeatExtXKey)
      }

      public override fun repeatExtXKey(repeatExtXKey: IResolvable) {
        cdkBuilder.repeatExtXKey(repeatExtXKey.let(IResolvable::unwrap))
      }

      public override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      public override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cef8146b0592c3a2aabbb8a511c58ba9dc55a21669525f5b827d482e6256add")
      public override
          fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit): Unit
          = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty,
    ) : HlsEncryptionProperty {
      public override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      public override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      public override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      public override fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

      public override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty):
          HlsEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DashPackageProperty {
    public fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

    public fun adsOnDeliveryRestrictions(): String? = unwrap(this).getAdsOnDeliveryRestrictions()

    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    public fun manifestLayout(): String? = unwrap(this).getManifestLayout()

    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    public fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

    public fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

    public fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

    public fun profile(): String? = unwrap(this).getProfile()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    public fun suggestedPresentationDelaySeconds(): Number? =
        unwrap(this).getSuggestedPresentationDelaySeconds()

    public fun utcTiming(): String? = unwrap(this).getUtcTiming()

    public fun utcTimingUri(): String? = unwrap(this).getUtcTimingUri()

    public interface Builder {
      public fun adTriggers(adTriggers: List<String>) {
      }

      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
      }

      public fun encryption(encryption: IResolvable) {
      }

      public fun encryption(encryption: DashEncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("948d988176ac0bb0cc86f0f8d83bc2275d1ae219a4aeb6ece1359fe2cf199d11")
      public fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit) {
      }

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
      }

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
      }

      public fun manifestLayout(manifestLayout: String) {
      }

      public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
      }

      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
      }

      public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
      }

      public fun periodTriggers(periodTriggers: List<String>) {
      }

      public fun profile(profile: String) {
      }

      public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
      }

      public fun segmentTemplateFormat(segmentTemplateFormat: String) {
      }

      public fun streamSelection(streamSelection: IResolvable) {
      }

      public fun streamSelection(streamSelection: StreamSelectionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("879539f71955f2beaacfa5fe377ab9909ae70367607cfb4ea736f8bcc1ce6e0c")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit) {
      }

      public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
      }

      public fun utcTiming(utcTiming: String) {
      }

      public fun utcTimingUri(utcTimingUri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty.builder()

      public override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      public override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      public override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      public override fun encryption(encryption: DashEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(DashEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("948d988176ac0bb0cc86f0f8d83bc2275d1ae219a4aeb6ece1359fe2cf199d11")
      public override fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(DashEncryptionProperty(encryption))

      public override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      public override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      public override fun manifestLayout(manifestLayout: String) {
        cdkBuilder.manifestLayout(manifestLayout)
      }

      public override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      public override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      public override fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
      }

      public override fun periodTriggers(periodTriggers: List<String>) {
        cdkBuilder.periodTriggers(periodTriggers)
      }

      public override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      public override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public override fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
      }

      public override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      public override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("879539f71955f2beaacfa5fe377ab9909ae70367607cfb4ea736f8bcc1ce6e0c")
      public override
          fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit): Unit =
          streamSelection(StreamSelectionProperty(streamSelection))

      public override
          fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
      }

      public override fun utcTiming(utcTiming: String) {
        cdkBuilder.utcTiming(utcTiming)
      }

      public override fun utcTimingUri(utcTimingUri: String) {
        cdkBuilder.utcTimingUri(utcTimingUri)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty,
    ) : DashPackageProperty {
      public override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      public override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      public override fun encryption(): Any? = unwrap(this).getEncryption()

      public override fun includeIframeOnlyStream(): Any? =
          unwrap(this).getIncludeIframeOnlyStream()

      public override fun manifestLayout(): String? = unwrap(this).getManifestLayout()

      public override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      public override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      public override fun minUpdatePeriodSeconds(): Number? =
          unwrap(this).getMinUpdatePeriodSeconds()

      public override fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?:
          emptyList()

      public override fun profile(): String? = unwrap(this).getProfile()

      public override fun segmentDurationSeconds(): Number? =
          unwrap(this).getSegmentDurationSeconds()

      public override fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

      public override fun streamSelection(): Any? = unwrap(this).getStreamSelection()

      public override fun suggestedPresentationDelaySeconds(): Number? =
          unwrap(this).getSuggestedPresentationDelaySeconds()

      public override fun utcTiming(): String? = unwrap(this).getUtcTiming()

      public override fun utcTimingUri(): String? = unwrap(this).getUtcTimingUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty):
          DashPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MssEncryptionProperty {
    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
      }

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9eb9558174361d4e1c7efd9c34c14fa88ec14494c90196e6cd0f0db58597a31")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.builder()

      public override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      public override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9eb9558174361d4e1c7efd9c34c14fa88ec14494c90196e6cd0f0db58597a31")
      public override
          fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit): Unit
          = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty,
    ) : MssEncryptionProperty {
      public override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MssEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty):
          MssEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DashEncryptionProperty {
    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    public fun spekeKeyProvider(): Any

    public interface Builder {
      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
      }

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
      }

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69f8de9ebec4b03286ed4459ce6d5aebf729a7ac320196f5140a4a873a44556e")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.builder()

      public override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      public override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      public override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69f8de9ebec4b03286ed4459ce6d5aebf729a7ac320196f5140a4a873a44556e")
      public override
          fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit): Unit
          = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty,
    ) : DashEncryptionProperty {
      public override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      public override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty):
          DashEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
