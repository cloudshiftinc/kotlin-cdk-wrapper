@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOriginEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

  public open fun timeDelaySeconds(`value`: Number) {
    unwrap(this).setTimeDelaySeconds(`value`)
  }

  public open fun whitelist(): List<String> = unwrap(this).getWhitelist() ?: emptyList()

  public open fun whitelist(`value`: List<String>) {
    unwrap(this).setWhitelist(`value`)
  }

  public open fun whitelist(vararg `value`: String): Unit = whitelist(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun authorization(authorization: IResolvable)

    public fun authorization(authorization: AuthorizationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97fcf3e9063ad56e7085d7c35a18890a28370cabd5ef99a38f46be5db7b69107")
    public fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit)

    public fun channelId(channelId: String)

    public fun cmafPackage(cmafPackage: IResolvable)

    public fun cmafPackage(cmafPackage: CmafPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa5760a41763aac28b9e675a3b40c4e18606545322da91febad65639153df08")
    public fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit)

    public fun dashPackage(dashPackage: IResolvable)

    public fun dashPackage(dashPackage: DashPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7b8292e6e0e6a0d73c620650197ed90918cd10e794c28f5bef40278c14926e")
    public fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun hlsPackage(hlsPackage: IResolvable)

    public fun hlsPackage(hlsPackage: HlsPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b04ac551306ae3ac6c2d3d4f1f64dbdf984e40f7166ffd884b7c18e7705e978")
    public fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun manifestName(manifestName: String)

    public fun mssPackage(mssPackage: IResolvable)

    public fun mssPackage(mssPackage: MssPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fd056cbafc82c1730dc05dd4c3dc0d7502008627714d8b3e0a5c7700e49ba0")
    public fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit)

    public fun origination(origination: String)

    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeDelaySeconds(timeDelaySeconds: Number)

    public fun whitelist(whitelist: List<String>)

    public fun whitelist(vararg whitelist: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.Builder =
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.Builder.create(scope, id)

    override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    override fun authorization(authorization: AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(AuthorizationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97fcf3e9063ad56e7085d7c35a18890a28370cabd5ef99a38f46be5db7b69107")
    override fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit): Unit =
        authorization(AuthorizationProperty(authorization))

    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    override fun cmafPackage(cmafPackage: CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CmafPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa5760a41763aac28b9e675a3b40c4e18606545322da91febad65639153df08")
    override fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit): Unit =
        cmafPackage(CmafPackageProperty(cmafPackage))

    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    override fun dashPackage(dashPackage: DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(DashPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7b8292e6e0e6a0d73c620650197ed90918cd10e794c28f5bef40278c14926e")
    override fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit): Unit =
        dashPackage(DashPackageProperty(dashPackage))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    override fun hlsPackage(hlsPackage: HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(HlsPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b04ac551306ae3ac6c2d3d4f1f64dbdf984e40f7166ffd884b7c18e7705e978")
    override fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit): Unit =
        hlsPackage(HlsPackageProperty(hlsPackage))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun manifestName(manifestName: String) {
      cdkBuilder.manifestName(manifestName)
    }

    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    override fun mssPackage(mssPackage: MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(MssPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fd056cbafc82c1730dc05dd4c3dc0d7502008627714d8b3e0a5c7700e49ba0")
    override fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit): Unit =
        mssPackage(MssPackageProperty(mssPackage))

    override fun origination(origination: String) {
      cdkBuilder.origination(origination)
    }

    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeDelaySeconds(timeDelaySeconds: Number) {
      cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    override fun whitelist(whitelist: List<String>) {
      cdkBuilder.whitelist(whitelist)
    }

    override fun whitelist(vararg whitelist: String): Unit = whitelist(whitelist.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: MssEncryptionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6440d39ca8d9a8c40d15cf80df5bd57e971d7d2bd1803cd4107003b46af13628")
      public fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit)

      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      public fun streamSelection(streamSelection: IResolvable)

      public fun streamSelection(streamSelection: StreamSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4175e1ef5ed609f7966bcfad0b3aeb10b8b4956ec2e456c2f1057f60ebb641a9")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty.builder()

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: MssEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(MssEncryptionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6440d39ca8d9a8c40d15cf80df5bd57e971d7d2bd1803cd4107003b46af13628")
      override fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(MssEncryptionProperty(encryption))

      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4175e1ef5ed609f7966bcfad0b3aeb10b8b4956ec2e456c2f1057f60ebb641a9")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty,
    ) : CdkObject(cdkObject), MssPackageProperty {
      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MssPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty):
          MssPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty
    }
  }

  public interface CmafPackageProperty {
    public fun encryption(): Any? = unwrap(this).getEncryption()

    public fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    public fun segmentPrefix(): String? = unwrap(this).getSegmentPrefix()

    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    @CdkDslMarker
    public interface Builder {
      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: CmafEncryptionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78196d1b0daab96676bcb7cb1ed6a754d345c918367a6bb55f3e6c4f33a733a7")
      public fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit)

      public fun hlsManifests(hlsManifests: IResolvable)

      public fun hlsManifests(hlsManifests: List<Any>)

      public fun hlsManifests(vararg hlsManifests: Any)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      public fun segmentPrefix(segmentPrefix: String)

      public fun streamSelection(streamSelection: IResolvable)

      public fun streamSelection(streamSelection: StreamSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87448f8eefe25bed723f1b18695f5ec731121e2d992694889b75880fa85e14c9")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty.builder()

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: CmafEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(CmafEncryptionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78196d1b0daab96676bcb7cb1ed6a754d345c918367a6bb55f3e6c4f33a733a7")
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

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      override fun segmentPrefix(segmentPrefix: String) {
        cdkBuilder.segmentPrefix(segmentPrefix)
      }

      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87448f8eefe25bed723f1b18695f5ec731121e2d992694889b75880fa85e14c9")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty,
    ) : CdkObject(cdkObject), CmafPackageProperty {
      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      override fun segmentPrefix(): String? = unwrap(this).getSegmentPrefix()

      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CmafPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty):
          CmafPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty
    }
  }

  public interface AuthorizationProperty {
    public fun cdnIdentifierSecret(): String

    public fun secretsRoleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun cdnIdentifierSecret(cdnIdentifierSecret: String)

      public fun secretsRoleArn(secretsRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.builder()

      override fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
        cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
      }

      override fun secretsRoleArn(secretsRoleArn: String) {
        cdkBuilder.secretsRoleArn(secretsRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty,
    ) : CdkObject(cdkObject), AuthorizationProperty {
      override fun cdnIdentifierSecret(): String = unwrap(this).getCdnIdentifierSecret()

      override fun secretsRoleArn(): String = unwrap(this).getSecretsRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty):
          AuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun certificateArn(certificateArn: String)

      public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable)

      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fba1a01bae904772c3b3b4f3acadd72b1868f4529f2b5d53749d90fe77850f")
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit)

      public fun resourceId(resourceId: String)

      public fun roleArn(roleArn: String)

      public fun systemIds(systemIds: List<String>)

      public fun systemIds(vararg systemIds: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable::unwrap))
      }

      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fba1a01bae904772c3b3b4f3acadd72b1868f4529f2b5d53749d90fe77850f")
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

      override fun systemIds(systemIds: List<String>) {
        cdkBuilder.systemIds(systemIds)
      }

      override fun systemIds(vararg systemIds: String): Unit = systemIds(systemIds.toList())

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty,
    ) : CdkObject(cdkObject), SpekeKeyProviderProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      override fun encryptionContractConfiguration(): Any? =
          unwrap(this).getEncryptionContractConfiguration()

      override fun resourceId(): String = unwrap(this).getResourceId()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun systemIds(): List<String> = unwrap(this).getSystemIds()

      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpekeKeyProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adMarkers(adMarkers: String)

      public fun adTriggers(adTriggers: List<String>)

      public fun adTriggers(vararg adTriggers: String)

      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String)

      public fun id(id: String)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      public fun manifestName(manifestName: String)

      public fun playlistType(playlistType: String)

      public fun playlistWindowSeconds(playlistWindowSeconds: Number)

      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.builder()

      override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      override fun adTriggers(vararg adTriggers: String): Unit = adTriggers(adTriggers.toList())

      override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
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

      override fun playlistType(playlistType: String) {
        cdkBuilder.playlistType(playlistType)
      }

      override fun playlistWindowSeconds(playlistWindowSeconds: Number) {
        cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
      }

      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty,
    ) : CdkObject(cdkObject), HlsManifestProperty {
      override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      override fun id(): String = unwrap(this).getId()

      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      override fun manifestName(): String? = unwrap(this).getManifestName()

      override fun playlistType(): String? = unwrap(this).getPlaylistType()

      override fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty):
          HlsManifestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adMarkers(adMarkers: String)

      public fun adTriggers(adTriggers: List<String>)

      public fun adTriggers(vararg adTriggers: String)

      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String)

      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: HlsEncryptionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b900de351db94148571062a983ca815c20f194a2d322cd02772af17c93c6febc")
      public fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit)

      public fun includeDvbSubtitles(includeDvbSubtitles: Boolean)

      public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      public fun playlistType(playlistType: String)

      public fun playlistWindowSeconds(playlistWindowSeconds: Number)

      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      public fun streamSelection(streamSelection: IResolvable)

      public fun streamSelection(streamSelection: StreamSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e619665dfc697c58e1e80ef5fb726de90301736ca4ea3fd52eec226effa20d3f")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)

      public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean)

      public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty.builder()

      override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      override fun adTriggers(vararg adTriggers: String): Unit = adTriggers(adTriggers.toList())

      override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: HlsEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(HlsEncryptionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b900de351db94148571062a983ca815c20f194a2d322cd02772af17c93c6febc")
      override fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(HlsEncryptionProperty(encryption))

      override fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
      }

      override fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles.let(IResolvable::unwrap))
      }

      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      override fun playlistType(playlistType: String) {
        cdkBuilder.playlistType(playlistType)
      }

      override fun playlistWindowSeconds(playlistWindowSeconds: Number) {
        cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
      }

      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e619665dfc697c58e1e80ef5fb726de90301736ca4ea3fd52eec226effa20d3f")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      override fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
      }

      override fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty,
    ) : CdkObject(cdkObject), HlsPackageProperty {
      override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      override fun playlistType(): String? = unwrap(this).getPlaylistType()

      override fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()

      override fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty):
          HlsPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty
    }
  }

  public interface StreamSelectionProperty {
    public fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

    public fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

    public fun streamOrder(): String? = unwrap(this).getStreamOrder()

    @CdkDslMarker
    public interface Builder {
      public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number)

      public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number)

      public fun streamOrder(streamOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty.builder()

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
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty,
    ) : CdkObject(cdkObject), StreamSelectionProperty {
      override fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

      override fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

      override fun streamOrder(): String? = unwrap(this).getStreamOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty):
          StreamSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSelectionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty
    }
  }

  public interface CmafEncryptionProperty {
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    public fun spekeKeyProvider(): Any

    @CdkDslMarker
    public interface Builder {
      public fun constantInitializationVector(constantInitializationVector: String)

      public fun encryptionMethod(encryptionMethod: String)

      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d41f3d947944d41f0bac8496160097adc1e6c97148897e374c518d63e4efba")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.builder()

      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d41f3d947944d41f0bac8496160097adc1e6c97148897e374c518d63e4efba")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty,
    ) : CdkObject(cdkObject), CmafEncryptionProperty {
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CmafEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty):
          CmafEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty
    }
  }

  public interface EncryptionContractConfigurationProperty {
    public fun presetSpeke20Audio(): String

    public fun presetSpeke20Video(): String

    @CdkDslMarker
    public interface Builder {
      public fun presetSpeke20Audio(presetSpeke20Audio: String)

      public fun presetSpeke20Video(presetSpeke20Video: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

      override fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
      }

      override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionContractConfigurationProperty {
      override fun presetSpeke20Audio(): String = unwrap(this).getPresetSpeke20Audio()

      override fun presetSpeke20Video(): String = unwrap(this).getPresetSpeke20Video()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty
    }
  }

  public interface HlsEncryptionProperty {
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    public fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

    public fun spekeKeyProvider(): Any

    @CdkDslMarker
    public interface Builder {
      public fun constantInitializationVector(constantInitializationVector: String)

      public fun encryptionMethod(encryptionMethod: String)

      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      public fun repeatExtXKey(repeatExtXKey: Boolean)

      public fun repeatExtXKey(repeatExtXKey: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cef8146b0592c3a2aabbb8a511c58ba9dc55a21669525f5b827d482e6256add")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.builder()

      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      override fun repeatExtXKey(repeatExtXKey: Boolean) {
        cdkBuilder.repeatExtXKey(repeatExtXKey)
      }

      override fun repeatExtXKey(repeatExtXKey: IResolvable) {
        cdkBuilder.repeatExtXKey(repeatExtXKey.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cef8146b0592c3a2aabbb8a511c58ba9dc55a21669525f5b827d482e6256add")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty,
    ) : CdkObject(cdkObject), HlsEncryptionProperty {
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      override fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty):
          HlsEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun adTriggers(adTriggers: List<String>)

      public fun adTriggers(vararg adTriggers: String)

      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String)

      public fun encryption(encryption: IResolvable)

      public fun encryption(encryption: DashEncryptionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("948d988176ac0bb0cc86f0f8d83bc2275d1ae219a4aeb6ece1359fe2cf199d11")
      public fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      public fun manifestLayout(manifestLayout: String)

      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number)

      public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number)

      public fun periodTriggers(periodTriggers: List<String>)

      public fun periodTriggers(vararg periodTriggers: String)

      public fun profile(profile: String)

      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      public fun segmentTemplateFormat(segmentTemplateFormat: String)

      public fun streamSelection(streamSelection: IResolvable)

      public fun streamSelection(streamSelection: StreamSelectionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("879539f71955f2beaacfa5fe377ab9909ae70367607cfb4ea736f8bcc1ce6e0c")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)

      public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number)

      public fun utcTiming(utcTiming: String)

      public fun utcTimingUri(utcTimingUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty.builder()

      override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      override fun adTriggers(vararg adTriggers: String): Unit = adTriggers(adTriggers.toList())

      override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      override fun encryption(encryption: DashEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(DashEncryptionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("948d988176ac0bb0cc86f0f8d83bc2275d1ae219a4aeb6ece1359fe2cf199d11")
      override fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(DashEncryptionProperty(encryption))

      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      override fun manifestLayout(manifestLayout: String) {
        cdkBuilder.manifestLayout(manifestLayout)
      }

      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      override fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
      }

      override fun periodTriggers(periodTriggers: List<String>) {
        cdkBuilder.periodTriggers(periodTriggers)
      }

      override fun periodTriggers(vararg periodTriggers: String): Unit =
          periodTriggers(periodTriggers.toList())

      override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      override fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
      }

      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("879539f71955f2beaacfa5fe377ab9909ae70367607cfb4ea736f8bcc1ce6e0c")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      override fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
      }

      override fun utcTiming(utcTiming: String) {
        cdkBuilder.utcTiming(utcTiming)
      }

      override fun utcTimingUri(utcTimingUri: String) {
        cdkBuilder.utcTimingUri(utcTimingUri)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty,
    ) : CdkObject(cdkObject), DashPackageProperty {
      override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      override fun encryption(): Any? = unwrap(this).getEncryption()

      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      override fun manifestLayout(): String? = unwrap(this).getManifestLayout()

      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      override fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

      override fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

      override fun profile(): String? = unwrap(this).getProfile()

      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      override fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()

      override fun suggestedPresentationDelaySeconds(): Number? =
          unwrap(this).getSuggestedPresentationDelaySeconds()

      override fun utcTiming(): String? = unwrap(this).getUtcTiming()

      override fun utcTimingUri(): String? = unwrap(this).getUtcTimingUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty):
          DashPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty
    }
  }

  public interface MssEncryptionProperty {
    public fun spekeKeyProvider(): Any

    @CdkDslMarker
    public interface Builder {
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9eb9558174361d4e1c7efd9c34c14fa88ec14494c90196e6cd0f0db58597a31")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.builder()

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9eb9558174361d4e1c7efd9c34c14fa88ec14494c90196e6cd0f0db58597a31")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty,
    ) : CdkObject(cdkObject), MssEncryptionProperty {
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MssEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty):
          MssEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty
    }
  }

  public interface DashEncryptionProperty {
    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    public fun spekeKeyProvider(): Any

    @CdkDslMarker
    public interface Builder {
      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69f8de9ebec4b03286ed4459ce6d5aebf729a7ac320196f5140a4a873a44556e")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.builder()

      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69f8de9ebec4b03286ed4459ce6d5aebf729a7ac320196f5140a4a873a44556e")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty,
    ) : CdkObject(cdkObject), DashEncryptionProperty {
      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty):
          DashEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty
    }
  }
}
