package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnSigningProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrProfileName(): String = unwrap(this).getAttrProfileName()

  public open fun attrProfileVersion(): String = unwrap(this).getAttrProfileVersion()

  public open fun attrProfileVersionArn(): String = unwrap(this).getAttrProfileVersionArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun platformId(): String = unwrap(this).getPlatformId()

  public open fun platformId(`value`: String) {
    unwrap(this).setPlatformId(`value`)
  }

  public open fun signatureValidityPeriod(): Any? = unwrap(this).getSignatureValidityPeriod()

  public open fun signatureValidityPeriod(`value`: IResolvable) {
    unwrap(this).setSignatureValidityPeriod(`value`.let(IResolvable::unwrap))
  }

  public open fun signatureValidityPeriod(`value`: SignatureValidityPeriodProperty) {
    unwrap(this).setSignatureValidityPeriod(`value`.let(SignatureValidityPeriodProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("30dfd32a0fc87344ddf1d8406dc8817aaf4356cac7ded8734697eb18258b5eff")
  public open
      fun signatureValidityPeriod(`value`: SignatureValidityPeriodProperty.Builder.() -> Unit): Unit
      = signatureValidityPeriod(SignatureValidityPeriodProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun platformId(platformId: String)

    public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable)

    public fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("217bf12acd10a17e8fca01118986e25b33b7d553a303676eb001019a69f8b954")
    public
        fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnSigningProfile.Builder =
        software.amazon.awscdk.services.signer.CfnSigningProfile.Builder.create(scope, id)

    override fun platformId(platformId: String) {
      cdkBuilder.platformId(platformId)
    }

    override fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(IResolvable::unwrap))
    }

    override fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty) {
      cdkBuilder.signatureValidityPeriod(signatureValidityPeriod.let(SignatureValidityPeriodProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("217bf12acd10a17e8fca01118986e25b33b7d553a303676eb001019a69f8b954")
    override
        fun signatureValidityPeriod(signatureValidityPeriod: SignatureValidityPeriodProperty.Builder.() -> Unit):
        Unit = signatureValidityPeriod(SignatureValidityPeriodProperty(signatureValidityPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.signer.CfnSigningProfile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSigningProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSigningProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfile):
        CfnSigningProfile = CfnSigningProfile(cdkObject)

    internal fun unwrap(wrapped: CfnSigningProfile):
        software.amazon.awscdk.services.signer.CfnSigningProfile = wrapped.cdkObject
  }

  public interface SignatureValidityPeriodProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty.Builder
          =
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty,
    ) : SignatureValidityPeriodProperty {
      override fun type(): String? = unwrap(this).getType()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SignatureValidityPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty):
          SignatureValidityPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignatureValidityPeriodProperty):
          software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
