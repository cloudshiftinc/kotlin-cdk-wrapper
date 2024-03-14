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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPartnerAccount internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accountLinked(): Any? = unwrap(this).getAccountLinked()

  public open fun accountLinked(`value`: Boolean) {
    unwrap(this).setAccountLinked(`value`)
  }

  public open fun accountLinked(`value`: IResolvable) {
    unwrap(this).setAccountLinked(`value`.let(IResolvable::unwrap))
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrFingerprint(): String = unwrap(this).getAttrFingerprint()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun partnerAccountId(): String? = unwrap(this).getPartnerAccountId()

  public open fun partnerAccountId(`value`: String) {
    unwrap(this).setPartnerAccountId(`value`)
  }

  public open fun partnerType(): String? = unwrap(this).getPartnerType()

  public open fun partnerType(`value`: String) {
    unwrap(this).setPartnerType(`value`)
  }

  public open fun sidewalk(): Any? = unwrap(this).getSidewalk()

  public open fun sidewalk(`value`: IResolvable) {
    unwrap(this).setSidewalk(`value`.let(IResolvable::unwrap))
  }

  public open fun sidewalk(`value`: SidewalkAccountInfoProperty) {
    unwrap(this).setSidewalk(`value`.let(SidewalkAccountInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e04e111d957d00271f64784bdd96f6bb00e2d9e369d949d95b11baf97c1be366")
  public open fun sidewalk(`value`: SidewalkAccountInfoProperty.Builder.() -> Unit): Unit =
      sidewalk(SidewalkAccountInfoProperty(`value`))

  public open fun sidewalkResponse(): Any? = unwrap(this).getSidewalkResponse()

  public open fun sidewalkResponse(`value`: IResolvable) {
    unwrap(this).setSidewalkResponse(`value`.let(IResolvable::unwrap))
  }

  public open fun sidewalkResponse(`value`: SidewalkAccountInfoWithFingerprintProperty) {
    unwrap(this).setSidewalkResponse(`value`.let(SidewalkAccountInfoWithFingerprintProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c1dc63264c77a2b76489797f4140defde3116748b7319db541327583e263e4c")
  public open
      fun sidewalkResponse(`value`: SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit):
      Unit = sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty(`value`))

  public open fun sidewalkUpdate(): Any? = unwrap(this).getSidewalkUpdate()

  public open fun sidewalkUpdate(`value`: IResolvable) {
    unwrap(this).setSidewalkUpdate(`value`.let(IResolvable::unwrap))
  }

  public open fun sidewalkUpdate(`value`: SidewalkUpdateAccountProperty) {
    unwrap(this).setSidewalkUpdate(`value`.let(SidewalkUpdateAccountProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7de7245a353fe6f0094c556f19bc140be3119eb6c5f90c00935464568b691329")
  public open fun sidewalkUpdate(`value`: SidewalkUpdateAccountProperty.Builder.() -> Unit): Unit =
      sidewalkUpdate(SidewalkUpdateAccountProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accountLinked(accountLinked: Boolean)

    public fun accountLinked(accountLinked: IResolvable)

    public fun partnerAccountId(partnerAccountId: String)

    public fun partnerType(partnerType: String)

    public fun sidewalk(sidewalk: IResolvable)

    public fun sidewalk(sidewalk: SidewalkAccountInfoProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c23f4ce3b6b1acdf5366e8266b214b62e3340aa21c8789029acd609d73249c5")
    public fun sidewalk(sidewalk: SidewalkAccountInfoProperty.Builder.() -> Unit)

    public fun sidewalkResponse(sidewalkResponse: IResolvable)

    public fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf9853e743f05d34e8bf54bfc19754dcd8c261695e6dc792a26f569208b2a40b")
    public
        fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit)

    public fun sidewalkUpdate(sidewalkUpdate: IResolvable)

    public fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50b2293303e851fca1e139168d0d98b54e0595482e874cc4b549b2872c17248f")
    public fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.Builder =
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.Builder.create(scope, id)

    override fun accountLinked(accountLinked: Boolean) {
      cdkBuilder.accountLinked(accountLinked)
    }

    override fun accountLinked(accountLinked: IResolvable) {
      cdkBuilder.accountLinked(accountLinked.let(IResolvable::unwrap))
    }

    override fun partnerAccountId(partnerAccountId: String) {
      cdkBuilder.partnerAccountId(partnerAccountId)
    }

    override fun partnerType(partnerType: String) {
      cdkBuilder.partnerType(partnerType)
    }

    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable::unwrap))
    }

    override fun sidewalk(sidewalk: SidewalkAccountInfoProperty) {
      cdkBuilder.sidewalk(sidewalk.let(SidewalkAccountInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c23f4ce3b6b1acdf5366e8266b214b62e3340aa21c8789029acd609d73249c5")
    override fun sidewalk(sidewalk: SidewalkAccountInfoProperty.Builder.() -> Unit): Unit =
        sidewalk(SidewalkAccountInfoProperty(sidewalk))

    override fun sidewalkResponse(sidewalkResponse: IResolvable) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(IResolvable::unwrap))
    }

    override fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty) {
      cdkBuilder.sidewalkResponse(sidewalkResponse.let(SidewalkAccountInfoWithFingerprintProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf9853e743f05d34e8bf54bfc19754dcd8c261695e6dc792a26f569208b2a40b")
    override
        fun sidewalkResponse(sidewalkResponse: SidewalkAccountInfoWithFingerprintProperty.Builder.() -> Unit):
        Unit = sidewalkResponse(SidewalkAccountInfoWithFingerprintProperty(sidewalkResponse))

    override fun sidewalkUpdate(sidewalkUpdate: IResolvable) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(IResolvable::unwrap))
    }

    override fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty) {
      cdkBuilder.sidewalkUpdate(sidewalkUpdate.let(SidewalkUpdateAccountProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50b2293303e851fca1e139168d0d98b54e0595482e874cc4b549b2872c17248f")
    override fun sidewalkUpdate(sidewalkUpdate: SidewalkUpdateAccountProperty.Builder.() -> Unit):
        Unit = sidewalkUpdate(SidewalkUpdateAccountProperty(sidewalkUpdate))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnPartnerAccount =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPartnerAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPartnerAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount):
        CfnPartnerAccount = CfnPartnerAccount(cdkObject)

    internal fun unwrap(wrapped: CfnPartnerAccount):
        software.amazon.awscdk.services.iotwireless.CfnPartnerAccount = wrapped.cdkObject
  }

  public interface SidewalkUpdateAccountProperty {
    public fun appServerPrivateKey(): String? = unwrap(this).getAppServerPrivateKey()

    public interface Builder {
      public fun appServerPrivateKey(appServerPrivateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty.builder()

      override fun appServerPrivateKey(appServerPrivateKey: String) {
        cdkBuilder.appServerPrivateKey(appServerPrivateKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty,
    ) : SidewalkUpdateAccountProperty {
      override fun appServerPrivateKey(): String? = unwrap(this).getAppServerPrivateKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SidewalkUpdateAccountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty):
          SidewalkUpdateAccountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkUpdateAccountProperty):
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkUpdateAccountProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SidewalkAccountInfoWithFingerprintProperty {
    public fun amazonId(): String? = unwrap(this).getAmazonId()

    public fun arn(): String? = unwrap(this).getArn()

    public fun fingerprint(): String? = unwrap(this).getFingerprint()

    public interface Builder {
      public fun amazonId(amazonId: String)

      public fun arn(arn: String)

      public fun fingerprint(fingerprint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.builder()

      override fun amazonId(amazonId: String) {
        cdkBuilder.amazonId(amazonId)
      }

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun fingerprint(fingerprint: String) {
        cdkBuilder.fingerprint(fingerprint)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty,
    ) : SidewalkAccountInfoWithFingerprintProperty {
      override fun amazonId(): String? = unwrap(this).getAmazonId()

      override fun arn(): String? = unwrap(this).getArn()

      override fun fingerprint(): String? = unwrap(this).getFingerprint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SidewalkAccountInfoWithFingerprintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty):
          SidewalkAccountInfoWithFingerprintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkAccountInfoWithFingerprintProperty):
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SidewalkAccountInfoProperty {
    public fun appServerPrivateKey(): String

    public interface Builder {
      public fun appServerPrivateKey(appServerPrivateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty.builder()

      override fun appServerPrivateKey(appServerPrivateKey: String) {
        cdkBuilder.appServerPrivateKey(appServerPrivateKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty,
    ) : SidewalkAccountInfoProperty {
      override fun appServerPrivateKey(): String = unwrap(this).getAppServerPrivateKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SidewalkAccountInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty):
          SidewalkAccountInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkAccountInfoProperty):
          software.amazon.awscdk.services.iotwireless.CfnPartnerAccount.SidewalkAccountInfoProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
