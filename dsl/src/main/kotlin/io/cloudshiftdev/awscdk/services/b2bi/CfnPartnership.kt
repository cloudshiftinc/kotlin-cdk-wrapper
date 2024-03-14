package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPartnership internal constructor(
  private val cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public open fun attrPartnershipArn(): String = unwrap(this).getAttrPartnershipArn()

  public open fun attrPartnershipId(): String = unwrap(this).getAttrPartnershipId()

  public open fun attrTradingPartnerId(): String = unwrap(this).getAttrTradingPartnerId()

  public open fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  public open fun capabilities(`value`: List<String>) {
    unwrap(this).setCapabilities(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun email(): String = unwrap(this).getEmail()

  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun phone(): String? = unwrap(this).getPhone()

  public open fun phone(`value`: String) {
    unwrap(this).setPhone(`value`)
  }

  public open fun profileId(): String = unwrap(this).getProfileId()

  public open fun profileId(`value`: String) {
    unwrap(this).setProfileId(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun capabilities(capabilities: List<String>)

    public fun email(email: String)

    public fun name(name: String)

    public fun phone(phone: String)

    public fun profileId(profileId: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnPartnership.Builder =
        software.amazon.awscdk.services.b2bi.CfnPartnership.Builder.create(scope, id)

    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun phone(phone: String) {
      cdkBuilder.phone(phone)
    }

    override fun profileId(profileId: String) {
      cdkBuilder.profileId(profileId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.b2bi.CfnPartnership = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPartnership {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPartnership(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership):
        CfnPartnership = CfnPartnership(cdkObject)

    internal fun unwrap(wrapped: CfnPartnership):
        software.amazon.awscdk.services.b2bi.CfnPartnership = wrapped.cdkObject
  }
}
